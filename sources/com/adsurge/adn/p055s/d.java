package com.adsurge.adn.p055s;

import com.adsurge.adn.I0.g;
import com.adsurge.adn.ads.AdSurgeAd;
import com.adsurge.adn.ads.AdSurgeAdError;
import com.adsurge.adn.ads.nativead.NativeAdListener;
import com.adsurge.adn.ads.rewarded.RewardItem;
import com.facebook.login.a0;
import defpackage.kc3;
import defpackage.mc3;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public class d implements NativeAdListener {
    public NativeAdListener a;

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(AdSurgeAd adSurgeAd, RewardItem rewardItem) {
        NativeAdListener nativeAdListener = this.a;
        if (nativeAdListener != null) {
            nativeAdListener.onUserEarnedReward(adSurgeAd, rewardItem);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(AdSurgeAd adSurgeAd) {
        NativeAdListener nativeAdListener = this.a;
        if (nativeAdListener != null) {
            nativeAdListener.onAdDismissed(adSurgeAd);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c(AdSurgeAd adSurgeAd) {
        NativeAdListener nativeAdListener = this.a;
        if (nativeAdListener != null) {
            nativeAdListener.onAdImpression(adSurgeAd);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d(AdSurgeAd adSurgeAd) {
        NativeAdListener nativeAdListener = this.a;
        if (nativeAdListener != null) {
            nativeAdListener.onAdLoaded(adSurgeAd);
        }
    }

    @Override // com.adsurge.adn.ads.BaseAdListener
    public void onAdClicked(AdSurgeAd adSurgeAd) {
        g.c(new kc3(this, adSurgeAd, 1));
    }

    @Override // com.adsurge.adn.ads.nativead.NativeAdListener, com.adsurge.adn.ads.BaseAdListener
    public void onAdDismissed(AdSurgeAd adSurgeAd) {
        g.c(new kc3(this, adSurgeAd, 3));
    }

    @Override // com.adsurge.adn.ads.BaseAdListener
    public void onAdFailed(AdSurgeAdError adSurgeAdError) {
        g.c(new mc3(0, this, adSurgeAdError));
    }

    @Override // com.adsurge.adn.ads.BaseAdListener
    public void onAdImpression(AdSurgeAd adSurgeAd) {
        g.c(new kc3(this, adSurgeAd, 2));
    }

    @Override // com.adsurge.adn.ads.BaseAdListener
    public void onAdLoaded(AdSurgeAd adSurgeAd) {
        g.c(new kc3(this, adSurgeAd, 0));
    }

    @Override // com.adsurge.adn.ads.BaseAdListener
    public void onAdShowFailed(AdSurgeAd adSurgeAd, AdSurgeAdError adSurgeAdError) {
        g.c(new a0(5, this, adSurgeAd, adSurgeAdError));
    }

    @Override // com.adsurge.adn.ads.BaseAdListener
    public void onUserEarnedReward(AdSurgeAd adSurgeAd, RewardItem rewardItem) {
        g.c(new a0(4, this, adSurgeAd, rewardItem));
    }

    public void a(NativeAdListener nativeAdListener) {
        this.a = nativeAdListener;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(AdSurgeAdError adSurgeAdError) {
        NativeAdListener nativeAdListener = this.a;
        if (nativeAdListener != null) {
            nativeAdListener.onAdFailed(adSurgeAdError);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(AdSurgeAd adSurgeAd, AdSurgeAdError adSurgeAdError) {
        NativeAdListener nativeAdListener = this.a;
        if (nativeAdListener != null) {
            nativeAdListener.onAdShowFailed(adSurgeAd, adSurgeAdError);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(AdSurgeAd adSurgeAd) {
        NativeAdListener nativeAdListener = this.a;
        if (nativeAdListener != null) {
            nativeAdListener.onAdClicked(adSurgeAd);
        }
    }

    public void a() {
        this.a = null;
    }
}
