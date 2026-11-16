package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.internal.Preconditions;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzaio implements zzaff {
    public final String a;
    public final long b;
    public final boolean c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final boolean i;
    public zzagv j;

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaff
    public final String zza() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("phoneNumber", this.a);
        String str = this.e;
        if (str != null) {
            jSONObject.put("tenantId", str);
        }
        String str2 = this.f;
        if (str2 != null) {
            jSONObject.put("recaptchaToken", str2);
        }
        zzagv zzagvVar = this.j;
        if (zzagvVar != null) {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("appSignatureHash", zzagvVar.a);
            jSONObject.put("autoRetrievalInfo", jSONObject2);
        }
        String str3 = this.g;
        if (str3 != null) {
            jSONObject.put("playIntegrityToken", str3);
        }
        String str4 = this.h;
        if (str4 != null) {
            zzajs.c("captchaResponse", str4, jSONObject);
        } else {
            jSONObject.put("clientType", "CLIENT_TYPE_ANDROID");
        }
        return jSONObject.toString();
    }

    public zzaio(String str, long j, boolean z, String str2, String str3, String str4, String str5, String str6, boolean z2) {
        this.a = Preconditions.checkNotEmpty(str);
        this.b = j;
        this.c = z;
        this.d = str2;
        this.e = str3;
        this.f = str4;
        this.g = str5;
        this.h = str6;
        this.i = z2;
    }
}
