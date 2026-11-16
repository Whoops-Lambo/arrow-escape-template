package com.ironsource.adqualitysdk.sdk.i;

import com.amazon.device.ads.DTBAdView;
import com.ironsource.adqualitysdk.sdk.StringFog;
import com.ironsource.mediationsdk.AbstractAdapter;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.IronSourceBannerLayout;
import com.ironsource.mediationsdk.ads.nativead.AdapterNativeAdData;
import com.ironsource.mediationsdk.ads.nativead.LevelPlayMediaView;
import com.ironsource.mediationsdk.ads.nativead.LevelPlayNativeAd;
import com.ironsource.mediationsdk.ads.nativead.LevelPlayNativeAdListener;
import com.ironsource.mediationsdk.ads.nativead.NativeAdLayout;
import com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdAdapterInterface;
import com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdDataInterface;
import com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdInteractionListener;
import com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdInterface;
import com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdLoadListener;
import com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdSmashListener;
import com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdViewBinderInterface;
import com.ironsource.mediationsdk.ads.nativead.internal.InternalNativeAdListener;
import com.ironsource.mediationsdk.ads.nativead.internal.NativeAdViewHolder;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdData;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo;
import com.ironsource.mediationsdk.impressionData.ImpressionData;
import com.ironsource.mediationsdk.impressionData.ImpressionDataListener;
import com.ironsource.mediationsdk.model.Placement;
import com.ironsource.mediationsdk.sdk.BannerSmashListener;
import com.ironsource.mediationsdk.sdk.LevelPlayBannerListener;
import com.ironsource.mediationsdk.sdk.LevelPlayInterstitialListener;
import com.ironsource.mediationsdk.sdk.LevelPlayRewardedVideoAutomaticListener;
import com.ironsource.mediationsdk.sdk.LevelPlayRewardedVideoListener;
import com.ironsource.mediationsdk.sdk.LevelPlayRewardedVideoManualListener;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import com.ironsource.sdk.controller.ControllerActivity;
import com.ironsource.sdk.controller.InterstitialActivity;
import com.ironsource.sdk.controller.OpenUrlActivity;
import com.unity3d.ironsourceads.IronSourceAds;
import com.unity3d.ironsourceads.banner.BannerAdInfo;
import com.unity3d.ironsourceads.banner.BannerAdRequest;
import com.unity3d.ironsourceads.banner.BannerAdView;
import com.unity3d.ironsourceads.banner.BannerAdViewListener;
import com.unity3d.ironsourceads.interstitial.InterstitialAd;
import com.unity3d.ironsourceads.interstitial.InterstitialAdInfo;
import com.unity3d.ironsourceads.interstitial.InterstitialAdListener;
import com.unity3d.ironsourceads.interstitial.InterstitialAdRequest;
import com.unity3d.ironsourceads.rewarded.RewardedAd;
import com.unity3d.ironsourceads.rewarded.RewardedAdInfo;
import com.unity3d.ironsourceads.rewarded.RewardedAdListener;
import com.unity3d.ironsourceads.rewarded.RewardedAdRequest;
import com.unity3d.mediation.LevelPlay;
import com.unity3d.mediation.LevelPlayAdInfo;
import com.unity3d.mediation.banner.LevelPlayBannerAdView;
import com.unity3d.mediation.banner.LevelPlayBannerAdViewListener;
import com.unity3d.mediation.impression.LevelPlayImpressionData;
import com.unity3d.mediation.impression.LevelPlayImpressionDataListener;
import com.unity3d.mediation.interstitial.LevelPlayInterstitialAd;
import com.unity3d.mediation.interstitial.LevelPlayInterstitialAdListener;
import com.unity3d.mediation.rewarded.LevelPlayReward;
import com.unity3d.mediation.rewarded.LevelPlayRewardedAd;
import com.unity3d.mediation.rewarded.LevelPlayRewardedAdListener;
import java.util.HashMap;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.ךּ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class C1187 extends AbstractC0535 {

    /* JADX INFO: renamed from: סּ, reason: contains not printable characters */
    public static final String f3569 = StringFog.decrypt("158pXQ15yMDdnzN5L3nGwA==\n", "sPpdDWEYq6U=\n");

    /* JADX INFO: renamed from: טּ, reason: contains not printable characters */
    public static final String f3568 = StringFog.decrypt("YIqvlLj0/Jp1o7qvtu/mr2uOuLO0//yLSY62sw==\n", "B+/b1tmakv8=\n");

    /* JADX INFO: renamed from: ﬤ, reason: contains not printable characters */
    public static final String f3567 = StringFog.decrypt("IeUZImCNVlA18wQEY7lFQSfKHgRj\n", "RoBtaw39JDU=\n");

    /* JADX INFO: renamed from: 爫, reason: contains not printable characters */
    public static final String f3566 = StringFog.decrypt("qC1w3HU5K3q6On36dg04a6gFfeZsLDd6uw==\n", "yUkUlRhJWR8=\n");

    /* JADX INFO: renamed from: 乁, reason: contains not printable characters */
    public static final String f3565 = StringFog.decrypt("V1/o1cYbGPRVSODJwxc+92Fb8dv8FyLtQFTgyA==\n", "JTqFurB+UZk=\n");

    /* JADX INFO: renamed from: 丫, reason: contains not printable characters */
    public static final String f3564 = StringFog.decrypt("sA4IBNZpKrSmKhgG3m43p60ODg==\n", "w2t8SrcdQ8I=\n");

    /* JADX INFO: renamed from: ヶ, reason: contains not printable characters */
    public static final String f3563 = StringFog.decrypt("G5Xx+YMsVgEOtOTehw==\n", "fPCFquZeIGQ=\n");

    /* JADX INFO: renamed from: ヮ, reason: contains not printable characters */
    public static final String f3562 = StringFog.decrypt("xQuo8YSSJ2bFDbr1gpY2\n", "hGnbhfbzRBI=\n");

    /* JADX INFO: renamed from: リ, reason: contains not printable characters */
    public static final String f3561 = StringFog.decrypt("STMTavEnWqpt\n", "GV9yCZRKP8Q=\n");

    /* JADX INFO: renamed from: ト, reason: contains not printable characters */
    public static final String f3560 = StringFog.decrypt("Ifo0KcfEmEkH5xs+wcKCTBbs\n", "YpVaXbWr9CU=\n");

    /* JADX INFO: renamed from: ゥ, reason: contains not printable characters */
    public static final String f3559 = StringFog.decrypt("VUWLC/H1eLNFRZNX++I5rlJByEb36WOvWUaKQOqpVLJYXpRK9Otyr3dJkkzu7mOk\n", "NirmJZiHF90=\n");

    /* JADX INFO: renamed from: へ, reason: contains not printable characters */
    public static final String f3558 = StringFog.decrypt("leZW0fz1MKqo4UPYz+UwqqrhVs0=\n", "3IgitI6GRMM=\n");

    /* JADX INFO: renamed from: っ, reason: contains not printable characters */
    public static final String f3557 = StringFog.decrypt("qtaMlkK9T9S61pTKSKoOya3Sz9tEoVTIptWN3VnhadS93JPLX6ZU06jVoNtfplbTvcA=\n", "ybnhuCvPILo=\n");

    /* JADX INFO: renamed from: く, reason: contains not printable characters */
    public static final String f3556 = StringFog.decrypt("DHgPaIxM7RYgfANwsEr4\n", "QwhqBtk+gVc=\n");

    /* JADX INFO: renamed from: Ↄ, reason: contains not printable characters */
    public static final String f3555 = StringFog.decrypt("Iv4kiMS/hcgy/jzUzqjE1SX6Z8XCo57ULv0lw9/jpdYk/xzUwYyJ0ijnINLU\n", "QZFJpq3N6qY=\n");

    /* JADX INFO: renamed from: Ⅽ, reason: contains not printable characters */
    public static final String f3554 = StringFog.decrypt("vWRa+d2TS5qXc3f24JJbmrh3TPj7iA==\n", "9BY1l478Pug=\n");

    /* JADX INFO: renamed from: K, reason: contains not printable characters */
    public static final String f3553 = StringFog.decrypt("4oRTFkUJNIPyhEtKTx51gOSPV1lYEjSD8o9VFmUJNIPShEtKTx4ZjO+FW0pgGiKC9J8=\n", "ges+OCx7W+0=\n");

    /* JADX INFO: renamed from: Ύ, reason: contains not printable characters */
    public static final String f3552 = StringFog.decrypt("XSW66+0JnsJ+N7zJ4Qi5ynEhpg==\n", "H0TUhYh7za8=\n");

    /* JADX INFO: renamed from: Ὺ, reason: contains not printable characters */
    public static final String f3551 = StringFog.decrypt("UqrYj2EalkZ4vQ==\n", "G9i34TJ14zQ=\n");

    /* JADX INFO: renamed from: Ῡ, reason: contains not printable characters */
    public static final String f3550 = StringFog.decrypt("s+X+kuOhOpGV5sqB8rM=\n", "+oiO4IbSSfg=\n");

    /* JADX INFO: renamed from: Ῠ, reason: contains not printable characters */
    public static final String f3549 = StringFog.decrypt("GAkzTeki4tQ+Cgde+DDd1CIQJlHpIw==\n", "UWRDP4xRkb0=\n");

    /* JADX INFO: renamed from: Ὑ, reason: contains not printable characters */
    public static final String f3548 = StringFog.decrypt("fvjLrvtiI5ZN\n", "OqyJ7580SvM=\n");

    /* JADX INFO: renamed from: Ṿ, reason: contains not printable characters */
    public static final String f3547 = StringFog.decrypt("jM5GcvmtY8iAzwU4/bZr0YqPSjjr7kbmreBPCvGldQ==\n", "76ErXJjAArI=\n");

    /* JADX INFO: renamed from: Ḽ, reason: contains not printable characters */
    public static final String f3546 = StringFog.decrypt("vrDTjKDX0euLl8SHouLPxpum0Yyi4s8=\n", "8tWl6cyHvYo=\n");

    /* JADX INFO: renamed from: Ḹ, reason: contains not printable characters */
    public static final String f3545 = StringFog.decrypt("ICx1vuBVsnQVAG2v6XetYQU9arrgSbdmGCxtvv4=\n", "bEkD24wF3hU=\n");

    /* JADX INFO: renamed from: Ḟ, reason: contains not printable characters */
    public static final String f3544 = StringFog.decrypt("3U8j6CGIw4foeDD6LKrLg/V8POkot+6T5UU47DmxzKr4WSHoI73d\n", "kSpVjU3Yr+Y=\n");

    /* JADX INFO: renamed from: ᵆ, reason: contains not printable characters */
    public static final String f3543 = StringFog.decrypt("TI2jsse1Jx15urCgypcvGWS+vLPOigcVc5ywuc6X\n", "AOjV16vlS3w=\n");

    /* JADX INFO: renamed from: ᘥ, reason: contains not printable characters */
    public static final String f3542 = StringFog.decrypt("IbYPLt378/gUgRw80Nn7/AmFEC/UxNL4A6YYJ/3C7O0IvRw5\n", "bdN5S7Grn5k=\n");

    /* JADX INFO: renamed from: ᗀ, reason: contains not printable characters */
    public static final String f3541 = StringFog.decrypt("C0FYF9ZH\n", "SiURebAoNwo=\n");

    /* JADX INFO: renamed from: ᖺ, reason: contains not printable characters */
    public static final String f3540 = StringFog.decrypt("6C9ALjAi7jfdBFc/NQTnF8A=\n", "pEo2S1xyglY=\n");

    /* JADX INFO: renamed from: ᖸ, reason: contains not printable characters */
    public static final String f3539 = StringFog.decrypt("0fdRXgVCGKTT91xYBlM=\n", "n5YlN3MnWcA=\n");

    /* JADX INFO: renamed from: ᖭ, reason: contains not printable characters */
    public static final String f3538 = StringFog.decrypt("hFTIr5j4jOexf9++nd6Fx6x917mAzY7jug==\n", "yDG+yvSo4IY=\n");

    /* JADX INFO: renamed from: ᖫ, reason: contains not printable characters */
    public static final String f3537 = StringFog.decrypt("2ZctdfTv8Bfsvz508d7KH/CF\n", "lfJbEJi/nHY=\n");

    /* JADX INFO: renamed from: ᖩ, reason: contains not printable characters */
    public static final String f3536 = StringFog.decrypt("l6kWkWTEWZC3uR6XdeBPmre5Fg==\n", "1s134RChK94=\n");

    /* JADX INFO: renamed from: ᖅ, reason: contains not printable characters */
    public static final String f3535 = StringFog.decrypt("NgC3yYlbb2UuCKbXt1FCZR0T\n", "eGHDoP8+LgE=\n");

    /* JADX INFO: renamed from: ᕆ, reason: contains not printable characters */
    public static final String f3534 = StringFog.decrypt("fuDNBclUDp55780JzV8ulnvnyhTeVAqA\n", "N465YLs6b/I=\n");

    /* JADX INFO: renamed from: ᕄ, reason: contains not printable characters */
    public static final String f3533 = StringFog.decrypt("jTqw6ZhLEjqCP6XwmkshF60vofKITzA7\n", "w1vEgO4uU14=\n");

    /* JADX INFO: renamed from: ᕃ, reason: contains not printable characters */
    public static final String f3532 = StringFog.decrypt("+Ssqwwk80rvzKyrLNjfnusUsP8ka\n", "t0peqn9Zk98=\n");

    /* JADX INFO: renamed from: ᕂ, reason: contains not printable characters */
    public static final String f3531 = StringFog.decrypt("J+aUPD5gcbEg6ZQwOmRToQDojhkhdkSwB+KS\n", "aYfgVUgFMNU=\n");

    /* JADX INFO: renamed from: ᔽ, reason: contains not printable characters */
    public static final String f3530 = StringFog.decrypt("ZUYuAfvEN5xiSS4N/8cXm04=\n", "KydaaI2hdvg=\n");

    /* JADX INFO: renamed from: ᔺ, reason: contains not printable characters */
    public static final String f3529 = StringFog.decrypt("kCjuZy4CJu2SJvtqFA4U/bsn/3w=\n", "3kmaDlhnZ4k=\n");

    /* JADX INFO: renamed from: ᔹ, reason: contains not printable characters */
    public static final String f3528 = StringFog.decrypt("quF62ziBIc+37W/BJqgJ2JDlYNc8\n", "5IAOsk7kYKs=\n");

    /* JADX INFO: renamed from: ᔲ, reason: contains not printable characters */
    public static final String f3527 = StringFog.decrypt("EyYNlMD7hK0LLhyK9PerrTg1MJPC+7evPCQc\n", "XUd5/baexck=\n");

    /* JADX INFO: renamed from: ᔱ, reason: contains not printable characters */
    public static final String f3526 = StringFog.decrypt("DzcfKagP\n", "TlNbSNxuPxs=\n");

    /* JADX INFO: renamed from: ᓮ, reason: contains not printable characters */
    public static final String f3525 = StringFog.decrypt("AKmcNfvaMd41jY4Z+ewy\n", "TMzqUJeKXb8=\n");

    /* JADX INFO: renamed from: ᐱ, reason: contains not printable characters */
    public static final String f3524 = StringFog.decrypt("RP/AKWQ04y5x2NciZgH9DmzM3yl/\n", "CJq2TAhkj08=\n");

    /* JADX INFO: renamed from: Ꮭ, reason: contains not printable characters */
    public static final String f3523 = StringFog.decrypt("dTnPm3m2mC5vZcabYb2VM3ciy9pi9pM7eDjHxyKUlCxzOvLZbaGzO3g4x8dNvKczcyE=\n", "FlaitQzY8Vo=\n");

    /* JADX INFO: renamed from: Ꮧ, reason: contains not printable characters */
    public static final String f3522 = StringFog.decrypt("KYc703XD22wcoCzYd/bFTAG0JNNu395+EYcj02s=\n", "ZeJNthmTtw0=\n");

    /* JADX INFO: renamed from: პ, reason: contains not printable characters */
    public static final String f3521 = StringFog.decrypt("0cHNQ9JOx2D71uNJ8mfdYPXS1g==\n", "mLOiLYEhshI=\n");

    /* JADX INFO: renamed from: ე, reason: contains not printable characters */
    public static final String f3520 = StringFog.decrypt("5OABW3pXNTTv7wla\n", "poFvNR8ldFA=\n");

    /* JADX INFO: renamed from: ງ, reason: contains not printable characters */
    public static final String f3519 = StringFog.decrypt("6KbgENjUEiv4ov8L2NUn\n", "qseOfr2mU08=\n");

    /* JADX INFO: renamed from: อ, reason: contains not printable characters */
    public static final String f3518 = StringFog.decrypt("U1QYU1jknHxHXBNK\n", "ETV2PT2W3Rg=\n");

    /* JADX INFO: renamed from: ม, reason: contains not printable characters */
    public static final String f3517 = StringFog.decrypt("x2+OavhH9mbdM4dq5FvwfNdvljbuTP521y6BJeNH+mCKQoIq40ztU8BWiiH6\n", "pADjRI0pnxI=\n");

    /* JADX INFO: renamed from: น, reason: contains not printable characters */
    public static final String f3516 = StringFog.decrypt("D5mA+Xyh8nkbkYvgVbrAaSiWi+U=\n", "TfjulxnTsx0=\n");

    /* JADX INFO: renamed from: ต, reason: contains not printable characters */
    public static final String f3515 = StringFog.decrypt("sPWsOP+pgxeN8rkxzL4=\n", "+ZvYXY3a934=\n");

    /* JADX INFO: renamed from: ฑ, reason: contains not printable characters */
    public static final String f3514 = StringFog.decrypt("S/+fTn635852+IpHTaDayWT+\n", "ApHrKwzEk6c=\n");

    /* JADX INFO: renamed from: ঢ়, reason: contains not printable characters */
    public static final String f3513 = StringFog.decrypt("nwK+5rd6DHyiBavvhG00fKUYr+2gew==\n", "1mzKg8UJeBU=\n");

    /* JADX INFO: renamed from: ষ, reason: contains not printable characters */
    public static final String f3512 = StringFog.decrypt("4cVxIVcxycbcwmQoZCbvytneYDdR\n", "qKsFRCVCva8=\n");

    /* JADX INFO: renamed from: ঘ, reason: contains not printable characters */
    public static final String f3511 = StringFog.decrypt("ibS2E43aIm2atQ==\n", "29HBcv++Rwk=\n");

    /* JADX INFO: renamed from: খ, reason: contains not printable characters */
    public static final String f3510 = StringFog.decrypt("WSh3b0pBeDhKKUlgXko=\n", "C00ADjglHVw=\n");

    /* JADX INFO: renamed from: এ, reason: contains not printable characters */
    public static final String f3509 = StringFog.decrypt("sICfLx9weYWjgaQnHmB5j4eX\n", "4uXoTm0UHOE=\n");

    /* JADX INFO: renamed from: ऱ, reason: contains not printable characters */
    public static final String f3508 = StringFog.decrypt("YP36QxcXQSNz/N9HFAZBNEY=\n", "MpiNImVzJEc=\n");

    /* JADX INFO: renamed from: ܟ, reason: contains not printable characters */
    public static final String f3507 = StringFog.decrypt("2jKkhqPNdCvvHryXqu9rPv8ju4Kj3Hw=\n", "llfS48+dGEo=\n");

    /* JADX INFO: renamed from: ܘ, reason: contains not printable characters */
    public static final String f3506 = StringFog.decrypt("DfarmrTa3NU42rOLvfjDwCjntJ60y9T4KOCpmrbvwg==\n", "QZPd/9iKsLQ=\n");

    /* JADX INFO: renamed from: ے, reason: contains not printable characters */
    public static final String f3505 = StringFog.decrypt("sLw1FzeTRQWFiyYFOrFNAZiYJw==\n", "/NlDclvDKWQ=\n");

    /* JADX INFO: renamed from: ۉ, reason: contains not printable characters */
    public static final String f3504 = StringFog.decrypt("tGQs6iq4lB+BUz/4J5qcG5xAPsMvm4wblmQo\n", "+AFaj0bo+H4=\n");

    /* JADX INFO: renamed from: ۅ, reason: contains not printable characters */
    public static final String f3503 = StringFog.decrypt("udsQsRT68zmM7AOjGdj7\n", "9b5m1Hiqn1g=\n");

    /* JADX INFO: renamed from: ڑ, reason: contains not printable characters */
    public static final String f3502 = StringFog.decrypt("hi+hGch7CfqzA7oM1k4W6KMluTjFXwQ=\n", "ykrXfKQrZZs=\n");

    /* JADX INFO: renamed from: پ, reason: contains not printable characters */
    public static final String f3501 = StringFog.decrypt("dk0lEtdSMhJDYT4HyWctAFNHPTPadj8/U1snEtVnLA==\n", "OihTd7sCXnM=\n");

    /* JADX INFO: renamed from: ٽ, reason: contains not printable characters */
    public static final String f3500 = StringFog.decrypt("6e/HcZ54RzPe5tJEsmNSLev5wFSUYGY++uv5TpRg\n", "joqzPfsOIl8=\n");

    /* JADX INFO: renamed from: ث, reason: contains not printable characters */
    public static final String f3499 = StringFog.decrypt("s8nJAMbzMAqCwcw16uglFLfe3iXM6xkPodnIIsb3\n", "0q2tTKOFVWY=\n");

    /* JADX INFO: renamed from: ת, reason: contains not printable characters */
    public static final String f3498 = StringFog.decrypt("bRXyYUG19MVpFfNeW7HB6XIA7WtEo9HPcTz2fUO11sVt\n", "H3CfDjfQuKA=\n");

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0535
    /* JADX INFO: renamed from: ﾇ */
    public final HashMap mo337() {
        HashMap map = new HashMap();
        map.put(f3569, new C1301(this));
        map.put(f3568, new C1300(this));
        map.put(f3567, new C1289(this));
        map.put(f3566, new C1278(this));
        map.put(f3565, new C1275(this));
        map.put(f3500, new C1257(this));
        map.put(f3499, new C1228(this));
        map.put(f3498, new C1211(this));
        map.put(f3564, new C1188(this));
        map.put(f3563, new C1317(this));
        return map;
    }

    public C1187(String str) {
        super(str);
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0535
    /* JADX INFO: renamed from: ﻛ */
    public final String mo335() {
        try {
            try {
                return LevelPlay.getSdkVersion();
            } catch (Throwable unused) {
                return null;
            }
        } catch (Throwable unused2) {
            return IronSourceUtils.getSDKVersion();
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:191:0x02e0  */
    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0535
    /* JADX INFO: renamed from: ﾒ */
    public final Class mo336(String str) {
        byte b;
        switch (str.hashCode()) {
            case -2063883567:
                if (str.equals(f3537)) {
                    b = 25;
                } else {
                    b = -1;
                }
                break;
            case -2054763962:
                if (str.equals(f3538)) {
                    b = 24;
                } else {
                    b = -1;
                }
                break;
            case -2044561387:
                if (str.equals(f3532)) {
                    b = 30;
                } else {
                    b = -1;
                }
                break;
            case -2012752057:
                if (str.equals(f3507)) {
                    b = 55;
                } else {
                    b = -1;
                }
                break;
            case -1879025222:
                if (str.equals(f3548)) {
                    b = 14;
                } else {
                    b = -1;
                }
                break;
            case -1810844504:
                if (str.equals(f3516)) {
                    b = 46;
                } else {
                    b = -1;
                }
                break;
            case -1704786309:
                if (str.equals(f3558)) {
                    b = 4;
                } else {
                    b = -1;
                }
                break;
            case -1678289205:
                if (str.equals(f3559)) {
                    b = 3;
                } else {
                    b = -1;
                }
                break;
            case -1555060867:
                if (str.equals(f3504)) {
                    b = 58;
                } else {
                    b = -1;
                }
                break;
            case -1406023077:
                if (str.equals(f3557)) {
                    b = 5;
                } else {
                    b = -1;
                }
                break;
            case -1282106699:
                if (str.equals(f3523)) {
                    b = 39;
                } else {
                    b = -1;
                }
                break;
            case -1276273849:
                if (str.equals(f3549)) {
                    b = 13;
                } else {
                    b = -1;
                }
                break;
            case -1115843213:
                if (str.equals(f3550)) {
                    b = 12;
                } else {
                    b = -1;
                }
                break;
            case -1088585376:
                if (str.equals(f3522)) {
                    b = 40;
                } else {
                    b = -1;
                }
                break;
            case -989825485:
                if (str.equals(f3536)) {
                    b = 26;
                } else {
                    b = -1;
                }
                break;
            case -838208757:
                if (str.equals(f3535)) {
                    b = 27;
                } else {
                    b = -1;
                }
                break;
            case -643050252:
                if (str.equals(f3555)) {
                    b = 7;
                } else {
                    b = -1;
                }
                break;
            case -609786639:
                if (str.equals(f3511)) {
                    b = 51;
                } else {
                    b = -1;
                }
                break;
            case -559540471:
                if (str.equals(f3543)) {
                    b = 19;
                } else {
                    b = -1;
                }
                break;
            case -498709917:
                if (str.equals(f3513)) {
                    b = 49;
                } else {
                    b = -1;
                }
                break;
            case -498060603:
                if (str.equals(f3561)) {
                    b = 1;
                } else {
                    b = -1;
                }
                break;
            case -393802555:
                if (str.equals(f3509)) {
                    b = 53;
                } else {
                    b = -1;
                }
                break;
            case -284636416:
                if (str.equals(f3519)) {
                    b = 43;
                } else {
                    b = -1;
                }
                break;
            case -154075626:
                if (str.equals(f3528)) {
                    b = 34;
                } else {
                    b = -1;
                }
                break;
            case -153002112:
                if (str.equals(f3517)) {
                    b = 45;
                } else {
                    b = -1;
                }
                break;
            case 30304559:
                if (str.equals(f3542)) {
                    b = 20;
                } else {
                    b = -1;
                }
                break;
            case 85893348:
                if (str.equals(f3521)) {
                    b = 41;
                } else {
                    b = -1;
                }
                break;
            case 149942051:
                if (str.equals(f3551)) {
                    b = 11;
                } else {
                    b = -1;
                }
                break;
            case 204617641:
                if (str.equals(f3505)) {
                    b = 57;
                } else {
                    b = -1;
                }
                break;
            case 204897024:
                if (str.equals(f3512)) {
                    b = 50;
                } else {
                    b = -1;
                }
                break;
            case 307677661:
                if (str.equals(f3520)) {
                    b = 42;
                } else {
                    b = -1;
                }
                break;
            case 308060116:
                if (str.equals(f3518)) {
                    b = 44;
                } else {
                    b = -1;
                }
                break;
            case 320151695:
                if (str.equals(f3515)) {
                    b = 47;
                } else {
                    b = -1;
                }
                break;
            case 334118616:
                if (str.equals(f3546)) {
                    b = 16;
                } else {
                    b = -1;
                }
                break;
            case 663296747:
                if (str.equals(f3560)) {
                    b = 2;
                } else {
                    b = -1;
                }
                break;
            case 766880816:
                if (str.equals(f3527)) {
                    b = 35;
                } else {
                    b = -1;
                }
                break;
            case 779287609:
                if (str.equals(f3554)) {
                    b = 8;
                } else {
                    b = -1;
                }
                break;
            case 823061407:
                if (str.equals(f3530)) {
                    b = 32;
                } else {
                    b = -1;
                }
                break;
            case 846220331:
                if (str.equals(f3502)) {
                    b = 60;
                } else {
                    b = -1;
                }
                break;
            case 894546539:
                if (str.equals(f3534)) {
                    b = 28;
                } else {
                    b = -1;
                }
                break;
            case 1052532031:
                if (str.equals(f3510)) {
                    b = 52;
                } else {
                    b = -1;
                }
                break;
            case 1069602180:
                if (str.equals(f3533)) {
                    b = 29;
                } else {
                    b = -1;
                }
                break;
            case 1081984916:
                if (str.equals(f3529)) {
                    b = 33;
                } else {
                    b = -1;
                }
                break;
            case 1180349927:
                if (str.equals(f3553)) {
                    b = 9;
                } else {
                    b = -1;
                }
                break;
            case 1226831433:
                if (str.equals(f3525)) {
                    b = 37;
                } else {
                    b = -1;
                }
                break;
            case 1266525324:
                if (str.equals(f3524)) {
                    b = 38;
                } else {
                    b = -1;
                }
                break;
            case 1267145181:
                if (str.equals(f3514)) {
                    b = 48;
                } else {
                    b = -1;
                }
                break;
            case 1304950957:
                if (str.equals(f3562)) {
                    b = 0;
                } else {
                    b = -1;
                }
                break;
            case 1325013503:
                if (str.equals(f3501)) {
                    b = 61;
                } else {
                    b = -1;
                }
                break;
            case 1432059210:
                if (str.equals(f3544)) {
                    b = 18;
                } else {
                    b = -1;
                }
                break;
            case 1517126868:
                if (str.equals(f3556)) {
                    b = 6;
                } else {
                    b = -1;
                }
                break;
            case 1628896204:
                if (str.equals(f3531)) {
                    b = 31;
                } else {
                    b = -1;
                }
                break;
            case 1715808775:
                if (str.equals(f3503)) {
                    b = 59;
                } else {
                    b = -1;
                }
                break;
            case 1773831812:
                if (str.equals(f3539)) {
                    b = 23;
                } else {
                    b = -1;
                }
                break;
            case 1870849118:
                if (str.equals(f3508)) {
                    b = 54;
                } else {
                    b = -1;
                }
                break;
            case 1910059890:
                if (str.equals(f3540)) {
                    b = 22;
                } else {
                    b = -1;
                }
                break;
            case 1910219460:
                if (str.equals(f3552)) {
                    b = 10;
                } else {
                    b = -1;
                }
                break;
            case 1955369613:
                if (str.equals(f3526)) {
                    b = 36;
                } else {
                    b = -1;
                }
                break;
            case 1955530641:
                if (str.equals(f3541)) {
                    b = 21;
                } else {
                    b = -1;
                }
                break;
            case 2019413793:
                if (str.equals(f3547)) {
                    b = 15;
                } else {
                    b = -1;
                }
                break;
            case 2019599576:
                if (str.equals(f3545)) {
                    b = 17;
                } else {
                    b = -1;
                }
                break;
            case 2102577435:
                if (str.equals(f3506)) {
                    b = 56;
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
                return AbstractAdapter.class;
            case 1:
                return Placement.class;
            case 2:
            case 3:
                return ControllerActivity.class;
            case 4:
            case 5:
                return InterstitialActivity.class;
            case 6:
            case 7:
                return OpenUrlActivity.class;
            case 8:
            case 9:
                return IronSourceBannerLayout.class;
            case 10:
                return BannerSmashListener.class;
            case 11:
                return IronSource.class;
            case 12:
                return ImpressionData.class;
            case 13:
                return ImpressionDataListener.class;
            case 14:
            case 15:
                return DTBAdView.class;
            case 16:
                return LevelPlayBannerListener.class;
            case 17:
                return LevelPlayInterstitialListener.class;
            case 18:
                return LevelPlayRewardedVideoAutomaticListener.class;
            case 19:
                return LevelPlayRewardedVideoListener.class;
            case 20:
                return LevelPlayRewardedVideoManualListener.class;
            case 21:
                return AdInfo.class;
            case 22:
                return LevelPlayNativeAd.class;
            case 23:
                return NativeAdLayout.class;
            case 24:
                return LevelPlayNativeAdListener.class;
            case 25:
                return LevelPlayMediaView.class;
            case 26:
                return AdapterNativeAdData.class;
            case 27:
                return NativeAdViewHolder.class;
            case 28:
                return InternalNativeAdListener.class;
            case 29:
                return NativeAdAdapterInterface.class;
            case 30:
                return NativeAdDataInterface.class;
            case 31:
                return NativeAdInteractionListener.class;
            case 32:
                return NativeAdInterface.class;
            case 33:
                return NativeAdLoadListener.class;
            case 34:
                return NativeAdSmashListener.class;
            case 35:
                return NativeAdViewBinderInterface.class;
            case 36:
                return AdData.class;
            case 37:
                return LevelPlayAdInfo.class;
            case 38:
            case 39:
                return LevelPlayBannerAdView.class;
            case 40:
                return LevelPlayBannerAdViewListener.class;
            case 41:
                return IronSourceAds.AdFormat.class;
            case 42:
                return BannerAdInfo.class;
            case 43:
                return BannerAdRequest.class;
            case 44:
            case 45:
                return BannerAdView.class;
            case 46:
                return BannerAdViewListener.class;
            case 47:
                return InterstitialAd.class;
            case 48:
                return InterstitialAdInfo.class;
            case 49:
                return InterstitialAdListener.class;
            case 50:
                return InterstitialAdRequest.class;
            case 51:
                return RewardedAd.class;
            case 52:
                return RewardedAdInfo.class;
            case 53:
                return RewardedAdListener.class;
            case 54:
                return RewardedAdRequest.class;
            case 55:
                return LevelPlayInterstitialAd.class;
            case 56:
                return LevelPlayInterstitialAdListener.class;
            case 57:
                return LevelPlayRewardedAd.class;
            case 58:
                return LevelPlayRewardedAdListener.class;
            case 59:
                return LevelPlayReward.class;
            case 60:
                return LevelPlayImpressionData.class;
            case 61:
                return LevelPlayImpressionDataListener.class;
            default:
                return null;
        }
    }
}
