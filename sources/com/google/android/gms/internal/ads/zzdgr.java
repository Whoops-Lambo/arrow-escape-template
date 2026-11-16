package com.google.android.gms.internal.ads;

import defpackage.g84;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzdgr extends zzdka implements zzdew, zzdgb {
    public final zzflq b;
    public final AtomicBoolean c;
    public final zzfmb d;

    @Override // com.google.android.gms.internal.ads.zzdew
    public final void Q() {
        int i = this.b.b;
        if (i == 2 || i == 5 || i == 4 || i == 6 || i == 7) {
            l0();
        }
    }

    public final void l0() {
        com.google.android.gms.ads.internal.client.zzt zztVar;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjr.k9)).booleanValue() && (zztVar = this.b.e0) != null && zztVar.zza == 3 && this.c.compareAndSet(false, true)) {
            k0(new g84(zztVar, 1));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdgb
    public final void zzl() {
        if (this.b.b == 1) {
            l0();
        }
    }

    public zzdgr(Set set, zzflq zzflqVar, zzfmb zzfmbVar) {
        super(set);
        this.c = new AtomicBoolean();
        this.b = zzflqVar;
        this.d = zzfmbVar;
    }
}
