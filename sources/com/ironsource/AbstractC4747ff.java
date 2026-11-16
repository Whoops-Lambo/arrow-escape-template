package com.ironsource;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: com.ironsource.ff, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public abstract class AbstractC4747ff {

    @Nullable
    private final O a;

    @NotNull
    public abstract EnumC4872mf b();

    public AbstractC4747ff(@Nullable O o) {
        this.a = o;
    }

    @NotNull
    public final C5017v a(@NotNull Ob<AbstractC4747ff, C5017v> ob) {
        ob.getClass();
        return ob.a(this);
    }

    @Nullable
    public final O a() {
        return this.a;
    }
}
