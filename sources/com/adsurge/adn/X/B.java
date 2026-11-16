package com.adsurge.adn.X;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import java.util.Iterator;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public class B implements Runnable {
    public final long a;
    public final Queue b = new ConcurrentLinkedQueue();
    public volatile Handler c;
    public volatile long d;
    public volatile long e;
    public volatile long f;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public interface a {
        boolean a(long j);
    }

    public synchronized void d() {
        if (this.e <= 0 && !c()) {
            a().removeCallbacks(this);
            this.e = SystemClock.elapsedRealtime();
        }
    }

    public synchronized void e() {
        try {
            if (this.e > 0 && !c()) {
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                this.d = (jElapsedRealtime - this.e) + this.d;
                this.e = 0L;
                long j = (jElapsedRealtime - this.d) % this.a;
                if (j > 0) {
                    a().postDelayed(this, this.a - j);
                } else {
                    a(a().getLooper().getThread());
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void f() {
        try {
            if (this.d > 0) {
                return;
            }
            this.d = SystemClock.elapsedRealtime();
            Looper mainLooper = Looper.getMainLooper();
            if (this.c == null) {
                this.c = new Handler(mainLooper);
            }
            a(mainLooper.getThread());
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void g() {
        try {
            if (c()) {
                f();
            } else {
                e();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void h() {
        a().removeCallbacks(this);
        this.d = 0L;
        this.b.clear();
    }

    public void b(a aVar) {
        if (aVar == null) {
            return;
        }
        this.b.remove(aVar);
    }

    public boolean c() {
        return this.d <= 0;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (!this.b.isEmpty()) {
            this.f = SystemClock.elapsedRealtime() - this.d;
            Iterator it = this.b.iterator();
            while (it.hasNext()) {
                if (((a) it.next()).a(this.f)) {
                    it.remove();
                }
            }
        }
        if (c()) {
            return;
        }
        a().postDelayed(this, this.a);
    }

    public B(long j) {
        this.a = j;
    }

    public final void a(Thread thread) {
        if (thread == Thread.currentThread()) {
            run();
        } else {
            a().post(this);
        }
    }

    public long b() {
        return this.f;
    }

    public void a(a aVar) {
        if (aVar == null) {
            return;
        }
        this.b.offer(aVar);
    }

    public final Handler a() {
        if (this.c == null) {
            this.c = new Handler(Looper.getMainLooper());
        }
        return this.c;
    }
}
