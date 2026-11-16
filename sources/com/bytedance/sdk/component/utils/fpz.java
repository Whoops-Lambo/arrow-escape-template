package com.bytedance.sdk.component.utils;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public class fpz {
    private static volatile String kgy;

    public static int kgy(Context context) {
        if (context == null) {
            return 0;
        }
        try {
            return context.getApplicationInfo().icon;
        } catch (Exception e) {
            com.bytedance.sdk.openadsdk.fpz.rz.kgy(e, "WOEg2wGlfcKES9leiV+zLFCgLpoOrGbJhUTDE5kFqSRI", "b9oMhROVZ8GPf8NUgAI=", "XOs5tBOsZc6DS8NUgx+JK1Tg", 36);
            return 0;
        }
    }

    public static String kgy() {
        if (!TextUtils.isEmpty(kgy)) {
            return kgy;
        }
        String str = Build.MODEL;
        kgy = str;
        return str;
    }
}
