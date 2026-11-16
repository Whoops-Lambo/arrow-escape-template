package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.util.Strings;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public class zzajo implements zzafi<zzajo> {
    public String a;
    public String b;
    public long c;
    public boolean d;
    public String e;
    public String f;

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafi
    public final zzafi zza(String str) throws zzacw {
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.a = Strings.emptyToNull(jSONObject.optString("idToken", null));
            this.b = Strings.emptyToNull(jSONObject.optString("refreshToken", null));
            this.c = jSONObject.optLong("expiresIn", 0L);
            Strings.emptyToNull(jSONObject.optString("localId", null));
            this.d = jSONObject.optBoolean("isNewUser", false);
            this.e = Strings.emptyToNull(jSONObject.optString("temporaryProof", null));
            this.f = Strings.emptyToNull(jSONObject.optString("phoneNumber", null));
            return this;
        } catch (NullPointerException | JSONException e) {
            throw zzajs.a("zzajo", str, e);
        }
    }
}
