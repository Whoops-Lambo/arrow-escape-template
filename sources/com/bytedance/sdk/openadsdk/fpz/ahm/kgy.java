package com.bytedance.sdk.openadsdk.fpz.ahm;

import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public class kgy {
    private final int ahm;
    private final int kgy;
    private final float rz;

    public static JSONObject kgy(kgy kgyVar) throws Throwable {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("width", kgyVar.kgy);
        jSONObject.put("height", kgyVar.ahm);
        jSONObject.put("alpha", kgyVar.rz);
        return jSONObject;
    }

    public kgy(int i, int i2, float f) {
        this.kgy = i;
        this.ahm = i2;
        this.rz = f;
    }
}
