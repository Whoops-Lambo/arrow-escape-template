package com.adsurge.adn.p035k0;

import defpackage.d;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public abstract class n {
    public static a a;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public interface a {
        Object a(JSONObject jSONObject, List list);
    }

    public static Object a(JSONObject jSONObject, List list) {
        a aVar = a;
        if (aVar != null) {
            return aVar.a(jSONObject, list);
        }
        if (!com.adsurge.adn.J0.a.a) {
            return null;
        }
        d.w("sValueProvider == null");
        return null;
    }

    public static void a(a aVar) {
        a = aVar;
    }
}
