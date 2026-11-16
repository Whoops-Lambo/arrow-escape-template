package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class zzctj implements zzcsz {
    public final zzeec a;

    @Override // com.google.android.gms.internal.ads.zzcsz
    public final void a(JSONObject jSONObject) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjr.Sa)).booleanValue()) {
            zzeec zzeecVar = this.a;
            synchronized (zzeecVar) {
                zzeecVar.p = jSONObject;
            }
        }
    }

    public zzctj(zzeec zzeecVar) {
        this.a = zzeecVar;
    }
}
