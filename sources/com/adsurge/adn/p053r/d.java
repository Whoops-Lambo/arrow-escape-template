package com.adsurge.adn.p053r;

import android.view.View;
import android.view.ViewGroup;
import com.adsurge.adn.E1.C1627b;
import com.adsurge.adn.V.k;
import com.adsurge.adn.V.m;
import com.adsurge.adn.ads.BaseAdListener;
import com.adsurge.adn.p036k1.h;
import com.adsurge.adn.p036k1.o;
import com.adsurge.adn.p036k1.p;
import com.adsurge.adn.p036k1.y;
import defpackage.hl2;
import defpackage.ob3;
import defpackage.qb3;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public class d extends com.adsurge.adn.p053r.b {
    public com.adsurge.adn.p022g.b q;
    public c r;
    public Runnable s;
    public final C0136d t;
    public e u;
    public com.adsurge.adn.p031j.a v;
    public com.adsurge.adn.p040m.b w;
    public final List x;
    public final Runnable y;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class a extends com.adsurge.adn.C1.a {
        public a() {
        }

        @Override // com.adsurge.adn.C1.a, com.adsurge.adn.C1.c
        public void b() {
            d dVar = d.this;
            dVar.u = e.COMPLETE;
            dVar.f.a(new h().g(false).e());
        }

        @Override // com.adsurge.adn.C1.a, com.adsurge.adn.C1.c
        public void d() {
            d.this.u = e.READY;
        }

        @Override // com.adsurge.adn.C1.a, com.adsurge.adn.C1.c
        public void h() {
            d.this.f.a(new h().g(true).e());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class b implements com.adsurge.adn.p053r.a.InterfaceC0134a {
        public b() {
        }

        @Override // com.adsurge.adn.p053r.a.InterfaceC0134a
        public void c() {
            d.this.b.e();
        }

        @Override // com.adsurge.adn.p053r.a.InterfaceC0134a
        public void e() {
            d.this.b.d();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class c extends p {
        public c(o oVar, com.adsurge.adn.u1.c cVar) {
            super(oVar, cVar);
        }

        @Override // com.adsurge.adn.p036k1.p
        public void a(com.adsurge.adn.p044n0.c cVar, y yVar) {
            super.a(cVar, yVar);
            d dVar = d.this;
            dVar.h = yVar;
            if (yVar != null && dVar.e != null) {
                yVar.a(dVar.new c(yVar, dVar.a));
                View viewK = d.this.h.k();
                View viewK2 = d.this.f.k();
                ((com.adsurge.adn.p022g.b) d.this.e).addView(viewK, new ViewGroup.LayoutParams(viewK2.getWidth(), viewK2.getHeight()));
                com.adsurge.adn.w1.b.a(6000700, com.adsurge.adn.Y0.c.a(d.this.a));
            }
        }

        @Override // com.adsurge.adn.p036k1.p
        public void c() {
            super.c();
            d.this.v();
            com.adsurge.adn.w1.b.a(6000401, com.adsurge.adn.Y0.c.a(d.this.a), new m().a(!d.this.a.Y0()));
        }

        @Override // com.adsurge.adn.p036k1.p
        public void e(com.adsurge.adn.p044n0.c cVar) {
            super.e(cVar);
            d.this.a(true);
            com.adsurge.adn.p025h.c.b().a(d.this.a.d(), com.adsurge.adn.p025h.d.USER_ACTION_TYPE_CLOSE_AD, 0L);
            com.adsurge.adn.Y0.c cVarA = com.adsurge.adn.Y0.c.a(d.this.a);
            d dVar = d.this;
            long jB = dVar.b(dVar.b.b());
            com.adsurge.adn.w1.b.a(6000400, cVarA, new k().a(d.this.a.C0()).a(jB).b(jB - ((long) d.this.a.m0())));
            com.adsurge.adn.u1.c cVar2 = d.this.a;
            BaseAdListener baseAdListener = cVar2.C0;
            if (baseAdListener != null) {
                baseAdListener.onAdDismissed(cVar2.B0);
            }
        }

        @Override // com.adsurge.adn.p036k1.p
        public void s(com.adsurge.adn.p044n0.c cVar) {
            super.s(cVar);
            d.this.b(true);
        }

        @Override // com.adsurge.adn.p036k1.p
        public void a(com.adsurge.adn.p021f1.d dVar, com.adsurge.adn.p044n0.c cVar) {
            super.a(dVar, cVar);
            d dVar2 = d.this;
            dVar2.j.b(dVar, cVar, dVar2.b(dVar2.b.b()));
            com.adsurge.adn.u1.c cVar2 = d.this.a;
            BaseAdListener baseAdListener = cVar2.C0;
            if (baseAdListener != null) {
                baseAdListener.onAdClicked(cVar2.B0);
            }
        }
    }

    /* JADX INFO: renamed from: com.adsurge.adn.r.d$d, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class C0136d {
        public C0136d() {
        }

        public void a() {
            d dVar = d.this;
            e eVar = dVar.u;
            if (eVar == e.PLAY || eVar == e.READY) {
                dVar.u = e.PAUSE;
                dVar.a(false);
            }
        }

        public void b() {
            d dVar = d.this;
            e eVar = dVar.u;
            if (eVar == e.READY || eVar == e.PAUSE) {
                dVar.u = e.PLAY;
                dVar.b(false);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public enum e {
        NONE,
        READY,
        PAUSE,
        PLAY,
        COMPLETE
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void y() {
        Runnable runnable;
        this.b.h();
        Iterator it = this.x.iterator();
        while (it.hasNext()) {
            ((com.adsurge.adn.p037l.a) it.next()).r();
        }
        if (this.q == null || (runnable = this.s) == null) {
            return;
        }
        runnable.run();
    }

    public void A() {
        this.b.f();
    }

    @Override // com.adsurge.adn.p053r.b
    public void a(boolean z) {
        if (z) {
            this.a.d(true);
        }
        if (this.g == null || this.f.o()) {
            return;
        }
        com.adsurge.adn.C1.e eVar = this.g;
        if (z) {
            eVar.x();
        } else {
            eVar.pause();
        }
    }

    @Override // com.adsurge.adn.p053r.b
    public void b(boolean z) {
        if (this.g != null && !this.f.o()) {
            com.adsurge.adn.C1.e eVar = this.g;
            if (z) {
                eVar.M();
            } else {
                eVar.play();
            }
        }
        if (z) {
            this.a.d(false);
        }
    }

    @Override // com.adsurge.adn.p053r.b
    public void c() {
        Iterator it = this.x.iterator();
        while (it.hasNext()) {
            ((com.adsurge.adn.p037l.a) it.next()).p();
        }
        super.c();
        this.v.p();
    }

    @Override // com.adsurge.adn.p053r.b
    public p f() {
        if (this.r == null) {
            this.r = new c(this.f, this.a);
        }
        return this.r;
    }

    @Override // com.adsurge.adn.p053r.b
    public com.adsurge.adn.p037l.a i() {
        int iA = com.adsurge.adn.N.b.a("sbes", 0, this.a);
        com.adsurge.adn.p046o.b bVar = new com.adsurge.adn.p046o.b(this.a, iA, new hl2(this, 20), this.y, this.e);
        this.w = new com.adsurge.adn.p040m.b(this.a, iA, new hl2(this, 20), this.y, this.e);
        this.x.clear();
        this.x.add(bVar);
        this.x.add(this.w);
        return this.w.v() ? this.w : bVar;
    }

    @Override // com.adsurge.adn.p053r.b
    public List k() {
        a aVar = new a();
        List listK = super.k();
        listK.add(aVar);
        return listK;
    }

    @Override // com.adsurge.adn.p053r.b
    public List l() {
        LinkedList linkedList = new LinkedList(super.l());
        this.v = new com.adsurge.adn.p031j.a(this.a, new hl2(this, 20), this.t);
        linkedList.addAll(this.x);
        linkedList.add(this.v);
        return linkedList;
    }

    @Override // com.adsurge.adn.p053r.b
    public List n() {
        LinkedList linkedList = new LinkedList(super.n());
        linkedList.addAll(this.x);
        linkedList.add(new ob3(this, 1));
        linkedList.add(this.v);
        return linkedList;
    }

    @Override // com.adsurge.adn.p053r.b
    public void t() {
        ((com.adsurge.adn.p022g.b) this.e).setVisibilityChangedListener(new b());
    }

    public void z() {
        com.adsurge.adn.p040m.b bVar = this.w;
        if (bVar != null) {
            bVar.w();
        }
    }

    public d(com.adsurge.adn.p022g.b bVar, com.adsurge.adn.u1.c cVar, Runnable runnable) {
        super(cVar);
        this.t = new C0136d();
        this.u = e.NONE;
        this.x = new LinkedList();
        this.y = new qb3(this, 13);
        this.q = bVar;
        this.s = runnable;
    }

    public boolean d(long j) {
        this.f.a(b(j));
        return true;
    }

    @Override // com.adsurge.adn.p053r.b
    public h j() {
        h hVarB = super.j().f(this.a.Y0()).c(this.a.U()).b(com.adsurge.adn.N.d.b().c());
        if (this.g != null) {
            hVarB.e(this.a.D0());
        }
        return hVarB;
    }

    @Override // com.adsurge.adn.p053r.b
    public List q() {
        List listQ = super.q();
        if (this.a.N0()) {
            listQ.add(new C1627b(this.a));
        }
        return listQ;
    }

    @Override // com.adsurge.adn.p053r.b
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public com.adsurge.adn.p022g.b h() {
        return this.q;
    }

    @Override // com.adsurge.adn.p053r.b
    public View d() {
        return this.f.k();
    }
}
