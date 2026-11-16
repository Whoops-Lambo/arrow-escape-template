package com.inmobi.media;

import org.json.JSONObject;

/* JADX INFO: renamed from: com.inmobi.media.pj, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class C4304pj {
    public final /* synthetic */ Ej a;

    public C4304pj(Ej ej) {
        this.a = ej;
    }

    public final void a(JSONObject jSONObject) {
        jSONObject.getClass();
        Y9 y9 = this.a.i;
        if (y9 != null) {
            String str = Ej.j1;
            str.getClass();
            ((Z9) y9).a(str, "onCCTLifeCycleEvent");
        }
        this.a.c(jSONObject);
    }
}
