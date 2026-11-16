package com.vungle.ads.internal;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import com.vungle.ads.AdNotLoadedCantPlay;
import com.vungle.ads.BaseFullscreenAd;
import com.vungle.ads.VungleAdSize;
import com.vungle.ads.VungleError;
import com.vungle.ads.internal.model.j3;
import com.vungle.ads.internal.protos.Sdk;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public abstract class x0 extends r {
    public WeakReference q;

    @Override // com.vungle.ads.internal.r
    public final VungleAdSize b() {
        return null;
    }

    public com.vungle.ads.internal.presenter.z k() {
        return null;
    }

    public static final void a(x0 x0Var, w0 w0Var, com.vungle.ads.internal.model.i0 i0Var, j3 j3Var) {
        Context contextD;
        WeakReference weakReference = x0Var.q;
        if (weakReference == null || (contextD = (Context) weakReference.get()) == null) {
            contextD = x0Var.d();
        }
        contextD.getClass();
        com.vungle.ads.internal.presenter.a aVar = new com.vungle.ads.internal.presenter.a(w0Var, j3Var);
        u0 u0Var = new u0(i0Var, j3Var, x0Var.k());
        u0 u0Var2 = com.vungle.ads.internal.ui.l.h;
        com.vungle.ads.internal.ui.a.a(u0Var);
        com.vungle.ads.internal.ui.a.a(aVar);
        Intent intentA = com.vungle.ads.internal.ui.a.a(contextD, j3Var.b(), i0Var.h());
        com.vungle.ads.internal.util.d dVar = com.vungle.ads.internal.util.d.f;
        if (!com.vungle.ads.internal.util.a.a()) {
            boolean z = com.vungle.ads.internal.util.u.a;
            com.vungle.ads.internal.util.t.a("FullscreenAdInternal", "The ad activity is in background on play, log AD_VISIBILITY_INVISIBLE.");
            intentA.putExtra("ad_invisible_logged", true);
            AnalyticsClient analyticsClient = AnalyticsClient.INSTANCE;
            i2 i2Var = new i2(Sdk.SDKMetric.SDKMetricType.AD_VISIBILITY);
            i2Var.a((Long) 1L);
            AnalyticsClient.a(analyticsClient, i2Var, x0Var.e(), 4);
        }
        x0Var.g().d();
        AnalyticsClient.a(AnalyticsClient.INSTANCE, x0Var.g(), x0Var.e());
        x0Var.h().e();
        com.vungle.ads.internal.util.a.a(contextD, null, intentA, null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x0(Context context) {
        super(context);
        context.getClass();
    }

    public final void a(Context context, BaseFullscreenAd.AnonymousClass2 anonymousClass2) {
        anonymousClass2.getClass();
        g().e();
        this.q = context != null ? new WeakReference(context) : null;
        VungleError vungleErrorA = a(true);
        if (vungleErrorA != null) {
            anonymousClass2.onFailure(vungleErrorA);
            if (a(vungleErrorA.getCom.tiktok.appevents.edp.TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE java.lang.String())) {
                a(h.g);
                return;
            }
            return;
        }
        com.vungle.ads.internal.model.i0 i0VarC = c();
        j3 j3VarF = f();
        if (i0VarC != null && j3VarF != null) {
            w0 w0Var = new w0(anonymousClass2, this);
            a();
            Handler handler = com.vungle.ads.internal.util.y.a;
            com.vungle.ads.internal.util.y.a(new v0(this, w0Var, i0VarC, j3VarF));
            return;
        }
        anonymousClass2.onFailure(new AdNotLoadedCantPlay("Ad or Placement is null: pl=" + j3VarF + " adv=" + i0VarC).setLogEntry$vungle_ads_release(e()).logError$vungle_ads_release());
    }

    @Override // com.vungle.ads.internal.r
    public final boolean a(VungleAdSize vungleAdSize) {
        return true;
    }
}
