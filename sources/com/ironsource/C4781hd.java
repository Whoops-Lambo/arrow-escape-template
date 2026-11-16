package com.ironsource;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.hd, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class C4781hd {

    @Nullable
    private final Boolean a;

    @Nullable
    private final Integer b;

    @NotNull
    private final M3 c;

    @Nullable
    public final Boolean a() {
        return this.a;
    }

    @Nullable
    public final Integer b() {
        return this.b;
    }

    @NotNull
    public final M3 c() {
        return this.c;
    }

    public C4781hd(@NotNull JSONObject jSONObject) {
        Boolean boolValueOf;
        jSONObject.getClass();
        if (jSONObject.has("enabled")) {
            boolValueOf = Boolean.valueOf(jSONObject.getBoolean("enabled"));
        } else {
            boolValueOf = null;
        }
        this.a = boolValueOf;
        this.b = jSONObject.has("numOfSeconds") ? Integer.valueOf(jSONObject.getInt("numOfSeconds")) : null;
        this.c = M3.Second;
    }
}
