package com.fyber.inneractive.sdk.config.global;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.global.features.s;
import com.fyber.inneractive.sdk.config.global.features.v;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.w;
import com.fyber.inneractive.sdk.util.x;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class r {
    public String a = "";
    public final HashMap b;
    public JSONArray c;

    /* JADX WARN: Code duplicated, block: B:103:0x012d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:39:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:41:0x00f4  */
    public final void a(boolean z, String str) {
        boolean z2;
        ArrayList arrayList;
        int size;
        int i;
        n nVar;
        k kVar;
        this.a = str;
        a aVar = IAConfigManager.Q.z;
        aVar.b = this;
        for (com.fyber.inneractive.sdk.config.global.features.i iVar : this.b.values()) {
            boolean z3 = iVar instanceof com.fyber.inneractive.sdk.config.global.features.p;
            if ((z3 && z) || (!z3 && !z)) {
                l lVar = aVar.a;
                if (iVar != null && lVar != null) {
                    q qVar = (q) lVar.a.get(iVar.b);
                    if (qVar != null) {
                        iVar.a = qVar.a;
                        IAlog.a("%s: Feature before variant merge: %s", "a", iVar);
                        HashMap map = qVar.c;
                        Iterator it = map.keySet().iterator();
                        while (it.hasNext()) {
                            b bVar = (b) map.get((String) it.next());
                            if (bVar != null) {
                                boolean z4 = true;
                                int iNextInt = new Random().nextInt(100) + 1;
                                int i2 = 0;
                                if (bVar.b < iNextInt) {
                                    IAlog.a("%s: Experiment '%s' filtered! rand: %d, with perc: %d", "a", bVar.a, Integer.valueOf(iNextInt), Integer.valueOf(bVar.b));
                                } else {
                                    ArrayList arrayList2 = bVar.d;
                                    if (arrayList2 != null) {
                                        int size2 = arrayList2.size();
                                        int i3 = 0;
                                        while (true) {
                                            if (i3 < size2) {
                                                Object obj = arrayList2.get(i3);
                                                i3++;
                                                d dVar = (d) obj;
                                                try {
                                                    Long lValueOf = Long.valueOf(IAConfigManager.Q.d);
                                                    z2 = z4;
                                                    try {
                                                        e eVar = new e();
                                                        eVar.b = lValueOf;
                                                        eVar.c = com.fyber.inneractive.sdk.serverapi.b.a(aVar.b.a);
                                                        if (dVar.a(eVar)) {
                                                            IAlog.a("%s: Experiment '%s' filtered! with %s", "a", bVar.a, dVar);
                                                        } else {
                                                            continue;
                                                        }
                                                    } catch (NumberFormatException unused) {
                                                        IAlog.a("%s: invalid publisherId", "a");
                                                    }
                                                } catch (NumberFormatException unused2) {
                                                    z2 = z4;
                                                }
                                                z4 = z2;
                                            } else {
                                                z2 = z4;
                                                if (iVar instanceof v) {
                                                    arrayList = bVar.c;
                                                    size = arrayList.size();
                                                    i = 0;
                                                    while (true) {
                                                        if (i < size) {
                                                            Object obj2 = arrayList.get(i);
                                                            i++;
                                                            k kVar2 = (k) obj2;
                                                            nVar = kVar2.a;
                                                            if (nVar == null && nVar.a() != null && kVar2.a.a().containsKey("use_fmp_cache_mechanism")) {
                                                                w wVar = (w) IAConfigManager.Q.I.get(x.Video);
                                                                if (!(wVar != null ? wVar.a() : false)) {
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                                IAlog.a("%s: Experiment '%s' NOT filtered! rand: %d, with perc: %d", "a", bVar.a, Integer.valueOf(iNextInt), Integer.valueOf(bVar.b));
                                                z4 = false;
                                            }
                                            z4 = z2;
                                        }
                                    } else {
                                        z2 = z4;
                                        if (iVar instanceof v) {
                                            arrayList = bVar.c;
                                            size = arrayList.size();
                                            i = 0;
                                            while (true) {
                                                if (i < size) {
                                                    Object obj3 = arrayList.get(i);
                                                    i++;
                                                    k kVar3 = (k) obj3;
                                                    nVar = kVar3.a;
                                                    if (nVar == null) {
                                                    }
                                                }
                                            }
                                        }
                                        IAlog.a("%s: Experiment '%s' NOT filtered! rand: %d, with perc: %d", "a", bVar.a, Integer.valueOf(iNextInt), Integer.valueOf(bVar.b));
                                        z4 = false;
                                    }
                                }
                                if (!z4) {
                                    ArrayList arrayList3 = bVar.c;
                                    int iNextInt2 = new Random().nextInt(100) + 1;
                                    IAlog.a("%s: selectVariant for experiment '%s' generated random number: %d", "a", bVar.a, Integer.valueOf(iNextInt2));
                                    int size3 = arrayList3.size();
                                    int i4 = 0;
                                    while (true) {
                                        if (i4 >= size3) {
                                            kVar = null;
                                            break;
                                        }
                                        Object obj4 = arrayList3.get(i4);
                                        i4++;
                                        kVar = (k) obj4;
                                        i2 += kVar.c;
                                        IAlog.a("%s: selectVariant variant found: %s", "a", kVar);
                                        if (i2 >= iNextInt2) {
                                            break;
                                        } else {
                                            IAlog.a("%s: selectVariant variant '%s' percentage outside selected range", "a", kVar.b);
                                        }
                                    }
                                    String str2 = bVar.a;
                                    if (kVar != null) {
                                        IAlog.a("%s: experiment '%s' variant selected! %s", "a", str2, kVar);
                                    } else {
                                        IAlog.a("%s: experiment '%s' no variant was selected! using control group", "a", str2);
                                    }
                                    iVar.c.put(bVar.a, bVar);
                                    if (kVar != null) {
                                        iVar.d.put(bVar.a, kVar);
                                    }
                                }
                            }
                        }
                    }
                    IAlog.a("%s: Feature after variant merge: %s", "a", iVar);
                }
            }
        }
    }

    public final JSONArray b() {
        JSONArray jSONArray = this.c;
        if (jSONArray == null || jSONArray.length() == 0) {
            JSONArray jSONArrayA = g.a(this.b, false);
            this.c = jSONArrayA;
            IAlog.a("%s: active experiments json set = %s", "SupportedFeaturesProvider", jSONArrayA);
        }
        return this.c;
    }

    public r() {
        HashMap map = new HashMap();
        map.put(v.class, new v());
        map.put(com.fyber.inneractive.sdk.config.global.features.d.class, new com.fyber.inneractive.sdk.config.global.features.d());
        map.put(com.fyber.inneractive.sdk.config.global.features.m.class, new com.fyber.inneractive.sdk.config.global.features.m());
        map.put(com.fyber.inneractive.sdk.config.global.features.f.class, new com.fyber.inneractive.sdk.config.global.features.f());
        map.put(com.fyber.inneractive.sdk.config.global.features.l.class, new com.fyber.inneractive.sdk.config.global.features.l());
        map.put(com.fyber.inneractive.sdk.config.global.features.e.class, new com.fyber.inneractive.sdk.config.global.features.e());
        map.put(s.class, new s());
        map.put(com.fyber.inneractive.sdk.config.global.features.j.class, new com.fyber.inneractive.sdk.config.global.features.j());
        map.put(com.fyber.inneractive.sdk.config.global.features.r.class, new com.fyber.inneractive.sdk.config.global.features.r());
        map.put(com.fyber.inneractive.sdk.config.global.features.o.class, new com.fyber.inneractive.sdk.config.global.features.o());
        map.put(com.fyber.inneractive.sdk.config.global.features.c.class, new com.fyber.inneractive.sdk.config.global.features.c());
        map.put(com.fyber.inneractive.sdk.config.global.features.n.class, new com.fyber.inneractive.sdk.config.global.features.n());
        map.put(com.fyber.inneractive.sdk.config.global.features.b.class, new com.fyber.inneractive.sdk.config.global.features.b());
        map.put(com.fyber.inneractive.sdk.config.global.features.h.class, new com.fyber.inneractive.sdk.config.global.features.h());
        map.put(com.fyber.inneractive.sdk.config.global.features.k.class, new com.fyber.inneractive.sdk.config.global.features.k());
        map.put(com.fyber.inneractive.sdk.config.global.features.g.class, new com.fyber.inneractive.sdk.config.global.features.g());
        this.b = map;
        this.c = null;
        HashMap map2 = new HashMap();
        for (Map.Entry entry : map.entrySet()) {
            map2.put((Class) entry.getKey(), ((com.fyber.inneractive.sdk.config.global.features.i) entry.getValue()).b());
        }
        this.b = map2;
        IAlog.a("%s: created. Supported features: %s", "SupportedFeaturesProvider", map2);
    }

    public final void a(e eVar) {
        for (com.fyber.inneractive.sdk.config.global.features.i iVar : this.b.values()) {
            iVar.getClass();
            ArrayList arrayList = new ArrayList(iVar.c.values());
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                b bVar = (b) arrayList.get(size);
                ArrayList arrayList2 = bVar.d;
                if (arrayList2 != null) {
                    int size2 = arrayList2.size();
                    int i = 0;
                    while (i < size2) {
                        Object obj = arrayList2.get(i);
                        i++;
                        d dVar = (d) obj;
                        if (dVar.a(eVar)) {
                            iVar.c.remove(bVar.a);
                            iVar.d.remove(bVar.a);
                            this.c = null;
                            IAlog.a("%s: Experiment %s filtered! after response %s", "SupportedFeaturesProvider", bVar.a, dVar);
                            break;
                        }
                    }
                }
            }
        }
    }

    public final com.fyber.inneractive.sdk.config.global.features.i a(Class cls) {
        if (this.b.containsKey(cls)) {
            com.fyber.inneractive.sdk.config.global.features.i iVar = (com.fyber.inneractive.sdk.config.global.features.i) this.b.get(cls);
            if (cls.isInstance(iVar)) {
                return iVar;
            }
        }
        try {
            return (com.fyber.inneractive.sdk.config.global.features.i) cls.getConstructor(null).newInstance(null);
        } catch (Exception e) {
            IAlog.a("Couldn't create a feature for %s", e, cls.getName());
            return null;
        }
    }

    public static r a() {
        int i = com.fyber.inneractive.sdk.config.n.a;
        String property = System.getProperty("ia.testEnvironmentConfiguration.featuresConfig");
        boolean z = false;
        if (!TextUtils.isEmpty(property)) {
            try {
                IAConfigManager.Q.z.a = l.a(new JSONObject(property));
                z = true;
            } catch (Exception unused) {
                IAlog.a("failed parsing local features json", new Object[0]);
            }
        }
        r rVar = new r();
        if (z) {
            IAConfigManager iAConfigManager = IAConfigManager.Q;
            iAConfigManager.N.a(true, "");
            iAConfigManager.F.a(iAConfigManager.N);
        }
        return rVar;
    }
}
