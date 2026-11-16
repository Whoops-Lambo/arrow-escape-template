package com.mbridge.msdk.tracker;

import android.util.Log;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
class j {
    private volatile ThreadPoolExecutor a;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class a implements ThreadFactory {
        public a() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new Thread(runnable, "MBridgeTrackThread");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class b implements Runnable {
        private final Runnable a;

        @Override // java.lang.Runnable
        public void run() {
            if (y.b(this.a)) {
                return;
            }
            try {
                this.a.run();
            } catch (Exception e) {
                if (com.mbridge.msdk.tracker.a.a) {
                    Log.e("TrackManager", "execute error", e);
                }
            }
        }

        public b(Runnable runnable) {
            this.a = runnable;
        }
    }

    public void a(Runnable runnable) {
        if (this.a == null) {
            this.a = a();
        }
        if (this.a.isShutdown()) {
            return;
        }
        this.a.execute(new b(runnable));
    }

    private ThreadPoolExecutor a() {
        return new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), new a(), new ThreadPoolExecutor.DiscardPolicy());
    }
}
