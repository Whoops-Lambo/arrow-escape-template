package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import defpackage.u22;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class zzbbu {
    public NetworkCapabilities a;

    public static zzbbu a(Context context) {
        if (context == null) {
            return null;
        }
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        zzbbu zzbbuVar = new zzbbu();
        if (connectivityManager != null) {
            try {
                connectivityManager.registerDefaultNetworkCallback(new u22(zzbbuVar, 1));
                return zzbbuVar;
            } catch (RuntimeException unused) {
                synchronized (zzbbu.class) {
                    zzbbuVar.a = null;
                }
            }
        }
        return zzbbuVar;
    }
}
