package com.adsurge.adn.R;

import com.adsurge.adn.X.w;
import com.ironsource.C4664b4;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public abstract class e {
    public static String a = "User-Agent";
    public static String b = "GDTMobSDK" + w.a();
    public static String c = "-[" + System.getProperty("http.agent") + C4664b4.j.e;

    public static String a(String str) {
        return b + str + c;
    }

    public static String b() {
        return a;
    }

    public static String a() {
        return b + c;
    }
}
