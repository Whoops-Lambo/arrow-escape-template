package com.inmobi.media;

import defpackage.nc3;

/* JADX INFO: renamed from: com.inmobi.media.qk, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public abstract class AbstractC4333qk {
    public static final void b() {
        String[] strArr = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_WIFI_STATE", "android.permission.CHANGE_WIFI_STATE"};
        StringBuilder sb = new StringBuilder("Permissions granted to SDK are :\nandroid.permission.INTERNET\nandroid.permission.ACCESS_NETWORK_STATE");
        for (int i = 0; i < 4; i++) {
            String str = strArr[i];
            if (Og.a(AbstractC4221mk.a, str)) {
                sb.append("\n");
                sb.append(str);
            }
        }
        Kc.a((byte) 2, "InMobiSdk", sb.toString());
    }

    public static void a(String str, String str2, String str3, Long l) {
        str.getClass();
        if (str3 == null) {
            Kc.a((byte) 2, "InMobiSdk", "InMobi SDK initialized with account id: " + str2);
        }
    }

    public static void a() {
        AbstractC4221mk.h.submit(new nc3(9));
    }

    public static void a(long j, Short sh) {
    }
}
