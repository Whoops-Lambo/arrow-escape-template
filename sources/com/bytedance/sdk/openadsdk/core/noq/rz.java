package com.bytedance.sdk.openadsdk.core.noq;

import android.annotation.SuppressLint;
import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public class rz extends ct {

    @SuppressLint({"StaticFieldLeak"})
    private static volatile rz kgy;

    public static rz kgy(Context context) {
        if (kgy == null) {
            synchronized (rz.class) {
                try {
                    if (kgy == null) {
                        kgy = new rz(context);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return kgy;
    }

    private rz(Context context) {
        super(context);
    }
}
