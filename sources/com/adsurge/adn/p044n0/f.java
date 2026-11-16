package com.adsurge.adn.p044n0;

import android.graphics.PointF;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import com.adsurge.adn.p038l0.d;
import com.adsurge.adn.p038l0.i;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public class f implements View.OnTouchListener, View.OnClickListener, d {
    public final i a;
    public final i.d b;
    public c c;
    public PointF d;
    public PointF e;
    public MotionEvent f;
    public View g;
    public List h;
    public int i = 0;
    public List j;
    public List k;
    public List l;
    public i m;
    public boolean n;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public final class a implements Runnable {
        public g a;

        public a(g gVar) {
            this.a = gVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (f.this.a()) {
                return;
            }
            f fVar = f.this;
            fVar.a(this.a.c(fVar.g, fVar.f, fVar.d, fVar.e), this.a);
        }
    }

    public final void d(View view, MotionEvent motionEvent) {
        this.n = true;
        this.e = a(motionEvent);
        for (g gVar : this.j) {
            c cVarC = gVar.c();
            if (cVarC != null) {
                if (!a() && cVarC.a()) {
                    a(gVar.a(view, motionEvent, this.d, this.e), gVar);
                }
                if (cVarC.h) {
                    this.b.c(this.a, cVarC);
                }
                gVar.f();
            }
        }
    }

    public void a(List list) {
        View viewC = this.a.C();
        if (!this.a.M() || viewC == null) {
            return;
        }
        int size = list.size();
        this.j = new ArrayList(size);
        this.k = new ArrayList(size);
        this.l = new ArrayList(size);
        Iterator it = list.iterator();
        while (true) {
            g bVar = null;
            if (!it.hasNext()) {
                if (this.k.size() <= 0) {
                    this.k = null;
                }
                if (this.l.size() <= 0) {
                    this.l = null;
                }
                if (this.j.size() <= 0) {
                    this.j = null;
                }
                if (this.j == null && this.c == null) {
                    return;
                }
                viewC.setOnTouchListener(this);
                return;
            }
            c cVar = (c) it.next();
            switch (cVar.a) {
                case 1:
                    if (!b.a(cVar.c, this.a.d())) {
                        this.c = cVar;
                        viewC.setOnClickListener(this);
                        viewC.setFocusable(false);
                    } else {
                        bVar = new b(cVar, this.a.d().i());
                    }
                    break;
                case 2:
                default:
                    continue;
                case 3:
                    bVar = new j(cVar);
                    break;
                case 4:
                    bVar = new b(cVar, this.a.d().i());
                    break;
                case 5:
                    this.a.d().h();
                    break;
                case 6:
                    bVar = new h(cVar);
                    break;
                case 7:
                    bVar = new e(cVar);
                    break;
                case 8:
                    this.a.d().j();
                    break;
            }
            if (bVar != null) {
                this.j.add(bVar);
                if (bVar.e()) {
                    this.k.add(bVar);
                }
                if (bVar.b()) {
                    this.l.add(bVar);
                }
                this.a.a(bVar.a());
            }
        }
    }

    public final void b(View view, MotionEvent motionEvent) {
        for (g gVar : this.j) {
            c cVarC = gVar.c();
            if (cVarC != null) {
                if (!a() && cVarC.a()) {
                    a(gVar.a(view, motionEvent, this.d), gVar);
                }
                if (cVarC.h) {
                    this.b.b(this.a, cVarC);
                }
            }
        }
    }

    public final void c() {
        List list = this.l;
        if (list == null || list.isEmpty()) {
            return;
        }
        for (g gVar : this.l) {
            if (this.h == null) {
                this.h = new ArrayList(this.l.size());
            }
            a aVar = new a(gVar);
            this.h.add(aVar);
            com.adsurge.adn.J0.a.a("postDelayed MinDurationCheck, getMinDuration = %d", Integer.valueOf(gVar.d()));
            com.adsurge.adn.p032j0.d.a().postDelayed(aVar, gVar.d());
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (a(this.c)) {
            this.c.d();
        }
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        boolean z = false;
        if (!this.a.M()) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            if (view != null && (view.getScaleX() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || view.getScaleY() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT)) {
                return false;
            }
            PointF pointFA = a(motionEvent);
            this.d = pointFA;
            this.e = pointFA;
            this.m = null;
            com.adsurge.adn.p011c0.a aVarD = this.a.d();
            if (aVarD != null && aVarD.l()) {
                a(view, true);
            }
        }
        if (this.j == null) {
            return false;
        }
        if (com.adsurge.adn.J0.a.a) {
            com.adsurge.adn.J0.a.a("MotionEvent event Action: %d, event x: %.2f, y: %.2f", Integer.valueOf(action), Float.valueOf(motionEvent.getX()), Float.valueOf(motionEvent.getY()));
        }
        this.f = motionEvent;
        this.g = view;
        if (action == 0) {
            b(view, motionEvent);
            c();
        } else if (action == 1) {
            b();
            d(view, motionEvent);
        } else if (action != 2) {
            if (action != 3) {
                return false;
            }
            b();
            a(view, motionEvent);
        } else if (this.k != null) {
            c(view, motionEvent);
        }
        if (a() || (this.i == 1 && !view.isClickable())) {
            z = true;
        }
        a(action);
        return z;
    }

    public f(i iVar, i.d dVar) {
        this.a = iVar;
        this.b = dVar;
    }

    @Override // com.adsurge.adn.p038l0.d
    public void b(i iVar, c cVar) {
        this.b.b(iVar, cVar);
    }

    public final boolean b(i iVar, PointF pointF) {
        Rect rectH;
        if (iVar == null || (rectH = iVar.H()) == null) {
            return false;
        }
        return rectH.contains((int) pointF.x, (int) pointF.y);
    }

    public final void b() {
        List list = this.h;
        if (list == null || list.isEmpty()) {
            return;
        }
        Iterator it = this.h.iterator();
        while (it.hasNext()) {
            com.adsurge.adn.p032j0.d.a().removeCallbacks((Runnable) it.next());
        }
    }

    @Override // com.adsurge.adn.p038l0.d
    public void c(i iVar, c cVar) {
        this.b.c(iVar, cVar);
    }

    public final void c(View view, MotionEvent motionEvent) {
        this.e = a(motionEvent);
        for (g gVar : this.k) {
            c cVarC = gVar.c();
            if (cVarC != null && !a() && cVarC.a()) {
                a(gVar.b(view, motionEvent, this.d, this.e), gVar);
            }
        }
    }

    public static void a(View view, boolean z) {
        ViewParent parent;
        if (view == null || (parent = view.getParent()) == null) {
            return;
        }
        parent.requestDisallowInterceptTouchEvent(z);
    }

    public final PointF a(MotionEvent motionEvent) {
        return new PointF(motionEvent.getRawX(), motionEvent.getRawY());
    }

    public final boolean a() {
        return this.i == 3;
    }

    public final void a(Boolean bool, g gVar) {
        if (bool == null) {
            this.i = 1;
            return;
        }
        c cVarC = gVar.c();
        if (a(cVarC)) {
            if (bool.booleanValue()) {
                this.i = 3;
                cVarC.d();
                return;
            } else {
                this.i = 1;
                return;
            }
        }
        if (bool.booleanValue()) {
            this.i = 1;
        } else if (this.i == 0) {
            this.i = 2;
        }
    }

    public final void a(View view, MotionEvent motionEvent) {
        if (this.n) {
            return;
        }
        this.e = a(motionEvent);
        for (g gVar : this.j) {
            c cVarC = gVar.c();
            if (cVarC != null) {
                if (cVarC.a()) {
                    gVar.a(view, motionEvent, this.d, this.e);
                }
                if (cVarC.h) {
                    this.b.c(this.a, gVar.c());
                }
                gVar.f();
            }
        }
    }

    public final void a(int i) {
        if (i == 1 || i == 3) {
            this.i = 0;
            this.n = false;
        }
    }

    @Override // com.adsurge.adn.p038l0.d
    public boolean a(i iVar, c cVar) {
        return this.b.a(iVar, cVar);
    }

    public final boolean a(c cVar) {
        if (this.m == null) {
            this.m = a(this.a, this.d);
        }
        i iVar = this.m;
        if (iVar != null) {
            cVar.a(iVar.t());
        } else {
            cVar.a(0);
        }
        i iVar2 = this.a;
        if (iVar2 != null) {
            cVar.a(iVar2.r());
        }
        return this.b.a(this.a, cVar);
    }

    public final i a(i iVar, PointF pointF) {
        if (pointF == null) {
            return null;
        }
        if (!(iVar instanceof com.adsurge.adn.p050p0.a)) {
            return iVar;
        }
        com.adsurge.adn.p050p0.a aVar = (com.adsurge.adn.p050p0.a) iVar;
        for (int iQ = aVar.Q() - 1; iQ >= 0; iQ--) {
            i iVarM = aVar.m(iQ);
            if (((iVarM instanceof com.adsurge.adn.p050p0.a) || iVarM.t() != 0) && b(iVarM, pointF)) {
                i iVarA = a(iVarM, pointF);
                if (iVarA.t() != 0) {
                    return iVarA;
                }
            }
        }
        return iVar;
    }
}
