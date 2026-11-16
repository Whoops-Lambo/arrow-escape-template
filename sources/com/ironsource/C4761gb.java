package com.ironsource;

import com.ironsource.mediationsdk.logger.IronLog;
import com.unity3d.mediation.LevelPlayAdError;
import com.unity3d.mediation.LevelPlayAdInfo;
import com.unity3d.mediation.interstitial.LevelPlayInterstitialAdListener;

/* JADX INFO: renamed from: com.ironsource.gb, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class C4761gb {

    /* JADX INFO: renamed from: com.ironsource.gb$a */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class a implements InterfaceC4707db {
        final /* synthetic */ LevelPlayInterstitialAdListener a;

        public a(LevelPlayInterstitialAdListener levelPlayInterstitialAdListener) {
            this.a = levelPlayInterstitialAdListener;
        }

        @Override // com.ironsource.InterfaceC4707db
        public void onAdClicked(LevelPlayAdInfo levelPlayAdInfo) {
            levelPlayAdInfo.getClass();
            IronLog.CALLBACK.info("LevelPlayInterstitialAdListener.onAdClicked() adInfo: " + levelPlayAdInfo);
            this.a.onAdClicked(levelPlayAdInfo);
        }

        @Override // com.ironsource.InterfaceC4707db
        public void onAdClosed(LevelPlayAdInfo levelPlayAdInfo) {
            levelPlayAdInfo.getClass();
            IronLog.CALLBACK.info("LevelPlayInterstitialAdListener.onAdClosed() adInfo: " + levelPlayAdInfo);
            this.a.onAdClosed(levelPlayAdInfo);
        }

        @Override // com.ironsource.InterfaceC4707db
        public void onAdDisplayFailed(LevelPlayAdError levelPlayAdError, LevelPlayAdInfo levelPlayAdInfo) {
            levelPlayAdError.getClass();
            levelPlayAdInfo.getClass();
            IronLog.CALLBACK.info("LevelPlayInterstitialAdListener.onAdDisplayFailed() adInfo: " + levelPlayAdInfo + " error: " + levelPlayAdError);
            this.a.onAdDisplayFailed(levelPlayAdError, levelPlayAdInfo);
        }

        @Override // com.ironsource.InterfaceC4707db
        public void onAdDisplayed(LevelPlayAdInfo levelPlayAdInfo) {
            levelPlayAdInfo.getClass();
            IronLog.CALLBACK.info("LevelPlayInterstitialAdListener.onAdDisplayed() adInfo: " + levelPlayAdInfo);
            this.a.onAdDisplayed(levelPlayAdInfo);
        }

        @Override // com.ironsource.InterfaceC4707db
        public void onAdInfoChanged(LevelPlayAdInfo levelPlayAdInfo) {
            levelPlayAdInfo.getClass();
            IronLog.CALLBACK.info("LevelPlayInterstitialAdListener.onAdInfoChanged() adInfo: " + levelPlayAdInfo);
            this.a.onAdInfoChanged(levelPlayAdInfo);
        }

        @Override // com.ironsource.InterfaceC4707db
        public void onAdLoadFailed(LevelPlayAdError levelPlayAdError) {
            levelPlayAdError.getClass();
            IronLog.CALLBACK.info("LevelPlayInterstitialAdListener.onAdLoaded() error: " + levelPlayAdError);
            this.a.onAdLoadFailed(levelPlayAdError);
        }

        @Override // com.ironsource.InterfaceC4707db
        public void onAdLoaded(LevelPlayAdInfo levelPlayAdInfo) {
            levelPlayAdInfo.getClass();
            IronLog.CALLBACK.info("LevelPlayInterstitialAdListener.onAdLoaded() adInfo: " + levelPlayAdInfo);
            this.a.onAdLoaded(levelPlayAdInfo);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC4707db b(LevelPlayInterstitialAdListener levelPlayInterstitialAdListener) {
        return new a(levelPlayInterstitialAdListener);
    }
}
