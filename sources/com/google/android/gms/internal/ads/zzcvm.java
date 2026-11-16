package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class zzcvm implements zzipf {
    public final zzipe a;
    public final zzipe b;
    public final zzipo c;
    public final zzipe d;
    public final zzipo e;

    @Override // com.google.android.gms.internal.ads.zzipu
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzcvl((zzbvv) this.a.zzb(), (zzcvh) this.b.zzb(), (Executor) this.c.zzb(), (zzcvg) this.d.zzb(), (Clock) this.e.zzb());
    }

    public zzcvm(zzipe zzipeVar, zzipe zzipeVar2, zzipe zzipeVar3, zzipe zzipeVar4, zzipe zzipeVar5) {
        this.a = zzipeVar;
        this.b = zzipeVar2;
        this.c = zzipeVar3;
        this.d = zzipeVar4;
        this.e = zzipeVar5;
    }
}
