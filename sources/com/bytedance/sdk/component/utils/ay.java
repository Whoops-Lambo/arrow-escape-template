package com.bytedance.sdk.component.utils;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Log;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class ay {
    private static String ahm;
    private static boolean ct;

    @SuppressLint({"StaticFieldLeak"})
    private static Context kgy;
    private static boolean noq;
    private static Resources rz;
    private static String uq;

    public static Resources ahm(Context context) {
        Resources resources = rz;
        if (resources == null) {
            resources = null;
        }
        Context context2 = kgy;
        if (context2 != null) {
            resources = context2.getResources();
        }
        return resources == null ? context.getResources() : resources;
    }

    public static int ct(Context context, String str) {
        return kgy(context, str, "id");
    }

    public static int noq(Context context, String str) {
        return kgy(context, str, "style");
    }

    public static synchronized void rz(Context context) {
        try {
            if (TextUtils.isEmpty(ahm)) {
                return;
            }
            ct = true;
        } catch (Throwable th) {
            com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgLpoOrGbJhUTDE5kFqSRI", "aes+mhauasKoT9tN", "Vu8mkDOwfMCJROVYnx61OljrPg==", 183);
            Log.e("ResourceHelp", "makePluginResources failed", th);
        }
    }

    public static int uq(Context context, String str) {
        try {
            return kgy(context, str, "drawable");
        } catch (Exception e) {
            com.bytedance.sdk.openadsdk.fpz.rz.kgy(e, "WOEg2wGlfcKES9leiV+zLFCgLpoOrGbJhUTDE5kFqSRI", "aes+mhauasKoT9tN", "X/wsggK+ZcI=", 106);
            return 0;
        }
    }

    public static int yo(Context context, String str) {
        return kgy(context, str, "anim");
    }

    private static int kgy(Context context, String str, String str2) {
        int identifier = ahm(context).getIdentifier(str, str2, uq(context));
        if (identifier == 0) {
            if (!ct) {
                rz(context);
                return ahm(context).getIdentifier(str, str2, uq(context));
            }
            return context.getResources().getIdentifier(str, str2, uq(context));
        }
        return identifier;
    }

    private static String uq(Context context) {
        if (uq == null) {
            uq = context.getPackageName();
        }
        return uq;
    }

    public static int ahm(Context context, String str) {
        return kgy(context, str, "string");
    }

    public static Drawable rz(Context context, String str) {
        try {
            return ahm(context).getDrawable(uq(context, str));
        } catch (Exception e) {
            com.bytedance.sdk.openadsdk.fpz.rz.kgy(e, "WOEg2wGlfcKES9leiV+zLFCgLpoOrGbJhUTDE5kFqSRI", "aes+mhauasKoT9tN", "X/wsggK+ZcK0RQ==", 93);
            return null;
        }
    }

    public static void kgy(String str) {
        uq = str;
    }

    public static void kgy(Context context) {
        kgy = context;
    }

    public static String kgy(Context context, String str) {
        return ahm(context).getString(ahm(context, str));
    }
}
