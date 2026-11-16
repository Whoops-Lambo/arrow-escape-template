package com.bytedance.sdk.openadsdk.core.noq;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class ahm {
    private static volatile Boolean kgy;

    public static boolean kgy() {
        if (kgy == null) {
            synchronized (ahm.class) {
                try {
                    if (kgy == null) {
                        kgy = Boolean.valueOf(com.bytedance.sdk.openadsdk.lqi.ct.kgy("new_db", false));
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return kgy.booleanValue();
    }

    private ahm() {
    }

    public static com.bytedance.sdk.component.uq.ahm ahm(Context context) {
        if (kgy()) {
            return noq.kgy(context);
        }
        return rz.kgy(context).kgy();
    }

    public static com.bytedance.sdk.component.uq.ahm kgy(Context context) {
        if (kgy()) {
            return kgy.kgy(context);
        }
        return com.bytedance.sdk.openadsdk.core.noq.kgy(context).kgy();
    }
}
