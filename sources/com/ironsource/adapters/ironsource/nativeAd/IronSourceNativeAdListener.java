package com.ironsource.adapters.ironsource.nativeAd;

import com.ironsource.H8;
import com.ironsource.J8;
import com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdSmashListener;
import com.ironsource.mediationsdk.logger.IronSourceError;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class IronSourceNativeAdListener implements J8.a {

    @NotNull
    private final IronSourceNativeAdViewBinder binder;

    @NotNull
    private final NativeAdSmashListener smashListener;

    @Override // com.ironsource.J8.a
    public void onNativeAdClicked() {
        this.smashListener.onNativeAdClicked();
    }

    @Override // com.ironsource.J8.a
    public void onNativeAdShown() {
        this.smashListener.onNativeAdShown();
    }

    public IronSourceNativeAdListener(@NotNull IronSourceNativeAdViewBinder ironSourceNativeAdViewBinder, @NotNull NativeAdSmashListener nativeAdSmashListener) {
        ironSourceNativeAdViewBinder.getClass();
        nativeAdSmashListener.getClass();
        this.binder = ironSourceNativeAdViewBinder;
        this.smashListener = nativeAdSmashListener;
    }

    @Override // com.ironsource.J8.a
    public void onNativeAdLoadFailed(@NotNull String str) {
        str.getClass();
        this.smashListener.onNativeAdLoadFailed(new IronSourceError(510, "Load failed - ".concat(str)));
    }

    @Override // com.ironsource.J8.a
    public void onNativeAdLoadSuccess(@NotNull H8 h8) {
        h8.getClass();
        this.smashListener.onNativeAdLoaded(new IronSourceNativeAdData(h8), this.binder);
    }
}
