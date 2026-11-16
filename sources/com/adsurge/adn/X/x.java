package com.adsurge.adn.X;

import android.content.SharedPreferences;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public abstract class x {
    public static SharedPreferences a;

    public static SharedPreferences b() {
        if (a == null) {
            a = com.adsurge.adn.J.a.d().a().getSharedPreferences("com.adsurge.adn.sdkconfig", 0);
        }
        return a;
    }

    public static void a(String str) {
        a().remove(str).apply();
    }

    public static String a(String str, String str2) {
        return b().getString(str, str2);
    }

    public static long a(String str, long j) {
        return b().getLong(str, j);
    }

    public static int a(String str, int i) {
        return b().getInt(str, i);
    }

    public static SharedPreferences.Editor a() {
        return b().edit();
    }

    public static void b(String str, String str2) {
        a().putString(str, str2).apply();
    }

    public static void b(String str, long j) {
        a().putLong(str, j).apply();
    }

    public static void b(String str, int i) {
        a().putInt(str, i).apply();
    }
}
