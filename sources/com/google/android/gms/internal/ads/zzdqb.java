package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzdqb implements zzipf {
    public final zzdqd a;

    @Override // com.google.android.gms.internal.ads.zzipu
    public final Object zzb() {
        zzdri zzdriVar = (zzdri) this.a.a.zzb();
        zzipn.a(zzdriVar);
        JSONObject jSONObject = zzdriVar.b;
        if (jSONObject != null) {
            return jSONObject;
        }
        try {
            return new JSONObject(zzdriVar.a.z);
        } catch (JSONException unused) {
            return null;
        }
    }

    public zzdqb(zzdqd zzdqdVar) {
        this.a = zzdqdVar;
    }
}
