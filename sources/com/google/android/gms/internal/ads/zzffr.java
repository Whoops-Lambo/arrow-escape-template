package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.zzbp;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class zzffr implements zzfdt {
    public final String a;
    public final String b;

    @Override // com.google.android.gms.internal.ads.zzfdt
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        try {
            JSONObject jSONObjectZzh = zzbp.zzh((JSONObject) obj, "pii");
            jSONObjectZzh.put("doritos", this.a);
            jSONObjectZzh.put("doritos_v2", this.b);
        } catch (JSONException unused) {
            com.google.android.gms.ads.internal.util.zze.zza("Failed putting doritos string.");
        }
    }

    public zzffr(String str, String str2) {
        this.a = str;
        this.b = str2;
    }
}
