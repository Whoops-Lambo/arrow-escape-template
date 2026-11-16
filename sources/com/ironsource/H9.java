package com.ironsource;

import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.ironsourceads.interstitial.InterstitialAd;
import com.unity3d.ironsourceads.interstitial.InterstitialAdLoaderListener;
import defpackage.tk0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class H9 implements U<InterstitialAd> {

    @NotNull
    private final InterfaceC4784hg a;

    @NotNull
    private final InterstitialAdLoaderListener b;

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(InterstitialAd interstitialAd, H9 h9) {
        IronLog.CALLBACK.info("InterstitialAdLoaderListener.onInterstitialAdLoaded adInfo: " + interstitialAd.getAdInfo());
        h9.b.onInterstitialAdLoaded(interstitialAd);
    }

    public H9(@NotNull InterfaceC4784hg interfaceC4784hg, @NotNull InterstitialAdLoaderListener interstitialAdLoaderListener) {
        interfaceC4784hg.getClass();
        interstitialAdLoaderListener.getClass();
        this.a = interfaceC4784hg;
        this.b = interstitialAdLoaderListener;
    }

    @Override // com.ironsource.U
    public void a(@NotNull InterstitialAd interstitialAd) {
        interstitialAd.getClass();
        this.a.a(new tk0(10, interstitialAd, this));
    }

    @Override // com.ironsource.U
    public void a(@NotNull IronSourceError ironSourceError) {
        ironSourceError.getClass();
        this.a.a(new tk0(ironSourceError, this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(IronSourceError ironSourceError, H9 h9) {
        IronLog.CALLBACK.info("InterstitialAdLoaderListener.onInterstitialAdLoadFailed error: " + ironSourceError);
        h9.b.onInterstitialAdLoadFailed(ironSourceError);
    }
}
