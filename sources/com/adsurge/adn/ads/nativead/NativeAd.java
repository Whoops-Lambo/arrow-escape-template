package com.adsurge.adn.ads.nativead;

import android.content.Context;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.adsurge.adn.ads.AdConfig;
import com.adsurge.adn.p055s.c;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public class NativeAd implements INativeAd {
    public final c a;

    @Override // com.adsurge.adn.ads.nativead.INativeAd
    public void destroy() {
        this.a.destroy();
    }

    @Override // com.adsurge.adn.ads.nativead.INativeAd
    public AdChoicesView getAdChoicesView() {
        return this.a.getAdChoicesView();
    }

    @Override // com.adsurge.adn.ads.nativead.INativeAd
    public String getBody() {
        return this.a.getBody();
    }

    @Override // com.adsurge.adn.ads.nativead.INativeAd
    public String getCallToAction() {
        return this.a.getCallToAction();
    }

    @Override // com.adsurge.adn.ads.nativead.INativeAd
    public String getHeadline() {
        return this.a.getHeadline();
    }

    @Override // com.adsurge.adn.ads.nativead.INativeAd
    @Nullable
    public Image getIcon() {
        return this.a.getIcon();
    }

    @Override // com.adsurge.adn.ads.nativead.INativeAd
    public MediaContent getMediaContent() {
        return this.a.getMediaContent();
    }

    @Override // com.adsurge.adn.ads.nativead.INativeAd
    public String getRewardType() {
        return this.a.getRewardType();
    }

    @Override // com.adsurge.adn.ads.nativead.INativeAd
    public void loadAd(AdConfig adConfig, NativeAdListener nativeAdListener) {
        this.a.loadAd(adConfig, nativeAdListener);
    }

    @Override // com.adsurge.adn.ads.nativead.INativeAd
    public void registerViewForInteraction(NativeAdView nativeAdView, List<View> list) {
        this.a.registerViewForInteraction(nativeAdView, list);
    }

    @NonNull
    public String toString() {
        return "NativeAd{headline='" + getHeadline() + "', body='" + getBody() + "', callToAction='" + getCallToAction() + "', icon='" + getIcon() + "', mediaContent='" + getMediaContent() + "'}";
    }

    public NativeAd(@NonNull Context context, @NonNull String str) {
        this.a = new c(context, str);
    }
}
