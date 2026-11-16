package com.vungle.ads.internal;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class a2 extends r1 {
    public final /* synthetic */ ServiceLocator b;

    public a2(ServiceLocator serviceLocator) {
        this.b = serviceLocator;
    }

    @Override // com.vungle.ads.internal.r1
    public final Object a() {
        return new com.vungle.ads.internal.task.r((com.vungle.ads.internal.task.d) this.b.a(com.vungle.ads.internal.task.d.class), ((com.vungle.ads.internal.executor.d) ((com.vungle.ads.internal.executor.a) this.b.a(com.vungle.ads.internal.executor.a.class))).c, new com.vungle.ads.internal.task.h());
    }
}
