package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzdoj implements zzipf {
    public final zzipe a;

    @Override // com.google.android.gms.internal.ads.zzipu
    public final /* bridge */ /* synthetic */ Object zzb() {
        Set setSingleton = Collections.singleton(new zzdmb((zzdpc) this.a.zzb(), zzcgv.h));
        zzipn.a(setSingleton);
        return setSingleton;
    }

    public zzdoj(zzipe zzipeVar) {
        this.a = zzipeVar;
    }
}
