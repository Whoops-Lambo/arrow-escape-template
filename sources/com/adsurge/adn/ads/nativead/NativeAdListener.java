package com.adsurge.adn.ads.nativead;

import com.adsurge.adn.ads.AdSurgeAd;
import com.adsurge.adn.ads.BaseAdListener;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public interface NativeAdListener extends BaseAdListener {
    @Override // com.adsurge.adn.ads.BaseAdListener
    default void onAdDismissed(AdSurgeAd adSurgeAd) {
    }
}
