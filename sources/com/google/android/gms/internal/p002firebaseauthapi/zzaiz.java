package com.google.android.gms.internal.p002firebaseauthapi;

import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzaiz implements zzaff {
    public final String a = Preconditions.checkNotEmpty("phone");
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public zzagv i;

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaff
    public final String zza() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("mfaPendingCredential", this.b);
        jSONObject.put("mfaEnrollmentId", this.c);
        this.a.getClass();
        jSONObject.put("mfaProvider", 1);
        String str = this.e;
        if (str != null) {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("phoneNumber", str);
            String str2 = this.f;
            if (!TextUtils.isEmpty(str2)) {
                jSONObject2.put("recaptchaToken", str2);
            }
            String str3 = this.g;
            if (!TextUtils.isEmpty(str3)) {
                jSONObject2.put("playIntegrityToken", str3);
            }
            String str4 = this.h;
            if (str4 != null) {
                zzajs.c("captchaResponse", str4, jSONObject2);
            } else {
                jSONObject2.put("clientType", "CLIENT_TYPE_ANDROID");
            }
            zzagv zzagvVar = this.i;
            if (zzagvVar != null) {
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("appSignatureHash", zzagvVar.a);
                jSONObject2.put("autoRetrievalInfo", jSONObject3);
            }
            jSONObject.put("phoneSignInInfo", jSONObject2);
        }
        return jSONObject.toString();
    }

    public zzaiz(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.b = Preconditions.checkNotEmpty(str);
        this.c = Preconditions.checkNotEmpty(str2);
        this.e = str3;
        this.d = str4;
        this.f = str5;
        this.g = str6;
        this.h = str7;
    }
}
