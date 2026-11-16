package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.HashSet;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzdqg implements zzipf {
    public final zzipo a;
    public final zzczp b;

    @Override // com.google.android.gms.internal.ads.zzipu
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzdmd((Context) this.a.zzb(), new HashSet(), this.b.a());
    }

    public zzdqg(zzczp zzczpVar, zzipe zzipeVar) {
        this.a = zzipeVar;
        this.b = zzczpVar;
    }
}
