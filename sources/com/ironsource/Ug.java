package com.ironsource;

import com.ironsource.AbstractC4914p3;
import java.util.List;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public final class Ug<Smash extends AbstractC4914p3<?>> {

    @NotNull
    private final Zg<Smash> a;

    @NotNull
    public final List<Smash> a() {
        return this.a.c();
    }

    public final boolean b() {
        return this.a.c().isEmpty() && this.a.a().isEmpty();
    }

    public final boolean c() {
        return this.a.d() == 0;
    }

    public Ug(@NotNull Zg<Smash> zg) {
        zg.getClass();
        this.a = zg;
    }
}
