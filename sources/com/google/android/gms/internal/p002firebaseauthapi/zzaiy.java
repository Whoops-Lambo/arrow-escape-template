package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.util.Strings;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public class zzaiy implements zzafi<zzaiy> {
    public String a;

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafi
    public final zzafi zza(String str) throws zzacw {
        try {
            JSONObject jSONObjectOptJSONObject = new JSONObject(str).optJSONObject("phoneResponseInfo");
            if (jSONObjectOptJSONObject == null) {
                return this;
            }
            this.a = Strings.emptyToNull(jSONObjectOptJSONObject.optString("sessionInfo"));
            return this;
        } catch (NullPointerException | JSONException e) {
            throw zzajs.a("zzaiy", str, e);
        }
    }
}
