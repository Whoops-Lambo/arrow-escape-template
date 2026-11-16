package com.fyber.inneractive.sdk.flow;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class k0 implements Runnable {
    public final /* synthetic */ l0 a;

    public k0(l0 l0Var) {
        this.a = l0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        p0 p0Var = this.a.b;
        p0Var.e(!p0Var.t);
        this.a.b.n = null;
    }
}
