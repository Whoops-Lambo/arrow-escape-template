package com.google.android.gms.ads.internal;

import com.google.android.gms.internal.ads.zzgaw;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
final class zzh implements zzgaw {
    final /* synthetic */ zzk zza;

    public zzh(zzk zzkVar) {
        Objects.requireNonNull(zzkVar);
        this.zza = zzkVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgaw
    public final void zza(int i, long j) {
        this.zza.zzo().b(i, System.currentTimeMillis() - j);
    }

    @Override // com.google.android.gms.internal.ads.zzgaw
    public final void zzb(int i, long j, String str) {
        this.zza.zzo().e(i, System.currentTimeMillis() - j, null, null, str);
    }
}
