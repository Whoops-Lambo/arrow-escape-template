package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
public final class zzerc implements zzipf {
    public final zzipe a;
    public final zzipo b;
    public final zzipg c;

    @Override // com.google.android.gms.internal.ads.zzipu
    public final Object zzb() {
        return new zzerb((Context) this.a.zzb(), (Executor) this.b.zzb(), (zzdxc) this.c.a);
    }

    public zzerc(zzipe zzipeVar, zzipg zzipgVar, zzipo zzipoVar) {
        this.a = zzipeVar;
        this.b = zzipoVar;
        this.c = zzipgVar;
    }
}
