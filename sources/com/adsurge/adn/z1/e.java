package com.adsurge.adn.z1;

import android.os.SystemClock;
import com.adsurge.adn.I0.g;
import defpackage.qb3;
import defpackage.ua;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public abstract class e extends com.adsurge.adn.z1.d {
    public final Queue b;
    public final List c;
    public final int d;
    public final int e;
    public volatile boolean f;
    public volatile boolean g;
    public boolean h;
    public boolean i;
    public long j;
    public volatile long k;
    public volatile long l;
    public volatile b m;
    public final Runnable n;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public enum b {
        SUSPEND,
        PLAYING,
        UNKNOWN
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class c extends com.adsurge.adn.C1.a {
        public void a(long j) {
        }

        public void b(long j) {
        }

        public abstract void c();
    }

    public synchronized void a(b bVar) {
        try {
            int i = a.a[bVar.ordinal()];
            if (i == 1) {
                if (this.m == b.SUSPEND) {
                    this.b.offer(new d(this.l, SystemClock.elapsedRealtime()));
                    this.l = 0L;
                }
                this.m = bVar;
            } else if (i == 2 && this.m != b.UNKNOWN) {
                if (this.m == b.PLAYING) {
                    this.l = SystemClock.elapsedRealtime();
                }
                this.m = bVar;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[b.values().length];
            a = iArr;
            try {
                iArr[b.PLAYING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[b.SUSPEND.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class d {
        public long a;
        public long b;

        public d(long j, long j2) {
            this.a = j;
            this.b = j2;
        }

        public String toString() {
            return String.format(Locale.getDefault(), "VideoSuspendNode { duration = %d - %d = %d (ms) }", Long.valueOf(this.b), Long.valueOf(this.a), Long.valueOf(this.b - this.a));
        }
    }

    public final void c() {
        if (this.j == 0) {
            return;
        }
        if (!this.h) {
            this.j = 0L;
            return;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime() - this.j;
        if (jElapsedRealtime < this.d) {
            this.j = 0L;
            return;
        }
        this.j = 0L;
        Iterator it = e().iterator();
        while (it.hasNext()) {
            ((c) it.next()).b(jElapsedRealtime);
        }
    }

    public final List e() {
        return this.c;
    }

    public e(com.adsurge.adn.u1.c cVar, List list) {
        super(list);
        this.b = new ConcurrentLinkedQueue();
        this.c = new ArrayList();
        this.f = false;
        this.g = false;
        this.h = false;
        this.i = false;
        this.j = 0L;
        this.k = 0L;
        this.l = 0L;
        this.m = b.UNKNOWN;
        this.n = new qb3(this, 15);
        e().addAll(list);
        this.d = com.adsurge.adn.N.b.a("skvsdd", 3, cVar) * 1000;
        this.e = cVar.E0();
    }

    @Override // com.adsurge.adn.z1.d, com.adsurge.adn.C1.c
    public void b() {
        super.b();
        this.g = true;
    }

    @Override // com.adsurge.adn.z1.d, com.adsurge.adn.C1.c
    public void f() {
        long jElapsedRealtime;
        super.f();
        a(b.PLAYING);
        g.d(this.n);
        if (this.g) {
            jElapsedRealtime = this.e;
        } else {
            long j = 0;
            if (!this.f) {
                jElapsedRealtime = 0;
            } else {
                while (true) {
                    d dVar = (d) this.b.poll();
                    if (dVar == null) {
                        break;
                    }
                    dVar.toString();
                    j += dVar.b - dVar.a;
                }
                jElapsedRealtime = (SystemClock.elapsedRealtime() - this.k) - j;
            }
        }
        g.c(new ua(this, jElapsedRealtime, 4));
    }

    @Override // com.adsurge.adn.z1.d, com.adsurge.adn.C1.c
    public void g() {
        super.g();
        if (this.h) {
            this.j = SystemClock.elapsedRealtime();
        } else {
            a(b.PLAYING);
        }
        this.i = false;
    }

    @Override // com.adsurge.adn.z1.d, com.adsurge.adn.C1.c
    public void h() {
        super.h();
        a(b.PLAYING);
        this.k = SystemClock.elapsedRealtime();
        g.d(this.n);
        this.f = true;
    }

    public final /* synthetic */ void i() {
        Iterator it = e().iterator();
        while (it.hasNext()) {
            ((c) it.next()).c();
        }
    }

    @Override // com.adsurge.adn.z1.d, com.adsurge.adn.C1.c
    public void j() {
        super.j();
        c();
        this.h = false;
        if (!this.i) {
            a(b.PLAYING);
        }
    }

    @Override // com.adsurge.adn.z1.d, com.adsurge.adn.C1.c
    public void l() {
        super.l();
        this.h = true;
        this.j = SystemClock.elapsedRealtime();
        a(b.SUSPEND);
    }

    @Override // com.adsurge.adn.z1.d, com.adsurge.adn.C1.c
    public void onVideoPause() {
        super.onVideoPause();
        c();
        this.i = true;
        a(b.SUSPEND);
    }

    @Override // com.adsurge.adn.z1.d, com.adsurge.adn.C1.c
    public void a(int i, Exception exc) {
        super.a(i, exc);
        a(b.SUSPEND);
        g.d(this.n);
    }

    public final /* synthetic */ void a(long j) {
        List listE = e();
        Iterator it = listE.iterator();
        while (it.hasNext()) {
            ((c) it.next()).a(j);
        }
        listE.clear();
    }

    @Override // com.adsurge.adn.z1.d, com.adsurge.adn.C1.c
    public void a() {
        super.a();
        g.a(this.n, 5000L);
    }
}
