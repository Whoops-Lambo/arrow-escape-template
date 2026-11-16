package com.mbridge.msdk.config.component.asy;

import android.os.Looper;
import android.os.Process;
import com.ironsource.C4664b4;
import com.mbridge.msdk.foundation.tools.q0;
import defpackage.qw;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class a {
    private static volatile ScheduledThreadPoolExecutor a;

    /* JADX INFO: renamed from: com.mbridge.msdk.config.component.asy.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class RunnableC1400a implements Runnable {
        private final int a;
        private final Runnable b;

        public RunnableC1400a(int i, Runnable runnable) {
            this.a = i;
            this.b = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            int threadPriority;
            try {
                threadPriority = Process.getThreadPriority(Process.myTid());
            } catch (Throwable unused) {
                threadPriority = 0;
            }
            try {
                Process.setThreadPriority(this.a);
                this.b.run();
            } catch (Throwable th) {
                try {
                    q0.b("AsyDispatchQueue", th.getMessage(), th);
                } finally {
                    try {
                        Process.setThreadPriority(threadPriority);
                    } catch (Throwable unused2) {
                    }
                }
            }
        }
    }

    public static void a(String str, Runnable runnable) {
        if (runnable == null) {
            return;
        }
        if (!C4664b4.i.Z.equals(str)) {
            a().execute(new RunnableC1400a(a(str), runnable));
        } else if (Looper.myLooper() == Looper.getMainLooper()) {
            runnable.run();
        } else {
            com.mbridge.msdk.foundation.same.threadpool.a.c().post(runnable);
        }
    }

    private a() {
    }

    public static void a(long j, Runnable runnable) {
        if (runnable == null) {
            return;
        }
        a().schedule(runnable, j, TimeUnit.MILLISECONDS);
    }

    private static int a(String str) {
        if ("bg_default".equals(str)) {
            return 0;
        }
        return "bg_low".equals(str) ? 10 : -2;
    }

    private static ScheduledThreadPoolExecutor a() {
        if (a == null) {
            synchronized (a.class) {
                try {
                    if (a == null) {
                        a = new ScheduledThreadPoolExecutor(2, new qw(4, new AtomicInteger(1)), new ThreadPoolExecutor.CallerRunsPolicy());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Thread a(AtomicInteger atomicInteger, Runnable runnable) {
        Thread thread = new Thread(runnable, "PipelineAsync-" + atomicInteger.getAndIncrement());
        thread.setDaemon(true);
        return thread;
    }
}
