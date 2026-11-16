package com.google.android.gms.internal.ads;

import defpackage.s64;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzdok implements zzipf {
    public final zzdno a;
    public final zzipo b;

    @Override // com.google.android.gms.internal.ads.zzipu
    public final Object zzb() {
        return new zzdmb(new s64(this.a.b, 1), (Executor) this.b.zzb());
    }

    public zzdok(zzdno zzdnoVar, zzipe zzipeVar) {
        this.a = zzdnoVar;
        this.b = zzipeVar;
    }
}
