package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import defpackage.kd4;
import defpackage.ku4;
import defpackage.ps0;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzekk {
    public final zzekg a;
    public final zzher b;

    public final void a(zzfpv zzfpvVar) {
        ps0 ps0Var = new ps0(this.a, 8);
        zzher zzherVar = this.b;
        ListenableFuture listenableFutureSubmit = zzherVar.submit(ps0Var);
        int i = 0;
        listenableFutureSubmit.addListener(new ku4(i, listenableFutureSubmit, new kd4(this, zzfpvVar, i)), zzherVar);
    }

    public zzekk(zzekg zzekgVar, zzher zzherVar) {
        this.a = zzekgVar;
        this.b = zzherVar;
    }
}
