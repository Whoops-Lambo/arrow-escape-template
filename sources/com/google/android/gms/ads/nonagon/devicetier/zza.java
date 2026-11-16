package com.google.android.gms.ads.nonagon.devicetier;

import com.google.android.gms.internal.ads.zzcox;
import com.google.android.gms.internal.ads.zzipf;
import com.google.android.gms.internal.ads.zzipo;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
public final class zza implements zzipf {
    private final zzipo zza;

    public static zza zza(zzipo zzipoVar) {
        return new zza(zzipoVar);
    }

    @Override // com.google.android.gms.internal.ads.zzipu
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new DeviceTierManager(((zzcox) this.zza).a());
    }

    private zza(zzipo zzipoVar) {
        this.zza = zzipoVar;
    }
}
