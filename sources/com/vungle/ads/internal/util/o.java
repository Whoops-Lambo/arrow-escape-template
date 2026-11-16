package com.vungle.ads.internal.util;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class o {
    public final Handler a = new Handler(Looper.getMainLooper());

    public final void a(Runnable runnable, long j) {
        runnable.getClass();
        this.a.postAtTime(runnable, SystemClock.uptimeMillis() + j);
    }
}
