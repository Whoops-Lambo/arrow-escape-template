package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.util.client.zzo;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class zzbrn implements zzbqs {
    public final zzbrm a;

    @Override // com.google.android.gms.internal.ads.zzbqs
    public final void a(Object obj, Map map) {
        String str = (String) map.get("action");
        boolean zEquals = "grant".equals(str);
        zzbrm zzbrmVar = this.a;
        if (!zEquals) {
            if ("video_start".equals(str)) {
                zzbrmVar.zza();
                return;
            } else {
                if ("video_complete".equals(str)) {
                    zzbrmVar.zzc();
                    return;
                }
                return;
            }
        }
        zzcdf zzcdfVar = null;
        try {
            int i = Integer.parseInt((String) map.get("amount"));
            String str2 = (String) map.get("type");
            if (!TextUtils.isEmpty(str2)) {
                zzcdfVar = new zzcdf(str2, i);
            }
        } catch (NumberFormatException e) {
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            zzo.zzj("Unable to parse reward amount.", e);
        }
        zzbrmVar.O(zzcdfVar);
    }

    public zzbrn(zzbrm zzbrmVar) {
        this.a = zzbrmVar;
    }
}
