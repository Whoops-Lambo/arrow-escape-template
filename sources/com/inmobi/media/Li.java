package com.inmobi.media;

import android.os.Build;
import defpackage.dk2;
import defpackage.dt1;
import defpackage.hg0;
import defpackage.qh1;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class Li {
    public static final Map a(Map map) {
        if (!Ki.a) {
            return map == null ? hg0.a : map;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (map != null) {
            linkedHashMap.putAll(map);
        }
        LinkedHashMap linkedHashMapZ = qh1.Z(new dt1("X-Build-Id", Build.ID), new dt1("X-Android-Version", Build.VERSION.RELEASE), new dt1("X-Build-Model", Build.MODEL));
        String strB = Ki.b();
        if (strB != null) {
            if (dk2.Z(strB)) {
                strB = null;
            }
            if (strB != null) {
                linkedHashMapZ.put("X-WebView-Version", strB);
            }
        }
        for (Map.Entry entry : linkedHashMapZ.entrySet()) {
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            if (!linkedHashMap.containsKey(str)) {
                linkedHashMap.put(str, str2);
            }
        }
        return linkedHashMap;
    }

    public static final void a(HashMap map) {
        map.getClass();
        if (Ki.a) {
            LinkedHashMap linkedHashMapZ = qh1.Z(new dt1("d-build-v", Build.ID), new dt1("os-v", Build.VERSION.RELEASE), new dt1("d-build-model", Build.MODEL));
            String strB = Ki.b();
            if (strB != null) {
                if (dk2.Z(strB)) {
                    strB = null;
                }
                if (strB != null) {
                    linkedHashMapZ.put("d-wv-v", strB);
                }
            }
            for (Map.Entry entry : linkedHashMapZ.entrySet()) {
                String str = (String) entry.getKey();
                String str2 = (String) entry.getValue();
                if (!map.containsKey(str)) {
                    map.put(str, str2);
                }
            }
        }
    }
}
