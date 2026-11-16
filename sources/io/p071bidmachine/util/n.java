package io.p071bidmachine.util;

import android.os.Looper;
import io.p071bidmachine.media3.exoplayer.video.x;
import io.p071bidmachine.util.taskmanager.handler.a;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public abstract class n {
    public static final a a;

    static {
        Looper mainLooper = Looper.getMainLooper();
        mainLooper.getClass();
        a = new a(mainLooper);
    }

    public static final void a(Runnable runnable) {
        a.a(runnable);
    }

    public static void b(h hVar, f fVar) {
        if (fVar == null) {
            return;
        }
        a(new x(9, fVar, hVar));
    }
}
