package com.adsurge.adn.G;

import android.os.Handler;
import android.os.Looper;
import com.facebook.appevents.p;
import com.facebook.login.a0;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public class e extends com.adsurge.adn.F.d {
    public static final Object h = new Object();
    public static final byte[] i = new byte[0];
    public final f a;
    public final d b;
    public final Handler c = new Handler(Looper.getMainLooper());
    public final AtomicReference d = new AtomicReference();
    public final Semaphore e = new Semaphore(0);
    public Runnable f;
    public volatile boolean g;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class a extends FutureTask {
        public a(Runnable runnable, Void r3) {
            super(runnable, r3);
        }

        @Override // java.util.concurrent.FutureTask
        public void done() {
            AtomicReference atomicReference = e.this.d;
            while (!atomicReference.compareAndSet(this, null) && atomicReference.get() == this) {
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class b implements c {
        public final CountDownLatch a = new CountDownLatch(1);
        public final AtomicBoolean b = new AtomicBoolean();
        public Object c;
        public Throwable d;

        @Override // com.adsurge.adn.G.e.c
        public void a(Object obj, Throwable th) {
            if (this.b.compareAndSet(false, true)) {
                this.c = obj;
                this.d = th;
                this.a.countDown();
            }
        }

        public Object a() throws Throwable {
            this.a.await();
            Throwable th = this.d;
            if (th == null) {
                return this.c;
            }
            throw th;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public interface c {
        void a(Object obj, Throwable th);
    }

    public void a(String str, c cVar) {
        if (cVar == null) {
            b(str);
            return;
        }
        if (!c()) {
            cVar.a(null, new IllegalStateException("WebView script engine is not ready"));
        } else if (str == null || str.isEmpty()) {
            cVar.a(null, null);
        } else {
            this.b.a(str, cVar);
        }
    }

    @Override // com.adsurge.adn.F.d
    public boolean c() {
        return !this.g && this.a.g();
    }

    public void d() {
        if (this.g) {
            return;
        }
        this.g = true;
        this.a.b(this);
        this.b.b();
        Runnable runnable = this.f;
        this.f = null;
        if (runnable != null) {
            runnable.run();
        }
    }

    public void e() {
        this.e.drainPermits();
        this.e.release();
    }

    public e(f fVar, d dVar) {
        this.a = fVar;
        this.b = dVar;
    }

    public final void b(Runnable runnable) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            runnable.run();
            return;
        }
        a aVar = new a(runnable, null);
        this.d.set(aVar);
        this.c.post(aVar);
        e();
        try {
            aVar.get();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            p.g(e);
        } catch (ExecutionException e2) {
            p.g(e2.getCause());
        }
    }

    @Override // com.adsurge.adn.F.d
    public void a(Runnable runnable) {
        this.f = runnable;
    }

    @Override // com.adsurge.adn.F.d
    public void a(String str, Class cls, Object obj) {
        a(str, cls, obj, com.adsurge.adn.G.b.MAIN);
    }

    public void a(String str, Class cls, Object obj, com.adsurge.adn.G.b bVar) {
        if (c()) {
            this.b.a(str, cls, obj, bVar);
        }
    }

    public static com.adsurge.adn.F.d a(f fVar, com.adsurge.adn.G.a aVar) {
        if (!fVar.g()) {
            return null;
        }
        e eVar = new e(fVar, new d(fVar, aVar));
        if (fVar.a(eVar)) {
            return eVar;
        }
        return null;
    }

    @Override // com.adsurge.adn.F.d
    public Object a(String str) {
        b bVar = new b();
        try {
            b(new a0(7, this, str, bVar));
        } catch (Throwable th) {
            bVar.a(null, th);
        }
        return bVar.a();
    }

    public final /* synthetic */ void a(String str, b bVar) {
        a(str, (c) bVar);
    }

    public void a(long j) {
        FutureTask futureTask;
        if (!this.e.tryAcquire(j, TimeUnit.MILLISECONDS) || (futureTask = (FutureTask) this.d.get()) == null) {
            return;
        }
        futureTask.run();
    }

    public void b(String str) {
        if (!c() || str == null || str.isEmpty()) {
            return;
        }
        this.b.a(str);
    }

    @Override // com.adsurge.adn.F.d
    public void b() {
        if (this.g) {
            return;
        }
        this.g = true;
        this.a.b(this);
        this.f = null;
        this.b.a();
    }
}
