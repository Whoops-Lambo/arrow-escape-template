package com.fyber.inneractive.sdk.config;

import java.util.HashMap;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class p {
    public final HashMap a = new HashMap();

    public p(JSONObject jSONObject) {
        JSONArray jSONArrayNames;
        JSONArray jSONArrayNames2 = jSONObject.names();
        for (int i = 0; i < jSONArrayNames2.length(); i++) {
            String strOptString = jSONArrayNames2.optString(i, null);
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(strOptString);
            o oVar = new o();
            if (jSONObjectOptJSONObject != null && (jSONArrayNames = jSONObjectOptJSONObject.names()) != null) {
                for (int i2 = 0; i2 < jSONArrayNames.length(); i2++) {
                    String strOptString2 = jSONArrayNames.optString(i2, null);
                    String strOptString3 = jSONObjectOptJSONObject.optString(strOptString2, null);
                    if (strOptString2 != null && strOptString3 != null) {
                        oVar.a.put(strOptString2, strOptString3);
                    }
                }
            }
            this.a.put(strOptString, oVar);
        }
    }

    public p() {
    }
}
