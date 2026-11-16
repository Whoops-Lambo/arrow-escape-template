package com.google.android.gms.internal.ads;

import defpackage.b04;
import defpackage.o24;
import defpackage.uf0;
import defpackage.y74;
import defpackage.z74;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes10.dex */
public final class zzdep extends zzdka implements zzdeg {
    public final ScheduledExecutorService b;
    public ScheduledFuture c;
    public boolean d;

    @Override // com.google.android.gms.internal.ads.zzdeg
    public final void A(zzdoy zzdoyVar) {
        if (this.d) {
            return;
        }
        ScheduledFuture scheduledFuture = this.c;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
        }
        k0(new z74(zzdoyVar, 1));
    }

    public final void l0() {
        this.c = this.b.schedule(new b04(this, 22), ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjr.wc)).intValue(), TimeUnit.MILLISECONDS);
    }

    @Override // com.google.android.gms.internal.ads.zzdeg
    public final void zzc(com.google.android.gms.ads.internal.client.zze zzeVar) {
        k0(new y74(2, zzeVar));
    }

    @Override // com.google.android.gms.internal.ads.zzdeg
    public final void zze() {
        k0(uf0.p);
    }

    public zzdep(zzdel zzdelVar, Set set, o24 o24Var, ScheduledExecutorService scheduledExecutorService) {
        super(set);
        this.d = false;
        this.b = scheduledExecutorService;
        Z(zzdelVar, o24Var);
    }
}
