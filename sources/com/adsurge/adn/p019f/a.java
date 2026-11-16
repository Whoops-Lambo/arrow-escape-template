package com.adsurge.adn.p019f;

import android.content.Context;
import com.adsurge.adn.ads.AdConfig;
import com.adsurge.adn.ads.AdSurgeAdFormat;
import com.adsurge.adn.ads.appopen.AppOpenAdListener;
import com.adsurge.adn.ads.appopen.IAppOpenAd;
import com.adsurge.adn.p036k1.j;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public class a extends com.adsurge.adn.p028i.a implements IAppOpenAd {
    public a(Context context, String str) {
        super(context, str, AdSurgeAdFormat.APP_OPEN, new b(), false);
    }

    @Override // com.adsurge.adn.ads.appopen.IAppOpenAd
    public void loadAd(AdConfig adConfig, AppOpenAdListener appOpenAdListener) {
        ((b) this.c).a(appOpenAdListener);
        a(adConfig);
    }

    static {
        j.a().a(com.adsurge.adn.p006a1.a.APPOPEN);
    }
}
