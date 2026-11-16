package com.ironsource;

import android.util.Base64;
import com.ironsource.mediationsdk.logger.IronLog;
import com.safedk.android.internal.partials.IronSourceNetworkBridge;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.z8, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public class C5098z8 implements J7 {
    @Override // com.ironsource.J7
    public String a(Map<String, Object> map) {
        try {
            return com.safedk.android.analytics.brandsafety.creatives.discoveries.h.q + Base64.encodeToString(IronSourceNetworkBridge.jsonObjectInit().put(G5.R, G5.S).put("data", new JSONObject(map)).toString().getBytes(), 2);
        } catch (JSONException e) {
            C4950r4.d().a(e);
            IronLog.INTERNAL.error(e.toString());
            return "";
        }
    }
}
