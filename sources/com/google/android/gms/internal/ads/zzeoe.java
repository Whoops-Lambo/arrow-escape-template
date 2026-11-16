package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzeoe implements zzipf {
    public final zzipg a;
    public final zzipe b;
    public final zzipo c;
    public final zzipe d;
    public final zzddt e;
    public final zzipe f;
    public final zzipe g;

    @Override // com.google.android.gms.internal.ads.zzipu
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final zzeod zzb() {
        return new zzeod((zzcxv) this.a.a, (Context) this.b.zzb(), (Executor) this.c.zzb(), (zzdxt) this.d.zzb(), this.e.a(), (zzgvq) this.f.zzb(), (zzear) this.g.zzb());
    }

    public zzeoe(zzipg zzipgVar, zzipe zzipeVar, zzipo zzipoVar, zzipe zzipeVar2, zzddt zzddtVar, zzipe zzipeVar3, zzipe zzipeVar4) {
        this.a = zzipgVar;
        this.b = zzipeVar;
        this.c = zzipoVar;
        this.d = zzipeVar2;
        this.e = zzddtVar;
        this.f = zzipeVar3;
        this.g = zzipeVar4;
    }
}
