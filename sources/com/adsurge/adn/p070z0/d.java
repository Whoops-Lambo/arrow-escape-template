package com.adsurge.adn.p070z0;

import android.util.Pair;
import com.adsurge.adn.p038l0.i;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public class d extends com.adsurge.adn.p050p0.d {
    @Override // com.adsurge.adn.p050p0.d
    public Pair a(com.adsurge.adn.p060u0.d dVar, int i, int i2) {
        return new Pair(Integer.valueOf(i), Integer.valueOf(i2));
    }

    @Override // com.adsurge.adn.p050p0.d
    public void g() {
        com.adsurge.adn.p060u0.d dVarY = this.a.y();
        if (dVarY.e()) {
            int iN = dVarY.n();
            if (iN > 0) {
                ((c) this.b).setMaxWidth(iN);
            }
            int iC = dVarY.c();
            if (iC > 0) {
                ((c) this.b).setMinWidth(iC);
            }
            int iB = dVarY.b();
            if (iB > 0) {
                ((c) this.b).setMinHeight(iB);
            }
            int iH = dVarY.h();
            if (iH > 0) {
                ((c) this.b).setMaxHeight(iH);
            }
        }
        super.g();
    }

    public d(i iVar, c cVar) {
        super(iVar, cVar);
    }

    @Override // com.adsurge.adn.p050p0.d
    public Pair a(int i, int i2, Pair pair, int i3, int i4, com.adsurge.adn.p060u0.d dVar) {
        return pair;
    }
}
