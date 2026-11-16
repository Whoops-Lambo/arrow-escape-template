package com.applovin.sdk;

import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import defpackage.d;
import defpackage.n30;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
public class AppLovinAdType {
    private final String a;
    public static final AppLovinAdType REGULAR = new AppLovinAdType("REGULAR");
    public static final AppLovinAdType APP_OPEN = new AppLovinAdType(BrandSafetyUtils.l);
    public static final AppLovinAdType INCENTIVIZED = new AppLovinAdType("VIDEOA");
    public static final AppLovinAdType NATIVE = new AppLovinAdType("NATIVE");

    public static AppLovinAdType fromString(String str) {
        if ("REGULAR".equalsIgnoreCase(str)) {
            return REGULAR;
        }
        if (BrandSafetyUtils.l.equalsIgnoreCase(str)) {
            return APP_OPEN;
        }
        if ("VIDEOA".equalsIgnoreCase(str)) {
            return INCENTIVIZED;
        }
        if ("NATIVE".equalsIgnoreCase(str)) {
            return NATIVE;
        }
        d.r(n30.y("Unknown Ad Type: ", str));
        return null;
    }

    public String getLabel() {
        return this.a.toUpperCase(Locale.ENGLISH);
    }

    private AppLovinAdType(String str) {
        this.a = str;
    }

    public String toString() {
        return getLabel();
    }
}
