package com.adsurge.adn.p043n;

import com.adsurge.adn.N.b;
import com.adsurge.adn.lib.callback.EndCardShownCallback;
import com.adsurge.adn.p018e1.d;
import com.adsurge.adn.p018e1.f;
import com.adsurge.adn.u1.c;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public class e extends com.adsurge.adn.p043n.a {

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class a extends d {
        public a(f fVar) {
            super(fVar);
        }

        @Override // com.adsurge.adn.p018e1.d
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void b(Void r1) {
            String unused = e.this.d;
            e.this.z();
        }
    }

    @Override // com.adsurge.adn.p043n.a
    public int w() {
        return 4;
    }

    @Override // com.adsurge.adn.p043n.a
    public long v() {
        return b.a("odceed", 500, this.i);
    }

    public e(c cVar, int i, com.adsurge.adn.p037l.e eVar) {
        super(cVar, i, eVar);
        ((EndCardShownCallback) com.adsurge.adn.p018e1.a.b(cVar.d(), EndCardShownCallback.class)).onEndCardShown().a((d) new a(this));
    }

    @Override // com.adsurge.adn.p043n.a, com.adsurge.adn.p031j.d
    public void p() {
        super.p();
        com.adsurge.adn.p018e1.a.c(this.i.d(), EndCardShownCallback.class);
    }
}
