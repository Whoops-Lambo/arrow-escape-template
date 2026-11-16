package com.google.android.gms.internal.p002firebaseauthapi;

import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzajb implements zzaix {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public zzagv g;

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaff
    public final String zza() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("idToken", this.a);
        jSONObject.put("mfaProvider", 1);
        String str = this.b;
        if (str != null) {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("phoneNumber", str);
            String str2 = this.d;
            if (!TextUtils.isEmpty(str2)) {
                jSONObject2.put("recaptchaToken", str2);
            }
            String str3 = this.e;
            if (!TextUtils.isEmpty(str3)) {
                jSONObject2.put("playIntegrityToken", str3);
            }
            zzagv zzagvVar = this.g;
            if (zzagvVar != null) {
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("appSignatureHash", zzagvVar.a);
                jSONObject2.put("autoRetrievalInfo", jSONObject3);
            }
            String str4 = this.f;
            if (str4 != null) {
                zzajs.c("captchaResponse", str4, jSONObject2);
            } else {
                jSONObject2.put("clientType", "CLIENT_TYPE_ANDROID");
            }
            jSONObject.put("phoneEnrollmentInfo", jSONObject2);
        }
        if (!TextUtils.isEmpty(null)) {
            jSONObject.put("tenantId", (Object) null);
        }
        return jSONObject.toString();
    }

    public zzajb(String str, String str2, String str3, String str4, String str5, String str6) {
        this.a = Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty("phone");
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
    }
}
