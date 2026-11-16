package com.vungle.ads.internal.executor;

import com.iab.omid.library.vungle.internal.l;
import com.vungle.ads.OutOfMemory;
import com.vungle.ads.internal.util.t;
import com.vungle.ads.internal.util.u;
import defpackage.h5;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class j extends ThreadPoolExecutor implements AutoCloseable {
    public static final /* synthetic */ int b = 0;
    public final c a;

    static {
        new g();
    }

    public final void a(Runnable runnable, Runnable runnable2) {
        runnable.getClass();
        runnable2.getClass();
        try {
            super.execute(g.a(runnable, runnable2));
        } catch (Exception e) {
            boolean z = u.a;
            t.a("VungleThreadPool", "execute exception with fail", e);
            runnable2.run();
        } catch (OutOfMemoryError e2) {
            StringBuilder sbA = l.a("execute error with fail in ");
            sbA.append(a());
            sbA.append(": ");
            sbA.append(e2.getLocalizedMessage());
            String string = sbA.toString();
            boolean z2 = u.a;
            t.a("VungleThreadPool", string, e2);
            new OutOfMemory(string).logErrorNoReturnValue$vungle_ads_release();
            runnable2.run();
        }
    }

    @Override // java.util.concurrent.ThreadPoolExecutor, java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.getClass();
        try {
            super.execute(g.a(runnable, new h5(this, 2)));
        } catch (Exception e) {
            boolean z = u.a;
            t.a("VungleThreadPool", "execute exception", e);
        } catch (OutOfMemoryError e2) {
            StringBuilder sbA = l.a("execute error in ");
            sbA.append(a());
            sbA.append(": ");
            sbA.append(e2.getLocalizedMessage());
            String string = sbA.toString();
            boolean z2 = u.a;
            t.a("VungleThreadPool", string, e2);
            new OutOfMemory(string).logErrorNoReturnValue$vungle_ads_release();
        }
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public final Future submit(Callable callable) {
        callable.getClass();
        try {
            Future futureSubmit = super.submit(g.b(callable, new i(this)));
            futureSubmit.getClass();
            return futureSubmit;
        } catch (Exception e) {
            boolean z = u.a;
            t.b("VungleThreadPool", "submit exception callable: " + e);
            return new b(null);
        } catch (OutOfMemoryError e2) {
            StringBuilder sbA = l.a("submit error callable in ");
            sbA.append(a());
            sbA.append(": ");
            sbA.append(e2.getLocalizedMessage());
            String string = sbA.toString();
            boolean z2 = u.a;
            t.a("VungleThreadPool", string, e2);
            new OutOfMemory(string).logErrorNoReturnValue$vungle_ads_release();
            return new b(null);
        }
    }

    public j(int i, int i2, long j, TimeUnit timeUnit, BlockingQueue blockingQueue, c cVar) {
        super(i, i2, j, timeUnit, (BlockingQueue<Runnable>) blockingQueue, cVar);
        this.a = cVar;
        allowCoreThreadTimeOut(true);
    }

    public static final void b(j jVar) {
        jVar.getClass();
        StringBuilder sbA = l.a("submit error in ");
        sbA.append(jVar.a());
        new OutOfMemory(sbA.toString()).logErrorNoReturnValue$vungle_ads_release();
    }

    public static final void c(j jVar) {
        jVar.getClass();
        StringBuilder sbA = l.a("submit error with result in ");
        sbA.append(jVar.a());
        new OutOfMemory(sbA.toString()).logErrorNoReturnValue$vungle_ads_release();
    }

    @Override // java.lang.AutoCloseable
    public final /* synthetic */ void close() {
        boolean zIsTerminated;
        if (this != ForkJoinPool.commonPool() && !(zIsTerminated = isTerminated())) {
            shutdown();
            boolean z = false;
            while (!zIsTerminated) {
                try {
                    zIsTerminated = awaitTermination(1L, TimeUnit.DAYS);
                } catch (InterruptedException unused) {
                    if (!z) {
                        shutdownNow();
                        z = true;
                    }
                }
            }
            if (z) {
                Thread.currentThread().interrupt();
            }
        }
    }

    public static final void a(j jVar) {
        jVar.getClass();
        StringBuilder sbA = l.a("execute error in ");
        sbA.append(jVar.a());
        new OutOfMemory(sbA.toString()).logErrorNoReturnValue$vungle_ads_release();
    }

    public final String a() {
        String str;
        c cVar = this.a;
        return (cVar == null || (str = cVar.a) == null) ? "VungleThreadPoolExecutor" : str;
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public final Future submit(Runnable runnable, Object obj) {
        runnable.getClass();
        try {
            Future futureSubmit = super.submit(g.a(runnable, new h5(this, 1)), obj);
            futureSubmit.getClass();
            return futureSubmit;
        } catch (Exception e) {
            boolean z = u.a;
            t.a("VungleThreadPool", "submit exception with result", e);
            return new b(null);
        } catch (OutOfMemoryError e2) {
            StringBuilder sbA = l.a("submit error with result in ");
            sbA.append(a());
            sbA.append(": ");
            sbA.append(e2.getLocalizedMessage());
            String string = sbA.toString();
            boolean z2 = u.a;
            t.a("VungleThreadPool", string, e2);
            new OutOfMemory(string).logErrorNoReturnValue$vungle_ads_release();
            return new b(null);
        }
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public final Future submit(Runnable runnable) {
        runnable.getClass();
        try {
            Future<?> futureSubmit = super.submit(g.a(runnable, new h5(this, 3)));
            futureSubmit.getClass();
            return futureSubmit;
        } catch (Exception e) {
            boolean z = u.a;
            t.a("VungleThreadPool", "submit exception", e);
            return new b(null);
        } catch (OutOfMemoryError e2) {
            StringBuilder sbA = l.a("submit error in ");
            sbA.append(a());
            sbA.append(": ");
            sbA.append(e2.getLocalizedMessage());
            String string = sbA.toString();
            boolean z2 = u.a;
            t.a("VungleThreadPool", string, e2);
            new OutOfMemory(string).logErrorNoReturnValue$vungle_ads_release();
            return new b(null);
        }
    }
}
