package com.bytedance.sdk.component.yo.kgy.yo;

import android.os.Handler;
import android.os.HandlerThread;
import com.bytedance.sdk.component.yo.kgy.ct;
import com.bytedance.sdk.component.yo.kgy.yo;
import com.ironsource.mediationsdk.logger.IronSourceError;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public class kgy {
    private static volatile Handler ahm = null;
    private static volatile HandlerThread kgy = null;
    private static int rz = 3000;

    public static int ahm() {
        if (rz <= 0) {
            rz = IronSourceError.ERROR_CAPPING_VALIDATION_FAILED;
        }
        return rz;
    }

    public static Handler kgy() {
        if (kgy == null || !kgy.isAlive()) {
            synchronized (kgy.class) {
                try {
                    if (kgy == null || !kgy.isAlive()) {
                        rz();
                        ahm = new Handler(kgy.getLooper());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } else if (ahm == null) {
            synchronized (kgy.class) {
                try {
                    if (ahm == null) {
                        ahm = new Handler(kgy.getLooper());
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return ahm;
    }

    static {
        rz();
    }

    private static void rz() {
        HandlerThread handlerThreadKgy;
        ct ctVarVs = yo.noq().vs();
        if (ctVarVs != null && (handlerThreadKgy = ctVarVs.kgy("csj_ad_log", 10)) != null) {
            kgy = handlerThreadKgy;
            return;
        }
        HandlerThread handlerThread = new HandlerThread("csj_ad_log", 10);
        kgy = handlerThread;
        handlerThread.start();
    }
}
