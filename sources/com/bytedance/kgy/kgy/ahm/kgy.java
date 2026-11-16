package com.bytedance.kgy.kgy.ahm;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public class kgy {
    private static ExecutorService kgy;

    public static ExecutorService kgy() {
        if (kgy == null) {
            synchronized (kgy.class) {
                try {
                    if (kgy == null) {
                        kgy = new ThreadPoolExecutor(1, 2, 60L, TimeUnit.SECONDS, new PriorityBlockingQueue(), new ThreadFactory() { // from class: com.bytedance.kgy.kgy.ahm.kgy.1
                            final AtomicInteger kgy = new AtomicInteger(0);

                            @Override // java.util.concurrent.ThreadFactory
                            public Thread newThread(Runnable runnable) {
                                return new Thread(null, runnable, "ALOG_SA_" + this.kgy.getAndIncrement());
                            }
                        });
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return kgy;
    }
}
