package com.ironsource;

import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.ironsourceads.rewarded.RewardedAd;
import com.unity3d.ironsourceads.rewarded.RewardedAdLoaderListener;
import defpackage.mc3;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: com.ironsource.ee, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class C4728ee implements U<RewardedAd> {

    @NotNull
    private final InterfaceC4784hg a;

    @NotNull
    private final RewardedAdLoaderListener b;

    public C4728ee(@NotNull InterfaceC4784hg interfaceC4784hg, @NotNull RewardedAdLoaderListener rewardedAdLoaderListener) {
        interfaceC4784hg.getClass();
        rewardedAdLoaderListener.getClass();
        this.a = interfaceC4784hg;
        this.b = rewardedAdLoaderListener;
    }

    @Override // com.ironsource.U
    public void a(@NotNull IronSourceError ironSourceError) {
        ironSourceError.getClass();
        IronLog.CALLBACK.info("RewardedAdLoaderListener.onRewardedAdLoadFailed error: " + ironSourceError);
        this.a.a(new mc3(5, this, ironSourceError));
    }

    @Override // com.ironsource.U
    public void a(@NotNull RewardedAd rewardedAd) {
        rewardedAd.getClass();
        this.a.a(new mc3(4, rewardedAd, this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(RewardedAd rewardedAd, C4728ee c4728ee) {
        IronLog.CALLBACK.info("RewardedAdLoaderListener.onRewardedAdLoaded adInfo: " + rewardedAd.getAdInfo());
        c4728ee.b.onRewardedAdLoaded(rewardedAd);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(C4728ee c4728ee, IronSourceError ironSourceError) {
        c4728ee.b.onRewardedAdLoadFailed(ironSourceError);
    }
}
