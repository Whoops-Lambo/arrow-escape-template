package io.p071bidmachine.media3.extractor.wav;

import defpackage.w73;
import io.p071bidmachine.media3.common.util.x;
import io.p071bidmachine.media3.extractor.a0;
import io.p071bidmachine.media3.extractor.y;
import io.p071bidmachine.media3.extractor.z;
import java.math.RoundingMode;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class e implements z {
    public final w73 a;
    public final int b;
    public final long c;
    public final long d;
    public final long e;

    @Override // io.p071bidmachine.media3.extractor.z
    public final boolean isSeekable() {
        return true;
    }

    public final long a(long j) {
        long j2 = j * ((long) this.b);
        long j3 = this.a.b;
        int i = x.a;
        return x.T(j2, 1000000L, j3, RoundingMode.DOWN);
    }

    @Override // io.p071bidmachine.media3.extractor.z
    public final long getDurationUs() {
        return this.e;
    }

    @Override // io.p071bidmachine.media3.extractor.z
    public final y getSeekPoints(long j) {
        w73 w73Var = this.a;
        long j2 = (((long) w73Var.b) * j) / (((long) this.b) * 1000000);
        long j3 = this.d - 1;
        long jI = x.i(j2, 0L, j3);
        int i = w73Var.c;
        long j4 = this.c;
        long jA = a(jI);
        a0 a0Var = new a0(jA, (((long) i) * jI) + j4);
        if (jA >= j || jI == j3) {
            return new y(a0Var, a0Var);
        }
        long j5 = jI + 1;
        return new y(a0Var, new a0(a(j5), (((long) i) * j5) + j4));
    }

    public e(w73 w73Var, int i, long j, long j2) {
        this.a = w73Var;
        this.b = i;
        this.c = j;
        long j3 = (j2 - j) / ((long) w73Var.c);
        this.d = j3;
        this.e = a(j3);
    }
}
