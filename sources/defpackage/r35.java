package defpackage;

import com.google.android.gms.internal.ads.w;
import com.google.android.gms.internal.ads.zzabs;
import com.google.android.gms.internal.ads.zzav;
import com.google.android.gms.internal.ads.zzbf;
import com.google.android.gms.internal.ads.zzfq;
import com.google.android.gms.internal.ads.zzjr;
import com.google.android.gms.internal.ads.zzxt;
import com.google.android.gms.internal.ads.zzzx;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class r35 {
    public static final zzxt v = new zzxt(new Object(), -1);
    public final zzbf a;
    public final zzxt b;
    public final long c;
    public final long d;
    public final int e;
    public final zzjr f;
    public final boolean g;
    public final zzzx h;
    public final zzabs i;
    public final List j;
    public final zzxt k;
    public final boolean l;
    public final int m;
    public final int n;
    public final zzav o;
    public final boolean p;
    public volatile long q;
    public volatile long r;
    public volatile long s;
    public volatile long t;
    public volatile long u = 0;

    public r35(zzbf zzbfVar, zzxt zzxtVar, long j, long j2, int i, zzjr zzjrVar, boolean z, zzzx zzzxVar, zzabs zzabsVar, List list, zzxt zzxtVar2, boolean z2, int i2, int i3, zzav zzavVar, long j3, long j4, long j5, long j6, boolean z3) {
        this.a = zzbfVar;
        this.b = zzxtVar;
        this.c = j;
        this.d = j2;
        this.e = i;
        this.f = zzjrVar;
        this.g = z;
        this.h = zzzxVar;
        this.i = zzabsVar;
        this.j = list;
        this.k = zzxtVar2;
        this.l = z2;
        this.m = i2;
        this.n = i3;
        this.o = zzavVar;
        this.q = j3;
        this.r = j4;
        this.s = j5;
        this.t = j6;
        this.p = z3;
    }

    public static r35 a(zzabs zzabsVar) {
        rx3 rx3Var = zzbf.a;
        zzzx zzzxVar = zzzx.d;
        w wVar = w.e;
        zzav zzavVar = zzav.d;
        zzxt zzxtVar = v;
        return new r35(rx3Var, zzxtVar, -9223372036854775807L, 0L, 1, null, false, zzzxVar, zzabsVar, wVar, zzxtVar, false, 1, 0, zzavVar, 0L, 0L, 0L, 0L, false);
    }

    public final r35 b(zzxt zzxtVar, long j, long j2, long j3, long j4, long j5, zzzx zzzxVar, zzabs zzabsVar, List list) {
        boolean z = this.p;
        zzxt zzxtVar2 = this.k;
        boolean z2 = this.l;
        int i = this.m;
        int i2 = this.n;
        zzav zzavVar = this.o;
        long j6 = this.q;
        return new r35(this.a, zzxtVar, j2, j3, this.e, this.f, this.g, zzzxVar, zzabsVar, list, zzxtVar2, z2, i, i2, zzavVar, j6, j4, j, j5, z);
    }

    public final r35 c(zzbf zzbfVar) {
        return new r35(zzbfVar, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.q, this.r, this.s, this.t, this.p);
    }

    public final r35 d(int i) {
        boolean z = this.p;
        return new r35(this.a, this.b, this.c, this.d, i, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.q, this.r, this.s, this.t, z);
    }

    public final r35 e(zzjr zzjrVar) {
        boolean z = this.p;
        return new r35(this.a, this.b, this.c, this.d, this.e, zzjrVar, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.q, this.r, this.s, this.t, z);
    }

    public final r35 f(boolean z) {
        boolean z2 = this.p;
        return new r35(this.a, this.b, this.c, this.d, this.e, this.f, z, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.q, this.r, this.s, this.t, z2);
    }

    public final r35 g(zzxt zzxtVar) {
        boolean z = this.p;
        return new r35(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, zzxtVar, this.l, this.m, this.n, this.o, this.q, this.r, this.s, this.t, z);
    }

    public final r35 h(int i, int i2, boolean z) {
        boolean z2 = this.p;
        return new r35(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, z, i, i2, this.o, this.q, this.r, this.s, this.t, z2);
    }

    public final r35 i(long j) {
        return new r35(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.q, this.r, j(j), j, this.p);
    }

    public final boolean k() {
        return this.e == 3 && this.l && this.n == 0;
    }

    public final long j(long j) {
        if (!k()) {
            return this.s;
        }
        while (true) {
            long j2 = this.u;
            long j3 = this.s;
            long j4 = this.t;
            if (j2 % 2 == 0 && j2 == this.u) {
                return zzfq.u(zzfq.t(j3) + ((long) (Math.min(j - j4, 1500L) * this.o.a)));
            }
        }
    }
}
