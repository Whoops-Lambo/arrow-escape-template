package com.bytedance.kgy.kgy;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
public class yo {
    private static Context kgy;

    public static void kgy(Context context) {
        if (context == null) {
            return;
        }
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            kgy = applicationContext;
        } else {
            kgy = context;
        }
    }

    public static Context kgy() {
        return kgy;
    }
}
