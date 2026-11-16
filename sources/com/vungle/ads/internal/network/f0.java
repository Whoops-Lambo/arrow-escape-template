package com.vungle.ads.internal.network;

import android.os.Build;
import com.vungle.ads.BuildConfig;
import defpackage.nj;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public abstract class f0 {
    public static String a = a();
    public static String b;
    public static String c;

    public static String a() {
        return nj.q(new StringBuilder(), "Amazon".equals(Build.MANUFACTURER) ? "VungleAmazon/" : "VungleDroid/", BuildConfig.VERSION_NAME);
    }

    public static String b() {
        return b;
    }

    public static String d() {
        return a;
    }

    public static void c(String str) {
        str.getClass();
        a = str;
    }

    public static void b(String str) {
        c = str;
    }

    public static String c() {
        return c;
    }

    public static void a(String str) {
        b = str;
    }
}
