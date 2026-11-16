package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class zzffz implements zzipf {
    public final zzipo a;
    public final zzipo b;

    @Override // com.google.android.gms.internal.ads.zzipu
    public final Object zzb() {
        new zzcaj();
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.a.zzb();
        ((zzcox) this.b).a();
        return new zzffx(scheduledExecutorService);
    }

    public zzffz(zzcox zzcoxVar, zzipe zzipeVar) {
        this.a = zzipeVar;
        this.b = zzcoxVar;
    }
}
