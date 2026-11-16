package com.google.android.gms.internal.ads;

import defpackage.b04;
import defpackage.ku4;
import defpackage.mx3;
import defpackage.o24;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzdcr implements zzdec, zzdlo, zzdje, zzdes, zzbfr {
    public final zzdeu a;
    public final zzdgv b;
    public final zzflq c;
    public final ScheduledExecutorService d;
    public final Executor e;
    public ScheduledFuture g;
    public final String i;
    public final zzhfd f = zzhfd.s();
    public final AtomicBoolean h = new AtomicBoolean();

    @Override // com.google.android.gms.internal.ads.zzdec
    public final void A(zzccq zzccqVar, String str, String str2) {
    }

    @Override // com.google.android.gms.internal.ads.zzdec
    public final void L() {
    }

    @Override // com.google.android.gms.internal.ads.zzdec
    public final void O() {
    }

    @Override // com.google.android.gms.internal.ads.zzdje
    public final void d() {
    }

    @Override // com.google.android.gms.internal.ads.zzdje
    public final synchronized void m() {
        if (this.c.e == 4) {
            this.a.zza();
            return;
        }
        zzhfd zzhfdVar = this.f;
        if (zzhfdVar.isDone()) {
            return;
        }
        ScheduledFuture scheduledFuture = this.g;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
        }
        zzhfdVar.e(Boolean.TRUE);
    }

    @Override // com.google.android.gms.internal.ads.zzdes
    public final synchronized void n(com.google.android.gms.ads.internal.client.zze zzeVar) {
        try {
            zzhfd zzhfdVar = this.f;
            if (zzhfdVar.isDone()) {
                return;
            }
            ScheduledFuture scheduledFuture = this.g;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(true);
            }
            zzhfdVar.f(new Exception());
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdec
    public final void zze() {
    }

    @Override // com.google.android.gms.internal.ads.zzdec
    public final void zzf() {
    }

    @Override // com.google.android.gms.internal.ads.zzdlo
    public final void zzh() {
    }

    @Override // com.google.android.gms.internal.ads.zzbfr
    public final void K(zzbfq zzbfqVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjr.qd)).booleanValue() && f() && zzbfqVar.j && this.h.compareAndSet(false, true) && this.c.e != 3) {
            com.google.android.gms.ads.internal.util.zze.zza("Full screen 1px impression occurred");
            this.a.zza();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdec
    public final void N() {
        zzflq zzflqVar = this.c;
        if (zzflqVar.e == 3) {
            return;
        }
        int i = zzflqVar.Y;
        if (i == 0 || i == 1) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjr.qd)).booleanValue() && f()) {
                return;
            }
            this.a.zza();
        }
    }

    public final boolean f() {
        return this.i.equals("com.google.ads.mediation.admob.AdMobAdapter");
    }

    @Override // com.google.android.gms.internal.ads.zzdlo
    public final void zzg() {
        zzflq zzflqVar = this.c;
        int i = zzflqVar.e;
        if (i == 3) {
            return;
        }
        if (i == 4) {
            this.b.zza();
            return;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjr.p2)).booleanValue() && zzflqVar.Y == 2) {
            int i2 = zzflqVar.q;
            if (i2 == 0) {
                this.a.zza();
                return;
            }
            mx3 mx3Var = new mx3(this, 17);
            zzhfd zzhfdVar = this.f;
            zzhfdVar.addListener(new ku4(0, zzhfdVar, mx3Var), this.e);
            this.g = this.d.schedule(new b04(this, 20), i2, TimeUnit.MILLISECONDS);
        }
    }

    public zzdcr(zzdeu zzdeuVar, zzflq zzflqVar, ScheduledExecutorService scheduledExecutorService, o24 o24Var, String str, zzdgv zzdgvVar) {
        this.a = zzdeuVar;
        this.c = zzflqVar;
        this.d = scheduledExecutorService;
        this.e = o24Var;
        this.i = str;
        this.b = zzdgvVar;
    }
}
