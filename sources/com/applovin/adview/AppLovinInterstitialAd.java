package com.applovin.adview;

import android.content.Context;
import com.applovin.impl.r2;
import com.applovin.impl.sdk.l;
import com.applovin.sdk.AppLovinSdk;
import defpackage.d;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public class AppLovinInterstitialAd {
    @Deprecated
    public static AppLovinInterstitialAdDialog create(AppLovinSdk appLovinSdk, Context context) {
        if (appLovinSdk == null) {
            d.r("No sdk specified");
            return null;
        }
        if (context != null) {
            return new r2(appLovinSdk, context);
        }
        d.r("No context specified");
        return null;
    }

    public String toString() {
        return "AppLovinInterstitialAd{}";
    }

    public static AppLovinInterstitialAdDialog create() {
        return create(AppLovinSdk.getInstance(l.p()), l.p());
    }
}
