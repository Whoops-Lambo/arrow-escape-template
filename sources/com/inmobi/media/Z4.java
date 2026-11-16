package com.inmobi.media;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.wifi.WifiManager;
import android.telephony.TelephonyManager;
import androidx.core.content.ContextCompat;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public abstract class Z4 {
    public static final Qf a() {
        Context context = AbstractC4221mk.a;
        if (context == null) {
            return Qf.UNAVAILABLE;
        }
        try {
            Object systemService = context.getSystemService("connectivity");
            systemService.getClass();
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) systemService).getActiveNetworkInfo();
            if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
                int type = activeNetworkInfo.getType();
                if (type != 0) {
                    if (type != 1) {
                        return Qf.SLOW;
                    }
                    Object systemService2 = context.getApplicationContext().getSystemService("wifi");
                    systemService2.getClass();
                    int linkSpeed = ((WifiManager) systemService2).getConnectionInfo().getLinkSpeed();
                    if (linkSpeed >= 10) {
                        return Qf.FAST;
                    }
                    return linkSpeed >= 2 ? Qf.MEDIUM : Qf.SLOW;
                }
                if (ContextCompat.a(context, "android.permission.READ_PHONE_STATE") != 0) {
                    return Qf.UNAVAILABLE;
                }
                Object systemService3 = context.getSystemService("phone");
                systemService3.getClass();
                int networkType = ((TelephonyManager) systemService3).getNetworkType();
                if (networkType == 1 || networkType == 2 || networkType == 4 || networkType == 7 || networkType == 11 || networkType == 16) {
                    return Qf.SLOW;
                }
                return (networkType == 18 || networkType == 20) ? Qf.FAST : Qf.MEDIUM;
            }
            return Qf.UNAVAILABLE;
        } catch (SecurityException unused) {
            return Qf.UNAVAILABLE;
        }
    }
}
