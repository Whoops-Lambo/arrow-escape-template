package io.p071bidmachine.media3.exoplayer;

import android.os.SystemClock;
import defpackage.y32;
import io.p071bidmachine.media3.common.i0;
import io.p071bidmachine.media3.common.o0;
import io.p071bidmachine.media3.common.r0;
import io.p071bidmachine.media3.common.util.x;
import io.p071bidmachine.media3.exoplayer.source.d0;
import io.p071bidmachine.media3.exoplayer.source.i1;
import io.p071bidmachine.media3.exoplayer.trackselection.t;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class u0 {
    public static final d0 u = new d0(new Object());
    public final r0 a;
    public final d0 b;
    public final long c;
    public final long d;
    public final int e;
    public final m f;
    public final boolean g;
    public final i1 h;
    public final t i;
    public final List j;
    public final d0 k;
    public final boolean l;
    public final int m;
    public final int n;
    public final i0 o;
    public final boolean p;
    public volatile long q;
    public volatile long r;
    public volatile long s;
    public volatile long t;

    public u0(r0 r0Var, d0 d0Var, long j, long j2, int i, m mVar, boolean z, i1 i1Var, t tVar, List list, d0 d0Var2, boolean z2, int i2, int i3, i0 i0Var, long j3, long j4, long j5, long j6, boolean z3) {
        this.a = r0Var;
        this.b = d0Var;
        this.c = j;
        this.d = j2;
        this.e = i;
        this.f = mVar;
        this.g = z;
        this.h = i1Var;
        this.i = tVar;
        this.j = list;
        this.k = d0Var2;
        this.l = z2;
        this.m = i2;
        this.n = i3;
        this.o = i0Var;
        this.q = j3;
        this.r = j4;
        this.s = j5;
        this.t = j6;
        this.p = z3;
    }

    public static u0 j(t tVar) {
        o0 o0Var = r0.a;
        i1 i1Var = i1.d;
        y32 y32Var = y32.e;
        i0 i0Var = i0.d;
        d0 d0Var = u;
        return new u0(o0Var, d0Var, -9223372036854775807L, 0L, 1, null, false, i1Var, tVar, y32Var, d0Var, false, 1, 0, i0Var, 0L, 0L, 0L, 0L, false);
    }

    public final u0 a() {
        return new u0(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.q, this.r, k(), SystemClock.elapsedRealtime(), this.p);
    }

    public final u0 b(boolean z) {
        return new u0(this.a, this.b, this.c, this.d, this.e, this.f, z, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.q, this.r, this.s, this.t, this.p);
    }

    public final u0 c(d0 d0Var) {
        return new u0(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, d0Var, this.l, this.m, this.n, this.o, this.q, this.r, this.s, this.t, this.p);
    }

    public final u0 d(d0 d0Var, long j, long j2, long j3, long j4, i1 i1Var, t tVar, List list) {
        return new u0(this.a, d0Var, j2, j3, this.e, this.f, this.g, i1Var, tVar, list, this.k, this.l, this.m, this.n, this.o, this.q, j4, j, SystemClock.elapsedRealtime(), this.p);
    }

    public final u0 e(int i, int i2, boolean z) {
        return new u0(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, z, i, i2, this.o, this.q, this.r, this.s, this.t, this.p);
    }

    public final u0 f(m mVar) {
        return new u0(this.a, this.b, this.c, this.d, this.e, mVar, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.q, this.r, this.s, this.t, this.p);
    }

    public final u0 g(i0 i0Var) {
        return new u0(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, i0Var, this.q, this.r, this.s, this.t, this.p);
    }

    public final u0 h(int i) {
        return new u0(this.a, this.b, this.c, this.d, i, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.q, this.r, this.s, this.t, this.p);
    }

    public final u0 i(r0 r0Var) {
        return new u0(r0Var, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.q, this.r, this.s, this.t, this.p);
    }

    public final boolean l() {
        return this.e == 3 && this.l && this.n == 0;
    }

    public final long k() {
        long j;
        long j2;
        if (!l()) {
            return this.s;
        }
        do {
            j = this.t;
            j2 = this.s;
        } while (j != this.t);
        return x.L(x.X(j2) + ((long) ((SystemClock.elapsedRealtime() - j) * this.o.a)));
    }
}
