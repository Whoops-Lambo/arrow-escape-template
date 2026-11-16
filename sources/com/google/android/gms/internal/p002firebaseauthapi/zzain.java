package com.google.android.gms.internal.p002firebaseauthapi;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class zzain implements zzaff {
    public abstract zzahp a();

    public abstract String b();

    public abstract String c();

    public abstract String d();

    public abstract String e();

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaff
    public final String zza() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("idToken", b());
        jSONObject.put("token", e());
        jSONObject.put("providerId", c());
        jSONObject.put("tokenType", a().a);
        jSONObject.put("tenantId", d());
        return jSONObject.toString();
    }
}
