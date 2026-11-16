package com.google.android.gms.internal.p002firebaseauthapi;

import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzahk implements zzahe {
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaff
    public final String zza() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("idToken", (Object) null);
        if (!TextUtils.isEmpty(null)) {
            jSONObject.put("displayName", (Object) null);
        }
        JSONObject jSONObject2 = new JSONObject();
        if (!TextUtils.isEmpty(null)) {
            jSONObject2.put("sessionInfo", (Object) null);
        }
        if (!TextUtils.isEmpty(null)) {
            jSONObject2.put("verificationCode", (Object) null);
        }
        jSONObject.put("totpVerificationInfo", jSONObject2);
        if (!TextUtils.isEmpty(null)) {
            jSONObject.put("tenantId", (Object) null);
        }
        return jSONObject.toString();
    }
}
