package com.ironsource;

import java.util.HashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: com.ironsource.sd, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public class C4977sd implements D0 {

    @NotNull
    private final String a;

    @Override // com.ironsource.D0
    @NotNull
    public Map<String, Object> a(@Nullable B0 b0) {
        HashMap map = new HashMap();
        map.put("placement", this.a);
        return map;
    }

    public C4977sd(@NotNull String str) {
        str.getClass();
        this.a = str;
    }
}
