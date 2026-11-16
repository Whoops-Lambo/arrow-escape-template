package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import defpackage.ku4;
import defpackage.tx;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzekb {
    public final zzccd a;

    public final void a() {
        ListenableFuture listenableFutureA = this.a.a();
        String str = "persistFlags";
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjr.T8)).booleanValue()) {
            zzcgy.a(listenableFutureA, "persistFlags", zzcgv.h);
            return;
        }
        tx txVar = new tx(str, 15);
        listenableFutureA.addListener(new ku4(0, listenableFutureA, txVar), zzcgv.h);
    }

    public zzekb(zzccd zzccdVar) {
        this.a = zzccdVar;
    }
}
