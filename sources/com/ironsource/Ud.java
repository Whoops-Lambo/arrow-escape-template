package com.ironsource;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public final class Ud {

    @Nullable
    private final String a;

    @Nullable
    private final Integer b;

    @Nullable
    public final Integer a() {
        return this.b;
    }

    @Nullable
    public final String b() {
        return this.a;
    }

    public Ud(@NotNull JSONObject jSONObject, @NotNull String str, @NotNull String str2) throws JSONException {
        String string;
        jSONObject.getClass();
        str.getClass();
        str2.getClass();
        if (jSONObject.has(str)) {
            string = jSONObject.getString(str);
        } else {
            string = null;
        }
        this.a = string;
        this.b = jSONObject.has(str2) ? Integer.valueOf(jSONObject.getInt(str2)) : null;
    }
}
