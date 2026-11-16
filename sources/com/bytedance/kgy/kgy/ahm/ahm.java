package com.bytedance.kgy.kgy.ahm;

import android.app.Application;
import android.os.Build;
import android.text.TextUtils;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public class ahm {
    private static String kgy;

    private static String uq() {
        try {
            Method declaredMethod = Class.forName("android.app.ActivityThread", false, Application.class.getClassLoader()).getDeclaredMethod("currentProcessName", new Class[0]);
            declaredMethod.setAccessible(true);
            Object objInvoke = declaredMethod.invoke(null, null);
            if (objInvoke instanceof String) {
                return (String) objInvoke;
            }
        } catch (Throwable unused) {
        }
        return null;
    }

    public static String ahm() {
        if (!TextUtils.isEmpty(kgy)) {
            return kgy;
        }
        String strRz = rz();
        kgy = strRz;
        if (!TextUtils.isEmpty(strRz)) {
            return kgy;
        }
        String strUq = uq();
        kgy = strUq;
        return !TextUtils.isEmpty(strUq) ? kgy : kgy;
    }

    private static String rz() {
        if (Build.VERSION.SDK_INT < 28) {
            return null;
        }
        try {
            return Application.getProcessName();
        } catch (Throwable unused) {
            return null;
        }
    }

    public static String kgy() {
        String strAhm = ahm();
        if (!TextUtils.isEmpty(strAhm) && strAhm.contains(":")) {
            return strAhm.replace(":", "_");
        }
        return strAhm;
    }
}
