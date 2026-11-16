package com.adsurge.adn.p051q;

import android.content.Context;
import com.adsurge.adn.ads.AdConfig;
import com.adsurge.adn.ads.AdSurgeAdFormat;
import com.adsurge.adn.ads.interstitial.IInterstitialAd;
import com.adsurge.adn.ads.interstitial.InterstitialAdListener;
import com.adsurge.adn.p036k1.j;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public class a extends com.adsurge.adn.p028i.a implements IInterstitialAd {
    public a(Context context, String str) {
        super(context, str, AdSurgeAdFormat.INTERSTITIAL, new b(), true);
    }

    @Override // com.adsurge.adn.ads.interstitial.IInterstitialAd
    public void loadAd(AdConfig adConfig, InterstitialAdListener interstitialAdListener) {
        ((b) this.c).a(interstitialAdListener);
        a(adConfig);
    }

    static {
        j.a().a(com.adsurge.adn.p006a1.a.UNIFIED_INTERSTITIAL_FULLSCREEN);
    }
}
