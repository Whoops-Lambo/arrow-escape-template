package com.ironsource;

import com.unity3d.mediation.LevelPlayAdError;
import com.unity3d.mediation.LevelPlayAdInfo;
import com.unity3d.mediation.rewarded.LevelPlayReward;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: com.ironsource.db, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public interface InterfaceC4707db {
    void onAdClicked(@NotNull LevelPlayAdInfo levelPlayAdInfo);

    void onAdClosed(@NotNull LevelPlayAdInfo levelPlayAdInfo);

    void onAdDisplayFailed(@NotNull LevelPlayAdError levelPlayAdError, @NotNull LevelPlayAdInfo levelPlayAdInfo);

    void onAdDisplayed(@NotNull LevelPlayAdInfo levelPlayAdInfo);

    void onAdInfoChanged(@NotNull LevelPlayAdInfo levelPlayAdInfo);

    void onAdLoadFailed(@NotNull LevelPlayAdError levelPlayAdError);

    void onAdLoaded(@NotNull LevelPlayAdInfo levelPlayAdInfo);

    default void onAdRewarded(@NotNull LevelPlayReward levelPlayReward, @NotNull LevelPlayAdInfo levelPlayAdInfo) {
        levelPlayReward.getClass();
        levelPlayAdInfo.getClass();
    }
}
