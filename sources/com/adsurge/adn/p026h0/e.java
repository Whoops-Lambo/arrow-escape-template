package com.adsurge.adn.p026h0;

import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public class e {
    public final int a;
    public final String b;
    public final String c;
    public final String d;
    public final Map e;
    public final String f;
    public final JSONObject g;
    public final JSONObject h;
    public final boolean i;
    public final String j;
    public final String k;
    public final int l;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class a {
        public int a;
        public String b = "";
        public String c = "";
        public String d = "";
        public Map e;
        public String f;
        public JSONObject g;
        public JSONObject h;
        public boolean i;
        public String j;
        public String k;
        public int l;

        public e a() {
            return new e(this);
        }
    }

    public e(a aVar) {
        this.a = aVar.a;
        this.b = aVar.b;
        this.c = aVar.c;
        this.d = aVar.d;
        Map map = aVar.e;
        this.e = (map == null || map.size() <= 0) ? null : map;
        this.f = aVar.f;
        this.g = aVar.g;
        this.h = aVar.h;
        this.i = aVar.i;
        this.j = aVar.j;
        this.k = aVar.k;
        this.l = aVar.l;
    }
}
