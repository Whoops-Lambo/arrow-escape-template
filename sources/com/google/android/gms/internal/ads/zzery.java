package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.client.zzo;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
public final class zzery implements zzenf {
    public final zzetc a;
    public final zzdyn b;

    @Override // com.google.android.gms.internal.ads.zzenf
    public final zzeng a(String str, JSONObject jSONObject) {
        zzbyf zzbyfVarB;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjr.x2)).booleanValue()) {
            try {
                zzbyfVarB = this.b.b(str);
            } catch (RemoteException e) {
                int i = com.google.android.gms.ads.internal.util.zze.zza;
                zzo.zzg("Coundn't create RTB adapter: ", e);
            }
        } else {
            ConcurrentHashMap concurrentHashMap = this.a.a;
            zzbyfVarB = concurrentHashMap.containsKey(str) ? (zzbyf) concurrentHashMap.get(str) : null;
        }
        if (zzbyfVarB == null) {
            return null;
        }
        return new zzeng(zzbyfVarB, new zzeos(), str);
    }

    public zzery(zzetc zzetcVar, zzdyn zzdynVar) {
        this.a = zzetcVar;
        this.b = zzdynVar;
    }
}
