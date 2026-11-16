package com.ironsource;

import android.os.Handler;
import android.os.HandlerThread;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
final class F5 extends HandlerThread {

    @Nullable
    private Handler a;

    public final void a() {
        this.a = new Handler(getLooper());
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public F5(@NotNull String str) {
        super(str);
        str.getClass();
    }

    public final void a(@NotNull Runnable runnable) {
        runnable.getClass();
        Handler handler = this.a;
        if (handler != null) {
            handler.post(runnable);
        }
    }
}
