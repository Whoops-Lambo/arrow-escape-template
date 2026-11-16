package com.unity3d.ironsourceads.interstitial;

import android.app.Activity;
import com.ironsource.D9;
import com.ironsource.E9;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class InterstitialAd implements E9 {

    @NotNull
    private final D9 a;

    @Nullable
    private InterstitialAdListener b;

    @Override // com.ironsource.E9
    public void onAdInstanceDidReward(@Nullable String str, int i) {
    }

    @NotNull
    public final InterstitialAdInfo getAdInfo() {
        return this.a.b();
    }

    @Nullable
    public final InterstitialAdListener getListener() {
        return this.b;
    }

    public final boolean isReadyToShow() {
        IronLog.API.info();
        return this.a.d();
    }

    @Override // com.ironsource.E9
    public void onAdInstanceDidBecomeVisible() {
        IronLog.CALLBACK.info("InterstitialAdListener onInterstitialAdShown adInfo: " + getAdInfo());
        InterstitialAdListener interstitialAdListener = this.b;
        if (interstitialAdListener != null) {
            interstitialAdListener.onInterstitialAdShown(this);
        }
    }

    @Override // com.ironsource.E9
    public void onAdInstanceDidClick() {
        IronLog.CALLBACK.info("InterstitialAdListener onInterstitialAdClicked adInfo: " + getAdInfo());
        InterstitialAdListener interstitialAdListener = this.b;
        if (interstitialAdListener != null) {
            interstitialAdListener.onInterstitialAdClicked(this);
        }
    }

    @Override // com.ironsource.E9
    public void onAdInstanceDidDismiss() {
        IronLog.CALLBACK.info("InterstitialAdListener onInterstitialAdDismissed adInfo: " + getAdInfo());
        InterstitialAdListener interstitialAdListener = this.b;
        if (interstitialAdListener != null) {
            interstitialAdListener.onInterstitialAdDismissed(this);
        }
    }

    @Override // com.ironsource.E9
    public void onAdInstanceDidShow() {
        IronLog.CALLBACK.info("InterstitialAdListener onInterstitialAdShown adInfo: " + getAdInfo());
        InterstitialAdListener interstitialAdListener = this.b;
        if (interstitialAdListener != null) {
            interstitialAdListener.onInterstitialAdShown(this);
        }
    }

    public final void setListener(@Nullable InterstitialAdListener interstitialAdListener) {
        this.b = interstitialAdListener;
    }

    public InterstitialAd(@NotNull D9 d9) {
        d9.getClass();
        this.a = d9;
        d9.a(this);
    }

    @Override // com.ironsource.E9
    public void onAdInstanceDidFailedToShow(@NotNull IronSourceError ironSourceError) {
        ironSourceError.getClass();
        IronLog.CALLBACK.info("InterstitialAdListener onInterstitialAdFailedToShow error : " + ironSourceError + " adInfo: " + getAdInfo());
        InterstitialAdListener interstitialAdListener = this.b;
        if (interstitialAdListener != null) {
            interstitialAdListener.onInterstitialAdFailedToShow(this, ironSourceError);
        }
    }

    public final void show(@NotNull Activity activity) {
        activity.getClass();
        IronLog.API.info();
        this.a.a(activity);
    }
}
