package com.adsurge.adn.p031j;

import com.adsurge.adn.N.b;
import com.adsurge.adn.p037l.e;
import com.adsurge.adn.p053r.d;
import com.adsurge.adn.u1.c;
import com.adsurge.adn.x1.u;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public class a extends d {
    public final int d;
    public d.C0136d e;

    public a(c cVar, e eVar, d.C0136d c0136d) {
        super(eVar);
        this.d = b.a("bmvira", 50, cVar);
        this.e = c0136d;
    }

    @Override // com.adsurge.adn.X.B.a
    public boolean a(long j) {
        boolean zA = u.a(q(), this.d, true);
        d.C0136d c0136d = this.e;
        if (!zA) {
            c0136d.a();
            return false;
        }
        c0136d.b();
        return false;
    }

    @Override // com.adsurge.adn.p031j.d
    public void p() {
        super.p();
        this.e = null;
    }
}
