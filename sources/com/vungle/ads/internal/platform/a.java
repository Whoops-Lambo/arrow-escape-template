package com.vungle.ads.internal.platform;

import android.content.Context;
import android.telephony.TelephonyManager;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public abstract class a {
    public static String a(Context context) {
        TelephonyManager telephonyManager;
        context.getClass();
        Object systemService = context.getSystemService("phone");
        String networkOperatorName = null;
        if (systemService instanceof TelephonyManager) {
            telephonyManager = (TelephonyManager) systemService;
        } else {
            telephonyManager = null;
        }
        if (telephonyManager != null) {
            networkOperatorName = telephonyManager.getNetworkOperatorName();
        }
        if (networkOperatorName == null) {
            return "";
        }
        return networkOperatorName;
    }
}
