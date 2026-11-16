package com.adsurge.adn.R;

import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public class c implements com.adsurge.adn.G0.c {
    public static final com.adsurge.adn.G0.c c = new c();
    public PriorityBlockingQueue b = new PriorityBlockingQueue(15);
    public final ExecutorService a = new ThreadPoolExecutor(5, 10, 180, TimeUnit.SECONDS, this.b, new a());

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class a implements ThreadFactory {
        public a() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new Thread(runnable, "GDT_NET_THREAD");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class b extends FutureTask implements Comparable {
        public final com.adsurge.adn.G0.c.a a;

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(b bVar) {
            if (bVar == null) {
                return 1;
            }
            return this.a.b() - bVar.a.b();
        }

        public b(Callable callable, com.adsurge.adn.G0.c.a aVar) {
            super(callable);
            this.a = aVar;
        }
    }

    /* JADX INFO: renamed from: com.adsurge.adn.R.c$c, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class CallableC0090c implements Callable {
        public final com.adsurge.adn.H0.a a;
        public final com.adsurge.adn.G0.b b;

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public com.adsurge.adn.H0.b call() throws Exception {
            com.adsurge.adn.H0.b bVarB;
            Exception exc = null;
            try {
                bVarB = b();
            } catch (Exception e) {
                bVarB = null;
                exc = e;
            }
            if (exc == null) {
                com.adsurge.adn.G0.b bVar = this.b;
                if (bVar != null) {
                    bVar.a(this.a, bVarB);
                }
                if (this.a.h()) {
                    bVarB.close();
                }
            } else {
                if (bVarB != null) {
                    bVarB.close();
                }
                com.adsurge.adn.G0.b bVar2 = this.b;
                if (bVar2 == null) {
                    throw exc;
                }
                bVar2.a(this.a, exc);
            }
            return bVarB;
        }

        public final com.adsurge.adn.H0.b b() {
            ArrayList arrayList = new ArrayList();
            arrayList.add(new com.adsurge.adn.S.b());
            return new com.adsurge.adn.R.b(0, arrayList, this.a).a(this.a);
        }

        public CallableC0090c(com.adsurge.adn.H0.a aVar, com.adsurge.adn.G0.b bVar) {
            this.a = aVar;
            this.b = bVar;
        }

        public CallableC0090c(com.adsurge.adn.H0.a aVar) {
            this(aVar, null);
        }
    }

    public Future a(com.adsurge.adn.H0.a aVar, com.adsurge.adn.G0.c.a aVar2, com.adsurge.adn.G0.b bVar, Executor executor) {
        if (executor == null) {
            return null;
        }
        b bVar2 = new b(new CallableC0090c(aVar, bVar), aVar2);
        executor.execute(bVar2);
        this.b.size();
        return bVar2;
    }

    @Override // com.adsurge.adn.G0.c
    public Future a(com.adsurge.adn.H0.a aVar) {
        return a(aVar, com.adsurge.adn.G0.c.a.Mid);
    }

    @Override // com.adsurge.adn.G0.c
    public Future a(com.adsurge.adn.H0.a aVar, com.adsurge.adn.G0.c.a aVar2) {
        b bVar = new b(new CallableC0090c(aVar), aVar2);
        this.a.execute(bVar);
        this.b.size();
        return bVar;
    }

    @Override // com.adsurge.adn.G0.c
    public Future a(com.adsurge.adn.H0.a aVar, com.adsurge.adn.G0.c.a aVar2, com.adsurge.adn.G0.b bVar) {
        return a(aVar, aVar2, bVar, this.a);
    }

    public static com.adsurge.adn.G0.c a() {
        return c;
    }

    @Override // com.adsurge.adn.G0.c
    public Future a(com.adsurge.adn.H0.a aVar, com.adsurge.adn.G0.b bVar) {
        return a(aVar, com.adsurge.adn.G0.c.a.Mid, bVar);
    }
}
