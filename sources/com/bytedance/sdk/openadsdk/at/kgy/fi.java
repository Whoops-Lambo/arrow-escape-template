package com.bytedance.sdk.openadsdk.at.kgy;

import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public class fi extends com.bytedance.sdk.component.kgy.uq<JSONObject, JSONObject> {
    private JSONObject kgy;

    public static void kgy(com.bytedance.sdk.component.kgy.vs vsVar, JSONObject jSONObject) {
        vsVar.kgy("getData", new fi(jSONObject));
    }

    public fi(JSONObject jSONObject) {
        this.kgy = jSONObject;
    }

    @Override // com.bytedance.sdk.component.kgy.uq
    public JSONObject kgy(String str, JSONObject jSONObject, com.bytedance.sdk.component.kgy.ct ctVar) throws Exception {
        return com.bytedance.sdk.openadsdk.core.gf.ahm.rz.kgy(this.kgy, jSONObject);
    }
}
