package com.adsurge.adn.p026h0;

import android.util.Pair;
import com.adsurge.adn.p035k0.c;
import com.adsurge.adn.p035k0.j;
import com.adsurge.adn.p035k0.k;
import com.adsurge.adn.p035k0.m;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public class l {
    public final String a;
    public final l[] b;
    public final Map c;
    public final Map d;
    public final Map e;
    public final e[] f;
    public final i[] g;
    public final com.adsurge.adn.p026h0.a[] h;
    public final c i;
    public final boolean j;
    public final boolean k;
    public String l;
    public final int m;
    public final int n;
    public String o;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class a {
        public String a;
        public l[] b;
        public e[] e;
        public i[] f;
        public com.adsurge.adn.p026h0.a[] g;
        public int i;
        public String j;
        public c k;
        public Map c = new HashMap(10);
        public Map d = new HashMap();
        public int h = 0;

        public l a() {
            return new l(this);
        }
    }

    public final boolean a() {
        if (this.e == null) {
            return false;
        }
        for (String str : com.adsurge.adn.p017e0.a.b) {
            if (((c) this.e.get(str)) != null) {
                return true;
            }
        }
        for (String str2 : com.adsurge.adn.p017e0.a.a) {
            if (((c) this.e.get(str2)) != null) {
                return true;
            }
        }
        return false;
    }

    public int b() {
        return this.m;
    }

    public int c() {
        return this.n;
    }

    public final boolean d() {
        l[] lVarArr = this.b;
        if (lVarArr == null) {
            return false;
        }
        for (l lVar : lVarArr) {
            if (lVar != null && lVar.j) {
                return true;
            }
        }
        return false;
    }

    public final Pair e() {
        boolean z;
        Map mapA;
        Map map = null;
        if (this.c == null) {
            return new Pair(Boolean.FALSE, null);
        }
        String[] strArr = com.adsurge.adn.p017e0.a.b;
        int length = strArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                z = false;
                break;
            }
            k kVar = (k) this.c.get(strArr[i]);
            if (kVar != null && (kVar.b(new JSONObject[0]).c() || kVar.b(new JSONObject[0]).d())) {
                z = true;
                break;
            }
            i++;
        }
        for (String str : com.adsurge.adn.p017e0.a.a) {
            k kVar2 = (k) this.c.get(str);
            if (kVar2 != null) {
                Object objD = kVar2.d(new JSONObject[0]);
                if (!(objD instanceof JSONArray)) {
                    if (kVar2.b(new JSONObject[0]).c() || kVar2.b(new JSONObject[0]).d()) {
                        mapA = a(map, str, kVar2);
                        map = mapA;
                        z = true;
                        break;
                        break;
                    }
                } else {
                    JSONArray jSONArray = (JSONArray) objD;
                    for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                        j jVarB = m.c((Object) jSONArray.optString(i2)).b(new JSONObject[0]);
                        if (jVarB != null && (jVarB.c() || jVarB.d())) {
                            mapA = a(map, str, kVar2);
                            map = mapA;
                            z = true;
                            break;
                        }
                    }
                }
            }
        }
        return new Pair(Boolean.valueOf(z), map);
    }

    public l(a aVar) {
        Map map;
        boolean z;
        this.a = aVar.a;
        this.b = aVar.b;
        if (aVar.c.size() > 0) {
            map = aVar.c;
        } else {
            map = null;
        }
        this.c = map;
        this.e = aVar.d.size() > 0 ? aVar.d : null;
        this.f = aVar.e;
        this.g = aVar.f;
        this.h = aVar.g;
        Pair pairE = e();
        if (!((Boolean) pairE.first).booleanValue() && !a()) {
            z = false;
        } else {
            z = true;
        }
        this.j = z;
        this.d = (Map) pairE.second;
        this.k = d();
        this.m = aVar.h;
        this.n = aVar.i;
        this.o = aVar.j;
        this.i = aVar.k;
    }

    public final Map a(Map map, String str, k kVar) {
        if (map == null) {
            map = new HashMap();
        }
        map.put(str, kVar);
        this.c.remove(str);
        return map;
    }
}
