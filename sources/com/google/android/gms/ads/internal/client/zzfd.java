package com.google.android.gms.ads.internal.client;

import android.os.RemoteException;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
final class zzfd implements Runnable {
    final /* synthetic */ zzfe zza;

    @Override // java.lang.Runnable
    public final void run() {
        zzff zzffVar = this.zza.zza;
        if (zzffVar.zzb() != null) {
            try {
                zzffVar.zzb().zzb(1);
            } catch (RemoteException e) {
                com.google.android.gms.ads.internal.util.client.zzo.zzj("Could not notify onAdFailedToLoad event.", e);
            }
        }
    }

    public zzfd(zzfe zzfeVar) {
        Objects.requireNonNull(zzfeVar);
        this.zza = zzfeVar;
    }
}
