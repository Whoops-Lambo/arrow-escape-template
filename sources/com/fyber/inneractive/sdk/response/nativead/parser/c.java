package com.fyber.inneractive.sdk.response.nativead.parser;

import com.fyber.inneractive.sdk.response.nativead.h;
import com.fyber.inneractive.sdk.util.v;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public abstract class c {
    public static h a(JSONObject jSONObject) {
        h hVar = new h();
        if (jSONObject != null) {
            hVar.a = v.a(jSONObject, "url");
            hVar.c = v.a(jSONObject, "fallback");
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("clicktrackers");
            if (jSONArrayOptJSONArray != null && jSONArrayOptJSONArray.length() != 0) {
                for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                    String strOptString = jSONArrayOptJSONArray.optString(i);
                    if (strOptString != null && !strOptString.isEmpty() && !strOptString.equals("null")) {
                        hVar.b.add(strOptString);
                    }
                }
            }
        }
        return hVar;
    }
}
