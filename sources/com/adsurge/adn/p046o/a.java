package com.adsurge.adn.p046o;

import android.view.View;
import com.adsurge.adn.N.b;
import com.adsurge.adn.N.d;
import com.adsurge.adn.p037l.e;
import com.adsurge.adn.u1.c;
import com.adsurge.adn.x1.u;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public abstract class a extends com.adsurge.adn.p037l.a {
    public final c e;
    public final long f;
    public long g;
    public long h;
    public int i;
    public long j;
    public int k;

    @Override // com.adsurge.adn.p037l.d
    public long c() {
        return this.j;
    }

    @Override // com.adsurge.adn.p037l.a
    public void r() {
        this.g = 0L;
        this.h = 0L;
    }

    public boolean t() {
        return this.k == 0;
    }

    public a(c cVar, int i, e eVar) {
        super(eVar);
        this.e = cVar;
        this.k = i;
        this.f = a(cVar);
    }

    @Override // com.adsurge.adn.X.B.a
    public boolean a(long j) {
        if (!u.a(q(), this.i)) {
            this.h = 0L;
            return false;
        }
        long j2 = this.h;
        if (j2 <= 0) {
            this.h = j;
            return false;
        }
        long j3 = (j - j2) + this.g;
        this.g = j3;
        this.h = j;
        if (j3 < this.f) {
            return false;
        }
        if (this.j == 0) {
            this.j = d.b().a();
        }
        s();
        return true;
    }

    @Override // com.adsurge.adn.p031j.d, android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
        super.onViewAttachedToWindow(view);
    }

    @Override // com.adsurge.adn.p031j.d, android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        super.onViewDetachedFromWindow(view);
        this.h = 0L;
    }

    public void s() {
        if (t()) {
            com.adsurge.adn.p037l.c.a(0, this.e, q());
        }
        com.adsurge.adn.p037l.c.a(this.e, 6000202, (Integer) null);
    }

    public a(c cVar, e eVar) {
        super(eVar);
        this.e = cVar;
        this.f = a(cVar);
    }

    public final long a(c cVar) {
        return b.a("skepdu", 100, cVar);
    }
}
