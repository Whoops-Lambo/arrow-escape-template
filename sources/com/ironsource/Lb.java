package com.ironsource;

import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class Lb {
    private final int a;
    private final int b;
    private final int c;
    private final boolean d;

    public final int a() {
        return this.c;
    }

    public final int b() {
        return this.b;
    }

    public final int c() {
        return this.a;
    }

    public final boolean d() {
        return this.d;
    }

    public Lb(@NotNull JSONObject jSONObject) {
        jSONObject.getClass();
        this.a = jSONObject.optInt(Mb.a, 3);
        this.b = jSONObject.optInt(Mb.b, 3);
        this.c = jSONObject.optInt("console", 3);
        this.d = jSONObject.optBoolean(Mb.d, false);
    }
}
