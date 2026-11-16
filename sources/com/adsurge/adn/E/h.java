package com.adsurge.adn.E;

import com.ironsource.G5;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class h {
    public static void a(c.a aVar, JSONObject jSONObject) {
        if (aVar == null || jSONObject == null) {
            return;
        }
        e.a(aVar.a, jSONObject.optJSONObject("compliance"));
        g.a(aVar.b, jSONObject.optJSONObject(G5.o));
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("custom");
        if (aVar.c == null || jSONObjectOptJSONObject == null) {
            return;
        }
        Iterator<String> itKeys = jSONObjectOptJSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            Object objOpt = jSONObjectOptJSONObject.opt(next);
            if (objOpt instanceof String) {
                aVar.c.put(next, (String) objOpt);
            }
        }
    }

    public static JSONObject b(c.a aVar) {
        JSONObject jSONObject = new JSONObject();
        if (aVar != null) {
            try {
                d dVar = aVar.a;
                if (dVar != null) {
                    JSONObject jSONObjectB = e.b(dVar);
                    if (jSONObjectB.length() > 0) {
                        jSONObject.put("compliance", jSONObjectB);
                    }
                }
                f fVar = aVar.b;
                if (fVar != null) {
                    JSONObject jSONObjectB2 = g.b(fVar);
                    if (jSONObjectB2.length() > 0) {
                        jSONObject.put(G5.o, jSONObjectB2);
                    }
                }
                if (aVar.c != null) {
                    jSONObject.put("custom", new JSONObject(aVar.c));
                }
            } catch (JSONException unused) {
            }
        }
        return jSONObject;
    }

    public static c.a a(c.a aVar) {
        if (aVar == null) {
            return null;
        }
        c.a aVar2 = new c.a();
        d dVar = aVar.a;
        aVar2.a = dVar == null ? null : e.a(dVar);
        f fVar = aVar.b;
        aVar2.b = fVar == null ? null : g.a(fVar);
        aVar2.c = aVar.c != null ? new HashMap(aVar.c) : null;
        return aVar2;
    }
}
