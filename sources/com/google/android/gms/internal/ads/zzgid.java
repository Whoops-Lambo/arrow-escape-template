package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Random;
import java.util.concurrent.ExecutorService;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class zzgid implements zzipf {
    public final zzipg a;
    public final zzipe b;
    public final zzipg c;
    public final zzipe d;
    public final zzipg e;

    @Override // com.google.android.gms.internal.ads.zzipu
    public final Object zzb() {
        Context context = (Context) this.a.a;
        zzghg zzghgVar = (zzghg) this.b.zzb();
        ExecutorService executorService = (ExecutorService) this.c.a;
        zzggz zzggzVar = (zzggz) this.d.zzb();
        zzgfx zzgfxVar = (zzgfx) this.e.a;
        return new zzgih(context, zzghgVar, executorService, zzggzVar, new Random(), zzgfxVar.b0().E(), zzgfxVar.b0().G(), zzgfxVar.b0().H(), zzgfxVar.b0().F(), zzgfxVar.Z(), zzgfxVar.S(), zzgfxVar.Q() - 1);
    }

    public zzgid(zzipe zzipeVar, zzipe zzipeVar2, zzipg zzipgVar, zzipg zzipgVar2, zzipg zzipgVar3) {
        this.a = zzipgVar;
        this.b = zzipeVar;
        this.c = zzipgVar2;
        this.d = zzipeVar2;
        this.e = zzipgVar3;
    }
}
