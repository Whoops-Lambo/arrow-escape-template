package com.bytedance.adsdk.ugeno.ct;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public class uq {
    private static Map<String, ahm> kgy = new HashMap();

    public static void kgy(List<ahm> list) {
        if (list == null || list.size() <= 0) {
            return;
        }
        for (ahm ahmVar : list) {
            if (ahmVar != null) {
                kgy.put(ahmVar.kgy(), ahmVar);
            }
        }
    }

    public static ahm kgy(String str) {
        return kgy.get(str);
    }
}
