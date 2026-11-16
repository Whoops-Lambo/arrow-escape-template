package com.bytedance.sdk.openadsdk.fpz.kgy;

import android.os.Handler;
import android.os.HandlerThread;
import com.bytedance.sdk.component.utils.fi;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes10.dex */
public class kgy {
    private static HandlerThread ahm;
    private static Handler kgy;

    public static Handler kgy() {
        try {
            HandlerThread handlerThread = ahm;
            if (handlerThread == null || !handlerThread.isAlive()) {
                synchronized (kgy.class) {
                    try {
                        HandlerThread handlerThread2 = ahm;
                        if (handlerThread2 == null || !handlerThread2.isAlive()) {
                            ahm = fi.kgy("pag_ev");
                            kgy = new Handler(ahm.getLooper());
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } else if (kgy == null) {
                synchronized (kgy.class) {
                    try {
                        if (kgy == null) {
                            kgy = new Handler(ahm.getLooper());
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
        } catch (Throwable th3) {
            com.bytedance.sdk.openadsdk.fpz.rz.kgy(th3, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE5gDoStQoCiD", "a88KsDWJfc6MWQ==", "XOs5vQKybcuFWA==", 31);
        }
        return kgy;
    }
}
