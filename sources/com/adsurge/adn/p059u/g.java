package com.adsurge.adn.p059u;

import android.text.TextUtils;
import android.util.Pair;
import com.adsurge.adn.N.b;
import com.adsurge.adn.Y0.c;
import com.adsurge.adn.Y0.d;
import com.adsurge.adn.ads.AdSurgeAdFormat;
import com.adsurge.adn.p021f1.o;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public abstract class g {
    public static final boolean a;
    public static final boolean b;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class a {
        public final List a;
        public final Map b;

        public static a a(List list) {
            return new a(list, Collections.EMPTY_MAP);
        }

        public a(List list, Map map) {
            this.a = list;
            this.b = map;
        }
    }

    static {
        a = b.a("efen", 1) == 1;
        b = b.a("skdhrad", com.adsurge.adn.p033j1.a.d.intValue(), (AdSurgeAdFormat) null, (String) null) == 1;
    }

    public static a b(List list) {
        if (!a) {
            return a.a(list);
        }
        ArrayList arrayList = new ArrayList();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        long jCurrentTimeMillis = System.currentTimeMillis();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            com.adsurge.adn.Q.a aVar = (com.adsurge.adn.Q.a) pair.second;
            if (a(aVar.n())) {
                String strR = aVar.r();
                String strH = aVar.h();
                if (!TextUtils.isEmpty(strR) && !TextUtils.isEmpty(strH)) {
                    boolean zA = o.a(strR);
                    String strA = a(aVar.u(), zA ? 1 : 0, jCurrentTimeMillis, aVar.q());
                    if (strA != null) {
                        linkedHashMap.put(strH, strA);
                    }
                }
            } else {
                arrayList.add(pair);
            }
        }
        if (linkedHashMap.isEmpty()) {
            return a.a(arrayList);
        }
        linkedHashMap.size();
        return new a(arrayList, linkedHashMap);
    }

    public static a a(List list, String str, AdSurgeAdFormat adSurgeAdFormat, c cVar) {
        if (list.isEmpty()) {
            return a.a(list);
        }
        a aVarB = b(list);
        List listA = a(a(aVarB.a, str, adSurgeAdFormat));
        int size = list.size() - listA.size();
        if (size > 0) {
            com.adsurge.adn.w1.b.a(6000008, cVar, Integer.valueOf(size), Integer.valueOf(list.size()), (d) null);
        }
        return new a(listA, aVarB.b);
    }

    public static boolean a(int i) {
        return ((long) i) <= 5000;
    }

    public static String a(String str, int i, long j, int i2) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("sid", str);
            jSONObject.put("flag", i);
            jSONObject.put("ts", j);
            jSONObject.put("bias", i2);
            return jSONObject.toString();
        } catch (Throwable unused) {
            return null;
        }
    }

    public static List a(List list, String str, AdSurgeAdFormat adSurgeAdFormat) {
        if (b.a("enfai", 1, adSurgeAdFormat, str) != 1) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            if (!a((com.adsurge.adn.Q.a) pair.second)) {
                arrayList.add(pair);
            }
        }
        return arrayList;
    }

    public static boolean a(com.adsurge.adn.Q.a aVar) {
        int iO = aVar.o();
        if (iO != 1 && iO != 2) {
            return false;
        }
        long jA = a(aVar.r());
        return (iO == 1 && jA > 0) || (iO == 2 && jA == 0);
    }

    public static long a(String str) {
        try {
            return com.adsurge.adn.J.a.d().a().getPackageManager().getPackageInfo(str, 0).firstInstallTime;
        } catch (Throwable unused) {
            return 0L;
        }
    }

    public static List a(List list) {
        if (!b) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            com.adsurge.adn.Q.a aVar = (com.adsurge.adn.Q.a) pair.second;
            if (!(aVar instanceof com.adsurge.adn.u1.c) || !((com.adsurge.adn.u1.c) aVar).N0()) {
                arrayList.add(pair);
            }
        }
        return arrayList;
    }
}
