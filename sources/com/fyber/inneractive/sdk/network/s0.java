package com.fyber.inneractive.sdk.network;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes10.dex */
public final class s0 implements Runnable {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Exception b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ t0 d;

    public s0(t0 t0Var, Object obj, Exception exc, boolean z) {
        this.d = t0Var;
        this.a = obj;
        this.b = exc;
        this.c = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.d.b.a(this.a, this.b, this.c);
    }
}
