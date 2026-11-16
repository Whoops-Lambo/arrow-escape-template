package com.adsurge.adn.ads;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class AdSurgePrivacyConfiguration {
    public static final int BIT_AGE_RESTRICTED = 1;
    public static final int BIT_DO_NOT_SELL = 2;
    public static final int BIT_NON_PERSONALIZED_ADS = 8;
    public static final int BIT_USER_CONSENT = 4;
    public static boolean a;
    public static boolean b;
    public static boolean c;
    public static boolean d;
    public static int e;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v2, types: [int] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    public static int getManualConfig() {
        boolean z = a;
        ?? r0 = z;
        if (b) {
            r0 = (z ? 1 : 0) | 2;
        }
        ?? r1 = r0;
        if (c) {
            r1 = (r0 == true ? 1 : 0) | 4;
        }
        return d ? r1 | 8 : r1;
    }

    public static int getManualConfigSetting() {
        return e;
    }

    public static boolean hasUserConsent() {
        return c;
    }

    public static boolean isAgeRestrictedUser() {
        return a;
    }

    public static boolean isDoNotSell() {
        return b;
    }

    public static boolean isNonPersonalizedAds() {
        return d;
    }

    public static boolean isUserConsentConfigured() {
        return (e & 4) != 0;
    }

    public static void setAgeRestrictedUser(boolean z) {
        a = z;
        e |= 1;
    }

    public static void setDoNotSell(boolean z) {
        b = z;
        e |= 2;
    }

    public static void setNonPersonalizedAds(boolean z) {
        d = z;
        e |= 8;
    }

    public static void setUserConsent(boolean z) {
        c = z;
        e |= 4;
    }
}
