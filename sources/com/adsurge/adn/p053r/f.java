package com.adsurge.adn.p053r;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import android.view.Window;
import android.widget.FrameLayout;
import com.adsurge.adn.C1.e;
import com.adsurge.adn.E1.v;
import com.adsurge.adn.Q.g;
import com.adsurge.adn.V.k;
import com.adsurge.adn.V.m;
import com.adsurge.adn.X.B;
import com.adsurge.adn.ads.BaseAdListener;
import com.adsurge.adn.p036k1.h;
import com.adsurge.adn.p036k1.o;
import com.adsurge.adn.p036k1.p;
import com.adsurge.adn.p036k1.y;
import com.adsurge.adn.x1.t;
import defpackage.hl2;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public class f extends com.adsurge.adn.p053r.b implements com.adsurge.adn.p004a.b {
    public final com.adsurge.adn.p043n.d A;
    public final B B;
    public Application C;
    public final Application.ActivityLifecycleCallbacks D;
    public long q;
    public Activity r;
    public boolean s;
    public long t;
    public long u;
    public boolean v;
    public boolean w;
    public final int x;
    public final com.adsurge.adn.p046o.c y;
    public final com.adsurge.adn.p040m.c z;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class a extends com.adsurge.adn.C1.a {
        public a() {
        }

        @Override // com.adsurge.adn.C1.a, com.adsurge.adn.C1.c
        public void a(int i, Exception exc) {
            f.this.C();
        }

        @Override // com.adsurge.adn.C1.a, com.adsurge.adn.C1.c
        public void b() {
            f.this.C();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class b implements Application.ActivityLifecycleCallbacks {
        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
        }

        public b() {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostCreated(Activity activity, Bundle bundle) {
            f fVar = f.this;
            if (activity != fVar.r) {
                return;
            }
            fVar.a(1);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostStarted(Activity activity) {
            f fVar = f.this;
            if (activity != fVar.r) {
                return;
            }
            fVar.a(4);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreResumed(Activity activity) {
            f fVar = f.this;
            if (activity != fVar.r) {
                return;
            }
            fVar.a(5);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreStarted(Activity activity) {
            f fVar = f.this;
            if (activity != fVar.r) {
                return;
            }
            fVar.a(2);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            f fVar = f.this;
            if (activity != fVar.r) {
                return;
            }
            fVar.a(3);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class c extends p {
        public final com.adsurge.adn.p063w.a q;

        public c(f fVar, o oVar, com.adsurge.adn.u1.c cVar) {
            this(oVar, cVar, fVar.new d());
        }

        @Override // com.adsurge.adn.p036k1.p
        public void a(com.adsurge.adn.p044n0.c cVar, y yVar) {
            super.a(cVar, yVar);
            f fVar = f.this;
            fVar.h = yVar;
            if (yVar != null && fVar.e != null) {
                yVar.a(new c(fVar, yVar, fVar.a));
                View viewK = f.this.h.k();
                ((e) f.this.e).addView(viewK, viewK.getLayoutParams());
                this.q.c();
            }
        }

        @Override // com.adsurge.adn.p036k1.p
        public void c() {
            super.c();
            f.this.v();
            this.q.b();
        }

        @Override // com.adsurge.adn.p036k1.p
        public void e(com.adsurge.adn.p044n0.c cVar) {
            super.e(cVar);
            f.this.a(true);
            this.q.a(new k());
        }

        @Override // com.adsurge.adn.p036k1.p
        /* JADX INFO: renamed from: i */
        public void b(com.adsurge.adn.p044n0.c cVar) {
            super.b(cVar);
            this.q.a();
            f.this.x();
        }

        @Override // com.adsurge.adn.p036k1.p
        public void s(com.adsurge.adn.p044n0.c cVar) {
            super.s(cVar);
            f.this.b(true);
        }

        public c(o oVar, com.adsurge.adn.u1.c cVar, com.adsurge.adn.p063w.a aVar) {
            super(oVar, cVar);
            this.q = aVar;
        }

        @Override // com.adsurge.adn.p036k1.p
        public void a(com.adsurge.adn.p021f1.d dVar, com.adsurge.adn.p044n0.c cVar) {
            super.a(dVar, cVar);
            f fVar = f.this;
            fVar.j.b(dVar, cVar, fVar.b(fVar.b.b()));
            com.adsurge.adn.u1.c cVar2 = f.this.a;
            BaseAdListener baseAdListener = cVar2.C0;
            if (baseAdListener != null) {
                baseAdListener.onAdClicked(cVar2.B0);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class d implements com.adsurge.adn.p063w.a {
        public d() {
        }

        @Override // com.adsurge.adn.p063w.a
        public void a() {
            if (f.this.a.C0() <= 0 || f.this.i().c() > 0) {
                com.adsurge.adn.w1.b.b(6001300, com.adsurge.adn.Y0.c.a(f.this.a), Integer.valueOf(f.this.x));
            } else {
                com.adsurge.adn.w1.b.b(6001300, com.adsurge.adn.Y0.c.a(f.this.a), Integer.valueOf(f.this.x), (Integer) 2);
            }
        }

        @Override // com.adsurge.adn.p063w.a
        public void b() {
            com.adsurge.adn.w1.b.a(6000401, com.adsurge.adn.Y0.c.a(f.this.a), new m().a(!f.this.a.Y0()));
        }

        @Override // com.adsurge.adn.p063w.a
        public void c() {
            com.adsurge.adn.w1.b.a(6000700, com.adsurge.adn.Y0.c.a(f.this.a));
        }

        @Override // com.adsurge.adn.p063w.a
        public void a(k kVar) {
            com.adsurge.adn.Y0.c cVarA = com.adsurge.adn.Y0.c.a(f.this.a);
            f fVar = f.this;
            long jB = fVar.b(fVar.b.b());
            kVar.a(f.this.a.C0()).a(jB).b(jB - ((long) f.this.a.m0()));
            com.adsurge.adn.w1.b.a(6000400, cVarA, kVar);
        }
    }

    @Override // com.adsurge.adn.p053r.b
    public void c() {
        this.n = true;
        com.adsurge.adn.u1.c cVar = this.a;
        BaseAdListener baseAdListener = cVar.C0;
        if (baseAdListener != null) {
            baseAdListener.onAdDismissed(cVar.B0);
        }
        this.B.h();
        this.y.p();
        this.z.p();
        this.A.p();
        super.c();
    }

    @Override // com.adsurge.adn.p004a.b, com.adsurge.adn.p004a.a
    public void onPause() {
        a(false);
        this.B.d();
    }

    public final boolean A() {
        g gVarA0 = this.a.a0();
        int i = com.adsurge.adn.J.a.d().c().j() ? 2 : 1;
        if (gVarA0 != null) {
            return i == gVarA0.n() || (!com.adsurge.adn.p038l0.g.j && gVarA0.n() == 0);
        }
        return false;
    }

    public void C() {
        this.f.p();
        y yVar = this.h;
        if (yVar == null || yVar.m()) {
            return;
        }
        this.h.d();
    }

    public final void D() {
        Application application = this.C;
        if (application == null) {
            return;
        }
        application.unregisterActivityLifecycleCallbacks(this.D);
        this.C = null;
    }

    public final void a(int i) {
        if (!this.r.isFinishing() || this.w) {
            return;
        }
        this.w = true;
        com.adsurge.adn.w1.b.b(6000104, com.adsurge.adn.Y0.c.a(this.a), Integer.valueOf(i));
    }

    @Override // com.adsurge.adn.p053r.b
    public long b(long j) {
        h hVar;
        if (this.a.X0()) {
            e eVar = this.g;
            if (eVar != null) {
                int currentPosition = eVar.getCurrentPosition();
                if (!this.f.o()) {
                    return currentPosition;
                }
                if (this.t < 0) {
                    this.t = j - ((long) currentPosition);
                }
                return j - this.t;
            }
        } else if (!this.a.R0() && this.a.S0() && (hVar = this.i) != null) {
            return hVar.b(j);
        }
        return j;
    }

    @Override // com.adsurge.adn.p053r.b
    public p f() {
        return new c(this, this.f, this.a);
    }

    @Override // com.adsurge.adn.p053r.b
    public com.adsurge.adn.p037l.a i() {
        if (this.y.t()) {
            return this.y;
        }
        if (this.z.v()) {
            return this.z;
        }
        return this.A.v() ? this.A : this.y;
    }

    @Override // com.adsurge.adn.p053r.b
    public h j() {
        this.s = this.a.m0() > 0;
        h hVarB = super.j().f(this.a.Y0()).a(true ^ this.s).c(this.a.U()).b(com.adsurge.adn.N.d.b().c());
        if (this.g != null) {
            hVarB.e(this.a.D0());
        }
        return hVarB;
    }

    @Override // com.adsurge.adn.p053r.b
    public List k() {
        a aVar = new a();
        List listK = super.k();
        listK.add(aVar);
        com.adsurge.adn.p043n.h hVarU = this.A.u();
        if (hVarU != null) {
            listK.add(hVarU);
        }
        return listK;
    }

    @Override // com.adsurge.adn.p053r.b
    public List l() {
        LinkedList linkedList = new LinkedList(super.l());
        linkedList.add(this.y);
        linkedList.add(this.z);
        linkedList.addAll(this.A.s());
        return linkedList;
    }

    @Override // com.adsurge.adn.p053r.b
    public List n() {
        LinkedList linkedList = new LinkedList(super.n());
        linkedList.add(this.y);
        return linkedList;
    }

    @Override // com.adsurge.adn.p004a.b, com.adsurge.adn.p004a.a
    public void onAfterCreate(Bundle bundle) {
        com.adsurge.adn.x1.f.a(this.r, true);
        if (a(this.r, A())) {
            this.r.setContentView(this.e, new FrameLayout.LayoutParams(-1, -1));
            com.adsurge.adn.r1.a.a(com.adsurge.adn.Y0.c.a(this.a));
        }
    }

    @Override // com.adsurge.adn.p004a.b, com.adsurge.adn.p004a.a
    public void onBeforeCreate(Activity activity, Bundle bundle) {
        this.r = activity;
        activity.requestWindowFeature(1);
        Window window = this.r.getWindow();
        if (window != null) {
            window.setBackgroundDrawable(new ColorDrawable(-16777216));
            window.setFlags(16778368, 16778368);
        }
    }

    @Override // com.adsurge.adn.p053r.b
    public void r() {
        this.A.a(this.B);
        this.A.x();
    }

    public void x() {
        Activity activity = this.r;
        if (activity != null && !activity.isFinishing()) {
            this.r.finish();
        }
        c();
    }

    public long y() {
        return this.u;
    }

    @Override // com.adsurge.adn.p053r.b
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public e h() {
        return new e(this.r);
    }

    public f(com.adsurge.adn.u1.c cVar) {
        super(cVar);
        this.s = true;
        this.t = -1L;
        this.u = 0L;
        this.v = false;
        this.w = false;
        this.D = new b();
        this.B = new B(com.adsurge.adn.N.b.a("expoItv", 500, cVar));
        int iA = com.adsurge.adn.N.b.a("odccee", 0, this.a);
        this.x = iA;
        int i = 23;
        this.y = new com.adsurge.adn.p046o.c(this.a, iA, new hl2(this, i));
        this.z = new com.adsurge.adn.p040m.c(this.a, iA, new hl2(this, i));
        this.A = new com.adsurge.adn.p043n.d(this.a, iA, new hl2(this, i));
    }

    public final void B() {
        Context contextA = com.adsurge.adn.J.a.d().a();
        if (contextA instanceof Application) {
            Application application = (Application) contextA;
            this.C = application;
            application.registerActivityLifecycleCallbacks(this.D);
        }
    }

    public boolean d(long j) {
        long jB = b(j);
        this.u = jB;
        if (this.s && this.a.m0() <= jB) {
            h hVar = new h();
            hVar.a(true);
            this.f.a(hVar.e());
            this.s = false;
        }
        this.f.a(jB);
        return false;
    }

    @Override // com.adsurge.adn.p004a.b, com.adsurge.adn.p004a.a
    public void onDestroy() {
        D();
        if (!m()) {
            com.adsurge.adn.w1.b.b(6001300, com.adsurge.adn.Y0.c.a(this.a), Integer.valueOf(this.x), (Integer) 1);
            c();
        }
        t.a(this.e);
    }

    @Override // com.adsurge.adn.p004a.a
    public void onResume() {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        b(false);
        if (!this.v) {
            this.v = true;
            com.adsurge.adn.w1.b.a(6000102, com.adsurge.adn.Y0.c.a(this.a), Integer.valueOf((int) (SystemClock.elapsedRealtime() - this.q)), Integer.valueOf((int) (SystemClock.elapsedRealtime() - jElapsedRealtime)));
            this.z.onResume();
        }
        this.B.g();
    }

    @Override // com.adsurge.adn.p053r.b
    public List q() {
        List listQ = super.q();
        h hVar = new h(this.f);
        this.i = hVar;
        listQ.add(hVar);
        listQ.add(new v(this.a));
        com.adsurge.adn.p043n.g gVarT = this.A.t();
        if (gVarT != null) {
            listQ.add(gVarT);
        }
        return listQ;
    }

    @Override // com.adsurge.adn.p053r.b
    public void a(boolean z) {
        super.a(z);
    }

    public void a(Context context) {
        this.q = SystemClock.elapsedRealtime();
        B();
        com.adsurge.adn.p004a.c.a(context, this);
    }

    @Override // com.adsurge.adn.p053r.b
    public void b(boolean z) {
        super.b(z);
    }

    @Override // com.adsurge.adn.p053r.b
    public void b() {
    }
}
