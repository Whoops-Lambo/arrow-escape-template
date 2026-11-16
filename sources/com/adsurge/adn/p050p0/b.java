package com.adsurge.adn.p050p0;

import android.os.SystemClock;
import android.view.View;
import com.adsurge.adn.Y0.c;
import com.adsurge.adn.p032j0.e;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public class b {
    public long a;
    public long b;
    public long c;
    public long d;
    public long e;
    public long f;
    public long g;
    public boolean h;
    public boolean i;
    public final WeakReference j;
    public final c k;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            b bVar = b.this;
            bVar.a(bVar.k);
        }
    }

    public final void a(c cVar) {
        if (this.i || this.a == 0) {
            return;
        }
        this.i = true;
        e.a(2230111, SystemClock.elapsedRealtime() - this.a, com.adsurge.adn.p066x0.b.d, cVar);
        e.a(2230112, this.c, com.adsurge.adn.p066x0.b.d, cVar);
        e.a(2230113, this.e, com.adsurge.adn.p066x0.b.d, cVar);
        e.a(2230114, this.g, com.adsurge.adn.p066x0.b.d, cVar);
        if (com.adsurge.adn.J0.a.a) {
            com.adsurge.adn.J0.a.a(e.a, "--------------------------------------------------------");
        }
    }

    public void b(boolean z) {
        if (this.i || this.h) {
            return;
        }
        this.f = SystemClock.elapsedRealtime();
        if (z) {
            this.h = true;
        }
    }

    public void c() {
        if (this.i) {
            return;
        }
        this.d = SystemClock.elapsedRealtime();
    }

    public void d() {
        if (this.i) {
            return;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        this.b = jElapsedRealtime;
        if (this.a == 0) {
            this.a = jElapsedRealtime;
        }
    }

    public b(View view, c cVar) {
        this.j = new WeakReference(view);
        this.k = cVar;
    }

    public void b() {
        if (this.i) {
            return;
        }
        this.c = (SystemClock.elapsedRealtime() - this.b) + this.c;
    }

    public void a(boolean z) {
        if (this.i) {
            return;
        }
        if (z) {
            this.h = false;
        }
        if (this.h) {
            return;
        }
        this.g = (SystemClock.elapsedRealtime() - this.f) + this.g;
        View view = (View) this.j.get();
        if (view != null) {
            view.post(new a());
        }
    }

    public void a() {
        if (this.i) {
            return;
        }
        this.e = (SystemClock.elapsedRealtime() - this.d) + this.e;
    }
}
