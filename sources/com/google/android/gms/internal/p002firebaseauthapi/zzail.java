package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.internal.Preconditions;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzail implements zzaff {
    public final String a;
    public final String b;
    public final String c;

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaff
    public final String zza() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("oobCode", this.a);
        String str = this.b;
        if (str != null) {
            jSONObject.put("newPassword", str);
        }
        String str2 = this.c;
        if (str2 != null) {
            jSONObject.put("tenantId", str2);
        }
        return jSONObject.toString();
    }

    public zzail(String str, String str2, String str3) {
        this.a = Preconditions.checkNotEmpty(str);
        this.b = str2;
        this.c = str3;
    }
}
