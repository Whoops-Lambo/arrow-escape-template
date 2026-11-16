package com.unity3d.ironsourceads.interstitial;

import com.ironsource.mediationsdk.logger.IronSourceError;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public interface InterstitialAdLoaderListener {
    void onInterstitialAdLoadFailed(@NotNull IronSourceError ironSourceError);

    void onInterstitialAdLoaded(@NotNull InterstitialAd interstitialAd);
}
