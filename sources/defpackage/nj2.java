package defpackage;

import android.app.Activity;
import android.view.View;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.RecyclerView;
import com.adsurge.adn.p059u.a;
import com.applovin.mediation.unity.Utils;
import com.google.android.exoplayer2.ui.StyledPlayerControlView;
import com.google.android.material.textfield.TextInputLayout;
import com.google.unity.ads.nextgen.UnityAppOpenAd;
import com.google.unity.ads.nextgen.UnityInterstitialAd;
import com.google.unity.ads.nextgen.UnityRewardedAd;
import com.google.unity.ads.nextgen.UnityRewardedInterstitialAd;
import com.inmobi.media.W2;
import com.ironsource.V9;
import com.mbridge.msdk.config.component.status.b;
import com.tiktok.appevents.DeeplinkCallbackWrapper;
import com.tiktok.appevents.TTAppEventLogger;
import com.unity3d.ads.core.domain.InternalLoadListener;
import com.unity3d.ironsourceads.InitListener;
import com.unity3d.services.ads.UnityAdsImplementation;
import com.usercentrics.sdk.ui.components.UCButton;
import com.usercentrics.sdk.ui.components.UCToggle;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.concurrent.atomic.AtomicMarkableReference;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class nj2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ nj2(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        String str = null;
        Map mapUnmodifiableMap = null;
        int i2 = 0;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((oj2) obj).b();
                return;
            case 1:
                ((StyledPlayerControlView) obj).updateProgress();
                return;
            case 2:
                TTAppEventLogger.lambda$fetchDeferredDeeplinkWithCompletion$9((DeeplinkCallbackWrapper) obj);
                return;
            case 3:
                ((TextInputLayout) obj).d.requestLayout();
                return;
            case 4:
                ((Toolbar) obj).o();
                return;
            case 5:
                it2 it2Var = (it2) obj;
                it2Var.getClass();
                it2Var.a(eh.d, null);
                return;
            case 6:
                yt2.setCardClickable$lambda$8$lambda$7((UCButton) obj);
                return;
            case 7:
                ((qu2) obj).p();
                return;
            case 8:
                h00.d((LinearLayoutCompat) obj);
                return;
            case 9:
                ((RecyclerView) obj).requestLayout();
                return;
            case 10:
                int i3 = UCToggle.V;
                h00.c(4, (UCToggle) obj);
                return;
            case 11:
                UnityAdsImplementation.lambda$load$2((InternalLoadListener) obj);
                return;
            case 12:
                ((UnityAppOpenAd) obj).lambda$show$0();
                return;
            case 13:
                ((UnityInterstitialAd) obj).lambda$show$0();
                return;
            case 14:
                ((UnityRewardedAd) obj).lambda$show$0();
                return;
            case 15:
                ((UnityRewardedInterstitialAd) obj).lambda$show$0();
                return;
            case 16:
                lt0 lt0Var = (lt0) obj;
                synchronized (((AtomicMarkableReference) lt0Var.h)) {
                    try {
                        if (((AtomicMarkableReference) lt0Var.h).isMarked()) {
                            str = (String) ((AtomicMarkableReference) lt0Var.h).getReference();
                            ((AtomicMarkableReference) lt0Var.h).set(str, false);
                            i2 = 1;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                if (i2 != 0) {
                    ((rl1) lt0Var.c).i((String) lt0Var.b, str);
                    return;
                }
                return;
            case 17:
                ic0 ic0Var = (ic0) obj;
                ((AtomicReference) ic0Var.c).set(null);
                synchronized (ic0Var) {
                    if (((AtomicMarkableReference) ic0Var.b).isMarked()) {
                        lc1 lc1Var = (lc1) ((AtomicMarkableReference) ic0Var.b).getReference();
                        synchronized (lc1Var) {
                            mapUnmodifiableMap = Collections.unmodifiableMap(new HashMap(lc1Var.a));
                        }
                        AtomicMarkableReference atomicMarkableReference = (AtomicMarkableReference) ic0Var.b;
                        atomicMarkableReference.set((lc1) atomicMarkableReference.getReference(), false);
                    }
                }
                if (mapUnmodifiableMap != null) {
                    lt0 lt0Var2 = (lt0) ic0Var.d;
                    ((rl1) lt0Var2.c).h((String) lt0Var2.b, mapUnmodifiableMap, ic0Var.a);
                    return;
                }
                return;
            case 18:
                Utils.lambda$runSafelyOnUiThread$0((Runnable) obj);
                return;
            case 19:
                V9.a((InitListener) obj);
                return;
            case 20:
                d63 d63Var = (d63) obj;
                if (lz.a.contains(d63.class)) {
                    return;
                }
                try {
                    WeakReference weakReference = d63Var.a;
                    View viewV = j7.V((Activity) weakReference.get());
                    Activity activity = (Activity) weakReference.get();
                    if (viewV != null && activity != null) {
                        ArrayList arrayListA = ll2.a(viewV);
                        int size = arrayListA.size();
                        while (i2 < size) {
                            Object obj2 = arrayListA.get(i2);
                            i2++;
                            View view = (View) obj2;
                            if (!k92.k(view)) {
                                String strD = ll2.d(view);
                                if (strD.length() > 0 && strD.length() <= 300) {
                                    HashSet hashSet = h63.e;
                                    String localClassName = activity.getLocalClassName();
                                    localClassName.getClass();
                                    l71.j(view, viewV, localClassName);
                                }
                            }
                        }
                        return;
                    }
                    return;
                } catch (Exception unused) {
                    return;
                } catch (Throwable th2) {
                    lz.a(d63.class, th2);
                    return;
                }
            case 21:
                W2.a((W2) obj);
                return;
            case 22:
                m62 m62Var = (m62) obj;
                ((s62) ((bm2) m62Var.e)).q(new hl2(m62Var, 12));
                return;
            case 23:
                ((a) obj).a();
                return;
            case 24:
                ((com.adsurge.adn.p067y.a) obj).b();
                return;
            case 25:
                ((com.mbridge.msdk.config.manager.a) obj).f();
                return;
            case 26:
                ((b) obj).c();
                return;
            case 27:
                ((com.applovin.impl.sdk.b) obj).c();
                return;
            case 28:
                ((com.adsurge.adn.B.b) obj).e();
                return;
            default:
                ((com.mbridge.msdk.config.component.info.provider.subprovider.b) obj).f();
                return;
        }
    }
}
