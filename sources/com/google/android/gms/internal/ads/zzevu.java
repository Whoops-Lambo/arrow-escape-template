package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzevu implements zzipf {
    public final zzipo a;
    public final zzddt b;
    public final zzipo c;

    @Override // com.google.android.gms.internal.ads.zzipu
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzevs((Clock) this.a.zzb(), this.b.a(), ((Long) this.c.zzb()).longValue());
    }

    public zzevu(zzddt zzddtVar, zzipo zzipoVar, zzipo zzipoVar2) {
        this.a = zzipoVar;
        this.b = zzddtVar;
        this.c = zzipoVar2;
    }
}
