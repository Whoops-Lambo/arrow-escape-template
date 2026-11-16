package com.fyber.inneractive.sdk.util;

import android.os.Build;
import android.telephony.TelephonyManager;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes10.dex */
public abstract class k extends o {
    public static String f() {
        try {
            return ((TelephonyManager) o.a.getSystemService("phone")).getNetworkCountryIso();
        } catch (Exception unused) {
            return null;
        }
    }

    public static String g() {
        return Build.MANUFACTURER + " " + Build.MODEL;
    }

    public static int h() {
        try {
            if (o.a("android.permission.READ_PHONE_STATE")) {
                return ((TelephonyManager) o.a.getSystemService("phone")).getDataNetworkType();
            }
            return 0;
        } catch (Throwable unused) {
            return 0;
        }
    }

    public static String i() {
        try {
            return o.a.getPackageManager().getPackageInfo(o.a.getPackageName(), 0).versionName;
        } catch (Exception unused) {
            return null;
        }
    }

    public static boolean j() {
        boolean z = (o.a.getResources().getConfiguration().screenLayout & 15) == 4;
        IAlog.e("This device has a tablet resolution? %s", Boolean.valueOf(z));
        return z;
    }

    public static boolean k() {
        TelephonyManager telephonyManager = (TelephonyManager) o.a.getSystemService("phone");
        return telephonyManager != null && telephonyManager.getSimState() == 5;
    }
}
