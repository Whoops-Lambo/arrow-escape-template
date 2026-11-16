package com.adsurge.adn.p038l0;

import android.graphics.Rect;
import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import com.adsurge.adn.p026h0.l;
import com.adsurge.adn.p035k0.h;
import com.adsurge.adn.p035k0.k;
import com.adsurge.adn.p035k0.m;
import com.adsurge.adn.p035k0.o;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public abstract class i implements com.adsurge.adn.p064w0.a {
    public String B;
    public com.adsurge.adn.p026h0.c C;
    public com.adsurge.adn.p026h0.c D;
    public Map a;
    public Map b;
    public Map e;
    public com.adsurge.adn.p050p0.d f;
    public com.adsurge.adn.p064w0.b l;
    public com.adsurge.adn.p050p0.a m;
    public com.adsurge.adn.p060u0.d n;
    public com.adsurge.adn.p026h0.a[] p;
    public com.adsurge.adn.p044n0.f q;
    public d s;
    public f t;
    public int u;
    public List v;
    public com.adsurge.adn.p023g0.c x;
    public View y;
    public String z;
    public int h = -1;
    public int i = 0;
    public boolean j = false;
    public int k = -1;
    public com.adsurge.adn.p038l0.c o = new com.adsurge.adn.p038l0.c();
    public List w = Collections.EMPTY_LIST;
    public boolean A = false;
    public final Map c = new HashMap();
    public final List d = new ArrayList(2);
    public final com.adsurge.adn.p041m0.b r = new com.adsurge.adn.p041m0.b();
    public final com.adsurge.adn.p038l0.g g = new com.adsurge.adn.p038l0.g(this);

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class a implements o.d {
        public a() {
        }

        @Override // com.adsurge.adn.k0.o.d
        public void a(Object[] objArr) {
            if (i.this.r.a(objArr)) {
                i.this.p();
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class b implements o.c {
        public b() {
        }

        @Override // com.adsurge.adn.k0.o.c
        public void a(int i) {
            if (i.this.r.a(i)) {
                i.this.p();
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class c implements o.c {
        public c() {
        }

        @Override // com.adsurge.adn.k0.o.c
        public void a(int i) {
            if (i.this.r.b(i)) {
                i.this.p();
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public interface d extends com.adsurge.adn.p038l0.d {
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public interface e {
        i a();
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public interface f {
        void a(i iVar, com.adsurge.adn.p023g0.a aVar);
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public interface g {
        void a(i iVar, int i, int i2);
    }

    public abstract View b(com.adsurge.adn.p011c0.a aVar);

    public abstract com.adsurge.adn.p050p0.d q();

    public int A() {
        com.adsurge.adn.p050p0.d dVar = this.f;
        if (dVar != null) {
            return dVar.d();
        }
        return -1;
    }

    public int B() {
        com.adsurge.adn.p050p0.d dVar = this.f;
        if (dVar != null) {
            return dVar.e();
        }
        return -1;
    }

    public View C() {
        return this.y;
    }

    public com.adsurge.adn.p038l0.c D() {
        return this.o;
    }

    public final com.adsurge.adn.p050p0.a E() {
        return this.m;
    }

    public com.adsurge.adn.p064w0.b F() {
        return this.l;
    }

    public final int G() {
        return this.i;
    }

    public final void I() {
        if (com.adsurge.adn.J0.a.a) {
            this.y.setTag(2131755014, this.z);
        }
    }

    public void J() {
        this.l.a().a(this.p, this);
        com.adsurge.adn.p038l0.g gVar = this.g;
        if (gVar != null) {
            gVar.d();
        }
        if (com.adsurge.adn.p020f0.c.c()) {
            m();
        }
    }

    public boolean M() {
        return this.g.e();
    }

    public final boolean N() {
        return this.i == 0;
    }

    public void O() {
        com.adsurge.adn.p050p0.d dVar = this.f;
        if (dVar != null) {
            dVar.g();
        }
    }

    public final boolean a(String str, h hVar, int i, int i2) {
        str.getClass();
        switch (str) {
            case "15":
                k(hVar.e(new JSONObject[0]));
                return true;
            case "16":
                f(o.b(hVar));
                return true;
            case "17":
                a(hVar.a(new JSONObject[0]));
                return true;
            case "18":
                h(hVar.b(new JSONObject[0]).a(new com.adsurge.adn.p038l0.b(i, i2, F().e(), F().g())));
                return true;
            case "19":
                b(hVar);
                return true;
            case "20":
                a(o.a(hVar, new com.adsurge.adn.p038l0.b(i, i2, F().e(), F().g())));
                return true;
            case "26":
                b(hVar.e(new JSONObject[0]));
                return true;
            case "37":
                a(hVar);
                return true;
            case "40":
                d(hVar.b(new JSONObject[0]).a(new com.adsurge.adn.p038l0.b(i, i2, F().e(), F().g())));
                return true;
            case "41":
                e(hVar.b(new JSONObject[0]).a(new com.adsurge.adn.p038l0.b(i, i2, F().e(), F().g())));
                return true;
            case "42":
                b(hVar.a(new JSONObject[0]));
                return true;
            case "45":
                this.u = hVar.e(new JSONObject[0]);
                View viewC = C();
                if (com.adsurge.adn.J0.a.a && this.u > 0 && viewC != null) {
                    viewC.setContentDescription(hVar.toString());
                    try {
                        viewC.setId(((Integer) Class.forName("com.qq.e.union.demo.R$id").getField("union_" + this.u).get(null)).intValue());
                    } catch (Exception e2) {
                        e2.printStackTrace();
                    }
                    break;
                }
                return true;
            case "47":
                c(hVar.toString());
                return true;
            case "48":
                Pair pairF = o.f(hVar);
                if (pairF != null) {
                    b((Float) pairF.first, (Float) pairF.second);
                }
                return true;
            case "49":
                Pair pairE = o.e(hVar);
                if (pairE != null) {
                    a((Float) pairE.first, (Float) pairE.second);
                }
                return true;
            case "65":
                c(hVar.a(new JSONObject[0]));
                return true;
            case "66":
                d(hVar.a(new JSONObject[0]));
                return true;
            case "67":
                b(o.b(hVar, new com.adsurge.adn.p038l0.b(i, i2, F().e(), F().g())));
                return true;
            case "81":
                int[] iArrD = o.d(hVar);
                if (iArrD != null) {
                    this.f.b(iArrD);
                }
                return true;
            case "82":
                int[] iArrD2 = o.d(hVar);
                if (iArrD2 != null) {
                    this.f.a(iArrD2);
                }
                return true;
            case "viewTag":
                View viewC2 = C();
                if (viewC2 != null) {
                    viewC2.setTag(hVar.toString());
                }
                return true;
            default:
                return false;
        }
    }

    public final void b(JSONObject jSONObject) {
        Object objD;
        Map map = this.e;
        if (map == null || map.size() <= 0) {
            return;
        }
        Iterator it = this.e.entrySet().iterator();
        while (it.hasNext()) {
            com.adsurge.adn.p035k0.d dVar = (com.adsurge.adn.p035k0.d) ((Map.Entry) it.next()).getValue();
            if (dVar != null && (objD = dVar.a().d(jSONObject)) != null) {
                try {
                    dVar.a(new JSONArray(objD.toString()));
                } catch (Throwable unused) {
                }
            }
        }
    }

    public void c(JSONObject jSONObject) {
        if (jSONObject == null || jSONObject.length() <= 0 || this.g.a(jSONObject) || !M()) {
            return;
        }
        Iterator it = this.d.iterator();
        while (it.hasNext()) {
            ((com.adsurge.adn.p044n0.c) it.next()).a(jSONObject);
        }
        Iterator it2 = this.w.iterator();
        while (it2.hasNext()) {
            ((com.adsurge.adn.p023g0.a) it2.next()).a(jSONObject);
        }
        b(jSONObject);
        Map map = this.a;
        if (map == null || map.size() == 0) {
            return;
        }
        boolean z = false;
        boolean z2 = this.c.size() == 0;
        for (Map.Entry entry : this.a.entrySet()) {
            Object objD = ((com.adsurge.adn.p035k0.c) entry.getValue()).d(jSONObject);
            if (objD != null) {
                k kVarC = m.c(objD);
                String str = (String) entry.getKey();
                if (z2 || !kVarC.equals(this.c.get(str))) {
                    this.c.put(str, kVarC);
                    b(str, kVarC);
                    z = true;
                }
            }
        }
        if (z) {
            O();
        }
    }

    public final void d(l lVar) {
        com.adsurge.adn.p026h0.e[] eVarArr = lVar.f;
        if (eVarArr == null) {
            return;
        }
        if (!this.d.isEmpty()) {
            this.d.clear();
        }
        for (com.adsurge.adn.p026h0.e eVar : eVarArr) {
            this.d.add(new com.adsurge.adn.p044n0.c(eVar));
        }
        Iterator it = this.d.iterator();
        while (it.hasNext()) {
            ((com.adsurge.adn.p044n0.c) it.next()).a(this.l, this);
        }
    }

    public final void e(l lVar) {
        Map map;
        if (lVar == null || (map = lVar.c) == null || map.isEmpty()) {
            return;
        }
        for (Map.Entry entry : lVar.c.entrySet()) {
            b((String) entry.getKey(), (h) entry.getValue());
        }
    }

    public void f(int i) {
        if (this.r.a(i)) {
            L();
        }
    }

    public void g(int i) {
        if (this.r.b(i)) {
            L();
        }
    }

    public void h(int i) {
        if (this.r.c(i)) {
            p();
        }
    }

    public final void i(int i) {
        com.adsurge.adn.p050p0.d dVar = this.f;
        if (dVar != null) {
            dVar.a(i);
        }
    }

    public void j(int i) {
        this.k = i;
    }

    public void k(int i) {
        View viewC;
        this.i = i;
        if (this.j || (viewC = C()) == null) {
            return;
        }
        int i2 = this.i;
        if (i2 == 1) {
            if (viewC.getVisibility() != 4) {
                viewC.setVisibility(4);
            }
        } else if (i2 != 2) {
            if (viewC.getVisibility() != 0) {
                viewC.setVisibility(0);
            }
        } else if (viewC.getVisibility() != 8) {
            viewC.setVisibility(8);
        }
    }

    public void l() {
        Map map = this.b;
        if (map == null || map.size() <= 0) {
            return;
        }
        for (Map.Entry entry : this.b.entrySet()) {
            b((String) entry.getKey(), (h) entry.getValue());
        }
    }

    public void m() {
        if (this.c.isEmpty()) {
            return;
        }
        for (Map.Entry entry : this.c.entrySet()) {
            b((String) entry.getKey(), (h) entry.getValue());
        }
        O();
    }

    public com.adsurge.adn.p026h0.c r() {
        return this.D;
    }

    public com.adsurge.adn.p026h0.c s() {
        return this.C;
    }

    public int t() {
        return this.u;
    }

    public com.adsurge.adn.p041m0.d u() {
        return this.r;
    }

    public List v() {
        return this.d;
    }

    public int w() {
        return this.k;
    }

    public com.adsurge.adn.p050p0.d x() {
        return this.f;
    }

    public com.adsurge.adn.p060u0.d y() {
        return this.n;
    }

    public com.adsurge.adn.p038l0.g z() {
        return this.g;
    }

    public Rect H() {
        View viewC = C();
        if (viewC == null || !viewC.isShown()) {
            return null;
        }
        Rect rect = new Rect();
        if (!viewC.getGlobalVisibleRect(rect)) {
            return null;
        }
        int[] iArr = new int[2];
        viewC.getLocationOnScreen(iArr);
        int[] iArr2 = new int[2];
        viewC.getLocationInWindow(iArr2);
        int i = iArr[0] - iArr2[0];
        if (i != 0) {
            rect.right += i;
            rect.left += i;
        }
        int i2 = iArr[1] - iArr2[1];
        if (i2 != 0) {
            rect.bottom += i2;
            rect.top += i2;
        }
        return rect;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void K() {
        View viewB = b(d());
        this.y = viewB;
        ((com.adsurge.adn.p038l0.e) viewB).setViewNode(this);
        com.adsurge.adn.K0.a.b(this);
        I();
        this.f = q();
        this.n = a(this.y);
        this.g.b(true);
    }

    public final void L() {
        View viewC = C();
        if (viewC == null) {
            return;
        }
        viewC.invalidate();
    }

    public void n() {
        if (M() && this.s != null && this.q == null && this.d.size() > 0) {
            com.adsurge.adn.p044n0.f fVar = new com.adsurge.adn.p044n0.f(this, this.s);
            this.q = fVar;
            fVar.a(this.d);
        }
    }

    public final void o() {
        List list;
        if (M() && this.t != null && this.x == null && (list = this.w) != null && list.size() > 0) {
            this.x = new com.adsurge.adn.p023g0.c(this, this.t);
            if (this.m.M()) {
                this.x.a(this.w);
            }
        }
    }

    public final void p() {
        View viewC = C();
        if (viewC != null && viewC.willNotDraw()) {
            viewC.setWillNotDraw(false);
        }
        L();
    }

    public final void l(int i) {
        com.adsurge.adn.p050p0.d dVar = this.f;
        if (dVar != null) {
            dVar.b(i);
        }
    }

    public final void e(int i) {
        View viewC = C();
        if (viewC == null) {
            return;
        }
        viewC.setPivotY(i);
    }

    public final void k() {
        View view;
        if (this.A || (view = this.y) == null) {
            return;
        }
        this.A = true;
        float cameraDistance = view.getCameraDistance();
        if (cameraDistance <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            cameraDistance = 1920.0f;
        }
        this.y.setCameraDistance(cameraDistance * 2.56576f);
    }

    public final com.adsurge.adn.p011c0.a d() {
        com.adsurge.adn.p064w0.b bVar = this.l;
        if (bVar == null) {
            return null;
        }
        return bVar.d();
    }

    public final void d(int i) {
        View viewC = C();
        if (viewC == null) {
            return;
        }
        viewC.setPivotX(i);
    }

    public final void d(float f2) {
        View viewC = C();
        if (viewC == null) {
            return;
        }
        k();
        viewC.setRotationY(f2);
    }

    public void b(l lVar) {
        this.z = lVar.o;
        this.B = lVar.a;
        this.g.a(lVar);
        d(lVar);
        a(lVar.g);
        c(lVar);
        this.b = lVar.d;
        this.p = lVar.h;
    }

    public void b(int[] iArr) {
        if (this.r.b(iArr)) {
            p();
        }
    }

    public void b(h hVar) {
        o.a(hVar, d().e(), new c());
    }

    public final void b(int i) {
        com.adsurge.adn.p011c0.a aVarD;
        com.adsurge.adn.p011c0.f fVarF;
        View viewC = C();
        if (viewC == null || (aVarD = d()) == null || (fVarF = aVarD.f()) == null) {
            return;
        }
        fVarF.a(viewC, i);
    }

    public final void b(float f2) {
        View viewC = C();
        if (viewC == null) {
            return;
        }
        viewC.setRotation(f2);
    }

    public final void b(Float f2, Float f3) {
        View viewC = C();
        if (viewC == null) {
            return;
        }
        if (f2 != null) {
            viewC.setTranslationX(f2.floatValue());
        }
        if (f3 != null) {
            viewC.setTranslationY(f3.floatValue());
        }
    }

    public final boolean b(String str, h hVar) {
        return a(str, hVar) || this.n.a(str, hVar) || this.o.a(str, hVar);
    }

    public void b(com.adsurge.adn.p026h0.c cVar) {
        this.C = cVar;
    }

    public JSONArray b(com.adsurge.adn.p026h0.a aVar) {
        JSONArray jSONArrayB;
        if (aVar == null) {
            return null;
        }
        com.adsurge.adn.p035k0.d dVar = (com.adsurge.adn.p035k0.d) this.e.get(aVar);
        return (dVar == null || (jSONArrayB = dVar.b()) == null) ? aVar.c : jSONArrayB;
    }

    public void c(l lVar) {
        Map map = lVar.e;
        int size = map == null ? 0 : map.size();
        if (size > 0) {
            this.a = new HashMap(size);
            for (Map.Entry entry : lVar.e.entrySet()) {
                String str = (String) entry.getKey();
                com.adsurge.adn.p035k0.c cVar = (com.adsurge.adn.p035k0.c) ((com.adsurge.adn.p035k0.c) entry.getValue()).a();
                this.a.put(str, cVar);
                if (com.adsurge.adn.p020f0.c.c()) {
                    this.l.j().a(this, cVar, str);
                }
            }
        }
    }

    public void c(String str) {
        com.adsurge.adn.p011c0.a aVarD = d();
        if (TextUtils.isEmpty(str) || aVarD == null) {
            return;
        }
        o.a(m.c((Object) str), aVarD.e(), new b());
    }

    public final void c(float f2) {
        View viewC = C();
        if (viewC == null) {
            return;
        }
        k();
        viewC.setRotationX(f2);
    }

    public final int c(int i) {
        int i2;
        if (i == 8 || (i2 = this.i) == 2) {
            return 2;
        }
        if (i == 4) {
            i2 = 1;
        }
        do {
            this = this.E();
            if (this == null) {
                break;
            }
            int iG = this.G();
            if (iG > i2) {
                i2 = iG;
            }
        } while (i2 != 2);
        return i2;
    }

    public void c() {
        this.g.a();
        this.y = null;
        this.f = null;
        this.c.clear();
        this.o = new com.adsurge.adn.p038l0.c();
        this.s = null;
        this.q = null;
        List list = this.d;
        int size = list == null ? 0 : list.size();
        for (int i = 0; i < size; i++) {
            com.adsurge.adn.p044n0.c cVar = (com.adsurge.adn.p044n0.c) this.d.get(i);
            if (cVar != null) {
                cVar.b();
            }
        }
        this.t = null;
        this.x = null;
        this.v = null;
        Map map = this.a;
        if (map == null || map.size() <= 0) {
            return;
        }
        Iterator it = this.a.entrySet().iterator();
        while (it.hasNext()) {
            ((com.adsurge.adn.p035k0.c) ((Map.Entry) it.next()).getValue()).c();
        }
    }

    @Override // com.adsurge.adn.p064w0.a
    public void a(String str, JSONObject jSONObject) {
    }

    public com.adsurge.adn.p060u0.d a(View view) {
        com.adsurge.adn.p050p0.a aVar = this.m;
        if (aVar != null) {
            return aVar.x().a(this.y);
        }
        return this.f.a(this.y);
    }

    public void a(com.adsurge.adn.p041m0.d dVar) {
        if (dVar == null) {
            return;
        }
        this.r.a(dVar);
    }

    public final void a(h hVar) {
        o.a(hVar, d().e(), new a());
    }

    public void a(Object[] objArr) {
        if (this.r.a(objArr)) {
            p();
        }
    }

    public void a(int[] iArr) {
        if (this.r.a(iArr)) {
            p();
        }
    }

    public void a(com.adsurge.adn.p064w0.b bVar) {
        this.l = bVar;
    }

    public final void a(com.adsurge.adn.p050p0.a aVar) {
        if (aVar == null) {
            return;
        }
        this.m = aVar;
        this.g.a(aVar);
    }

    public void a(l lVar) {
        if (lVar == null) {
            return;
        }
        this.f.b(lVar.j);
        this.f.a(lVar.k);
        e(lVar);
        if (this.c.size() == 0) {
            O();
        }
    }

    public final void a(com.adsurge.adn.p026h0.i[] iVarArr) {
        if (iVarArr == null) {
            return;
        }
        this.w = new ArrayList(iVarArr.length);
        for (com.adsurge.adn.p026h0.i iVar : iVarArr) {
            this.w.add(new com.adsurge.adn.p023g0.a(iVar));
        }
        Iterator it = this.w.iterator();
        while (it.hasNext()) {
            ((com.adsurge.adn.p023g0.a) it.next()).a(this.l, this);
        }
    }

    public void a(String str, Object obj) {
        if (obj == null) {
            return;
        }
        k kVarC = m.c(obj);
        if (kVarC.equals(this.c.get(str))) {
            return;
        }
        this.c.put(str, kVarC);
        if (!this.g.a(str, kVarC) && M()) {
            b(str, kVarC);
            O();
        }
    }

    public void a(boolean z) {
        this.j = z;
        if (z) {
            View viewC = C();
            if (viewC == null || viewC.getVisibility() == 8) {
                return;
            }
            viewC.setVisibility(8);
            return;
        }
        k(this.i);
    }

    public final void a(float f2) {
        View viewC = C();
        if (viewC == null) {
            return;
        }
        viewC.setAlpha(f2);
    }

    public final void a(Float f2, Float f3) {
        View viewC = C();
        if (viewC == null) {
            return;
        }
        if (f2 != null) {
            viewC.setScaleX(f2.floatValue());
        }
        if (f3 != null) {
            viewC.setScaleY(f3.floatValue());
        }
    }

    public boolean a(String str, h hVar) {
        return a(str, hVar, this.n.m(), this.n.j());
    }

    public void a(h hVar) {
    }

    public final void a(View view, int i) {
        int iC;
        List list = this.v;
        if (list == null || list.size() <= 0 || (iC = c(i)) == this.h) {
            return;
        }
        Iterator it = this.v.iterator();
        while (it.hasNext()) {
            ((g) it.next()).a(this, this.h, iC);
        }
        this.h = iC;
    }

    public void a(g gVar) {
        if (gVar == null) {
            return;
        }
        if (this.v == null) {
            this.v = new ArrayList();
        }
        this.v.add(gVar);
    }

    public void a(com.adsurge.adn.p026h0.c cVar) {
        this.D = cVar;
    }

    public void a(d dVar) {
        this.s = dVar;
        n();
    }

    public void a(com.adsurge.adn.p026h0.a aVar) {
        if (this.e == null) {
            this.e = new ConcurrentHashMap();
        }
        com.adsurge.adn.p035k0.c cVarB = m.b((Object) aVar.c());
        if (cVarB != null) {
            this.e.put(aVar, new com.adsurge.adn.p035k0.d(cVarB));
            if (com.adsurge.adn.p020f0.c.c()) {
                this.l.j().a(this, cVarB, aVar);
            }
        }
    }
}
