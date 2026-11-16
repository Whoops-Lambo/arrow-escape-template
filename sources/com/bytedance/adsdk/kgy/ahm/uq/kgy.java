package com.bytedance.adsdk.kgy.ahm.uq;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public enum kgy implements ct {
    TRUE,
    FALSE,
    NULL;

    private static final Map<String, kgy> uq = new HashMap(128);

    static {
        for (kgy kgyVar : values()) {
            uq.put(kgyVar.name().toLowerCase(), kgyVar);
        }
    }

    public static kgy kgy(String str) {
        return uq.get(str.toLowerCase());
    }
}
