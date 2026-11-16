package com.vungle.ads.internal;

import com.vungle.ads.internal.util.PathProvider;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class z1 extends r1 {
    public final /* synthetic */ ServiceLocator b;

    public z1(ServiceLocator serviceLocator) {
        this.b = serviceLocator;
    }

    @Override // com.vungle.ads.internal.r1
    public final Object a() {
        ServiceLocator serviceLocator = this.b;
        return new com.vungle.ads.internal.task.o(serviceLocator.a, (PathProvider) serviceLocator.a(PathProvider.class));
    }
}
