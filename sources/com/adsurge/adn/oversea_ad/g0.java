package com.adsurge.adn.oversea_ad;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public final class g0 {
    public static final g0 a = new g0();

    public static k0 a(int i, byte[] bArr, int i2, int i3, b0 b0Var) {
        r0 r0VarA;
        i iVar = (i) i.c.b();
        synchronized (iVar) {
            r0VarA = iVar.a(i2, i3, i, bArr, b0Var);
        }
        int i4 = r0VarA.a;
        if (i4 == 0) {
            return new k0(0, r0VarA.d, 0, 0);
        }
        return new k0(i4 - 40000, k0.e, r0VarA.b, r0VarA.c);
    }
}
