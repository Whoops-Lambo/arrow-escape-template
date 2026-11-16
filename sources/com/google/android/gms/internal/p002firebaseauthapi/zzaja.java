package com.google.android.gms.internal.p002firebaseauthapi;

import defpackage.vk3;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzaja extends zzaiw {
    public String a;

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaiw
    public final String a() {
        return this.a;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaiw
    /* JADX INFO: renamed from: b */
    public final zzaiw zza(String str) {
        try {
            JSONObject jSONObjectOptJSONObject = new JSONObject(str).optJSONObject("phoneSessionInfo");
            if (jSONObjectOptJSONObject == null) {
                return this;
            }
            String strOptString = jSONObjectOptJSONObject.optString("sessionInfo");
            if (vk3.G(strOptString)) {
                strOptString = null;
            }
            this.a = strOptString;
            return this;
        } catch (NullPointerException | JSONException e) {
            throw zzajs.a("zzaja", str, e);
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaiw, com.google.android.gms.internal.p002firebaseauthapi.zzafi
    public final /* synthetic */ zzafi zza(String str) {
        zza(str);
        return this;
    }
}
