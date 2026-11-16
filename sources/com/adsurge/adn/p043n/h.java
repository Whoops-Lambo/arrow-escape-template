package com.adsurge.adn.p043n;

import com.adsurge.adn.C1.c;
import com.adsurge.adn.N.b;
import com.adsurge.adn.lib.callback.EndCardShownCallback;
import com.adsurge.adn.p018e1.d;
import com.adsurge.adn.p018e1.f;
import com.adsurge.adn.p037l.e;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public class h extends com.adsurge.adn.p043n.a implements c {

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class a extends d {
        public a(f fVar) {
            super(fVar);
        }

        @Override // com.adsurge.adn.p018e1.d
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void b(Void r1) {
            h.this.e("end card shown");
        }
    }

    @Override // com.adsurge.adn.C1.c
    public void b() {
    }

    @Override // com.adsurge.adn.C1.c
    public void d() {
    }

    @Override // com.adsurge.adn.C1.c
    public void f() {
    }

    @Override // com.adsurge.adn.C1.c
    public void g() {
    }

    @Override // com.adsurge.adn.C1.c
    public void j() {
    }

    @Override // com.adsurge.adn.C1.c
    public void l() {
    }

    @Override // com.adsurge.adn.C1.c
    public void o() {
    }

    @Override // com.adsurge.adn.C1.c
    public void onVideoPause() {
    }

    @Override // com.adsurge.adn.p043n.a
    public int w() {
        return 2;
    }

    @Override // com.adsurge.adn.C1.c
    public void a(int i, Exception exc) {
        e("onVideoError");
    }

    @Override // com.adsurge.adn.p043n.a
    public long v() {
        return b.a("odcmed", 500, this.i);
    }

    public h(com.adsurge.adn.u1.c cVar, int i, e eVar) {
        super(cVar, i, eVar);
        ((EndCardShownCallback) com.adsurge.adn.p018e1.a.b(cVar.d(), EndCardShownCallback.class)).onEndCardShown().a((d) new a(this));
    }

    @Override // com.adsurge.adn.C1.c
    public void h() {
        z();
    }

    @Override // com.adsurge.adn.p043n.a, com.adsurge.adn.p031j.d
    public void p() {
        super.p();
        com.adsurge.adn.p018e1.a.c(this.i.d(), EndCardShownCallback.class);
    }
}
