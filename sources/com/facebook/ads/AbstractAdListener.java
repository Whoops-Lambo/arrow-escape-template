package com.facebook.ads;

import androidx.annotation.Keep;
import com.facebook.infer.annotation.Nullsafe;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
@Keep
@Nullsafe(Nullsafe.Mode.LOCAL)
public class AbstractAdListener implements InterstitialAdExtendedListener, RewardedVideoAdExtendedListener, RewardedInterstitialAdExtendedListener {
    @Override // com.facebook.ads.AdListener
    public void onAdClicked(Ad ad) {
    }

    @Override // com.facebook.ads.AdListener
    public void onAdLoaded(Ad ad) {
    }

    @Override // com.facebook.ads.AdListener
    public void onError(Ad ad, AdError adError) {
    }

    @Override // com.facebook.ads.InterstitialAdExtendedListener
    public void onInterstitialActivityDestroyed() {
    }

    @Override // com.facebook.ads.InterstitialAdListener
    public void onInterstitialDismissed(Ad ad) {
    }

    @Override // com.facebook.ads.InterstitialAdListener
    public void onInterstitialDisplayed(Ad ad) {
    }

    @Override // com.facebook.ads.AdListener
    public void onLoggingImpression(Ad ad) {
    }

    @Override // com.facebook.ads.RewardedAdListener
    public void onRewardedAdCompleted() {
    }

    @Override // com.facebook.ads.RewardedAdListener
    public void onRewardedAdServerFailed() {
    }

    @Override // com.facebook.ads.RewardedAdListener
    public void onRewardedAdServerSucceeded() {
    }

    @Override // com.facebook.ads.RewardedInterstitialAdExtendedListener
    public void onRewardedInterstitialActivityDestroyed() {
    }

    @Override // com.facebook.ads.RewardedInterstitialAdListener
    public void onRewardedInterstitialClosed() {
    }

    @Override // com.facebook.ads.RewardedInterstitialAdListener
    public void onRewardedInterstitialCompleted() {
    }

    @Override // com.facebook.ads.RewardedVideoAdExtendedListener
    public void onRewardedVideoActivityDestroyed() {
    }

    @Override // com.facebook.ads.RewardedVideoAdListener
    public void onRewardedVideoClosed() {
    }

    @Override // com.facebook.ads.RewardedVideoAdListener
    public void onRewardedVideoCompleted() {
    }
}
