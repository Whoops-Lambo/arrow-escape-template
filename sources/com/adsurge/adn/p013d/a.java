package com.adsurge.adn.p013d;

import com.adsurge.adn.p007b.c;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class a implements e {
    public final d a = new b();

    public abstract c a();

    public abstract c b(int i);

    @Override // com.adsurge.adn.p013d.e
    public String a(int i) {
        c cVarB = b(i);
        cVarB.toString();
        c cVarA = a();
        cVarA.toString();
        c cVarA2 = a(cVarB, cVarA);
        if (cVarA2 != null) {
            cVarA2.toString();
        }
        return a(cVarA2, i);
    }

    public final c a(c cVar, c cVar2) {
        d dVar = this.a;
        if (dVar != null) {
            return dVar.a(cVar, cVar2, String.valueOf(-999));
        }
        return null;
    }

    public final String a(c cVar, int i) {
        d dVar = this.a;
        if (dVar != null && cVar != null) {
            return dVar.a(cVar, i);
        }
        return "";
    }
}
