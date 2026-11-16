package io.p071bidmachine.media3.common;

import com.explorestack.protobuf.z;
import defpackage.d31;
import defpackage.i31;
import defpackage.jc1;
import defpackage.q31;
import defpackage.qb5;
import io.p071bidmachine.media3.common.util.x;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public class w0 {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final boolean g;
    public final boolean h;
    public final d31 i;
    public final d31 j;
    public final d31 k;
    public final int l;
    public final int m;
    public final d31 n;
    public final u0 o;
    public final d31 p;
    public final boolean q;
    public final int r;
    public final i31 s;
    public final q31 t;

    static {
        new w0(new v0());
        x.G(1);
        x.G(2);
        x.G(3);
        x.G(4);
        z.p(5, 6, 7, 8, 9);
        z.p(10, 11, 12, 13, 14);
        z.p(15, 16, 17, 18, 19);
        z.p(20, 21, 22, 23, 24);
        z.p(25, 26, 27, 28, 29);
        z.p(30, 31, 32, 33, 34);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        w0 w0Var = (w0) obj;
        if (this.a != w0Var.a || this.b != w0Var.b || this.c != w0Var.c || this.d != w0Var.d || this.h != w0Var.h || this.e != w0Var.e || this.f != w0Var.f || this.g != w0Var.g || !this.i.equals(w0Var.i) || !this.j.equals(w0Var.j) || !this.k.equals(w0Var.k) || this.l != w0Var.l || this.m != w0Var.m || !this.n.equals(w0Var.n) || !this.o.equals(w0Var.o) || !this.p.equals(w0Var.p) || this.q != w0Var.q || this.r != w0Var.r) {
            return false;
        }
        i31 i31Var = w0Var.s;
        i31 i31Var2 = this.s;
        i31Var2.getClass();
        return qb5.e(i31Var, i31Var2) && this.t.equals(w0Var.t);
    }

    public int hashCode() {
        int iG = jc1.g(this.n, (((jc1.g(this.k, jc1.g(this.j, jc1.g(this.i, (((((((((((((((this.a + 31) * 31) + this.b) * 31) + this.c) * 31) + this.d) * 28629151) + (this.h ? 1 : 0)) * 31) + this.e) * 31) + this.f) * 31) + (this.g ? 1 : 0)) * 31, 31), 961), 961) + this.l) * 31) + this.m) * 31, 31);
        this.o.getClass();
        return this.t.hashCode() + ((this.s.hashCode() + ((((jc1.g(this.p, (iG + 29791) * 31, 961) + (this.q ? 1 : 0)) * 31) + this.r) * 28629151)) * 31);
    }

    public w0(v0 v0Var) {
        this.a = v0Var.a;
        this.b = v0Var.b;
        this.c = v0Var.c;
        this.d = v0Var.d;
        this.e = v0Var.e;
        this.f = v0Var.f;
        this.g = v0Var.g;
        this.h = v0Var.h;
        this.i = v0Var.i;
        this.j = v0Var.j;
        this.k = v0Var.k;
        this.l = v0Var.l;
        this.m = v0Var.m;
        this.n = v0Var.n;
        this.o = v0Var.o;
        this.p = v0Var.p;
        this.q = v0Var.q;
        this.r = v0Var.r;
        this.s = i31.f(v0Var.s);
        this.t = q31.y(v0Var.t);
    }
}
