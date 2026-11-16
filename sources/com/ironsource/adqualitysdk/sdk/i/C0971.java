package com.ironsource.adqualitysdk.sdk.i;

import com.facebook.ads.Ad;
import com.facebook.ads.AdError;
import com.facebook.ads.AdListener;
import com.facebook.ads.AdView;
import com.facebook.ads.AudienceNetworkActivity;
import com.facebook.ads.BuildConfig;
import com.facebook.ads.InterstitialAd;
import com.facebook.ads.InterstitialAdListener;
import com.facebook.ads.NativeAd;
import com.facebook.ads.NativeAdBase;
import com.facebook.ads.NativeAdListener;
import com.facebook.ads.NativeAdView;
import com.facebook.ads.NativeBannerAd;
import com.facebook.ads.RewardedVideoAd;
import com.facebook.ads.RewardedVideoAdListener;
import com.facebook.ads.internal.DisplayAdController;
import com.facebook.ads.internal.adapters.AdAdapter;
import com.facebook.ads.internal.dynamicloading.DynamicLoaderFactory;
import com.facebook.ads.internal.protocol.AdPlacementType;
import com.facebook.ads.internal.settings.AdSdkVersion;
import com.facebook.ads.internal.view.component.CircularProgressView;
import com.ironsource.adqualitysdk.sdk.StringFog;
import java.util.HashMap;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.ᴣ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class C0971 extends AbstractC0535 {

    /* JADX INFO: renamed from: סּ, reason: contains not printable characters */
    public static final String f2624 = StringFog.decrypt("5j5ck9StMxjsPka38agWD+42aafupTUK\n", "gVsow7jMUH0=\n");

    /* JADX INFO: renamed from: טּ, reason: contains not printable characters */
    public static final String f2623 = StringFog.decrypt("2E5LITU37cXSTlEFEDLI0tBGfhU=\n", "vys/cVlWjqA=\n");

    /* JADX INFO: renamed from: ﬤ, reason: contains not printable characters */
    public static final String f2622 = StringFog.decrypt("mpOZTFiLB0+dk4NoTg==\n", "6fbtDTzHbjw=\n");

    /* JADX INFO: renamed from: 爫, reason: contains not printable characters */
    public static final String f2621 = StringFog.decrypt("opKeYoQRlvCrlI9tlAGI+recq0CFHIn8sY68SpQCq+y1kqFGiA==\n", "xffqI/F1/5U=\n");

    /* JADX INFO: renamed from: 乁, reason: contains not printable characters */
    public static final String f2620 = StringFog.decrypt("vI0KMEYoP3i1ixs/VjghcqmDPxJHJSB0r5E7H1cPN2+/pR8DWDkmVr6R\n", "2+h+cTNMVh0=\n");

    /* JADX INFO: renamed from: 丫, reason: contains not printable characters */
    public static final String f2619 = StringFog.decrypt("BvYp/EpgyZUG5zTBRXjtgzn6LsFBesmV\n", "dZNdtSQUrOc=\n");

    /* JADX INFO: renamed from: ヶ, reason: contains not printable characters */
    public static final String f2618 = StringFog.decrypt("WlP1EqncnARUVc05sdaYGw==\n", "PTaBVtCy/Wk=\n");

    /* JADX INFO: renamed from: ヮ, reason: contains not printable characters */
    public static final String f2617 = StringFog.decrypt("XK1J7zEhafBWrVPLCTl68A==\n", "O8g9v11ACpU=\n");

    /* JADX INFO: renamed from: リ, reason: contains not printable characters */
    public static final String f2616 = StringFog.decrypt("HU22r2MrMmAwXqenYSsnRilasqVfLxVKM16j\n", "fj/TzhdOZiI=\n");

    /* JADX INFO: renamed from: ト, reason: contains not printable characters */
    public static final String f2615 = StringFog.decrypt("YWc=\n", "IAPBvyYX9m8=\n");

    /* JADX INFO: renamed from: ゥ, reason: contains not printable characters */
    public static final String f2614 = StringFog.decrypt("8cqTo7rgErHC\n", "sK7Sx9uQZtQ=\n");

    /* JADX INFO: renamed from: へ, reason: contains not printable characters */
    public static final String f2613 = StringFog.decrypt("Yx9UiMjy0g==\n", "InsR+rqdoFo=\n");

    /* JADX INFO: renamed from: っ, reason: contains not printable characters */
    public static final String f2612 = StringFog.decrypt("WWdIA3tOoaF9cQ==\n", "GAMEagg6xM8=\n");

    /* JADX INFO: renamed from: く, reason: contains not printable characters */
    public static final String f2611 = StringFog.decrypt("DuLjkY+J\n", "T4a1+Or+EzI=\n");

    /* JADX INFO: renamed from: Ↄ, reason: contains not printable characters */
    public static final String f2610 = StringFog.decrypt("Fmcq6WabBpkXZyisLpsBj1tJI5FpnxI=\n", "dQhHxwD6Zfw=\n");

    /* JADX INFO: renamed from: Ⅽ, reason: contains not printable characters */
    public static final String f2609 = StringFog.decrypt("Ef8AuoQnJK819SSCnDQk\n", "UJtQ1uVEQcI=\n");

    /* JADX INFO: renamed from: K, reason: contains not printable characters */
    public static final String f2608 = StringFog.decrypt("gfFvUVTJesCh23NPTNps7an9bg==\n", "xZgcITioA4E=\n");

    /* JADX INFO: renamed from: Ύ, reason: contains not printable characters */
    public static final String f2607 = StringFog.decrypt("KvKyp/K1Mmgl4qK5+Kk6TAjzv7j+ryg=\n", "a4fWzpfbUQ0=\n");

    /* JADX INFO: renamed from: Ὺ, reason: contains not printable characters */
    public static final String f2606 = StringFog.decrypt("XuZjm5MPoI9f5mHe2w+nmRPIe9GcC62JWMdrwYIBsYF86nrcgwe3kw==\n", "PYkOtfVuw+o=\n");

    /* JADX INFO: renamed from: Ῡ, reason: contains not printable characters */
    public static final String f2605 = StringFog.decrypt("4X8jiuLrMyTceDaD0fwLJNtlMoH16g==\n", "qBFX75CYR00=\n");

    /* JADX INFO: renamed from: Ῠ, reason: contains not printable characters */
    public static final String f2604 = StringFog.decrypt("JNiO3GVOQjkZ35vVVlk=\n", "bbb6uRc9NlA=\n");

    /* JADX INFO: renamed from: Ὑ, reason: contains not printable characters */
    public static final String f2603 = StringFog.decrypt("hEPiQXOW8YqAT/FFbrPwor9V4UVvl+Y=\n", "1iaVIAHylO4=\n");

    /* JADX INFO: renamed from: Ṿ, reason: contains not printable characters */
    public static final String f2602 = StringFog.decrypt("W2l8CCUItXhfZW8MOC20\n", "CQwLaVds0Bw=\n");

    /* JADX INFO: renamed from: Ḽ, reason: contains not printable characters */
    public static final String f2601 = StringFog.decrypt("bOxmdgH/YslH9GxyHtBg5lz6em4=\n", "KJUIF2yWAYU=\n");

    /* JADX INFO: renamed from: Ḹ, reason: contains not printable characters */
    public static final String f2600 = StringFog.decrypt("AzmK+YSJ06gPOY31\n", "TVj+kPLsksw=\n");

    /* JADX INFO: renamed from: Ḟ, reason: contains not printable characters */
    public static final String f2599 = StringFog.decrypt("ajInaXNCmJ5KPTZyREM=\n", "JFNTAAUn2v8=\n");

    /* JADX INFO: renamed from: ᵆ, reason: contains not printable characters */
    public static final String f2598 = StringFog.decrypt("RVYWeC3sRzE=\n", "CzdiEVuJBlU=\n");

    /* JADX INFO: renamed from: ᘥ, reason: contains not printable characters */
    public static final String f2597 = StringFog.decrypt("JDCbfGhdkk88OIpi\n", "alHvFR440ys=\n");

    /* JADX INFO: renamed from: ᗀ, reason: contains not printable characters */
    public static final String f2596 = StringFog.decrypt("fqFbY4GsAmR8qVx+kqcmcg==\n", "MMAvCvfJQwA=\n");

    /* JADX INFO: renamed from: ᖺ, reason: contains not printable characters */
    public static final String f2595 = StringFog.decrypt("4H0/oC9d/x3zZiKkKFTtHPV9KLQ=\n", "oxRNw1oxnm8=\n");

    /* JADX INFO: renamed from: ᖸ, reason: contains not printable characters */
    public static final String f2594 = StringFog.decrypt("K1O/4nBN4Tw+dabmZU/fOAx5vOJ0\n", "fxHxgwQkl1k=\n");

    /* JADX INFO: renamed from: ᖭ, reason: contains not printable characters */
    public static final String f2593 = StringFog.decrypt("bl2BaDeAvfFDVoFoKLaC/0xThWwp\n", "IjLiCVvCz54=\n");

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0535
    /* JADX INFO: renamed from: ﻛ */
    public final String mo335() {
        try {
            try {
                try {
                    return (String) C0891.m648().f2391.m596(AdSdkVersion.class, String.class).get(null);
                } catch (Throwable unused) {
                    C0679 c0679 = C0891.m648().f2390;
                    String strDecrypt = StringFog.decrypt("jLusLXCYjsL5yeI=\n", "0ufIdiz8oJ8=\n");
                    c0679.getClass();
                    return C0679.m570((Object) null, BuildConfig.class, strDecrypt);
                }
            } catch (Throwable unused2) {
                return (String) C0891.m648().f2391.m596(AdSdkVersion.class, String.class).get(null);
            }
        } catch (Throwable unused3) {
            return null;
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0535
    /* JADX INFO: renamed from: ﾇ */
    public final HashMap mo337() {
        HashMap map = new HashMap();
        map.put(f2624, new C1089(this));
        map.put(f2623, new C1088(this));
        map.put(f2622, new C1087(this));
        map.put(f2621, new C1067(this));
        map.put(f2620, new C1064(this));
        map.put(f2619, new C1058(this));
        map.put(f2618, new C1056(this));
        map.put(f2617, new C1040(this));
        map.put(f2616, new C1039(this));
        return map;
    }

    public C0971(String str) {
        super(str);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:74:0x010c  */
    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0535
    /* JADX INFO: renamed from: ﾒ */
    public final Class mo336(String str) {
        byte b;
        switch (str.hashCode()) {
            case -2107186802:
                if (str.equals(f2596)) {
                    b = 19;
                } else {
                    b = -1;
                }
                break;
            case -1585374524:
                if (str.equals(f2603)) {
                    b = 10;
                } else {
                    b = -1;
                }
                break;
            case -1513928064:
                if (str.equals(f2606)) {
                    b = 13;
                } else {
                    b = -1;
                }
                break;
            case -1256969519:
                if (str.equals(f2595)) {
                    b = 20;
                } else {
                    b = -1;
                }
                break;
            case -501313640:
                if (str.equals(f2601)) {
                    b = 14;
                } else {
                    b = -1;
                }
                break;
            case -498709917:
                if (str.equals(f2605)) {
                    b = 8;
                } else {
                    b = -1;
                }
                break;
            case -105717264:
                if (str.equals(f2602)) {
                    b = 11;
                } else {
                    b = -1;
                }
                break;
            case 2115:
                if (str.equals(f2615)) {
                    b = 0;
                } else {
                    b = -1;
                }
                break;
            case 289409084:
                if (str.equals(f2609)) {
                    b = 6;
                } else {
                    b = -1;
                }
                break;
            case 320151695:
                if (str.equals(f2604)) {
                    b = 9;
                } else {
                    b = -1;
                }
                break;
            case 435867927:
                if (str.equals(f2593)) {
                    b = 22;
                } else {
                    b = -1;
                }
                break;
            case 488344453:
                if (str.equals(f2613)) {
                    b = 2;
                } else {
                    b = -1;
                }
                break;
            case 535330969:
                if (str.equals(f2607)) {
                    b = 12;
                } else {
                    b = -1;
                }
                break;
            case 553704929:
                if (str.equals(f2608)) {
                    b = 7;
                } else {
                    b = -1;
                }
                break;
            case 1165508119:
                if (str.equals(f2612)) {
                    b = 3;
                } else {
                    b = -1;
                }
                break;
            case 1237162638:
                if (str.equals(f2594)) {
                    b = 21;
                } else {
                    b = -1;
                }
                break;
            case 1476063628:
                if (str.equals(f2614)) {
                    b = 1;
                } else {
                    b = -1;
                }
                break;
            case 1838933446:
                if (str.equals(f2599)) {
                    b = 16;
                } else {
                    b = -1;
                }
                break;
            case 1908493505:
                if (str.equals(f2610)) {
                    b = 5;
                } else {
                    b = -1;
                }
                break;
            case 1955913096:
                if (str.equals(f2611)) {
                    b = 4;
                } else {
                    b = -1;
                }
                break;
            case 2035065003:
                if (str.equals(f2600)) {
                    b = 15;
                } else {
                    b = -1;
                }
                break;
            case 2035668095:
                if (str.equals(f2597)) {
                    b = 18;
                } else {
                    b = -1;
                }
                break;
            case 2110329530:
                if (str.equals(f2598)) {
                    b = 17;
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
                return Ad.class;
            case 1:
                return AdAdapter.class;
            case 2:
                return AdError.class;
            case 3:
                return AdListener.class;
            case 4:
            case 5:
                return AdView.class;
            case 6:
                return AdPlacementType.class;
            case 7:
                return DisplayAdController.class;
            case 8:
                return InterstitialAdListener.class;
            case 9:
                return InterstitialAd.class;
            case 10:
                return RewardedVideoAdListener.class;
            case 11:
                return RewardedVideoAd.class;
            case 12:
            case 13:
                return AudienceNetworkActivity.class;
            case 14:
                return DynamicLoaderFactory.class;
            case 15:
                return NativeAdBase.class;
            case 16:
                return NativeBannerAd.class;
            case 17:
                return NativeAd.class;
            case 18:
                return NativeAdView.class;
            case 19:
                return NativeAdListener.class;
            case 20:
                return CircularProgressView.class;
            case 21:
                return C0997.class;
            case 22:
                int i = AbstractC1241.f3758;
                String strDecrypt = StringFog.decrypt("jHFwaVl8mSrDc3t4V3mfIIJ+cHhXZok/jHF1fFNn0zGCcWB+WGHTHoJ8dXd0Z5IziXx1aEJYnDyM\neHFp\n", "7R8UGzYV/VI=\n");
                String str2 = AbstractC0951.f2572;
                try {
                    return Class.forName(strDecrypt);
                } catch (Throwable unused) {
                    return null;
                }
            default:
                return null;
        }
    }
}
