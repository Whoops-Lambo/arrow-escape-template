package com.unity3d.ironsourceads.rewarded;

import com.ironsource.mediationsdk.logger.IronSourceError;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public interface RewardedAdListener {
    void onRewardedAdClicked(@NotNull RewardedAd rewardedAd);

    void onRewardedAdDismissed(@NotNull RewardedAd rewardedAd);

    void onRewardedAdFailedToShow(@NotNull RewardedAd rewardedAd, @NotNull IronSourceError ironSourceError);

    void onRewardedAdShown(@NotNull RewardedAd rewardedAd);

    void onUserEarnedReward(@NotNull RewardedAd rewardedAd);
}
