package com.ironsource.adqualitysdk.sdk.i;

import com.ironsource.adqualitysdk.sdk.StringFog;
import com.ogury.ad.OguryInterstitialAd;
import com.ogury.ad.OguryInterstitialAdListener;
import com.ogury.ad.OguryReward;
import com.ogury.ad.OguryRewardedAd;
import com.ogury.ad.OguryRewardedAdListener;
import com.ogury.ad.interstitial.ui.InterstitialActivity;
import com.ogury.sdk.Ogury;
import java.util.HashMap;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.ŗ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class C0392 extends AbstractC0535 {

    /* JADX INFO: renamed from: סּ, reason: contains not printable characters */
    public static final String f825 = StringFog.decrypt("ccMKMcVPXmxx0hcMwlpXX2bqFwvfXlV7cA==\n", "AqZ+eKs7Ox4=\n");

    /* JADX INFO: renamed from: טּ, reason: contains not printable characters */
    public static final String f824 = StringFog.decrypt("NmmlxN6Oy2shabXX37XDajFpv/PJ\n", "RQzRlrv5qhk=\n");

    /* JADX INFO: renamed from: ﬤ, reason: contains not printable characters */
    public static final String f823 = StringFog.decrypt("Xb8thGIw5dhH/iHOIz7+3luiM95kI/nLUv41wyMe/t5bojPeZCP5y1KRI95kIfneRw==\n", "PtBAqg1XkKo=\n");

    /* JADX INFO: renamed from: 爫, reason: contains not printable characters */
    public static final String f822 = StringFog.decrypt("ucDSdDw7SlmEx8d9DytKWYbH0mg=\n", "8K6mEU5IPjA=\n");

    /* JADX INFO: renamed from: 乁, reason: contains not printable characters */
    public static final String f821 = StringFog.decrypt("hWDGJb4=\n", "ygezV8dQJ4o=\n");

    /* JADX INFO: renamed from: 丫, reason: contains not printable characters */
    public static final String f820 = StringFog.decrypt("fsdL9F1BC7FU0k3yTXwMpF3hWg==\n", "MaA+hiQIZcU=\n");

    /* JADX INFO: renamed from: ヶ, reason: contains not printable characters */
    public static final String f819 = StringFog.decrypt("P5V72dHKtD8VgH3fwfezKhyzaufB8K4uHpd8\n", "cPIOq6iD2ks=\n");

    /* JADX INFO: renamed from: ヮ, reason: contains not printable characters */
    public static final String f818 = StringFog.decrypt("VXB4nf4u0ZN7ZWmK4z3Q\n", "GhcN74d8tOQ=\n");

    /* JADX INFO: renamed from: リ, reason: contains not printable characters */
    public static final String f817 = StringFog.decrypt("TdBRqYs6xftjxUC+linEwGvEUL6cDdI=\n", "Arck2/JooIw=\n");

    /* JADX INFO: renamed from: ト, reason: contains not printable characters */
    public static final String f816 = StringFog.decrypt("T7fqiCj/d/Fhovs=\n", "ANCf+lGtEoY=\n");

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0535
    /* JADX INFO: renamed from: ﾇ */
    public final HashMap mo337() {
        HashMap map = new HashMap();
        map.put(f825, new C0406(this));
        map.put(f824, new C0401(this));
        return map;
    }

    public C0392(String str) {
        super(str);
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0535
    /* JADX INFO: renamed from: ﻛ */
    public final String mo335() {
        try {
            return Ogury.getSdkVersion();
        } catch (Throwable unused) {
            return null;
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0535
    /* JADX INFO: renamed from: ﾒ */
    public final Class mo336(String str) {
        switch (str.hashCode()) {
            case -1704786309:
                if (str.equals(f822)) {
                    return InterstitialActivity.class;
                }
                return null;
            case -734879533:
                if (str.equals(f816)) {
                    return OguryReward.class;
                }
                return null;
            case 76142724:
                if (str.equals(f821)) {
                    return Ogury.class;
                }
                return null;
            case 82913255:
                if (str.equals(f819)) {
                    return OguryInterstitialAdListener.class;
                }
                return null;
            case 186993737:
                if (str.equals(f817)) {
                    return OguryRewardedAdListener.class;
                }
                return null;
            case 1169123445:
                if (str.equals(f818)) {
                    return OguryRewardedAd.class;
                }
                return null;
            case 1789379091:
                if (str.equals(f820)) {
                    return OguryInterstitialAd.class;
                }
                return null;
            case 1866202823:
                if (str.equals(f823)) {
                    return InterstitialActivity.class;
                }
                return null;
            default:
                return null;
        }
    }
}
