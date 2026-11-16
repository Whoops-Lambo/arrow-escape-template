package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzezp implements zzipf {
    public final zzipo a;
    public final zzipo b;
    public final zzipo c;
    public final zzipo d;

    @Override // com.google.android.gms.internal.ads.zzipu
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzexp zzexpVarZzb = ((zzexr) this.a).zzb();
        zzeyj zzeyjVar = (zzeyj) this.b.zzb();
        List list = (List) this.c.zzb();
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.d.zzb();
        if (list.contains("54")) {
            return new zzfch(zzeyjVar, ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjr.je)).intValue(), scheduledExecutorService);
        }
        return new zzfch(zzexpVarZzb, ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjr.je)).intValue(), scheduledExecutorService);
    }

    public zzezp(zzipo zzipoVar, zzipo zzipoVar2, zzipo zzipoVar3, zzipo zzipoVar4) {
        this.a = zzipoVar;
        this.b = zzipoVar2;
        this.c = zzipoVar3;
        this.d = zzipoVar4;
    }
}
