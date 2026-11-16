package com.ironsource;

import android.view.View;
import android.widget.FrameLayout;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.ISBannerSize;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBannerInterface;
import com.ironsource.mediationsdk.adunit.adapter.listener.BannerAdListener;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdData;
import com.ironsource.mediationsdk.logger.IronLog;
import com.unity3d.mediation.LevelPlayAdInfo;
import defpackage.az2;
import defpackage.d11;
import defpackage.n30;
import defpackage.qh1;
import defpackage.tk0;
import java.util.LinkedHashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class I2 extends A implements BannerAdListener {

    @Nullable
    private View A;

    @Nullable
    private FrameLayout.LayoutParams B;

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(I2 i2, Bg bg) {
        FrameLayout.LayoutParams layoutParams;
        View view = i2.A;
        if (view == null || (layoutParams = i2.B) == null) {
            return;
        }
        bg.a(view, layoutParams, i2.f());
        IronLog.INTERNAL.verbose(C4911p0.a(i2.f(), "Bind banner view", (String) null, 2, (Object) null));
        i2.f().a(new d11(i2, 3));
    }

    @Override // com.ironsource.A
    public void c() {
        a(new defpackage.s5(this, 24));
    }

    @Override // com.ironsource.A
    @NotNull
    public LevelPlayAdInfo e() {
        String string = n().j().b().b().toString();
        string.getClass();
        String strC = n().j().b().c();
        String string2 = n().i().toString();
        string2.getClass();
        C5074y2 c5074y2O = n().o();
        AbstractC5054x0 abstractC5054x0J = n().j();
        abstractC5054x0J.getClass();
        return new LevelPlayAdInfo(string, strC, string2, c5074y2O, ((T2) abstractC5054x0J).b().i(), n().j().m(), qh1.h0(l()));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public I2(@NotNull T0 t0, @NotNull B b, @NotNull H h, @NotNull K2 k2) {
        super(t0, b, h, null, null, 24, null);
        t0.getClass();
        b.getClass();
        h.getClass();
        k2.getClass();
        a(k2);
    }

    private final K2 L() {
        E eS = s();
        if (eS instanceof K2) {
            return (K2) eS;
        }
        return null;
    }

    private final ISBannerSize M() {
        T0 t0F = f();
        AbstractC5054x0 abstractC5054x0J = n().j();
        abstractC5054x0J.getClass();
        return t0F.a(((T2) abstractC5054x0J).b().i());
    }

    private final void N() {
        C4870md c4870mdJ = j();
        if (c4870mdJ != null) {
            f().f().a().f(c4870mdJ.c());
        }
        K2 k2L = L();
        if (k2L != null) {
            k2L.a(this);
        }
    }

    private final void O() {
        C4870md c4870mdJ = j();
        if (c4870mdJ != null) {
            f().f().a().c(c4870mdJ.c());
        }
        K2 k2L = L();
        if (k2L != null) {
            k2L.b(this);
        }
    }

    private final void P() {
        C4870md c4870mdJ = j();
        if (c4870mdJ != null) {
            f().f().a().h(c4870mdJ.c());
        }
        K2 k2L = L();
        if (k2L != null) {
            k2L.c(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final az2 b(I2 i2) {
        try {
            if (i2.g() instanceof AdapterBannerInterface) {
                Object objG = i2.g();
                objG.getClass();
                ((AdapterBannerInterface) objG).destroyAd(i2.i());
            } else {
                IronLog.INTERNAL.error(i2.a("adapter not instance of AdapterBannerInterface"));
            }
        } catch (Throwable th) {
            i2.f().a(new tk0(17, th, i2));
        }
        return az2.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(I2 i2) {
        i2.O();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(I2 i2) {
        String strC;
        N nA = i2.f().f().a();
        C4870md c4870mdJ = i2.j();
        if (c4870mdJ == null || (strC = c4870mdJ.c()) == null) {
            strC = "";
        }
        nA.j(strC);
    }

    @Override // com.ironsource.A
    public void D() {
        if (g() instanceof AdapterBannerInterface) {
            AdData adDataI = i();
            ISBannerSize iSBannerSizeM = M();
            Map<String, Object> adUnitData = adDataI.getAdUnitData();
            adUnitData.getClass();
            adUnitData.put(R2.t, new com.ironsource.mediationsdk.o(ContextProvider.getInstance().getApplicationContext(), iSBannerSizeM));
            Object objG = g();
            objG.getClass();
            ((AdapterBannerInterface) objG).loadAd(adDataI, ContextProvider.getInstance().getCurrentActiveActivity(), iSBannerSizeM, this);
            return;
        }
        IronLog.INTERNAL.error(a("adapter not instance of AdapterBannerInterface"));
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdViewListener
    public void onAdLeftApplication() {
        f().a(new d11(this, 2));
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdViewListener
    public void onAdLoadSuccess(@NotNull View view, @NotNull FrameLayout.LayoutParams layoutParams, @NotNull Map<String, Object> map) {
        view.getClass();
        layoutParams.getClass();
        map.getClass();
        C5083yb.a(f(), new defpackage.x3(12, this, view, layoutParams), 0L, 2, null);
        super.onAdLoadSuccess(map);
    }

    @Override // com.ironsource.A, com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener
    public void onAdOpened(@NotNull Map<String, Object> map) {
        map.getClass();
        f().a(new tk0(15, this, map));
        super.onAdOpened(map);
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdViewListener
    public void onAdScreenDismissed() {
        f().a(new d11(this, 1));
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdViewListener
    public void onAdScreenPresented() {
        f().a(new d11(this, 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(I2 i2) {
        i2.N();
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdViewListener
    public void onAdLoadSuccess(@NotNull View view, @NotNull FrameLayout.LayoutParams layoutParams) {
        view.getClass();
        layoutParams.getClass();
        onAdLoadSuccess(view, layoutParams, new LinkedHashMap());
    }

    public final void a(@NotNull Bg bg) {
        bg.getClass();
        C5083yb.a(f(), new tk0(16, this, bg), 0L, 2, null);
    }

    @Override // com.ironsource.A
    public void a(@NotNull J j) {
        j.getClass();
        j.a(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(I2 i2) {
        i2.A = null;
        i2.B = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(Throwable th, I2 i2) {
        C4950r4.d().a(th);
        String strY = n30.y("destroyBanner - exception = ", th.getLocalizedMessage());
        IronLog.INTERNAL.error(i2.a(strY));
        i2.f().f().h().g(strY);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(I2 i2, View view, FrameLayout.LayoutParams layoutParams) {
        i2.A = view;
        i2.B = layoutParams;
    }

    @Override // com.ironsource.A
    public void b() {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(q());
        C5083yb.a(f(), new d11(this, 4), 0L, 2, null);
        if (g() == null) {
            ironLog.warning("adapter == null");
        } else {
            c();
            super.b();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(I2 i2, Map map) {
        i2.l().putAll(map);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(I2 i2) {
        i2.P();
    }
}
