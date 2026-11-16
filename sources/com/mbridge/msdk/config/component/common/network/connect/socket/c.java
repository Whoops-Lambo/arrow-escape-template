package com.mbridge.msdk.config.component.common.network.connect.socket;

import com.mbridge.msdk.foundation.tools.m0;
import defpackage.q63;
import defpackage.qb3;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public class c {
    private static volatile c d;
    private final ConcurrentLinkedQueue<Runnable> a = new ConcurrentLinkedQueue<>();
    private ThreadPoolExecutor b;
    private final AtomicBoolean c;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class a implements ThreadFactory {
        private final AtomicInteger a = new AtomicInteger(1);

        public a() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable, "Socket-Thread-" + this.a.getAndIncrement());
            thread.setDaemon(true);
            return thread;
        }
    }

    private boolean b() {
        int iX;
        try {
            int iH = m0.h();
            return iH > 0 && (iX = m0.x()) > 0 && (((double) iH) / ((double) iX)) * 100.0d <= 5.0d;
        } catch (Exception e) {
            q63.r(e, new StringBuilder("Memory check failed: "), "SocketThreadPoolManager");
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c() {
        while (!this.a.isEmpty()) {
            try {
                Runnable runnablePoll = this.a.poll();
                if (runnablePoll != null) {
                    if ((runnablePoll instanceof b) && ((b) runnablePoll).e() != null) {
                        ((b) runnablePoll).e().callStart();
                    }
                    runnablePoll.run();
                }
            } catch (Throwable th) {
                this.c.set(false);
                if (!this.a.isEmpty()) {
                    d();
                }
                throw th;
            }
        }
        this.c.set(false);
        if (this.a.isEmpty()) {
            return;
        }
        d();
    }

    private void d() {
        if (this.c.compareAndSet(false, true)) {
            this.b.execute(new qb3(this, 6));
        }
    }

    public void a(Runnable runnable, com.mbridge.msdk.config.component.nori.monitor.a aVar) {
        if (runnable == null) {
            return;
        }
        if (b()) {
            if (aVar != null) {
                aVar.a("Memory low");
            }
        } else if (this.a.offer(runnable)) {
            if (aVar != null) {
                aVar.m();
                a(aVar);
            }
            d();
        }
    }

    private c() {
        int iAvailableProcessors = (Runtime.getRuntime().availableProcessors() * 2) + 1;
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(iAvailableProcessors, iAvailableProcessors, 10L, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), new a(), new ThreadPoolExecutor.DiscardPolicy());
        this.b = threadPoolExecutor;
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        this.c = new AtomicBoolean(false);
    }

    public static c a() {
        if (d == null) {
            synchronized (c.class) {
                try {
                    if (d == null) {
                        d = new c();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return d;
    }

    private void a(com.mbridge.msdk.config.component.nori.monitor.a aVar) {
        ThreadPoolExecutor threadPoolExecutor;
        if (aVar == null || (threadPoolExecutor = this.b) == null) {
            return;
        }
        aVar.a(threadPoolExecutor.getPoolSize(), this.b.getActiveCount(), this.b.getQueue().size());
    }
}
