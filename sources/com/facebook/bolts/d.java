package com.facebook.bolts;

import defpackage.dk2;
import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class d {
    public static final d d = new d();
    public final ExecutorService a;
    public final ScheduledExecutorService b;
    public final c c;

    public d() {
        boolean zO;
        ExecutorService executorServiceNewCachedThreadPool;
        String property = System.getProperty("java.runtime.name");
        if (property == null) {
            zO = false;
        } else {
            Locale locale = Locale.US;
            locale.getClass();
            String lowerCase = property.toLowerCase(locale);
            lowerCase.getClass();
            zO = dk2.O(lowerCase, "android", false);
        }
        if (!zO) {
            executorServiceNewCachedThreadPool = Executors.newCachedThreadPool();
            executorServiceNewCachedThreadPool.getClass();
        } else {
            b bVar = b.b;
            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(b.c, b.d, 1L, TimeUnit.SECONDS, new LinkedBlockingQueue());
            threadPoolExecutor.allowCoreThreadTimeOut(true);
            executorServiceNewCachedThreadPool = threadPoolExecutor;
        }
        this.a = executorServiceNewCachedThreadPool;
        ScheduledExecutorService scheduledExecutorServiceNewSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor();
        scheduledExecutorServiceNewSingleThreadScheduledExecutor.getClass();
        this.b = scheduledExecutorServiceNewSingleThreadScheduledExecutor;
        this.c = new c(0);
    }
}
