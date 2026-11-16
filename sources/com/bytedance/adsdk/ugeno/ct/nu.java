package com.bytedance.adsdk.ugeno.ct;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public class nu {
    private static Map<String, fi> kgy = new HashMap();

    public static void kgy(List<fi> list) {
        if (list == null || list.size() <= 0) {
            return;
        }
        for (fi fiVar : list) {
            if (fiVar != null) {
                kgy.put(fiVar.kgy(), fiVar);
            }
        }
    }

    public static fi kgy(String str) {
        return kgy.get(str);
    }
}
