package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class zzbkz implements zzipf {
    public final zzipo a;
    public final zzipo b;
    public final zzipe c;

    @Override // com.google.android.gms.internal.ads.zzipu
    public final Object zzb() {
        ((zzcox) this.a).a();
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.b.zzb();
        new zzbla();
        return new zzbky(scheduledExecutorService);
    }

    public zzbkz(zzipo zzipoVar, zzipo zzipoVar2, zzipe zzipeVar) {
        this.a = zzipoVar;
        this.b = zzipoVar2;
        this.c = zzipeVar;
    }
}
