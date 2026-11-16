package com.vungle.ads.internal.network;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes10.dex */
public final class y implements a {
    public final /* synthetic */ com.vungle.ads.internal.v a;

    public y(com.vungle.ads.internal.x xVar) {
        this.a = xVar;
    }

    @Override // com.vungle.ads.internal.network.a
    public final void a(o oVar) {
        this.a.onSuccess();
    }

    @Override // com.vungle.ads.internal.network.a
    public final void a(Throwable th) {
        this.a.a();
    }
}
