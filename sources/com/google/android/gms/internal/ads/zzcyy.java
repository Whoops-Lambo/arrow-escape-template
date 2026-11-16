package com.google.android.gms.internal.ads;

import defpackage.ar4;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public class zzcyy implements zzeqp {
    public final zzfmb a;
    public final zzflq b;
    public final zzdfb c;
    public final zzdfo d;
    public final zzfje e;
    public final zzddv f;
    public final zzdit g;
    public final zzdfs h;
    public final zzdly i;
    public final zzdcx j;
    public final zzebz k;

    public void a() {
        this.d.zzg();
        this.h.N(this);
    }

    public final void b() {
        zzebz zzebzVar;
        w wVar = this.b.C0;
        if (wVar == null || wVar.isEmpty() || (zzebzVar = this.k) == null) {
            return;
        }
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjr.Y8)).booleanValue() || wVar.isEmpty()) {
            return;
        }
        ar4 ar4VarListIterator = wVar.listIterator(0);
        while (ar4VarListIterator.hasNext()) {
            zzeca zzecaVar = (zzeca) ar4VarListIterator.next();
            for (int i : zzecaVar.b) {
                if (i == 1) {
                    zzebzVar.a(1, zzecaVar.a, com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis());
                    break;
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzeqp
    public final void zzm() {
        this.i.zzi();
    }

    public zzcyy(zzcyx zzcyxVar) {
        this.a = zzcyxVar.a;
        this.b = zzcyxVar.b;
        this.c = zzcyxVar.c;
        this.d = zzcyxVar.d;
        this.e = zzcyxVar.e;
        this.f = zzcyxVar.f;
        this.g = zzcyxVar.g;
        this.h = zzcyxVar.h;
        this.i = zzcyxVar.i;
        this.j = zzcyxVar.j;
        this.k = zzcyxVar.k;
    }
}
