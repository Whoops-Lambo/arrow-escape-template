package com.google.android.gms.internal.ads;

import java.util.HashMap;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
public final class zzeri implements zzenf {
    public final HashMap a = new HashMap();
    public final zzdyn b;

    @Override // com.google.android.gms.internal.ads.zzenf
    public final zzeng a(String str, JSONObject jSONObject) {
        zzeng zzengVar;
        synchronized (this) {
            try {
                HashMap map = this.a;
                zzengVar = (zzeng) map.get(str);
                if (zzengVar == null) {
                    zzengVar = new zzeng(this.b.a(str, jSONObject), new zzeot(), str);
                    map.put(str, zzengVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzengVar;
    }

    public zzeri(zzdyn zzdynVar) {
        this.b = zzdynVar;
    }
}
