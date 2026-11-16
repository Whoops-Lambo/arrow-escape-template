package io.p071bidmachine.rendering.internal.adform.video.player;

import android.content.Context;
import android.media.AudioManager;
import android.net.Uri;
import android.view.View;
import com.moloco.sdk.internal.ilrd.p;
import com.unity3d.services.UnityAdsConstants;
import defpackage.cm2;
import defpackage.eu;
import io.p071bidmachine.rendering.internal.a;
import io.p071bidmachine.rendering.internal.adform.video.c;
import io.p071bidmachine.rendering.internal.adform.video.d;
import io.p071bidmachine.rendering.internal.controller.i;
import io.p071bidmachine.rendering.internal.d0;
import io.p071bidmachine.rendering.internal.g;
import io.p071bidmachine.rendering.model.y;
import io.p071bidmachine.util.e;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public abstract class b implements d0, a, g {
    public final a a;
    public final p b;
    public final AtomicBoolean c;
    public final AtomicBoolean d;
    public final AtomicBoolean e;
    public final AtomicBoolean f;
    public final AtomicLong g;
    public c h;
    public volatile boolean i;
    public Uri j;
    public long k;
    public long l;

    public final void a() {
        if (this.f.compareAndSet(false, true)) {
            p pVar = this.b;
            ((AtomicBoolean) pVar.d).set(false);
            pVar.e();
            c cVar = this.h;
            if (cVar != null) {
                d dVar = cVar.a;
                io.p071bidmachine.rendering.measurer.g gVar = dVar.x;
                if (gVar != null) {
                    gVar.g0();
                }
                dVar.a.b(y.OnComplete, null, null);
            }
        }
    }

    public abstract long d();

    public abstract void e(float f);

    public abstract void f(long j);

    public abstract long h();

    public final void i(float f) {
        c cVar;
        io.p071bidmachine.rendering.measurer.g gVar;
        c cVar2;
        boolean z = f == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        boolean zCompareAndSet = this.d.compareAndSet(!z, z);
        AtomicBoolean atomicBoolean = this.f;
        if (zCompareAndSet && !atomicBoolean.get() && (cVar2 = this.h) != null) {
            d dVar = cVar2.a;
            View viewC = dVar.C();
            Integer numValueOf = viewC != null ? Integer.valueOf(viewC.getId()) : null;
            io.p071bidmachine.rendering.internal.event.g gVar2 = dVar.a;
            if (z) {
                gVar2.b(y.OnMute, numValueOf, eu.A(numValueOf));
            } else {
                gVar2.b(y.OnUnMute, numValueOf, eu.A(numValueOf));
            }
        }
        if (atomicBoolean.get() || (cVar = this.h) == null || (gVar = cVar.a.x) == null) {
            return;
        }
        gVar.r0(f);
    }

    public abstract void j(Uri uri);

    public abstract float m();

    public abstract void o();

    public abstract boolean p();

    public abstract void q();

    public abstract void r();

    public abstract void s();

    public abstract void t();

    public abstract View u();

    @Override // io.p071bidmachine.rendering.internal.d0
    public final void b(Integer num) {
        p pVar = this.b;
        ((AtomicBoolean) pVar.d).set(true);
        pVar.f();
        try {
            n(1.0f);
        } catch (Throwable unused) {
        }
    }

    @Override // io.p071bidmachine.rendering.internal.d0
    public final void c(Integer num) {
        p pVar = this.b;
        ((AtomicBoolean) pVar.d).set(false);
        pVar.e();
        try {
            n(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        } catch (Throwable unused) {
        }
    }

    public final void g(boolean z, Long l) {
        c cVar;
        if (l != null) {
            try {
                this.l = l.longValue();
            } catch (Exception e) {
                e eVar = new e(e);
                if (this.i) {
                    k(eVar);
                    return;
                } else {
                    if (this.f.get() || (cVar = this.h) == null) {
                        return;
                    }
                    cVar.a.F(eVar);
                    return;
                }
            }
        }
        if (z) {
            if (l != null) {
                try {
                    f(l.longValue());
                } catch (Throwable unused) {
                }
            }
            z();
        } else {
            t();
            Uri uri = this.j;
            if (uri != null) {
                j(uri);
            }
            s();
        }
    }

    public final void k(e eVar) {
        if (this.f.get()) {
            return;
        }
        c cVar = this.h;
        if (cVar != null) {
            d dVar = cVar.a;
            io.p071bidmachine.rendering.measurer.g gVar = dVar.x;
            if (gVar != null) {
                gVar.e(eVar);
            }
            dVar.g.d(dVar, eVar);
        }
        a();
    }

    public final void l(Long l) {
        c cVar;
        if (l == null || this.g.getAndSet(l.longValue()) == l.longValue() || this.f.get() || (cVar = this.h) == null) {
            return;
        }
        io.p071bidmachine.rendering.internal.event.g gVar = cVar.a.a;
        long j = this.k;
        gVar.b(y.OnProgress, Long.valueOf(j), eu.z(Long.valueOf(j), l));
    }

    @Override // io.p071bidmachine.rendering.internal.g
    public final void n() {
        c cVar;
        if (!this.i || this.f.get()) {
            return;
        }
        try {
            this.e.set(false);
            y();
            this.l = d();
        } catch (Throwable unused) {
        }
        try {
            f(this.k);
        } catch (Throwable unused2) {
        }
        if (this.f.get() || (cVar = this.h) == null) {
            return;
        }
        d dVar = cVar.a;
        io.p071bidmachine.rendering.measurer.g gVar = dVar.x;
        if (gVar != null) {
            gVar.m0();
        }
        dVar.a.b(y.OnSkip, null, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void v() {
        c cVar;
        this.b.e();
        if (!this.f.get() && (cVar = this.h) != null) {
            d dVar = cVar.a;
            io.p071bidmachine.rendering.measurer.g gVar = dVar.x;
            if (gVar != null) {
                gVar.f0();
            }
            dVar.a.b(y.OnPause, null, null);
        }
        a aVar = this.a;
        ((AtomicBoolean) aVar.b).set(false);
        io.p071bidmachine.rendering.utils.d.a.getClass();
        try {
            if (aVar instanceof io.p071bidmachine.util.c) {
                ((io.p071bidmachine.util.c) aVar).a(true);
            }
        } catch (Throwable unused) {
        }
        io.p071bidmachine.rendering.utils.taskmanager.b.a.removeCallbacks(aVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void w() {
        c cVar;
        p pVar = this.b;
        if (((AtomicBoolean) pVar.d).get()) {
            pVar.f();
        }
        AtomicBoolean atomicBoolean = this.f;
        if (!atomicBoolean.get() && (cVar = this.h) != null) {
            d dVar = cVar.a;
            dVar.t();
            io.p071bidmachine.rendering.measurer.g gVar = dVar.x;
            if (gVar != null) {
                gVar.q0();
            }
            dVar.a.b(y.OnResume, null, null);
        }
        if (atomicBoolean.get()) {
            return;
        }
        a aVar = this.a;
        ((AtomicBoolean) aVar.b).set(false);
        io.p071bidmachine.rendering.utils.d.a.getClass();
        try {
            if (aVar instanceof io.p071bidmachine.util.c) {
                ((io.p071bidmachine.util.c) aVar).a(true);
            }
        } catch (Throwable unused) {
        }
        io.p071bidmachine.rendering.utils.taskmanager.b.a.removeCallbacks(aVar);
        ((AtomicBoolean) aVar.b).set(true);
        io.p071bidmachine.rendering.utils.d.a(aVar);
    }

    public b(Context context) {
        context.getClass();
        this.a = new a(this);
        context.getClass();
        p pVar = new p();
        AudioManager audioManager = null;
        try {
            Context applicationContext = context.getApplicationContext();
            applicationContext.getClass();
            Object systemService = applicationContext.getSystemService("audio");
            audioManager = (AudioManager) (systemService instanceof AudioManager ? systemService : null);
        } catch (Throwable unused) {
        }
        pVar.a = audioManager;
        pVar.c = new AtomicBoolean(false);
        pVar.d = new AtomicBoolean(false);
        pVar.b = new io.p071bidmachine.util.a();
        pVar.e = new cm2(new i(pVar, 7));
        this.b = pVar;
        this.c = new AtomicBoolean(false);
        this.d = new AtomicBoolean(false);
        this.e = new AtomicBoolean(false);
        this.f = new AtomicBoolean(false);
        this.g = new AtomicLong(-1L);
        this.k = -1L;
    }

    public final void x() {
        c cVar;
        try {
            this.k = h();
        } catch (Throwable unused) {
        }
        if (this.e.compareAndSet(true, false)) {
            g(true, Long.valueOf(this.l));
        }
        if (this.c.compareAndSet(false, true) && (cVar = this.h) != null) {
            d dVar = cVar.a;
            io.p071bidmachine.rendering.measurer.g gVar = dVar.x;
            if (gVar != null) {
                gVar.v(u());
            }
            dVar.g.c(dVar);
            dVar.q();
        }
    }

    public void y() {
        q();
    }

    public void z() {
        r();
    }

    @Override // io.p071bidmachine.rendering.internal.a
    public final void l() {
        try {
            this.f.set(false);
            ((AtomicInteger) this.a.c).set(0);
            this.e.set(true);
            g(false, 0L);
        } catch (Exception e) {
            k(new e(e));
        }
    }

    public void n(float f) {
        e(f);
    }
}
