package com.applovin.mediation.nativeAds;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.applovin.impl.mediation.ads.MaxNativeAdLoaderImpl;
import com.applovin.impl.mediation.ads.a;
import com.applovin.impl.sdk.l;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdRevenueListener;
import com.applovin.mediation.MaxAdReviewListener;
import com.applovin.sdk.AppLovinSdk;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.Logger;
import defpackage.d;
import defpackage.n30;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public class MaxNativeAdLoader {
    private final MaxNativeAdLoaderImpl a;

    public boolean render(MaxNativeAdView maxNativeAdView, MaxAd maxAd) {
        Logger.d("AppLovin|SafeDK: Execution> Lcom/applovin/mediation/nativeAds/MaxNativeAdLoader;->render(Lcom/applovin/mediation/nativeAds/MaxNativeAdView;Lcom/applovin/mediation/MaxAd;)Z");
        CreativeInfoManager.onMaxNativeAdLoaded(maxNativeAdView, maxAd);
        return safedk_MaxNativeAdLoader_render_15e187b196d84406225bb047dba3a142(maxNativeAdView, maxAd);
    }

    public void a(List<View> list, ViewGroup viewGroup, MaxAd maxAd) {
        this.a.logApiCall("a()");
        this.a.registerClickableViews(list, viewGroup, maxAd);
    }

    public void b(MaxAd maxAd) {
        this.a.logApiCall("b()");
        this.a.handleNativeAdViewRendered(maxAd);
    }

    public void destroy(MaxAd maxAd) {
        this.a.logApiCall("destroy(nativeAd=" + maxAd + ")");
        this.a.destroy(maxAd);
    }

    public String getAdUnitId() {
        return this.a.getAdUnitId();
    }

    public String getPlacement() {
        this.a.logApiCall("getPlacement()");
        return this.a.getPlacement();
    }

    public void loadAd(MaxNativeAdView maxNativeAdView) {
        this.a.logApiCall("loadAd(adView=" + maxNativeAdView + ")");
        this.a.loadAd(maxNativeAdView);
    }

    public boolean safedk_MaxNativeAdLoader_render_15e187b196d84406225bb047dba3a142(MaxNativeAdView p0, MaxAd p1) {
        this.a.logApiCall("render(adView=" + p0 + ", ad=" + p1 + ")");
        return this.a.render(p0, p1);
    }

    public void setAdReviewListener(MaxAdReviewListener maxAdReviewListener) {
        this.a.logApiCall("setAdReviewListener(listener=" + maxAdReviewListener + ")");
        this.a.setAdReviewListener(maxAdReviewListener);
    }

    public void setCustomData(String str) {
        this.a.logApiCall("setCustomData(value=" + str + ")");
        this.a.setCustomData(str);
    }

    public void setExtraParameter(String str, String str2) {
        this.a.logApiCall(n30.n("setExtraParameter(key=", str, ", value=", str2, ")"));
        this.a.setExtraParameter(str, str2);
    }

    public void setLocalExtraParameter(String str, Object obj) {
        this.a.logApiCall("setLocalExtraParameter(key=" + str + ", value=" + obj + ")");
        this.a.setLocalExtraParameter(str, obj);
    }

    public void setNativeAdListener(MaxNativeAdListener maxNativeAdListener) {
        this.a.logApiCall("setNativeAdListener(listener=" + maxNativeAdListener + ")");
        this.a.setNativeAdListener(maxNativeAdListener);
    }

    public void setPlacement(String str) {
        this.a.logApiCall("setPlacement(placement=" + str + ")");
        this.a.setPlacement(str);
    }

    public void setRevenueListener(MaxAdRevenueListener maxAdRevenueListener) {
        this.a.logApiCall("setRevenueListener(listener=" + maxAdRevenueListener + ")");
        this.a.setRevenueListener(maxAdRevenueListener);
    }

    @Deprecated
    public MaxNativeAdLoader(String str, AppLovinSdk appLovinSdk, Context context) {
        a.logApiCall("MaxNativeAdLoader", "MaxNativeAdLoader(adUnitId=" + str + ", sdk=" + appLovinSdk + ")");
        if (str != null) {
            if (!TextUtils.isEmpty(str)) {
                if (appLovinSdk != null) {
                    if (context != null) {
                        this.a = new MaxNativeAdLoaderImpl(str, appLovinSdk.a());
                        return;
                    } else {
                        d.r("No context specified");
                        throw null;
                    }
                }
                d.r("No sdk specified");
                throw null;
            }
            d.r("Empty ad unit ID specified");
            throw null;
        }
        d.r("No ad unit ID specified");
        throw null;
    }

    public void destroy() {
        this.a.logApiCall("destroy()");
        this.a.destroy();
    }

    public void loadAd() {
        loadAd(null);
    }

    @Deprecated
    public MaxNativeAdLoader(String str, Context context) {
        this(str, AppLovinSdk.getInstance(context), context);
    }

    public MaxNativeAdLoader(String str) {
        this(str, l.p());
    }
}
