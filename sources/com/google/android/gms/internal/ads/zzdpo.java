package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzdpo implements zzipf {
    public final zzdpl a;

    @Override // com.google.android.gms.internal.ads.zzipu
    public final Object zzb() {
        zzdro zzdroVar = this.a.a.a;
        zzipn.a(zzdroVar);
        Set setSingleton = zzdroVar.d != null ? Collections.singleton("banner") : Collections.EMPTY_SET;
        zzipn.a(setSingleton);
        return setSingleton;
    }

    public zzdpo(zzdpl zzdplVar) {
        this.a = zzdplVar;
    }
}
