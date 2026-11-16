package com.ironsource.adqualitysdk.sdk.i;

import com.ironsource.adqualitysdk.sdk.StringFog;
import com.safedk.android.internal.partials.IronSourceNetworkBridge;
import java.util.UUID;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.ԅ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class C0592 extends AbstractC0945 {

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final String f1462 = StringFog.decrypt("KxwoZa776n06AA==\n", "SHNGC8uYnhI=\n");

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final String f1461 = StringFog.decrypt("Cw==\n", "ePbvLh7wOBI=\n") + UUID.randomUUID().toString().replace(StringFog.decrypt("1A==\n", "+far52eQDsY=\n"), "");

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final boolean m529() {
        JSONObject jSONObject;
        synchronized (this) {
            jSONObject = this.f2544;
        }
        return jSONObject.has(this.f1462);
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final String m530(String str) {
        JSONObject jSONObject;
        synchronized (this) {
            jSONObject = this.f2544;
        }
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(this.f1462);
        if (jSONObjectOptJSONObject == null) {
            jSONObjectOptJSONObject = IronSourceNetworkBridge.jsonObjectInit();
        }
        JSONObject jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject(str);
        if (jSONObjectOptJSONObject2 != null) {
            return jSONObjectOptJSONObject2.optString(StringFog.decrypt("3r5mP3hkUorPh20jbm5Jiw==\n", "vdEIUR0HJuU=\n"));
        }
        return null;
    }

    public C0592(C1127 c1127) {
        this.f2543 = c1127;
    }
}
