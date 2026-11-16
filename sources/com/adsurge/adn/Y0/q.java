package com.adsurge.adn.Y0;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public abstract class q {
    public static final String a;
    public static final AtomicInteger b;

    static {
        a = com.adsurge.adn.J0.a.a ? "StatPerformanceModelConverter" : q.class.getCanonicalName();
        b = new AtomicInteger(1);
    }

    public static JSONObject a(List list) {
        if (list == null || list.size() <= 0) {
            return null;
        }
        JSONArray jSONArray = new JSONArray();
        for (int i = 0; i < list.size(); i++) {
            jSONArray.put(new com.adsurge.adn.I0.e(((p) list.get(i)).c()).a());
        }
        h.c cVarA = j.f().a();
        com.adsurge.adn.I0.e eVarA = cVarA.a();
        eVarA.a("perfs", cVarA.a(jSONArray));
        return eVarA.a();
    }

    public static p a(i iVar) {
        long jA = com.adsurge.adn.F0.b.b().a();
        iVar.a(b.getAndIncrement());
        iVar.a(jA);
        return new p(iVar.c().toString(), jA);
    }

    public static p a(int i, String str) {
        return new p(i, str);
    }
}
