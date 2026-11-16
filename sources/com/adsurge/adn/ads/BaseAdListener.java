package com.adsurge.adn.ads;

import com.adsurge.adn.ads.rewarded.RewardItem;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public interface BaseAdListener {
    void onAdClicked(AdSurgeAd adSurgeAd);

    void onAdDismissed(AdSurgeAd adSurgeAd);

    void onAdFailed(AdSurgeAdError adSurgeAdError);

    void onAdImpression(AdSurgeAd adSurgeAd);

    void onAdLoaded(AdSurgeAd adSurgeAd);

    void onAdShowFailed(AdSurgeAd adSurgeAd, AdSurgeAdError adSurgeAdError);

    default void onUserEarnedReward(AdSurgeAd adSurgeAd, RewardItem rewardItem) {
    }
}
