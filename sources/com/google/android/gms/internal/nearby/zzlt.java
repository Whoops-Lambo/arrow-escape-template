package com.google.android.gms.internal.nearby;

import androidx.collection.SimpleArrayMap;
import com.google.android.gms.common.util.IOUtils;
import java.io.Closeable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class zzlt {
    public final ExecutorService a;
    public final SimpleArrayMap b;
    public final SimpleArrayMap c;
    public final SimpleArrayMap d;

    public final synchronized void a(long j) {
        SimpleArrayMap simpleArrayMap = this.b;
        Long lValueOf = Long.valueOf(j);
        IOUtils.closeQuietly((Closeable) simpleArrayMap.get(lValueOf));
        this.b.remove(lValueOf);
        IOUtils.closeQuietly((Closeable) this.c.get(lValueOf));
        this.c.remove(lValueOf);
        zzmb zzmbVar = (zzmb) this.d.remove(lValueOf);
        if (zzmbVar != null) {
            IOUtils.closeQuietly(zzmbVar.d);
            IOUtils.closeQuietly(zzmbVar.g);
        }
    }

    public zzlt() {
        ThreadFactory threadFactoryDefaultThreadFactory = Executors.defaultThreadFactory();
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(6, 6, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), threadFactoryDefaultThreadFactory);
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        this.a = Executors.unconfigurableExecutorService(threadPoolExecutor);
        this.b = new SimpleArrayMap(0);
        this.c = new SimpleArrayMap(0);
        this.d = new SimpleArrayMap(0);
    }
}
