package com.ironsource.mediationsdk.logger;

import com.applovin.sdk.AppLovinEventTypes;
import com.ironsource.C4950r4;
import com.safedk.android.internal.partials.IronSourceNetworkBridge;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
class b {
    private IronSourceLogger.IronSourceTag a;
    private String b;
    private String c;
    private int d;

    public int a() {
        return this.d;
    }

    public b(IronSourceLogger.IronSourceTag ironSourceTag, String str, String str2, int i) {
        this.a = ironSourceTag;
        this.b = str;
        this.c = str2;
        this.d = i;
    }

    public JSONObject b() {
        JSONObject jSONObjectJsonObjectInit = IronSourceNetworkBridge.jsonObjectInit();
        try {
            jSONObjectJsonObjectInit.put("timestamp", this.b);
            jSONObjectJsonObjectInit.put("tag", this.a);
            jSONObjectJsonObjectInit.put(AppLovinEventTypes.USER_COMPLETED_LEVEL, this.d);
            jSONObjectJsonObjectInit.put("message", this.c);
            return jSONObjectJsonObjectInit;
        } catch (JSONException e) {
            C4950r4.d().a(e);
            IronLog.INTERNAL.error(e.toString());
            return jSONObjectJsonObjectInit;
        }
    }
}
