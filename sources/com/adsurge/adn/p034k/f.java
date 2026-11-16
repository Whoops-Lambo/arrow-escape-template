package com.adsurge.adn.p034k;

import android.os.SystemClock;
import com.adsurge.adn.K1.c;
import com.adsurge.adn.N.b;
import com.adsurge.adn.ads.AdSurgeAdFormat;
import com.adsurge.adn.p021f1.d;
import com.adsurge.adn.p053r.a;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public class f extends a {
    public static final boolean f;

    static {
        f = b.a("odcpcgis", 0, (AdSurgeAdFormat) null, (String) null) == 1;
    }

    @Override // com.adsurge.adn.p034k.a
    public boolean a(boolean z) {
        return z || !f;
    }

    @Override // com.adsurge.adn.p034k.a
    public boolean b(d dVar) {
        c.b bVarA = c.a(this.c.d());
        if (bVarA == null || SystemClock.elapsedRealtime() - bVarA.c > this.e) {
            return false;
        }
        if (this.c.S0()) {
            dVar.c = 10013;
        } else if (this.c.a0().v()) {
            dVar.c = 2005;
        }
        int i = dVar.c;
        return true;
    }

    public f(com.adsurge.adn.u1.c cVar, a aVar) {
        super(cVar, aVar);
        this.e = b.a("odcpcmad", 300, (AdSurgeAdFormat) null, (String) null);
    }
}
