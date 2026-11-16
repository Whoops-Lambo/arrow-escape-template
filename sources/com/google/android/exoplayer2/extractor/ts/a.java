package com.google.android.exoplayer2.extractor.ts;

import com.google.android.exoplayer2.extractor.ExtractorOutput;
import com.google.android.exoplayer2.util.ParsableBitArray;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.android.exoplayer2.util.TimestampAdjuster;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class a implements SectionPayloadReader {
    public final ParsableBitArray a = new ParsableBitArray(new byte[4]);
    public final /* synthetic */ TsExtractor b;

    @Override // com.google.android.exoplayer2.extractor.ts.SectionPayloadReader
    public final void init(TimestampAdjuster timestampAdjuster, ExtractorOutput extractorOutput, TsPayloadReader.TrackIdGenerator trackIdGenerator) {
    }

    public a(TsExtractor tsExtractor) {
        this.b = tsExtractor;
    }

    @Override // com.google.android.exoplayer2.extractor.ts.SectionPayloadReader
    public final void consume(ParsableByteArray parsableByteArray) {
        TsExtractor tsExtractor;
        if (parsableByteArray.readUnsignedByte() == 0 && (parsableByteArray.readUnsignedByte() & 128) != 0) {
            parsableByteArray.skipBytes(6);
            int iBytesLeft = parsableByteArray.bytesLeft() / 4;
            int i = 0;
            while (true) {
                tsExtractor = this.b;
                if (i >= iBytesLeft) {
                    break;
                }
                ParsableBitArray parsableBitArray = this.a;
                parsableByteArray.readBytes(parsableBitArray, 4);
                int bits = parsableBitArray.readBits(16);
                parsableBitArray.skipBits(3);
                if (bits == 0) {
                    parsableBitArray.skipBits(13);
                } else {
                    int bits2 = parsableBitArray.readBits(13);
                    if (tsExtractor.tsPayloadReaders.get(bits2) == null) {
                        tsExtractor.tsPayloadReaders.put(bits2, new SectionReader(new b(tsExtractor, bits2)));
                        TsExtractor.access$108(tsExtractor);
                    }
                }
                i++;
            }
            if (tsExtractor.mode != 2) {
                tsExtractor.tsPayloadReaders.remove(0);
            }
        }
    }
}
