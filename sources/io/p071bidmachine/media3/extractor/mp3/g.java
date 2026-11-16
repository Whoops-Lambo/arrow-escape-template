package io.p071bidmachine.media3.extractor.mp3;

import io.p071bidmachine.media3.common.util.x;
import io.p071bidmachine.media3.extractor.a0;
import io.p071bidmachine.media3.extractor.y;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes10.dex */
public final class g implements f {
    public final long[] a;
    public final long[] b;
    public final long c;
    public final long d;
    public final int e;

    @Override // io.p071bidmachine.media3.extractor.z
    public final boolean isSeekable() {
        return true;
    }

    @Override // io.p071bidmachine.media3.extractor.mp3.f
    public final int getAverageBitrate() {
        return this.e;
    }

    @Override // io.p071bidmachine.media3.extractor.mp3.f
    public final long getDataEndPosition() {
        return this.d;
    }

    @Override // io.p071bidmachine.media3.extractor.z
    public final long getDurationUs() {
        return this.c;
    }

    @Override // io.p071bidmachine.media3.extractor.z
    public final y getSeekPoints(long j) {
        long[] jArr = this.a;
        int iE = x.e(jArr, j, true);
        long j2 = jArr[iE];
        long[] jArr2 = this.b;
        a0 a0Var = new a0(j2, jArr2[iE]);
        if (j2 >= j || iE == jArr.length - 1) {
            return new y(a0Var, a0Var);
        }
        int i = iE + 1;
        return new y(a0Var, new a0(jArr[i], jArr2[i]));
    }

    @Override // io.p071bidmachine.media3.extractor.mp3.f
    public final long getTimeUs(long j) {
        return this.a[x.e(this.b, j, true)];
    }

    public g(long[] jArr, long[] jArr2, long j, long j2, int i) {
        this.a = jArr;
        this.b = jArr2;
        this.c = j;
        this.d = j2;
        this.e = i;
    }
}
