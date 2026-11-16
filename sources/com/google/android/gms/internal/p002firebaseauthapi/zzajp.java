package com.google.android.gms.internal.p002firebaseauthapi;

import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import com.tiktok.appevents.edp.TTEDPEventConstants;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzajp implements zzaff {
    public String a;
    public String b;
    public String c;
    public String d;
    public String e;
    public boolean f;
    public String g;

    public static zzajp a(String str, String str2, boolean z) {
        zzajp zzajpVar = new zzajp();
        zzajpVar.b = Preconditions.checkNotEmpty(str);
        zzajpVar.c = Preconditions.checkNotEmpty(str2);
        zzajpVar.f = z;
        return zzajpVar;
    }

    public static zzajp b(String str, String str2, boolean z) {
        zzajp zzajpVar = new zzajp();
        zzajpVar.a = Preconditions.checkNotEmpty(str);
        zzajpVar.d = Preconditions.checkNotEmpty(str2);
        zzajpVar.f = z;
        return zzajpVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaff
    public final String zza() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        if (TextUtils.isEmpty(this.d)) {
            jSONObject.put("sessionInfo", this.b);
            jSONObject.put(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE, this.c);
        } else {
            jSONObject.put("phoneNumber", this.a);
            jSONObject.put("temporaryProof", this.d);
        }
        String str = this.e;
        if (str != null) {
            jSONObject.put("idToken", str);
        }
        if (!this.f) {
            jSONObject.put("operation", 2);
        }
        String str2 = this.g;
        if (str2 != null) {
            jSONObject.put("tenantId", str2);
        }
        return jSONObject.toString();
    }

    private zzajp() {
    }
}
