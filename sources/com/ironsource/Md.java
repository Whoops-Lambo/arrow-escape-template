package com.ironsource;

import defpackage.ar2;
import defpackage.dt1;
import defpackage.ej1;
import defpackage.p92;
import defpackage.qh1;
import java.util.Iterator;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class Md {

    @NotNull
    private final Map<String, Ec> a;

    /* JADX INFO: Access modifiers changed from: private */
    public static final dt1 a(JSONObject jSONObject, String str) throws JSONException {
        str.getClass();
        JSONObject jSONObject2 = jSONObject.getJSONObject(str);
        jSONObject2.getClass();
        return new dt1(str, new Ec(str, jSONObject2));
    }

    public Md(@NotNull JSONObject jSONObject) {
        jSONObject.getClass();
        Iterator<String> itKeys = jSONObject.keys();
        itKeys.getClass();
        Map<String, Ec> mapF0 = qh1.f0(new ar2(p92.F(itKeys), new ej1(jSONObject, 0)));
        this.a = mapF0;
        for (Map.Entry<String, Ec> entry : mapF0.entrySet()) {
            entry.getKey();
            Ec value = entry.getValue();
            if (b(value)) {
                value.b(a(value));
            }
        }
    }

    private final boolean b(Ec ec) {
        if (ec.o() && ec.l().length() > 0) {
            return true;
        }
        return false;
    }

    @NotNull
    public final Map<String, Ec> a() {
        return this.a;
    }

    private final Ec a(Ec ec) {
        return this.a.get(ec.h());
    }
}
