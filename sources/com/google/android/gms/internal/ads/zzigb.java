package com.google.android.gms.internal.ads;

import defpackage.jy4;
import defpackage.ky4;
import defpackage.lh;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public abstract class zzigb {
    public int a;
    public int b;
    public lh c;

    public abstract int A();

    public abstract long B();

    public abstract int C();

    public abstract int a(int i);

    public abstract void b(int i);

    public abstract int c();

    public abstract boolean d();

    public abstract int e();

    public abstract int i();

    public abstract void j(int i);

    public abstract boolean k(int i);

    public abstract double l();

    public abstract float m();

    public abstract long n();

    public abstract long o();

    public abstract int p();

    public abstract long q();

    public abstract int r();

    public abstract boolean s();

    public abstract String t();

    public abstract String u();

    public abstract jy4 v();

    public abstract int w();

    public abstract int x();

    public abstract int y();

    public abstract long z();

    public static ky4 f(int i, int i2, byte[] bArr) {
        ky4 ky4Var = new ky4(bArr, i, i2);
        try {
            ky4Var.a(i2);
            return ky4Var;
        } catch (zzihu e) {
            defpackage.d.n(e);
            return null;
        }
    }

    public final void g() {
        if (this.a + this.b < 100) {
            return;
        }
        io.p071bidmachine.media3.extractor.ts.y.v("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
    }

    private zzigb() {
    }

    public final void h() {
        boolean zK;
        do {
            int i = i();
            if (i != 0) {
                g();
                this.b++;
                zK = k(i);
                this.b--;
            } else {
                return;
            }
        } while (zK);
    }
}
