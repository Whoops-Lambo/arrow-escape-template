package com.adsurge.adn.p031j;

import com.adsurge.adn.u1.c;
import java.util.Map;
import org.json.JSONException;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public abstract class b {
    public static void a(c cVar, Map map) {
        if (com.adsurge.adn.N.b.a("skcre", 0, cVar) == 1 && map != null) {
            Object obj = map.get("reward_count");
            Object obj2 = map.get("reward_item");
            if (obj instanceof Integer) {
                try {
                    cVar.R().put("reward_count", ((Integer) obj).intValue());
                } catch (JSONException e) {
                    e.toString();
                }
            }
            if (obj2 instanceof String) {
                try {
                    cVar.R().put("reward_item", (String) obj2);
                } catch (JSONException e2) {
                    e2.toString();
                }
            }
        }
    }
}
