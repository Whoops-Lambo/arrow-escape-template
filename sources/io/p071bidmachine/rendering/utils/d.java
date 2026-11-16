package io.p071bidmachine.rendering.utils;

import android.os.Handler;
import android.os.Looper;
import io.p071bidmachine.rendering.utils.taskmanager.b;
import io.p071bidmachine.util.c;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public abstract class d {
    public static final b a = new b();

    public static void a(Runnable runnable) {
        a.getClass();
        try {
            if (runnable instanceof c) {
                ((c) runnable).a(false);
            }
        } catch (Throwable unused) {
        }
        Looper looperMyLooper = Looper.myLooper();
        Handler handler = b.a;
        if (looperMyLooper == handler.getLooper()) {
            runnable.run();
        } else {
            handler.post(runnable);
        }
    }
}
