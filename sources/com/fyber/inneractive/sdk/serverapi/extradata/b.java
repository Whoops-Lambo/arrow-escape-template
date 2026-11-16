package com.fyber.inneractive.sdk.serverapi.extradata;

import com.ironsource.C4664b4;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class b implements c {
    @Override // com.fyber.inneractive.sdk.serverapi.extradata.c
    public final void a(String str, String str2, Object obj) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(C4664b4.i.W, str);
        jSONObject.put("value", str2);
        ((JSONArray) obj).put(jSONObject);
    }

    @Override // com.fyber.inneractive.sdk.serverapi.extradata.c
    public final boolean a(Object obj) {
        return ((JSONArray) obj).length() == 0;
    }
}
