package com.fyber.inneractive.sdk.web;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class s0 implements Runnable {
    public final /* synthetic */ v0 a;

    public s0(v0 v0Var) {
        this.a = v0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.a.u.compareAndSet(false, true)) {
            this.a.d("onCancelResult(true);");
            this.a.v.set(false);
        }
    }
}
