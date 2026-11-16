package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.common.util.Clock;
import defpackage.f24;
import defpackage.y14;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzcfk implements zzipf {
    public final zzipg a;
    public final zzcex b;

    @Override // com.google.android.gms.internal.ads.zzipu
    public final Object zzb() {
        Context context = (Context) this.a.a;
        zzcex zzcexVar = this.b;
        return new f24(context, new zzcew((Clock) zzcexVar.a.a, (y14) zzcexVar.b.zzb()));
    }

    public zzcfk(zzipg zzipgVar, zzcex zzcexVar) {
        this.a = zzipgVar;
        this.b = zzcexVar;
    }
}
