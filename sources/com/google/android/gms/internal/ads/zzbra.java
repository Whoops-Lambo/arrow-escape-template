package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.safedk.android.analytics.events.base.StatsEvent;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class zzbra implements zzbqs {
    public final zzebz a;

    @Override // com.google.android.gms.internal.ads.zzbqs
    public final void a(Object obj, Map map) {
        if (map == null || !map.containsKey("id") || TextUtils.isEmpty((CharSequence) map.get("id")) || !map.containsKey(StatsEvent.z) || TextUtils.isEmpty((CharSequence) map.get(StatsEvent.z))) {
            com.google.android.gms.ads.internal.util.zze.zza("Ignoring onDeviceStorageEvent GMSG: missing required parameters.");
            return;
        }
        try {
            long j = Long.parseLong((String) map.get("id"));
            this.a.a(Integer.parseInt((String) map.get(StatsEvent.z)), j, com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis());
        } catch (NumberFormatException e) {
            com.google.android.gms.ads.internal.util.zze.zzb("Ignoring onDeviceStorageEvent GMSG: invalid number format for ID or eventType.", e);
        }
    }

    public zzbra(zzebz zzebzVar) {
        this.a = zzebzVar;
    }
}
