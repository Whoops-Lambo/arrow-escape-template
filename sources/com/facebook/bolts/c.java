package com.facebook.bolts;

import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class c implements Executor {
    public static c c;
    public final /* synthetic */ int a;
    public final Object b;

    public c(int i) {
        this.a = i;
        switch (i) {
            case 1:
                int iAvailableProcessors = Runtime.getRuntime().availableProcessors() * 2;
                this.b = new ThreadPoolExecutor(iAvailableProcessors, iAvailableProcessors, 0L, TimeUnit.MICROSECONDS, new LinkedBlockingQueue());
                break;
            default:
                this.b = new ThreadLocal();
                break;
        }
    }

    public static c b() {
        if (c == null) {
            c = new c(1);
        }
        return c;
    }

    public void a() {
        ThreadLocal threadLocal = (ThreadLocal) this.b;
        Integer num = (Integer) threadLocal.get();
        if (num == null) {
            num = 0;
        }
        int iIntValue = num.intValue() - 1;
        if (iIntValue == 0) {
            threadLocal.remove();
        } else {
            threadLocal.set(Integer.valueOf(iIntValue));
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                runnable.getClass();
                ThreadLocal threadLocal = (ThreadLocal) obj;
                Integer num = (Integer) threadLocal.get();
                if (num == null) {
                    num = 0;
                }
                int iIntValue = num.intValue() + 1;
                threadLocal.set(Integer.valueOf(iIntValue));
                try {
                    if (iIntValue <= 15) {
                        runnable.run();
                    } else {
                        d.d.a.execute(runnable);
                    }
                    a();
                    return;
                } catch (Throwable th) {
                    a();
                    throw th;
                }
            default:
                ((ThreadPoolExecutor) obj).execute(runnable);
                return;
        }
    }
}
