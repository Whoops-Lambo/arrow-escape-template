package defpackage;

import android.text.Layout;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class bs2 {
    public String a;
    public int b;
    public boolean c;
    public int d;
    public boolean e;
    public float k;
    public String l;
    public Layout.Alignment o;
    public Layout.Alignment p;
    public cp2 r;
    public int f = -1;
    public int g = -1;
    public int h = -1;
    public int i = -1;
    public int j = -1;
    public int m = -1;
    public int n = -1;
    public int q = -1;
    public float s = Float.MAX_VALUE;

    public final void a(bs2 bs2Var) {
        int i;
        Layout.Alignment alignment;
        Layout.Alignment alignment2;
        String str;
        if (bs2Var != null) {
            if (!this.c && bs2Var.c) {
                this.b = bs2Var.b;
                this.c = true;
            }
            if (this.h == -1) {
                this.h = bs2Var.h;
            }
            if (this.i == -1) {
                this.i = bs2Var.i;
            }
            if (this.a == null && (str = bs2Var.a) != null) {
                this.a = str;
            }
            if (this.f == -1) {
                this.f = bs2Var.f;
            }
            if (this.g == -1) {
                this.g = bs2Var.g;
            }
            if (this.n == -1) {
                this.n = bs2Var.n;
            }
            if (this.o == null && (alignment2 = bs2Var.o) != null) {
                this.o = alignment2;
            }
            if (this.p == null && (alignment = bs2Var.p) != null) {
                this.p = alignment;
            }
            if (this.q == -1) {
                this.q = bs2Var.q;
            }
            if (this.j == -1) {
                this.j = bs2Var.j;
                this.k = bs2Var.k;
            }
            if (this.r == null) {
                this.r = bs2Var.r;
            }
            if (this.s == Float.MAX_VALUE) {
                this.s = bs2Var.s;
            }
            if (!this.e && bs2Var.e) {
                this.d = bs2Var.d;
                this.e = true;
            }
            if (this.m != -1 || (i = bs2Var.m) == -1) {
                return;
            }
            this.m = i;
        }
    }
}
