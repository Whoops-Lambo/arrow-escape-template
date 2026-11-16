package com.fyber.inneractive.sdk.click;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class n implements Runnable {
    public final /* synthetic */ b a;
    public final /* synthetic */ r b;

    public n(r rVar, b bVar) {
        this.b = rVar;
        this.a = bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        o oVar = this.b.e;
        if (oVar != null) {
            oVar.a(this.a);
        }
    }
}
