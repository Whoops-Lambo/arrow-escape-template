package com.adsurge.adn.p020f0;

import com.adsurge.adn.p026h0.l;
import com.adsurge.adn.p035k0.m;
import com.adsurge.adn.p038l0.i;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public class c implements com.adsurge.adn.p020f0.g {
    public static final String d;
    public static Boolean e;
    public boolean a = true;
    public volatile boolean b = false;
    public final Map c = new HashMap();

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class a implements Runnable {
        public final /* synthetic */ JSONObject a;

        public a(JSONObject jSONObject) {
            this.a = jSONObject;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.adsurge.adn.J0.a.a(c.d, "-------------emit------------- \n data =  %s", this.a);
            for (Map.Entry entry : c.this.c.entrySet()) {
                Object objD = ((com.adsurge.adn.p035k0.c) entry.getKey()).d(this.a);
                if (objD != null || c.this.a) {
                    c.this.a((com.adsurge.adn.p020f0.e) entry.getValue(), objD);
                }
            }
            c.this.a = false;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class b implements g {
        public final /* synthetic */ i a;
        public final /* synthetic */ com.adsurge.adn.p035k0.c b;
        public final /* synthetic */ String c;

        public b(i iVar, com.adsurge.adn.p035k0.c cVar, String str) {
            this.a = iVar;
            this.b = cVar;
            this.c = str;
        }

        @Override // com.adsurge.adn.f0.c.g
        public void a(com.adsurge.adn.p035k0.c cVar) {
            c.this.a(cVar, new com.adsurge.adn.p020f0.b(this.a, this.b, this.c));
        }
    }

    /* JADX INFO: renamed from: com.adsurge.adn.f0.c$c, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class C0110c implements g {
        public final /* synthetic */ i a;
        public final /* synthetic */ com.adsurge.adn.p035k0.c b;
        public final /* synthetic */ com.adsurge.adn.p044n0.c c;
        public final /* synthetic */ String d;

        public C0110c(i iVar, com.adsurge.adn.p035k0.c cVar, com.adsurge.adn.p044n0.c cVar2, String str) {
            this.a = iVar;
            this.b = cVar;
            this.c = cVar2;
            this.d = str;
        }

        @Override // com.adsurge.adn.f0.c.g
        public void a(com.adsurge.adn.p035k0.c cVar) {
            c.this.a(cVar, new com.adsurge.adn.p020f0.f(this.a, this.b, new com.adsurge.adn.f0.f.a(this.c, this.d)));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class d implements g {
        public final /* synthetic */ i a;
        public final /* synthetic */ com.adsurge.adn.p035k0.c b;
        public final /* synthetic */ com.adsurge.adn.p023g0.a c;
        public final /* synthetic */ String d;

        public d(i iVar, com.adsurge.adn.p035k0.c cVar, com.adsurge.adn.p023g0.a aVar, String str) {
            this.a = iVar;
            this.b = cVar;
            this.c = aVar;
            this.d = str;
        }

        @Override // com.adsurge.adn.f0.c.g
        public void a(com.adsurge.adn.p035k0.c cVar) {
            c.this.a(cVar, new h(this.a, this.b, new h.a(this.c, this.d)));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class e implements g {
        public final /* synthetic */ i a;
        public final /* synthetic */ com.adsurge.adn.p035k0.c b;
        public final /* synthetic */ com.adsurge.adn.p026h0.a c;

        public e(i iVar, com.adsurge.adn.p035k0.c cVar, com.adsurge.adn.p026h0.a aVar) {
            this.a = iVar;
            this.b = cVar;
            this.c = aVar;
        }

        @Override // com.adsurge.adn.f0.c.g
        public void a(com.adsurge.adn.p035k0.c cVar) {
            c.this.a(cVar, new com.adsurge.adn.p020f0.a(this.a, this.b, this.c));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class f implements g {
        public f() {
        }

        @Override // com.adsurge.adn.f0.c.g
        public void a(com.adsurge.adn.p035k0.c cVar) {
            c.this.b(cVar);
            com.adsurge.adn.J0.a.a(c.d, "-------------addEmptyObserver------------- \n Key: %s, observer =  %s", cVar.d(), null);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public interface g {
        void a(com.adsurge.adn.p035k0.c cVar);
    }

    static {
        d = com.adsurge.adn.J0.a.a ? "DataBus" : "c";
        e = null;
    }

    public static boolean c() {
        if (com.adsurge.adn.J0.a.a && e == null) {
            defpackage.d.w("sEnable is null");
            return false;
        }
        Boolean bool = e;
        return bool != null && bool.booleanValue();
    }

    public static boolean d() {
        return e != null;
    }

    public final void a(com.adsurge.adn.p020f0.e eVar, Object obj) {
        Object obj2 = eVar.b;
        if (obj2 == null || !obj2.equals(obj)) {
            eVar.b = obj;
            Iterator it = eVar.a.iterator();
            while (it.hasNext()) {
                ((com.adsurge.adn.p020f0.d) it.next()).a(this);
            }
        }
    }

    public final void b(l lVar) {
        Map map = lVar.e;
        if (map != null) {
            Iterator it = map.entrySet().iterator();
            while (it.hasNext()) {
                c((com.adsurge.adn.p035k0.c) ((Map.Entry) it.next()).getValue());
            }
        }
        com.adsurge.adn.p026h0.e[] eVarArr = lVar.f;
        if (eVarArr != null) {
            for (com.adsurge.adn.p026h0.e eVar : eVarArr) {
                Map map2 = eVar.e;
                if (map2 != null) {
                    Iterator it2 = map2.entrySet().iterator();
                    while (it2.hasNext()) {
                        c((com.adsurge.adn.p035k0.c) ((Map.Entry) it2.next()).getValue());
                    }
                }
            }
        }
        com.adsurge.adn.p026h0.i[] iVarArr = lVar.g;
        if (iVarArr != null) {
            for (com.adsurge.adn.p026h0.i iVar : iVarArr) {
                Map map3 = iVar.d;
                if (map3 != null) {
                    Iterator it3 = map3.entrySet().iterator();
                    while (it3.hasNext()) {
                        c((com.adsurge.adn.p035k0.c) ((Map.Entry) it3.next()).getValue());
                    }
                }
            }
        }
        com.adsurge.adn.p026h0.a[] aVarArr = lVar.h;
        if (aVarArr != null) {
            for (com.adsurge.adn.p026h0.a aVar : aVarArr) {
                if (aVar.c() != null) {
                    c(m.b((Object) aVar.c()));
                }
            }
        }
    }

    public final void c(com.adsurge.adn.p035k0.c cVar) {
        if (cVar == null) {
            return;
        }
        a(cVar, new f());
    }

    public void a(JSONObject jSONObject) {
        if (!this.b || jSONObject == null || this.c.isEmpty()) {
            return;
        }
        com.adsurge.adn.I0.g.c(new a(jSONObject));
    }

    public static void a(boolean z) {
        if (e != null) {
            return;
        }
        e = Boolean.valueOf(z);
    }

    public void a(i iVar, com.adsurge.adn.p035k0.c cVar, String str) {
        a(cVar, new b(iVar, cVar, str));
    }

    public void a(i iVar, com.adsurge.adn.p035k0.c cVar, com.adsurge.adn.p044n0.c cVar2, String str) {
        a(cVar, new C0110c(iVar, cVar, cVar2, str));
    }

    public void a(i iVar, com.adsurge.adn.p035k0.c cVar, com.adsurge.adn.p023g0.a aVar, String str) {
        a(cVar, new d(iVar, cVar, aVar, str));
    }

    public void a(i iVar, com.adsurge.adn.p035k0.c cVar, com.adsurge.adn.p026h0.a aVar) {
        a(cVar, new e(iVar, cVar, aVar));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(com.adsurge.adn.p035k0.c cVar, g gVar) {
        if (cVar instanceof com.adsurge.adn.p035k0.g) {
            Iterator it = ((com.adsurge.adn.p035k0.g) cVar).b().iterator();
            while (it.hasNext()) {
                gVar.a((com.adsurge.adn.p035k0.c) it.next());
            }
            return;
        }
        gVar.a(cVar);
    }

    public final void a(com.adsurge.adn.p035k0.c cVar, com.adsurge.adn.p020f0.d dVar) {
        com.adsurge.adn.p020f0.e eVarB = b(cVar);
        eVarB.a.add(dVar);
        com.adsurge.adn.J0.a.a(d, "-------------addObserver------------- \n Key: %s, observer =  %s", cVar.d(), dVar);
        if (eVarB.b != null) {
            dVar.a(this);
        }
    }

    public void a() {
        this.b = true;
    }

    @Override // com.adsurge.adn.p020f0.g
    public Object a(com.adsurge.adn.p035k0.c cVar) {
        com.adsurge.adn.p020f0.e eVar = (com.adsurge.adn.p020f0.e) this.c.get(cVar);
        if (eVar == null) {
            return null;
        }
        return eVar.b;
    }

    public void a(l lVar) {
        if (lVar == null) {
            return;
        }
        b(lVar);
        l[] lVarArr = lVar.b;
        if (lVarArr != null) {
            for (l lVar2 : lVarArr) {
                a(lVar2);
            }
        }
    }

    public void b() {
        Iterator it = this.c.entrySet().iterator();
        while (it.hasNext()) {
            ((com.adsurge.adn.p020f0.e) ((Map.Entry) it.next()).getValue()).a();
        }
        this.a = true;
        this.b = false;
    }

    public final com.adsurge.adn.p020f0.e b(com.adsurge.adn.p035k0.c cVar) {
        com.adsurge.adn.p020f0.e eVar = (com.adsurge.adn.p020f0.e) this.c.get(cVar);
        if (eVar != null) {
            return eVar;
        }
        com.adsurge.adn.p020f0.e eVar2 = new com.adsurge.adn.p020f0.e();
        this.c.put(cVar, eVar2);
        return eVar2;
    }
}
