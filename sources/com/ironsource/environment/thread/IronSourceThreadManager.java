package com.ironsource.environment.thread;

import android.os.Handler;
import com.ironsource.C4907oe;
import com.ironsource.C4950r4;
import com.ironsource.Ef;
import com.ironsource.Ff;
import com.ironsource.Z9;
import defpackage.af0;
import defpackage.cm2;
import defpackage.d21;
import defpackage.gd1;
import defpackage.tk0;
import defpackage.uf0;
import defpackage.vk3;
import defpackage.xe0;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class IronSourceThreadManager {
    private static boolean a;

    @NotNull
    public static final IronSourceThreadManager INSTANCE = new IronSourceThreadManager();

    @NotNull
    private static final gd1 b = new cm2(new d21(7));

    @NotNull
    private static final gd1 c = new cm2(new d21(8));

    @NotNull
    private static final gd1 d = new cm2(new d21(9));

    @NotNull
    private static final gd1 e = new cm2(new d21(10));

    @NotNull
    private static final gd1 f = new cm2(new d21(11));

    @NotNull
    private static final gd1 g = new cm2(new d21(12));

    @NotNull
    private static final gd1 h = new cm2(new d21(13));

    @NotNull
    private static final gd1 i = new cm2(new d21(14));

    private final boolean a(Runnable runnable) {
        return a && d().getQueue().contains(runnable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C4907oe b() {
        return new C4907oe(0, null, 3, 0 == true ? 1 : 0);
    }

    private final Z9 c() {
        return (Z9) g.getValue();
    }

    private final C4907oe d() {
        return (C4907oe) i.getValue();
    }

    private final Z9 e() {
        return (Z9) f.getValue();
    }

    private final Z9 f() {
        return (Z9) h.getValue();
    }

    private final Ef g() {
        return (Ef) c.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Handler h() {
        Z9 z9 = new Z9("IronSourceInitiatorHandler");
        z9.start();
        z9.a();
        return new Handler(z9.getLooper());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final b i() {
        return b.c.a("LevelPlayThread");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Z9 j() {
        Z9 z9 = new Z9("mediationBackground");
        z9.start();
        z9.a();
        return z9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Z9 k() {
        Z9 z9 = new Z9("publisher-callbacks");
        z9.start();
        z9.a();
        return z9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Ef l() {
        return new Ef(null, null, null, 7, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Z9 m() {
        Z9 z9 = new Z9("managersThread");
        z9.start();
        z9.a();
        return z9;
    }

    public static /* synthetic */ void postAdapterBackgroundTask$default(IronSourceThreadManager ironSourceThreadManager, Runnable runnable, long j, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            j = 0;
        }
        ironSourceThreadManager.postAdapterBackgroundTask(runnable, j);
    }

    public static /* synthetic */ void postMediationBackgroundTask$default(IronSourceThreadManager ironSourceThreadManager, Runnable runnable, long j, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            j = 0;
        }
        ironSourceThreadManager.postMediationBackgroundTask(runnable, j);
    }

    public static /* synthetic */ Ff.a postOnUiThreadTask$default(IronSourceThreadManager ironSourceThreadManager, Runnable runnable, long j, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            j = 0;
        }
        return ironSourceThreadManager.postOnUiThreadTask(runnable, j);
    }

    public static /* synthetic */ void postPublisherCallback$default(IronSourceThreadManager ironSourceThreadManager, Runnable runnable, long j, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            j = 0;
        }
        ironSourceThreadManager.postPublisherCallback(runnable, j);
    }

    @NotNull
    public final Handler getInitHandler() {
        return (Handler) d.getValue();
    }

    @NotNull
    public final b getLevelPlayThread() {
        return (b) b.getValue();
    }

    @NotNull
    public final Z9 getSharedManagersThread() {
        return (Z9) e.getValue();
    }

    @NotNull
    public final ThreadPoolExecutor getThreadPoolExecutor() {
        return new ThreadPoolExecutor(Runtime.getRuntime().availableProcessors(), Runtime.getRuntime().availableProcessors(), Long.MAX_VALUE, TimeUnit.NANOSECONDS, new LinkedBlockingQueue());
    }

    public final boolean getUseSharedExecutorService() {
        return a;
    }

    public final void setUseSharedExecutorService(boolean z) {
        a = z;
    }

    private IronSourceThreadManager() {
    }

    public final void executeTasks(boolean z, boolean z2, @NotNull List<? extends Runnable> list) {
        list.getClass();
        if (!z) {
            Iterator<? extends Runnable> it = list.iterator();
            while (it.hasNext()) {
                it.next().run();
            }
            return;
        }
        if (!z2) {
            Iterator<? extends Runnable> it2 = list.iterator();
            while (it2.hasNext()) {
                postMediationBackgroundTask$default(INSTANCE, it2.next(), 0L, 2, null);
            }
            return;
        }
        CountDownLatch countDownLatch = new CountDownLatch(list.size());
        Iterator<? extends Runnable> it3 = list.iterator();
        while (it3.hasNext()) {
            postMediationBackgroundTask$default(INSTANCE, new tk0(21, it3.next(), countDownLatch), 0L, 2, null);
        }
        try {
            countDownLatch.await();
        } catch (InterruptedException e2) {
            C4950r4.d().a(e2);
        }
    }

    public final void postAdapterBackgroundTask(@NotNull Runnable runnable) {
        runnable.getClass();
        postAdapterBackgroundTask$default(this, runnable, 0L, 2, null);
    }

    public final void postMediationBackgroundTask(@NotNull Runnable runnable, long j) {
        runnable.getClass();
        if (a) {
            d().schedule(runnable, j, TimeUnit.MILLISECONDS);
        } else {
            e().a(runnable, j);
        }
    }

    @NotNull
    public final Ff.a postOnUiThreadTask(@NotNull Runnable runnable, long j) {
        runnable.getClass();
        Ef efG = g();
        uf0 uf0Var = xe0.b;
        return efG.a(runnable, vk3.x(j, af0.MILLISECONDS));
    }

    public final void postPublisherCallback(@NotNull Runnable runnable) {
        runnable.getClass();
        postPublisherCallback$default(this, runnable, 0L, 2, null);
    }

    public final void removeAdapterBackgroundTask(@NotNull Runnable runnable) {
        runnable.getClass();
        if (a(runnable)) {
            d().remove(runnable);
        } else {
            c().b(runnable);
        }
    }

    public final void removeMediationBackgroundTask(@NotNull Runnable runnable) {
        runnable.getClass();
        if (a(runnable)) {
            d().remove(runnable);
        } else {
            e().b(runnable);
        }
    }

    public final void postAdapterBackgroundTask(@NotNull Runnable runnable, long j) {
        runnable.getClass();
        c().a(runnable, j);
    }

    public final void postPublisherCallback(@NotNull Runnable runnable, long j) {
        runnable.getClass();
        f().a(runnable, j);
    }

    @NotNull
    public final Ff.a postOnUiThreadTask(@NotNull Runnable runnable) {
        runnable.getClass();
        return postOnUiThreadTask$default(this, runnable, 0L, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Z9 a() {
        Z9 z9 = new Z9("adapterBackground");
        z9.start();
        z9.a();
        return z9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(Runnable runnable, CountDownLatch countDownLatch) {
        runnable.run();
        a(countDownLatch);
    }

    public final void postMediationBackgroundTask(@NotNull Runnable runnable) {
        runnable.getClass();
        postMediationBackgroundTask$default(this, runnable, 0L, 2, null);
    }

    private static final void a(CountDownLatch countDownLatch) {
        countDownLatch.countDown();
    }
}
