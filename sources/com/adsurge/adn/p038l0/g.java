package com.adsurge.adn.p038l0;

import com.adsurge.adn.F0.b;
import com.adsurge.adn.I0.f;
import com.adsurge.adn.Y0.v;
import com.adsurge.adn.p026h0.l;
import com.adsurge.adn.p035k0.c;
import com.adsurge.adn.p035k0.k;
import com.adsurge.adn.p050p0.a;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public class g {
    public static final String i;
    public static boolean j;
    public final i a;
    public l b;
    public JSONObject c;
    public int d = 0;
    public int e = 0;
    public boolean f = false;
    public c g;
    public a h;

    static {
        i = com.adsurge.adn.J0.a.a ? "LazyModule" : "g";
        j = b.b().a("dllm", 1) == 0;
    }

    public boolean a(JSONObject jSONObject) {
        if (this.d != 1 || e()) {
            return false;
        }
        a aVar = this.h;
        if (aVar != null && aVar.M()) {
            Object objD = this.g.d(jSONObject);
            if ((objD instanceof Integer) && ((Integer) objD).intValue() != 2) {
                com.adsurge.adn.J0.a.a(i, "可见性变为可见，触发View的延迟加载,触发属性：" + this.g.d());
                a(this.c, false);
                this.a.c(this.c);
                this.h.b(this.a);
                return false;
            }
        }
        JSONObject jSONObject2 = this.c;
        if (jSONObject2 == null) {
            this.c = f.a(jSONObject);
        } else {
            try {
                this.c = f.a(jSONObject2, jSONObject);
            } catch (JSONException e) {
                com.adsurge.adn.J0.a.a(i, "Json merge error", e);
            }
        }
        return true;
    }

    public void b(boolean z) {
        this.f = z;
    }

    public final void c() {
        this.a.K();
        this.a.a(this.b);
        a aVar = this.h;
        if (aVar != null) {
            aVar.b(this.a);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0020, code lost:
    
        if (r0 == null) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void d() {
        /*
            r3 = this;
            boolean r0 = com.adsurge.adn.p038l0.g.j
            if (r0 != 0) goto L6a
            int r0 = r3.d
            r1 = 1
            if (r0 == r1) goto Le
            int r2 = r3.e
            if (r2 == r1) goto Le
            goto L6a
        Le:
            com.adsurge.adn.h0.l r2 = r3.b
            java.util.Map r2 = r2.e
            if (r0 != r1) goto L36
            if (r2 == 0) goto L22
            java.lang.String r0 = "15"
            java.lang.Object r0 = r2.get(r0)
            com.adsurge.adn.k0.c r0 = (com.adsurge.adn.p035k0.c) r0
            r3.g = r0
            if (r0 != 0) goto L36
        L22:
            boolean r0 = com.adsurge.adn.J0.a.a
            if (r0 != 0) goto L2d
            r3.c()
            r3.f()
            return
        L2d:
            java.lang.String r3 = "DSL懒加载节点未声明`visibility`属性"
            com.adsurge.adn.I0.m.d(r3)
            defpackage.d.r(r3)
            return
        L36:
            com.adsurge.adn.p0.a r0 = r3.h
            if (r0 == 0) goto L48
            int r2 = r3.e
            if (r2 != r1) goto L48
            boolean r0 = r0.M()
            if (r0 == 0) goto L48
            r3.c()
            return
        L48:
            int r0 = r3.d
            if (r0 != r1) goto L69
            com.adsurge.adn.k0.c r0 = r3.g
            if (r0 == 0) goto L69
            java.lang.String r0 = com.adsurge.adn.p038l0.g.i
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "暂不创建View，节点属性："
            r1.<init>(r2)
            com.adsurge.adn.k0.c r3 = r3.g
            java.lang.String r3 = r3.d()
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            com.adsurge.adn.J0.a.a(r0, r3)
        L69:
            return
        L6a:
            r3.c()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.adsurge.adn.p038l0.g.d():void");
    }

    public boolean e() {
        return this.f;
    }

    public final void f() {
        v.a(1190201, this.a.d().b(), 1);
    }

    public g(i iVar) {
        this.a = iVar;
    }

    public int b() {
        return this.d;
    }

    public void a(l lVar) {
        this.d = lVar.b();
        this.e = lVar.c();
        this.b = lVar;
    }

    public boolean a(String str, k kVar) {
        if (this.d != 1 || e()) {
            return false;
        }
        a aVar = this.h;
        if (aVar != null && aVar.M() && "15".equals(str) && kVar.e(new JSONObject[0]) != 2) {
            com.adsurge.adn.J0.a.a(i, "可见性变为可见，触发View的延迟加载,触发属性：" + this.g.d());
            a(false);
            this.h.b(this.a);
        }
        return true;
    }

    public final void a(boolean z) {
        if (this.f) {
            return;
        }
        if (z && this.d == 1) {
            return;
        }
        this.a.K();
        this.a.a(this.b);
        this.a.m();
        i iVar = this.a;
        if (iVar instanceof a) {
            Iterator it = ((a) iVar).R().iterator();
            while (it.hasNext()) {
                ((i) it.next()).z().a(true);
            }
        }
        if (z) {
            this.h.b(this.a);
        }
        this.a.n();
        this.a.o();
    }

    public final void a(JSONObject jSONObject, boolean z) {
        if (this.f) {
            return;
        }
        if (z && this.d == 1) {
            this.c = jSONObject;
            return;
        }
        this.a.K();
        this.a.a(this.b);
        i iVar = this.a;
        if (iVar instanceof a) {
            Iterator it = ((a) iVar).R().iterator();
            while (it.hasNext()) {
                ((i) it.next()).z().a(jSONObject, true);
            }
        }
        if (z) {
            this.h.b(this.a);
        }
        this.a.n();
        this.a.o();
    }

    public void a() {
        this.f = false;
        this.c = null;
    }

    public void a(a aVar) {
        this.h = aVar;
    }
}
