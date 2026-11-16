package com.adsurge.adn.p034k;

import android.graphics.PointF;
import com.adsurge.adn.Y0.e;
import com.adsurge.adn.p021f1.d;
import com.adsurge.adn.p021f1.f;
import com.adsurge.adn.p053r.a;
import com.adsurge.adn.w1.b;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public class c extends com.adsurge.adn.p024g1.c implements e {
    public final com.adsurge.adn.u1.c b;
    public final a c;

    @Override // com.adsurge.adn.p034k.e
    public void destroy() {
    }

    @Override // com.adsurge.adn.p034k.e
    public e a(d dVar, com.adsurge.adn.p044n0.c cVar, long j) {
        com.adsurge.adn.V.d dVarA = new com.adsurge.adn.V.d().a(dVar.c).a(this.c.getHeight(), this.c.getWidth()).a(j).a(cVar).a(this.b.N0());
        PointF downPoint = this.c.getDownPoint();
        if (downPoint != null) {
            dVarA.a(downPoint.x, downPoint.y);
        }
        PointF currentPoint = this.c.getCurrentPoint();
        if (currentPoint != null) {
            dVarA.b(currentPoint.x, currentPoint.y);
        }
        e eVar = new e(6000300);
        eVar.a(com.adsurge.adn.Y0.c.a(this.b));
        eVar.a(dVarA);
        return eVar;
    }

    public c(com.adsurge.adn.u1.c cVar, a aVar) {
        super(aVar.getContext());
        this.b = cVar;
        this.c = aVar;
    }

    @Override // com.adsurge.adn.p034k.e
    public void b(d dVar, com.adsurge.adn.p044n0.c cVar, long j) {
        e eVarA = a(dVar, cVar, j);
        a(dVar);
        a(dVar, eVarA, System.currentTimeMillis());
    }

    @Override // com.adsurge.adn.p034k.e
    public void a(d dVar, e eVar, long j) {
        dVar.b();
        if (dVar.b()) {
            eVar.d(1);
        }
        b.a(eVar);
        com.adsurge.adn.p021f1.e.a(new f.a(this.b).a(dVar).a(), this);
    }

    @Override // com.adsurge.adn.p034k.e
    public void a(d dVar) {
        com.adsurge.adn.p007b.a aVarD = com.adsurge.adn.p007b.a.d();
        com.adsurge.adn.p010c.a aVarD2 = aVarD.d(this.c);
        if (aVarD2 != null) {
            aVarD2.a(dVar);
        }
        dVar.b = aVarD.a(this.c);
    }
}
