package com.applovin.sdk;

import com.adsurge.adn.ads.AdSurgeAdFormat;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import defpackage.d;
import defpackage.n30;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public class AppLovinAdSize {
    public static final int SPAN = -1;
    private final String a;
    private final int b;
    private final int c;
    public static final AppLovinAdSize BANNER = new AppLovinAdSize(-1, 50, "BANNER");
    public static final AppLovinAdSize LEADER = new AppLovinAdSize(-1, 90, BrandSafetyUtils.n);
    public static final AppLovinAdSize MREC = new AppLovinAdSize(300, 250, BrandSafetyUtils.o);
    public static final AppLovinAdSize INTERSTITIAL = new AppLovinAdSize(-1, -1, BrandSafetyUtils.j);
    public static final AppLovinAdSize NATIVE = new AppLovinAdSize(-1, -1, "NATIVE");

    public static AppLovinAdSize fromString(String str) {
        if ("BANNER".equalsIgnoreCase(str)) {
            return BANNER;
        }
        if (BrandSafetyUtils.o.equalsIgnoreCase(str)) {
            return MREC;
        }
        if (BrandSafetyUtils.n.equalsIgnoreCase(str)) {
            return LEADER;
        }
        if (AdSurgeAdFormat.Constants.INTERSTITIAL_LABEL.equalsIgnoreCase(str) || BrandSafetyUtils.j.equalsIgnoreCase(str)) {
            return INTERSTITIAL;
        }
        if ("NATIVE".equalsIgnoreCase(str)) {
            return NATIVE;
        }
        d.r(n30.y("Unknown Ad Size: ", str));
        return null;
    }

    public int getHeight() {
        return this.c;
    }

    public String getLabel() {
        return this.a.toUpperCase(Locale.ENGLISH);
    }

    public int getWidth() {
        return this.b;
    }

    private AppLovinAdSize(int i, int i2, String str) {
        this.b = i;
        this.c = i2;
        this.a = str;
    }

    public String toString() {
        return getLabel();
    }
}
