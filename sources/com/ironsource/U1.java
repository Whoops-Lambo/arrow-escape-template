package com.ironsource;

import defpackage.s71;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class U1 {

    @NotNull
    private final JSONObject a;
    private final boolean b;

    @NotNull
    private final String c;
    private final boolean d;
    private final boolean e;
    private final int f;
    private final boolean g;
    private final boolean h;
    private final int i;
    private final boolean j;
    private final boolean k;

    @Nullable
    private final JSONObject l;

    @Nullable
    private final JSONArray m;

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof U1) && s71.b(this.a, ((U1) obj).a);
    }

    public static /* synthetic */ U1 a(U1 u1, JSONObject jSONObject, int i, Object obj) {
        if ((i & 1) != 0) {
            jSONObject = u1.a;
        }
        return u1.a(jSONObject);
    }

    public final int b() {
        return this.i;
    }

    @Nullable
    public final JSONObject c() {
        return this.l;
    }

    @NotNull
    public final String d() {
        return this.c;
    }

    @Nullable
    public final JSONArray e() {
        return this.m;
    }

    public final boolean f() {
        return this.k;
    }

    public final boolean g() {
        return this.e;
    }

    public final boolean h() {
        return this.d;
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public final boolean i() {
        return this.g;
    }

    public final boolean j() {
        return this.h;
    }

    public final int k() {
        return this.f;
    }

    public final boolean l() {
        return this.j;
    }

    public final boolean m() {
        return this.b;
    }

    @NotNull
    public String toString() {
        return "ApplicationGeneralSettings(config=" + this.a + ")";
    }

    public U1(@NotNull JSONObject jSONObject) {
        jSONObject.getClass();
        this.a = jSONObject;
        this.b = jSONObject.optBoolean("isExternalArmEventsEnabled", true);
        String strOptString = jSONObject.optString("externalArmEventsUrl", U5.j);
        strOptString.getClass();
        this.c = strOptString;
        this.d = jSONObject.optBoolean("sid", true);
        this.e = jSONObject.optBoolean("radvid", false);
        this.f = jSONObject.optInt("uaeh", 0);
        this.g = jSONObject.optBoolean("sharedThreadPool", false);
        this.h = jSONObject.optBoolean("sharedThreadPoolADP", true);
        this.i = jSONObject.optInt(R6.V0, -1);
        this.j = jSONObject.optBoolean("axal", false);
        this.k = jSONObject.optBoolean("psrt", false);
        this.l = jSONObject.optJSONObject(C4664b4.a.c);
        this.m = jSONObject.optJSONArray("ilrSubscribers");
    }

    @NotNull
    public final U1 a(@NotNull JSONObject jSONObject) {
        jSONObject.getClass();
        return new U1(jSONObject);
    }

    private final JSONObject a() {
        return this.a;
    }
}
