package io.p071bidmachine.ads.networks.adaptiverendering;

import android.content.Context;
import com.facebook.appevents.n;
import com.ironsource.C4664b4;
import defpackage.n8;
import defpackage.sg1;
import io.p071bidmachine.AdsType;
import io.p071bidmachine.ContextProvider;
import io.p071bidmachine.HeaderBiddingAdRequestParams;
import io.p071bidmachine.HeaderBiddingAdapter;
import io.p071bidmachine.HeaderBiddingCollectParamsCallback;
import io.p071bidmachine.InitializationParams;
import io.p071bidmachine.NetworkAdUnit;
import io.p071bidmachine.NetworkConfigParams;
import io.p071bidmachine.NetworkInitializationCallback;
import io.p071bidmachine.iab.mraid.u;
import io.p071bidmachine.iab.mraid.v;
import io.p071bidmachine.internal.w0;
import io.p071bidmachine.rendering.b;
import io.p071bidmachine.t1;
import io.p071bidmachine.unified.d;
import io.p071bidmachine.unified.e;
import io.p071bidmachine.unified.g;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lio/bidmachine/ads/networks/adaptiverendering/AdaptiveRenderingAdapter;", "Lio/bidmachine/HeaderBiddingAdapter;", "<init>", "()V", "bidmachine-android-sdk_ba_3_8_0"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class AdaptiveRenderingAdapter extends HeaderBiddingAdapter {
    @Override // io.p071bidmachine.NetworkAdapter
    public final boolean isNetworkInitializationStatusCheckSupported() {
        return false;
    }

    public AdaptiveRenderingAdapter() {
        super("adaptive_rendering", "3.8.0", "3.8.0.1", 1, new AdsType[]{AdsType.Banner, AdsType.Interstitial, AdsType.Rewarded});
    }

    @Override // io.p071bidmachine.NetworkAdapter
    public final e createBanner() {
        return new b();
    }

    @Override // io.p071bidmachine.NetworkAdapter
    public final g createInterstitial() {
        return new d();
    }

    @Override // io.p071bidmachine.NetworkAdapter
    public final g createRewarded() {
        return new d();
    }

    @Override // io.p071bidmachine.NetworkAdapter
    public final void setLogging(boolean z) {
        AtomicBoolean atomicBoolean = b.a;
        t1.b = z;
        u.b = z ? 3 : Integer.MAX_VALUE;
    }

    @Override // io.p071bidmachine.NetworkAdapter
    public final boolean isNetworkInitialized(ContextProvider contextProvider) {
        contextProvider.getClass();
        return false;
    }

    @Override // io.p071bidmachine.HeaderBiddingAdapter
    public final void onCollectHeaderBiddingParams(ContextProvider contextProvider, d dVar, NetworkAdUnit networkAdUnit, HeaderBiddingAdRequestParams headerBiddingAdRequestParams, HeaderBiddingCollectParamsCallback headerBiddingCollectParamsCallback) {
        boolean z;
        contextProvider.getClass();
        dVar.getClass();
        networkAdUnit.getClass();
        headerBiddingAdRequestParams.getClass();
        headerBiddingCollectParamsCallback.getClass();
        HashMap map = new HashMap();
        Context applicationContext = contextProvider.getApplicationContext();
        List listAsList = Arrays.asList(u.c);
        Context applicationContext2 = applicationContext.getApplicationContext();
        boolean z2 = true;
        if (v.a("sms", listAsList) && applicationContext2.getPackageManager().hasSystemFeature("android.hardware.telephony")) {
            z = true;
        } else {
            z = false;
        }
        if (!v.a("tel", listAsList) || !applicationContext2.getPackageManager().hasSystemFeature("android.hardware.telephony")) {
            z2 = false;
        }
        boolean zA = v.a("inlineVideo", listAsList);
        boolean zA2 = v.a("calendar", listAsList);
        boolean zA3 = v.a("storePicture", listAsList);
        ArrayList arrayList = new ArrayList();
        if (z2) {
            arrayList.add("tel");
        }
        if (z) {
            arrayList.add("sms");
        }
        if (zA) {
            arrayList.add("inlineVideo");
        }
        if (zA2) {
            arrayList.add("calendar");
        }
        if (zA3) {
            arrayList.add("storePicture");
        }
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        strArr.getClass();
        map.put(C4664b4.a.v, n8.j0(62, strArr));
        headerBiddingCollectParamsCallback.onCollectFinished(map);
    }

    @Override // io.p071bidmachine.NetworkAdapter
    public final void onNetworkInitialize(ContextProvider contextProvider, InitializationParams initializationParams, NetworkConfigParams networkConfigParams, NetworkInitializationCallback networkInitializationCallback) {
        contextProvider.getClass();
        initializationParams.getClass();
        networkConfigParams.getClass();
        networkInitializationCallback.getClass();
        Context applicationContext = contextProvider.getApplicationContext();
        applicationContext.getClass();
        w0.a(applicationContext);
        n nVar = new n(22);
        sg1 sg1Var = new sg1(applicationContext, 4);
        if (b.a.compareAndSet(false, true)) {
            b.c = nVar;
            b.d = sg1Var;
        }
        networkInitializationCallback.onSuccess();
    }
}
