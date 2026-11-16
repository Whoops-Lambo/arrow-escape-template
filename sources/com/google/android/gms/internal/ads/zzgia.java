package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import defpackage.vt4;
import java.util.concurrent.ExecutorService;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class zzgia {
    public final zzioz a;
    public final zzioz b;
    public final ExecutorService c;
    public final zzioz d;
    public vt4 e = null;

    public final synchronized ListenableFuture a() {
        vt4 vt4Var;
        vt4Var = this.e;
        if (vt4Var == null) {
            throw null;
        }
        return vt4Var;
    }

    public zzgia(zzioz zziozVar, zzioz zziozVar2, ExecutorService executorService, zzioz zziozVar3) {
        this.a = zziozVar;
        this.b = zziozVar2;
        this.c = executorService;
        this.d = zziozVar3;
    }
}
