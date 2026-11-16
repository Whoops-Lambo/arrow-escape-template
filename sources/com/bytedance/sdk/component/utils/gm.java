package com.bytedance.sdk.component.utils;

import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public class gm {
    private static String kgy;

    private static String ahm() {
        try {
            Method declaredMethod = Class.forName("android.app.ActivityThread", false, Application.class.getClassLoader()).getDeclaredMethod("currentProcessName", new Class[0]);
            declaredMethod.setAccessible(true);
            Object objInvoke = declaredMethod.invoke(null, null);
            if (objInvoke instanceof String) {
                return (String) objInvoke;
            }
            return null;
        } catch (Throwable th) {
            com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgLpoOrGbJhUTDE5kFqSRI", "a/wilgavevKUQ9s=", "XOs5thaue8KOXudPgxKlO0jALJgGnnDmg17eS4UFuRxT/CiUBw==", 73);
            return null;
        }
    }

    public static boolean kgy(Context context) {
        if (context == null || context.getApplicationContext() == null) {
            return false;
        }
        return TextUtils.equals(context.getApplicationContext().getPackageName(), ahm(context));
    }

    public static String rz(Context context) {
        String strAhm = ahm(context);
        if (!TextUtils.isEmpty(strAhm) && strAhm.contains(":")) {
            return strAhm.replace(":", "_");
        }
        return strAhm;
    }

    private static String kgy() {
        if (Build.VERSION.SDK_INT < 28) {
            return null;
        }
        try {
            return Application.getProcessName();
        } catch (Exception e) {
            com.bytedance.sdk.openadsdk.fpz.rz.kgy(e, "WOEg2wGlfcKES9leiV+zLFCgLpoOrGbJhUTDE5kFqSRI", "a/wilgavevKUQ9s=", "XOs5thaue8KOXudPgxKlO0jALJgGnnDmkFrbVI8QtCFU4A==", 53);
            return null;
        }
    }

    public static String ahm(Context context) {
        if (!TextUtils.isEmpty(kgy)) {
            return kgy;
        }
        String strKgy = kgy();
        kgy = strKgy;
        if (!TextUtils.isEmpty(strKgy)) {
            return kgy;
        }
        String strAhm = ahm();
        kgy = strAhm;
        if (!TextUtils.isEmpty(strAhm)) {
            return kgy;
        }
        return kgy;
    }
}
