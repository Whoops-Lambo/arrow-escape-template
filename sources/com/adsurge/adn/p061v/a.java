package com.adsurge.adn.p061v;

import android.content.Context;
import com.adsurge.adn.ads.AdConfig;
import com.adsurge.adn.ads.AdSurgeAdFormat;
import com.adsurge.adn.ads.rewarded.IRewardedAd;
import com.adsurge.adn.ads.rewarded.RewardedAdListener;
import com.adsurge.adn.p036k1.j;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public class a extends com.adsurge.adn.p028i.a implements IRewardedAd {
    public a(Context context, String str) {
        super(context, str, AdSurgeAdFormat.REWARDED, new b(), true);
    }

    @Override // com.adsurge.adn.ads.rewarded.IRewardedAd
    public void loadAd(AdConfig adConfig, RewardedAdListener rewardedAdListener) {
        ((b) this.c).a(rewardedAdListener);
        a(adConfig);
    }

    static {
        j.a().a(com.adsurge.adn.p006a1.a.REWARDVIDEOAD);
    }
}
