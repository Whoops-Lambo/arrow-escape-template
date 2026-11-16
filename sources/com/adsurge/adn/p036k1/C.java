package com.adsurge.adn.p036k1;

import android.text.TextUtils;
import com.adsurge.adn.Q.g;
import com.adsurge.adn.Q.h;
import com.adsurge.adn.x1.l;
import java.io.File;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public class C {
    public final File a = l.e();
    public final Map b = new HashMap(6);
    public JSONObject c;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class a extends AbstractC1633a {
        public final /* synthetic */ File f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(File file, String str, boolean z, File file2) {
            super(file, str, z);
            this.f = file2;
        }

        @Override // com.adsurge.adn.p036k1.AbstractC1633a
        public void a(JSONObject jSONObject, boolean z) throws Throwable {
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                File file = new File(this.f, next);
                if (!z || !file.exists()) {
                    try {
                        l.a(file, jSONObject.optString(next));
                    } catch (Exception unused) {
                        file.delete();
                    }
                }
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class b extends AbstractC1633a {
        public b(File file, String str, boolean z) {
            super(file, str, z);
        }

        @Override // com.adsurge.adn.p036k1.AbstractC1633a
        public void a(JSONObject jSONObject, boolean z) {
            C.this.c = jSONObject;
        }
    }

    public void b(com.adsurge.adn.p006a1.a aVar) {
        if (this.b.get(aVar) != null) {
            m.a(aVar, 4);
            return;
        }
        this.b.put(aVar, new ConcurrentHashMap(0));
        JSONObject jSONObject = this.c;
        if (jSONObject == null || jSONObject.length() <= 0) {
            return;
        }
        File fileA = a(aVar, true);
        new a(fileA, this.c.optString(String.valueOf(a(aVar))), true, fileA).b();
    }

    public final boolean c(com.adsurge.adn.p006a1.a aVar) {
        JSONObject jSONObject = this.c;
        if (jSONObject == null || jSONObject.length() == 0) {
            return false;
        }
        return !TextUtils.isEmpty(this.c.optString(String.valueOf(a(aVar))));
    }

    public C() {
        a();
    }

    public g a(com.adsurge.adn.p006a1.a aVar, String str, boolean z) {
        int i;
        int i2;
        if (c(aVar)) {
            File file = new File(a(aVar, true), str);
            if (!file.exists()) {
                i = 13;
            } else if (file.length() == 0) {
                file.delete();
                i = 21;
            } else {
                String strB = l.b(file);
                if (TextUtils.isEmpty(strB)) {
                    file.delete();
                    i = 10;
                } else if ('{' != strB.charAt(0)) {
                    i = 5;
                } else {
                    try {
                        return new h().a(new JSONObject(strB)).b(2).a();
                    } catch (JSONException unused) {
                        i = 20;
                    }
                }
            }
        } else {
            i = 0;
        }
        int i3 = i * 100;
        if (z) {
            return new h().a(str).c(2).b(2).a(i3).a();
        }
        String strA = x.a(aVar, str, 3);
        if (TextUtils.isEmpty(strA)) {
            i2 = i3 + 10;
        } else if ('{' != strA.charAt(0)) {
            i2 = i3 + 5;
        } else {
            try {
                return new h().a(new JSONObject(strA)).b(3).a();
            } catch (JSONException unused2) {
                i2 = i3 + 20;
            }
        }
        return new h().a(str).c(3).b(3).a(i2).a();
    }

    public boolean b(com.adsurge.adn.p006a1.a aVar, g gVar) {
        if (this.b.size() == 0) {
            m.a(aVar, 2);
            return true;
        }
        Map map = (Map) this.b.get(aVar);
        if (map != null && map.size() > 0) {
            Integer num = (Integer) map.get(gVar.j());
            return num == null || gVar.s() != num.intValue();
        }
        m.a(aVar, 2);
        return true;
    }

    public void a(com.adsurge.adn.p006a1.a aVar, g gVar) {
        Map map = (Map) this.b.get(aVar);
        if (map == null) {
            m.a(aVar, 3);
            return;
        }
        Integer num = (Integer) map.get(gVar.j());
        if (num == null || num.intValue() < gVar.s()) {
            map.put(gVar.j(), Integer.valueOf(gVar.s()));
        }
    }

    public final void a() {
        new b(this.a, com.adsurge.adn.N.b.a("skfbtp", ""), true).b();
    }

    public final File a(com.adsurge.adn.p006a1.a aVar, boolean z) {
        File file = this.a;
        StringBuilder sb = new StringBuilder();
        sb.append(a(aVar));
        sb.append(z ? "_fb" : "_ol");
        return new File(file, sb.toString());
    }

    public final int a(com.adsurge.adn.p006a1.a aVar) {
        if (aVar == null) {
            return 0;
        }
        return aVar.k().type;
    }
}
