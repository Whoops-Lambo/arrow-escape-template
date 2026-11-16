package io.p071bidmachine.media3.exoplayer.source;

import io.p071bidmachine.media3.common.b;
import io.p071bidmachine.media3.common.p0;
import io.p071bidmachine.media3.common.q0;
import io.p071bidmachine.media3.common.r0;
import io.p071bidmachine.media3.common.util.x;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class f extends s {
    public final long c;
    public final long d;
    public final long e;
    public final boolean f;

    @Override // io.p071bidmachine.media3.exoplayer.source.s, io.p071bidmachine.media3.common.r0
    public final q0 m(int i, q0 q0Var, long j) {
        this.b.m(0, q0Var, 0L);
        long j2 = q0Var.o;
        long j3 = this.c;
        q0Var.o = j2 + j3;
        q0Var.l = this.e;
        q0Var.h = this.f;
        long j4 = q0Var.k;
        if (j4 != -9223372036854775807L) {
            long jMax = Math.max(j4, j3);
            q0Var.k = jMax;
            long j5 = this.d;
            if (j5 != -9223372036854775807L) {
                jMax = Math.min(jMax, j5);
            }
            q0Var.k = jMax - j3;
        }
        long jX = x.X(j3);
        long j6 = q0Var.d;
        if (j6 != -9223372036854775807L) {
            q0Var.d = j6 + jX;
        }
        long j7 = q0Var.e;
        if (j7 != -9223372036854775807L) {
            q0Var.e = j7 + jX;
        }
        return q0Var;
    }

    @Override // io.p071bidmachine.media3.exoplayer.source.s, io.p071bidmachine.media3.common.r0
    public final p0 f(int i, p0 p0Var, boolean z) {
        this.b.f(0, p0Var, z);
        long j = p0Var.e - this.c;
        long j2 = this.e;
        p0Var.h(p0Var.a, p0Var.b, 0, j2 != -9223372036854775807L ? j2 - j : -9223372036854775807L, j, b.c, false);
        return p0Var;
    }

    public f(r0 r0Var, long j, long j2) throws g {
        long jMax;
        super(r0Var);
        if (j2 != Long.MIN_VALUE && j2 < j) {
            throw new g(2, j, j2);
        }
        boolean z = false;
        if (r0Var.h() == 1) {
            q0 q0VarM = r0Var.m(0, new q0(), 0L);
            long jMax2 = Math.max(0L, j);
            if (!q0VarM.j && jMax2 != 0 && !q0VarM.g) {
                throw new g(1);
            }
            if (j2 == Long.MIN_VALUE) {
                jMax = q0VarM.l;
            } else {
                jMax = Math.max(0L, j2);
            }
            long j3 = q0VarM.l;
            if (j3 != -9223372036854775807L) {
                jMax = jMax > j3 ? j3 : jMax;
                if (jMax2 > jMax) {
                    jMax2 = jMax;
                }
            }
            this.c = jMax2;
            this.d = jMax;
            this.e = jMax != -9223372036854775807L ? jMax - jMax2 : -9223372036854775807L;
            if (q0VarM.h && (jMax == -9223372036854775807L || (j3 != -9223372036854775807L && jMax == j3))) {
                z = true;
            }
            this.f = z;
            return;
        }
        throw new g(0);
    }
}
