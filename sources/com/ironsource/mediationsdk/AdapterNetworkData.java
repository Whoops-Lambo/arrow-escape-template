package com.ironsource.mediationsdk;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public interface AdapterNetworkData {
    @NotNull
    JSONObject allData();

    @Nullable
    <T> T dataByKeyIgnoreCase(@NotNull String str, @NotNull Class<T> cls);

    @NotNull
    JSONObject networkDataByAdUnit(@NotNull IronSource.a aVar);
}
