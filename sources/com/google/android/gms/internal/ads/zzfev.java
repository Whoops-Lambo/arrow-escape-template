package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.ads.internal.util.zzbp;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class zzfev implements zzfdt {
    public final AdvertisingIdClient.Info a;
    public final String b;
    public final zzgey c;

    @Override // com.google.android.gms.internal.ads.zzfdt
    public final void zza(Object obj) {
        try {
            JSONObject jSONObjectZzh = zzbp.zzh((JSONObject) obj, "pii");
            AdvertisingIdClient.Info info = this.a;
            if (info == null || TextUtils.isEmpty(info.getId())) {
                String str = this.b;
                if (str != null) {
                    jSONObjectZzh.put("pdid", str);
                    jSONObjectZzh.put("pdidtype", "ssaid");
                    return;
                }
                return;
            }
            jSONObjectZzh.put("rdid", info.getId());
            jSONObjectZzh.put("is_lat", info.isLimitAdTrackingEnabled());
            jSONObjectZzh.put("idtype", "adid");
            zzgey zzgeyVar = this.c;
            long j = zzgeyVar.b;
            String str2 = zzgeyVar.a;
            if (str2 != null && j > 0) {
                jSONObjectZzh.put("paidv1_id_android_3p", str2);
                jSONObjectZzh.put("paidv1_creation_time_android_3p", j);
            }
        } catch (JSONException e) {
            com.google.android.gms.ads.internal.util.zze.zzb("Failed putting Ad ID.", e);
        }
    }

    public zzfev(AdvertisingIdClient.Info info, String str, zzgey zzgeyVar) {
        this.a = info;
        this.b = str;
        this.c = zzgeyVar;
    }
}
