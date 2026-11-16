package com.ironsource;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.p, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
public final class C4910p {

    @Nullable
    private final Boolean a;

    @Nullable
    public final Boolean a() {
        return this.a;
    }

    public C4910p(@NotNull JSONObject jSONObject) {
        Boolean boolValueOf;
        jSONObject.getClass();
        if (jSONObject.has(C4928q.a)) {
            boolValueOf = Boolean.valueOf(jSONObject.optBoolean(C4928q.a));
        } else {
            boolValueOf = null;
        }
        this.a = boolValueOf;
    }
}
