package com.adsurge.adn.p064w0;

import android.graphics.Color;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.adsurge.adn.p014d0.h;
import com.adsurge.adn.p014d0.j;
import com.adsurge.adn.p020f0.c;
import com.adsurge.adn.p026h0.k;
import com.adsurge.adn.p038l0.f;
import com.adsurge.adn.p038l0.i;
import com.adsurge.adn.p060u0.e;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public class d implements com.adsurge.adn.p064w0.b, i.f {
    public i b;
    public com.adsurge.adn.p011c0.a c;
    public View d;
    public c e;
    public String f;
    public k k;
    public boolean g = true;
    public int h = 0;
    public final Map i = new HashMap();
    public final h a = new h();
    public final c j = new c();

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class a implements Runnable {
        public final /* synthetic */ View a;
        public final /* synthetic */ FrameLayout b;

        public a(View view, FrameLayout frameLayout) {
            this.a = view;
            this.b = frameLayout;
        }

        @Override // java.lang.Runnable
        public void run() {
            FrameLayout frameLayout;
            View view = this.a;
            if (view == null || (frameLayout = this.b) == null || frameLayout.indexOfChild(view) >= 0) {
                return;
            }
            this.a.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            this.b.addView(this.a);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class b implements View.OnAttachStateChangeListener {
        public b() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            d dVar = d.this;
            if (dVar.c == null) {
                return;
            }
            dVar.l();
            d dVar2 = d.this;
            if (!dVar2.g) {
                dVar2.a.c();
            } else {
                dVar2.g = false;
                dVar2.c(com.adsurge.adn.p026h0.a.q);
            }
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            d dVar = d.this;
            if (dVar.c == null) {
                return;
            }
            dVar.m();
            d.this.a.b();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.adsurge.adn.p064w0.b
    public void a(com.adsurge.adn.p011c0.a aVar) {
        if (aVar == null) {
            return;
        }
        this.c = aVar;
        i iVar = this.b;
        if (iVar == null) {
            return;
        }
        iVar.J();
        this.a.a();
        View viewC = this.b.C();
        if (viewC != 0) {
            if (viewC instanceof f) {
                ((f) viewC).setPerfCollector(new com.adsurge.adn.p050p0.b(viewC, this.c.b()));
            }
            ViewGroup.LayoutParams eVar = new e(this.b.y());
            com.adsurge.adn.p011c0.a aVar2 = this.c;
            String strD = aVar2 != null ? aVar2.d() : "";
            if (TextUtils.isEmpty(strD)) {
                viewC.setLayoutParams(eVar);
                this.d = viewC;
            } else {
                View view = new View(viewC.getContext());
                view.setBackgroundColor(Color.parseColor(strD));
                view.setTag(2131755013, "gdtdmmt");
                FrameLayout frameLayout = new FrameLayout(viewC.getContext());
                frameLayout.setLayoutParams(eVar);
                frameLayout.addView(viewC);
                frameLayout.post(new a(view, frameLayout));
                this.d = frameLayout;
            }
            this.d.addOnAttachStateChangeListener(new b());
        }
        this.j.a();
    }

    @Override // com.adsurge.adn.p064w0.b
    public void c() {
        if (this.h == 2) {
            i iVar = this.b;
            if (iVar != null) {
                iVar.c();
            }
            m();
            this.a.a(true);
            this.g = true;
            this.d = null;
            c cVar = this.e;
            if (cVar != null) {
                cVar.a(null);
                this.e = null;
            }
            this.j.b();
            this.h = 1;
        }
    }

    @Override // com.adsurge.adn.p064w0.b
    public com.adsurge.adn.p011c0.a d() {
        return this.c;
    }

    @Override // com.adsurge.adn.p064w0.b
    public int e() {
        com.adsurge.adn.p050p0.d dVarX;
        i iVar = this.b;
        if (iVar == null || (dVarX = iVar.x()) == null) {
            return 0;
        }
        return dVarX.c();
    }

    @Override // com.adsurge.adn.p064w0.b
    public String f() {
        String str = this.f;
        return str == null ? "" : str;
    }

    @Override // com.adsurge.adn.p064w0.b
    public int g() {
        com.adsurge.adn.p050p0.d dVarX;
        i iVar = this.b;
        if (iVar == null || (dVarX = iVar.x()) == null) {
            return 0;
        }
        return dVarX.b();
    }

    @Override // com.adsurge.adn.p064w0.b
    public View h() {
        return this.d;
    }

    @Override // com.adsurge.adn.p064w0.b
    public i i() {
        return this.b;
    }

    @Override // com.adsurge.adn.p064w0.b
    public c j() {
        return this.j;
    }

    public k k() {
        return this.k;
    }

    public final void l() {
        com.adsurge.adn.p011c0.a aVar = this.c;
        if (aVar == null) {
            return;
        }
        aVar.h();
        this.c.j();
    }

    public final void m() {
        com.adsurge.adn.p011c0.a aVar = this.c;
        if (aVar == null) {
            return;
        }
        aVar.h();
        this.c.j();
    }

    public void b(String str, com.adsurge.adn.p014d0.b bVar) {
        j jVarA = a(str);
        if (jVarA == null) {
            return;
        }
        jVarA.a(bVar);
    }

    @Override // com.adsurge.adn.p064w0.b
    public void b(String str) {
        this.f = str;
        com.adsurge.adn.K0.a.a(str, this);
    }

    @Override // com.adsurge.adn.p064w0.b
    public int b() {
        return this.h;
    }

    public void c(String str) {
        b(str, null);
    }

    @Override // com.adsurge.adn.p064w0.b
    public void a(i iVar) {
        this.b = iVar;
    }

    @Override // com.adsurge.adn.l0.i.f
    public void a(i iVar, com.adsurge.adn.p023g0.a aVar) {
    }

    @Override // com.adsurge.adn.p064w0.b
    public void a(JSONObject jSONObject) {
        if (c.c()) {
            this.j.a(jSONObject);
            return;
        }
        i iVar = this.b;
        if (iVar != null) {
            iVar.c(jSONObject);
        }
    }

    @Override // com.adsurge.adn.p064w0.b
    public void a(com.adsurge.adn.p038l0.d dVar) {
        if (this.b == null) {
            return;
        }
        if (this.e == null) {
            c cVar = new c(this);
            this.e = cVar;
            this.b.a(cVar);
        }
        this.e.a(dVar);
    }

    @Override // com.adsurge.adn.p064w0.b
    public j a(String str) {
        return this.a.a(str);
    }

    public void a(i iVar, String str, JSONObject jSONObject, JSONObject jSONObject2) {
        if (!TextUtils.isEmpty(str)) {
            c(str);
        }
        if (jSONObject != null && jSONObject.length() > 0) {
            a(jSONObject);
        }
        if (jSONObject2 == null || jSONObject2.length() <= 0) {
            return;
        }
        if (c.c()) {
            a(jSONObject2);
        } else {
            iVar.c(jSONObject2);
        }
    }

    @Override // com.adsurge.adn.p064w0.a
    public void a(String str, JSONObject jSONObject) {
        i iVar = this.b;
        if (iVar != null) {
            iVar.a(str, jSONObject);
        }
    }

    @Override // com.adsurge.adn.p064w0.b
    public h a() {
        return this.a;
    }

    @Override // com.adsurge.adn.p064w0.b
    public void a(String str, com.adsurge.adn.p068y0.a aVar) {
        if (aVar == null || TextUtils.isEmpty(str)) {
            return;
        }
        this.i.put(str, aVar);
    }

    @Override // com.adsurge.adn.p064w0.b
    public void a(String str, com.adsurge.adn.p014d0.b bVar) {
        com.adsurge.adn.p068y0.a aVar = (com.adsurge.adn.p068y0.a) this.i.get(str);
        if (aVar == null) {
            return;
        }
        aVar.a(bVar);
    }

    @Override // com.adsurge.adn.p064w0.b
    public void a(int i) {
        this.h = i;
    }

    public void a(k kVar) {
        this.k = kVar;
    }
}
