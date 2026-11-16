package com.adsurge.adn.p032j0;

import androidx.core.app.NotificationCompat;
import com.adsurge.adn.Y0.d;
import com.adsurge.adn.Y0.e;
import com.adsurge.adn.Y0.v;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public abstract class c {
    public static void a(String str, int i, int i2, JSONObject jSONObject) {
        e eVar = new e(1190204);
        com.adsurge.adn.Y0.c cVar = new com.adsurge.adn.Y0.c();
        cVar.f(str);
        d dVar = new d();
        dVar.a("data", Integer.valueOf(i));
        if (jSONObject != null) {
            dVar.a(NotificationCompat.CATEGORY_MESSAGE, jSONObject.toString());
        }
        eVar.a(cVar);
        eVar.e(i2);
        eVar.a(dVar);
        v.a(eVar);
    }
}
