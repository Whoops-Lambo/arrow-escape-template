package com.google.android.gms.internal.ads;

import defpackage.xw0;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class zzcyn implements zzdfq, zzbfr, zzdje {
    public final zzflq a;
    public final zzdeu b;
    public final zzdfz c;
    public final zzdgv f;
    public final AtomicBoolean d = new AtomicBoolean();
    public final AtomicBoolean e = new AtomicBoolean();
    public final AtomicBoolean g = new AtomicBoolean();

    @Override // com.google.android.gms.internal.ads.zzdje
    public final void d() {
    }

    public final void f() {
        if (this.d.compareAndSet(false, true)) {
            this.b.zza();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdfq
    public final synchronized void zzg() {
        int i = this.a.e;
        if (i == 1 || i == 4 || i == 3) {
            return;
        }
        f();
    }

    @Override // com.google.android.gms.internal.ads.zzbfr
    public final void K(zzbfq zzbfqVar) {
        int i = this.a.e;
        if (i == 1) {
            if (zzbfqVar.j) {
                f();
            }
        } else if (i == 4 && zzbfqVar.j && this.g.compareAndSet(false, true)) {
            this.f.zza();
        }
        if (zzbfqVar.j && this.e.compareAndSet(false, true)) {
            zzdfz zzdfzVar = this.c;
            synchronized (zzdfzVar) {
                zzdfzVar.k0(xw0.n);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdje
    public final void m() {
        if (this.a.e == 4) {
            f();
        }
    }

    public zzcyn(zzflq zzflqVar, zzdeu zzdeuVar, zzdfz zzdfzVar, zzdgv zzdgvVar) {
        this.a = zzflqVar;
        this.b = zzdeuVar;
        this.c = zzdfzVar;
        this.f = zzdgvVar;
    }
}
