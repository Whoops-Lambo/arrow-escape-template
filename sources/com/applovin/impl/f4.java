package com.applovin.impl;

import com.applovin.impl.sdk.utils.JsonUtils;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public class f4 {
    private final String a;
    private final String b;

    public String a() {
        return this.a;
    }

    public String b() {
        return this.b;
    }

    public f4(JSONObject jSONObject, com.applovin.impl.sdk.l lVar) {
        this.a = JsonUtils.getString(jSONObject, "id", "");
        this.b = JsonUtils.getString(jSONObject, "price", null);
    }
}
