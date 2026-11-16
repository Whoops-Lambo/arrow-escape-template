package com.bytedance.sdk.openadsdk.uq.ahm;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public class rz implements ahm {
    ahm kgy;

    @Override // com.bytedance.sdk.openadsdk.uq.ahm.ahm
    public void kgy(JSONObject jSONObject, long j) throws JSONException {
        ahm ahmVar = this.kgy;
        if (ahmVar != null) {
            ahmVar.kgy(jSONObject, j);
        }
        if (j <= 0) {
            j = System.currentTimeMillis();
        }
        jSONObject.put("event_ts", j);
    }
}
