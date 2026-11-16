package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.common.util.Clock;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzdql implements zzipf {
    public final zzipe a;
    public final zzipo b;
    public final zzipo c;
    public final zzipo d;

    @Override // com.google.android.gms.internal.ads.zzipu
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzbfo zzbfoVar = (zzbfo) this.a.zzb();
        Executor executor = (Executor) this.b.zzb();
        Context context = (Context) this.c.zzb();
        return new zzcvv(executor, new zzcvh(context, zzbfoVar), (Clock) this.d.zzb());
    }

    public zzdql(zzipe zzipeVar, zzipe zzipeVar2, zzipe zzipeVar3, zzipe zzipeVar4) {
        this.a = zzipeVar;
        this.b = zzipeVar2;
        this.c = zzipeVar3;
        this.d = zzipeVar4;
    }
}
