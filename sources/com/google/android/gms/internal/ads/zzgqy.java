package com.google.android.gms.internal.ads;

import defpackage.ao4;
import java.io.File;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class zzgqy implements zzipf {
    public final zzipe a;
    public final zzipo b;
    public final zzipo c;

    @Override // com.google.android.gms.internal.ads.zzipu
    public final Object zzb() {
        File file = (File) this.a.zzb();
        zzghx zzghxVar = (zzghx) this.b.zzb();
        zzgsw zzgswVar = (zzgsw) this.c.zzb();
        zzgil zzgilVarL = zzgil.L();
        ao4 ao4Var = new ao4(zzgswVar, 2);
        zzghxVar.getClass();
        return new zzghw(file, zzghxVar.a, new zzghu(zzgilVarL), ao4Var);
    }

    public zzgqy(zzipe zzipeVar, zzipe zzipeVar2, zzipe zzipeVar3) {
        this.a = zzipeVar;
        this.b = zzipeVar2;
        this.c = zzipeVar3;
    }
}
