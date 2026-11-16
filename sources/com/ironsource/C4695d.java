package com.ironsource;

import defpackage.n30;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: com.ironsource.d, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public final class C4695d implements InterfaceC4684c6 {

    @NotNull
    private final C4799id a;

    @Override // com.ironsource.InterfaceC4684c6
    @NotNull
    public String value() {
        return n30.m(this.a.a(), "/abTestMap.json");
    }

    public C4695d(@NotNull C4799id c4799id) {
        c4799id.getClass();
        this.a = c4799id;
    }
}
