package com.ironsource.adqualitysdk.sdk.i;

import com.ironsource.adqualitysdk.sdk.StringFog;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.ｖ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class C1314 extends AbstractC0945 {

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static final String f3925 = StringFog.decrypt("D8zC\n", "ari2UJv7NA0=\n");

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static final String f3924 = StringFog.decrypt("e/vH7g==\n", "Ho+znbP/hYE=\n");

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static final String f3923 = StringFog.decrypt("vWt2G7Jd\n", "yRkXcsYuOx4=\n");

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final String m910() {
        JSONObject jSONObject;
        synchronized (this) {
            jSONObject = this.f2544;
        }
        return jSONObject.optString(f3925);
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final JSONObject m911() {
        JSONObject jSONObject;
        synchronized (this) {
            jSONObject = this.f2544;
        }
        return jSONObject.optJSONObject(f3923);
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final JSONArray m912() {
        JSONObject jSONObject;
        synchronized (this) {
            jSONObject = this.f2544;
        }
        return jSONObject.optJSONArray(f3924);
    }
}
