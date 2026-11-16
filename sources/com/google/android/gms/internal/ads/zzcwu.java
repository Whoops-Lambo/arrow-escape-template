package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import defpackage.r64;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class zzcwu implements zzipf {
    public final zzdbf a;
    public final zzipo b;
    public final zzcxa c;
    public final zzcwz d;
    public final zzcxo e;
    public final zzcxb f;
    public final zzipo g;
    public final zzipe h;
    public final zzipd i;
    public final zzipo j;

    @Override // com.google.android.gms.internal.ads.zzipu
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final r64 zzb() {
        zzcyx zzcyxVarZzb = this.a.zzb();
        Context context = (Context) this.b.zzb();
        zzflr zzflrVar = this.c.a.c;
        zzipn.a(zzflrVar);
        View view = this.d.a.b;
        zzipn.a(view);
        zzcly zzclyVar = this.e.a.d;
        zzcyw zzcywVar = this.f.a.a;
        zzdro zzdroVar = ((zzdpl) this.g).a.a;
        zzipn.a(zzdroVar);
        return new r64(zzcyxVarZzb, context, zzflrVar, view, zzclyVar, zzcywVar, zzdroVar, (zzdml) this.h.zzb(), zzipe.b(this.i), (Executor) this.j.zzb());
    }

    public zzcwu(zzdbf zzdbfVar, zzipe zzipeVar, zzcxa zzcxaVar, zzcwz zzcwzVar, zzcxo zzcxoVar, zzcxb zzcxbVar, zzdpl zzdplVar, zzipe zzipeVar2, zzipd zzipdVar, zzipe zzipeVar3) {
        this.a = zzdbfVar;
        this.b = zzipeVar;
        this.c = zzcxaVar;
        this.d = zzcwzVar;
        this.e = zzcxoVar;
        this.f = zzcxbVar;
        this.g = zzdplVar;
        this.h = zzipeVar2;
        this.i = zzipdVar;
        this.j = zzipeVar3;
    }
}
