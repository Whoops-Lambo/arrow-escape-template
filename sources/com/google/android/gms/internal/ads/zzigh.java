package com.google.android.gms.internal.ads;

import defpackage.do4;
import defpackage.e32;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public abstract class zzigh extends zzifo {
    public do4 a;

    private zzigh() {
        throw null;
    }

    public abstract void c(int i, int i2);

    public abstract void d(int i, int i2);

    public abstract void e(int i, int i2);

    public abstract void f(int i, int i2);

    public abstract void g(int i, long j);

    public abstract void h(int i, long j);

    public abstract void i(int i, boolean z);

    public abstract void j(int i, String str);

    public abstract void k(int i, zzifx zzifxVar);

    public abstract void l(zzifx zzifxVar);

    public abstract void m(int i, byte[] bArr);

    public abstract void n(int i, zziii zziiiVar);

    public abstract void o(int i, zzifx zzifxVar);

    public abstract void p(zziii zziiiVar);

    public abstract void q(byte b);

    public abstract void r(int i);

    public abstract void s(int i);

    public abstract void t(int i);

    public abstract void u(long j);

    public abstract void v(long j);

    public abstract void w(String str);

    public abstract int x();

    public final void b() {
        if (x() <= 0) {
            if (x() >= 0) {
                return;
            }
            e32.i("Wrote more data than expected.");
            return;
        }
        e32.i("Did not write as much data as expected.");
    }
}
