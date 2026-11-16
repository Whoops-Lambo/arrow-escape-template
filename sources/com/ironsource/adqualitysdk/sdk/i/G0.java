package com.ironsource.adqualitysdk.sdk.i;

import com.ironsource.adqualitysdk.sdk.StringFog;
import com.vungle.ads.BannerAd;
import com.vungle.ads.BannerAdListener;
import com.vungle.ads.BannerAdSize;
import com.vungle.ads.BannerView;
import com.vungle.ads.BaseAd;
import com.vungle.ads.BaseAdListener;
import com.vungle.ads.BaseFullscreenAd;
import com.vungle.ads.BuildConfig;
import com.vungle.ads.FullscreenAd;
import com.vungle.ads.FullscreenAdListener;
import com.vungle.ads.InterstitialAd;
import com.vungle.ads.InterstitialAdListener;
import com.vungle.ads.RewardedAd;
import com.vungle.ads.RewardedAdListener;
import com.vungle.ads.VungleAds;
import com.vungle.ads.internal.AdInternal;
import com.vungle.ads.internal.embeddedbrowser.EmbeddedBrowserActivity;
import com.vungle.ads.internal.model.AdAsset;
import com.vungle.ads.internal.model.AdPayload;
import com.vungle.ads.internal.model.AppNode;
import com.vungle.ads.internal.model.Placement;
import com.vungle.ads.internal.network.VungleApiClient;
import com.vungle.ads.internal.presenter.MRAIDPresenter;
import com.vungle.ads.internal.ui.AdActivity;
import com.vungle.ads.internal.ui.VungleActivity;
import com.vungle.ads.internal.ui.VungleWebClient;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class G0 extends AbstractC0535 {

    /* JADX INFO: renamed from: סּ, reason: contains not printable characters */
    public static final String f157 = StringFog.decrypt("5BooB8Ghw7/RBw==\n", "pX5pZLXItdY=\n");

    /* JADX INFO: renamed from: טּ, reason: contains not printable characters */
    public static final String f156 = StringFog.decrypt("dnQCX6AQoDt5fkEQshbgNXtvCgO4BKJyYHJBMLIkrSh8bQYFrw==\n", "FRtvcdZlzlw=\n");

    /* JADX INFO: renamed from: ﬤ, reason: contains not printable characters */
    public static final String f155 = StringFog.decrypt("OW1W8jKkDQ==\n", "eAkXgUHBeXg=\n");

    /* JADX INFO: renamed from: 爫, reason: contains not printable characters */
    public static final String f154 = StringFog.decrypt("h2NNHqvk+vCnaw==\n", "xgcEcN+BiJ4=\n");

    /* JADX INFO: renamed from: 乁, reason: contains not printable characters */
    public static final String f153 = StringFog.decrypt("gh2GxXAKpDan\n", "w3nWpAlmy1c=\n");

    /* JADX INFO: renamed from: 丫, reason: contains not printable characters */
    public static final String f152 = StringFog.decrypt("ywfjbs60JA==\n", "ineTIKHQQVs=\n");

    /* JADX INFO: renamed from: ヶ, reason: contains not printable characters */
    public static final String f151 = StringFog.decrypt("7EkJZIj1R1Q=\n", "rihnCu2HBjA=\n");

    /* JADX INFO: renamed from: ヮ, reason: contains not printable characters */
    public static final String f150 = StringFog.decrypt("1Ye6JwN394vbj6c9A2vTnQ==\n", "l+bUSWYFtu8=\n");

    /* JADX INFO: renamed from: リ, reason: contains not printable characters */
    public static final String f149 = StringFog.decrypt("aZ5BVrXLJuF4llVd\n", "K/8vONC5Z4U=\n");

    /* JADX INFO: renamed from: ト, reason: contains not printable characters */
    public static final String f148 = StringFog.decrypt("ZO4No1lpoEFD+A==\n", "Jo9jzTwb9ig=\n");

    /* JADX INFO: renamed from: ゥ, reason: contains not printable characters */
    public static final String f147 = StringFog.decrypt("NGFZJt2C53g7axppz4SnXTZgWm3ZoeB6IA==\n", "Vw40CKv3iR8=\n");

    /* JADX INFO: renamed from: へ, reason: contains not printable characters */
    public static final String f146 = StringFog.decrypt("Wz9CfsE+\n", "GV4xG4Ba1qA=\n");

    /* JADX INFO: renamed from: っ, reason: contains not printable characters */
    public static final String f145 = StringFog.decrypt("/oDqS7WCCojPlfxAkZQ=\n", "vOGZLvTmRuE=\n");

    /* JADX INFO: renamed from: く, reason: contains not printable characters */
    public static final String f144 = StringFog.decrypt("k5HCHfhLUXKik8Md21B8eg==\n", "0fCxeL4+PR4=\n");

    /* JADX INFO: renamed from: Ↄ, reason: contains not printable characters */
    public static final String f143 = StringFog.decrypt("/TLFlMi/AVbbAcOMwb8AX9M2yIg=\n", "vlOm/K3eYzo=\n");

    /* JADX INFO: renamed from: Ⅽ, reason: contains not printable characters */
    public static final String f142 = StringFog.decrypt("jghah/7Rav6JF1eV6dB926gRUZTzwXY=\n", "y2U44pq1D5o=\n");

    /* JADX INFO: renamed from: K, reason: contains not printable characters */
    public static final String f141 = StringFog.decrypt("ahSGkBDTv2ZlHsXfAtX/aGcPjswIx70vbBaJ2wLCtGVrCYTJFcOjL0wWidsCwrRlSwmEyRXDo0Bq\nD4LID9Ko\n", "CXvrvmam0QE=\n");

    /* JADX INFO: renamed from: Ύ, reason: contains not printable characters */
    public static final String f140 = StringFog.decrypt("r/h/BNcrU92M41IM\n", "6Y0TaKRIIbg=\n");

    /* JADX INFO: renamed from: Ὺ, reason: contains not printable characters */
    public static final String f139 = StringFog.decrypt("ekkEmtX00LdZUimS6v7RpllSDYQ=\n", "PDxo9qaXotI=\n");

    /* JADX INFO: renamed from: Ῡ, reason: contains not printable characters */
    public static final String f138 = StringFog.decrypt("0BCzjvADv//tF6aHwxQ=\n", "mX7H64Jwy5Y=\n");

    /* JADX INFO: renamed from: Ῠ, reason: contains not printable characters */
    public static final String f137 = StringFog.decrypt("WdLUh0gNuddk1cGOexqB12PIxYxfDA==\n", "ELyg4jp+zb4=\n");

    /* JADX INFO: renamed from: Ὑ, reason: contains not printable characters */
    public static final String f136 = StringFog.decrypt("OEXkmVAzLBEGcsukcRE=\n", "dRel0BRjXnQ=\n");

    /* JADX INFO: renamed from: Ṿ, reason: contains not printable characters */
    public static final String f135 = StringFog.decrypt("dV1xvvRYmaJR\n", "JTEQ3ZE1/Mw=\n");

    /* JADX INFO: renamed from: Ḽ, reason: contains not printable characters */
    public static final String f134 = StringFog.decrypt("OhNkOTjmh1EpEg==\n", "aHYTWEqC4jU=\n");

    /* JADX INFO: renamed from: Ḹ, reason: contains not printable characters */
    public static final String f133 = StringFog.decrypt("dcR+O0A+6UVmxUUzQS7pT0LT\n", "J6EJWjJajCE=\n");

    /* JADX INFO: renamed from: Ḟ, reason: contains not printable characters */
    public static final String f132 = StringFog.decrypt("UvLlcktHU4tw7v18U1s=\n", "BIeLFSciEug=\n");

    /* JADX INFO: renamed from: ᵆ, reason: contains not printable characters */
    public static final String f131 = StringFog.decrypt("HDVR9DbjPM0TPxK7JOV8wxEuWagu9z6ECjMSjDX4NcYaG1+uKeA73gY=\n", "f1o82kCWUqo=\n");

    /* JADX INFO: renamed from: ᘥ, reason: contains not printable characters */
    public static final String f130 = StringFog.decrypt("DYV+9krJ9WQo\n", "W/AQkSastAA=\n");

    /* JADX INFO: renamed from: ᗀ, reason: contains not printable characters */
    public static final String f129 = StringFog.decrypt("wQ6i94iIHtP+OKD5gYMr\n", "l3vMkOTtX6M=\n");

    /* JADX INFO: renamed from: ᖺ, reason: contains not printable characters */
    public static final String f128 = StringFog.decrypt("Jg4bezutlMISOBl1Mqa3\n", "cHt1HFfIw6c=\n");

    /* JADX INFO: renamed from: ᖸ, reason: contains not printable characters */
    public static final String f127 = StringFog.decrypt("tCSYCxVTeN+n\n", "00HsSnEGFrY=\n");

    /* JADX INFO: renamed from: ᖭ, reason: contains not printable characters */
    public static final String f126 = StringFog.decrypt("QfOnhh676jY=\n", "JpbTx27Lo1I=\n");

    /* JADX INFO: renamed from: ᖫ, reason: contains not printable characters */
    public static final String f125 = StringFog.decrypt("oCqHCCkXjhSmLZ8uGhGWHaYsliYtGpIktSM=\n", "x0/zS0h05nE=\n");

    /* JADX INFO: renamed from: ᖩ, reason: contains not printable characters */
    public static final String f124 = StringFog.decrypt("H6Bvu/J4AT0RonU=\n", "eMUb+JMVcVw=\n");

    /* JADX INFO: renamed from: ᖅ, reason: contains not printable characters */
    public static final String f123 = StringFog.decrypt("pvO+3SohXyus86T5DyQ=\n", "wZbKjUZAPE4=\n");

    /* JADX INFO: renamed from: ᕆ, reason: contains not printable characters */
    public static final String f122 = StringFog.decrypt("VQgDfP1gJ3FTGRJ7/XkjdFwKBA==\n", "Mm13KJgNVx0=\n");

    /* JADX INFO: renamed from: ᕄ, reason: contains not printable characters */
    public static final String f121 = StringFog.decrypt("GGaXAqFJlgcUcZMOsk2L\n", "cRXFZ9Yo5GM=\n");

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0535
    /* JADX INFO: renamed from: ﾇ */
    public final HashMap mo337() {
        HashMap map = new HashMap();
        map.put(f127, new C4655z0(this));
        map.put(f126, new A0(this));
        map.put(f125, new B0(this));
        map.put(f124, new C0(this));
        map.put(f123, new D0(this));
        map.put(f122, new E0(this));
        map.put(f121, new F0(this));
        return map;
    }

    public G0(String str) {
        super(str);
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0535
    /* JADX INFO: renamed from: ﻛ */
    public final String mo335() {
        try {
            return mo342().split(StringFog.decrypt("WQ==\n", "dM9KGnmZpGo=\n"))[0];
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:95:0x0160  */
    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0535
    /* JADX INFO: renamed from: ﾒ */
    public final Class mo336(String str) {
        byte b;
        switch (str.hashCode()) {
            case -1836618638:
                if (str.equals(f157)) {
                    b = 0;
                } else {
                    b = -1;
                }
                break;
            case -1791176561:
                if (str.equals(f151)) {
                    b = 6;
                } else {
                    b = -1;
                }
                break;
            case -1560947009:
                if (str.equals(f147)) {
                    b = 10;
                } else {
                    b = -1;
                }
                break;
            case -1494265129:
                if (str.equals(f131)) {
                    b = 26;
                } else {
                    b = -1;
                }
                break;
            case -1435839138:
                if (str.equals(f140)) {
                    b = 17;
                } else {
                    b = -1;
                }
                break;
            case -1179107681:
                if (str.equals(f130)) {
                    b = 27;
                } else {
                    b = -1;
                }
                break;
            case -609786639:
                if (str.equals(f134)) {
                    b = 23;
                } else {
                    b = -1;
                }
                break;
            case -498709917:
                if (str.equals(f137)) {
                    b = 20;
                } else {
                    b = -1;
                }
                break;
            case -498060603:
                if (str.equals(f135)) {
                    b = 22;
                } else {
                    b = -1;
                }
                break;
            case -486531311:
                if (str.equals(f136)) {
                    b = 21;
                } else {
                    b = -1;
                }
                break;
            case -393802555:
                if (str.equals(f133)) {
                    b = 24;
                } else {
                    b = -1;
                }
                break;
            case -43797322:
                if (str.equals(f143)) {
                    b = 14;
                } else {
                    b = -1;
                }
                break;
            case 307971376:
                if (str.equals(f149)) {
                    b = 8;
                } else {
                    b = -1;
                }
                break;
            case 320151695:
                if (str.equals(f138)) {
                    b = 19;
                } else {
                    b = -1;
                }
                break;
            case 324239304:
                if (str.equals(f145)) {
                    b = 12;
                } else {
                    b = -1;
                }
                break;
            case 389759008:
                if (str.equals(f154)) {
                    b = 3;
                } else {
                    b = -1;
                }
                break;
            case 484680813:
                if (str.equals(f155)) {
                    b = 2;
                } else {
                    b = -1;
                }
                break;
            case 870529955:
                if (str.equals(f152)) {
                    b = 5;
                } else {
                    b = -1;
                }
                break;
            case 877570637:
                if (str.equals(f142)) {
                    b = 15;
                } else {
                    b = -1;
                }
                break;
            case 961844241:
                if (str.equals(f148)) {
                    b = 9;
                } else {
                    b = -1;
                }
                break;
            case 989853769:
                if (str.equals(f156)) {
                    b = 1;
                } else {
                    b = -1;
                }
                break;
            case 1205766784:
                if (str.equals(f132)) {
                    b = 25;
                } else {
                    b = -1;
                }
                break;
            case 1208038126:
                if (str.equals(f128)) {
                    b = 29;
                } else {
                    b = -1;
                }
                break;
            case 1442693170:
                if (str.equals(f139)) {
                    b = 18;
                } else {
                    b = -1;
                }
                break;
            case 1505622627:
                if (str.equals(f150)) {
                    b = 7;
                } else {
                    b = -1;
                }
                break;
            case 1560492986:
                if (str.equals(f141)) {
                    b = 16;
                } else {
                    b = -1;
                }
                break;
            case 1839869899:
                if (str.equals(f153)) {
                    b = 4;
                } else {
                    b = -1;
                }
                break;
            case 1853648591:
                if (str.equals(f144)) {
                    b = 13;
                } else {
                    b = -1;
                }
                break;
            case 1930966324:
                if (str.equals(f129)) {
                    b = 28;
                } else {
                    b = -1;
                }
                break;
            case 1982630644:
                if (str.equals(f146)) {
                    b = 11;
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
                return AdAsset.class;
            case 3:
                return AdInternal.class;
            case 4:
                return AdPayload.class;
            case 5:
                return AppNode.class;
            case 6:
                return BannerAd.class;
            case 7:
                return BannerAdListener.class;
            case 8:
                return BannerAdSize.class;
            case 9:
            case 10:
                return BannerView.class;
            case 11:
                return BaseAd.class;
            case 12:
                return BaseAdListener.class;
            case 13:
                return BaseFullscreenAd.class;
            case 14:
                return AdPayload.CacheableReplacement.class;
            case 15:
            case 16:
                return EmbeddedBrowserActivity.class;
            case 17:
                return FullscreenAd.class;
            case 18:
                return FullscreenAdListener.class;
            case 19:
                return InterstitialAd.class;
            case 20:
                return InterstitialAdListener.class;
            case 21:
                return MRAIDPresenter.class;
            case 22:
                return Placement.class;
            case 23:
                return RewardedAd.class;
            case 24:
                return RewardedAdListener.class;
            case 25:
            case 26:
                return VungleActivity.class;
            case 27:
                return VungleAds.class;
            case 28:
                return VungleApiClient.class;
            case 29:
                return VungleWebClient.class;
            default:
                return null;
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0535
    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final String mo342() {
        try {
            C0679 c0679 = C0891.m648().f2390;
            String strDecrypt = StringFog.decrypt("b6En2I6zaZoaoSet+PM=\n", "Mf1Dg9LXR8c=\n");
            c0679.getClass();
            return C0679.m570((Object) null, BuildConfig.class, strDecrypt);
        } catch (Throwable unused) {
            return null;
        }
    }
}
