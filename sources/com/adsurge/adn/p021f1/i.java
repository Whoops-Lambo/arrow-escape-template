package com.adsurge.adn.p021f1;

import android.os.SystemClock;
import android.util.Pair;
import com.adsurge.adn.B.d;
import com.adsurge.adn.Y0.e;
import com.adsurge.adn.p024g1.b;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
class i implements j {
    @Override // com.adsurge.adn.p021f1.j
    public boolean a(f fVar, b bVar) {
        fVar.x |= 128;
        Pair pairC = o.c(fVar.o, o.c(fVar.o, d.a("on_jump_landing_page_outer", fVar.n, fVar.t)));
        if (((Boolean) pairC.first).booleanValue()) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            com.adsurge.adn.V.d dVarA = new com.adsurge.adn.V.d().a(fVar.u).a(fVar.t.N0());
            e eVar = new e(6000314);
            eVar.a(fVar.q);
            eVar.a(dVarA);
            eVar.b((int) (jElapsedRealtime - fVar.a));
            eVar.d(6);
            int i = fVar.x | 256;
            fVar.x = i;
            eVar.e(i);
            com.adsurge.adn.w1.b.a(eVar);
        } else {
            com.adsurge.adn.Y0.d dVar = new com.adsurge.adn.Y0.d();
            dVar.a("error_msg", pairC.second);
            com.adsurge.adn.w1.b.a(6000318, fVar.q, dVar);
        }
        return ((Boolean) pairC.first).booleanValue();
    }

    @Override // com.adsurge.adn.p021f1.j
    public boolean a(f fVar) {
        return fVar.h;
    }

    @Override // com.adsurge.adn.p021f1.j
    public int a() {
        return 4;
    }
}
