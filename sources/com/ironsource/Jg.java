package com.ironsource;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public interface Jg {
    @NotNull
    Hg a(@NotNull Pg pg, @Nullable E e);

    static /* synthetic */ Hg a(Jg jg, Pg pg, E e, int i, Object obj) {
        if (obj != null) {
            defpackage.d.u("Super calls with default arguments not supported in this target, function: createWaterfall");
            return null;
        }
        if ((i & 2) != 0) {
            e = null;
        }
        return jg.a(pg, e);
    }
}
