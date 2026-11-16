package com.google.android.gms.internal.ads;

import defpackage.e94;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzdph implements zzipf {
    public final zzipj a;
    public final zzipj b;
    public final zzipj c;
    public final zzipe d;
    public final zzdpl e;

    @Override // com.google.android.gms.internal.ads.zzipu
    public final Object zzb() {
        Map mapZzb = this.a.zzb();
        Map mapZzb2 = this.b.zzb();
        Map mapZzb3 = this.c.zzb();
        zzdro zzdroVar = this.e.a.a;
        zzipn.a(zzdroVar);
        return new e94(mapZzb, mapZzb2, mapZzb3, this.d, zzdroVar);
    }

    public zzdph(zzipj zzipjVar, zzipj zzipjVar2, zzipj zzipjVar3, zzipe zzipeVar, zzdpl zzdplVar) {
        this.a = zzipjVar;
        this.b = zzipjVar2;
        this.c = zzipjVar3;
        this.d = zzipeVar;
        this.e = zzdplVar;
    }
}
