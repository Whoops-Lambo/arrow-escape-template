package com.bytedance.adsdk.ugeno.fi;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class uq {
    private static Resources ahm;
    private static String kgy;

    @SuppressLint({"StaticFieldLeak"})
    private static Context rz;

    public static int ahm(Context context, String str) {
        return kgy(context, str, "drawable");
    }

    private static int kgy(Context context, String str, String str2) {
        if (ahm == null) {
            ahm = context.getResources();
        }
        return ahm.getIdentifier(str, str2, kgy(context));
    }

    private static String kgy(Context context) {
        if (kgy == null) {
            kgy = context.getPackageName();
        }
        return kgy;
    }

    public static void kgy(String str) {
        kgy = str;
    }

    public static int kgy(Context context, String str) {
        return kgy(context, str, "raw");
    }
}
