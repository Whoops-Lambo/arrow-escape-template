package com.fyber.inneractive.sdk.flow;

import com.fyber.inneractive.sdk.util.v1;
import com.fyber.inneractive.sdk.util.w1;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class o0 implements v1 {
    public final /* synthetic */ p0 a;

    public o0(p0 p0Var) {
        this.a = p0Var;
    }

    @Override // com.fyber.inneractive.sdk.util.v1
    public final void a() {
        Runnable runnable = this.a.n;
        if (runnable != null) {
            com.fyber.inneractive.sdk.util.r.b.post(runnable);
        }
        p0 p0Var = this.a;
        w1 w1Var = p0Var.o;
        if (w1Var != null) {
            w1Var.e = null;
            p0Var.o = null;
        }
    }
}
