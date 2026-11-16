package com.moloco.sdk.publisher;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0007\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/moloco/sdk/publisher/RewardedInterstitialAdShowListener;", "Lcom/moloco/sdk/publisher/InterstitialAdShowListener;", "Lcom/moloco/sdk/publisher/MolocoAd;", "molocoAd", "Laz2;", "onUserRewarded", "(Lcom/moloco/sdk/publisher/MolocoAd;)V", "onRewardedVideoStarted", "onRewardedVideoCompleted", "moloco-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface RewardedInterstitialAdShowListener extends InterstitialAdShowListener {
    void onRewardedVideoCompleted(@NotNull MolocoAd molocoAd);

    void onRewardedVideoStarted(@NotNull MolocoAd molocoAd);

    void onUserRewarded(@NotNull MolocoAd molocoAd);
}
