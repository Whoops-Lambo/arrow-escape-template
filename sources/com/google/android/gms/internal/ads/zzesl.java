package com.google.android.gms.internal.ads;

import android.view.View;
import defpackage.c95;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
public final class zzesl implements com.google.android.gms.ads.internal.zzg {
    public final zzdea a;
    public final zzdeu b;
    public final zzdml c;
    public final zzdmd d;
    public final zzcvl e;
    public final AtomicBoolean f = new AtomicBoolean(false);

    @Override // com.google.android.gms.ads.internal.zzg
    public final synchronized void zza(View view) {
        if (this.f.compareAndSet(false, true)) {
            this.e.Q();
            this.d.l0(view);
        }
    }

    @Override // com.google.android.gms.ads.internal.zzg
    /* JADX INFO: renamed from: zzb */
    public final void mo1397zzb() {
        if (this.f.get()) {
            this.a.onAdClicked();
        }
    }

    @Override // com.google.android.gms.ads.internal.zzg
    public final void zzc() {
        if (this.f.get()) {
            this.b.zza();
            zzdml zzdmlVar = this.c;
            synchronized (zzdmlVar) {
                zzdmlVar.k0(c95.b);
            }
        }
    }

    public zzesl(zzdea zzdeaVar, zzdeu zzdeuVar, zzdml zzdmlVar, zzdmd zzdmdVar, zzcvl zzcvlVar) {
        this.a = zzdeaVar;
        this.b = zzdeuVar;
        this.c = zzdmlVar;
        this.d = zzdmdVar;
        this.e = zzcvlVar;
    }
}
