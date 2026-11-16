package com.vungle.ads.internal;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class s1 extends r1 {
    public final /* synthetic */ ServiceLocator b;

    public s1(ServiceLocator serviceLocator) {
        this.b = serviceLocator;
    }

    @Override // com.vungle.ads.internal.r1
    public final Object a() {
        return new com.vungle.ads.internal.bidding.e(this.b.a);
    }
}
