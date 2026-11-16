package com.bytedance.adsdk.kgy.ahm.ahm.kgy;

import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes10.dex */
public class vs implements com.bytedance.adsdk.kgy.ahm.ahm.kgy {
    private Number kgy;

    @Override // com.bytedance.adsdk.kgy.ahm.ahm.kgy
    public String ahm() {
        return this.kgy.toString();
    }

    @Override // com.bytedance.adsdk.kgy.ahm.ahm.kgy
    public Object kgy(Map<String, JSONObject> map) {
        return this.kgy;
    }

    public vs(String str) {
        if (str.indexOf(46) >= 0) {
            Float fValueOf = Float.valueOf(str);
            this.kgy = fValueOf;
            if (Float.isInfinite(fValueOf.floatValue())) {
                this.kgy = Double.valueOf(str);
                return;
            }
            return;
        }
        try {
            this.kgy = Integer.valueOf(str);
        } catch (NumberFormatException unused) {
            this.kgy = Long.valueOf(str);
        }
    }

    public String toString() {
        return ahm();
    }

    @Override // com.bytedance.adsdk.kgy.ahm.ahm.kgy
    public com.bytedance.adsdk.kgy.ahm.uq.ct kgy() {
        return com.bytedance.adsdk.kgy.ahm.uq.noq.NUMBER;
    }
}
