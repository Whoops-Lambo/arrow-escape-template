package io.p071bidmachine.ads.networks.mraid;

import io.p071bidmachine.AdsType;
import io.p071bidmachine.ContextProvider;
import io.p071bidmachine.HeaderBiddingAdRequestParams;
import io.p071bidmachine.HeaderBiddingAdapter;
import io.p071bidmachine.HeaderBiddingCollectParamsCallback;
import io.p071bidmachine.InitializationParams;
import io.p071bidmachine.NetworkAdUnit;
import io.p071bidmachine.NetworkConfigParams;
import io.p071bidmachine.NetworkInitializationCallback;
import io.p071bidmachine.iab.bridge.a;
import io.p071bidmachine.iab.bridge.c;
import io.p071bidmachine.iab.mraid.u;
import io.p071bidmachine.iab.mraid.y;
import io.p071bidmachine.internal.w0;
import io.p071bidmachine.unified.d;
import io.p071bidmachine.unified.e;
import io.p071bidmachine.unified.g;
import java.util.HashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lio/bidmachine/ads/networks/mraid/MraidAdapter;", "Lio/bidmachine/HeaderBiddingAdapter;", "<init>", "()V", "bidmachine-android-sdk_ba_3_8_0"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class MraidAdapter extends HeaderBiddingAdapter {
    public static final AtomicBoolean a = new AtomicBoolean(false);

    @Override // io.p071bidmachine.NetworkAdapter
    public final boolean isNetworkInitializationStatusCheckSupported() {
        return false;
    }

    public MraidAdapter() {
        super("mraid", "3.8.0", "3.8.0.1", 1, new AdsType[]{AdsType.Banner, AdsType.Interstitial, AdsType.Rewarded});
    }

    @Override // io.p071bidmachine.NetworkAdapter
    public final e createBanner() {
        return new a();
    }

    @Override // io.p071bidmachine.NetworkAdapter
    public final g createInterstitial() {
        return new io.p071bidmachine.ads.networks.gam.e(y.a, 2);
    }

    @Override // io.p071bidmachine.NetworkAdapter
    public final g createRewarded() {
        return new io.p071bidmachine.ads.networks.gam.e(y.b, 2);
    }

    @Override // io.p071bidmachine.NetworkAdapter
    public final void setLogging(boolean z) {
        u.b = z ? 3 : Integer.MAX_VALUE;
    }

    @Override // io.p071bidmachine.NetworkAdapter
    public final boolean isNetworkInitialized(ContextProvider contextProvider) {
        contextProvider.getClass();
        return false;
    }

    @Override // io.p071bidmachine.HeaderBiddingAdapter
    public final void onCollectHeaderBiddingParams(ContextProvider contextProvider, d dVar, NetworkAdUnit networkAdUnit, HeaderBiddingAdRequestParams headerBiddingAdRequestParams, HeaderBiddingCollectParamsCallback headerBiddingCollectParamsCallback) {
        contextProvider.getClass();
        dVar.getClass();
        networkAdUnit.getClass();
        headerBiddingAdRequestParams.getClass();
        headerBiddingCollectParamsCallback.getClass();
        headerBiddingCollectParamsCallback.onCollectFinished(new HashMap());
    }

    @Override // io.p071bidmachine.NetworkAdapter
    public final void onNetworkInitialize(ContextProvider contextProvider, InitializationParams initializationParams, NetworkConfigParams networkConfigParams, NetworkInitializationCallback networkInitializationCallback) {
        contextProvider.getClass();
        initializationParams.getClass();
        networkConfigParams.getClass();
        networkInitializationCallback.getClass();
        if (a.compareAndSet(false, true)) {
            c cVar = new c();
            CopyOnWriteArrayList copyOnWriteArrayList = a.a;
            if (!copyOnWriteArrayList.contains(cVar)) {
                copyOnWriteArrayList.add(cVar);
            }
        }
        w0.a(contextProvider.getContext());
        networkInitializationCallback.onSuccess();
    }
}
