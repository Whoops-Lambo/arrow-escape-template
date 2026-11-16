package com.unity3d.ironsourceads.rewarded;

import android.app.Activity;
import com.ironsource.C4656ae;
import com.ironsource.InterfaceC4674be;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class RewardedAd implements InterfaceC4674be {

    @NotNull
    private final C4656ae a;

    @Nullable
    private RewardedAdListener b;

    @NotNull
    public final RewardedAdInfo getAdInfo() {
        return this.a.b();
    }

    @Nullable
    public final RewardedAdListener getListener() {
        return this.b;
    }

    public final boolean isReadyToShow() {
        IronLog.API.info();
        return this.a.d();
    }

    @Override // com.ironsource.InterfaceC4674be
    public void onAdInstanceDidBecomeVisible() {
        IronLog.CALLBACK.info("RewardedAdListener onRewardedAdShown adInfo: " + getAdInfo());
        RewardedAdListener rewardedAdListener = this.b;
        if (rewardedAdListener != null) {
            rewardedAdListener.onRewardedAdShown(this);
        }
    }

    @Override // com.ironsource.InterfaceC4674be
    public void onRewardedAdClicked() {
        IronLog.CALLBACK.info("RewardedAdListener onRewardedAdClicked adInfo: " + getAdInfo());
        RewardedAdListener rewardedAdListener = this.b;
        if (rewardedAdListener != null) {
            rewardedAdListener.onRewardedAdClicked(this);
        }
    }

    @Override // com.ironsource.InterfaceC4674be
    public void onRewardedAdDismissed() {
        IronLog.CALLBACK.info("RewardedAdListener onRewardedAdDismissed adInfo: " + getAdInfo());
        RewardedAdListener rewardedAdListener = this.b;
        if (rewardedAdListener != null) {
            rewardedAdListener.onRewardedAdDismissed(this);
        }
    }

    @Override // com.ironsource.InterfaceC4674be
    public void onRewardedAdShown() {
        IronLog.CALLBACK.info("RewardedAdListener onRewardedAdShown adInfo: " + getAdInfo());
        RewardedAdListener rewardedAdListener = this.b;
        if (rewardedAdListener != null) {
            rewardedAdListener.onRewardedAdShown(this);
        }
    }

    @Override // com.ironsource.InterfaceC4674be
    public void onUserEarnedReward() {
        IronLog.CALLBACK.info("RewardedAdListener onUserEarnedReward adInfo: " + getAdInfo());
        RewardedAdListener rewardedAdListener = this.b;
        if (rewardedAdListener != null) {
            rewardedAdListener.onUserEarnedReward(this);
        }
    }

    public final void setListener(@Nullable RewardedAdListener rewardedAdListener) {
        this.b = rewardedAdListener;
    }

    public RewardedAd(@NotNull C4656ae c4656ae) {
        c4656ae.getClass();
        this.a = c4656ae;
        c4656ae.a(this);
    }

    @Override // com.ironsource.InterfaceC4674be
    public void onRewardedAdFailedToShow(@NotNull IronSourceError ironSourceError) {
        ironSourceError.getClass();
        IronLog.CALLBACK.info("RewardedAdListener onRewardedAdFailedToShow error: " + ironSourceError + " adInfo: " + getAdInfo());
        RewardedAdListener rewardedAdListener = this.b;
        if (rewardedAdListener != null) {
            rewardedAdListener.onRewardedAdFailedToShow(this, ironSourceError);
        }
    }

    public final void show(@NotNull Activity activity) {
        activity.getClass();
        IronLog.API.info();
        this.a.a(activity);
    }
}
