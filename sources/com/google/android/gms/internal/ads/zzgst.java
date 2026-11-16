package com.google.android.gms.internal.ads;

import android.content.Context;
import defpackage.oo4;
import java.util.concurrent.ExecutorService;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzgst implements zzipf {
    public final zzipg a;
    public final zzipe b;
    public final zzipg c;

    @Override // com.google.android.gms.internal.ads.zzipu
    public final Object zzb() {
        Context context = (Context) this.a.a;
        return new oo4(context, (ExecutorService) this.c.a, oo4.g);
    }

    public zzgst(zzipe zzipeVar, zzipg zzipgVar, zzipg zzipgVar2) {
        this.a = zzipgVar;
        this.b = zzipeVar;
        this.c = zzipgVar2;
    }
}
