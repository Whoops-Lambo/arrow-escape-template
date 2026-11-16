package com.adsurge.adn.p043n;

import android.os.SystemClock;
import com.adsurge.adn.lib.callback.EndCardShownCallback;
import com.adsurge.adn.p018e1.e;
import com.adsurge.adn.p018e1.f;
import com.adsurge.adn.u1.c;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class a extends com.adsurge.adn.p037l.a implements f, c {
    public final long e;
    public final e f;
    public final int g;
    public boolean h;
    public c i;
    public long j;
    public c.a k;
    public EnumC0126a l;
    public Runnable m;

    /* JADX INFO: renamed from: com.adsurge.adn.n.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public enum EnumC0126a {
        NONE,
        ALLOW_EXPOSE,
        DENY_EXPOSE
    }

    @Override // com.adsurge.adn.p031j.d
    public void p() {
        this.h = true;
        com.adsurge.adn.p018e1.a.c(this.i.d(), EndCardShownCallback.class);
        super.p();
    }

    public abstract long v();

    public abstract int w();

    @Override // com.adsurge.adn.X.B.a
    public boolean a(long j) {
        EnumC0126a enumC0126a = this.l;
        if (enumC0126a == EnumC0126a.DENY_EXPOSE) {
            e("denyExpose");
            return true;
        }
        if (enumC0126a == EnumC0126a.NONE || this.j <= 0 || SystemClock.elapsedRealtime() - this.j < this.e) {
            return false;
        }
        u();
        return true;
    }

    @Override // com.adsurge.adn.p037l.d
    public long c() {
        return 0L;
    }

    @Override // com.adsurge.adn.p018e1.f
    public boolean m() {
        return this.h;
    }

    public void s() {
        this.l = EnumC0126a.ALLOW_EXPOSE;
    }

    public void t() {
        this.l = EnumC0126a.DENY_EXPOSE;
    }

    public boolean x() {
        return this.g == 2;
    }

    public a(c cVar, int i, com.adsurge.adn.p037l.e eVar) {
        super(eVar);
        this.f = new e();
        this.l = EnumC0126a.NONE;
        this.i = cVar;
        this.g = i;
        this.e = v();
    }

    public void e(String str) {
        t();
        c.a aVar = this.k;
        if (aVar != null) {
            aVar.a(false);
            this.k = null;
        }
    }

    public void u() {
        if (x()) {
            com.adsurge.adn.p037l.c.a(w(), this.i, q());
            Runnable runnable = this.m;
            if (runnable != null) {
                runnable.run();
                this.m = null;
            }
        }
        com.adsurge.adn.p037l.c.a(this.i, 6000204, Integer.valueOf(w()));
        y();
    }

    public void y() {
        t();
        c.a aVar = this.k;
        if (aVar != null) {
            aVar.a(true);
            this.k = null;
        }
    }

    public void z() {
        this.j = SystemClock.elapsedRealtime();
    }

    @Override // com.adsurge.adn.p018e1.f
    public e e() {
        return this.f;
    }

    public void a(Runnable runnable) {
        this.m = runnable;
    }

    @Override // com.adsurge.adn.p043n.c
    public void a(c.a aVar, boolean z) {
        if (!z) {
            t();
            aVar.a(true);
        } else {
            s();
            this.k = aVar;
        }
    }
}
