package com.google.android.exoplayer2.extractor.ts;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.extractor.BinarySearchSeeker;
import com.google.android.exoplayer2.extractor.Extractor;
import com.google.android.exoplayer2.extractor.ExtractorInput;
import com.google.android.exoplayer2.extractor.ExtractorOutput;
import com.google.android.exoplayer2.extractor.ExtractorsFactory;
import com.google.android.exoplayer2.extractor.PositionHolder;
import com.google.android.exoplayer2.extractor.SeekMap;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.android.exoplayer2.util.TimestampAdjuster;
import defpackage.r2;
import defpackage.tr2;
import defpackage.ur2;
import defpackage.vr2;
import java.io.IOException;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class TsExtractor implements Extractor {
    private static final long AC3_FORMAT_IDENTIFIER = 1094921523;
    private static final long AC4_FORMAT_IDENTIFIER = 1094921524;
    private static final int BUFFER_SIZE = 9400;
    public static final int DEFAULT_TIMESTAMP_SEARCH_BYTES = 112800;
    private static final long E_AC3_FORMAT_IDENTIFIER = 1161904947;
    public static final ExtractorsFactory FACTORY = new r2(13);
    private static final long HEVC_FORMAT_IDENTIFIER = 1212503619;
    private static final int MAX_PID_PLUS_ONE = 8192;
    public static final int MODE_HLS = 2;
    public static final int MODE_MULTI_PMT = 0;
    public static final int MODE_SINGLE_PMT = 1;
    private static final int SNIFF_TS_PACKET_COUNT = 5;
    public static final int TS_PACKET_SIZE = 188;
    private static final int TS_PAT_PID = 0;
    public static final int TS_STREAM_TYPE_AAC_ADTS = 15;
    public static final int TS_STREAM_TYPE_AAC_LATM = 17;
    public static final int TS_STREAM_TYPE_AC3 = 129;
    public static final int TS_STREAM_TYPE_AC4 = 172;
    public static final int TS_STREAM_TYPE_AIT = 257;
    public static final int TS_STREAM_TYPE_DC2_H262 = 128;
    public static final int TS_STREAM_TYPE_DTS = 138;
    public static final int TS_STREAM_TYPE_DVBSUBS = 89;
    public static final int TS_STREAM_TYPE_E_AC3 = 135;
    public static final int TS_STREAM_TYPE_H262 = 2;
    public static final int TS_STREAM_TYPE_H263 = 16;
    public static final int TS_STREAM_TYPE_H264 = 27;
    public static final int TS_STREAM_TYPE_H265 = 36;
    public static final int TS_STREAM_TYPE_HDMV_DTS = 130;
    public static final int TS_STREAM_TYPE_ID3 = 21;
    public static final int TS_STREAM_TYPE_MPA = 3;
    public static final int TS_STREAM_TYPE_MPA_LSF = 4;
    public static final int TS_STREAM_TYPE_SPLICE_INFO = 134;
    public static final int TS_SYNC_BYTE = 71;
    private int bytesSinceLastSync;
    private final SparseIntArray continuityCounters;
    private final vr2 durationReader;
    private boolean hasOutputSeekMap;

    @Nullable
    private TsPayloadReader id3Reader;
    private final int mode;
    private ExtractorOutput output;
    private final TsPayloadReader.Factory payloadReaderFactory;
    private int pcrPid;
    private boolean pendingSeekToStart;
    private int remainingPmts;
    private final List<TimestampAdjuster> timestampAdjusters;
    private final int timestampSearchBytes;
    private final SparseBooleanArray trackIds;
    private final SparseBooleanArray trackPids;
    private boolean tracksEnded;
    private ur2 tsBinarySearchSeeker;
    private final ParsableByteArray tsPacketBuffer;
    private final SparseArray<TsPayloadReader> tsPayloadReaders;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface Mode {
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public void release() {
    }

    public static /* synthetic */ int access$108(TsExtractor tsExtractor) {
        int i = tsExtractor.remainingPmts;
        tsExtractor.remainingPmts = i + 1;
        return i;
    }

    private boolean fillBufferWithAtLeastOnePacket(ExtractorInput extractorInput) throws IOException {
        byte[] data = this.tsPacketBuffer.getData();
        if (9400 - this.tsPacketBuffer.getPosition() < 188) {
            int iBytesLeft = this.tsPacketBuffer.bytesLeft();
            if (iBytesLeft > 0) {
                System.arraycopy(data, this.tsPacketBuffer.getPosition(), data, 0, iBytesLeft);
            }
            this.tsPacketBuffer.reset(data, iBytesLeft);
        }
        while (this.tsPacketBuffer.bytesLeft() < 188) {
            int iLimit = this.tsPacketBuffer.limit();
            int i = extractorInput.read(data, iLimit, 9400 - iLimit);
            if (i == -1) {
                return false;
            }
            this.tsPacketBuffer.setLimit(iLimit + i);
        }
        return true;
    }

    private int findEndOfFirstTsPacketInBuffer() throws ParserException {
        int position = this.tsPacketBuffer.getPosition();
        int iLimit = this.tsPacketBuffer.limit();
        int iFindSyncBytePosition = TsUtil.findSyncBytePosition(this.tsPacketBuffer.getData(), position, iLimit);
        this.tsPacketBuffer.setPosition(iFindSyncBytePosition);
        int i = iFindSyncBytePosition + 188;
        if (i <= iLimit) {
            this.bytesSinceLastSync = 0;
            return i;
        }
        int i2 = (iFindSyncBytePosition - position) + this.bytesSinceLastSync;
        this.bytesSinceLastSync = i2;
        if (this.mode != 2 || i2 <= 376) {
            return i;
        }
        throw ParserException.createForMalformedContainer("Cannot find sync byte. Most likely not a Transport Stream.", null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Extractor[] lambda$static$0() {
        return new Extractor[]{new TsExtractor()};
    }

    private void maybeOutputSeekMap(long j) {
        if (this.hasOutputSeekMap) {
            return;
        }
        this.hasOutputSeekMap = true;
        vr2 vr2Var = this.durationReader;
        long j2 = vr2Var.i;
        if (j2 == -9223372036854775807L) {
            this.output.seekMap(new SeekMap.Unseekable(j2));
            return;
        }
        TimestampAdjuster timestampAdjuster = vr2Var.b;
        ur2 ur2Var = new ur2(new BinarySearchSeeker.DefaultSeekTimestampConverter(), new tr2(this.pcrPid, timestampAdjuster, this.timestampSearchBytes), j2, 0L, j2 + 1, 0L, j, 188L, 940);
        this.tsBinarySearchSeeker = ur2Var;
        this.output.seekMap(ur2Var.getSeekMap());
    }

    private void resetPayloadReaders() {
        this.trackIds.clear();
        this.tsPayloadReaders.clear();
        SparseArray<TsPayloadReader> sparseArrayCreateInitialPayloadReaders = this.payloadReaderFactory.createInitialPayloadReaders();
        int size = sparseArrayCreateInitialPayloadReaders.size();
        int i = 0;
        while (true) {
            SparseArray<TsPayloadReader> sparseArray = this.tsPayloadReaders;
            if (i >= size) {
                sparseArray.put(0, new SectionReader(new a(this)));
                this.id3Reader = null;
                return;
            } else {
                sparseArray.put(sparseArrayCreateInitialPayloadReaders.keyAt(i), sparseArrayCreateInitialPayloadReaders.valueAt(i));
                i++;
            }
        }
    }

    private boolean shouldConsumePacketPayload(int i) {
        return this.mode == 2 || this.tracksEnded || !this.trackPids.get(i, false);
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public void init(ExtractorOutput extractorOutput) {
        this.output = extractorOutput;
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public int read(ExtractorInput extractorInput, PositionHolder positionHolder) throws IOException {
        long j;
        long length = extractorInput.getLength();
        if (this.tracksEnded) {
            if (length != -1 && this.mode != 2) {
                vr2 vr2Var = this.durationReader;
                if (!vr2Var.d) {
                    int i = this.pcrPid;
                    TimestampAdjuster timestampAdjuster = vr2Var.b;
                    int i2 = vr2Var.a;
                    ParsableByteArray parsableByteArray = vr2Var.c;
                    if (i <= 0) {
                        vr2Var.a(extractorInput);
                        return 0;
                    }
                    long j2 = -9223372036854775807L;
                    if (!vr2Var.f) {
                        long length2 = extractorInput.getLength();
                        int iMin = (int) Math.min(i2, length2);
                        long j3 = length2 - ((long) iMin);
                        if (extractorInput.getPosition() != j3) {
                            positionHolder.position = j3;
                            return 1;
                        }
                        parsableByteArray.reset(iMin);
                        extractorInput.resetPeekPosition();
                        extractorInput.peekFully(parsableByteArray.getData(), 0, iMin);
                        int position = parsableByteArray.getPosition();
                        int iLimit = parsableByteArray.limit();
                        for (int i3 = iLimit - 188; i3 >= position; i3--) {
                            if (TsUtil.isStartOfTsPacket(parsableByteArray.getData(), position, iLimit, i3)) {
                                long pcrFromPacket = TsUtil.readPcrFromPacket(parsableByteArray, i3, i);
                                if (pcrFromPacket != -9223372036854775807L) {
                                    j2 = pcrFromPacket;
                                    break;
                                }
                            }
                        }
                        vr2Var.h = j2;
                        vr2Var.f = true;
                        return 0;
                    }
                    if (vr2Var.h == -9223372036854775807L) {
                        vr2Var.a(extractorInput);
                        return 0;
                    }
                    if (vr2Var.e) {
                        long j4 = vr2Var.g;
                        if (j4 == -9223372036854775807L) {
                            vr2Var.a(extractorInput);
                            return 0;
                        }
                        long jAdjustTsTimestamp = timestampAdjuster.adjustTsTimestamp(vr2Var.h) - timestampAdjuster.adjustTsTimestamp(j4);
                        vr2Var.i = jAdjustTsTimestamp;
                        if (jAdjustTsTimestamp < 0) {
                            Log.w("TsDurationReader", "Invalid duration: " + vr2Var.i + ". Using TIME_UNSET instead.");
                            vr2Var.i = -9223372036854775807L;
                        }
                        vr2Var.a(extractorInput);
                        return 0;
                    }
                    int iMin2 = (int) Math.min(i2, extractorInput.getLength());
                    if (extractorInput.getPosition() != 0) {
                        positionHolder.position = 0L;
                        return 1;
                    }
                    parsableByteArray.reset(iMin2);
                    extractorInput.resetPeekPosition();
                    extractorInput.peekFully(parsableByteArray.getData(), 0, iMin2);
                    int iLimit2 = parsableByteArray.limit();
                    for (int position2 = parsableByteArray.getPosition(); position2 < iLimit2; position2++) {
                        if (parsableByteArray.getData()[position2] == 71) {
                            long pcrFromPacket2 = TsUtil.readPcrFromPacket(parsableByteArray, position2, i);
                            if (pcrFromPacket2 != -9223372036854775807L) {
                                j2 = pcrFromPacket2;
                                break;
                            }
                        }
                    }
                    vr2Var.g = j2;
                    vr2Var.e = true;
                    return 0;
                }
            }
            maybeOutputSeekMap(length);
            if (this.pendingSeekToStart) {
                this.pendingSeekToStart = false;
                seek(0L, 0L);
                if (extractorInput.getPosition() != 0) {
                    positionHolder.position = 0L;
                    return 1;
                }
            }
            ur2 ur2Var = this.tsBinarySearchSeeker;
            if (ur2Var != null && ur2Var.isSeeking()) {
                return this.tsBinarySearchSeeker.handlePendingSeek(extractorInput, positionHolder);
            }
        }
        if (!fillBufferWithAtLeastOnePacket(extractorInput)) {
            return -1;
        }
        int iFindEndOfFirstTsPacketInBuffer = findEndOfFirstTsPacketInBuffer();
        int iLimit3 = this.tsPacketBuffer.limit();
        if (iFindEndOfFirstTsPacketInBuffer > iLimit3) {
            return 0;
        }
        int i4 = this.tsPacketBuffer.readInt();
        if ((8388608 & i4) != 0) {
            this.tsPacketBuffer.setPosition(iFindEndOfFirstTsPacketInBuffer);
            return 0;
        }
        int i5 = (4194304 & i4) != 0 ? 1 : 0;
        int i6 = (2096896 & i4) >> 8;
        boolean z = (i4 & 32) != 0;
        TsPayloadReader tsPayloadReader = (i4 & 16) != 0 ? this.tsPayloadReaders.get(i6) : null;
        if (tsPayloadReader == null) {
            this.tsPacketBuffer.setPosition(iFindEndOfFirstTsPacketInBuffer);
            return 0;
        }
        if (this.mode != 2) {
            int i7 = i4 & 15;
            j = -1;
            int i8 = this.continuityCounters.get(i6, i7 - 1);
            this.continuityCounters.put(i6, i7);
            if (i8 == i7) {
                this.tsPacketBuffer.setPosition(iFindEndOfFirstTsPacketInBuffer);
                return 0;
            }
            if (i7 != ((i8 + 1) & 15)) {
                tsPayloadReader.seek();
            }
        } else {
            j = -1;
        }
        if (z) {
            int unsignedByte = this.tsPacketBuffer.readUnsignedByte();
            i5 |= (this.tsPacketBuffer.readUnsignedByte() & 64) != 0 ? 2 : 0;
            this.tsPacketBuffer.skipBytes(unsignedByte - 1);
        }
        boolean z2 = this.tracksEnded;
        if (shouldConsumePacketPayload(i6)) {
            this.tsPacketBuffer.setLimit(iFindEndOfFirstTsPacketInBuffer);
            tsPayloadReader.consume(this.tsPacketBuffer, i5);
            this.tsPacketBuffer.setLimit(iLimit3);
        }
        if (this.mode != 2 && !z2 && this.tracksEnded && length != j) {
            this.pendingSeekToStart = true;
        }
        this.tsPacketBuffer.setPosition(iFindEndOfFirstTsPacketInBuffer);
        return 0;
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public void seek(long j, long j2) {
        ur2 ur2Var;
        Assertions.checkState(this.mode != 2);
        int size = this.timestampAdjusters.size();
        for (int i = 0; i < size; i++) {
            TimestampAdjuster timestampAdjuster = this.timestampAdjusters.get(i);
            boolean z = timestampAdjuster.getTimestampOffsetUs() == -9223372036854775807L;
            if (!z) {
                long firstSampleTimestampUs = timestampAdjuster.getFirstSampleTimestampUs();
                z = (firstSampleTimestampUs == -9223372036854775807L || firstSampleTimestampUs == 0 || firstSampleTimestampUs == j2) ? false : true;
            }
            if (z) {
                timestampAdjuster.reset(j2);
            }
        }
        if (j2 != 0 && (ur2Var = this.tsBinarySearchSeeker) != null) {
            ur2Var.setSeekTargetUs(j2);
        }
        this.tsPacketBuffer.reset(0);
        this.continuityCounters.clear();
        for (int i2 = 0; i2 < this.tsPayloadReaders.size(); i2++) {
            this.tsPayloadReaders.valueAt(i2).seek();
        }
        this.bytesSinceLastSync = 0;
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public boolean sniff(ExtractorInput extractorInput) throws IOException {
        byte[] data = this.tsPacketBuffer.getData();
        extractorInput.peekFully(data, 0, 940);
        for (int i = 0; i < 188; i++) {
            int i2 = 0;
            while (true) {
                if (i2 >= 5) {
                    extractorInput.skipFully(i);
                    return true;
                }
                if (data[(i2 * 188) + i] != 71) {
                    break;
                }
                i2++;
            }
        }
        return false;
    }

    public TsExtractor(int i, TimestampAdjuster timestampAdjuster, TsPayloadReader.Factory factory, int i2) {
        this.payloadReaderFactory = (TsPayloadReader.Factory) Assertions.checkNotNull(factory);
        this.timestampSearchBytes = i2;
        this.mode = i;
        if (i != 1 && i != 2) {
            ArrayList arrayList = new ArrayList();
            this.timestampAdjusters = arrayList;
            arrayList.add(timestampAdjuster);
        } else {
            this.timestampAdjusters = Collections.singletonList(timestampAdjuster);
        }
        this.tsPacketBuffer = new ParsableByteArray(new byte[BUFFER_SIZE], 0);
        this.trackIds = new SparseBooleanArray();
        this.trackPids = new SparseBooleanArray();
        this.tsPayloadReaders = new SparseArray<>();
        this.continuityCounters = new SparseIntArray();
        this.durationReader = new vr2(i2);
        this.output = ExtractorOutput.PLACEHOLDER;
        this.pcrPid = -1;
        resetPayloadReaders();
    }

    public TsExtractor(int i) {
        this(1, i, 112800);
    }

    public TsExtractor(int i, int i2, int i3) {
        this(i, new TimestampAdjuster(0L), new DefaultTsPayloadReaderFactory(i2), i3);
    }

    public TsExtractor(int i, TimestampAdjuster timestampAdjuster, TsPayloadReader.Factory factory) {
        this(i, timestampAdjuster, factory, 112800);
    }

    public TsExtractor() {
        this(0);
    }
}
