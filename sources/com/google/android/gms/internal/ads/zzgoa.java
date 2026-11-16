package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzgoa implements zzipf {
    public final zzipo a;
    public final zzipe b;
    public final zzipo c;

    @Override // com.google.android.gms.internal.ads.zzipu
    public final /* bridge */ /* synthetic */ Object zzb() {
        Context context = (Context) this.a.zzb();
        return new zzgof(context, context.getSharedPreferences("pcvmspf2", 0), zzipe.b(this.b), (zzgsw) this.c.zzb());
    }

    public zzgoa(zzipe zzipeVar, zzipe zzipeVar2, zzipg zzipgVar) {
        this.a = zzipgVar;
        this.b = zzipeVar;
        this.c = zzipeVar2;
    }
}
