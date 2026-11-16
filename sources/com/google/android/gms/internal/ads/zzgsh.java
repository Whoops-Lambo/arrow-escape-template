package com.google.android.gms.internal.ads;

import android.content.Context;
import defpackage.mo4;
import java.util.concurrent.ExecutorService;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzgsh implements zzipf {
    public final zzipg a;
    public final zzipg b;

    @Override // com.google.android.gms.internal.ads.zzipu
    public final Object zzb() {
        return new mo4((Context) this.a.a, (ExecutorService) this.b.a);
    }

    public zzgsh(zzipg zzipgVar, zzipg zzipgVar2) {
        this.a = zzipgVar;
        this.b = zzipgVar2;
    }
}
