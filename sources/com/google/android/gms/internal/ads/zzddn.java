package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzddn implements zzipf {
    public final zzddm a;
    public final zzipe b;

    @Override // com.google.android.gms.internal.ads.zzipu
    public final Object zzb() {
        String str = (String) this.b.zzb();
        zzeni zzeniVar = this.a.f;
        return zzeniVar != null ? zzeniVar : new zzeni(str);
    }

    public zzddn(zzddm zzddmVar, zzipe zzipeVar) {
        this.a = zzddmVar;
        this.b = zzipeVar;
    }
}
