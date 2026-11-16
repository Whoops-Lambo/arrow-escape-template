package com.adsurge.adn.X;

import android.text.TextUtils;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public abstract class v {

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class a implements com.adsurge.adn.G0.b {
        public final /* synthetic */ String a;

        public a(String str) {
            this.a = str;
        }

        @Override // com.adsurge.adn.G0.b
        public void a(com.adsurge.adn.H0.a aVar, com.adsurge.adn.H0.b bVar) {
            bVar.b();
        }

        @Override // com.adsurge.adn.G0.b
        public void a(com.adsurge.adn.H0.a aVar, Exception exc) {
            exc.getMessage();
        }
    }

    public static void a(String str, boolean z, Map map, com.adsurge.adn.G0.b bVar) {
        com.adsurge.adn.G0.c.a aVar;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        com.adsurge.adn.T.c cVar = new com.adsurge.adn.T.c(str, com.adsurge.adn.H0.a.EnumC0076a.GET, null);
        if (map != null) {
            for (Map.Entry entry : map.entrySet()) {
                cVar.a((String) entry.getKey(), (String) entry.getValue());
            }
        }
        com.adsurge.adn.G0.c cVarA = com.adsurge.adn.R.c.a();
        if (z) {
            aVar = com.adsurge.adn.G0.c.a.High;
        } else {
            aVar = com.adsurge.adn.G0.c.a.Low;
        }
        if (bVar == null) {
            bVar = new a(str);
        }
        cVarA.a(cVar, aVar, bVar);
    }

    public static void a(String str, boolean z, com.adsurge.adn.G0.b bVar) {
        a(str, z, null, bVar);
    }

    public static void a(String str, boolean z) {
        a(str, z, null);
    }
}
