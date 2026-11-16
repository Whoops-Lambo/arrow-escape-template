package com.adsurge.adn.p049p;

import com.adsurge.adn.p036k1.h;
import com.adsurge.adn.p036k1.q;
import com.adsurge.adn.u1.c;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public class e implements g {
    public final q a;

    @Override // com.adsurge.adn.p049p.g
    public void a(g.b bVar, boolean z) {
        if (bVar != g.b.FRONT_CARD_WITH_TIP) {
            b();
        } else if (z) {
            c();
        } else {
            b();
        }
    }

    public void b() {
        a(this.a, new h().a("clickRewardCloseVis", 2));
    }

    public void c() {
        a(this.a, new h().a("clickRewardCloseVis", 0));
    }

    public e(q qVar, c cVar) {
        this.a = qVar;
    }

    @Override // com.adsurge.adn.p049p.g
    public void a() {
    }
}
