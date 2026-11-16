package com.adsurge.adn.x1;

import android.content.SharedPreferences;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public abstract class p {
    public static SharedPreferences a;

    public static SharedPreferences b() {
        if (a == null) {
            a = com.adsurge.adn.s1.a.b().a().getSharedPreferences("com.qq.e.sdkconfig", 0);
        }
        return a;
    }

    public static int a(String str, int i) {
        return b().getInt(str, i);
    }

    public static boolean a(String str, boolean z) {
        return b().getBoolean(str, z);
    }

    public static SharedPreferences.Editor a() {
        return b().edit();
    }

    public static void b(String str, boolean z) {
        a().putBoolean(str, z).apply();
    }
}
