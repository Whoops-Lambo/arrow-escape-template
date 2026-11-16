package com.adsurge.adn.M1;

import android.text.TextUtils;
import com.adsurge.adn.u1.c;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public class b {
    public final Map a = new ConcurrentHashMap();

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class a {
        public static final b a = new b();
    }

    public void a(c cVar) {
        com.adsurge.adn.M1.a aVar;
        if (cVar == null) {
            return;
        }
        String strH = cVar.h();
        if (TextUtils.isEmpty(strH) || (aVar = (com.adsurge.adn.M1.a) this.a.remove(strH)) == null) {
            return;
        }
        aVar.a(com.adsurge.adn.Y0.c.a(cVar));
    }

    public void a(String str, com.adsurge.adn.M1.a aVar) {
        if (TextUtils.isEmpty(str) || aVar == null) {
            return;
        }
        this.a.put(str, aVar);
    }

    public static b a() {
        return a.a;
    }
}
