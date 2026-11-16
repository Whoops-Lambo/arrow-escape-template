package com.google.android.exoplayer2.extractor.ts;

import android.util.SparseArray;
import android.util.SparseIntArray;
import com.google.android.exoplayer2.extractor.ExtractorOutput;
import com.google.android.exoplayer2.util.ParsableBitArray;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.android.exoplayer2.util.TimestampAdjuster;
import com.google.android.exoplayer2.util.Util;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class b implements SectionPayloadReader {
    public final ParsableBitArray a = new ParsableBitArray(new byte[5]);
    public final SparseArray b = new SparseArray();
    public final SparseIntArray c = new SparseIntArray();
    public final int d;
    public final /* synthetic */ TsExtractor e;

    @Override // com.google.android.exoplayer2.extractor.ts.SectionPayloadReader
    public final void init(TimestampAdjuster timestampAdjuster, ExtractorOutput extractorOutput, TsPayloadReader.TrackIdGenerator trackIdGenerator) {
    }

    /* JADX WARN: Code duplicated, block: B:42:0x0132  */
    @Override // com.google.android.exoplayer2.extractor.ts.SectionPayloadReader
    public final void consume(ParsableByteArray parsableByteArray) {
        TimestampAdjuster timestampAdjuster;
        char c;
        if (parsableByteArray.readUnsignedByte() != 2) {
            return;
        }
        TsExtractor tsExtractor = this.e;
        if (tsExtractor.mode == 1 || tsExtractor.mode == 2 || tsExtractor.remainingPmts == 1) {
            timestampAdjuster = (TimestampAdjuster) tsExtractor.timestampAdjusters.get(0);
        } else {
            timestampAdjuster = new TimestampAdjuster(((TimestampAdjuster) tsExtractor.timestampAdjusters.get(0)).getFirstSampleTimestampUs());
            tsExtractor.timestampAdjusters.add(timestampAdjuster);
        }
        if ((parsableByteArray.readUnsignedByte() & 128) == 0) {
            return;
        }
        parsableByteArray.skipBytes(1);
        int unsignedShort = parsableByteArray.readUnsignedShort();
        int i = 3;
        parsableByteArray.skipBytes(3);
        ParsableBitArray parsableBitArray = this.a;
        parsableByteArray.readBytes(parsableBitArray, 2);
        parsableBitArray.skipBits(3);
        int i2 = 13;
        tsExtractor.pcrPid = parsableBitArray.readBits(13);
        parsableByteArray.readBytes(parsableBitArray, 2);
        int i3 = 4;
        parsableBitArray.skipBits(4);
        int i4 = 12;
        parsableByteArray.skipBytes(parsableBitArray.readBits(12));
        if (tsExtractor.mode == 2 && tsExtractor.id3Reader == null) {
            tsExtractor.id3Reader = tsExtractor.payloadReaderFactory.createPayloadReader(21, new TsPayloadReader.EsInfo(21, null, null, Util.EMPTY_BYTE_ARRAY));
            if (tsExtractor.id3Reader != null) {
                tsExtractor.id3Reader.init(timestampAdjuster, tsExtractor.output, new TsPayloadReader.TrackIdGenerator(unsignedShort, 21, 8192));
            }
        }
        SparseArray sparseArray = this.b;
        sparseArray.clear();
        SparseIntArray sparseIntArray = this.c;
        sparseIntArray.clear();
        int iBytesLeft = parsableByteArray.bytesLeft();
        while (iBytesLeft > 0) {
            int i5 = 5;
            parsableByteArray.readBytes(parsableBitArray, 5);
            int bits = parsableBitArray.readBits(8);
            parsableBitArray.skipBits(i);
            int bits2 = parsableBitArray.readBits(i2);
            parsableBitArray.skipBits(i3);
            int bits3 = parsableBitArray.readBits(i4);
            int position = parsableByteArray.getPosition();
            int i6 = position + bits3;
            int i7 = -1;
            String strTrim = null;
            ArrayList arrayList = null;
            while (parsableByteArray.getPosition() < i6) {
                int unsignedByte = parsableByteArray.readUnsignedByte();
                int position2 = parsableByteArray.getPosition() + parsableByteArray.readUnsignedByte();
                if (position2 > i6) {
                    break;
                }
                if (unsignedByte == i5) {
                    long unsignedInt = parsableByteArray.readUnsignedInt();
                    if (unsignedInt == 1094921523) {
                        i7 = 129;
                    } else if (unsignedInt == 1161904947) {
                        i7 = 135;
                    } else if (unsignedInt == 1094921524) {
                        i7 = 172;
                    } else if (unsignedInt == 1212503619) {
                        i7 = 36;
                    }
                } else if (unsignedByte == 106) {
                    position2 = position2;
                    i7 = 129;
                    parsableBitArray = parsableBitArray;
                } else if (unsignedByte == 122) {
                    position2 = position2;
                    parsableBitArray = parsableBitArray;
                    i7 = 135;
                } else if (unsignedByte == 127) {
                    if (parsableByteArray.readUnsignedByte() == 21) {
                        i7 = 172;
                    }
                } else if (unsignedByte == 123) {
                    i7 = 138;
                } else if (unsignedByte == 10) {
                    strTrim = parsableByteArray.readString(3).trim();
                } else if (unsignedByte == 89) {
                    ArrayList arrayList2 = new ArrayList();
                    while (parsableByteArray.getPosition() < position2) {
                        String strTrim2 = parsableByteArray.readString(3).trim();
                        int i8 = position2;
                        int unsignedByte2 = parsableByteArray.readUnsignedByte();
                        int i9 = iBytesLeft;
                        byte[] bArr = new byte[4];
                        parsableByteArray.readBytes(bArr, 0, 4);
                        arrayList2.add(new TsPayloadReader.DvbSubtitleInfo(strTrim2, unsignedByte2, bArr));
                        position2 = i8;
                        iBytesLeft = i9;
                        parsableBitArray = parsableBitArray;
                    }
                    position2 = position2;
                    parsableBitArray = parsableBitArray;
                    iBytesLeft = iBytesLeft;
                    arrayList = arrayList2;
                    i7 = 89;
                } else {
                    position2 = position2;
                    parsableBitArray = parsableBitArray;
                    iBytesLeft = iBytesLeft;
                    if (unsignedByte == 111) {
                        i7 = 257;
                    }
                }
                parsableByteArray.skipBytes(position2 - parsableByteArray.getPosition());
                iBytesLeft = iBytesLeft;
                parsableBitArray = parsableBitArray;
                i5 = 5;
            }
            ParsableBitArray parsableBitArray2 = parsableBitArray;
            int i10 = iBytesLeft;
            parsableByteArray.setPosition(i6);
            TsPayloadReader.EsInfo esInfo = new TsPayloadReader.EsInfo(i7, strTrim, arrayList, Arrays.copyOfRange(parsableByteArray.getData(), position, i6));
            if (bits == 6 || bits == 5) {
                bits = esInfo.streamType;
            }
            iBytesLeft = i10 - (bits3 + 5);
            int i11 = tsExtractor.mode == 2 ? bits : bits2;
            if (tsExtractor.trackIds.get(i11)) {
                c = 21;
            } else {
                c = 21;
                TsPayloadReader tsPayloadReaderCreatePayloadReader = (tsExtractor.mode == 2 && bits == 21) ? tsExtractor.id3Reader : tsExtractor.payloadReaderFactory.createPayloadReader(bits, esInfo);
                if (tsExtractor.mode != 2 || bits2 < sparseIntArray.get(i11, 8192)) {
                    sparseIntArray.put(i11, bits2);
                    sparseArray.put(i11, tsPayloadReaderCreatePayloadReader);
                }
            }
            i3 = 4;
            parsableBitArray = parsableBitArray2;
            i = 3;
            i2 = 13;
            i4 = 12;
        }
        int size = sparseIntArray.size();
        for (int i12 = 0; i12 < size; i12++) {
            int iKeyAt = sparseIntArray.keyAt(i12);
            int iValueAt = sparseIntArray.valueAt(i12);
            tsExtractor.trackIds.put(iKeyAt, true);
            tsExtractor.trackPids.put(iValueAt, true);
            TsPayloadReader tsPayloadReader = (TsPayloadReader) sparseArray.valueAt(i12);
            if (tsPayloadReader != null) {
                if (tsPayloadReader != tsExtractor.id3Reader) {
                    tsPayloadReader.init(timestampAdjuster, tsExtractor.output, new TsPayloadReader.TrackIdGenerator(unsignedShort, iKeyAt, 8192));
                }
                tsExtractor.tsPayloadReaders.put(iValueAt, tsPayloadReader);
            }
        }
        if (tsExtractor.mode == 2) {
            if (tsExtractor.tracksEnded) {
                return;
            }
            tsExtractor.output.endTracks();
            tsExtractor.remainingPmts = 0;
            tsExtractor.tracksEnded = true;
            return;
        }
        tsExtractor.tsPayloadReaders.remove(this.d);
        tsExtractor.remainingPmts = tsExtractor.mode == 1 ? 0 : tsExtractor.remainingPmts - 1;
        if (tsExtractor.remainingPmts == 0) {
            tsExtractor.output.endTracks();
            tsExtractor.tracksEnded = true;
        }
    }

    public b(TsExtractor tsExtractor, int i) {
        this.e = tsExtractor;
        this.d = i;
    }
}
