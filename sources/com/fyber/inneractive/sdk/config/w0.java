package com.fyber.inneractive.sdk.config;

import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes10.dex */
public final class w0 implements x0 {
    public String a;
    public String b;
    public q0 c;
    public t0 d;
    public u0 e;
    public y0 f;
    public z0 g;

    public final String toString() {
        JSONObject jSONObject = new JSONObject();
        com.fyber.inneractive.sdk.util.c1.a(jSONObject, "id", this.a);
        com.fyber.inneractive.sdk.util.c1.a(jSONObject, "spotId", this.b);
        com.fyber.inneractive.sdk.util.c1.a(jSONObject, "display", this.c);
        com.fyber.inneractive.sdk.util.c1.a(jSONObject, "monitor", this.d);
        com.fyber.inneractive.sdk.util.c1.a(jSONObject, "native", this.e);
        com.fyber.inneractive.sdk.util.c1.a(jSONObject, "video", this.f);
        com.fyber.inneractive.sdk.util.c1.a(jSONObject, "viewability", this.g);
        return jSONObject.toString();
    }
}
