package com.bytedance.adsdk.ahm;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public class sx {
    private boolean ahm;
    private final Map<String, String> kgy;

    public final String ahm(String str, String str2) {
        if (this.ahm && this.kgy.containsKey(str2)) {
            return this.kgy.get(str2);
        }
        String strKgy = kgy(str, str2);
        if (this.ahm) {
            this.kgy.put(str2, strKgy);
        }
        return strKgy;
    }

    public String kgy(String str, String str2) {
        return kgy(str2);
    }

    public String kgy(String str) {
        return str;
    }
}
