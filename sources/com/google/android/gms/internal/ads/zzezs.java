package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzezs implements zzipf {
    public final zzeyf a;
    public final zzipo b;

    @Override // com.google.android.gms.internal.ads.zzipu
    public final Object zzb() {
        return new zzfch(new zzeye((zzfip) this.a.a.a), ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjr.ge)).intValue(), (ScheduledExecutorService) this.b.zzb());
    }

    public zzezs(zzeyf zzeyfVar, zzipe zzipeVar) {
        this.a = zzeyfVar;
        this.b = zzipeVar;
    }
}
