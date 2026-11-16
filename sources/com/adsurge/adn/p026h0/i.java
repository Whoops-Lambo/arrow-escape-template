package com.adsurge.adn.p026h0;

import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public class i {
    public final int a;
    public final String b;
    public final String c;
    public final Map d;
    public final String e;
    public final JSONObject f;
    public final JSONObject g;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class a {
        public int a;
        public String b = "";
        public String c = null;
        public Map d;
        public String e;
        public JSONObject f;
        public JSONObject g;

        public i a() {
            return new i(this);
        }
    }

    public i(a aVar) {
        this.a = aVar.a;
        this.b = aVar.b;
        this.c = aVar.c;
        Map map = aVar.d;
        this.d = (map == null || map.size() <= 0) ? null : map;
        this.e = aVar.e;
        this.f = aVar.f;
        this.g = aVar.g;
    }
}
