package io.p071bidmachine.util.taskmanager.handler;

import android.os.Handler;
import android.os.Looper;
import defpackage.s71;
import io.p071bidmachine.util.taskmanager.a;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public class b extends a {
    public final Handler a;

    public b(Looper looper) {
        this.a = new Handler(looper);
    }

    @Override // io.p071bidmachine.util.taskmanager.a
    public final void d(Runnable runnable) {
        runnable.getClass();
        this.a.removeCallbacks(runnable);
    }

    @Override // io.p071bidmachine.util.taskmanager.a
    public final void e(long j, Runnable runnable) {
        runnable.getClass();
        Handler handler = this.a;
        if (j > 0) {
            handler.postDelayed(runnable, j);
        } else if (s71.b(Looper.myLooper(), handler.getLooper())) {
            runnable.run();
        } else {
            handler.post(runnable);
        }
    }

    public b(Handler handler) {
        this.a = handler;
    }
}
