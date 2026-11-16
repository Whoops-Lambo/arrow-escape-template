package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.ClientLibraryUtils;
import defpackage.b72;
import defpackage.fu4;
import defpackage.n24;
import defpackage.o24;
import defpackage.ru4;
import defpackage.ux3;
import defpackage.uy3;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzcgv {
    public static final o24 a;
    public static final o24 b;
    public static final o24 c;
    public static final n24 d;
    public static final ru4 e;
    public static final o24 f;
    public static final ExecutorService g;
    public static final o24 h;

    /* JADX WARN: Code duplicated, block: B:14:0x008d  */
    static {
        ExecutorService threadPoolExecutor;
        ExecutorService executorServiceUnconfigurableExecutorService;
        ExecutorService executorServiceUnconfigurableExecutorService2;
        if (ClientLibraryUtils.isPackageSide()) {
            threadPoolExecutor = Executors.unconfigurableExecutorService(Executors.newCachedThreadPool(new ux3("Default")));
        } else {
            uy3 uy3Var = zzbjr.dd;
            if (com.google.android.gms.ads.internal.client.zzba.zzc().b(uy3Var) != null && ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().b(uy3Var)).booleanValue()) {
                uy3 uy3Var2 = zzbjr.ed;
                if (com.google.android.gms.ads.internal.client.zzba.zzc().b(uy3Var2) != null) {
                    uy3 uy3Var3 = zzbjr.fd;
                    if (com.google.android.gms.ads.internal.client.zzba.zzc().b(uy3Var3) != null) {
                        ThreadPoolExecutor threadPoolExecutor2 = new ThreadPoolExecutor(((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().b(uy3Var2)).intValue(), ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().b(uy3Var2)).intValue(), 10L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ux3("Default"));
                        threadPoolExecutor2.allowCoreThreadTimeOut(((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().b(uy3Var3)).booleanValue());
                        threadPoolExecutor = threadPoolExecutor2;
                    } else {
                        threadPoolExecutor = new ThreadPoolExecutor(2, Integer.MAX_VALUE, 10L, TimeUnit.SECONDS, new SynchronousQueue(), new ux3("Default"));
                    }
                } else {
                    threadPoolExecutor = new ThreadPoolExecutor(2, Integer.MAX_VALUE, 10L, TimeUnit.SECONDS, new SynchronousQueue(), new ux3("Default"));
                }
            } else {
                threadPoolExecutor = new ThreadPoolExecutor(2, Integer.MAX_VALUE, 10L, TimeUnit.SECONDS, new SynchronousQueue(), new ux3("Default"));
            }
        }
        a = new o24((Executor) threadPoolExecutor);
        if (ClientLibraryUtils.isPackageSide()) {
            ux3 ux3Var = new ux3("Loader");
            ThreadPoolExecutor threadPoolExecutor3 = new ThreadPoolExecutor(5, 5, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), ux3Var);
            threadPoolExecutor3.allowCoreThreadTimeOut(true);
            executorServiceUnconfigurableExecutorService = Executors.unconfigurableExecutorService(threadPoolExecutor3);
        } else {
            ThreadPoolExecutor threadPoolExecutor4 = new ThreadPoolExecutor(5, 5, 10L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ux3("Loader"));
            threadPoolExecutor4.allowCoreThreadTimeOut(true);
            executorServiceUnconfigurableExecutorService = threadPoolExecutor4;
        }
        b = new o24((Executor) executorServiceUnconfigurableExecutorService);
        if (ClientLibraryUtils.isPackageSide()) {
            ux3 ux3Var2 = new ux3("Activeview");
            ThreadPoolExecutor threadPoolExecutor5 = new ThreadPoolExecutor(1, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), ux3Var2);
            threadPoolExecutor5.allowCoreThreadTimeOut(true);
            executorServiceUnconfigurableExecutorService2 = Executors.unconfigurableExecutorService(threadPoolExecutor5);
        } else {
            ThreadPoolExecutor threadPoolExecutor6 = new ThreadPoolExecutor(1, 1, 10L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ux3("Activeview"));
            threadPoolExecutor6.allowCoreThreadTimeOut(true);
            executorServiceUnconfigurableExecutorService2 = threadPoolExecutor6;
        }
        c = new o24((Executor) executorServiceUnconfigurableExecutorService2);
        n24 n24Var = new n24(3, new ux3("Schedule"));
        d = n24Var;
        e = new ru4(n24Var);
        f = new o24(new b72());
        g = Executors.newSingleThreadExecutor(new ux3("AdQualityMetrics"));
        h = new o24(fu4.a);
    }
}
