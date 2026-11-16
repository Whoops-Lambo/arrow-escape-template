package com.ironsource.adqualitysdk.sdk.i;

import com.ironsource.adqualitysdk.sdk.StringFog;
import com.safedk.android.internal.partials.IronSourceNetworkBridge;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.ｱ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class C1327 {

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final String f3944;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final JSONObject f3945;

    public C1327(JSONObject jSONObject) {
        String string = UUID.randomUUID().toString();
        this.f3945 = jSONObject;
        this.f3944 = string;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final JSONObject m945() throws JSONException {
        JSONObject jSONObjectJsonObjectInit = IronSourceNetworkBridge.jsonObjectInit();
        jSONObjectJsonObjectInit.put(StringFog.decrypt("ntI7XbZgAF4=\n", "7r1IKfIBdD8=\n"), this.f3945);
        jSONObjectJsonObjectInit.put(StringFog.decrypt("SNLvSQ==\n", "PaeGLfVUfCs=\n"), this.f3944);
        return jSONObjectJsonObjectInit;
    }

    public C1327(String str, JSONObject jSONObject) {
        this.f3945 = jSONObject;
        this.f3944 = str;
    }
}
