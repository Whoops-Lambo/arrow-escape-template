package com.google.android.exoplayer2.extractor.avi;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.extractor.DummyExtractorOutput;
import com.google.android.exoplayer2.extractor.Extractor;
import com.google.android.exoplayer2.extractor.ExtractorInput;
import com.google.android.exoplayer2.extractor.ExtractorOutput;
import com.google.android.exoplayer2.extractor.PositionHolder;
import com.google.android.exoplayer2.extractor.SeekMap;
import com.google.android.exoplayer2.extractor.TrackOutput;
import com.google.android.exoplayer2.upstream.DataReader;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.MimeTypes;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.android.exoplayer2.util.Util;
import defpackage.hg;
import defpackage.ig;
import defpackage.jg;
import defpackage.jj2;
import defpackage.kg;
import defpackage.kj2;
import defpackage.lg;
import defpackage.re1;
import defpackage.sr;
import defpackage.z21;
import io.p071bidmachine.media3.extractor.ts.y;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class AviExtractor implements Extractor {
    private static final int AVIIF_KEYFRAME = 16;
    public static final int FOURCC_AVI_ = 541677121;
    public static final int FOURCC_JUNK = 1263424842;
    public static final int FOURCC_LIST = 1414744396;
    public static final int FOURCC_RIFF = 1179011410;
    public static final int FOURCC_auds = 1935963489;
    public static final int FOURCC_avih = 1751742049;
    public static final int FOURCC_hdrl = 1819436136;
    public static final int FOURCC_idx1 = 829973609;
    public static final int FOURCC_movi = 1769369453;
    public static final int FOURCC_strf = 1718776947;
    public static final int FOURCC_strh = 1752331379;
    public static final int FOURCC_strl = 1819440243;
    public static final int FOURCC_strn = 1852994675;
    public static final int FOURCC_txts = 1937012852;
    public static final int FOURCC_vids = 1935960438;
    private static final long RELOAD_MINIMUM_SEEK_DISTANCE = 262144;
    private static final int STATE_FINDING_IDX1_HEADER = 4;
    private static final int STATE_FINDING_MOVI_HEADER = 3;
    private static final int STATE_READING_HDRL_BODY = 2;
    private static final int STATE_READING_HDRL_HEADER = 1;
    private static final int STATE_READING_IDX1_BODY = 5;
    private static final int STATE_READING_SAMPLES = 6;
    private static final int STATE_SKIPPING_TO_HDRL = 0;
    private static final String TAG = "AviExtractor";
    private kg aviHeader;

    @Nullable
    private sr currentChunkReader;
    private int idx1BodySize;
    private long pendingReposition;
    private boolean seekMapHasBeenOutput;
    private int state;
    private final ParsableByteArray scratch = new ParsableByteArray(12);
    private final jg chunkHeaderHolder = new jg();
    private ExtractorOutput extractorOutput = new DummyExtractorOutput();
    private sr[] chunkReaders = new sr[0];
    private long moviStart = -1;
    private long moviEnd = -1;
    private int hdrlSize = -1;
    private long durationUs = -9223372036854775807L;

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public void init(ExtractorOutput extractorOutput) {
        this.state = 0;
        this.extractorOutput = extractorOutput;
        this.pendingReposition = -1L;
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public void release() {
    }

    @Nullable
    private sr getChunkReader(int i) {
        for (sr srVar : this.chunkReaders) {
            if (srVar.b == i || srVar.c == i) {
                return srVar;
            }
        }
        return null;
    }

    @Nullable
    private sr processStreamList(re1 re1Var, int i) {
        lg lgVar = (lg) re1Var.a(lg.class);
        jj2 jj2Var = (jj2) re1Var.a(jj2.class);
        if (lgVar == null) {
            Log.w(TAG, "Missing Stream Header");
            return null;
        }
        if (jj2Var == null) {
            Log.w(TAG, "Missing Stream Format");
            return null;
        }
        long jScaleLargeTimestamp = Util.scaleLargeTimestamp(lgVar.d, ((long) lgVar.b) * 1000000, lgVar.c);
        Format format = jj2Var.a;
        Format.Builder builderBuildUpon = format.buildUpon();
        builderBuildUpon.setId(i);
        int i2 = lgVar.e;
        if (i2 != 0) {
            builderBuildUpon.setMaxInputSize(i2);
        }
        kj2 kj2Var = (kj2) re1Var.a(kj2.class);
        if (kj2Var != null) {
            builderBuildUpon.setLabel(kj2Var.a);
        }
        int trackType = MimeTypes.getTrackType(format.sampleMimeType);
        if (trackType != 1 && trackType != 2) {
            return null;
        }
        TrackOutput trackOutputTrack = this.extractorOutput.track(i, trackType);
        trackOutputTrack.format(builderBuildUpon.build());
        sr srVar = new sr(i, trackType, jScaleLargeTimestamp, lgVar.d, trackOutputTrack);
        this.durationUs = jScaleLargeTimestamp;
        return srVar;
    }

    private boolean resolvePendingReposition(ExtractorInput extractorInput, PositionHolder positionHolder) throws IOException {
        boolean z;
        if (this.pendingReposition != -1) {
            long position = extractorInput.getPosition();
            long j = this.pendingReposition;
            if (j < position || j > RELOAD_MINIMUM_SEEK_DISTANCE + position) {
                positionHolder.position = j;
                z = true;
            } else {
                extractorInput.skipFully((int) (j - position));
                z = false;
            }
        } else {
            z = false;
        }
        this.pendingReposition = -1L;
        return z;
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public void seek(long j, long j2) {
        this.pendingReposition = -1L;
        this.currentChunkReader = null;
        for (sr srVar : this.chunkReaders) {
            if (srVar.j == 0) {
                srVar.h = 0;
            } else {
                srVar.h = srVar.l[Util.binarySearchFloor(srVar.k, j, true, true)];
            }
        }
        if (j != 0) {
            this.state = 6;
        } else if (this.chunkReaders.length == 0) {
            this.state = 0;
        } else {
            this.state = 3;
        }
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public boolean sniff(ExtractorInput extractorInput) throws IOException {
        extractorInput.peekFully(this.scratch.getData(), 0, 12);
        this.scratch.setPosition(0);
        if (this.scratch.readLittleEndianInt() != 1179011410) {
            return false;
        }
        this.scratch.skipBytes(4);
        return this.scratch.readLittleEndianInt() == 541677121;
    }

    private static void alignInputToEvenPosition(ExtractorInput extractorInput) throws IOException {
        if ((extractorInput.getPosition() & 1) == 1) {
            extractorInput.skipFully(1);
        }
    }

    private void parseHdrlBody(ParsableByteArray parsableByteArray) throws IOException {
        re1 re1VarB = re1.b(1819436136, parsableByteArray);
        int i = re1VarB.b;
        if (i == 1819436136) {
            kg kgVar = (kg) re1VarB.a(kg.class);
            if (kgVar != null) {
                this.aviHeader = kgVar;
                this.durationUs = ((long) kgVar.c) * ((long) kgVar.a);
                ArrayList arrayList = new ArrayList();
                z21 z21VarListIterator = re1VarB.a.listIterator(0);
                int i2 = 0;
                while (z21VarListIterator.hasNext()) {
                    hg hgVar = (hg) z21VarListIterator.next();
                    if (hgVar.getType() == 1819440243) {
                        int i3 = i2 + 1;
                        sr srVarProcessStreamList = processStreamList((re1) hgVar, i2);
                        if (srVarProcessStreamList != null) {
                            arrayList.add(srVarProcessStreamList);
                        }
                        i2 = i3;
                    }
                }
                this.chunkReaders = (sr[]) arrayList.toArray(new sr[0]);
                this.extractorOutput.endTracks();
                return;
            }
            throw ParserException.createForMalformedContainer("AviHeader not found", null);
        }
        throw ParserException.createForMalformedContainer("Unexpected header list type " + i, null);
    }

    private void parseIdx1Body(ParsableByteArray parsableByteArray) {
        long jPeekSeekOffset = peekSeekOffset(parsableByteArray);
        while (parsableByteArray.bytesLeft() >= 16) {
            int littleEndianInt = parsableByteArray.readLittleEndianInt();
            int littleEndianInt2 = parsableByteArray.readLittleEndianInt();
            long littleEndianInt3 = ((long) parsableByteArray.readLittleEndianInt()) + jPeekSeekOffset;
            parsableByteArray.readLittleEndianInt();
            sr chunkReader = getChunkReader(littleEndianInt);
            if (chunkReader != null) {
                if ((littleEndianInt2 & 16) == 16) {
                    if (chunkReader.j == chunkReader.l.length) {
                        long[] jArr = chunkReader.k;
                        chunkReader.k = Arrays.copyOf(jArr, (jArr.length * 3) / 2);
                        int[] iArr = chunkReader.l;
                        chunkReader.l = Arrays.copyOf(iArr, (iArr.length * 3) / 2);
                    }
                    long[] jArr2 = chunkReader.k;
                    int i = chunkReader.j;
                    jArr2[i] = littleEndianInt3;
                    chunkReader.l[i] = chunkReader.i;
                    chunkReader.j = i + 1;
                }
                chunkReader.i++;
            }
        }
        for (sr srVar : this.chunkReaders) {
            srVar.k = Arrays.copyOf(srVar.k, srVar.j);
            srVar.l = Arrays.copyOf(srVar.l, srVar.j);
        }
        this.seekMapHasBeenOutput = true;
        this.extractorOutput.seekMap(new ig(this, this.durationUs));
    }

    private long peekSeekOffset(ParsableByteArray parsableByteArray) {
        long j = 0;
        if (parsableByteArray.bytesLeft() < 16) {
            return 0L;
        }
        int position = parsableByteArray.getPosition();
        parsableByteArray.skipBytes(8);
        long littleEndianInt = parsableByteArray.readLittleEndianInt();
        long j2 = this.moviStart;
        if (littleEndianInt <= j2) {
            j = j2 + 8;
        }
        parsableByteArray.setPosition(position);
        return j;
    }

    private int readMoviChunks(ExtractorInput extractorInput) throws IOException {
        boolean z;
        int i;
        if (extractorInput.getPosition() >= this.moviEnd) {
            return -1;
        }
        sr srVar = this.currentChunkReader;
        if (srVar != null) {
            int i2 = srVar.g;
            int iSampleData = i2 - srVar.a.sampleData((DataReader) extractorInput, i2, false);
            srVar.g = iSampleData;
            if (iSampleData == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                if (srVar.f > 0) {
                    TrackOutput trackOutput = srVar.a;
                    int i3 = srVar.h;
                    long j = (srVar.d * ((long) i3)) / ((long) srVar.e);
                    if (Arrays.binarySearch(srVar.l, i3) >= 0) {
                        i = 1;
                    } else {
                        i = 0;
                    }
                    trackOutput.sampleMetadata(j, i, srVar.f, 0, null);
                }
                srVar.h++;
            }
            if (z) {
                this.currentChunkReader = null;
            }
            return 0;
        }
        alignInputToEvenPosition(extractorInput);
        int i4 = 12;
        extractorInput.peekFully(this.scratch.getData(), 0, 12);
        this.scratch.setPosition(0);
        int littleEndianInt = this.scratch.readLittleEndianInt();
        ParsableByteArray parsableByteArray = this.scratch;
        if (littleEndianInt == 1414744396) {
            parsableByteArray.setPosition(8);
            if (this.scratch.readLittleEndianInt() != 1769369453) {
                i4 = 8;
            }
            extractorInput.skipFully(i4);
            extractorInput.resetPeekPosition();
            return 0;
        }
        int littleEndianInt2 = parsableByteArray.readLittleEndianInt();
        if (littleEndianInt == 1263424842) {
            this.pendingReposition = extractorInput.getPosition() + ((long) littleEndianInt2) + 8;
            return 0;
        }
        extractorInput.skipFully(8);
        extractorInput.resetPeekPosition();
        sr chunkReader = getChunkReader(littleEndianInt);
        if (chunkReader == null) {
            this.pendingReposition = extractorInput.getPosition() + ((long) littleEndianInt2);
            return 0;
        }
        chunkReader.f = littleEndianInt2;
        chunkReader.g = littleEndianInt2;
        this.currentChunkReader = chunkReader;
        return 0;
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public int read(ExtractorInput extractorInput, PositionHolder positionHolder) throws IOException {
        if (resolvePendingReposition(extractorInput, positionHolder)) {
            return 1;
        }
        switch (this.state) {
            case 0:
                if (sniff(extractorInput)) {
                    extractorInput.skipFully(12);
                    this.state = 1;
                    return 0;
                }
                throw ParserException.createForMalformedContainer("AVI Header List not found", null);
            case 1:
                extractorInput.readFully(this.scratch.getData(), 0, 12);
                this.scratch.setPosition(0);
                jg jgVar = this.chunkHeaderHolder;
                ParsableByteArray parsableByteArray = this.scratch;
                jgVar.getClass();
                jgVar.a = parsableByteArray.readLittleEndianInt();
                jgVar.b = parsableByteArray.readLittleEndianInt();
                jgVar.c = 0;
                if (jgVar.a == 1414744396) {
                    jgVar.c = parsableByteArray.readLittleEndianInt();
                    jg jgVar2 = this.chunkHeaderHolder;
                    if (jgVar2.c == 1819436136) {
                        this.hdrlSize = jgVar2.b;
                        this.state = 2;
                        return 0;
                    }
                    throw ParserException.createForMalformedContainer("hdrl expected, found: " + this.chunkHeaderHolder.c, null);
                }
                throw ParserException.createForMalformedContainer("LIST expected, found: " + jgVar.a, null);
            case 2:
                int i = this.hdrlSize - 4;
                ParsableByteArray parsableByteArray2 = new ParsableByteArray(i);
                extractorInput.readFully(parsableByteArray2.getData(), 0, i);
                parseHdrlBody(parsableByteArray2);
                this.state = 3;
                return 0;
            case 3:
                if (this.moviStart != -1) {
                    long position = extractorInput.getPosition();
                    long j = this.moviStart;
                    if (position != j) {
                        this.pendingReposition = j;
                        return 0;
                    }
                }
                extractorInput.peekFully(this.scratch.getData(), 0, 12);
                extractorInput.resetPeekPosition();
                this.scratch.setPosition(0);
                jg jgVar3 = this.chunkHeaderHolder;
                ParsableByteArray parsableByteArray3 = this.scratch;
                jgVar3.getClass();
                jgVar3.a = parsableByteArray3.readLittleEndianInt();
                jgVar3.b = parsableByteArray3.readLittleEndianInt();
                jgVar3.c = 0;
                int littleEndianInt = this.scratch.readLittleEndianInt();
                int i2 = this.chunkHeaderHolder.a;
                if (i2 == 1179011410) {
                    extractorInput.skipFully(12);
                    return 0;
                }
                if (i2 == 1414744396 && littleEndianInt == 1769369453) {
                    long position2 = extractorInput.getPosition();
                    this.moviStart = position2;
                    this.moviEnd = position2 + ((long) this.chunkHeaderHolder.b) + 8;
                    if (!this.seekMapHasBeenOutput) {
                        if ((((kg) Assertions.checkNotNull(this.aviHeader)).b & 16) == 16) {
                            this.state = 4;
                            this.pendingReposition = this.moviEnd;
                            return 0;
                        }
                        this.extractorOutput.seekMap(new SeekMap.Unseekable(this.durationUs));
                        this.seekMapHasBeenOutput = true;
                    }
                    this.pendingReposition = extractorInput.getPosition() + 12;
                    this.state = 6;
                    return 0;
                }
                this.pendingReposition = extractorInput.getPosition() + ((long) this.chunkHeaderHolder.b) + 8;
                return 0;
            case 4:
                extractorInput.readFully(this.scratch.getData(), 0, 8);
                this.scratch.setPosition(0);
                int littleEndianInt2 = this.scratch.readLittleEndianInt();
                int littleEndianInt3 = this.scratch.readLittleEndianInt();
                if (littleEndianInt2 == 829973609) {
                    this.state = 5;
                    this.idx1BodySize = littleEndianInt3;
                    return 0;
                }
                this.pendingReposition = extractorInput.getPosition() + ((long) littleEndianInt3);
                return 0;
            case 5:
                ParsableByteArray parsableByteArray4 = new ParsableByteArray(this.idx1BodySize);
                extractorInput.readFully(parsableByteArray4.getData(), 0, this.idx1BodySize);
                parseIdx1Body(parsableByteArray4);
                this.state = 6;
                this.pendingReposition = this.moviStart;
                return 0;
            case 6:
                return readMoviChunks(extractorInput);
            default:
                y.o();
                return 0;
        }
    }
}
