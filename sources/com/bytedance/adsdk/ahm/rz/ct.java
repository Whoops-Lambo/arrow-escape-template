package com.bytedance.adsdk.ahm.rz;

import com.bytedance.adsdk.ahm.kus;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public class ct {
    private static final ct kgy = new ct();
    private final kus<String, com.bytedance.adsdk.ahm.yo> ahm = new kus<>(20);

    public com.bytedance.adsdk.ahm.yo kgy(String str) {
        if (str == null) {
            return null;
        }
        return this.ahm.kgy(str);
    }

    public static ct kgy() {
        return kgy;
    }

    public void kgy(String str, com.bytedance.adsdk.ahm.yo yoVar) {
        if (str == null) {
            return;
        }
        this.ahm.kgy(str, yoVar);
    }
}
