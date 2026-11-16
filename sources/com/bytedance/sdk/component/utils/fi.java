package com.bytedance.sdk.component.utils;

import android.os.HandlerThread;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public class fi {
    private static HandlerThread ahm;
    public static volatile boolean kgy;

    public static HandlerThread kgy(String str, int i) {
        if (kgy) {
            return ahm;
        }
        try {
            HandlerThread handlerThread = new HandlerThread(str, i) { // from class: com.bytedance.sdk.component.utils.fi.1
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
            handlerThread.start();
            return handlerThread;
        } catch (Throwable th) {
            com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgLpoOrGbJhUTDE5kFqSRI", "c+8jkQ+5e/OIWNJciCS0IVf9", "SO8rkCCubMaUT/9cghWsLUnaJYcGvW0=", 41);
            sx.kgy("HandlerThreadUtils", "new handlerThread error", th);
            return ahm;
        }
    }

    public static HandlerThread kgy(String str) {
        return kgy(str, 0);
    }

    public static void kgy(HandlerThread handlerThread) {
        ahm = handlerThread;
    }
}
