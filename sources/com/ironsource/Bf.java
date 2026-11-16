package com.ironsource;

import com.safedk.android.internal.partials.IronSourceNetworkBridge;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public class Bf {
    private final JSONObject a;

    public boolean a() {
        return this.a.optBoolean("uxt", false);
    }

    public boolean b() {
        return this.a.optBoolean(C4664b4.a.o, false);
    }

    public boolean c() {
        return this.a.optBoolean(C4664b4.a.p, false);
    }

    public boolean d() {
        return this.a.optBoolean(C4664b4.a.l, false);
    }

    public boolean e() {
        return this.a.optBoolean(C4664b4.a.n, false);
    }

    public Bf(JSONObject jSONObject) {
        this.a = jSONObject == null ? IronSourceNetworkBridge.jsonObjectInit() : jSONObject;
    }
}
