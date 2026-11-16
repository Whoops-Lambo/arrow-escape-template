package com.google.android.gms.internal.ads;

import defpackage.ao4;
import java.io.File;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class zzgrb implements zzipf {
    public final zzipe a;
    public final zzipo b;
    public final zzipo c;

    @Override // com.google.android.gms.internal.ads.zzipu
    public final Object zzb() {
        File file = (File) this.a.zzb();
        zzghx zzghxVar = (zzghx) this.b.zzb();
        ao4 ao4Var = new ao4((zzgsw) this.c.zzb(), 0);
        zzghxVar.getClass();
        return new zzghw(file, zzghxVar.a, new zzghq(new byte[0]), ao4Var);
    }

    public zzgrb(zzipe zzipeVar, zzipe zzipeVar2, zzipe zzipeVar3) {
        this.a = zzipeVar;
        this.b = zzipeVar2;
        this.c = zzipeVar3;
    }
}
