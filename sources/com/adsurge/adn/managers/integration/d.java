package com.adsurge.adn.managers.integration;

import android.content.Context;
import com.adsurge.adn.x1.i;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class d implements IntegrationProbe {
    @Override // com.adsurge.adn.managers.integration.IntegrationProbe
    public boolean isEnabled() {
        return com.adsurge.adn.N.b.a("odcms", 1) == 1;
    }

    @Override // com.adsurge.adn.managers.integration.IntegrationProbe
    public String key() {
        return "manifest_queries";
    }

    @Override // com.adsurge.adn.managers.integration.IntegrationProbe
    public JSONObject collect(Context context) {
        return i.a(context);
    }
}
