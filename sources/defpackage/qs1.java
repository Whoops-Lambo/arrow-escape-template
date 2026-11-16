package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import okhttp3.Headers;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
public final class qs1 {
    public final Context a;
    public final Bitmap.Config b;
    public final ng2 c;
    public final int d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final Headers h;
    public final lo2 i;
    public final zt1 j;
    public final int k;
    public final int l;
    public final int m;

    public static qs1 a(qs1 qs1Var) {
        Bitmap.Config config = Bitmap.Config.ARGB_8888;
        Context context = qs1Var.a;
        qs1Var.getClass();
        ng2 ng2Var = qs1Var.c;
        int i = qs1Var.d;
        boolean z = qs1Var.e;
        boolean z2 = qs1Var.f;
        boolean z3 = qs1Var.g;
        qs1Var.getClass();
        Headers headers = qs1Var.h;
        lo2 lo2Var = qs1Var.i;
        zt1 zt1Var = qs1Var.j;
        int i2 = qs1Var.k;
        int i3 = qs1Var.l;
        int i4 = qs1Var.m;
        qs1Var.getClass();
        return new qs1(context, config, ng2Var, i, z, z2, z3, headers, lo2Var, zt1Var, i2, i3, i4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qs1)) {
            return false;
        }
        qs1 qs1Var = (qs1) obj;
        return s71.b(this.a, qs1Var.a) && this.b == qs1Var.b && s71.b(this.c, qs1Var.c) && this.d == qs1Var.d && this.e == qs1Var.e && this.f == qs1Var.f && this.g == qs1Var.g && s71.b(this.h, qs1Var.h) && this.i.equals(qs1Var.i) && this.j.equals(qs1Var.j) && this.k == qs1Var.k && this.l == qs1Var.l && this.m == qs1Var.m;
    }

    public final int hashCode() {
        return h50.C(this.m) + ((h50.C(this.l) + ((h50.C(this.k) + pv1.g(this.j.a, pv1.g(this.i.a, (this.h.hashCode() + jc1.f(jc1.f(jc1.f((h50.C(this.d) + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 961)) * 31)) * 31, 31, this.e), 31, this.f), 961, this.g)) * 31, 31), 31)) * 31)) * 31);
    }

    public qs1(Context context, Bitmap.Config config, ng2 ng2Var, int i, boolean z, boolean z2, boolean z3, Headers headers, lo2 lo2Var, zt1 zt1Var, int i2, int i3, int i4) {
        this.a = context;
        this.b = config;
        this.c = ng2Var;
        this.d = i;
        this.e = z;
        this.f = z2;
        this.g = z3;
        this.h = headers;
        this.i = lo2Var;
        this.j = zt1Var;
        this.k = i2;
        this.l = i3;
        this.m = i4;
    }
}
