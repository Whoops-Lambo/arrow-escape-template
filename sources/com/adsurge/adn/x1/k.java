package com.adsurge.adn.x1;

import android.content.Context;
import android.os.Build;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public abstract class k {
    public static volatile Boolean a;

    public static boolean b(Context context) {
        if (context == null) {
            return false;
        }
        if (a == null) {
            synchronized (a.class) {
                if (a == null) {
                    a = Boolean.FALSE;
                    try {
                        String[] strArr = context.getPackageManager().getPackageInfo(context.getPackageName(), 4096).requestedPermissions;
                        if (strArr != null) {
                            for (String str : strArr) {
                                if ("android.permission.QUERY_ALL_PACKAGES".equals(str)) {
                                    a = Boolean.TRUE;
                                    break;
                                }
                            }
                        }
                    } catch (Throwable unused) {
                    }
                }
            }
        }
        return a.booleanValue();
    }

    public static boolean a(Context context) {
        if (context != null) {
            return Build.VERSION.SDK_INT < 30 || context.getApplicationInfo().targetSdkVersion < 30 || b(context);
        }
        return true;
    }
}
