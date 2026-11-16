package com.fyber.inneractive.sdk.web;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class r0 {
    public final /* synthetic */ v0 a;

    public r0(v0 v0Var) {
        this.a = v0Var;
    }

    public final void a(boolean z) {
        if (this.a.u.compareAndSet(false, true)) {
            this.a.d("onCancelResult(" + z + ");");
            this.a.v.set(false);
        }
    }
}
