package com.ironsource;

import defpackage.j52;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class P4 implements InterfaceC4971s7 {

    @Nullable
    private final Boolean a;

    @Override // com.ironsource.InterfaceC4971s7
    @NotNull
    public Object a() {
        Boolean bool = this.a;
        return bool == null ? new j52(new Exception("enabled flag is not provided or invalid")) : bool;
    }

    public P4(@Nullable Boolean bool) {
        this.a = bool;
    }
}
