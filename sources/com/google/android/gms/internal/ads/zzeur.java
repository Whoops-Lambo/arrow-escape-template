package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.client.zzo;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzeur implements com.google.android.gms.ads.internal.client.zza, zzdmj {
    public com.google.android.gms.ads.internal.client.zzbe a;

    @Override // com.google.android.gms.internal.ads.zzdmj
    public final synchronized void W() {
        com.google.android.gms.ads.internal.client.zzbe zzbeVar = this.a;
        if (zzbeVar != null) {
            try {
                zzbeVar.zza();
            } catch (RemoteException e) {
                int i = com.google.android.gms.ads.internal.util.zze.zza;
                zzo.zzj("Remote Exception at onPhysicalClick.", e);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdmj
    public final synchronized void i0() {
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final synchronized void onAdClicked() {
        com.google.android.gms.ads.internal.client.zzbe zzbeVar = this.a;
        if (zzbeVar != null) {
            try {
                zzbeVar.zza();
            } catch (RemoteException e) {
                int i = com.google.android.gms.ads.internal.util.zze.zza;
                zzo.zzj("Remote Exception at onAdClicked.", e);
            }
        }
    }
}
