package com.adsurge.adn.J;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import com.adsurge.adn.X.l;
import com.adsurge.adn.X.x;
import com.adsurge.adn.Y0.d;
import defpackage.qb3;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public class c implements l.g {
    public static final long g = 300000;
    public long a = 0;
    public long b = 0;
    public boolean c = false;
    public boolean d = false;
    public final Handler e = new Handler(Looper.getMainLooper());
    public final Runnable f = new qb3(this, 8);

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class a {
        public static final c a = new c();
    }

    public static c e() {
        return a.a;
    }

    @Override // com.adsurge.adn.X.l.g
    public boolean a() {
        if (!this.d) {
            return false;
        }
        this.c = false;
        this.a = SystemClock.elapsedRealtime();
        h();
        return false;
    }

    @Override // com.adsurge.adn.X.l.g
    public boolean b() {
        if (!this.d) {
            return false;
        }
        i();
        a(this.b);
        c();
        this.c = true;
        this.a = 0L;
        return false;
    }

    public final void c() {
        this.e.removeCallbacks(this.f);
    }

    public final void d() {
        if (!this.d || this.c) {
            return;
        }
        i();
        h();
    }

    public void f() {
        if (this.d) {
            return;
        }
        this.d = true;
        g();
        this.b = 0L;
        boolean zC = l.b().c();
        this.c = !zC;
        this.a = zC ? SystemClock.elapsedRealtime() : 0L;
        if (!this.c) {
            h();
        }
        l.b().a(this);
    }

    public final void g() {
        long jA = x.a("last_sdk_active_duration", 0L);
        String strG = com.adsurge.adn.J.a.d().b().g();
        if (jA <= 0) {
            return;
        }
        d dVar = new d();
        dVar.a("duration", Long.valueOf(jA / 1000));
        dVar.a("session_id", strG);
        com.adsurge.adn.w1.b.a(6001403, (com.adsurge.adn.Y0.c) null, (Integer) null, (Integer) null, dVar);
        x.b("last_sdk_active_duration", 0L);
    }

    public final void i() {
        if (this.c || this.a == 0) {
            return;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        this.b = (jElapsedRealtime - this.a) + this.b;
        this.a = jElapsedRealtime;
    }

    public final void h() {
        c();
        this.e.postDelayed(this.f, g);
    }

    public final void a(long j) {
        x.b("last_sdk_active_duration", j);
    }
}
