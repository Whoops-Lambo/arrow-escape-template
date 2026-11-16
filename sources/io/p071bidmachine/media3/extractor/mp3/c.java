package io.p071bidmachine.media3.extractor.mp3;

import android.util.Pair;
import io.p071bidmachine.media3.common.util.x;
import io.p071bidmachine.media3.extractor.a0;
import io.p071bidmachine.media3.extractor.y;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes10.dex */
public final class c implements f {
    public final long[] a;
    public final long[] b;
    public final long c;

    public static Pair a(long j, long[] jArr, long[] jArr2) {
        int iE = x.e(jArr, j, true);
        long j2 = jArr[iE];
        long j3 = jArr2[iE];
        int i = iE + 1;
        if (i == jArr.length) {
            return Pair.create(Long.valueOf(j2), Long.valueOf(j3));
        }
        long j4 = jArr[i];
        return Pair.create(Long.valueOf(j), Long.valueOf(((long) ((j4 == j2 ? 0.0d : (j - j2) / (j4 - j2)) * (jArr2[i] - j3))) + j3));
    }

    @Override // io.p071bidmachine.media3.extractor.z
    public final boolean isSeekable() {
        return true;
    }

    @Override // io.p071bidmachine.media3.extractor.mp3.f
    public final long getDataEndPosition() {
        return -1L;
    }

    @Override // io.p071bidmachine.media3.extractor.z
    public final long getDurationUs() {
        return this.c;
    }

    @Override // io.p071bidmachine.media3.extractor.z
    public final y getSeekPoints(long j) {
        Pair pairA = a(x.X(x.i(j, 0L, this.c)), this.b, this.a);
        a0 a0Var = new a0(x.L(((Long) pairA.first).longValue()), ((Long) pairA.second).longValue());
        return new y(a0Var, a0Var);
    }

    @Override // io.p071bidmachine.media3.extractor.mp3.f
    public final long getTimeUs(long j) {
        return x.L(((Long) a(j, this.a, this.b).second).longValue());
    }

    public c(long[] jArr, long[] jArr2, long j) {
        this.a = jArr;
        this.b = jArr2;
        this.c = j == -9223372036854775807L ? x.L(jArr2[jArr2.length - 1]) : j;
    }

    @Override // io.p071bidmachine.media3.extractor.mp3.f
    public final int getAverageBitrate() {
        return -2147483647;
    }
}
