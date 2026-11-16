package com.adsurge.adn.ads.rewarded;

import android.app.Activity;
import com.adsurge.adn.ads.AdConfig;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public interface IRewardedAd {
    boolean isValid();

    void loadAd(AdConfig adConfig, RewardedAdListener rewardedAdListener);

    void showAd();

    void showAd(Activity activity);

    void showAd(Activity activity, Map<String, Object> map);

    void showAd(Map<String, Object> map);
}
