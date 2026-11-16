package com.bytedance.sdk.component.gf.ahm;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import com.inmobi.media.core.config.models.CrashConfig;
import com.vungle.ads.internal.protos.Sdk;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public class yo extends ThreadPoolExecutor implements AutoCloseable {
    private int ahm;
    private boolean ct;
    private final String kgy;
    private int rz;
    private int uq;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class kgy {
        private String kgy = "cache";
        private int ahm = 4;
        private int rz = 100;
        private int uq = 0;
        private long ct = CrashConfig.DEFAULT_INCOMPLETE_LOG_THRESHOLD_INTERVAL;
        private boolean noq = false;
        private TimeUnit yo = TimeUnit.MILLISECONDS;
        private boolean fi = false;
        private BlockingQueue<Runnable> gf = new PriorityBlockingQueue();
        private ThreadFactory ra = null;

        public yo kgy() {
            if (this.ra == null) {
                this.ra = new ct(this.kgy);
            }
            if (this.ahm < 0) {
                this.ahm = 8;
            }
            if (this.ahm == 0) {
                this.gf = new SynchronousQueue();
            }
            if (this.gf == null) {
                this.gf = new LinkedBlockingQueue();
            }
            if (this.rz > 100) {
                this.rz = 100;
            }
            int i = this.rz;
            int i2 = this.ahm;
            if (i < i2) {
                this.rz = i2;
            }
            return new yo(this);
        }

        public kgy ahm(int i) {
            this.rz = i;
            return this;
        }

        public kgy ct(int i) {
            return this;
        }

        public kgy rz(int i) {
            this.uq = i;
            return this;
        }

        public kgy uq(int i) {
            return this;
        }

        public kgy ahm(boolean z) {
            this.fi = z;
            return this;
        }

        public kgy kgy(String str) {
            this.kgy = str;
            return this;
        }

        public kgy kgy(int i) {
            this.ahm = i;
            return this;
        }

        public kgy kgy(long j) {
            this.ct = j;
            return this;
        }

        public kgy kgy(boolean z) {
            this.noq = z;
            return this;
        }

        public kgy kgy(BlockingQueue<Runnable> blockingQueue) {
            this.gf = blockingQueue;
            return this;
        }
    }

    private void rz() {
        try {
            if (this.ahm != 0 && getCorePoolSize() < this.rz) {
                int size = getQueue().size();
                if (getActiveCount() < this.ahm || size < this.uq) {
                    return;
                }
                setCorePoolSize(this.rz);
            }
        } catch (Exception e) {
            com.bytedance.sdk.openadsdk.fpz.rz.kgy(e, "WOEg2wGlfcKES9leiV+zLFCgLpoOrGbJhUTDE5gZsi1a6mOFArs=", "a+8qoQuubMaEethSgDS4LVj7OZoR", "UuAuhwa9esK0RfpclCWoOl7vKQ==", Sdk.SDKError.Reason.TPAT_ERROR_VALUE);
            e.getMessage();
        }
    }

    private void uq() {
        try {
            if (this.ahm != 0 && getCorePoolSize() > this.ahm && getQueue().size() == 0) {
                setCorePoolSize(this.ahm);
            }
        } catch (Exception e) {
            com.bytedance.sdk.openadsdk.fpz.rz.kgy(e, "WOEg2wGlfcKES9leiV+zLFCgLpoOrGbJhUTDE5gZsi1a6mOFArs=", "a+8qoQuubMaEethSgDS4LVj7OZoR", "SespgAC5XcijRcVYuBmyLVrq", 142);
            e.getMessage();
        }
    }

    @Override // java.util.concurrent.ThreadPoolExecutor
    public void afterExecute(Runnable runnable, Throwable th) {
        boolean z = runnable instanceof rz;
        if (z) {
            ((rz) runnable).setAfterTimestamp(SystemClock.elapsedRealtime());
        }
        super.afterExecute(runnable, th);
        if (z) {
            rz rzVar = (rz) runnable;
            rzVar.getName();
            rzVar.getPriority();
            rzVar.getSubmitTimestamp();
            rzVar.getBeforeTimestamp();
            rzVar.getAfterTimestamp();
        }
        uq();
    }

    public boolean ahm() {
        return this.ct;
    }

    @Override // java.util.concurrent.ThreadPoolExecutor
    public void beforeExecute(Thread thread, Runnable runnable) {
        if (runnable instanceof rz) {
            ((rz) runnable).setBeforeTimestamp(SystemClock.elapsedRealtime());
        }
        super.beforeExecute(thread, runnable);
    }

    @Override // java.util.concurrent.ThreadPoolExecutor, java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        com.bytedance.sdk.component.gf.ahm.kgy kgyVarKgy;
        if (!(runnable instanceof rz)) {
            runnable = new rz("unknown", runnable) { // from class: com.bytedance.sdk.component.gf.ahm.yo.2
                @Override // java.lang.Runnable
                public void run() {
                    Runnable target = getTarget();
                    if (target != null) {
                        target.run();
                    }
                }
            };
        }
        if (!"cache".equals(this.kgy)) {
            String name = Thread.currentThread().getName();
            if (!TextUtils.isEmpty(name) && name.startsWith(ct.kgy(this.kgy)) && (kgyVarKgy = uq.kgy()) != null) {
                kgyVarKgy.kgy(this, (rz) runnable);
            }
        }
        ((rz) runnable).setSubmitTimestamp(SystemClock.elapsedRealtime());
        try {
            super.execute(runnable);
            rz();
        } catch (Throwable th) {
            com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgLpoOrGbJhUTDE5gZsi1a6mOFArs=", "a+8qoQuubMaEethSgDS4LVj7OZoR", "XvYolhaobA==", 203);
            kgy(runnable, th);
        }
    }

    @Override // java.util.concurrent.ThreadPoolExecutor, java.util.concurrent.ExecutorService
    public void shutdown() {
        if ("aidl".equals(this.kgy)) {
            return;
        }
        super.shutdown();
    }

    @Override // java.util.concurrent.ThreadPoolExecutor, java.util.concurrent.ExecutorService
    public List<Runnable> shutdownNow() {
        return "aidl".equals(this.kgy) ? Collections.EMPTY_LIST : super.shutdownNow();
    }

    private yo(kgy kgyVar) {
        super(kgyVar.ahm, Integer.MAX_VALUE, kgyVar.ct, kgyVar.yo, (BlockingQueue<Runnable>) kgyVar.gf, kgyVar.ra);
        this.ct = false;
        String unused = kgyVar.kgy;
        int unused2 = kgyVar.ahm;
        int unused3 = kgyVar.rz;
        long unused4 = kgyVar.ct;
        int unused5 = kgyVar.uq;
        boolean unused6 = kgyVar.fi;
        BlockingQueue unused7 = kgyVar.gf;
        this.kgy = kgyVar.kgy;
        this.ahm = kgyVar.ahm;
        this.rz = kgyVar.rz;
        this.uq = kgyVar.uq;
        allowCoreThreadTimeOut(kgyVar.noq);
        this.ct = kgyVar.fi;
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

    public void kgy(kgy kgyVar) {
        try {
            if (kgyVar.ahm >= 0 && this.ahm != kgyVar.ahm) {
                int i = kgyVar.ahm;
                this.ahm = i;
                setCorePoolSize(i);
            }
            this.rz = kgyVar.rz;
            this.uq = kgyVar.uq;
            allowCoreThreadTimeOut(kgyVar.noq);
            this.ct = kgyVar.fi;
        } catch (Throwable th) {
            com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgLpoOrGbJhUTDE5gZsi1a6mOFArs=", "a+8qoQuubMaEethSgDS4LVj7OZoR", "Tv4plBe5SsiOTN5a", 72);
            th.getMessage();
        }
        String unused = kgyVar.kgy;
        int unused2 = kgyVar.ahm;
        int unused3 = kgyVar.rz;
        long unused4 = kgyVar.ct;
        int unused5 = kgyVar.uq;
        boolean unused6 = kgyVar.fi;
        BlockingQueue unused7 = kgyVar.gf;
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public Future<?> submit(Runnable runnable) {
        int priority;
        String name;
        runnable.getClass();
        final RunnableFuture runnableFutureNewTaskFor = newTaskFor(runnable, null);
        if (runnable instanceof rz) {
            rz rzVar = (rz) runnable;
            priority = rzVar.getPriority();
            name = rzVar.getName();
        } else {
            priority = 6;
            name = "";
        }
        if (priority == 0 || TextUtils.isEmpty(name)) {
            new RuntimeException();
        }
        execute(new rz(name, priority) { // from class: com.bytedance.sdk.component.gf.ahm.yo.1
            @Override // java.lang.Runnable
            public void run() {
                runnableFutureNewTaskFor.run();
            }
        });
        return runnableFutureNewTaskFor;
    }

    private void kgy(Runnable runnable, Throwable th) {
        try {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                Handler handlerAhm = uq.ahm();
                if (handlerAhm != null) {
                    handlerAhm.post(runnable);
                    return;
                }
                return;
            }
            runnable.run();
        } catch (Throwable th2) {
            com.bytedance.sdk.openadsdk.fpz.rz.kgy(th2, "WOEg2wGlfcKES9leiV+zLFCgLpoOrGbJhUTDE5gZsi1a6mOFArs=", "a+8qoQuubMaEethSgDS4LVj7OZoR", "VOAIjQa/fNOFbNZUgBSk", Sdk.SDKError.Reason.AD_LOAD_FAIL_PLACEMENT_ID_MISMATCH_VALUE);
        }
    }

    public int kgy() {
        return this.rz;
    }
}
