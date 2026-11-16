package com.applovin.impl;

import com.applovin.impl.sdk.utils.JsonUtils;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public class z0 extends w0 {
    private Map c;

    public Map f() {
        return this.c;
    }

    public String g() {
        return JsonUtils.getString(this.b, "name", null);
    }

    @Override // com.applovin.impl.w0
    public String toString() {
        return "ConsentFlowState{id=" + c() + ", type=" + d() + ", name=" + g() + "}";
    }

    public z0(JSONObject jSONObject, com.applovin.impl.sdk.l lVar) {
        super(jSONObject, lVar);
    }
}
