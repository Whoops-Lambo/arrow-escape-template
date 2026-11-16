package com.ironsource.adqualitysdk.sdk.i;

import com.google.android.libraries.ads.mobile.sdk.MobileAds;
import com.google.android.libraries.ads.mobile.sdk.appopen.AppOpenAd;
import com.google.android.libraries.ads.mobile.sdk.appopen.AppOpenAdEventCallback;
import com.google.android.libraries.ads.mobile.sdk.banner.AdSize;
import com.google.android.libraries.ads.mobile.sdk.banner.AdView;
import com.google.android.libraries.ads.mobile.sdk.banner.BannerAd;
import com.google.android.libraries.ads.mobile.sdk.banner.BannerAdEventCallback;
import com.google.android.libraries.ads.mobile.sdk.banner.BannerAdRequest;
import com.google.android.libraries.ads.mobile.sdk.common.AdActivity;
import com.google.android.libraries.ads.mobile.sdk.common.AdLoadCallback;
import com.google.android.libraries.ads.mobile.sdk.common.AdRequest;
import com.google.android.libraries.ads.mobile.sdk.common.FullScreenContentError;
import com.google.android.libraries.ads.mobile.sdk.common.RequestConfiguration;
import com.google.android.libraries.ads.mobile.sdk.initialization.InitializationConfig;
import com.google.android.libraries.ads.mobile.sdk.interstitial.InterstitialAd;
import com.google.android.libraries.ads.mobile.sdk.interstitial.InterstitialAdEventCallback;
import com.google.android.libraries.ads.mobile.sdk.rewarded.OnUserEarnedRewardListener;
import com.google.android.libraries.ads.mobile.sdk.rewarded.RewardedAd;
import com.google.android.libraries.ads.mobile.sdk.rewarded.RewardedAdEventCallback;
import com.google.android.libraries.ads.mobile.sdk.rewardedinterstitial.RewardedInterstitialAd;
import com.google.android.libraries.ads.mobile.sdk.rewardedinterstitial.RewardedInterstitialAdEventCallback;
import com.ironsource.adqualitysdk.sdk.StringFog;
import java.util.HashMap;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.п, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
public final class C0556 extends AbstractC0535 {

    /* JADX INFO: renamed from: ᖅ, reason: contains not printable characters */
    public static final String f1322;

    /* JADX INFO: renamed from: ᖩ, reason: contains not printable characters */
    public static final String f1323;

    /* JADX INFO: renamed from: ᖫ, reason: contains not printable characters */
    public static final String f1324;

    /* JADX INFO: renamed from: ᖭ, reason: contains not printable characters */
    public static final String f1325;

    /* JADX INFO: renamed from: ᖸ, reason: contains not printable characters */
    public static final String f1326;

    /* JADX INFO: renamed from: ᖺ, reason: contains not printable characters */
    public static final String f1327;

    /* JADX INFO: renamed from: ᗀ, reason: contains not printable characters */
    public static final String f1328;

    /* JADX INFO: renamed from: ᘥ, reason: contains not printable characters */
    public static final String f1329;

    /* JADX INFO: renamed from: ᵆ, reason: contains not printable characters */
    public static final String f1330;

    /* JADX INFO: renamed from: סּ, reason: contains not printable characters */
    public static final String f1356 = StringFog.decrypt("UXUGTQ8iZg5BUhNiBRF9KlI=\n", "NhByDGt0D2s=\n");

    /* JADX INFO: renamed from: טּ, reason: contains not printable characters */
    public static final String f1355 = StringFog.decrypt("SnE9KSXeFupfVS0qIOMR9Ug=\n", "LRRJa0SweI8=\n");

    /* JADX INFO: renamed from: ﬤ, reason: contains not printable characters */
    public static final String f1354 = StringFog.decrypt("PU5tVQZUI+E+Tn1GB2Im3j9feGMCVyM=\n", "WisZB2MjQpM=\n");

    /* JADX INFO: renamed from: 爫, reason: contains not printable characters */
    public static final String f1353 = StringFog.decrypt("rfWMnnsAvb6u9ZyNeiW5u6vinIVqErE=\n", "ypD4zB533Mw=\n");

    /* JADX INFO: renamed from: 乁, reason: contains not printable characters */
    public static final String f1352 = StringFog.decrypt("Lrron3GM6o4tuviEeo/ujjqr9bl9mue9LZ74gHGP6pgoq/0=\n", "Sd+czRT7i/w=\n");

    /* JADX INFO: renamed from: 丫, reason: contains not printable characters */
    public static final String f1351 = StringFog.decrypt("VilZgyx7yJZVKUmYJ3jMlkI4RKUgbcWlVR5Ipih+za1FKUA=\n", "MUwt0UkMqeQ=\n");

    /* JADX INFO: renamed from: ヶ, reason: contains not printable characters */
    public static final String f1350 = StringFog.decrypt("fkQZNDtzCmFqVQQJPGYDQXxSHRI7dApad0cC\n", "GSFtfVUHbxM=\n");

    /* JADX INFO: renamed from: ヮ, reason: contains not printable characters */
    public static final String f1349 = StringFog.decrypt("8YJMwpq/nbbyglzRm5qZt+aIVuOagZKi+Q==\n", "luc4kP/I/MQ=\n");

    /* JADX INFO: renamed from: リ, reason: contains not printable characters */
    public static final String f1348 = StringFog.decrypt("xRRkclQV2X/GFHRpXxbdf9EFeVRYA9RfxwJgT18R3UTMF38=\n", "onEQIDFiuA0=\n");

    /* JADX INFO: renamed from: ト, reason: contains not printable characters */
    public static final String f1347 = StringFog.decrypt("R/nS88IEfkRO78Poww==\n", "IJymoad3Dis=\n");

    /* JADX INFO: renamed from: ゥ, reason: contains not printable characters */
    public static final String f1346 = StringFog.decrypt("CvyIQUrBQNEJ2JheStVW1wjLmX5Vz0rHCNCSa0o=\n", "bZn8DSWgJLQ=\n");

    /* JADX INFO: renamed from: へ, reason: contains not printable characters */
    public static final String f1345 = StringFog.decrypt("VG+dPqPQsopBaYwxpu64\n", "Mwrpf8eD3f8=\n");

    /* JADX INFO: renamed from: っ, reason: contains not printable characters */
    public static final String f1344 = StringFog.decrypt("nkoJ1vTJcq2rVw==\n", "3y5ItYCgBMQ=\n");

    /* JADX INFO: renamed from: く, reason: contains not printable characters */
    public static final String f1343 = StringFog.decrypt("PnRrefutJvsb\n", "fwQbNovISLo=\n");

    /* JADX INFO: renamed from: Ↄ, reason: contains not printable characters */
    public static final String f1342 = StringFog.decrypt("d9x1D6HtIvZS6XMlv/wP1lrAZyGy4w==\n", "NqwFQNGITLc=\n");

    /* JADX INFO: renamed from: Ⅽ, reason: contains not printable characters */
    public static final String f1341 = StringFog.decrypt("f9PcMCWR6qxw2Z9/LJr3pHXYn3IrnPeqbtXUbWyf4bgy0d58K5Lg5W/Y2jAhkeimc9KfXya/5r91\nythqOw==\n", "HLyxHkL+hcs=\n");

    /* JADX INFO: renamed from: K, reason: contains not printable characters */
    public static final String f1340 = StringFog.decrypt("1y49HL7+4X/p\n", "mkFfddKboBs=\n");

    /* JADX INFO: renamed from: Ύ, reason: contains not printable characters */
    public static final String f1339 = StringFog.decrypt("QBIh/NPN\n", "AXZylamotVY=\n");

    /* JADX INFO: renamed from: Ὺ, reason: contains not printable characters */
    public static final String f1338 = StringFog.decrypt("2mFyY8mV\n", "mwUkCqzijSE=\n");

    /* JADX INFO: renamed from: Ῡ, reason: contains not printable characters */
    public static final String f1337 = StringFog.decrypt("JUkPMWvFLgIqQ0x+Ys4zCi9CTHNlyDMENE8HbCLLJRZoSw19ZcYkSzVCCTFuyy8LI1RMXmj8KAAx\n", "RiZiHwyqQWU=\n");

    /* JADX INFO: renamed from: Ῠ, reason: contains not printable characters */
    public static final String f1336 = StringFog.decrypt("EkE1dWdFn/A=\n", "UCBbGwI33pQ=\n");

    /* JADX INFO: renamed from: Ὑ, reason: contains not printable characters */
    public static final String f1335 = StringFog.decrypt("sNqP90VGchq3zYT3VHdSEp7ZgPpL\n", "8rvhmSA0M34=\n");

    /* JADX INFO: renamed from: Ṿ, reason: contains not printable characters */
    public static final String f1334 = StringFog.decrypt("lsiuqoLjovOGzLGxguKX\n", "1KnAxOeR45c=\n");

    /* JADX INFO: renamed from: Ḽ, reason: contains not printable characters */
    public static final String f1333 = StringFog.decrypt("Db2elSr0UyUgtbCbKPs=\n", "TNnS+kuQEEQ=\n");

    /* JADX INFO: renamed from: Ḹ, reason: contains not printable characters */
    public static final String f1332 = StringFog.decrypt("Z7c75lGQUCZS\n", "JtNpgyDlNVU=\n");

    /* JADX INFO: renamed from: Ḟ, reason: contains not printable characters */
    public static final String f1331 = StringFog.decrypt("E/HASGaLdwIw6u9LW5xgCSHB3lZamg==\n", "VYSsJDXoBWc=\n");

    static {
        StringFog.decrypt("jr/yZiJwgtiwv+E=\n", "wtCTAmMUx6o=\n");
        f1330 = StringFog.decrypt("pYRmJUxEyeKYj3E5TkLPwIOIeD4=\n", "9+EXUCk3vaE=\n");
        f1329 = StringFog.decrypt("kwVuoV70fwegCnO8WPtQAbQNbrI=\n", "2msH1TeVE24=\n");
        f1328 = StringFog.decrypt("hrOWEhgF0qK7tIMbKxI=\n", "z93id2p2pss=\n");
        f1327 = StringFog.decrypt("Fer4bXgJ6S4o7e1kSx7YMTnq+EtrFvElPefn\n", "XISMCAp6nUc=\n");
        f1326 = StringFog.decrypt("G3gGjIV5af8meDabsm5b/yZyH5aTf0nwMWQ=\n", "VBZT/+ALLJ4=\n");
        f1325 = StringFog.decrypt("FFUOBf2XQzoHVA==\n", "RjB5ZI/zJl4=\n");
        f1324 = StringFog.decrypt("W11D/ONDs5NIXHHr9EmitGhUWP/wRL0=\n", "CTg0nZEn1vc=\n");
        f1323 = StringFog.decrypt("tees3Je38Biu7K/Yl6DhFZPrutGktw==\n", "54LbveXTlXw=\n");
        f1322 = StringFog.decrypt("2nSSCrhFsOnBf5EOuFKh5Px4hAeLRZD77X+RKKtNue/pco4=\n", "iBHla8oh1Y0=\n");
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0535
    /* JADX INFO: renamed from: ﾇ */
    public final HashMap mo337() {
        HashMap map = new HashMap();
        map.put(f1356, new C0601(this));
        map.put(f1355, new C0600(this));
        map.put(f1354, new C0598(this));
        map.put(f1353, new C0593(this));
        map.put(f1352, new C0589(this));
        map.put(f1351, new C0585(this));
        map.put(f1350, new C0577(this));
        map.put(f1349, new C0574(this));
        map.put(f1348, new C0570(this));
        map.put(f1347, new C0627(this));
        map.put(f1346, new C0624(this));
        map.put(f1345, new C0603(this));
        return map;
    }

    public C0556(String str) {
        super(str);
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0535
    /* JADX INFO: renamed from: ﻛ */
    public final String mo335() {
        return MobileAds.getVersion().toString();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:74:0x010b  */
    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0535
    /* JADX INFO: renamed from: ﾒ */
    public final Class mo336(String str) {
        byte b;
        switch (str.hashCode()) {
            case -2082809970:
                if (str.equals(f1324)) {
                    b = 20;
                } else {
                    b = -1;
                }
                break;
            case -1959585521:
                if (str.equals(f1341)) {
                    b = 1;
                } else {
                    b = -1;
                }
                break;
            case -1836618638:
                if (str.equals(f1344)) {
                    b = 0;
                } else {
                    b = -1;
                }
                break;
            case -1791176561:
                if (str.equals(f1336)) {
                    b = 8;
                } else {
                    b = -1;
                }
                break;
            case -1666698098:
                if (str.equals(f1340)) {
                    b = 2;
                } else {
                    b = -1;
                }
                break;
            case -1620193212:
                if (str.equals(f1337)) {
                    b = 7;
                } else {
                    b = -1;
                }
                break;
            case -1394472790:
                if (str.equals(f1331)) {
                    b = 13;
                } else {
                    b = -1;
                }
                break;
            case -909742738:
                if (str.equals(f1343)) {
                    b = 3;
                } else {
                    b = -1;
                }
                break;
            case -796191954:
                if (str.equals(f1333)) {
                    b = 11;
                } else {
                    b = -1;
                }
                break;
            case -609786639:
                if (str.equals(f1325)) {
                    b = 19;
                } else {
                    b = -1;
                }
                break;
            case -572702516:
                if (str.equals(f1332)) {
                    b = 12;
                } else {
                    b = -1;
                }
                break;
            case -561136464:
                if (str.equals(f1335)) {
                    b = 9;
                } else {
                    b = -1;
                }
                break;
            case -543102915:
                if (str.equals(f1323)) {
                    b = 21;
                } else {
                    b = -1;
                }
                break;
            case -289968976:
                if (str.equals(f1327)) {
                    b = 17;
                } else {
                    b = -1;
                }
                break;
            case -284636416:
                if (str.equals(f1334)) {
                    b = 10;
                } else {
                    b = -1;
                }
                break;
            case -139181519:
                if (str.equals(f1342)) {
                    b = 4;
                } else {
                    b = -1;
                }
                break;
            case 143003586:
                if (str.equals(f1322)) {
                    b = 22;
                } else {
                    b = -1;
                }
                break;
            case 320151695:
                if (str.equals(f1328)) {
                    b = 16;
                } else {
                    b = -1;
                }
                break;
            case 474883106:
                if (str.equals(f1329)) {
                    b = 15;
                } else {
                    b = -1;
                }
                break;
            case 761303268:
                if (str.equals(f1326)) {
                    b = 18;
                } else {
                    b = -1;
                }
                break;
            case 1334167239:
                if (str.equals(f1330)) {
                    b = 14;
                } else {
                    b = -1;
                }
                break;
            case 1955824356:
                if (str.equals(f1339)) {
                    b = 5;
                } else {
                    b = -1;
                }
                break;
            case 1955913096:
                if (str.equals(f1338)) {
                    b = 6;
                } else {
                    b = -1;
                }
                break;
            default:
                b = -1;
                break;
        }
        switch (b) {
            case 0:
            case 1:
                return AdActivity.class;
            case 2:
                return MobileAds.class;
            case 3:
                return AppOpenAd.class;
            case 4:
                return AppOpenAdEventCallback.class;
            case 5:
                return AdSize.class;
            case 6:
            case 7:
                return AdView.class;
            case 8:
                return BannerAd.class;
            case 9:
                return BannerAdEventCallback.class;
            case 10:
                return BannerAdRequest.class;
            case 11:
                return AdLoadCallback.class;
            case 12:
                return AdRequest.class;
            case 13:
                return FullScreenContentError.class;
            case 14:
                return RequestConfiguration.class;
            case 15:
                return InitializationConfig.class;
            case 16:
                return InterstitialAd.class;
            case 17:
                return InterstitialAdEventCallback.class;
            case 18:
                return OnUserEarnedRewardListener.class;
            case 19:
                return RewardedAd.class;
            case 20:
                return RewardedAdEventCallback.class;
            case 21:
                return RewardedInterstitialAd.class;
            case 22:
                return RewardedInterstitialAdEventCallback.class;
            default:
                return null;
        }
    }
}
