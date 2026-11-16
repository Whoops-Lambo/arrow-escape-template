package com.adsurge.adn.p034k;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import com.adsurge.adn.Y0.e;
import com.adsurge.adn.p021f1.d;
import com.adsurge.adn.u1.c;
import java.util.Deque;
import java.util.LinkedList;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public abstract class a implements e {
    public final b a;
    public final Handler b;
    public final c c;
    public e d;
    public long e;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class b implements Runnable {
        public final Deque a = new LinkedList();

        public b() {
        }

        public void a(d dVar, e eVar) {
            this.a.offerLast(new C0118a(dVar, eVar));
        }

        @Override // java.lang.Runnable
        public void run() {
            C0118a c0118a;
            this.a.size();
            while (!this.a.isEmpty() && (c0118a = (C0118a) this.a.pollLast()) != null) {
                a.this.a(c0118a.a, c0118a.b, c0118a.c);
            }
            a.this.b.removeCallbacks(this);
        }
    }

    public abstract boolean a(boolean z);

    public abstract boolean b(d dVar);

    /* JADX INFO: renamed from: com.adsurge.adn.k.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class C0118a {
        public final d a;
        public final e b;
        public final long c = SystemClock.elapsedRealtime();

        public C0118a(d dVar, e eVar) {
            this.a = dVar;
            this.b = eVar;
        }
    }

    @Override // com.adsurge.adn.p034k.e
    public void b(d dVar, com.adsurge.adn.p044n0.c cVar, long j) {
        if (!dVar.h) {
            this.d.b(dVar, cVar, j);
        } else if (b(dVar)) {
            this.d.b(dVar, cVar, j);
        } else {
            c(dVar, cVar, j);
        }
    }

    public void c(d dVar, com.adsurge.adn.p044n0.c cVar, long j) {
        e eVarA = this.d.a(dVar, cVar, j);
        this.d.a(dVar);
        this.a.a(dVar, eVarA);
        this.b.postDelayed(this.a, this.e);
    }

    @Override // com.adsurge.adn.p034k.e
    public void destroy() {
        this.d.destroy();
        this.a.run();
        this.b.removeCallbacksAndMessages(null);
        com.adsurge.adn.K1.c.b(this.c.d());
        com.adsurge.adn.K1.c.a(this.c.d());
    }

    public a(c cVar, com.adsurge.adn.p053r.a aVar) {
        final b bVar = new b();
        this.a = bVar;
        this.c = cVar;
        this.d = new c(cVar, aVar);
        this.b = new Handler(Looper.getMainLooper());
        com.adsurge.adn.K1.c.a(cVar.d(), new com.adsurge.adn.K1.c.a() { // from class: v93
            @Override // com.adsurge.adn.K1.c.a
            public final void a() {
                bVar.run();
            }
        });
    }

    @Override // com.adsurge.adn.p034k.e
    public void a(d dVar, e eVar, long j) {
        boolean zB;
        if (SystemClock.elapsedRealtime() - j < this.e) {
            zB = b(dVar);
        } else {
            zB = false;
        }
        if (!a(zB)) {
            return;
        }
        dVar.l = !zB;
        this.d.a(dVar, eVar, j);
    }

    @Override // com.adsurge.adn.p034k.e
    public e a(d dVar, com.adsurge.adn.p044n0.c cVar, long j) {
        return this.d.a(dVar, cVar, j);
    }

    @Override // com.adsurge.adn.p034k.e
    public void a(d dVar) {
        this.d.a(dVar);
    }
}
