package com.ironsource;

import com.safedk.android.internal.partials.IronSourceNetworkBridge;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class J1 {

    @NotNull
    private final Lb a;

    @NotNull
    private final Q1 b;
    private final boolean c;

    @NotNull
    private final N1 d;

    @NotNull
    private final U1 e;

    @NotNull
    private final H1 f;

    @NotNull
    public final H1 a() {
        return this.f;
    }

    @NotNull
    public final N1 b() {
        return this.d;
    }

    @NotNull
    public final Q1 c() {
        return this.b;
    }

    @NotNull
    public final U1 d() {
        return this.e;
    }

    public final boolean e() {
        return this.c;
    }

    @NotNull
    public final Lb f() {
        return this.a;
    }

    public J1(@NotNull JSONObject jSONObject) {
        jSONObject.getClass();
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(L1.a);
        this.a = new Lb(jSONObjectOptJSONObject == null ? IronSourceNetworkBridge.jsonObjectInit() : jSONObjectOptJSONObject);
        JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("events");
        this.b = new Q1(jSONObjectOptJSONObject2 == null ? IronSourceNetworkBridge.jsonObjectInit() : jSONObjectOptJSONObject2);
        this.c = jSONObject.optBoolean(L1.g, false);
        JSONObject jSONObjectOptJSONObject3 = jSONObject.optJSONObject(L1.h);
        this.d = new N1(jSONObjectOptJSONObject3 == null ? IronSourceNetworkBridge.jsonObjectInit() : jSONObjectOptJSONObject3);
        JSONObject jSONObjectOptJSONObject4 = jSONObject.optJSONObject("settings");
        this.e = new U1(jSONObjectOptJSONObject4 == null ? IronSourceNetworkBridge.jsonObjectInit() : jSONObjectOptJSONObject4);
        JSONObject jSONObjectOptJSONObject5 = jSONObject.optJSONObject(L1.f);
        this.f = new H1(jSONObjectOptJSONObject5 == null ? IronSourceNetworkBridge.jsonObjectInit() : jSONObjectOptJSONObject5);
    }
}
