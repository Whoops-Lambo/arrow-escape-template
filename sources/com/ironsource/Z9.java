package com.ironsource;

import android.os.Handler;
import android.os.HandlerThread;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public final class Z9 extends HandlerThread {

    @Nullable
    private Handler a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Z9(@NotNull String str) {
        super(str);
        str.getClass();
    }

    public final void a(@NotNull Runnable runnable) {
        runnable.getClass();
        a(this, runnable, 0L, 2, null);
    }

    public final void b(@NotNull Runnable runnable) {
        runnable.getClass();
        Handler handler = this.a;
        if (handler != null) {
            handler.removeCallbacks(runnable);
        }
    }

    public static /* synthetic */ void a(Z9 z9, Runnable runnable, long j, int i, Object obj) {
        if ((i & 2) != 0) {
            j = 0;
        }
        z9.a(runnable, j);
    }

    public final void a(@NotNull Runnable runnable, long j) {
        runnable.getClass();
        Handler handler = this.a;
        if (handler != null) {
            handler.postDelayed(runnable, j);
        }
    }

    public final void a() {
        this.a = new Handler(getLooper());
    }
}
