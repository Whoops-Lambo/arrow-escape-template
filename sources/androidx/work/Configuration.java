package androidx.work;

import androidx.work.impl.DefaultRunnableScheduler;
import defpackage.h50;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class Configuration {
    public final ExecutorService a;
    public final ExecutorService b;
    public final WorkerFactory c;
    public final InputMergerFactory d;
    public final DefaultRunnableScheduler e;
    public final int f;
    public final int g;
    public final int h;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class Builder {
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public interface Provider {
        Configuration a();
    }

    public Configuration(Builder builder) {
        final boolean z = true;
        final boolean z2 = false;
        this.a = Executors.newFixedThreadPool(Math.max(2, Math.min(Runtime.getRuntime().availableProcessors() - 1, 4)), new ThreadFactory() { // from class: androidx.work.Configuration.1
            public final AtomicInteger a = new AtomicInteger(0);

            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                StringBuilder sbP = h50.p(z2 ? "WM.task-" : "androidx.work-");
                sbP.append(this.a.incrementAndGet());
                return new Thread(runnable, sbP.toString());
            }
        });
        this.b = Executors.newFixedThreadPool(Math.max(2, Math.min(Runtime.getRuntime().availableProcessors() - 1, 4)), new ThreadFactory() { // from class: androidx.work.Configuration.1
            public final AtomicInteger a = new AtomicInteger(0);

            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                StringBuilder sbP = h50.p(z ? "WM.task-" : "androidx.work-");
                sbP.append(this.a.incrementAndGet());
                return new Thread(runnable, sbP.toString());
            }
        });
        String str = WorkerFactory.a;
        this.c = new WorkerFactory.AnonymousClass1();
        this.d = new InputMergerFactory.AnonymousClass1();
        this.e = new DefaultRunnableScheduler();
        this.f = 4;
        this.g = Integer.MAX_VALUE;
        this.h = 20;
    }
}
