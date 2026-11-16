package com.adsurge.adn.oversea_ad;

import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public abstract class Ginkgo {
    public static String a(String str) {
        try {
            Method method = Class.forName("android.os.SystemProperties").getMethod("get", String.class);
            method.setAccessible(true);
            String str2 = (String) method.invoke(null, str);
            return str2 == null ? "" : str2;
        } catch (Throwable unused) {
            return "";
        }
    }
}
