package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
public final class zzepi implements zzenf {
    public final zzdyn a;

    @Override // com.google.android.gms.internal.ads.zzenf
    public final zzeng a(String str, JSONObject jSONObject) {
        return new zzeng(this.a.a(str, jSONObject), new zzeos(), str);
    }

    public zzepi(zzdyn zzdynVar) {
        this.a = zzdynVar;
    }
}
