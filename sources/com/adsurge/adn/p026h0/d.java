package com.adsurge.adn.p026h0;

import java.util.Set;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public class d {
    public final String a;
    public final l b;
    public final int c;
    public final boolean d;
    public final k e;
    public Set f;
    public JSONObject g;

    public void a(Set set) {
        this.f = set;
    }

    public d(String str, l lVar, int i, boolean z, k kVar) {
        this.a = str;
        this.b = lVar;
        this.c = i;
        this.d = z;
        this.e = kVar;
    }

    public void a(JSONObject jSONObject) {
        this.g = jSONObject;
    }

    public JSONObject a() {
        return this.g;
    }
}
