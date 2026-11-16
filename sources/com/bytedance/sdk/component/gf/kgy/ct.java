package com.bytedance.sdk.component.gf.kgy;

import android.os.Handler;
import android.os.HandlerThread;
import com.bytedance.sdk.component.utils.sx;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
final class ct {
    private static volatile ct kgy;
    private volatile HandlerThread ahm;
    private volatile Handler rz;

    public static ct kgy() {
        if (kgy == null) {
            synchronized (ct.class) {
                try {
                    if (kgy == null) {
                        kgy = new ct();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return kgy;
    }

    private boolean rz() {
        return (this.ahm == null || this.rz == null || !this.ahm.isAlive()) ? false : true;
    }

    private ct() {
        ahm();
    }

    private void ahm() {
        try {
            if (!rz()) {
                this.ahm = new HandlerThread("csj_dispatch_msg") { // from class: com.bytedance.sdk.component.gf.kgy.ct.1
                    boolean kgy = false;

                    @Override // java.lang.Thread
                    public synchronized void start() {
                        if (this.kgy) {
                            return;
                        }
                        this.kgy = true;
                        super.start();
                    }
                };
                this.ahm.start();
                this.rz = new Handler(this.ahm.getLooper());
            }
        } catch (Throwable th) {
            com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgLpoOrGbJhUTDE5gZsi1a6mOdArJty4VY", "b9oJnBCsaNODQuNVnhShLA==", "T/w0thG5aNOFYtZTiB2lOg==", 60);
            sx.kgy("TTDispatchThread", "new handlerThread error", th);
        }
    }

    public void kgy(Runnable runnable) {
        Handler handler;
        if (rz() && (handler = this.rz) != null) {
            handler.post(runnable);
        } else {
            runnable.run();
        }
    }
}
