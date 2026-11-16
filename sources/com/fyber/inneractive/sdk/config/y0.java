package com.fyber.inneractive.sdk.config;

import com.fyber.inneractive.sdk.config.enums.Orientation;
import com.fyber.inneractive.sdk.config.enums.Skip;
import com.fyber.inneractive.sdk.config.enums.TapAction;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.ironsource.C4664b4;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class y0 implements com.fyber.inneractive.sdk.util.b1 {
    public Boolean a;
    public Integer b;
    public Integer c;
    public Boolean d;
    public Orientation e;
    public Integer f;
    public Integer g;
    public Skip h;
    public TapAction i;
    public UnitDisplayType j;
    public List k;

    @Override // com.fyber.inneractive.sdk.util.b1
    public final JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        com.fyber.inneractive.sdk.util.c1.a(jSONObject, "autoPlay", this.a);
        com.fyber.inneractive.sdk.util.c1.a(jSONObject, "maxBitrate", this.b);
        com.fyber.inneractive.sdk.util.c1.a(jSONObject, "minBitrate", this.c);
        com.fyber.inneractive.sdk.util.c1.a(jSONObject, "muted", this.d);
        com.fyber.inneractive.sdk.util.c1.a(jSONObject, C4664b4.i.n, this.e);
        com.fyber.inneractive.sdk.util.c1.a(jSONObject, "padding", this.f);
        com.fyber.inneractive.sdk.util.c1.a(jSONObject, "pivotBitrate", this.g);
        com.fyber.inneractive.sdk.util.c1.a(jSONObject, "skip", this.h);
        com.fyber.inneractive.sdk.util.c1.a(jSONObject, "tapAction", this.i);
        com.fyber.inneractive.sdk.util.c1.a(jSONObject, "unitDisplayType", this.j);
        JSONArray jSONArray = new JSONArray();
        List<Integer> list = this.k;
        if (list != null) {
            for (Integer num : list) {
                if (num != null) {
                    jSONArray.put(num);
                }
            }
        }
        com.fyber.inneractive.sdk.util.c1.a(jSONObject, "filterApi", jSONArray);
        return jSONObject;
    }

    public y0() {
        Boolean bool = Boolean.TRUE;
        this.a = bool;
        this.b = 5000;
        this.c = 0;
        this.d = bool;
        this.f = 0;
        this.g = 2048;
        this.h = Skip.fromValue(0);
        this.k = new ArrayList();
    }
}
