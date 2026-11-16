package com.google.android.gms.ads.internal.client;

import androidx.annotation.Nullable;
import com.google.android.gms.ads.AdValue;
import com.google.android.gms.ads.OnPaidEventListener;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzfo extends zzdp {

    @Nullable
    private final OnPaidEventListener zza;

    @Override // com.google.android.gms.ads.internal.client.zzdq
    public final void zze(zzt zztVar) {
        OnPaidEventListener onPaidEventListener = this.zza;
        if (onPaidEventListener != null) {
            onPaidEventListener.onPaidEvent(AdValue.zza(zztVar.zzb, zztVar.zzc, zztVar.zzd));
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzdq
    public final boolean zzf() {
        return this.zza == null;
    }

    public zzfo(@Nullable OnPaidEventListener onPaidEventListener) {
        this.zza = onPaidEventListener;
    }
}
