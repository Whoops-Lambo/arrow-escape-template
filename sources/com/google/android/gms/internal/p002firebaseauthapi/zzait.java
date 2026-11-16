package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.util.Strings;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public class zzait implements zzafi<zzait> {
    public String a;
    public zzaij b;
    public String c;
    public String d;
    public long e;

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafi
    public final zzafi zza(String str) throws zzacw {
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.a = Strings.emptyToNull(jSONObject.optString("email"));
            Strings.emptyToNull(jSONObject.optString("passwordHash"));
            jSONObject.optBoolean("emailVerified", false);
            Strings.emptyToNull(jSONObject.optString("displayName"));
            Strings.emptyToNull(jSONObject.optString("photoUrl"));
            this.b = zzaij.a(jSONObject.optJSONArray("providerUserInfo"));
            this.c = Strings.emptyToNull(jSONObject.optString("idToken"));
            this.d = Strings.emptyToNull(jSONObject.optString("refreshToken"));
            this.e = jSONObject.optLong("expiresIn", 0L);
            return this;
        } catch (NullPointerException | JSONException e) {
            throw zzajs.a("zzait", str, e);
        }
    }
}
