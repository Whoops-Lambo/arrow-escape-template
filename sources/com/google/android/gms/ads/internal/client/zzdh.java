package com.google.android.gms.ads.internal.client;

import android.os.RemoteException;
import com.google.android.gms.ads.MuteThisAdReason;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzdh implements MuteThisAdReason {
    private final String zza;
    private final zzdg zzb;

    @Override // com.google.android.gms.ads.MuteThisAdReason
    public final String getDescription() {
        return this.zza;
    }

    public final String toString() {
        return this.zza;
    }

    public final zzdg zza() {
        return this.zzb;
    }

    public zzdh(zzdg zzdgVar) {
        String strZze;
        this.zzb = zzdgVar;
        try {
            strZze = zzdgVar.zze();
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzg("", e);
            strZze = null;
        }
        this.zza = strZze;
    }
}
