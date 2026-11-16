package io.p071bidmachine.media3.exoplayer;

import android.os.HandlerThread;
import android.os.Looper;
import io.p071bidmachine.media3.common.util.a;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class v0 {
    public final Object a = new Object();
    public Looper b = null;
    public HandlerThread c = null;
    public int d = 0;

    public final void a() {
        HandlerThread handlerThread;
        synchronized (this.a) {
            try {
                a.i(this.d > 0);
                int i = this.d - 1;
                this.d = i;
                if (i == 0 && (handlerThread = this.c) != null) {
                    handlerThread.quit();
                    this.c = null;
                    this.b = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
