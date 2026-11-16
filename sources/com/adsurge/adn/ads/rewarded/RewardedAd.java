package com.adsurge.adn.ads.rewarded;

import android.app.Activity;
import android.content.Context;
import androidx.annotation.NonNull;
import com.adsurge.adn.ads.AdConfig;
import com.adsurge.adn.p061v.a;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public class RewardedAd implements IRewardedAd {
    public final IRewardedAd a;

    @Override // com.adsurge.adn.ads.rewarded.IRewardedAd
    public boolean isValid() {
        return this.a.isValid();
    }

    @Override // com.adsurge.adn.ads.rewarded.IRewardedAd
    public void loadAd(AdConfig adConfig, RewardedAdListener rewardedAdListener) {
        this.a.loadAd(adConfig, rewardedAdListener);
    }

    @Override // com.adsurge.adn.ads.rewarded.IRewardedAd
    public void showAd() {
        this.a.showAd();
    }

    public RewardedAd(@NonNull Context context, @NonNull String str) {
        this.a = new a(context, str);
    }

    @Override // com.adsurge.adn.ads.rewarded.IRewardedAd
    public void showAd(Activity activity) {
        this.a.showAd(activity);
    }

    @Override // com.adsurge.adn.ads.rewarded.IRewardedAd
    public void showAd(Map<String, Object> map) {
        this.a.showAd(map);
    }

    @Override // com.adsurge.adn.ads.rewarded.IRewardedAd
    public void showAd(Activity activity, Map<String, Object> map) {
        this.a.showAd(activity, map);
    }
}
