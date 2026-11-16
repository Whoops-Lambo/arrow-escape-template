package com.ironsource;

import com.ironsource.sdk.IronSourceNetwork;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class Bc implements Ac {
    @Override // com.ironsource.Ac
    public void a(@NotNull R9 r9, @NotNull Cc cc) throws Exception {
        r9.getClass();
        cc.getClass();
        IronSourceNetwork.loadAd(r9, cc.a());
    }

    @Override // com.ironsource.Ac
    @NotNull
    public String a() {
        String version = IronSourceNetwork.getVersion();
        version.getClass();
        return version;
    }
}
