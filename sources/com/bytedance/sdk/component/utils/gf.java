package com.bytedance.sdk.component.utils;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public class gf {
    private static volatile Handler kgy;

    public static Handler ahm() {
        if (kgy == null) {
            synchronized (gf.class) {
                try {
                    if (kgy == null) {
                        kgy = new Handler(Looper.getMainLooper());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return kgy;
    }

    public static Handler kgy() {
        return com.bytedance.sdk.component.gf.kgy.kgy.kgy().ahm();
    }
}
