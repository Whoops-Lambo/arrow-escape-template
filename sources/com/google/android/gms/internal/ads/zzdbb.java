package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzdbb implements zzipf {
    public final zzipo a;
    public final zzipo b;
    public final zzddt c;
    public final zzipe d;

    @Override // com.google.android.gms.internal.ads.zzipu
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzdba((Clock) this.a.zzb(), (zzdbc) this.b.zzb(), this.c.a(), (String) this.d.zzb());
    }

    public zzdbb(zzipo zzipoVar, zzipo zzipoVar2, zzddt zzddtVar, zzipe zzipeVar) {
        this.a = zzipoVar;
        this.b = zzipoVar2;
        this.c = zzddtVar;
        this.d = zzipeVar;
    }
}
