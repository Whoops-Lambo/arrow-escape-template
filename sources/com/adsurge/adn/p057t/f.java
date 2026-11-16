package com.adsurge.adn.p057t;

import com.adsurge.adn.C1.c;
import com.adsurge.adn.p055s.b;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public class f extends a implements c {
    public a b;
    public h c;
    public b d;
    public e e;
    public c f;
    public boolean g;

    public void i() {
        this.g = false;
        a("onViewDetachedOrInVisible");
        if (this.b == this.c) {
            if (this.a.b.C()) {
                this.a.b.D();
            }
            this.b = this.d;
        }
    }

    @Override // com.adsurge.adn.p057t.a
    public boolean a(boolean z) {
        if (this.g == z) {
            return true;
        }
        this.g = z;
        a("onVisibleChanged");
        if (this.b.a(this.g)) {
            if (this.g) {
                this.b = this.c;
            } else {
                this.b = this.d;
            }
        }
        return true;
    }

    @Override // com.adsurge.adn.C1.c
    public void b() {
        this.b = this.f;
        a("onVideoComplete");
    }

    @Override // com.adsurge.adn.p057t.a
    public boolean c() {
        if (!this.b.c()) {
            return true;
        }
        this.b = this.e;
        return true;
    }

    @Override // com.adsurge.adn.C1.c
    public void d() {
        a("onVideoReady");
    }

    @Override // com.adsurge.adn.p057t.a
    public boolean e() {
        if (!this.b.e()) {
            return true;
        }
        this.b = this.c;
        return true;
    }

    @Override // com.adsurge.adn.C1.c
    public void f() {
        a("onBeforeVideoViewRelease");
    }

    @Override // com.adsurge.adn.C1.c
    public void g() {
        a("onVideoResume");
    }

    @Override // com.adsurge.adn.C1.c
    public void h() {
        a("onVideoStart");
    }

    @Override // com.adsurge.adn.C1.c
    public void j() {
        a("onLoadingEnd");
    }

    @Override // com.adsurge.adn.C1.c
    public void l() {
        a("onLoadingStart");
    }

    @Override // com.adsurge.adn.C1.c
    public void o() {
        this.b = this.f;
        a("onVideoStop");
    }

    @Override // com.adsurge.adn.C1.c
    public void onVideoPause() {
        a("onVideoPause");
    }

    public f(b bVar) {
        super(bVar);
        if (bVar.hasVideoContent()) {
            this.c = new h(bVar);
            this.d = new b(bVar);
            this.e = new e(bVar);
            this.f = new c(bVar);
            this.b = new d(bVar);
            return;
        }
        this.b = new g(bVar);
    }

    public final void a(String str) {
    }

    @Override // com.adsurge.adn.C1.c
    public void a(int i, Exception exc) {
        this.b = this.f;
        a("onVideoError, errCode: " + i);
    }
}
