package defpackage;

import com.google.android.exoplayer2.extractor.SeekMap;
import com.google.android.exoplayer2.extractor.SeekPoint;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Util;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class b93 implements b82 {
    public final long a;
    public final int b;
    public final long c;
    public final long d;
    public final long e;
    public final long[] f;

    @Override // defpackage.b82
    public final long getDataEndPosition() {
        return this.e;
    }

    @Override // com.google.android.exoplayer2.extractor.SeekMap
    public final long getDurationUs() {
        return this.c;
    }

    @Override // com.google.android.exoplayer2.extractor.SeekMap
    public final SeekMap.SeekPoints getSeekPoints(long j) {
        double d;
        double d2;
        boolean zIsSeekable = isSeekable();
        int i = this.b;
        long j2 = this.a;
        if (!zIsSeekable) {
            return new SeekMap.SeekPoints(new SeekPoint(0L, j2 + ((long) i)));
        }
        long jConstrainValue = Util.constrainValue(j, 0L, this.c);
        double d3 = (jConstrainValue * 100.0d) / this.c;
        double d4 = 0.0d;
        if (d3 <= 0.0d) {
            d = 256.0d;
        } else if (d3 >= 100.0d) {
            d = 256.0d;
            d4 = 256.0d;
        } else {
            int i2 = (int) d3;
            long[] jArr = (long[]) Assertions.checkStateNotNull(this.f);
            double d5 = jArr[i2];
            if (i2 == 99) {
                d = 256.0d;
                d2 = 256.0d;
            } else {
                d = 256.0d;
                d2 = jArr[i2 + 1];
            }
            d4 = ((d2 - d5) * (d3 - ((double) i2))) + d5;
        }
        long j3 = this.d;
        return new SeekMap.SeekPoints(new SeekPoint(jConstrainValue, j2 + Util.constrainValue(Math.round((d4 / d) * j3), i, j3 - 1)));
    }

    @Override // defpackage.b82
    public final long getTimeUs(long j) {
        long j2 = j - this.a;
        if (!isSeekable() || j2 <= this.b) {
            return 0L;
        }
        long[] jArr = (long[]) Assertions.checkStateNotNull(this.f);
        double d = (j2 * 256.0d) / this.d;
        int iBinarySearchFloor = Util.binarySearchFloor(jArr, (long) d, true, true);
        long j3 = this.c;
        long j4 = (((long) iBinarySearchFloor) * j3) / 100;
        long j5 = jArr[iBinarySearchFloor];
        int i = iBinarySearchFloor + 1;
        long j6 = (j3 * ((long) i)) / 100;
        long j7 = iBinarySearchFloor == 99 ? 256L : jArr[i];
        return Math.round((j5 == j7 ? 0.0d : (d - j5) / (j7 - j5)) * (j6 - j4)) + j4;
    }

    @Override // com.google.android.exoplayer2.extractor.SeekMap
    public final boolean isSeekable() {
        return this.f != null;
    }

    public b93(long j, int i, long j2, long j3, long[] jArr) {
        this.a = j;
        this.b = i;
        this.c = j2;
        this.f = jArr;
        this.d = j3;
        this.e = j3 != -1 ? j + j3 : -1L;
    }
}
