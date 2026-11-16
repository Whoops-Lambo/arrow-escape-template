package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.client.zzo;
import com.unity3d.services.UnityAdsConstants;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class zzbqu implements zzbqs {
    public final zzbqv a;

    @Override // com.google.android.gms.internal.ads.zzbqs
    public final void a(Object obj, Map map) {
        zzcly zzclyVar = (zzcly) obj;
        boolean zEquals = "1".equals(map.get("transparentBackground"));
        boolean zEquals2 = "1".equals(map.get("blur"));
        float f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        try {
            if (map.get("blurRadius") != null) {
                f = Float.parseFloat((String) map.get("blurRadius"));
            }
        } catch (NumberFormatException e) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            zzo.zzg("Fail to parse float", e);
        }
        zzbqv zzbqvVar = this.a;
        synchronized (zzbqvVar) {
            zzbqvVar.a = zEquals;
            zzbqvVar.d.set(true);
        }
        synchronized (zzbqvVar) {
            zzbqvVar.b = zEquals2;
            zzbqvVar.c = f;
        }
        zzclyVar.h0((int) f, zEquals);
    }

    public zzbqu(zzbqv zzbqvVar) {
        this.a = zzbqvVar;
    }
}
