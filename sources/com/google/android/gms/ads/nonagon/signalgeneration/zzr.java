package com.google.android.gms.ads.nonagon.signalgeneration;

import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.internal.ads.zzdmv;
import com.google.android.gms.internal.ads.zzear;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class zzr implements zzdmv {
    private final zzear zza;
    private final zzq zzb;
    private final String zzc;

    @Override // com.google.android.gms.internal.ads.zzdmv
    public final void zze(@Nullable String str) {
    }

    @Override // com.google.android.gms.internal.ads.zzdmv
    public final void zzd(@Nullable zzbc zzbcVar) {
        if (zzbcVar == null) {
            return;
        }
        this.zzb.zza(this.zzc, zzbcVar.zzb, this.zza);
    }

    @VisibleForTesting
    public zzr(zzear zzearVar, zzq zzqVar, String str) {
        this.zza = zzearVar;
        this.zzb = zzqVar;
        this.zzc = str;
    }
}
