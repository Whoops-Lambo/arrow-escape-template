package com.inmobi.media;

import defpackage.gd1;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class Kq {
    public final ConcurrentHashMap a = new ConcurrentHashMap();

    public final JSONObject a() {
        try {
            JSONObject jSONObject = new JSONObject();
            for (Map.Entry entry : this.a.entrySet()) {
                jSONObject.put(String.valueOf(Ig.a((Hg) entry.getKey())), ((Jq) entry.getValue()).a());
            }
            return jSONObject;
        } catch (Exception e) {
            gd1 gd1Var = Ba.a;
            Ba.a(new C4120j3(e));
            return new JSONObject();
        }
    }
}
