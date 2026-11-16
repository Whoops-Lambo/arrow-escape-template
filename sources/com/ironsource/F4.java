package com.ironsource;

import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public interface F4 {
    @Nullable
    String a(@NotNull String str, @Nullable String str2);

    void a(@NotNull String str);

    @NotNull
    Map<String, ?> allData();

    void b(@NotNull String str, @NotNull String str2);

    static /* synthetic */ String a(F4 f4, String str, String str2, int i, Object obj) {
        if (obj != null) {
            defpackage.d.u("Super calls with default arguments not supported in this target, function: getString");
            return null;
        }
        if ((i & 2) != 0) {
            str2 = null;
        }
        return f4.a(str, str2);
    }
}
