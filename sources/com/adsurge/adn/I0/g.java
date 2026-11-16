package com.adsurge.adn.I0;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
public abstract class g {
    public static final Looper a = Looper.getMainLooper();
    public static Handler b;

    public static Handler a() {
        if (b == null) {
            b = new Handler(a);
        }
        return b;
    }

    public static boolean c(Runnable runnable) {
        if (runnable == null) {
            return false;
        }
        if (Thread.currentThread() != a.getThread()) {
            return a(runnable);
        }
        runnable.run();
        return true;
    }

    public static final void d(Runnable runnable) {
        if (runnable == null) {
            return;
        }
        a().removeCallbacks(runnable);
    }

    public static final boolean b(Runnable runnable) {
        if (Thread.currentThread() == a.getThread()) {
            runnable.run();
            return true;
        }
        return a().postAtFrontOfQueue(runnable);
    }

    public static final boolean a(Runnable runnable) {
        return a().post(runnable);
    }

    public static final boolean a(Runnable runnable, long j) {
        return a().postDelayed(runnable, j);
    }
}
