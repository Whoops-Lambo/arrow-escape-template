package com.bytedance.adsdk.ugeno.ct.kgy;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public class kgy {
    private volatile Map<String, rz> kgy = new HashMap();

    public rz kgy(String str) {
        if (this.kgy.containsKey(str) && this.kgy.get(str) != null) {
            return this.kgy.get(str);
        }
        ahm ahmVar = new ahm();
        this.kgy.put(str, ahmVar);
        return ahmVar;
    }

    public void kgy(String str, rz rzVar) {
        if (!this.kgy.containsKey(str) || this.kgy.get(str) == null) {
            this.kgy.put(str, rzVar);
        }
    }
}
