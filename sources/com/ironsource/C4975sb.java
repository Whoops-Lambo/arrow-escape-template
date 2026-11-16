package com.ironsource;

import com.ironsource.mediationsdk.logger.IronLog;
import com.unity3d.mediation.LevelPlayAdError;
import com.unity3d.mediation.LevelPlayAdInfo;
import com.unity3d.mediation.rewarded.LevelPlayReward;
import com.unity3d.mediation.rewarded.LevelPlayRewardedAdListener;

/* JADX INFO: renamed from: com.ironsource.sb, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class C4975sb {

    /* JADX INFO: renamed from: com.ironsource.sb$a */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class a implements InterfaceC4707db {
        final /* synthetic */ LevelPlayRewardedAdListener a;

        public a(LevelPlayRewardedAdListener levelPlayRewardedAdListener) {
            this.a = levelPlayRewardedAdListener;
        }

        @Override // com.ironsource.InterfaceC4707db
        public void onAdClicked(LevelPlayAdInfo levelPlayAdInfo) {
            levelPlayAdInfo.getClass();
            IronLog.CALLBACK.info("LevelPlayRewardedAdListener.onAdClicked() adInfo: " + levelPlayAdInfo);
            this.a.onAdClicked(levelPlayAdInfo);
        }

        @Override // com.ironsource.InterfaceC4707db
        public void onAdClosed(LevelPlayAdInfo levelPlayAdInfo) {
            levelPlayAdInfo.getClass();
            IronLog.CALLBACK.info("LevelPlayRewardedAdListener.onAdClosed() adInfo: " + levelPlayAdInfo);
            this.a.onAdClosed(levelPlayAdInfo);
        }

        @Override // com.ironsource.InterfaceC4707db
        public void onAdDisplayFailed(LevelPlayAdError levelPlayAdError, LevelPlayAdInfo levelPlayAdInfo) {
            levelPlayAdError.getClass();
            levelPlayAdInfo.getClass();
            IronLog.CALLBACK.info("LevelPlayRewardedAdListener.onAdDisplayFailed() adInfo: " + levelPlayAdInfo + " error: " + levelPlayAdError);
            this.a.onAdDisplayFailed(levelPlayAdError, levelPlayAdInfo);
        }

        @Override // com.ironsource.InterfaceC4707db
        public void onAdDisplayed(LevelPlayAdInfo levelPlayAdInfo) {
            levelPlayAdInfo.getClass();
            IronLog.CALLBACK.info("LevelPlayRewardedAdListener.onAdDisplayed() adInfo: " + levelPlayAdInfo);
            this.a.onAdDisplayed(levelPlayAdInfo);
        }

        @Override // com.ironsource.InterfaceC4707db
        public void onAdInfoChanged(LevelPlayAdInfo levelPlayAdInfo) {
            levelPlayAdInfo.getClass();
            IronLog.CALLBACK.info("LevelPlayRewardedAdListener.onAdInfoChanged() adInfo: " + levelPlayAdInfo);
            this.a.onAdInfoChanged(levelPlayAdInfo);
        }

        @Override // com.ironsource.InterfaceC4707db
        public void onAdLoadFailed(LevelPlayAdError levelPlayAdError) {
            levelPlayAdError.getClass();
            IronLog.CALLBACK.info("LevelPlayRewardedAdListener.onAdLoadFailed() error: " + levelPlayAdError);
            this.a.onAdLoadFailed(levelPlayAdError);
        }

        @Override // com.ironsource.InterfaceC4707db
        public void onAdLoaded(LevelPlayAdInfo levelPlayAdInfo) {
            levelPlayAdInfo.getClass();
            IronLog.CALLBACK.info("LevelPlayRewardedAdListener.onAdLoaded() adInfo: " + levelPlayAdInfo);
            this.a.onAdLoaded(levelPlayAdInfo);
        }

        @Override // com.ironsource.InterfaceC4707db
        public void onAdRewarded(LevelPlayReward levelPlayReward, LevelPlayAdInfo levelPlayAdInfo) {
            levelPlayReward.getClass();
            levelPlayAdInfo.getClass();
            IronLog.CALLBACK.info("LevelPlayRewardedAdListener.onAdRewarded() reward: " + levelPlayReward + " adInfo: " + levelPlayAdInfo);
            this.a.onAdRewarded(levelPlayReward, levelPlayAdInfo);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC4707db b(LevelPlayRewardedAdListener levelPlayRewardedAdListener) {
        return new a(levelPlayRewardedAdListener);
    }
}
