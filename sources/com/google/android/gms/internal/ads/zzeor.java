package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzeor implements zzipf {
    public final zzipe a;
    public final zzipo b;
    public final zzipg c;
    public final zzipo d;
    public final zzipo e;

    @Override // com.google.android.gms.internal.ads.zzipu
    public final Object zzb() {
        return new zzeoq((Context) this.a.zzb(), (Executor) this.b.zzb(), (zzdor) this.c.a, (zzflp) this.d.zzb(), (zzeaw) this.e.zzb());
    }

    public zzeor(zzipe zzipeVar, zzipo zzipoVar, zzipg zzipgVar, zzipo zzipoVar2, zzipo zzipoVar3) {
        this.a = zzipeVar;
        this.b = zzipoVar;
        this.c = zzipgVar;
        this.d = zzipoVar2;
        this.e = zzipoVar3;
    }
}
