package com.vungle.ads.internal;

import com.vungle.ads.internal.persistence.FilePreferences;
import com.vungle.ads.internal.util.PathProvider;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class g2 extends r1 {
    public final /* synthetic */ ServiceLocator b;

    public g2(ServiceLocator serviceLocator) {
        this.b = serviceLocator;
    }

    @Override // com.vungle.ads.internal.r1
    public final Object a() {
        return FilePreferences.d.a(((com.vungle.ads.internal.executor.d) ((com.vungle.ads.internal.executor.a) this.b.a(com.vungle.ads.internal.executor.a.class))).a, (PathProvider) this.b.a(PathProvider.class), "settings_vungle");
    }
}
