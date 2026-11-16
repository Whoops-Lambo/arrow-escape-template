package com.adsurge.adn.z1;

import com.adsurge.adn.C1.h;
import com.adsurge.adn.C1.q;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public class b implements com.adsurge.adn.C1.c {
    public final h a;
    public final com.adsurge.adn.C1.c b;
    public final com.adsurge.adn.Y0.c c;
    public final com.adsurge.adn.u1.c d;
    public int e;

    @Override // com.adsurge.adn.C1.c
    public void a(int i, Exception exc) {
        com.adsurge.adn.C1.c cVar = this.b;
        if (cVar != null) {
            cVar.a(i, exc);
        }
        f.a(this.c, i, exc.getMessage(), this.d, q.a(this.a.getType()), this.a.getPlayerVersion());
    }

    @Override // com.adsurge.adn.C1.c
    public void b() {
        com.adsurge.adn.C1.c cVar = this.b;
        if (cVar != null) {
            cVar.b();
        }
        f.a(this.c, this.a.getDuration());
    }

    @Override // com.adsurge.adn.C1.c
    public void d() {
        com.adsurge.adn.C1.c cVar = this.b;
        if (cVar != null) {
            cVar.d();
        }
    }

    @Override // com.adsurge.adn.C1.c
    public void f() {
        com.adsurge.adn.C1.c cVar = this.b;
        if (cVar != null) {
            cVar.f();
        }
        if (this.e > 0) {
            f.b(this.c, this.a.getDuration(), this.a.getCurrentPosition());
        }
        f.a(this.c, this.a.getDuration(), this.e);
    }

    @Override // com.adsurge.adn.C1.c
    public void g() {
        com.adsurge.adn.C1.c cVar = this.b;
        if (cVar != null) {
            cVar.g();
        }
        f.b(this.c, this.a.getDuration(), this.a.getCachePosition(), false);
    }

    @Override // com.adsurge.adn.C1.c
    public void h() {
        this.e++;
        com.adsurge.adn.C1.c cVar = this.b;
        if (cVar != null) {
            cVar.h();
        }
        int i = this.e;
        com.adsurge.adn.Y0.c cVar2 = this.c;
        if (i > 1) {
            f.a(cVar2, this.a.getDuration(), this.e, true);
        } else {
            f.a(cVar2, this.a, false, this.d);
        }
    }

    @Override // com.adsurge.adn.C1.c
    public void j() {
        com.adsurge.adn.C1.c cVar = this.b;
        if (cVar != null) {
            cVar.j();
        }
    }

    @Override // com.adsurge.adn.C1.c
    public void k() {
        com.adsurge.adn.C1.c cVar = this.b;
        if (cVar != null) {
            cVar.k();
        }
    }

    @Override // com.adsurge.adn.C1.c
    public void l() {
        com.adsurge.adn.C1.c cVar = this.b;
        if (cVar != null) {
            cVar.l();
        }
    }

    @Override // com.adsurge.adn.C1.c
    public void o() {
        com.adsurge.adn.C1.c cVar = this.b;
        if (cVar != null) {
            cVar.o();
        }
    }

    @Override // com.adsurge.adn.C1.c
    public void onVideoPause() {
        com.adsurge.adn.C1.c cVar = this.b;
        if (cVar != null) {
            cVar.onVideoPause();
        }
        f.a(this.c, this.a.getDuration(), this.a.getCachePosition(), false);
    }

    public b(h hVar, com.adsurge.adn.C1.c cVar, com.adsurge.adn.u1.c cVar2) {
        this.a = hVar;
        this.b = cVar;
        this.c = com.adsurge.adn.Y0.c.a(cVar2);
        this.d = cVar2;
    }

    @Override // com.adsurge.adn.C1.c
    public void a() {
        com.adsurge.adn.C1.c cVar = this.b;
        if (cVar != null) {
            cVar.a();
        }
    }
}
