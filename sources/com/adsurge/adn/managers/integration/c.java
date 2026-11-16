package com.adsurge.adn.managers.integration;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.util.Base64;
import com.adsurge.adn.I0.e;
import java.nio.charset.StandardCharsets;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class c implements IntegrationProbe {
    @Override // com.adsurge.adn.managers.integration.IntegrationProbe
    public JSONObject collect(Context context) {
        ClassLoader classLoader = c.class.getClassLoader();
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        e eVar = new e();
        int iA = a(eVar, a(eVar, a(eVar, 0, com.adsurge.adn.L.a.EXO_PLAYER, com.adsurge.adn.D1.a.h()), com.adsurge.adn.L.a.QUICK_JS, com.adsurge.adn.L.b.a(classLoader, applicationInfo, a("YWRzdXJnZXFqcw=="))), com.adsurge.adn.L.a.TURING, com.adsurge.adn.L.b.a(classLoader, applicationInfo, a("dHVyaW5nb3ZlcnNlYV9hZA==")));
        eVar.a("native_ok", com.adsurge.adn.L.b.a(classLoader, applicationInfo, a("YWRzdXJnZV9wcm9iZQ==")));
        eVar.a("mask", iA);
        return eVar.a();
    }

    @Override // com.adsurge.adn.managers.integration.IntegrationProbe
    public boolean isEnabled() {
        return com.adsurge.adn.N.b.a("odclms", 1) == 1;
    }

    @Override // com.adsurge.adn.managers.integration.IntegrationProbe
    public String key() {
        return "lite_module";
    }

    public static int a(e eVar, int i, com.adsurge.adn.L.a aVar, boolean z) {
        eVar.a(aVar.b(), new e().a("present", z).a());
        return aVar.a(i, z);
    }

    public static String a(String str) {
        return new String(Base64.decode(str, 2), StandardCharsets.UTF_8);
    }
}
