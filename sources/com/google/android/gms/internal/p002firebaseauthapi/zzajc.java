package com.google.android.gms.internal.p002firebaseauthapi;

import android.util.Log;
import defpackage.vk3;
import java.text.ParseException;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzajc extends zzaiw {
    public String a;
    public String b;
    public String c;

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaiw
    public final String a() {
        return this.a;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaiw
    /* JADX INFO: renamed from: b */
    public final zzaiw zza(String str) {
        try {
            JSONObject jSONObjectOptJSONObject = new JSONObject(str).optJSONObject("totpSessionInfo");
            if (jSONObjectOptJSONObject != null) {
                String strOptString = jSONObjectOptJSONObject.optString("sharedSecretKey");
                String str2 = null;
                if (vk3.G(strOptString)) {
                    strOptString = null;
                }
                this.b = strOptString;
                jSONObjectOptJSONObject.optInt("verificationCodeLength");
                String strOptString2 = jSONObjectOptJSONObject.optString("hashingAlgorithm");
                if (vk3.G(strOptString2)) {
                    strOptString2 = null;
                }
                this.c = strOptString2;
                jSONObjectOptJSONObject.optInt("periodSec");
                String strOptString3 = jSONObjectOptJSONObject.optString("sessionInfo");
                if (!vk3.G(strOptString3)) {
                    str2 = strOptString3;
                }
                this.a = str2;
                String strOptString4 = jSONObjectOptJSONObject.optString("finalizeEnrollmentTime");
                try {
                    zzaos.b(zzaos.a(strOptString4));
                    return this;
                } catch (ParseException unused) {
                    Log.e("zzajc", "Failed to parse timestamp: " + strOptString4);
                }
            }
            return this;
        } catch (NullPointerException | JSONException e) {
            throw zzajs.a("zzajc", str, e);
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaiw, com.google.android.gms.internal.p002firebaseauthapi.zzafi
    public final /* synthetic */ zzafi zza(String str) {
        zza(str);
        return this;
    }
}
