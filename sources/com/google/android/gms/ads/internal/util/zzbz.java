package com.google.android.gms.ads.internal.util;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import androidx.annotation.GuardedBy;
import com.google.android.gms.internal.ads.zzbjr;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class zzbz {

    @GuardedBy
    private final Map zza = new HashMap();

    @GuardedBy
    private final List zzb = new ArrayList();
    private final Context zzc;

    public final synchronized void zzb(zzbx zzbxVar) {
        this.zzb.add(zzbxVar);
    }

    public final synchronized void zzc(String str) {
        try {
            Map map = this.zza;
            if (map.containsKey(str)) {
                return;
            }
            boolean zEquals = Objects.equals(str, "__default__");
            Context context = this.zzc;
            SharedPreferences defaultSharedPreferences = zEquals ? PreferenceManager.getDefaultSharedPreferences(context) : context.getSharedPreferences(str, 0);
            zzbw zzbwVar = new zzbw(this, str);
            map.put(str, zzbwVar);
            defaultSharedPreferences.registerOnSharedPreferenceChangeListener(zzbwVar);
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void zza() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjr.hc)).booleanValue()) {
            com.google.android.gms.ads.internal.zzt.zzc();
            final Map mapZzx = zzs.zzx((String) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjr.mc));
            Iterator it = mapZzx.keySet().iterator();
            while (it.hasNext()) {
                zzc((String) it.next());
            }
            zzb(new zzbx() { // from class: com.google.android.gms.ads.internal.util.zzby
                @Override // com.google.android.gms.ads.internal.util.zzbx
                public final /* synthetic */ void zza(SharedPreferences sharedPreferences, String str, String str2) {
                    Map map = mapZzx;
                    if (map.containsKey(str) && ((Set) map.get(str)).contains(str2)) {
                        com.google.android.gms.ads.internal.zzt.zzh().g().zzy(false);
                    }
                }
            });
        }
    }

    public final /* synthetic */ List zzd() {
        return this.zzb;
    }

    public zzbz(Context context) {
        this.zzc = context;
    }
}
