package com.google.android.gms.ads.internal.util;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
final class zza implements Runnable {
    final /* synthetic */ zzb zza;

    @Override // java.lang.Runnable
    public final void run() {
        zzb zzbVar = this.zza;
        zzbVar.zzc(Thread.currentThread());
        zzbVar.zza();
    }

    public zza(zzb zzbVar) {
        Objects.requireNonNull(zzbVar);
        this.zza = zzbVar;
    }
}
