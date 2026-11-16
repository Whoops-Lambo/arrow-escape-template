package com.google.android.gms.internal.measurement;

import defpackage.e32;
import defpackage.mp3;
import defpackage.nj;
import defpackage.w13;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public abstract class zzada extends zzacj {
    public static final boolean b = mp3.d;
    public w13 a;

    private zzada() {
        throw null;
    }

    public abstract int A();

    public abstract void f(int i, int i2);

    public abstract void g(int i, int i2);

    public abstract void h(int i, int i2);

    public abstract void i(int i, int i2);

    public abstract void j(int i, long j);

    public abstract void k(int i, long j);

    public abstract void l(int i, boolean z);

    public abstract void m(int i, String str);

    public abstract void n(int i, zzacr zzacrVar);

    public abstract void o(zzacr zzacrVar);

    public abstract void p(int i, byte[] bArr);

    public abstract void q(int i, zzafc zzafcVar);

    public abstract void r(int i, zzacr zzacrVar);

    public abstract void s(zzafc zzafcVar);

    public abstract void t(byte b2);

    public abstract void u(int i);

    public abstract void v(int i);

    public abstract void w(int i);

    public abstract void x(long j);

    public abstract void y(long j);

    public abstract void z(String str);

    public static int b(int i) {
        return nj.e(i, 9, 352) >>> 6;
    }

    public static int c(long j) {
        return nj.g(9, 640, j) >>> 6;
    }

    public static int d(zzafc zzafcVar) {
        int i = zzafcVar.i();
        return b(i) + i;
    }

    public final void e() {
        if (A() <= 0) {
            if (A() >= 0) {
                return;
            }
            e32.i("Wrote more data than expected.");
            return;
        }
        e32.i("Did not write as much data as expected.");
    }
}
