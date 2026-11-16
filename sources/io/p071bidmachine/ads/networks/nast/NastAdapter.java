package io.p071bidmachine.ads.networks.nast;

import io.p071bidmachine.AdsType;
import io.p071bidmachine.ContextProvider;
import io.p071bidmachine.HeaderBiddingAdRequestParams;
import io.p071bidmachine.HeaderBiddingAdapter;
import io.p071bidmachine.HeaderBiddingCollectParamsCallback;
import io.p071bidmachine.InitializationParams;
import io.p071bidmachine.NetworkAdUnit;
import io.p071bidmachine.NetworkConfigParams;
import io.p071bidmachine.NetworkInitializationCallback;
import io.p071bidmachine.unified.d;
import io.p071bidmachine.unified.j;
import java.util.HashMap;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lio/bidmachine/ads/networks/nast/NastAdapter;", "Lio/bidmachine/HeaderBiddingAdapter;", "<init>", "()V", "bidmachine-android-sdk_ba_3_8_0"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class NastAdapter extends HeaderBiddingAdapter {
    @Override // io.p071bidmachine.NetworkAdapter
    public final boolean isNetworkInitializationStatusCheckSupported() {
        return false;
    }

    public NastAdapter() {
        super("nast", "1.0", "3.8.0.1", 1, new AdsType[]{AdsType.Native});
    }

    @Override // io.p071bidmachine.NetworkAdapter
    public final j createNativeAd() {
        return new a();
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
        networkInitializationCallback.onSuccess();
    }
}
