package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import defpackage.y14;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzcex implements zzipf {
    public final zzipg a;
    public final zzipe b;

    @Override // com.google.android.gms.internal.ads.zzipu
    public final Object zzb() {
        return new zzcew((Clock) this.a.a, (y14) this.b.zzb());
    }

    public zzcex(zzipe zzipeVar, zzipg zzipgVar) {
        this.a = zzipgVar;
        this.b = zzipeVar;
    }
}
