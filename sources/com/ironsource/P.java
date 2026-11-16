package com.ironsource;

import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
public interface P {

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public interface a {
        void a(@NotNull O o);

        void a(@NotNull EnumC4893o0 enumC4893o0, @NotNull String str);

        void a(@NotNull JSONObject jSONObject, @NotNull EnumC4893o0 enumC4893o0, @NotNull String str);
    }

    @Nullable
    O a(@NotNull String str);

    @NotNull
    List<O> a();
}
