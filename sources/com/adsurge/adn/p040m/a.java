package com.adsurge.adn.p040m;

import android.view.View;
import com.adsurge.adn.N.d;
import com.adsurge.adn.p037l.e;
import com.adsurge.adn.u1.c;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a extends com.adsurge.adn.p037l.a {
    public final c e;
    public final int f;
    public boolean g;
    public long h;

    @Override // com.adsurge.adn.X.B.a
    public boolean a(long j) {
        return true;
    }

    public void b(com.adsurge.adn.Y0.c cVar) {
    }

    @Override // com.adsurge.adn.p037l.a
    public void r() {
        this.g = false;
        this.h = 0L;
    }

    @Override // com.adsurge.adn.p037l.d
    public long c() {
        return this.h;
    }

    public final void s() {
        if (this.g) {
            return;
        }
        this.g = true;
        com.adsurge.adn.Y0.c cVarA = com.adsurge.adn.Y0.c.a(this.e);
        if (v()) {
            this.h = d.b().a();
            com.adsurge.adn.p037l.c.a(1, this.e, t());
            b(cVarA);
        }
        com.adsurge.adn.p037l.c.a(this.e, 6000203, (Integer) null);
        a(cVarA);
    }

    public boolean u() {
        return this.g;
    }

    public boolean v() {
        return this.f == 1;
    }

    public a(c cVar, int i, e eVar) {
        super(eVar);
        this.e = cVar;
        this.f = i;
    }

    public void a(com.adsurge.adn.Y0.c cVar) {
    }

    public View t() {
        return q();
    }
}
