package defpackage;

import android.text.Layout;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class pu3 {
    public String a;
    public int b;
    public boolean c;
    public int d;
    public boolean e;
    public float k;
    public String l;
    public Layout.Alignment o;
    public Layout.Alignment p;
    public mu3 r;
    public String t;
    public String u;
    public String v;
    public int f = -1;
    public int g = -1;
    public int h = -1;
    public int i = -1;
    public int j = -1;
    public int m = -1;
    public int n = -1;
    public int q = -1;
    public float s = Float.MAX_VALUE;

    public final String a() {
        return this.t;
    }

    public final String b() {
        return this.u;
    }

    public final String c() {
        return this.v;
    }

    public final void d(pu3 pu3Var) {
        int i;
        Layout.Alignment alignment;
        Layout.Alignment alignment2;
        String str;
        if (pu3Var != null) {
            if (!this.c && pu3Var.c) {
                this.b = pu3Var.b;
                this.c = true;
            }
            if (this.h == -1) {
                this.h = pu3Var.h;
            }
            if (this.i == -1) {
                this.i = pu3Var.i;
            }
            if (this.a == null && (str = pu3Var.a) != null) {
                this.a = str;
            }
            if (this.f == -1) {
                this.f = pu3Var.f;
            }
            if (this.g == -1) {
                this.g = pu3Var.g;
            }
            if (this.n == -1) {
                this.n = pu3Var.n;
            }
            if (this.o == null && (alignment2 = pu3Var.o) != null) {
                this.o = alignment2;
            }
            if (this.p == null && (alignment = pu3Var.p) != null) {
                this.p = alignment;
            }
            if (this.q == -1) {
                this.q = pu3Var.q;
            }
            if (this.j == -1) {
                this.j = pu3Var.j;
                this.k = pu3Var.k;
            }
            if (this.r == null) {
                this.r = pu3Var.r;
            }
            if (this.s == Float.MAX_VALUE) {
                this.s = pu3Var.s;
            }
            if (this.t == null) {
                this.t = pu3Var.t;
            }
            if (this.u == null) {
                this.u = pu3Var.u;
            }
            if (this.v == null) {
                this.v = pu3Var.v;
            }
            if (!this.e && pu3Var.e) {
                this.d = pu3Var.d;
                this.e = true;
            }
            if (this.m != -1 || (i = pu3Var.m) == -1) {
                return;
            }
            this.m = i;
        }
    }

    public final String e() {
        return this.l;
    }
}
