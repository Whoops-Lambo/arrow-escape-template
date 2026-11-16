package com.ironsource;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: com.ironsource.lf, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class C4854lf implements Ob<AbstractC4747ff, C5017v> {
    @Override // com.ironsource.Ob
    @NotNull
    public C5017v a(@NotNull AbstractC4747ff abstractC4747ff) {
        String strH;
        String strI;
        String strG;
        W7 w7E;
        String str;
        String strC;
        abstractC4747ff.getClass();
        EnumC4872mf enumC4872mfB = abstractC4747ff.b();
        O oA = abstractC4747ff.a();
        if (oA == null || (strH = oA.h()) == null) {
            strH = "0";
        }
        O oA2 = abstractC4747ff.a();
        if (oA2 == null || (strI = oA2.i()) == null) {
            strI = "0";
        }
        O oA3 = abstractC4747ff.a();
        if (oA3 == null || (strG = oA3.g()) == null) {
            strG = "0";
        }
        O oA4 = abstractC4747ff.a();
        if (oA4 == null || (w7E = oA4.e()) == null) {
            w7E = W7.UnknownProvider;
        }
        O oA5 = abstractC4747ff.a();
        if (oA5 == null || (strC = oA5.c()) == null) {
            str = "0";
        } else {
            str = strC;
        }
        return new C5017v(enumC4872mfB, strH, strI, strG, w7E, str);
    }
}
