package defpackage;

import androidx.media3.exoplayer.audio.SilenceSkippingAudioProcessor;
import com.google.android.exoplayer2.extractor.SeekMap;
import com.google.android.exoplayer2.extractor.SeekPoint;
import com.google.android.exoplayer2.util.LongArray;
import com.google.android.exoplayer2.util.Util;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class x51 implements b82 {
    public final long a;
    public final LongArray b;
    public final LongArray c;
    public long d;

    @Override // com.google.android.exoplayer2.extractor.SeekMap
    public final boolean isSeekable() {
        return true;
    }

    public final boolean a(long j) {
        LongArray longArray = this.b;
        return j - longArray.get(longArray.size() - 1) < SilenceSkippingAudioProcessor.DEFAULT_MINIMUM_SILENCE_DURATION_US;
    }

    @Override // defpackage.b82
    public final long getDataEndPosition() {
        return this.a;
    }

    @Override // com.google.android.exoplayer2.extractor.SeekMap
    public final long getDurationUs() {
        return this.d;
    }

    @Override // com.google.android.exoplayer2.extractor.SeekMap
    public final SeekMap.SeekPoints getSeekPoints(long j) {
        LongArray longArray = this.b;
        int iBinarySearchFloor = Util.binarySearchFloor(longArray, j, true, true);
        long j2 = longArray.get(iBinarySearchFloor);
        LongArray longArray2 = this.c;
        SeekPoint seekPoint = new SeekPoint(j2, longArray2.get(iBinarySearchFloor));
        if (seekPoint.timeUs == j || iBinarySearchFloor == longArray.size() - 1) {
            return new SeekMap.SeekPoints(seekPoint);
        }
        int i = iBinarySearchFloor + 1;
        return new SeekMap.SeekPoints(seekPoint, new SeekPoint(longArray.get(i), longArray2.get(i)));
    }

    @Override // defpackage.b82
    public final long getTimeUs(long j) {
        return this.b.get(Util.binarySearchFloor(this.c, j, true, true));
    }

    public x51(long j, long j2, long j3) {
        this.d = j;
        this.a = j3;
        LongArray longArray = new LongArray();
        this.b = longArray;
        LongArray longArray2 = new LongArray();
        this.c = longArray2;
        longArray.add(0L);
        longArray2.add(j2);
    }
}
