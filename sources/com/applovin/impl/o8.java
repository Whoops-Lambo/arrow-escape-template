package com.applovin.impl;

import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.mediation.MaxAdFormat;
import com.ironsource.C5013ud;
import defpackage.q63;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
public class o8 {
    private final y2 a;
    private final f4 b;
    private final List c;

    public f4 a() {
        return this.b;
    }

    public y2 b() {
        return this.a;
    }

    public List c() {
        return this.c;
    }

    public boolean d() {
        return this.b != null;
    }

    public o8(JSONObject jSONObject, MaxAdFormat maxAdFormat, i3 i3Var, com.applovin.impl.sdk.l lVar) {
        boolean z;
        JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONObject, "bidder_placement", (JSONObject) null);
        if (jSONObject2 != null) {
            this.b = new f4(jSONObject2, lVar);
        } else {
            this.b = null;
        }
        String string = JsonUtils.getString(jSONObject, "name", "");
        String string2 = JsonUtils.getString(jSONObject, "display_name", "");
        if (jSONObject2 != null) {
            z = true;
        } else {
            z = false;
        }
        this.a = new y2(string, string2, z, i3Var);
        JSONArray jSONArrayN = q63.n(C5013ud.c, jSONObject);
        this.c = new ArrayList(jSONArrayN.length());
        for (int i = 0; i < jSONArrayN.length(); i++) {
            JSONObject jSONObject3 = JsonUtils.getJSONObject(jSONArrayN, i, (JSONObject) null);
            if (jSONObject3 != null) {
                this.c.add(new f4(jSONObject3, lVar));
            }
        }
    }
}
