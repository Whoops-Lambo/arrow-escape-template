package com.ironsource;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class H3 {

    @Nullable
    private final Boolean a;

    @Nullable
    private final Integer b;

    @Nullable
    private final M3 c;

    @Nullable
    public final Boolean a() {
        return this.a;
    }

    @Nullable
    public final Integer b() {
        return this.b;
    }

    @Nullable
    public final M3 c() {
        return this.c;
    }

    public H3(@NotNull JSONObject jSONObject) {
        Boolean boolValueOf;
        Integer numValueOf;
        jSONObject.getClass();
        if (jSONObject.has("enabled")) {
            boolValueOf = Boolean.valueOf(jSONObject.getBoolean("enabled"));
        } else {
            boolValueOf = null;
        }
        this.a = boolValueOf;
        if (jSONObject.has("maxImpressions")) {
            numValueOf = Integer.valueOf(jSONObject.getInt("maxImpressions"));
        } else {
            numValueOf = null;
        }
        this.b = numValueOf;
        this.c = jSONObject.has("unit") ? M3.c.a(jSONObject.optString("unit")) : null;
    }
}
