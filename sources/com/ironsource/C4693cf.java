package com.ironsource;

import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.cf, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class C4693cf {

    @NotNull
    private EnumC4711df a;

    @NotNull
    public final EnumC4711df a() {
        return this.a;
    }

    public C4693cf(@NotNull JSONObject jSONObject) {
        jSONObject.getClass();
        this.a = EnumC4711df.b.a(jSONObject.optInt(C4664b4.a.t, EnumC4711df.CurrentlyLoadedAds.c()));
    }
}
