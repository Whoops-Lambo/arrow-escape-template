package com.ironsource;

import java.util.Map;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
public interface Z {
    @NotNull
    String a();

    default void a(@NotNull R9 r9, @NotNull Map<String, String> map) {
        r9.getClass();
        map.getClass();
    }
}
