package com.ironsource;

import com.ironsource.mediationsdk.logger.IronLog;
import com.safedk.android.internal.partials.IronSourceNetworkBridge;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.va, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public class C5028va {
    private String a;
    private JSONObject b;
    private String c;
    private String d;

    public String a() {
        return this.d;
    }

    public String b() {
        return this.a;
    }

    public JSONObject c() {
        return this.b;
    }

    public String d() {
        return this.c;
    }

    public C5028va(JSONObject jSONObject) {
        this.a = jSONObject.optString(C4664b4.g.b);
        this.b = jSONObject.optJSONObject(C4664b4.g.c);
        this.c = jSONObject.optString("success");
        this.d = jSONObject.optString(C4664b4.g.e);
    }

    public JSONObject e() {
        JSONObject jSONObjectJsonObjectInit = IronSourceNetworkBridge.jsonObjectInit();
        try {
            jSONObjectJsonObjectInit.put(C4664b4.g.b, this.a);
            jSONObjectJsonObjectInit.put(C4664b4.g.c, this.b);
            jSONObjectJsonObjectInit.put("success", this.c);
            jSONObjectJsonObjectInit.put(C4664b4.g.e, this.d);
            return jSONObjectJsonObjectInit;
        } catch (JSONException e) {
            C4950r4.d().a(e);
            IronLog.INTERNAL.error(e.toString());
            return jSONObjectJsonObjectInit;
        }
    }
}
