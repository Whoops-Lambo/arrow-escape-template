package com.ironsource;

import android.app.Activity;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterAdFullScreenInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdRewardListener;
import com.ironsource.mediationsdk.adunit.adapter.listener.InterstitialAdListener;
import com.ironsource.mediationsdk.adunit.adapter.listener.RewardedVideoAdListener;
import com.ironsource.mediationsdk.logger.IronLog;
import com.unity3d.mediation.rewarded.LevelPlayReward;
import defpackage.az2;
import defpackage.cf3;
import defpackage.dk2;
import defpackage.eu;
import defpackage.f20;
import defpackage.fh1;
import defpackage.gg0;
import defpackage.m32;
import defpackage.n30;
import defpackage.sv1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.m6, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class C4863m6 extends A implements InterstitialAdListener, RewardedVideoAdListener, AdapterAdRewardListener {

    @Nullable
    private C4844l5 A;

    private final List<String> L() {
        JSONObject jSONObjectOptJSONObject = new T6().a(new String[]{R6.u}).optJSONObject(R6.u);
        gg0 gg0Var = gg0.a;
        if (jSONObjectOptJSONObject == null) {
            return gg0Var;
        }
        Object objOpt = jSONObjectOptJSONObject.opt(R6.C);
        List list = objOpt instanceof List ? (List) objOpt : null;
        if (list == null) {
            return gg0Var;
        }
        ArrayList arrayList = new ArrayList(eu.f(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(String.valueOf(it.next()));
        }
        return arrayList;
    }

    private final Map<String, Object> N() {
        fh1 fh1Var = new fh1();
        for (String str : L()) {
            List listN0 = dk2.n0(str, new String[]{"="}, 2, 2);
            if (listN0.size() < 2) {
                IronLog.INTERNAL.warning(a("\"" + str + "\" is not a valid key=value format"));
            } else {
                String str2 = (String) listN0.get(0);
                fh1Var.put("custom_" + str2, (String) listN0.get(1));
            }
        }
        return fh1Var.d();
    }

    private final void P() {
        IronLog.INTERNAL.verbose(A.a(this, (String) null, 1, (Object) null));
        f().f().a().d(k());
    }

    @InterfaceC5065xb
    private final void R() {
        IronLog.INTERNAL.verbose(A.a(this, (String) null, 1, (Object) null));
        InterfaceC4881n6 interfaceC4881n6M = M();
        if (interfaceC4881n6M != null) {
            interfaceC4881n6M.a(this);
        }
    }

    private final void S() {
        IronLog.INTERNAL.verbose(A.a(this, (String) null, 1, (Object) null));
        f().f().a().i(k());
    }

    private final void T() {
        IronLog.INTERNAL.verbose(A.a(this, (String) null, 1, (Object) null));
        f().f().a().k(k());
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4863m6(@NotNull T0 t0, @NotNull B b, @NotNull H h) {
        super(t0, b, h, null, null, 24, null);
        t0.getClass();
        b.getClass();
        h.getClass();
    }

    private final InterfaceC4881n6 M() {
        E eS = s();
        if (eS instanceof InterfaceC4881n6) {
            return (InterfaceC4881n6) eS;
        }
        return null;
    }

    @InterfaceC5065xb
    private final void O() {
        if (w()) {
            f().f().h().l("closed after failure");
            return;
        }
        if (!z()) {
            a(1000, "ad closed before ad opened");
            return;
        }
        this.A = new C4844l5();
        IronLog.INTERNAL.verbose(A.a(this, (String) null, 1, (Object) null));
        f().f().a().a(k(), "");
        InterfaceC4881n6 interfaceC4881n6M = M();
        if (interfaceC4881n6M != null) {
            interfaceC4881n6M.b(this);
        }
        c();
    }

    @InterfaceC5065xb
    private final void Q() {
        if (w()) {
            f().f().h().l("rewarded after failure");
            return;
        }
        Map<String, Object> mapN = N();
        long jCurrentTimeMillis = System.currentTimeMillis();
        String strA = f().a(jCurrentTimeMillis, p());
        long jA = C4844l5.a(this.A);
        LevelPlayReward levelPlayRewardA = Pb.w.d().E().a(k(), n().j().b().c());
        f().f().a().a(k(), levelPlayRewardA.getName(), levelPlayRewardA.getAmount(), jCurrentTimeMillis, strA, jA, mapN, f().j());
        InterfaceC4881n6 interfaceC4881n6M = M();
        if (interfaceC4881n6M != null) {
            interfaceC4881n6M.a(this, levelPlayRewardA);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final az2 a(C4863m6 c4863m6, Activity activity, m32 m32Var) {
        try {
            if (c4863m6.g() instanceof AdapterAdFullScreenInterface) {
                Object objG = c4863m6.g();
                objG.getClass();
                ((AdapterAdFullScreenInterface) objG).showAd(c4863m6.i(), activity, c4863m6);
            } else {
                m32Var.a = "showAd - adapter not instance of AdapterAdFullScreenInterface";
                IronLog.INTERNAL.error(c4863m6.a("showAd - adapter not instance of AdapterAdFullScreenInterface"));
                c4863m6.f().a(new io.p071bidmachine.media3.exoplayer.video.x(23, c4863m6, m32Var));
            }
        } catch (Throwable th) {
            c4863m6.f().a(new io.p071bidmachine.media3.ui.c0(14, th, m32Var, c4863m6));
        }
        return az2.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(C4863m6 c4863m6) {
        c4863m6.O();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(C4863m6 c4863m6) {
        c4863m6.R();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(C4863m6 c4863m6) {
        c4863m6.Q();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(C4863m6 c4863m6) {
        c4863m6.S();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(C4863m6 c4863m6) {
        c4863m6.T();
    }

    @Override // com.ironsource.A
    public void D() {
        if (g() instanceof AdapterAdFullScreenInterface) {
            Object objG = g();
            objG.getClass();
            ((AdapterAdFullScreenInterface) objG).loadAd(n().h(), ContextProvider.getInstance().getActiveContext(), this);
            return;
        }
        IronLog.INTERNAL.error(a("adapter not instance of AdapterAdFullScreenInterface"));
    }

    @Override // com.ironsource.A
    public void c() {
        if (g() instanceof AdapterAdFullScreenInterface) {
            a(new sv1(this, 13));
        } else {
            IronLog.INTERNAL.error(a("adapter not instance of AdapterAdFullScreenInterface"));
        }
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdInteractionListener
    public void onAdClosed() {
        f().a(new cf3(this, 4));
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdInteractionListener
    public void onAdEnded() {
        f().a(new cf3(this, 3));
    }

    @Override // com.ironsource.A, com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener
    public void onAdOpened(@NotNull Map<String, Object> map) {
        map.getClass();
        super.onAdOpened(map);
        f().a(new cf3(this, 0));
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdRewardListener
    public void onAdRewarded() {
        f().a(new cf3(this, 5));
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdInteractionListener
    public void onAdStarted() {
        f().a(new cf3(this, 2));
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdInteractionListener
    public void onAdVisible() {
        f().a(new cf3(this, 1));
    }

    @Override // com.ironsource.A, com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener
    public void onAdOpened() {
        onAdOpened(new LinkedHashMap());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(C4863m6 c4863m6) {
        c4863m6.P();
    }

    @InterfaceC5065xb
    public final void a(@NotNull Activity activity) {
        activity.getClass();
        IronLog.INTERNAL.verbose(a("placementName = " + k()));
        m32 m32Var = new m32();
        f().f().a().a(activity, k());
        a(new f20(8, this, activity, m32Var));
    }

    @Override // com.ironsource.A
    public void a(@NotNull J j) {
        j.getClass();
        j.a(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(C4863m6 c4863m6, m32 m32Var) {
        c4863m6.f().f().h().g((String) m32Var.a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(Throwable th, m32 m32Var, C4863m6 c4863m6) {
        C4950r4.d().a(th);
        String strY = n30.y("showAd - exception = ", th.getMessage());
        m32Var.a = strY;
        IronLog.INTERNAL.error(c4863m6.a(strY));
        c4863m6.f().f().h().g((String) m32Var.a);
        c4863m6.a(A0.h(c4863m6.n().i()), (String) m32Var.a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final az2 a(C4863m6 c4863m6) {
        try {
            Object objG = c4863m6.g();
            objG.getClass();
            ((AdapterAdFullScreenInterface) objG).destroyAd(c4863m6.n().h());
        } catch (Throwable th) {
            c4863m6.f().a(new io.p071bidmachine.media3.exoplayer.video.x(24, th, c4863m6));
        }
        return az2.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(Throwable th, C4863m6 c4863m6) {
        C4950r4.d().a(th);
        String strY = n30.y("destroyAd - exception = ", th.getLocalizedMessage());
        IronLog.INTERNAL.error(c4863m6.a(strY));
        c4863m6.f().f().h().g(strY);
    }
}
