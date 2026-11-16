package com.fyber.inneractive.sdk.config;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class d0 implements Runnable {
    public final /* synthetic */ e0 a;

    public d0(e0 e0Var) {
        this.a = e0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.a.L = new com.fyber.inneractive.sdk.measurement.e();
        e0 e0Var = this.a;
        com.fyber.inneractive.sdk.measurement.e eVar = e0Var.a.L;
        Context context = e0Var.b;
        if (eVar.a) {
            return;
        }
        eVar.a = true;
        com.fyber.inneractive.sdk.util.r.b.post(new com.fyber.inneractive.sdk.measurement.d(eVar, context));
    }
}
