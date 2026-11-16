package com.google.android.gms.internal.ads;

import defpackage.o24;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class zzfqa implements zzipf {
    public final zzipe a;

    @Override // com.google.android.gms.internal.ads.zzipu
    public final Object zzb() {
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.a.zzb();
        o24 o24Var = zzcgv.a;
        zzipn.a(o24Var);
        return new zzfpz(scheduledExecutorService, o24Var);
    }

    public zzfqa(zzipe zzipeVar) {
        this.a = zzipeVar;
    }
}
