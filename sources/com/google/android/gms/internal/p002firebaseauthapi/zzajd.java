package com.google.android.gms.internal.p002firebaseauthapi;

import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzajd implements zzaix {
    public final String a;
    public final String b;

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaff
    public final String zza() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("idToken", this.a);
        String str = this.b;
        if (!TextUtils.isEmpty(str)) {
            jSONObject.put("tenantId", str);
        }
        jSONObject.put("totpEnrollmentInfo", new JSONObject());
        return jSONObject.toString();
    }

    public zzajd(String str, String str2) {
        this.a = Preconditions.checkNotEmpty(str);
        this.b = str2;
    }
}
