package com.google.unity.ads.nextgen;

import com.google.android.libraries.ads.mobile.sdk.appopen.AppOpenAd;
import com.google.android.libraries.ads.mobile.sdk.banner.BannerAd;
import com.google.android.libraries.ads.mobile.sdk.banner.BannerAdRequest;
import com.google.android.libraries.ads.mobile.sdk.common.AdLoadCallback;
import com.google.android.libraries.ads.mobile.sdk.common.AdRequest;
import com.google.android.libraries.ads.mobile.sdk.interstitial.InterstitialAd;
import com.google.android.libraries.ads.mobile.sdk.rewarded.RewardedAd;
import com.google.android.libraries.ads.mobile.sdk.rewardedinterstitial.RewardedInterstitialAd;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
class AdWrapper<T> {
    private final AdLoader<T> adLoader;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public interface AdLoader<T> {
        void load(AdRequest adRequest, AdLoadCallback<T> adLoadCallback);
    }

    public static AdWrapper<AppOpenAd> forAppOpen() {
        return new AdWrapper<>(new a(1));
    }

    public static AdWrapper<BannerAd> forBanner() {
        return new AdWrapper<>(new AdLoader<BannerAd>() { // from class: com.google.unity.ads.nextgen.AdWrapper.1
            @Override // com.google.unity.ads.nextgen.AdWrapper.AdLoader
            public void load(AdRequest adRequest, AdLoadCallback<BannerAd> adLoadCallback) {
                if (adRequest instanceof BannerAdRequest) {
                    BannerAd.load((BannerAdRequest) adRequest, adLoadCallback);
                } else {
                    defpackage.d.r("AdRequest must be of type BannerAdRequest for Banner Ads");
                }
            }
        });
    }

    public static AdWrapper<InterstitialAd> forInterstitial() {
        return new AdWrapper<>(new a(3));
    }

    public static AdWrapper<RewardedAd> forRewarded() {
        return new AdWrapper<>(new a(0));
    }

    public static AdWrapper<RewardedInterstitialAd> forRewardedInterstitial() {
        return new AdWrapper<>(new a(2));
    }

    public void load(AdRequest adRequest, AdLoadCallback<T> adLoadCallback) {
        this.adLoader.load(adRequest, adLoadCallback);
    }

    public AdWrapper(AdLoader<T> adLoader) {
        this.adLoader = adLoader;
    }
}
