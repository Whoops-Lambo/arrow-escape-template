package com.applovin.adview;

import com.applovin.sdk.AppLovinAd;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public interface AppLovinAdViewEventListener {
    void adClosedFullscreen(AppLovinAd appLovinAd, AppLovinAdView appLovinAdView);

    void adFailedToDisplay(AppLovinAd appLovinAd, AppLovinAdView appLovinAdView, AppLovinAdViewDisplayErrorCode appLovinAdViewDisplayErrorCode);

    void adLeftApplication(AppLovinAd appLovinAd, AppLovinAdView appLovinAdView);

    void adOpenedFullscreen(AppLovinAd appLovinAd, AppLovinAdView appLovinAdView);
}
