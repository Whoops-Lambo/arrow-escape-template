package io.p071bidmachine.rendering.internal.adform;

import android.content.Context;
import android.graphics.Point;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import com.facebook.login.p;
import com.moloco.sdk.internal.services.bidtoken.s;
import com.unity3d.services.UnityAdsConstants;
import defpackage.ar1;
import defpackage.eu;
import defpackage.n8;
import defpackage.o5;
import io.p071bidmachine.media3.exoplayer.offline.b;
import io.p071bidmachine.rendering.ad.view.h;
import io.p071bidmachine.rendering.d;
import io.p071bidmachine.rendering.internal.controller.k;
import io.p071bidmachine.rendering.internal.j;
import io.p071bidmachine.rendering.internal.q;
import io.p071bidmachine.rendering.internal.v;
import io.p071bidmachine.rendering.model.e;
import io.p071bidmachine.rendering.model.f;
import io.p071bidmachine.rendering.model.p0;
import io.p071bidmachine.rendering.model.u;
import io.p071bidmachine.rendering.model.y;
import io.p071bidmachine.rendering.utils.g;
import io.p071bidmachine.t1;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public abstract class a extends j implements q, View.OnClickListener, View.OnTouchListener, g {
    public final Object d;
    public final d e;
    public final io.p071bidmachine.rendering.model.a f;
    public final k g;
    public final io.p071bidmachine.rendering.internal.detector.brokencreative.d h;
    public final Context i;
    public final e j;
    public final s k;
    public final AtomicBoolean l;
    public final AtomicBoolean m;
    public final AtomicBoolean n;
    public final AtomicBoolean o;
    public final AtomicReference p;
    public final p q;
    public FrameLayout r;
    public volatile boolean s;
    public volatile boolean t;
    public volatile boolean u;
    public volatile boolean v;
    public volatile u w;

    public void B(boolean z) {
    }

    @Override // io.p071bidmachine.rendering.internal.q
    public void e(io.p071bidmachine.iab.utils.j jVar) {
        z(null);
    }

    public abstract View o();

    public void s() {
    }

    public void t() {
        this.s = true;
        E();
    }

    public void u() {
        this.s = false;
        E();
    }

    public void w() {
    }

    public final View C() {
        FrameLayout frameLayout = this.r;
        return frameLayout != null ? frameLayout : o();
    }

    public final void D(boolean z) {
        this.t = z;
        if (this.u) {
            return;
        }
        if (z) {
            io.p071bidmachine.util.p.W(C());
        } else {
            io.p071bidmachine.util.p.A(C());
        }
        this.v = z;
        E();
    }

    @Override // io.p071bidmachine.rendering.internal.j
    public final String m() {
        return this.f.m;
    }

    public final void q() {
        Boolean bool;
        AtomicBoolean atomicBoolean = this.m;
        atomicBoolean.set(true);
        k kVar = this.g;
        kVar.getClass();
        t1.l(kVar.b.b, "AdElement (" + this + ") - onAdFormCommitVisible", false, new Object[0]);
        kVar.g(this);
        io.p071bidmachine.rendering.model.a aVar = this.f;
        if ((aVar.l || atomicBoolean.get()) && this.n.compareAndSet(true, false)) {
            v();
        }
        if ((aVar.l || atomicBoolean.get()) && (bool = (Boolean) this.p.getAndSet(null)) != null) {
            B(bool.booleanValue());
        }
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("type - ");
        io.p071bidmachine.rendering.model.a aVar = this.f;
        switch (aVar.a) {
            case 1:
                str = "Mraid";
                break;
            case 2:
                str = "Video";
                break;
            case 3:
                str = "Image";
                break;
            case 4:
                str = "Label";
                break;
            case 5:
                str = "Countdown";
                break;
            case 6:
                str = "Progress";
                break;
            default:
                str = "null";
                break;
        }
        sb.append(str);
        sb.append(", name - ");
        sb.append(aVar.m);
        return sb.toString();
    }

    public void y(View view, s sVar) {
        if (sVar != null) {
            s.j(sVar, this.d, view, null, null, null, 60);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Context context, Object obj, d dVar, io.p071bidmachine.rendering.model.a aVar, k kVar, io.p071bidmachine.rendering.internal.event.g gVar, io.p071bidmachine.rendering.internal.detector.brokencreative.d dVar2) {
        s sVar;
        super(gVar);
        context.getClass();
        obj.getClass();
        dVar.getClass();
        this.d = obj;
        this.e = dVar;
        this.f = aVar;
        this.g = kVar;
        this.h = dVar2;
        Context applicationContext = context.getApplicationContext();
        applicationContext.getClass();
        this.i = applicationContext;
        e eVar = aVar.f;
        this.j = eVar;
        f fVar = eVar.a;
        if (fVar != null) {
            sVar = new s(applicationContext, dVar, fVar);
        } else {
            sVar = null;
        }
        this.k = sVar;
        this.l = new AtomicBoolean(false);
        this.m = new AtomicBoolean(false);
        this.n = new AtomicBoolean(false);
        this.o = new AtomicBoolean(false);
        this.p = new AtomicReference(null);
        this.q = new p(26);
        this.t = true;
        this.v = this.t;
    }

    public final void A(boolean z, b bVar, io.p071bidmachine.rendering.internal.event.e eVar) {
        View viewC = C();
        int i = 1;
        h hVar = new h(this, z, eVar, i);
        p pVar = this.q;
        pVar.Q(viewC);
        if (viewC != null && bVar != null) {
            if (viewC.getVisibility() != 0) {
                i = 0;
            }
            if (z == i) {
                hVar.invoke();
                return;
            } else {
                pVar.R(viewC, z, false, bVar, hVar);
                return;
            }
        }
        hVar.invoke();
    }

    public final void E() {
        io.p071bidmachine.rendering.internal.detector.brokencreative.d dVar;
        io.p071bidmachine.rendering.internal.detector.brokencreative.algorithm.b bVar;
        View viewO = o();
        if (viewO != null) {
            if (this.v && this.s) {
                if (this.o.compareAndSet(false, true)) {
                    s sVar = this.k;
                    if (sVar != null) {
                        s.j(sVar, this.d, viewO, null, null, new io.p071bidmachine.rendering.internal.k(), 12);
                    }
                    io.p071bidmachine.rendering.internal.detector.brokencreative.d dVar2 = this.h;
                    if (dVar2 != null && !dVar2.i.get() && !dVar2.h.get()) {
                        synchronized (dVar2.j) {
                            try {
                                if (dVar2.g.compareAndSet(false, true)) {
                                    ArrayList arrayList = dVar2.c.g;
                                    ArrayList arrayList2 = new ArrayList(eu.f(arrayList, 10));
                                    int size = arrayList.size();
                                    int i = 0;
                                    while (i < size) {
                                        Object obj = arrayList.get(i);
                                        i++;
                                        io.p071bidmachine.rendering.model.j jVar = (io.p071bidmachine.rendering.model.j) obj;
                                        jVar.getClass();
                                        int i2 = io.p071bidmachine.rendering.internal.detector.brokencreative.algorithm.a.a[jVar.a.ordinal()];
                                        if (i2 != 1) {
                                            if (i2 != 2) {
                                                if (i2 == 3) {
                                                    bVar = new io.p071bidmachine.rendering.internal.detector.brokencreative.algorithm.b(jVar, 2);
                                                } else {
                                                    throw new ar1();
                                                }
                                            } else {
                                                bVar = new io.p071bidmachine.rendering.internal.detector.brokencreative.algorithm.b(jVar, 0);
                                            }
                                        } else {
                                            bVar = new io.p071bidmachine.rendering.internal.detector.brokencreative.algorithm.b(jVar, 1);
                                        }
                                        arrayList2.add(bVar);
                                    }
                                    if (!arrayList2.isEmpty()) {
                                        dVar2.k = System.currentTimeMillis();
                                        dVar2.l = new io.p071bidmachine.rendering.internal.detector.brokencreative.b(viewO, ((io.p071bidmachine.util.taskmanager.handler.b) dVar2.e.getValue()).a, dVar2.c.b, arrayList2, new o5(dVar2, 17));
                                        dVar2.c();
                                    }
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    }
                    this.g.a(this);
                    return;
                }
                return;
            }
            if (this.o.compareAndSet(true, false) && (dVar = this.h) != null) {
                synchronized (dVar.j) {
                    dVar.g.set(false);
                    dVar.b();
                    dVar.l = null;
                }
            }
        }
    }

    @Override // io.p071bidmachine.rendering.internal.j
    public final void g(boolean z) {
        Boolean bool;
        Boolean boolValueOf = Boolean.valueOf(z);
        AtomicReference atomicReference = this.p;
        atomicReference.set(boolValueOf);
        if ((this.f.l || this.m.get()) && (bool = (Boolean) atomicReference.getAndSet(null)) != null) {
            B(bool.booleanValue());
        }
    }

    @Override // io.p071bidmachine.rendering.internal.j
    public final void h() {
        super.h();
        this.q.V();
        s sVar = this.k;
        if (sVar != null) {
            sVar.m();
        }
        io.p071bidmachine.rendering.internal.detector.brokencreative.d dVar = this.h;
        if (dVar != null) {
            dVar.h.set(true);
            synchronized (dVar.j) {
                dVar.g.set(false);
                dVar.b();
                dVar.l = null;
            }
        }
        s();
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        view.getClass();
        z(null);
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        boolean z;
        io.p071bidmachine.rendering.model.q qVarZ;
        view.getClass();
        motionEvent.getClass();
        if (motionEvent.getAction() == 1) {
            if (motionEvent.getSource() == 2) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                qVarZ = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.freeze.d.z(view, new Point((int) motionEvent.getRawX(), (int) motionEvent.getRawY()));
            } else {
                qVarZ = null;
            }
            z(qVarZ);
        }
        return true;
    }

    public void v() {
        t();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean x() {
        View viewO = o();
        if (viewO != 0) {
            e eVar = this.j;
            p0 p0Var = eVar.l;
            if (p0Var != null) {
                float f = p0Var.d;
                float f2 = p0Var.c;
                float f3 = p0Var.b;
                float f4 = p0Var.a;
                if (f4 != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || f3 != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || f2 != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || f != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    FrameLayout frameLayout = new FrameLayout(this.i);
                    frameLayout.setId(View.generateViewId());
                    Context context = frameLayout.getContext();
                    context.getClass();
                    int iK = io.p071bidmachine.util.p.k(context, f4);
                    Context context2 = frameLayout.getContext();
                    context2.getClass();
                    int iK2 = io.p071bidmachine.util.p.k(context2, f3);
                    Context context3 = frameLayout.getContext();
                    context3.getClass();
                    int iK3 = io.p071bidmachine.util.p.k(context3, f2);
                    Context context4 = frameLayout.getContext();
                    context4.getClass();
                    frameLayout.setPadding(iK, iK2, iK3, io.p071bidmachine.util.p.k(context4, f));
                    frameLayout.addView(viewO, new FrameLayout.LayoutParams(-1, -1));
                    this.r = frameLayout;
                }
            }
            View viewC = C();
            if (viewC == null) {
                return false;
            }
            viewC.setId(View.generateViewId());
            viewC.setTag(this.f.m);
            Boolean bool = eVar.c;
            if (bool != null && bool.booleanValue()) {
                viewC.setOnTouchListener(this);
                viewC.setOnClickListener(this);
            }
            Float f5 = eVar.d;
            if (f5 != null) {
                viewC.setAlpha(f5.floatValue());
            }
            Boolean bool2 = eVar.b;
            if (bool2 != null) {
                D(bool2.booleanValue());
            }
            if (viewO instanceof v) {
                ((v) viewO).b(eVar);
                return true;
            }
            y(viewO, this.k);
            return true;
        }
        return false;
    }

    public final void z(io.p071bidmachine.rendering.model.q qVar) {
        int id;
        View viewO = o();
        if (viewO != null) {
            id = viewO.getId();
        } else {
            id = -1;
        }
        this.a.b(y.OnClick, Integer.valueOf(id), n8.b0(new Object[]{Integer.valueOf(id), qVar}));
    }
}
