package com.google.android.gms.ads.internal.client;

import android.os.RemoteException;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
final class zzfg implements Runnable {
    final /* synthetic */ zzfh zza;

    @Override // java.lang.Runnable
    public final void run() {
        zzfh zzfhVar = this.zza;
        if (zzfhVar.zzK() != null) {
            try {
                zzfhVar.zzK().zzb(1);
            } catch (RemoteException e) {
                com.google.android.gms.ads.internal.util.client.zzo.zzj("Could not notify onAdFailedToLoad event.", e);
            }
        }
    }

    public zzfg(zzfh zzfhVar) {
        Objects.requireNonNull(zzfhVar);
        this.zza = zzfhVar;
    }
}
