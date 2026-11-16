package com.ironsource;

import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.ironsourceads.banner.BannerAdLoaderListener;
import com.unity3d.ironsourceads.banner.BannerAdView;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: com.ironsource.j3, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class C4806j3 implements U<BannerAdView> {

    @NotNull
    private final InterfaceC4784hg a;

    @NotNull
    private final BannerAdLoaderListener b;

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(BannerAdView bannerAdView, C4806j3 c4806j3) {
        IronLog.CALLBACK.info("BannerAdLoaderListener.onBannerAdLoaded adInfo: " + bannerAdView.getAdInfo());
        c4806j3.b.onBannerAdLoaded(bannerAdView);
    }

    public C4806j3(@NotNull InterfaceC4784hg interfaceC4784hg, @NotNull BannerAdLoaderListener bannerAdLoaderListener) {
        interfaceC4784hg.getClass();
        bannerAdLoaderListener.getClass();
        this.a = interfaceC4784hg;
        this.b = bannerAdLoaderListener;
    }

    @Override // com.ironsource.U
    public void a(@NotNull BannerAdView bannerAdView) {
        bannerAdView.getClass();
        this.a.a(new io.p071bidmachine.media3.exoplayer.video.x(10, bannerAdView, this));
    }

    @Override // com.ironsource.U
    public void a(@NotNull IronSourceError ironSourceError) {
        ironSourceError.getClass();
        this.a.a(new io.p071bidmachine.media3.exoplayer.video.x(11, ironSourceError, this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(IronSourceError ironSourceError, C4806j3 c4806j3) {
        IronLog.CALLBACK.info("BannerAdLoaderListener.onBannerAdLoadFailed error: " + ironSourceError);
        c4806j3.b.onBannerAdLoadFailed(ironSourceError);
    }
}
