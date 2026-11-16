package io.p071bidmachine.media3.extractor.mp3;

import io.p071bidmachine.media3.common.util.a;
import io.p071bidmachine.media3.common.util.x;
import io.p071bidmachine.media3.extractor.a0;
import io.p071bidmachine.media3.extractor.y;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes10.dex */
public final class h implements f {
    public final long a;
    public final int b;
    public final long c;
    public final int d;
    public final long e;
    public final long f;
    public final long[] g;

    @Override // io.p071bidmachine.media3.extractor.mp3.f
    public final int getAverageBitrate() {
        return this.d;
    }

    @Override // io.p071bidmachine.media3.extractor.mp3.f
    public final long getDataEndPosition() {
        return this.f;
    }

    @Override // io.p071bidmachine.media3.extractor.z
    public final long getDurationUs() {
        return this.c;
    }

    @Override // io.p071bidmachine.media3.extractor.z
    public final y getSeekPoints(long j) {
        double d;
        double d2;
        boolean zIsSeekable = isSeekable();
        int i = this.b;
        long j2 = this.a;
        if (!zIsSeekable) {
            a0 a0Var = new a0(0L, j2 + ((long) i));
            return new y(a0Var, a0Var);
        }
        long jI = x.i(j, 0L, this.c);
        double d3 = (jI * 100.0d) / this.c;
        double d4 = 0.0d;
        if (d3 <= 0.0d) {
            d = 256.0d;
        } else if (d3 >= 100.0d) {
            d = 256.0d;
            d4 = 256.0d;
        } else {
            int i2 = (int) d3;
            long[] jArr = this.g;
            a.j(jArr);
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
        long j3 = this.e;
        a0 a0Var2 = new a0(jI, j2 + x.i(Math.round((d4 / d) * j3), i, j3 - 1));
        return new y(a0Var2, a0Var2);
    }

    @Override // io.p071bidmachine.media3.extractor.mp3.f
    public final long getTimeUs(long j) {
        long j2 = j - this.a;
        if (!isSeekable() || j2 <= this.b) {
            return 0L;
        }
        long[] jArr = this.g;
        a.j(jArr);
        double d = (j2 * 256.0d) / this.e;
        int iE = x.e(jArr, (long) d, true);
        long j3 = this.c;
        long j4 = (((long) iE) * j3) / 100;
        long j5 = jArr[iE];
        int i = iE + 1;
        long j6 = (j3 * ((long) i)) / 100;
        long j7 = iE == 99 ? 256L : jArr[i];
        return Math.round((j5 == j7 ? 0.0d : (d - j5) / (j7 - j5)) * (j6 - j4)) + j4;
    }

    @Override // io.p071bidmachine.media3.extractor.z
    public final boolean isSeekable() {
        return this.g != null;
    }

    public h(long j, int i, long j2, int i2, long j3, long[] jArr) {
        this.a = j;
        this.b = i;
        this.c = j2;
        this.d = i2;
        this.e = j3;
        this.g = jArr;
        this.f = j3 != -1 ? j + j3 : -1L;
    }
}
