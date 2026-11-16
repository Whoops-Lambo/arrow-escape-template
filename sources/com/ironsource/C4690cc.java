package com.ironsource;

import android.content.Context;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.ads.nativead.AdapterNativeAdData;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterNativeAdInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.nativead.AdapterNativeAdViewBinder;
import com.ironsource.mediationsdk.adunit.adapter.listener.NativeAdListener;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdData;
import com.ironsource.mediationsdk.logger.IronLog;
import defpackage.az2;
import defpackage.n30;
import defpackage.sv1;
import defpackage.y93;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: com.ironsource.cc, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class C4690cc extends A implements NativeAdListener {

    @Nullable
    private AdapterNativeAdData A;

    @Nullable
    private AdapterNativeAdViewBinder B;

    @Override // com.ironsource.A
    public void b() {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(q());
        super.b();
        if (g() == null) {
            ironLog.warning("adapter == null");
        } else {
            a(new sv1(this, 8));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4690cc(@NotNull T0 t0, @NotNull B b, @NotNull H h, @NotNull E e) {
        super(t0, b, h, null, e, 8, null);
        t0.getClass();
        b.getClass();
        h.getClass();
        e.getClass();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final az2 a(C4690cc c4690cc) {
        try {
            if (c4690cc.g() instanceof AdapterNativeAdInterface) {
                Object objG = c4690cc.g();
                objG.getClass();
                ((AdapterNativeAdInterface) objG).destroyAd(c4690cc.i());
            } else {
                IronLog.INTERNAL.error(c4690cc.a("adapter not instance of AdapterNativeAdInterface"));
            }
        } catch (Throwable th) {
            c4690cc.f().a(new y93(15, th, c4690cc));
        }
        return az2.a;
    }

    @Override // com.ironsource.A
    public void D() {
        if (g() instanceof AdapterNativeAdInterface) {
            AdData adDataI = i();
            if (ContextProvider.getInstance().getCurrentActiveActivity() != null) {
                Object objG = g();
                objG.getClass();
                Context activeContext = ContextProvider.getInstance().getActiveContext();
                activeContext.getClass();
                ((AdapterNativeAdInterface) objG).loadAd(adDataI, activeContext, this);
                return;
            }
            IronLog.INTERNAL.error(a("activity must not be null"));
            f().f().h().g("activity must not be null");
            return;
        }
        IronLog.INTERNAL.error(a("adapter not instance of AdapterNativeAdInterface"));
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.listener.NativeAdListener
    public void onAdLoadSuccess(@NotNull AdapterNativeAdData adapterNativeAdData, @NotNull AdapterNativeAdViewBinder adapterNativeAdViewBinder) {
        adapterNativeAdData.getClass();
        adapterNativeAdViewBinder.getClass();
        this.A = adapterNativeAdData;
        this.B = adapterNativeAdViewBinder;
        super.onAdLoadSuccess();
    }

    @Nullable
    public final AdapterNativeAdViewBinder M() {
        return this.B;
    }

    @Nullable
    public final AdapterNativeAdData L() {
        return this.A;
    }

    public final void a(@NotNull Vb vb) {
        vb.getClass();
        vb.a(this.A);
        vb.a(this.B);
    }

    @Override // com.ironsource.A
    public void a(@NotNull J j) {
        j.getClass();
        j.a(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(Throwable th, C4690cc c4690cc) {
        C4950r4.d().a(th);
        String strY = n30.y("destroyNativeAd - exception = ", th.getLocalizedMessage());
        IronLog.INTERNAL.error(c4690cc.a(strY));
        c4690cc.f().f().h().g(strY);
    }
}
