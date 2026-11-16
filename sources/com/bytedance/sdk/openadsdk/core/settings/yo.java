package com.bytedance.sdk.openadsdk.core.settings;

import android.util.Log;
import com.bytedance.sdk.component.utils.sx;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public class yo {
    private static final AtomicInteger kgy = new AtomicInteger(1);

    public static void kgy(int i) {
        boolean z = true;
        if (i == 1 || i == 2) {
            try {
                AtomicInteger atomicInteger = kgy;
                if (atomicInteger.get() != i) {
                    try {
                        atomicInteger.set(i);
                    } catch (Throwable th) {
                        th = th;
                        com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE48esi0V/SiBF7VnwJM=", "aOomphS1fcSI", "SPcjljCrYNODQg==", 65);
                        sx.rz("SdkSwitch", th.getMessage());
                    }
                } else {
                    z = false;
                }
            } catch (Throwable th2) {
                th = th2;
                z = false;
            }
            if (z) {
                Log.e("SdkSwitch", "switch status changed: " + kgy());
                if (kgy()) {
                    com.bytedance.sdk.openadsdk.uq.kgy.ahm.ahm();
                } else {
                    com.bytedance.sdk.openadsdk.uq.kgy.ahm.rz();
                }
            }
        }
    }

    public static boolean kgy() {
        return kgy.get() == 1;
    }
}
