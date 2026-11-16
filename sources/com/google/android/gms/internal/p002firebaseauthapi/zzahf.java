package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.ArrayList;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public class zzahf implements zzafi<zzahf> {
    public String a;
    public String b;
    public boolean c;
    public long d;
    public ArrayList e;
    public String f;

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafi
    public final zzafi zza(String str) throws zzacw {
        try {
            JSONObject jSONObject = new JSONObject(str);
            jSONObject.optString("localId", null);
            jSONObject.optString("email", null);
            this.a = jSONObject.optString("idToken", null);
            this.b = jSONObject.optString("refreshToken", null);
            this.c = jSONObject.optBoolean("isNewUser", false);
            this.d = jSONObject.optLong("expiresIn", 0L);
            this.e = zzaih.b(jSONObject.optJSONArray("mfaInfo"));
            this.f = jSONObject.optString("mfaPendingCredential", null);
            return this;
        } catch (NullPointerException | JSONException e) {
            throw zzajs.a("zzahf", str, e);
        }
    }
}
