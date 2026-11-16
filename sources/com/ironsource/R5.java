package com.ironsource;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class R5 {

    @Nullable
    private final JSONObject a;

    public R5(@Nullable JSONObject jSONObject) {
        this.a = jSONObject;
    }

    @Nullable
    public final Boolean a(@NotNull String str) {
        Object objOpt;
        str.getClass();
        JSONObject jSONObject = this.a;
        if (jSONObject != null) {
            objOpt = jSONObject.opt(str);
        } else {
            objOpt = null;
        }
        if (!(objOpt instanceof Boolean)) {
            return null;
        }
        return (Boolean) objOpt;
    }

    @Nullable
    public final Integer b(@NotNull String str) {
        Object objOpt;
        str.getClass();
        JSONObject jSONObject = this.a;
        if (jSONObject != null) {
            objOpt = jSONObject.opt(str);
        } else {
            objOpt = null;
        }
        if (!(objOpt instanceof Integer)) {
            return null;
        }
        return (Integer) objOpt;
    }

    @Nullable
    public final String c(@NotNull String str) {
        Object objOpt;
        str.getClass();
        JSONObject jSONObject = this.a;
        if (jSONObject != null) {
            objOpt = jSONObject.opt(str);
        } else {
            objOpt = null;
        }
        if (!(objOpt instanceof String)) {
            return null;
        }
        return (String) objOpt;
    }
}
