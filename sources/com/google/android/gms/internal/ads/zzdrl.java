package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzdrl implements zzipf {
    public final zzczp a;
    public final zzdqc b;

    @Override // com.google.android.gms.internal.ads.zzipu
    public final Object zzb() {
        zzflq zzflqVarA = this.a.a();
        JSONObject jSONObject = this.b.a.a;
        zzipn.a(jSONObject);
        return new zzdri(zzflqVarA, jSONObject);
    }

    public zzdrl(zzczp zzczpVar, zzdqc zzdqcVar) {
        this.a = zzczpVar;
        this.b = zzdqcVar;
    }
}
