package com.ironsource.adqualitysdk.sdk.i;

import com.amazon.aps.ads.Aps;
import com.amazon.aps.ads.ApsAd;
import com.amazon.aps.ads.ApsAdController;
import com.amazon.aps.ads.ApsAdRequest;
import com.amazon.aps.ads.ApsAdView;
import com.amazon.aps.ads.activity.ApsAdActivity;
import com.amazon.aps.ads.activity.ApsInterstitialActivity;
import com.amazon.aps.ads.listeners.ApsAdListener;
import com.amazon.aps.ads.listeners.ApsAdRequestListener;
import com.amazon.aps.ads.model.ApsAdFormat;
import com.amazon.aps.ads.model.ApsAdType;
import com.amazon.device.ads.AdRegistration;
import com.amazon.device.ads.DTBActivity;
import com.amazon.device.ads.DTBAdActivity;
import com.amazon.device.ads.DTBAdBannerListener;
import com.amazon.device.ads.DTBAdBaseBannerListener;
import com.amazon.device.ads.DTBAdBaseInterstitialListener;
import com.amazon.device.ads.DTBAdCallback;
import com.amazon.device.ads.DTBAdExpandedListener;
import com.amazon.device.ads.DTBAdInterstitial;
import com.amazon.device.ads.DTBAdInterstitialListener;
import com.amazon.device.ads.DTBAdListener;
import com.amazon.device.ads.DTBAdLoader;
import com.amazon.device.ads.DTBAdRequest;
import com.amazon.device.ads.DTBAdResponse;
import com.amazon.device.ads.DTBAdSize;
import com.amazon.device.ads.DTBAdView;
import com.amazon.device.ads.DTBAdViewSupportClient;
import com.amazon.device.ads.DTBFetchFactory;
import com.amazon.device.ads.DTBFetchManager;
import com.amazon.device.ads.DTBInterstitialActivity;
import com.amazon.device.ads.DTBRenderer;
import com.ironsource.adqualitysdk.sdk.StringFog;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.宀, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class C1168 extends AbstractC0535 {

    /* JADX INFO: renamed from: סּ, reason: contains not printable characters */
    public static final String f3441 = StringFog.decrypt("mWsKXe0luvWH\n", "/g5+HJ1V8ZA=\n");

    /* JADX INFO: renamed from: טּ, reason: contains not printable characters */
    public static final String f3440 = StringFog.decrypt("uhDuq944pk6bFPmZ1D68b7MG7ozVL6A=\n", "3XWa7btMxSY=\n");

    /* JADX INFO: renamed from: ﬤ, reason: contains not printable characters */
    public static final String f3439 = StringFog.decrypt("H+QhAqoPtaQI7jswqx+5szHl\n", "eIFVQ85d0Nc=\n");

    /* JADX INFO: renamed from: 爫, reason: contains not printable characters */
    public static final String f3438 = StringFog.decrypt("llre5hfmQE2BUMTUFv1IToNa2dQa20trg1M=\n", "8T+qp3O0JT4=\n");

    /* JADX INFO: renamed from: 乁, reason: contains not printable characters */
    public static final String f3437 = StringFog.decrypt("Lb8ESnPehxE6tR54ct6HDC6/AmJ5668DOg==\n", "StpwCxeM4mI=\n");

    /* JADX INFO: renamed from: 丫, reason: contains not printable characters */
    public static final String f3436 = StringFog.decrypt("+1TXXInbYw7sXs1uiNtjE/hU0XSD7kQI8lXPeA==\n", "nDGjHe2JBn0=\n");

    /* JADX INFO: renamed from: ヶ, reason: contains not printable characters */
    public static final String f3435 = StringFog.decrypt("RwgU4I9IYltMGTbNjktsb0QeMsGbW2ZdVC4V155Bbn5BHwHJmQ==\n", "IG1gpOouAy4=\n");

    /* JADX INFO: renamed from: ヮ, reason: contains not printable characters */
    public static final String f3434 = StringFog.decrypt("wBRom6BCOk/XHnKpoVE7Tw==\n", "p3Ec2sQQXzw=\n");

    /* JADX INFO: renamed from: リ, reason: contains not printable characters */
    public static final String f3433 = StringFog.decrypt("BF95ZuFgNhkTVWNU4GIhAwBfXUjsXCc=\n", "YzoNJ4UyU2o=\n");

    /* JADX INFO: renamed from: ト, reason: contains not printable characters */
    public static final String f3432 = StringFog.decrypt("FWFnSxK7ji4XV39lAr2yHTY=\n", "cgQTCnbo51Q=\n");

    /* JADX INFO: renamed from: ゥ, reason: contains not printable characters */
    public static final String f3431 = StringFog.decrypt("IuF/Q3ccXV8gxW9Waj9R\n", "RYQLAhNPNCU=\n");

    /* JADX INFO: renamed from: へ, reason: contains not printable characters */
    public static final String f3430 = StringFog.decrypt("m4vbAyV4HTWZvtogEk4AO5WAyDE=\n", "/O6vQkErdE8=\n");

    /* JADX INFO: renamed from: っ, reason: contains not printable characters */
    public static final String f3429 = StringFog.decrypt("rUyHnFRQJh2NUbKddUooEbBWp5RGXQ==\n", "xD/G+Ac5XHg=\n");

    /* JADX INFO: renamed from: く, reason: contains not printable characters */
    public static final String f3428 = StringFog.decrypt("g0/JH44mqzmmWNgdkgWeGJRS3ge3IpEah1jeM5sz\n", "4D2sfvpD/3s=\n");

    /* JADX INFO: renamed from: Ↄ, reason: contains not printable characters */
    public static final String f3427 = StringFog.decrypt("oVK1+5n6dLaHWLX5mOtPhpFFouyE/EU=\n", "wiDQmu2fIPQ=\n");

    /* JADX INFO: renamed from: Ⅽ, reason: contains not printable characters */
    public static final String f3426 = StringFog.decrypt("EHvhcINMnL4HcftCgl2LqBZq/EeCV50=\n", "dx6VMece+c0=\n");

    /* JADX INFO: renamed from: K, reason: contains not printable characters */
    public static final String f3425 = StringFog.decrypt("79khTdKDxHDc3AdB2oQ=\n", "rr1zKLXqtwQ=\n");

    /* JADX INFO: renamed from: Ύ, reason: contains not printable characters */
    public static final String f3424 = StringFog.decrypt("RQfCm8kWokNoJ/k=\n", "AVOA2qpiyzU=\n");

    /* JADX INFO: renamed from: Ὺ, reason: contains not printable characters */
    public static final String f3423 = StringFog.decrypt("faGBOLQdh0JxoMJysAaPW3vgjXKmXqJsXI+PYrwGj0xn\n", "Hs7sFtVw5jg=\n");

    /* JADX INFO: renamed from: Ῡ, reason: contains not printable characters */
    public static final String f3422 = StringFog.decrypt("gyPGVSHoMfW0A+1oJv04xqQD7Wom6C0=\n", "x3eEHE+cVIc=\n");

    /* JADX INFO: renamed from: Ῠ, reason: contains not printable characters */
    public static final String f3421 = StringFog.decrypt("ptVGnv5Z7tiq1AXU+kLmwaCUStTsGsv2h/NFxPpG/NaszkLR83Xs1qzMQsTm\n", "xborsJ80j6I=\n");

    /* JADX INFO: renamed from: Ὑ, reason: contains not printable characters */
    public static final String f3420 = StringFog.decrypt("L80/5EnOnGwC7xTRVA==\n", "a5l9pS2P/xg=\n");

    /* JADX INFO: renamed from: Ṿ, reason: contains not printable characters */
    public static final String f3419 = StringFog.decrypt("jxaRxacMbMaDF9KPoxdk34lXnY+1T0norjiYqqUVZMqFDYU=\n", "7Hn868ZhDbw=\n");

    /* JADX INFO: renamed from: Ḽ, reason: contains not printable characters */
    public static final String f3418 = StringFog.decrypt("Bukm+YRycwEnzxfMiU90FC4=\n", "Qr1kuOA7HXU=\n");

    /* JADX INFO: renamed from: Ḹ, reason: contains not printable characters */
    public static final String f3417 = StringFog.decrypt("DkVCdYxQ5FcudHI=\n", "ShEANOgcizY=\n");

    /* JADX INFO: renamed from: Ḟ, reason: contains not printable characters */
    public static final String f3416 = StringFog.decrypt("6LFqSZOlVoHZgFt8\n", "rOUoCPf3M/A=\n");

    /* JADX INFO: renamed from: ᵆ, reason: contains not printable characters */
    public static final String f3415 = StringFog.decrypt("nH3sawat4LSoRsBZBw==\n", "2CmuKmL/hcc=\n");

    /* JADX INFO: renamed from: ᘥ, reason: contains not printable characters */
    public static final String f3414 = StringFog.decrypt("fZmW0Q8JLLlO\n", "Oc3UkGtfRdw=\n");

    /* JADX INFO: renamed from: ᗀ, reason: contains not printable characters */
    public static final String f3413 = StringFog.decrypt("emM+2KMXv+pb\n", "Pjd8mcdE1pA=\n");

    /* JADX INFO: renamed from: ᖺ, reason: contains not printable characters */
    public static final String f3412 = StringFog.decrypt("AXAWSHAHmUgNcVUCdByRUQcxGgJiRLxmIF4fMHgPjw==\n", "Yh97ZhFq+DI=\n");

    /* JADX INFO: renamed from: ᖸ, reason: contains not printable characters */
    public static final String f3411 = StringFog.decrypt("eoCbfyhLBlNJh6xOPHIdQn24sFsiaQ==\n", "PtTZPkwdbzY=\n");

    /* JADX INFO: renamed from: ᖭ, reason: contains not printable characters */
    public static final String f3410 = StringFog.decrypt("EbJVe6JXxJcTh3RJqFHe\n", "VeYXPccjp/8=\n");

    /* JADX INFO: renamed from: ᖫ, reason: contains not printable characters */
    public static final String f3409 = StringFog.decrypt("8+xNtbZfxvn62WGStE7X\n", "t7gP89MrpZE=\n");

    /* JADX INFO: renamed from: ᖩ, reason: contains not printable characters */
    public static final String f3408 = StringFog.decrypt("KM0foz0xq/se/C8=\n", "bJld8Vhfz54=\n");

    /* JADX INFO: renamed from: ᖅ, reason: contains not printable characters */
    public static final String f3407 = StringFog.decrypt("h0BseanF4jatcVx0pPT3Pa1xXA==\n", "wxQuOM2Hg1g=\n");

    /* JADX INFO: renamed from: ᕆ, reason: contains not printable characters */
    public static final String f3406 = StringFog.decrypt("bjEyT0zpERRPJxFgRs4CK0MWBGtGzgI=\n", "KmVwDiircGc=\n");

    /* JADX INFO: renamed from: ᕄ, reason: contains not printable characters */
    public static final String f3405 = StringFog.decrypt("7G066ww5FIfNcBbeDQkGgMFNEcsENxyH3FwWzxo=\n", "qDl4qmh7dfQ=\n");

    /* JADX INFO: renamed from: ᕃ, reason: contains not printable characters */
    public static final String f3404 = StringFog.decrypt("zxUtlt5SUSrnIw600Q==\n", "i0Fv17oRMEY=\n");

    /* JADX INFO: renamed from: ᕂ, reason: contains not printable characters */
    public static final String f3403 = StringFog.decrypt("WPx6pLKDi9F9xlyAsoqa0mjNVoCk\n", "HKg45dbG86E=\n");

    /* JADX INFO: renamed from: ᔽ, reason: contains not printable characters */
    public static final String f3402 = StringFog.decrypt("tnYVl89U6dOXUCSiwmnuxp5uPqXfeOnCgA==\n", "8iJX1qsdh6c=\n");

    /* JADX INFO: renamed from: ᔺ, reason: contains not printable characters */
    public static final String f3401 = StringFog.decrypt("iqnpwOGP+e66mMXk9w==\n", "zv2rgYXDkJ0=\n");

    /* JADX INFO: renamed from: ᔹ, reason: contains not printable characters */
    public static final String f3400 = StringFog.decrypt("6a5+mN82UlrPpFKK2RpUTw==\n", "vewz+bFXNT8=\n");

    /* JADX INFO: renamed from: ᔲ, reason: contains not printable characters */
    public static final String f3399 = StringFog.decrypt("albOTpupKexRZthTjLw1+1s=\n", "PhSLNv7KXJg=\n");

    /* JADX INFO: renamed from: ᔱ, reason: contains not printable characters */
    public static final String f3398 = StringFog.decrypt("kcCUiqkYggejxI63rg2LNLPEjrWuGJ4=\n", "0LDnw8ds53U=\n");

    /* JADX INFO: renamed from: ᓮ, reason: contains not printable characters */
    public static final String f3397 = StringFog.decrypt("8kaOnGTrcW/+R83TdfU+dPVazdNm8nlj+F2anET2Y1z/XYbAdvJ5YfhIj/Nm8nlj+F2a\n", "kSnjsgWGEBU=\n");

    /* JADX INFO: renamed from: ᐱ, reason: contains not printable characters */
    public static final String f3396 = StringFog.decrypt("1TXZdBL8kgn9M8NBDw==\n", "lEWqNXa98X0=\n");

    /* JADX INFO: renamed from: Ꮭ, reason: contains not printable characters */
    public static final String f3395 = StringFog.decrypt("/IKeZujpOADwg90p+fd3G/ue3Snq8DAM9pmKZsj0Kjv7rJA84PIwDuY=\n", "n+3zSImEWXo=\n");

    /* JADX INFO: renamed from: Ꮧ, reason: contains not printable characters */
    public static final String f3394 = StringFog.decrypt("u7M3GwK5qtqN\n", "+sNEWmbvw78=\n");

    /* JADX INFO: renamed from: პ, reason: contains not printable characters */
    public static final String f3393 = StringFog.decrypt("Um1R\n", "Ex0iwcgpAJQ=\n");

    /* JADX INFO: renamed from: ე, reason: contains not printable characters */
    public static final String f3392 = StringFog.decrypt("qfryJDY=\n", "6IqBZVIGbFs=\n");

    /* JADX INFO: renamed from: ງ, reason: contains not printable characters */
    public static final String f3391 = StringFog.decrypt("ObRKVBrma9sMtlZ5EsB2\n", "eMQ5FX6lBLU=\n");

    /* JADX INFO: renamed from: อ, reason: contains not printable characters */
    public static final String f3390 = StringFog.decrypt("gbJL5Q5cluy0p1bBGA==\n", "wMI4pGoQ/58=\n");

    /* JADX INFO: renamed from: ม, reason: contains not printable characters */
    public static final String f3389 = StringFog.decrypt("d1hgfWxhdxZDTWBIRFphE1NGdk4=\n", "NigTPAgzEmc=\n");

    /* JADX INFO: renamed from: น, reason: contains not printable characters */
    public static final String f3388 = StringFog.decrypt("egu/Qjv0PHJWGrg=\n", "O3vMA1+yUwA=\n");

    /* JADX INFO: renamed from: ต, reason: contains not printable characters */
    public static final String f3387 = StringFog.decrypt("NrITSS5NTDcS\n", "d8JgCEoZNUc=\n");

    /* JADX INFO: renamed from: ฑ, reason: contains not printable characters */
    public static final String f3386 = StringFog.decrypt("9n7oNn9z1sPCa+gD\n", "tw6bdxshs7I=\n");

    /* JADX INFO: renamed from: ঢ়, reason: contains not printable characters */
    public static final String f3385 = StringFog.decrypt("PzFnnYDQWggKMWKpldBv\n", "WFQT3PCjG2w=\n");

    /* JADX INFO: renamed from: ষ, reason: contains not printable characters */
    public static final String f3384 = StringFog.decrypt("s+EBiYQbDtiy6w==\n", "1IR1y+1/R7Y=\n");

    /* JADX INFO: renamed from: ঘ, reason: contains not printable characters */
    public static final String f3383 = StringFog.decrypt("iZBKy3IqJTq+mlf1dA==\n", "7vU+mwBDRl8=\n");

    /* JADX INFO: renamed from: খ, reason: contains not printable characters */
    public static final String f3382 = StringFog.decrypt("xSH1+ndBJr7XLeU=\n", "okSBqRsuUus=\n");

    /* JADX INFO: renamed from: এ, reason: contains not printable characters */
    public static final String f3381 = StringFog.decrypt("OotFUA2egF0bgUN8HJk=\n", "Xe4xEX3twTk=\n");

    /* JADX INFO: renamed from: ऱ, reason: contains not printable characters */
    public static final String f3380 = StringFog.decrypt("rVSM06FmOhquVIo=\n", "yjH4ksUqVXs=\n");

    /* JADX INFO: renamed from: ܟ, reason: contains not printable characters */
    public static final String f3379 = StringFog.decrypt("bfpGtjA1HQ99\n", "Cp8y91RjdGo=\n");

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0535
    /* JADX INFO: renamed from: ﾇ */
    public final HashMap mo337() {
        HashMap map = new HashMap();
        map.put(f3441, new C1309(this));
        map.put(f3440, new C1281(this));
        map.put(f3439, new C1280(this));
        map.put(f3426, new C1271(this));
        map.put(f3438, new C1269(this));
        map.put(f3437, new C1263(this));
        map.put(f3436, new C1206(this));
        map.put(f3435, new C1198(this));
        map.put(f3434, new C1196(this));
        map.put(f3433, new C1345(this));
        map.put(f3432, new C1338(this));
        map.put(f3431, new C1336(this));
        map.put(f3430, new C1333(this));
        map.put(f3429, new C1332(this));
        map.put(f3428, new C1331(this));
        map.put(f3427, new C1329(this));
        map.put(f3385, new C1316(this));
        map.put(f3384, new C1311(this));
        map.put(f3383, new C1310(this));
        map.put(f3382, new C1308(this));
        map.put(f3381, new C1299(this));
        map.put(f3380, new C1298(this));
        map.put(f3379, new C1288(this));
        return map;
    }

    public C1168(String str) {
        super(str);
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0535
    /* JADX INFO: renamed from: ﻛ */
    public final String mo335() {
        Matcher matcher = Pattern.compile(StringFog.decrypt("jSXOPZFvsaj+JMo74A==\n", "ow/jFcoz1YY=\n")).matcher(AdRegistration.getVersion());
        if (matcher.matches()) {
            return matcher.group(1);
        }
        return null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:125:0x01d8  */
    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0535
    /* JADX INFO: renamed from: ﾒ */
    public final Class mo336(String str) {
        byte b;
        switch (str.hashCode()) {
            case -2137858584:
                if (str.equals(f3417)) {
                    b = 8;
                } else {
                    b = -1;
                }
                break;
            case -2133119933:
                if (str.equals(f3391)) {
                    b = 34;
                } else {
                    b = -1;
                }
                break;
            case -1987686071:
                if (str.equals(f3401)) {
                    b = 24;
                } else {
                    b = -1;
                }
                break;
            case -1885106463:
                if (str.equals(f3424)) {
                    b = 1;
                } else {
                    b = -1;
                }
                break;
            case -1879113962:
                if (str.equals(f3413)) {
                    b = 13;
                } else {
                    b = -1;
                }
                break;
            case -1879025222:
                if (str.equals(f3414)) {
                    b = 11;
                } else {
                    b = -1;
                }
                break;
            case -1554728876:
                if (str.equals(f3421)) {
                    b = 4;
                } else {
                    b = -1;
                }
                break;
            case -1464660218:
                if (str.equals(f3405)) {
                    b = 20;
                } else {
                    b = -1;
                }
                break;
            case -1358954558:
                if (str.equals(f3410)) {
                    b = 15;
                } else {
                    b = -1;
                }
                break;
            case -1293925587:
                if (str.equals(f3422)) {
                    b = 3;
                } else {
                    b = -1;
                }
                break;
            case -1291566264:
                if (str.equals(f3386)) {
                    b = 39;
                } else {
                    b = -1;
                }
                break;
            case -1092884085:
                if (str.equals(f3419)) {
                    b = 6;
                } else {
                    b = -1;
                }
                break;
            case -1090060454:
                if (str.equals(f3416)) {
                    b = 9;
                } else {
                    b = -1;
                }
                break;
            case -832298225:
                if (str.equals(f3400)) {
                    b = 25;
                } else {
                    b = -1;
                }
                break;
            case -791598050:
                if (str.equals(f3388)) {
                    b = 37;
                } else {
                    b = -1;
                }
                break;
            case -723985259:
                if (str.equals(f3408)) {
                    b = 17;
                } else {
                    b = -1;
                }
                break;
            case -696695160:
                if (str.equals(f3423)) {
                    b = 2;
                } else {
                    b = -1;
                }
                break;
            case -694845532:
                if (str.equals(f3420)) {
                    b = 5;
                } else {
                    b = -1;
                }
                break;
            case -466918522:
                if (str.equals(f3406)) {
                    b = 19;
                } else {
                    b = -1;
                }
                break;
            case -341719851:
                if (str.equals(f3407)) {
                    b = 18;
                } else {
                    b = -1;
                }
                break;
            case -300800492:
                if (str.equals(f3399)) {
                    b = 26;
                } else {
                    b = -1;
                }
                break;
            case -197992833:
                if (str.equals(f3398)) {
                    b = 27;
                } else {
                    b = -1;
                }
                break;
            case -27446238:
                if (str.equals(f3403)) {
                    b = 22;
                } else {
                    b = -1;
                }
                break;
            case 66052:
                if (str.equals(f3393)) {
                    b = 32;
                } else {
                    b = -1;
                }
                break;
            case 63478087:
                if (str.equals(f3392)) {
                    b = 33;
                } else {
                    b = -1;
                }
                break;
            case 355568411:
                if (str.equals(f3390)) {
                    b = 35;
                } else {
                    b = -1;
                }
                break;
            case 568188517:
                if (str.equals(f3409)) {
                    b = 16;
                } else {
                    b = -1;
                }
                break;
            case 620798166:
                if (str.equals(f3415)) {
                    b = 10;
                } else {
                    b = -1;
                }
                break;
            case 788901082:
                if (str.equals(f3404)) {
                    b = 21;
                } else {
                    b = -1;
                }
                break;
            case 1036908700:
                if (str.equals(f3425)) {
                    b = 0;
                } else {
                    b = -1;
                }
                break;
            case 1251356764:
                if (str.equals(f3395)) {
                    b = 30;
                } else {
                    b = -1;
                }
                break;
            case 1306698049:
                if (str.equals(f3418)) {
                    b = 7;
                } else {
                    b = -1;
                }
                break;
            case 1328085269:
                if (str.equals(f3402)) {
                    b = 23;
                } else {
                    b = -1;
                }
                break;
            case 1340383521:
                if (str.equals(f3387)) {
                    b = 38;
                } else {
                    b = -1;
                }
                break;
            case 1340427404:
                if (str.equals(f3394)) {
                    b = 31;
                } else {
                    b = -1;
                }
                break;
            case 1600627740:
                if (str.equals(f3389)) {
                    b = 36;
                } else {
                    b = -1;
                }
                break;
            case 1648408950:
                if (str.equals(f3396)) {
                    b = 29;
                } else {
                    b = -1;
                }
                break;
            case 1713728997:
                if (str.equals(f3397)) {
                    b = 28;
                } else {
                    b = -1;
                }
                break;
            case 2019413793:
                if (str.equals(f3412)) {
                    b = 12;
                } else {
                    b = -1;
                }
                break;
            case 2144664800:
                if (str.equals(f3411)) {
                    b = 14;
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
                return AdRegistration.class;
            case 1:
            case 2:
                return DTBActivity.class;
            case 3:
            case 4:
                return DTBInterstitialActivity.class;
            case 5:
            case 6:
                return DTBAdActivity.class;
            case 7:
                return DTBAdInterstitial.class;
            case 8:
                return DTBAdLoader.class;
            case 9:
                return DTBAdRequest.class;
            case 10:
                return DTBAdResponse.class;
            case 11:
            case 12:
                return DTBAdView.class;
            case 13:
                return DTBAdSize.class;
            case 14:
                return DTBAdViewSupportClient.class;
            case 15:
                return DTBFetchFactory.class;
            case 16:
                return DTBFetchManager.class;
            case 17:
                return DTBRenderer.class;
            case 18:
                return DTBAdBannerListener.class;
            case 19:
                return DTBAdBaseBannerListener.class;
            case 20:
                return DTBAdBaseInterstitialListener.class;
            case 21:
                return DTBAdCallback.class;
            case 22:
                return DTBAdExpandedListener.class;
            case 23:
                return DTBAdInterstitialListener.class;
            case 24:
                return DTBAdListener.class;
            case 25:
                return C1176.class;
            case 26:
                return C1193.class;
            case 27:
            case 28:
                return ApsInterstitialActivity.class;
            case 29:
            case 30:
                return ApsAdActivity.class;
            case 31:
                return ApsAdView.class;
            case 32:
                return Aps.class;
            case 33:
                return ApsAd.class;
            case 34:
                return ApsAdController.class;
            case 35:
                return ApsAdListener.class;
            case 36:
                return ApsAdRequestListener.class;
            case 37:
                return ApsAdFormat.class;
            case 38:
                return ApsAdType.class;
            case 39:
                return ApsAdRequest.class;
            default:
                return null;
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0535
    /* JADX INFO: renamed from: ﾒ */
    public final String mo342() {
        return AdRegistration.getVersion();
    }
}
