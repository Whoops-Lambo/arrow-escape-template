package com.adsurge.adn.K0;

import android.view.View;
import com.adsurge.adn.I0.e;
import com.adsurge.adn.p026h0.l;
import com.adsurge.adn.p032j0.g;
import com.adsurge.adn.p035k0.c;
import com.adsurge.adn.p035k0.k;
import com.adsurge.adn.p038l0.i;
import com.adsurge.adn.p064w0.d;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public abstract class a {
    public static final boolean a = !com.adsurge.adn.p011c0.b.e().a().c();

    /* JADX INFO: renamed from: com.adsurge.adn.K0.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class RunnableC0083a implements Runnable {
        public final /* synthetic */ View a;
        public final /* synthetic */ e b;
        public final /* synthetic */ i c;

        @Override // java.lang.Runnable
        public void run() {
            try {
                int[] iArr = new int[2];
                this.a.getLocationOnScreen(iArr);
                int i = iArr[0];
                int i2 = iArr[1];
                this.b.a("event", "render_view");
                this.b.a("viewType", a.a(this.c, i.class.getDeclaredField("B")));
                this.b.a("compo", this.c.t());
                a.a(this.c, this.b);
                this.b.a("viewX", g.b(i));
                this.b.a("viewY", g.b(i2));
                this.b.a("viewWidth", g.b(this.a.getWidth()));
                this.b.a("viewHeight", g.b(this.a.getHeight()));
                this.b.a("viewVisibility", this.a.getVisibility());
                this.b.a("viewAlpha", this.a.getAlpha());
                a.b(this.b, ((d) this.c.F()).k());
                a.a(this.b, this.c.s());
            } catch (Exception e) {
                b.a("logRenderView Exception:", e);
            }
            b.a("engine:", this.b.toString());
        }

        public RunnableC0083a(View view, e eVar, i iVar) {
            this.a = view;
            this.b = eVar;
            this.c = iVar;
        }
    }

    public static void a(e eVar, Map map, Map map2, com.adsurge.adn.p026h0.a[] aVarArr) {
        if (map != null) {
            e eVar2 = new e();
            for (Map.Entry entry : map.entrySet()) {
                eVar2.a((String) entry.getKey(), ((c) entry.getValue()).d());
            }
            eVar.a("dynamicAttributes", eVar2);
        }
        if (map2 != null) {
            e eVar3 = new e();
            for (Map.Entry entry2 : map2.entrySet()) {
                eVar3.a((String) entry2.getKey(), ((k) entry2.getValue()).toString());
            }
            eVar.a("staticAttributes", eVar3);
        }
        if (aVarArr != null) {
            JSONArray jSONArray = new JSONArray();
            for (com.adsurge.adn.p026h0.a aVar : aVarArr) {
                jSONArray.put(aVar.b());
            }
            eVar.a("animations", jSONArray);
        }
    }

    public static void b(e eVar, com.adsurge.adn.p026h0.k kVar) {
        if (kVar != null) {
            eVar.a("tag", kVar.a() + "_" + kVar.b() + "#" + kVar.c);
        }
    }

    public static void b(i iVar) {
        if (a || iVar == null) {
            return;
        }
        e eVar = new e();
        View viewC = iVar.C();
        if (viewC == null) {
            return;
        }
        viewC.post(new RunnableC0083a(viewC, eVar, iVar));
    }

    public static void a(i iVar) {
        if (a || iVar == null) {
            return;
        }
        e eVar = new e();
        try {
            eVar.a("event", "create_view_node");
            eVar.a("viewType", a(iVar, i.class.getDeclaredField("B")));
            a(iVar, eVar);
            a(eVar, iVar.v());
            Object objA = a(iVar, i.class.getDeclaredField("a"));
            Map map = objA != null ? (Map) objA : null;
            Object objA2 = a(iVar, i.class.getDeclaredField("p"));
            a(eVar, map, null, objA2 != null ? (com.adsurge.adn.p026h0.a[]) objA2 : null);
            a(eVar, ((d) iVar.F()).k());
            a(eVar, iVar.s());
        } catch (Exception e) {
            b.a("logCreateViewNode Exception:", e);
        }
        b.a("engine:", eVar.toString());
    }

    public static void a(String str, d dVar) {
        if (a || dVar == null) {
            return;
        }
        e eVar = new e();
        try {
            eVar.a("event", "bind_dynamic_script");
            eVar.a("javaScript", str);
            a(eVar, dVar.k());
        } catch (Exception e) {
            b.a("logBindScript Exception:", e);
        }
        b.a("engine:", eVar.toString());
    }

    public static Object a(i iVar, Field field) {
        try {
            field.setAccessible(true);
            return field.get(iVar);
        } catch (IllegalAccessException e) {
            b.a("getViewNodeField Exception:", e);
            return null;
        }
    }

    public static void a(i iVar, e eVar) {
        ArrayList arrayList = new ArrayList();
        while (iVar != null && iVar.E() != null) {
            arrayList.add(Integer.valueOf(iVar.w()));
            iVar = iVar.E();
        }
        Collections.reverse(arrayList);
        JSONArray jSONArray = new JSONArray();
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            jSONArray.put(((Integer) obj).intValue());
        }
        eVar.a("viewNodeIndex", jSONArray);
    }

    public static void a(l lVar, com.adsurge.adn.p026h0.k kVar) {
        if (a || lVar == null || kVar == null) {
            return;
        }
        e eVar = new e();
        try {
            eVar.a("event", "create_template_node");
            eVar.a("viewType", lVar.a);
            a(eVar, lVar.f);
            a(eVar, lVar.e, lVar.c, lVar.h);
            a(eVar, kVar);
            a(eVar, lVar.i);
        } catch (Exception e) {
            b.a("logTemplateNode Exception:", e);
        }
        b.a("engine:", eVar.toString());
    }

    public static void a(e eVar, com.adsurge.adn.p026h0.e[] eVarArr) {
        if (eVarArr == null || eVarArr.length <= 0) {
            return;
        }
        JSONArray jSONArray = new JSONArray();
        for (com.adsurge.adn.p026h0.e eVar2 : eVarArr) {
            e eVar3 = new e();
            eVar3.a("eventAction", eVar2.b);
            eVar3.a("eventType", eVar2.a);
            eVar3.a("eventParams", eVar2.d);
            jSONArray.put(eVar3);
        }
        eVar.a("events", jSONArray);
    }

    public static void a(e eVar, List list) {
        if (list == null || list.isEmpty()) {
            return;
        }
        JSONArray jSONArray = new JSONArray();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            com.adsurge.adn.p044n0.c cVar = (com.adsurge.adn.p044n0.c) it.next();
            e eVar2 = new e();
            eVar2.a("eventAction", cVar.b);
            eVar2.a("eventType", cVar.a);
            eVar2.a("eventParams", cVar.c);
            jSONArray.put(eVar2);
        }
        eVar.a("events", jSONArray);
    }

    public static void a(e eVar, com.adsurge.adn.p026h0.k kVar) {
        if (kVar != null) {
            a(eVar, kVar.a(), kVar.b());
        }
    }

    public static void a(e eVar, String str, int i) {
        eVar.a("tag", str + "_" + i);
    }

    public static void a(e eVar, com.adsurge.adn.p026h0.c cVar) {
        if (cVar != null) {
            eVar.a("compoTag", cVar.a() + "_" + cVar.b());
        }
    }
}
