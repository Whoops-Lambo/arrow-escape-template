package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import androidx.lifecycle.Lifecycle;
import java.util.List;
import okhttp3.Headers;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class l21 {
    public final Context a;
    public final Object b;
    public final mo2 c;
    public final Bitmap.Config d;
    public final List e;
    public final er1 f;
    public final Headers g;
    public final lo2 h;
    public final boolean i;
    public final boolean j;
    public final boolean k;
    public final boolean l;
    public final uy m;
    public final uy n;
    public final uy o;
    public final uy p;
    public final Lifecycle q;
    public final og2 r;
    public final zt1 s;
    public final za0 t;
    public final x90 u;
    public final int v;
    public final int w;
    public final int x;
    public final int y;
    public final int z;

    public l21(Context context, Object obj, mo2 mo2Var, Bitmap.Config config, int i, List list, er1 er1Var, Headers headers, lo2 lo2Var, boolean z, boolean z2, boolean z3, boolean z4, int i2, int i3, int i4, uy uyVar, uy uyVar2, uy uyVar3, uy uyVar4, Lifecycle lifecycle, og2 og2Var, int i5, zt1 zt1Var, za0 za0Var, x90 x90Var) {
        this.a = context;
        this.b = obj;
        this.c = mo2Var;
        this.d = config;
        this.v = i;
        this.e = list;
        this.f = er1Var;
        this.g = headers;
        this.h = lo2Var;
        this.i = z;
        this.j = z2;
        this.k = z3;
        this.l = z4;
        this.w = i2;
        this.x = i3;
        this.y = i4;
        this.m = uyVar;
        this.n = uyVar2;
        this.o = uyVar3;
        this.p = uyVar4;
        this.q = lifecycle;
        this.r = og2Var;
        this.z = i5;
        this.s = zt1Var;
        this.t = za0Var;
        this.u = x90Var;
    }

    public static k21 a(l21 l21Var) {
        Context context = l21Var.a;
        l21Var.getClass();
        return new k21(l21Var, context);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l21)) {
            return false;
        }
        l21 l21Var = (l21) obj;
        return s71.b(this.a, l21Var.a) && this.b.equals(l21Var.b) && s71.b(this.c, l21Var.c) && this.d == l21Var.d && this.v == l21Var.v && s71.b(this.e, l21Var.e) && s71.b(this.f, l21Var.f) && s71.b(this.g, l21Var.g) && this.h.equals(l21Var.h) && this.i == l21Var.i && this.j == l21Var.j && this.k == l21Var.k && this.l == l21Var.l && this.w == l21Var.w && this.x == l21Var.x && this.y == l21Var.y && s71.b(this.m, l21Var.m) && s71.b(this.n, l21Var.n) && s71.b(this.o, l21Var.o) && s71.b(this.p, l21Var.p) && s71.b(this.q, l21Var.q) && this.r.equals(l21Var.r) && this.z == l21Var.z && this.s.equals(l21Var.s) && this.t.equals(l21Var.t) && s71.b(this.u, l21Var.u);
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        mo2 mo2Var = this.c;
        int iE = pv1.e((h50.C(this.v) + ((this.d.hashCode() + ((iHashCode + (mo2Var != null ? mo2Var.hashCode() : 0)) * 923521)) * 961)) * 29791, 31, this.e);
        this.f.getClass();
        return this.u.hashCode() + ((this.t.hashCode() + pv1.g(this.s.a, (h50.C(this.z) + ((this.r.hashCode() + ((this.q.hashCode() + ((this.p.hashCode() + ((this.o.hashCode() + ((this.n.hashCode() + ((this.m.hashCode() + ((h50.C(this.y) + ((h50.C(this.x) + ((h50.C(this.w) + jc1.f(jc1.f(jc1.f(jc1.f(pv1.g(this.h.a, (this.g.hashCode() + ((er1.class.hashCode() + iE) * 31)) * 31, 31), 31, this.i), 31, this.j), 31, this.k), 31, this.l)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31, -1807454463)) * 31);
    }
}
