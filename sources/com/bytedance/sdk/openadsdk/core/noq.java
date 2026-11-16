package com.bytedance.sdk.openadsdk.core;

import android.annotation.SuppressLint;
import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public class noq extends yo {

    @SuppressLint({"StaticFieldLeak"})
    private static volatile noq kgy;

    public static noq kgy(Context context) {
        if (kgy == null) {
            synchronized (noq.class) {
                try {
                    if (kgy == null) {
                        kgy = new noq(context);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return kgy;
    }

    private noq(Context context) {
        super(context);
    }
}
