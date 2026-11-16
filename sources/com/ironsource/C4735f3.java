package com.ironsource;

import com.ironsource.mediationsdk.ISBannerSize;
import defpackage.qh1;
import java.util.LinkedHashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: com.ironsource.f3, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class C4735f3 extends C4977sd {

    @NotNull
    private final C4911p0 b;

    @NotNull
    private final ISBannerSize c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4735f3(@NotNull C4911p0 c4911p0, @NotNull ISBannerSize iSBannerSize, @NotNull String str) {
        super(str);
        c4911p0.getClass();
        iSBannerSize.getClass();
        str.getClass();
        this.b = c4911p0;
        this.c = iSBannerSize;
    }

    @Override // com.ironsource.C4977sd, com.ironsource.D0
    @NotNull
    public Map<String, Object> a(@Nullable B0 b0) {
        LinkedHashMap linkedHashMapI0 = qh1.i0(super.a(b0));
        this.b.a(linkedHashMapI0, this.c);
        return linkedHashMapI0;
    }
}
