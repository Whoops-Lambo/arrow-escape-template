package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.internal.Preconditions;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzaiv implements zzaff {
    public final String a;
    public final String b;
    public String c;
    public final String d;
    public final String e;

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaff
    public final String zza() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        String str = this.a;
        if (str != null) {
            jSONObject.put("email", str);
        }
        String str2 = this.b;
        if (str2 != null) {
            jSONObject.put("password", str2);
        }
        String str3 = this.c;
        if (str3 != null) {
            jSONObject.put("tenantId", str3);
        }
        String str4 = this.d;
        if (str4 != null) {
            zzajs.c("captchaResponse", str4, jSONObject);
        } else {
            jSONObject.put("clientType", "CLIENT_TYPE_ANDROID");
        }
        String str5 = this.e;
        if (str5 != null) {
            jSONObject.put("idToken", str5);
        }
        return jSONObject.toString();
    }

    public zzaiv(String str, String str2, String str3, String str4, String str5) {
        this.a = Preconditions.checkNotEmpty(str);
        this.b = Preconditions.checkNotEmpty(str2);
        this.c = str3;
        this.d = str4;
        this.e = str5;
    }
}
