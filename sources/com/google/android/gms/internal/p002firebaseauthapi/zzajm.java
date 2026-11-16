package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.util.Strings;
import java.util.ArrayList;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public class zzajm implements zzafi<zzajm> {
    public String a;
    public String b;
    public long c;
    public ArrayList d;
    public String e;

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafi
    public final zzafi zza(String str) throws zzacw {
        try {
            JSONObject jSONObject = new JSONObject(str);
            Strings.emptyToNull(jSONObject.optString("localId", null));
            Strings.emptyToNull(jSONObject.optString("email", null));
            Strings.emptyToNull(jSONObject.optString("displayName", null));
            this.a = Strings.emptyToNull(jSONObject.optString("idToken", null));
            Strings.emptyToNull(jSONObject.optString("photoUrl", null));
            this.b = Strings.emptyToNull(jSONObject.optString("refreshToken", null));
            this.c = jSONObject.optLong("expiresIn", 0L);
            this.d = zzaih.b(jSONObject.optJSONArray("mfaInfo"));
            this.e = jSONObject.optString("mfaPendingCredential", null);
            return this;
        } catch (NullPointerException | JSONException e) {
            throw zzajs.a("zzajm", str, e);
        }
    }
}
