package com.adsurge.adn.Y0;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public abstract class m {
    public static final String a;
    public static final AtomicInteger b;

    static {
        a = com.adsurge.adn.J0.a.a ? "StatEventConverter" : m.class.getCanonicalName();
        b = new AtomicInteger(1);
    }

    public static JSONObject a(List list) {
        if (list == null || list.size() == 0) {
            return null;
        }
        JSONArray jSONArray = new JSONArray();
        for (int i = 0; i < list.size(); i++) {
            jSONArray.put(new com.adsurge.adn.I0.e(((l) list.get(i)).c()).a());
        }
        h.c cVarA = j.f().a();
        com.adsurge.adn.I0.e eVarA = cVarA.a();
        eVarA.a("events", cVarA.b(jSONArray));
        return eVarA.a();
    }

    public static l a(int i, String str) {
        return new l(i, str);
    }

    public static l a(e eVar) {
        long jA = com.adsurge.adn.F0.b.b().a();
        eVar.a(b.getAndIncrement());
        eVar.a(jA);
        try {
            return new l(eVar.c().toString(), jA);
        } catch (Exception unused) {
            return null;
        }
    }
}
