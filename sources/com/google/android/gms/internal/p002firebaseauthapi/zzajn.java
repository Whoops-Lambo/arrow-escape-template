package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.internal.Preconditions;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzajn implements zzaff {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final boolean e = true;

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaff
    public final String zza() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("email", this.a);
        jSONObject.put("password", this.b);
        jSONObject.put("returnSecureToken", this.e);
        String str = this.c;
        if (str != null) {
            jSONObject.put("tenantId", str);
        }
        String str2 = this.d;
        if (str2 != null) {
            zzajs.c("captchaResponse", str2, jSONObject);
        } else {
            jSONObject.put("clientType", "CLIENT_TYPE_ANDROID");
        }
        return jSONObject.toString();
    }

    public zzajn(String str, String str2, String str3, String str4) {
        this.a = Preconditions.checkNotEmpty(str);
        this.b = Preconditions.checkNotEmpty(str2);
        this.c = str3;
        this.d = str4;
    }
}
