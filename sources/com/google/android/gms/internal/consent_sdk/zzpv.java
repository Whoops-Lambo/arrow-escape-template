package com.google.android.gms.internal.consent_sdk;

import defpackage.do4;
import defpackage.i85;
import defpackage.nj;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class zzpv extends zzpe {
    public static final Logger b = Logger.getLogger(zzpv.class.getName());
    public static final boolean c = i85.e;
    public do4 a;

    private zzpv() {
        throw null;
    }

    public abstract void f(byte b2);

    public abstract void g(int i, boolean z);

    public abstract void h(int i, byte[] bArr);

    public abstract void i(int i, zzpm zzpmVar);

    public abstract void j(zzpm zzpmVar);

    public abstract void k(int i, int i2);

    public abstract void l(int i);

    public abstract void m(int i, long j);

    public abstract void n(long j);

    public abstract void o(int i, int i2);

    public abstract void p(int i);

    public abstract void q(zzrq zzrqVar);

    public abstract void r(int i, zzrq zzrqVar);

    public abstract void s(int i, zzpm zzpmVar);

    public abstract void t(int i, String str);

    public abstract void u(String str);

    public abstract void v(int i, int i2);

    public abstract void w(int i, int i2);

    public abstract void x(int i);

    public abstract void y(int i, long j);

    public abstract void z(long j);

    public static int c(int i) {
        return nj.e(i, 9, 352) >>> 6;
    }

    public static int d(long j) {
        return nj.g(9, 640, j) >>> 6;
    }

    public final void e(String str, i iVar) throws zzps {
        b.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) iVar);
        byte[] bytes = str.getBytes(zzqs.a);
        try {
            int length = bytes.length;
            x(length);
            a(length, bytes);
        } catch (IndexOutOfBoundsException e) {
            throw new zzps(e);
        }
    }

    public static int b(String str) {
        int length;
        try {
            length = j.b(str);
        } catch (i unused) {
            length = str.getBytes(zzqs.a).length;
        }
        return c(length) + length;
    }
}
