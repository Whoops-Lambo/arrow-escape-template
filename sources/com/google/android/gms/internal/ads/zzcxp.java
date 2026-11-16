package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class zzcxp implements zzipf {
    public final zzevr a;
    public final zzipo b;

    @Override // com.google.android.gms.internal.ads.zzipu
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzfch(this.a.zzb(), ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjr.pe)).intValue(), (ScheduledExecutorService) this.b.zzb());
    }

    public zzcxp(zzevr zzevrVar, zzipe zzipeVar) {
        this.a = zzevrVar;
        this.b = zzipeVar;
    }
}
