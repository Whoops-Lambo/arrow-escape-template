package com.bytedance.sdk.openadsdk.dg.ahm;

import com.ironsource.R6;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public class uq {

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class kgy {
        public final JSONObject ahm;
        public final String kgy;

        public kgy(String str, JSONObject jSONObject) {
            this.kgy = str;
            this.ahm = jSONObject;
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("device_info");
            if (jSONObjectOptJSONObject != null) {
                try {
                    jSONObjectOptJSONObject.put(R6.X0, com.bytedance.sdk.openadsdk.gm.kgy.ahm.kgy.kgy().ahm());
                    jSONObject.put("device_info", jSONObjectOptJSONObject);
                } catch (JSONException unused) {
                }
            }
        }
    }

    public static rz kgy() {
        return ct.kgy();
    }
}
