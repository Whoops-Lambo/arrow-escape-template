package io.p071bidmachine.ads.networks.gam_dynamic;

import android.content.Context;
import com.facebook.ads.a;
import com.facebook.internal.v;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.freeze.d;
import defpackage.h50;
import io.p071bidmachine.AdsFormat;
import io.p071bidmachine.ExpirationHandler;
import io.p071bidmachine.TrackEventType;
import io.p071bidmachine.core.j;
import io.p071bidmachine.iab.mraid.m;
import io.p071bidmachine.protobuf.Waterfall;
import io.p071bidmachine.utils.i;
import java.lang.ref.WeakReference;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public abstract class p implements ExpirationHandler.Listener {
    public final i a;
    public final w b;
    public final AdsFormat c;
    public final Waterfall.Configuration.AdUnit d;
    public final a e;
    public final ExpirationHandler f;
    public final ConcurrentHashMap g;
    public volatile int h = 1;
    public WeakReference i;
    public q j;

    public abstract void b();

    public abstract void d(Context context, d0 d0Var);

    public final void a(boolean z) {
        try {
            io.p071bidmachine.core.a.b(this.a, new c(this, 3));
            WeakReference weakReference = this.i;
            if (weakReference != null) {
                weakReference.clear();
            }
            this.i = null;
            if (z) {
                this.f.stop();
                j.l(new v(this, 8));
            }
            e0 e0Var = (e0) this.e.b;
            d dVar = e0Var.f;
            if (!z) {
                dVar.j(this);
            } else if (dVar.f(this)) {
                ((m) e0Var.h).a(this.c, true);
            }
        } catch (Throwable th) {
            io.p071bidmachine.core.a.i(th);
        }
    }

    public final r c() {
        WeakReference weakReference = this.i;
        if (weakReference != null) {
            return (r) weakReference.get();
        }
        return null;
    }

    public final void e(q qVar) {
        this.j = qVar;
        Waterfall.Result.EstimatedPrice estimatedPrice = qVar != null ? qVar.a : null;
        io.p071bidmachine.core.a.b(this.a, new o(this, estimatedPrice, 1));
        String strR = d.r(estimatedPrice);
        if (strR != null) {
            this.g.put("gam_estimated_price", strR);
        }
        this.h = 3;
        this.f.start();
    }

    public final void f() {
        io.p071bidmachine.core.a.b(this.a, new c(this, 4));
        e0 e0Var = (e0) this.e.b;
        if (e0Var.f.f(this)) {
            ((m) e0Var.h).a(this.c, true);
        }
        e0Var.e(TrackEventType.AdUnitShown, this.d, this, null);
        this.h = 5;
        this.f.stop();
    }

    public final void g(Runnable runnable) {
        this.b.a(0L, runnable);
    }

    public final void h(Waterfall.Result.EstimatedPrice estimatedPrice) {
        io.p071bidmachine.core.a.b(this.a, new o(this, estimatedPrice, 0));
        String strR = d.r(estimatedPrice);
        if (strR != null) {
            this.g.put("gam_estimated_price", strR);
        }
        ((e0) this.e.b).e(TrackEventType.AdUnitPaidEvent, this.d, this, null);
    }

    @Override // io.bidmachine.ExpirationHandler.Listener
    public final void onExpired() {
        int i = this.h;
        if (i == 0 || h50.C(i) < 4) {
            io.p071bidmachine.core.a.b(this.a, new c(this, 2));
            ((e0) this.e.b).e(TrackEventType.AdUnitExpired, this.d, this, null);
            this.h = 6;
            r rVarC = c();
            if (rVarC != null) {
                ((m) ((g) rVarC).a).a();
            }
            a(true);
        }
    }

    public final String toString() {
        return this.a + ", " + n.a(this.d);
    }

    public p(e eVar, w wVar, AdsFormat adsFormat, Waterfall.Configuration.AdUnit adUnit, a aVar) {
        eVar.getClass();
        this.a = new i("GAMDynamicAd");
        this.b = wVar;
        this.c = adsFormat;
        this.d = adUnit;
        this.e = aVar;
        this.f = new ExpirationHandler(adUnit.getExpirationTime(), this);
        this.g = new ConcurrentHashMap();
    }
}
