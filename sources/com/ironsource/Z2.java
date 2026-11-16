package com.ironsource;

import com.ironsource.mediationsdk.ISBannerSize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public final class Z2 extends C4964s0 {

    @Nullable
    private final ISBannerSize b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Z2(@NotNull C4750g0 c4750g0, @Nullable ISBannerSize iSBannerSize) {
        super(c4750g0);
        c4750g0.getClass();
        this.b = iSBannerSize;
    }

    @Override // com.ironsource.C4964s0, com.ironsource.InterfaceC4966s2
    public void a(@NotNull com.ironsource.mediationsdk.h hVar) {
        hVar.getClass();
        super.a(hVar);
        hVar.a(this.b);
    }
}
