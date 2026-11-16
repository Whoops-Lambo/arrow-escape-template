package com.ironsource;

import com.ironsource.mediationsdk.logger.IronLog;
import com.safedk.android.internal.partials.IronSourceNetworkBridge;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.oa, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
class C4903oa extends AbstractC4713e {
    private final String i = "https://o-sdk.mediation.unity3d.com/mediation?adUnit=2";
    private final String j = "super.dwh.mediation_events";
    private final String k = G5.R;
    private final String l = "data";

    @Override // com.ironsource.AbstractC4713e
    public String c() {
        return "ironbeast";
    }

    public C4903oa(int i) {
        this.g = i;
    }

    @Override // com.ironsource.AbstractC4713e
    public String a(ArrayList<C5> arrayList, JSONObject jSONObject) {
        JSONObject jSONObjectJsonObjectInit = IronSourceNetworkBridge.jsonObjectInit();
        if (jSONObject == null) {
            this.f = IronSourceNetworkBridge.jsonObjectInit();
        } else {
            this.f = jSONObject;
        }
        try {
            JSONArray jSONArray = new JSONArray();
            if (arrayList != null && !arrayList.isEmpty()) {
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    C5 c5 = arrayList.get(i);
                    i++;
                    JSONObject jSONObjectA = a(c5);
                    if (jSONObjectA != null) {
                        jSONArray.put(jSONObjectA);
                    }
                }
            }
            jSONObjectJsonObjectInit.put(G5.R, "super.dwh.mediation_events");
            jSONObjectJsonObjectInit.put("data", a(jSONArray));
            return jSONObjectJsonObjectInit.toString();
        } catch (JSONException e) {
            C4950r4.d().a(e);
            IronLog.INTERNAL.error(e.toString());
            return "";
        }
    }

    @Override // com.ironsource.AbstractC4713e
    public String a() {
        return "https://o-sdk.mediation.unity3d.com/mediation?adUnit=2";
    }
}
