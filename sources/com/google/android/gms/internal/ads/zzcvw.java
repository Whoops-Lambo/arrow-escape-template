package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class zzcvw implements zzipf {
    public final zzczp a;

    @Override // com.google.android.gms.internal.ads.zzipu
    public final /* bridge */ /* synthetic */ Object zzb() {
        try {
            return new JSONObject(this.a.a().z);
        } catch (JSONException unused) {
            return null;
        }
    }

    public zzcvw(zzczp zzczpVar) {
        this.a = zzczpVar;
    }
}
