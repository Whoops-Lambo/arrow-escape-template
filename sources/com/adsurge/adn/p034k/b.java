package com.adsurge.adn.p034k;

import android.os.SystemClock;
import com.adsurge.adn.K1.c;
import com.adsurge.adn.ads.AdSurgeAdFormat;
import com.adsurge.adn.p021f1.d;
import com.adsurge.adn.p053r.a;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public class b extends a {
    @Override // com.adsurge.adn.p034k.a
    public boolean a(boolean z) {
        return z;
    }

    @Override // com.adsurge.adn.p034k.a
    public boolean b(d dVar) {
        c.b bVarA = c.a(this.c.d());
        if (bVarA == null || SystemClock.elapsedRealtime() - bVarA.c > this.e) {
            return false;
        }
        int i = bVarA.a;
        if (i == 1) {
            dVar.i = bVarA.b;
        } else if (i == 2) {
            dVar.k = bVarA.b;
        } else {
            if (i != 3) {
                return false;
            }
            dVar.j = bVarA.b;
        }
        dVar.c = 10013;
        return true;
    }

    public b(com.adsurge.adn.u1.c cVar, a aVar) {
        super(cVar, aVar);
        this.e = com.adsurge.adn.N.b.a("skacat", com.adsurge.adn.p033j1.a.a.intValue(), (AdSurgeAdFormat) null, (String) null);
    }
}
