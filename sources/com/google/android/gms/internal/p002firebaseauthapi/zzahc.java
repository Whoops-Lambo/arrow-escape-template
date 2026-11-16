package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.logging.Logger;
import com.google.firebase.auth.EmailAuthCredential;
import defpackage.f3;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public class zzahc implements zzaff {
    public final String a;
    public final String b;
    public final EmailAuthCredential c;
    public final String d;
    public final String e;

    static {
        new Logger("zzahc", new String[0]);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaff
    public final String zza() throws JSONException {
        f3 f3Var;
        zzal zzalVar = f3.d;
        String str = this.b;
        Preconditions.checkNotEmpty(str);
        try {
            f3Var = new f3(str);
        } catch (IllegalArgumentException unused) {
            f3Var = null;
        }
        String str2 = f3Var != null ? f3Var.a : null;
        String str3 = f3Var != null ? f3Var.c : null;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("email", this.a);
        if (str2 != null) {
            jSONObject.put("oobCode", str2);
        }
        if (str3 != null) {
            jSONObject.put("tenantId", str3);
        }
        String str4 = this.d;
        if (str4 != null) {
            jSONObject.put("idToken", str4);
        }
        String str5 = this.e;
        if (str5 != null) {
            zzajs.c("captchaResp", str5, jSONObject);
        } else {
            jSONObject.put("clientType", "CLIENT_TYPE_ANDROID");
        }
        return jSONObject.toString();
    }

    public zzahc(EmailAuthCredential emailAuthCredential, String str, String str2) {
        this.c = (EmailAuthCredential) Preconditions.checkNotNull(emailAuthCredential);
        this.a = Preconditions.checkNotEmpty(emailAuthCredential.a);
        this.b = Preconditions.checkNotEmpty(emailAuthCredential.c);
        this.d = str;
        this.e = str2;
    }
}
