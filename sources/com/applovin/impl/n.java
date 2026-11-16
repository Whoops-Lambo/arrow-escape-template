package com.applovin.impl;

import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.mediation.MaxAdFormat;
import defpackage.q63;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public class n implements Comparable {
    private final String a;
    private final String b;
    private final MaxAdFormat c;
    private final o d;
    private final List e;

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(n nVar) {
        return this.b.compareToIgnoreCase(nVar.b);
    }

    public String b() {
        MaxAdFormat maxAdFormat = this.c;
        return maxAdFormat != null ? maxAdFormat.getLabel() : "Unknown";
    }

    public String c() {
        return this.a;
    }

    public String d() {
        return this.b;
    }

    public String e() {
        return "\n---------- " + this.b + " ----------\nIdentifier - " + this.a + "\nFormat     - " + b();
    }

    public o f() {
        return this.d;
    }

    public List g() {
        return this.e;
    }

    public n(JSONObject jSONObject, Map map, com.applovin.impl.sdk.l lVar) {
        this.a = JsonUtils.getString(jSONObject, "name", "");
        this.b = JsonUtils.getString(jSONObject, "display_name", "");
        this.c = MaxAdFormat.formatFromString(JsonUtils.getString(jSONObject, "format", null));
        JSONArray jSONArrayN = q63.n("waterfalls", jSONObject);
        this.e = new ArrayList(jSONArrayN.length());
        for (int i = 0; i < jSONArrayN.length(); i++) {
            JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONArrayN, i, (JSONObject) null);
            if (jSONObject2 != null) {
                this.e.add(new o(jSONObject2, map, this.c, lVar));
            }
        }
        this.d = this.e.isEmpty() ? null : (o) this.e.get(0);
    }

    public MaxAdFormat a() {
        return this.c;
    }
}
