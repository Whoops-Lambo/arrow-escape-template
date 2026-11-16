package com.mbridge.msdk.advanced.common;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public class c {
    private static Map<String, Boolean> a = new HashMap();

    public static boolean a(String str) {
        if (a.containsKey(str)) {
            return a.get(str).booleanValue();
        }
        return false;
    }

    public static void b(String str) {
        a.remove(str);
    }

    public static void a(String str, boolean z) {
        a.put(str, Boolean.valueOf(z));
    }
}
