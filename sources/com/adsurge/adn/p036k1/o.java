package com.adsurge.adn.p036k1;

import android.os.SystemClock;
import android.view.View;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.adsurge.adn.C1.n;
import com.adsurge.adn.Q.g;
import com.adsurge.adn.lib.dysi.IGDTBiz;
import com.adsurge.adn.p014d0.j;
import com.adsurge.adn.p018e1.e;
import com.adsurge.adn.p018e1.f;
import com.adsurge.adn.p044n0.i;
import com.adsurge.adn.p048o1.d;
import com.adsurge.adn.x1.t;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public abstract class o implements f {
    public static final /* synthetic */ int p = 0;
    public final com.adsurge.adn.p064w0.b a;
    public final com.adsurge.adn.u1.c b;
    public final g c;
    public final com.adsurge.adn.Y0.c d;
    public u.b e;
    public d g;
    public List h;
    public List i;
    public p j;
    public Set k;
    public View.OnAttachStateChangeListener o;
    public boolean f = true;
    public final e l = new e();
    public boolean m = false;
    public boolean n = false;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class a implements u.c {
        public final /* synthetic */ u.c a;

        public a(u.c cVar) {
            this.a = cVar;
        }

        @Override // com.adsurge.adn.k1.u.c
        public void onPlayStateChange(n nVar, int i) {
            d dVar;
            IGDTBiz iGDTBizB;
            u.c cVar = this.a;
            if (cVar != null) {
                cVar.onPlayStateChange(nVar, i);
            }
            n nVar2 = n.ERROR;
            if ((nVar == nVar2 && o.this.n) || (dVar = o.this.g) == null || (iGDTBizB = dVar.b()) == null) {
                return;
            }
            iGDTBizB.onPlayStateChange(nVar, i);
            if (nVar == nVar2) {
                o.this.n = true;
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class b implements View.OnAttachStateChangeListener {
        public b() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            o.this.a(true);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            o.this.a(false);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            int iB;
            int iB2;
            View viewH = o.this.a.h();
            if (viewH == null) {
                return;
            }
            View view = (View) viewH.getParent();
            if (view != null) {
                iB = com.adsurge.adn.p032j0.g.b(view.getWidth());
                iB2 = com.adsurge.adn.p032j0.g.b(view.getHeight());
            } else {
                iB = 0;
                iB2 = 0;
            }
            if (iB == 0 || iB2 == 0) {
                return;
            }
            com.adsurge.adn.I0.e eVar = new com.adsurge.adn.I0.e();
            eVar.a("w", iB);
            eVar.a(CmcdData.STREAMING_FORMAT_HLS, iB2);
            o.this.a(new h().a(eVar.toString()).e());
        }
    }

    public final void d(JSONObject jSONObject) {
        if (this.i == null || this.g == null) {
            return;
        }
        try {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            JSONObject jSONObject2 = new JSONObject();
            for (String str : this.i) {
                Object objOpt = jSONObject.opt(str);
                if (!JSONObject.NULL.equals(objOpt)) {
                    jSONObject2.putOpt(str, objOpt);
                }
            }
            if (jSONObject2.length() > 0) {
                this.g.c().onBindData(jSONObject2);
                com.adsurge.adn.p048o1.g.a(SystemClock.elapsedRealtime() - jElapsedRealtime, this.d);
            }
        } catch (Exception unused) {
        }
    }

    @Override // com.adsurge.adn.p018e1.f
    public e e() {
        return this.l;
    }

    public Set f() {
        return this.k;
    }

    public com.adsurge.adn.p011c0.a g() {
        return this.a.d();
    }

    public u.b h() {
        u.b bVar = this.e;
        if (bVar != null) {
            return bVar;
        }
        if (this.f) {
            this.e = (u.b) this.a.h().findViewWithTag("GDTDLVideoView");
            this.f = false;
        }
        return this.e;
    }

    public IGDTBiz i() {
        d dVar = this.g;
        if (dVar != null) {
            return dVar.b();
        }
        return null;
    }

    public View k() {
        return this.a.h();
    }

    public com.adsurge.adn.p064w0.b l() {
        return this.a;
    }

    @Override // com.adsurge.adn.p018e1.f
    public boolean m() {
        return this.m;
    }

    public void n() {
        this.a.h().post(new c());
    }

    public o(com.adsurge.adn.p064w0.b bVar, com.adsurge.adn.u1.c cVar, g gVar) {
        this.a = bVar;
        this.b = cVar;
        this.c = gVar;
        this.d = com.adsurge.adn.W.a.a(cVar, gVar);
        com.adsurge.adn.p011c0.a aVarD = bVar.d();
        if (cVar != null) {
            int iX0 = cVar.x0();
            aVarD.a(new i(iX0 == -1 ? l.a(cVar) : iX0, com.adsurge.adn.p032j0.g.a(l.c(cVar)), null));
            this.g = d.a(this, bVar, cVar, gVar);
        }
        b();
        a();
    }

    public final void a() {
        IGDTBiz iGDTBizI = i();
        if (iGDTBizI == null || !iGDTBizI.isOnViewAppearanceChangedEnable()) {
            return;
        }
        this.o = new b();
        this.a.h().addOnAttachStateChangeListener(this.o);
    }

    public void b() {
        int i;
        com.adsurge.adn.j0.e.a aVarB = com.adsurge.adn.p032j0.e.b();
        if (this.b != null) {
            JSONObject jSONObjectE = new h().c(this.b).e();
            d(jSONObjectE);
            this.a.a(new com.adsurge.adn.I0.e(this.b.i0()).a("posID", this.b.l()).a("dlInfo", jSONObjectE).a());
        }
        c(this.a.i());
        if (com.adsurge.adn.p020f0.c.c()) {
            i = 1;
        } else {
            i = 2;
        }
        aVarB.c = i;
        com.adsurge.adn.p032j0.e.b(2230104, aVarB, g().b());
    }

    public final void c(com.adsurge.adn.p038l0.i iVar) {
        if (b(iVar)) {
            a(iVar);
        }
        if (iVar instanceof com.adsurge.adn.p050p0.a) {
            Iterator it = ((com.adsurge.adn.p050p0.a) iVar).R().iterator();
            while (it.hasNext()) {
                c((com.adsurge.adn.p038l0.i) it.next());
            }
        }
    }

    public com.adsurge.adn.C1.e j() {
        if (h() == null) {
            return null;
        }
        return h().getVideoView();
    }

    public void a(JSONObject jSONObject) {
        if (com.adsurge.adn.I0.f.b(jSONObject)) {
            return;
        }
        try {
            d(jSONObject);
            this.a.a(new JSONObject().putOpt("dlInfo", jSONObject));
        } catch (JSONException unused) {
        }
    }

    public void a(p pVar) {
        this.j = pVar;
        this.a.a(pVar);
    }

    public void a(String str) {
        this.a.a(str, (JSONObject) null);
    }

    public void a(u.c cVar) {
        a("initVideo");
        u.b bVarH = h();
        if (bVarH == null) {
            return;
        }
        bVarH.setPlayerListener(new a(cVar));
    }

    public void c(JSONObject jSONObject) {
        p pVar = this.j;
        if (pVar == null) {
            return;
        }
        pVar.a(jSONObject);
    }

    public Object a(String str, String str2, Object... objArr) {
        if (this.g == null) {
            return null;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        Object objA = this.g.a(str, str2, objArr);
        com.adsurge.adn.p048o1.g.a((int) (SystemClock.elapsedRealtime() - jElapsedRealtime), this.d, str2);
        return objA;
    }

    public void c() {
        if (this.o != null) {
            this.a.h().removeOnAttachStateChangeListener(this.o);
        }
        d dVar = this.g;
        if (dVar != null) {
            dVar.a();
        }
        u.b bVar = this.e;
        if (bVar != null) {
            bVar.a();
        }
        this.a.c();
        this.m = true;
    }

    public final void a(boolean z) {
        IGDTBiz iGDTBizI = i();
        if (iGDTBizI == null) {
            return;
        }
        iGDTBizI.onViewAppearanceChanged(z ? "1" : "0");
    }

    public void a(List list, List list2) {
        this.i = list;
        this.h = list2;
    }

    public void a(long j) {
        d dVar = this.g;
        if (dVar == null) {
            return;
        }
        dVar.a(j);
        IGDTBiz iGDTBizB = this.g.b();
        if (iGDTBizB == null) {
            return;
        }
        iGDTBizB.onTimerTick(j);
    }

    public void a(long j, long j2) {
        IGDTBiz iGDTBizB;
        d dVar = this.g;
        if (dVar == null || (iGDTBizB = dVar.b()) == null) {
            return;
        }
        iGDTBizB.onTimerTickPlus(j, j2);
    }

    public boolean a(com.adsurge.adn.p021f1.d dVar) {
        p pVar = this.j;
        if (pVar == null || !pVar.b(dVar)) {
            return false;
        }
        this.j.a(dVar, (com.adsurge.adn.p044n0.c) null);
        return true;
    }

    public void a(com.adsurge.adn.p044n0.c cVar) {
        p pVar = this.j;
        if (pVar == null) {
            return;
        }
        pVar.e(cVar);
    }

    public final void a(com.adsurge.adn.p038l0.i iVar) {
        if (this.k == null) {
            this.k = new HashSet();
        }
        this.k.add(iVar);
    }

    public void d() {
        t.a(k());
        c();
    }

    public void b(String str) {
        List list = this.h;
        if (list != null && list.contains(str)) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            this.g.c().onStartAnimation(str);
            com.adsurge.adn.p048o1.g.b(SystemClock.elapsedRealtime() - jElapsedRealtime, this.d);
        }
        j jVarA = this.a.a(str);
        if (jVarA != null) {
            jVarA.start();
        }
    }

    public void b(JSONObject jSONObject) {
        if (com.adsurge.adn.I0.f.b(jSONObject)) {
            return;
        }
        d(jSONObject);
        this.a.a(jSONObject);
    }

    public void b(com.adsurge.adn.p044n0.c cVar) {
        p pVar = this.j;
        if (pVar == null) {
            return;
        }
        pVar.b(cVar);
    }

    public final boolean b(com.adsurge.adn.p038l0.i iVar) {
        if (iVar == null || iVar.v().size() == 0) {
            return false;
        }
        for (com.adsurge.adn.p044n0.c cVar : iVar.v()) {
            if ("adClose".equals(cVar.b) || "endCardClose".equals(cVar.b) || "forceCloseAd".equals(cVar.b)) {
                return true;
            }
        }
        return false;
    }
}
