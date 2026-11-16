package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.common.util.concurrent.ListenableFuture;
import defpackage.e74;
import defpackage.nu4;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzeod implements zzend {
    public final zzcxv a;
    public final Context b;
    public final zzdxt c;
    public final zzfmj d;
    public final Executor e;
    public final zzgvq f;
    public final zzear g;

    @Override // com.google.android.gms.internal.ads.zzend
    public final ListenableFuture a(zzfmb zzfmbVar, zzflq zzflqVar) {
        return zzheh.h(nu4.b, new e74(4, this, zzfmbVar, zzflqVar), this.e);
    }

    @Override // com.google.android.gms.internal.ads.zzend
    public final boolean b(zzfmb zzfmbVar, zzflq zzflqVar) {
        zzflv zzflvVar = zzflqVar.s;
        return (zzflvVar == null || zzflvVar.a == null) ? false : true;
    }

    public zzeod(zzcxv zzcxvVar, Context context, Executor executor, zzdxt zzdxtVar, zzfmj zzfmjVar, zzgvq zzgvqVar, zzear zzearVar) {
        this.b = context;
        this.a = zzcxvVar;
        this.e = executor;
        this.c = zzdxtVar;
        this.d = zzfmjVar;
        this.f = zzgvqVar;
        this.g = zzearVar;
    }
}
