package com.mbridge.msdk.foundation.tools;

import android.net.ConnectivityManager;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public class h0 {
    private static ConnectivityManager a;

    public static synchronized ConnectivityManager a() {
        try {
            if (a == null && com.mbridge.msdk.foundation.controller.c.n().d() != null) {
                a = (ConnectivityManager) com.mbridge.msdk.foundation.controller.c.n().d().getSystemService("connectivity");
            }
        } catch (Exception e) {
            q0.b("NetManager", e.getMessage());
        }
        return a;
    }
}
