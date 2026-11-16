package com.ironsource;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public final class Y6 implements Z6 {
    private final long a;

    @NotNull
    private final EnumC4685c7 b;

    @Override // com.ironsource.Z6
    public long a() {
        return this.a;
    }

    @Override // com.ironsource.Z6
    @NotNull
    public EnumC4685c7 b() {
        return this.b;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Y6(@NotNull C4667b7 c4667b7) {
        this(c4667b7.a(), c4667b7.c());
        c4667b7.getClass();
    }

    public Y6(long j, @NotNull EnumC4685c7 enumC4685c7) {
        enumC4685c7.getClass();
        this.a = j;
        this.b = enumC4685c7;
    }
}
