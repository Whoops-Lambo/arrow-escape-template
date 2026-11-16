package com.ironsource;

import com.ironsource.mediationsdk.IronSource;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public interface R8 {

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public interface a {
        void a(@NotNull AbstractC4747ff abstractC4747ff);
    }

    int a(@NotNull IronSource.a aVar);

    @NotNull
    List<String> a();

    @NotNull
    Map<String, JSONObject> a(@NotNull C4693cf c4693cf);

    @NotNull
    JSONObject a(@NotNull EnumC4908of enumC4908of);
}
