package androidx.media3.extractor.mp3;

import androidx.annotation.Nullable;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.Util;
import androidx.media3.extractor.MpegAudioUtil;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
final class XingFrame {
    public final long dataSize;
    public final int encoderDelay;
    public final int encoderPadding;
    public final long frameCount;
    public final MpegAudioUtil.Header header;

    @Nullable
    public final long[] tableOfContents;

    public long computeDurationUs() {
        long j = this.frameCount;
        if (j == -1 || j == 0) {
            return -9223372036854775807L;
        }
        MpegAudioUtil.Header header = this.header;
        return Util.sampleCountToDurationUs((j * ((long) header.samplesPerFrame)) - 1, header.sampleRate);
    }

    private XingFrame(MpegAudioUtil.Header header, long j, long j2, @Nullable long[] jArr, int i, int i2) {
        this.header = new MpegAudioUtil.Header(header);
        this.frameCount = j;
        this.dataSize = j2;
        this.tableOfContents = jArr;
        this.encoderDelay = i;
        this.encoderPadding = i2;
    }

    public static XingFrame parse(MpegAudioUtil.Header header, ParsableByteArray parsableByteArray) {
        int unsignedIntToInt;
        long unsignedInt;
        long[] jArr;
        int i;
        int i2;
        int i3 = parsableByteArray.readInt();
        if ((i3 & 1) != 0) {
            unsignedIntToInt = parsableByteArray.readUnsignedIntToInt();
        } else {
            unsignedIntToInt = -1;
        }
        if ((i3 & 2) != 0) {
            unsignedInt = parsableByteArray.readUnsignedInt();
        } else {
            unsignedInt = -1;
        }
        long j = unsignedInt;
        if ((i3 & 4) == 4) {
            jArr = new long[100];
            for (int i4 = 0; i4 < 100; i4++) {
                jArr[i4] = parsableByteArray.readUnsignedByte();
            }
        } else {
            jArr = null;
        }
        long[] jArr2 = jArr;
        if ((i3 & 8) != 0) {
            parsableByteArray.skipBytes(4);
        }
        if (parsableByteArray.bytesLeft() >= 24) {
            parsableByteArray.skipBytes(21);
            int unsignedInt24 = parsableByteArray.readUnsignedInt24();
            i2 = unsignedInt24 & 4095;
            i = (16773120 & unsignedInt24) >> 12;
        } else {
            i = -1;
            i2 = -1;
        }
        return new XingFrame(header, unsignedIntToInt, j, jArr2, i, i2);
    }
}
