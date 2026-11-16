package com.adsurge.adn.p040m;

import android.view.View;
import com.adsurge.adn.p037l.e;
import com.adsurge.adn.r1.a;
import com.adsurge.adn.u1.c;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
public class b extends a {
    public final View i;
    public final long j;
    public long k;
    public long l;
    public Runnable m;

    public final boolean b(long j) {
        View viewQ;
        if (this.j <= 0) {
            return true;
        }
        if (!u() || (viewQ = q()) == null) {
            return false;
        }
        long j2 = this.k;
        if (j2 > 0) {
            this.l = (j - j2) + this.l;
        }
        this.k = j;
        if (this.l < this.j) {
            return false;
        }
        viewQ.post(this.m);
        return true;
    }

    @Override // com.adsurge.adn.p040m.a
    public View t() {
        return this.i;
    }

    public b(c cVar, int i, e eVar, Runnable runnable, View view) {
        super(cVar, i, eVar);
        this.i = view;
        this.j = ((long) cVar.p()) * 1000;
        this.m = runnable;
    }

    @Override // com.adsurge.adn.p040m.a
    public void a(com.adsurge.adn.Y0.c cVar) {
        com.adsurge.adn.w1.b.a(6000100, cVar);
        com.adsurge.adn.w1.b.a(6000102, cVar);
        this.l = 0L;
    }

    @Override // com.adsurge.adn.p031j.d, android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
        super.onViewAttachedToWindow(view);
        w();
    }

    @Override // com.adsurge.adn.p031j.d, android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        View viewQ = q();
        if (viewQ != null) {
            viewQ.removeCallbacks(this.m);
        }
        this.k = 0L;
        super.onViewDetachedFromWindow(view);
    }

    @Override // com.adsurge.adn.p031j.d
    public void p() {
        View viewQ = q();
        if (viewQ != null) {
            viewQ.removeCallbacks(this.m);
        }
        this.m = null;
        super.p();
    }

    @Override // com.adsurge.adn.p040m.a, com.adsurge.adn.p037l.a
    public void r() {
        super.r();
        this.k = 0L;
        this.l = 0L;
    }

    public void w() {
        s();
    }

    @Override // com.adsurge.adn.p040m.a, com.adsurge.adn.X.B.a
    public boolean a(long j) {
        if (v()) {
            return b(j);
        }
        return true;
    }

    @Override // com.adsurge.adn.p040m.a
    public void b(com.adsurge.adn.Y0.c cVar) {
        a.a(cVar);
    }
}
