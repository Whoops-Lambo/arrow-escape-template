package com.adsurge.adn.p012c1;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Build;
import com.adsurge.adn.s1.a;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public abstract class c {
    public static Boolean a;

    public static boolean b(Context context) {
        Boolean bool = a;
        if (bool != null) {
            return bool.booleanValue();
        }
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 4096);
            String[] strArr = packageInfo != null ? packageInfo.requestedPermissions : null;
            if (strArr != null && strArr.length > 0) {
                for (String str : strArr) {
                    if ("android.permission.REQUEST_INSTALL_PACKAGES".equals(str)) {
                        a = Boolean.TRUE;
                        return true;
                    }
                }
                a = Boolean.FALSE;
                return a.booleanValue();
            }
            a = Boolean.TRUE;
            return true;
        } catch (Exception unused) {
            a = Boolean.TRUE;
        }
    }

    public static final int a() {
        Context contextA = a.b().a();
        if (Build.VERSION.SDK_INT < 26) {
            return 1;
        }
        if (!b(contextA)) {
            return 3;
        }
        if (a(contextA)) {
            return 1;
        }
        return 2;
    }

    public static boolean c() {
        int iA = a();
        if (iA == 1 || iA == 3) {
            return true;
        }
        return false;
    }

    public static boolean a(Context context) {
        try {
            return context.getPackageManager().canRequestPackageInstalls();
        } catch (Exception unused) {
            return false;
        }
    }

    public static boolean b() {
        return a() == 1;
    }
}
