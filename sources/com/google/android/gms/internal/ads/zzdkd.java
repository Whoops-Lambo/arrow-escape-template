package com.google.android.gms.internal.ads;

import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes10.dex */
public final class zzdkd implements zzipf {
    public final zzdkc a;
    public final zzipr b;

    @Override // com.google.android.gms.internal.ads.zzipu
    public final Object zzb() {
        Set setZzb = this.b.zzb();
        zzdkc zzdkcVar = this.a;
        if (zzdkcVar.p == null) {
            zzdkcVar.p = new zzdee(setZzb);
        }
        zzdee zzdeeVar = zzdkcVar.p;
        zzipn.a(zzdeeVar);
        return zzdeeVar;
    }

    public zzdkd(zzdkc zzdkcVar, zzipr zziprVar) {
        this.a = zzdkcVar;
        this.b = zziprVar;
    }
}
