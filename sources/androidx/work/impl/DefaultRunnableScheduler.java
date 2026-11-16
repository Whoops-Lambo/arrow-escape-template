package androidx.work.impl;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.RestrictTo;
import androidx.core.os.HandlerCompat;
import androidx.work.RunnableScheduler;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
@RestrictTo
public class DefaultRunnableScheduler implements RunnableScheduler {
    public final Handler a = HandlerCompat.a(Looper.getMainLooper());

    @Override // androidx.work.RunnableScheduler
    public final void a(Runnable runnable) {
        this.a.removeCallbacks(runnable);
    }

    @Override // androidx.work.RunnableScheduler
    public final void b(long j, Runnable runnable) {
        this.a.postDelayed(runnable, j);
    }
}
