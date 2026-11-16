package com.tiktok.util;

import android.os.Handler;
import android.os.HandlerThread;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public class TTHandlerUtil {
    private static final TTHandlerUtil instance = new TTHandlerUtil();
    private Handler sHandler;

    public static TTHandlerUtil getInstance() {
        return instance;
    }

    public void post(Runnable runnable) {
        if (runnable != null) {
            try {
                Handler handler = this.sHandler;
                if (handler == null) {
                    return;
                }
                handler.post(runnable);
            } catch (Throwable unused) {
            }
        }
    }

    public void postDelayed(Runnable runnable, long j) {
        if (runnable != null) {
            try {
                Handler handler = this.sHandler;
                if (handler == null) {
                    return;
                }
                handler.postDelayed(runnable, j);
            } catch (Throwable unused) {
            }
        }
    }

    public void removeCallbacks(Runnable runnable) {
        if (runnable != null) {
            try {
                Handler handler = this.sHandler;
                if (handler == null) {
                    return;
                }
                handler.removeCallbacks(runnable);
            } catch (Throwable unused) {
            }
        }
    }

    private TTHandlerUtil() {
        this.sHandler = null;
        try {
            HandlerThread handlerThread = new HandlerThread("tiktok");
            handlerThread.start();
            this.sHandler = new Handler(handlerThread.getLooper());
        } catch (Throwable unused) {
        }
    }
}
