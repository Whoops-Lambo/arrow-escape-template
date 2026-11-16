package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Pair;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.WebView;
import androidx.core.util.Consumer;
import com.adsurge.adn.ads.AdSurgeAdError;
import com.applovin.impl.adview.a;
import com.applovin.impl.g3;
import com.applovin.impl.mediation.c;
import com.applovin.impl.sdk.nativeAd.AppLovinNativeAdImpl;
import com.applovin.sdk.AppLovinAd;
import com.facebook.appevents.a0;
import com.facebook.appevents.f;
import com.facebook.appevents.j;
import com.facebook.appevents.k;
import com.facebook.appevents.n;
import com.facebook.appevents.o;
import com.facebook.g;
import com.facebook.g0;
import com.facebook.i;
import com.facebook.internal.FetchedAppSettingsManager;
import com.facebook.internal.e1;
import com.facebook.internal.f0;
import com.facebook.internal.h0;
import com.facebook.internal.t;
import com.facebook.login.s;
import com.facebook.m0;
import com.facebook.n0;
import com.ironsource.C4656ae;
import com.ironsource.C4689cb;
import com.ironsource.C4690cc;
import com.ironsource.C4692ce;
import com.ironsource.C4694cg;
import com.ironsource.C4911p0;
import com.ironsource.InterfaceC4821k0;
import com.ironsource.R9;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.moloco.sdk.internal.unity_bridge.MolocoUnityShowCallback;
import com.moloco.sdk.publisher.MolocoAdError;
import com.unity3d.mediation.LevelPlayAdInfo;
import com.unity3d.mediation.impression.LevelPlayImpressionDataListener;
import com.vungle.ads.internal.session.b;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class y93 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ y93(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = 0;
        switch (this.a) {
            case 0:
                ((a) this.b).b((MotionEvent) this.c);
                return;
            case 1:
                ((a) this.b).b((WebView) this.c);
                return;
            case 2:
                ((com.mbridge.msdk.config.manager.callback.a) this.b).a((HashMap) this.c);
                return;
            case 3:
                ((a) this.b).a((AppLovinAd) this.c);
                return;
            case 4:
                C4656ae.a((C4656ae) this.b, (IronSourceError) this.c);
                return;
            case 5:
                b.a((File) this.b, (String) this.c);
                return;
            case 6:
                ((com.adsurge.adn.J.b) this.b).a((AdSurgeAdError) this.c);
                return;
            case 7:
                ((com.applovin.impl.mediation.b) this.b).c((g3) this.c);
                return;
            case 8:
                ((com.applovin.impl.sdk.nativeAd.b) this.b).b((AppLovinNativeAdImpl) this.c);
                return;
            case 9:
                ((c) this.b).a((g3) this.c);
                return;
            case 10:
                com.vungle.ads.internal.platform.c.a((com.vungle.ads.internal.platform.c) this.b, (Consumer) this.c);
                return;
            case 11:
                C4689cb.a((C4689cb) this.b, (LevelPlayAdInfo) this.c);
                return;
            case 12:
                C4689cb.a((C4689cb) this.b, (LevelPlayImpressionDataListener) this.c);
                return;
            case 13:
                C4689cb.a((InterfaceC4821k0) this.b, (C4689cb) this.c);
                return;
            case 14:
                C4689cb.a.a((C4911p0) this.b, (String) this.c);
                return;
            case 15:
                C4690cc.a((Throwable) this.b, (C4690cc) this.c);
                return;
            case 16:
                C4692ce.a((C4692ce) this.b, (IronSourceError) this.c);
                return;
            case 17:
                C4692ce.a((C4692ce) this.b, (R9) this.c);
                return;
            case 18:
                C4694cg.a((C4694cg) this.b, (String) this.c);
                return;
            case 19:
                ((i) this.b).b((com.facebook.a) this.c);
                return;
            case 20:
                ArrayList arrayList = (ArrayList) this.b;
                m0 m0Var = (m0) this.c;
                m0Var.getClass();
                int size = arrayList.size();
                int i2 = 0;
                while (i2 < size) {
                    Object obj = arrayList.get(i2);
                    i2++;
                    Pair pair = (Pair) obj;
                    g0 g0Var = (g0) pair.first;
                    Object obj2 = pair.second;
                    obj2.getClass();
                    g0Var.onCompleted((n0) obj2);
                }
                ArrayList arrayList2 = m0Var.d;
                int size2 = arrayList2.size();
                while (i < size2) {
                    Object obj3 = arrayList2.get(i);
                    i++;
                    ((g) obj3).a.run();
                }
                return;
            case 21:
                com.facebook.appevents.b bVar = (com.facebook.appevents.b) this.b;
                f fVar = (f) this.c;
                if (lz.a.contains(j.class)) {
                    return;
                }
                try {
                    bVar.getClass();
                    com.facebook.ads.a aVar = j.a;
                    synchronized (aVar) {
                        a0 a0VarH = aVar.H(bVar);
                        if (a0VarH != null) {
                            a0VarH.a(fVar);
                        }
                        break;
                    }
                    String str = o.c;
                    if (n.n() != 2 && j.a.G() > 100) {
                        j.d(5);
                        return;
                    } else {
                        if (j.c == null) {
                            j.c = j.b.schedule(j.d, 15L, TimeUnit.SECONDS);
                            return;
                        }
                        return;
                    }
                } catch (Throwable th) {
                    lz.a(j.class, th);
                    return;
                }
            case 22:
                com.facebook.appevents.b bVar2 = (com.facebook.appevents.b) this.b;
                a0 a0Var = (a0) this.c;
                if (lz.a.contains(j.class)) {
                    return;
                }
                try {
                    k.p(bVar2, a0Var);
                    return;
                } catch (Throwable th2) {
                    lz.a(j.class, th2);
                    return;
                }
            case 23:
                Context context = (Context) this.b;
                o oVar = (o) this.c;
                Bundle bundle = new Bundle();
                String[] strArr = {"com.facebook.core.Core", "com.facebook.login.Login", "com.facebook.share.Share", "com.facebook.places.Places", "com.facebook.messenger.Messenger", "com.facebook.applinks.AppLinks", "com.facebook.marketing.Marketing", "com.facebook.gamingservices.GamingServices", "com.facebook.all.All", "com.android.billingclient.api.BillingClient", "com.android.vending.billing.IInAppBillingService"};
                String[] strArr2 = {"core_lib_included", "login_lib_included", "share_lib_included", "places_lib_included", "messenger_lib_included", "applinks_lib_included", "marketing_lib_included", "gamingservices_lib_included", "all_lib_included", "billing_client_lib_included", "billing_service_lib_included"};
                int i3 = 0;
                for (int i4 = 0; i4 < 11; i4++) {
                    String str2 = strArr[i4];
                    String str3 = strArr2[i4];
                    try {
                        Class.forName(str2);
                        bundle.putInt(str3, 1);
                        i3 |= 1 << i4;
                    } catch (ClassNotFoundException unused) {
                    }
                }
                SharedPreferences sharedPreferences = context.getSharedPreferences("com.facebook.sdk.appEventPreferences", 0);
                if (sharedPreferences.getInt("kitsBitmask", 0) != i3) {
                    sharedPreferences.edit().putInt("kitsBitmask", i3).apply();
                    oVar.h(bundle, "fb_sdk_initialize");
                    return;
                }
                return;
            case 24:
                FetchedAppSettingsManager.pollCallbacks$lambda$2((h0) this.b, (f0) this.c);
                return;
            case 25:
                t tVar = (t) this.b;
                e1 e1Var = (e1) this.c;
                try {
                    ((x53) tVar.a).run();
                    return;
                } finally {
                    e1Var.a(tVar);
                }
            case 26:
                s sVar = (s) this.b;
                Bundle bundle2 = (Bundle) this.c;
                if (lz.a.contains(s.class)) {
                    return;
                }
                try {
                    sVar.a(bundle2, "fb_mobile_login_heartbeat");
                    return;
                } catch (Throwable th3) {
                    lz.a(s.class, th3);
                    return;
                }
            case 27:
                ((MolocoUnityShowCallback) this.b).onAdShowFailed((String) this.c, "Ad cannot be shown as it was not loaded");
                return;
            case 28:
                MolocoUnityShowCallback molocoUnityShowCallback = (MolocoUnityShowCallback) this.b;
                MolocoAdError molocoAdError = (MolocoAdError) this.c;
                molocoUnityShowCallback.onAdShowFailed(molocoAdError.getAdUnitId(), molocoAdError.toString());
                return;
            default:
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.t.a((View) this.b, (sr0) this.c);
                return;
        }
    }
}
