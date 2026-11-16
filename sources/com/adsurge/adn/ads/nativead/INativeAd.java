package com.adsurge.adn.ads.nativead;

import android.view.View;
import androidx.annotation.Nullable;
import com.adsurge.adn.ads.AdConfig;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public interface INativeAd {
    void destroy();

    @Nullable
    AdChoicesView getAdChoicesView();

    String getBody();

    String getCallToAction();

    String getHeadline();

    @Nullable
    Image getIcon();

    @Nullable
    MediaContent getMediaContent();

    @Nullable
    String getRewardType();

    void loadAd(AdConfig adConfig, NativeAdListener nativeAdListener);

    void registerViewForInteraction(NativeAdView nativeAdView, List<View> list);
}
