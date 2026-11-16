package com.adsurge.adn.ads;

import android.text.TextUtils;
import defpackage.nj;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public enum AdSurgeAdFormat {
    UNKNOWN(0, "unknown"),
    REWARDED(1, "REWARDED"),
    INTERSTITIAL(2, Constants.INTERSTITIAL_LABEL),
    BANNER(3, "BANNER"),
    NATIVE(4, Constants.NATIVE_LABEL),
    APP_OPEN(5, Constants.APP_OPEN_LABEL);

    public final String label;
    public final int type;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class Constants {
        public static final String APP_OPEN_LABEL = "APP_OPEN";
        public static final String BANNER_LABEL = "BANNER";
        public static final String INTERSTITIAL_LABEL = "INTERSTITIAL";
        public static final String NATIVE_LABEL = "NATIVE_LABEL";
        public static final String REWARDED_LABEL = "REWARDED";
        public static final String UNKNOWN = "unknown";
    }

    public AdSurgeAdSize getSize() {
        return AdSurgeAdSize.UNSPECIFIED;
    }

    @Override // java.lang.Enum
    public String toString() {
        return nj.q(new StringBuilder("AdSurgeAdFormat{label='"), this.label, "'}");
    }

    AdSurgeAdFormat(int i, String str) {
        this.type = i;
        this.label = str;
    }

    public static AdSurgeAdFormat formatFromString(String str) {
        if (TextUtils.isEmpty(str)) {
            return UNKNOWN;
        }
        str.getClass();
        switch (str) {
            case "INTERSTITIAL":
                return INTERSTITIAL;
            case "REWARDED":
                return REWARDED;
            case "NATIVE_LABEL":
                return NATIVE;
            case "BANNER":
                return BANNER;
            case "APP_OPEN":
                return APP_OPEN;
            default:
                return UNKNOWN;
        }
    }

    public static AdSurgeAdFormat fromInt(int i) {
        for (AdSurgeAdFormat adSurgeAdFormat : values()) {
            if (adSurgeAdFormat.type == i) {
                return adSurgeAdFormat;
            }
        }
        return UNKNOWN;
    }
}
