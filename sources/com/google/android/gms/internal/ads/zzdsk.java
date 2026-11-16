package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzdsk implements zzipf {
    public final zzdqf a;
    public final zzipo b;

    @Override // com.google.android.gms.internal.ads.zzipu
    public final Object zzb() {
        zzdwi zzdwiVar = this.a.a.b;
        zzipn.a(zzdwiVar);
        return new zzdsj(zzdwiVar, (Clock) this.b.zzb());
    }

    public zzdsk(zzdqf zzdqfVar, zzipe zzipeVar) {
        this.a = zzdqfVar;
        this.b = zzipeVar;
    }
}
