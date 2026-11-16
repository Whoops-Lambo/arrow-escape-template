package com.ironsource.adqualitysdk.sdk.i;

import com.fyber.FairBid;
import com.fyber.fairbid.ads.ImpressionData;
import com.fyber.fairbid.ads.Interstitial;
import com.fyber.fairbid.ads.PlacementType;
import com.fyber.fairbid.ads.Rewarded;
import com.fyber.fairbid.ads.ShowOptions;
import com.fyber.fairbid.ads.interstitial.InterstitialListener;
import com.fyber.fairbid.ads.rewarded.RewardedListener;
import com.fyber.fairbid.common.lifecycle.EventStream;
import com.fyber.fairbid.internal.Constants;
import com.fyber.fairbid.mediation.MediationManager;
import com.fyber.fairbid.mediation.abstr.CachedAd;
import com.fyber.fairbid.mediation.abstr.NetworkAdapter;
import com.fyber.fairbid.mediation.adapter.AdapterConfiguration;
import com.fyber.fairbid.mediation.adapter.AdapterPool;
import com.fyber.fairbid.mediation.config.MediationConfig;
import com.fyber.fairbid.sdk.placements.Placement;
import com.fyber.fairbid.sdk.placements.PlacementsHandler;
import com.ironsource.adqualitysdk.sdk.StringFog;
import java.util.HashMap;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.ᒉ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public final class C0810 extends AbstractC0535 {

    /* JADX INFO: renamed from: סּ, reason: contains not printable characters */
    public static final String f2161 = StringFog.decrypt("mBoMMyaAlSiLFhcQDoWSKJgaCjctl4gokRwd\n", "/394fkPk/Ek=\n");

    /* JADX INFO: renamed from: טּ, reason: contains not printable characters */
    public static final String f2160 = StringFog.decrypt("cr+VoiOdUb5wio2CJKxFq3uutZo3rA==\n", "Fdrh40fJKM4=\n");

    /* JADX INFO: renamed from: ﬤ, reason: contains not printable characters */
    public static final String f2159 = StringFog.decrypt("VW+ZZGzie61BeYRCb9ZovFNagUxi92StXH65VHH3\n", "MgrtLQGSCcg=\n");

    /* JADX INFO: renamed from: 爫, reason: contains not printable characters */
    public static final String f2158 = StringFog.decrypt("QazUuC4E10VVusmeLTDEVEebxZ8nEddJSK7zlSg=\n", "Jsmg8UN0pSA=\n");

    /* JADX INFO: renamed from: 乁, reason: contains not printable characters */
    public static final String f2157 = StringFog.decrypt("kuP3EP5SF+GG9eo2/WYE8JTU5jf3Rxftm+HQPfh0APaG7+w3\n", "9YaDWZMiZYQ=\n");

    /* JADX INFO: renamed from: 丫, reason: contains not printable characters */
    public static final String f2156 = StringFog.decrypt("FD4IhBxx/E4AKBWiH0XvXxIfGaAQb+p4HC4OrhQ=\n", "c1t8zXEBjis=\n");

    /* JADX INFO: renamed from: ヶ, reason: contains not printable characters */
    public static final String f2155 = StringFog.decrypt("DSxB19o9sqAZOlzx2QmhsQsfVOzeLK6xIy0=\n", "akk1nrdNwMU=\n");

    /* JADX INFO: renamed from: ヮ, reason: contains not printable characters */
    public static final String f2154 = StringFog.decrypt("BhTSK+stmJcSAs8N6BmLhgA/wxbWPJOdFAU=\n", "YXGmYoZd6vI=\n");

    /* JADX INFO: renamed from: リ, reason: contains not printable characters */
    public static final String f2153 = StringFog.decrypt("Hux+GK8XnfsK+mM+rCOO6hjKeDSjE4boHMBu\n", "eYkKUcJn754=\n");

    /* JADX INFO: renamed from: ト, reason: contains not printable characters */
    public static final String f2152 = StringFog.decrypt("Naceu3ZEct4hsQOddXBhzzODDoR+RnTSIacYtnRZYdI8\n", "UsJq8hs0ALs=\n");

    /* JADX INFO: renamed from: ゥ, reason: contains not printable characters */
    public static final String f2151 = StringFog.decrypt("ilsr2leYh5meTTb8VKyUiIx9Pv5KiZybg3c7\n", "7T5fkzro9fw=\n");

    /* JADX INFO: renamed from: へ, reason: contains not printable characters */
    public static final String f2150 = StringFog.decrypt("ZvNwYepwmFY=\n", "AZYEIJoA0TI=\n");

    /* JADX INFO: renamed from: っ, reason: contains not printable characters */
    public static final String f2149 = StringFog.decrypt("BKZscovtXL0=\n", "Y8MYIf+CLtg=\n");

    /* JADX INFO: renamed from: く, reason: contains not printable characters */
    public static final String f2148 = StringFog.decrypt("wvcAoiqk+uvA4DeMIKPj+NDgFZcnquTs\n", "pZJ0407Fip8=\n");

    /* JADX INFO: renamed from: Ↄ, reason: contains not printable characters */
    public static final String f2147 = StringFog.decrypt("6LxELd1Z0Y3ivF4J8Fzmkf+8\n", "j9kwfbE4sug=\n");

    /* JADX INFO: renamed from: Ⅽ, reason: contains not printable characters */
    public static final String f2146 = StringFog.decrypt("zHCc1p4L1LzGcIbyvAvavA==\n", "qxXohvJqt9k=\n");

    /* JADX INFO: renamed from: K, reason: contains not printable characters */
    public static final String f2145 = StringFog.decrypt("zBlFnLrTbczGGV+4pfpvx88QVL4=\n", "q3wxzNayDqk=\n");

    /* JADX INFO: renamed from: Ύ, reason: contains not printable characters */
    public static final String f2144 = StringFog.decrypt("/DCUkFcPxZn+EI6kXg==\n", "m1Xg0TNbvOk=\n");

    /* JADX INFO: renamed from: Ὺ, reason: contains not printable characters */
    public static final String f2143 = StringFog.decrypt("vv/JiqNeXrq+7tS3pEtXhKTpyaajT0k=\n", "zZq9w80qO8g=\n");

    /* JADX INFO: renamed from: Ῡ, reason: contains not printable characters */
    public static final String f2142 = StringFog.decrypt("0b4rJ2cITGDGvjs5awxZd8y+LQ==\n", "ottfdQJ/LRI=\n");

    /* JADX INFO: renamed from: Ῠ, reason: contains not printable characters */
    public static final String f2141 = StringFog.decrypt("uxWB6ytayjG7FIbrPQ==\n", "2mbyjlkumUU=\n");

    /* JADX INFO: renamed from: Ὑ, reason: contains not printable characters */
    public static final String f2140 = StringFog.decrypt("l/nEudMnDw==\n", "0Zity5FOa5I=\n");

    /* JADX INFO: renamed from: Ṿ, reason: contains not printable characters */
    public static final String f2139 = StringFog.decrypt("mnjCP0y1Of+5UMc4TKY14g==\n", "1x2mVi3BUJA=\n");

    /* JADX INFO: renamed from: Ḽ, reason: contains not printable characters */
    public static final String f2138 = StringFog.decrypt("NnJgWRtT\n", "dxY0IGs2bwQ=\n");

    /* JADX INFO: renamed from: Ḹ, reason: contains not printable characters */
    public static final String f2137 = StringFog.decrypt("0f4NpJqf8xf3\n", "kJp+5/XxlX4=\n");

    /* JADX INFO: renamed from: Ḟ, reason: contains not printable characters */
    public static final String f2136 = StringFog.decrypt("KsKHo6Aepc8J5IykpwOr\n", "Z6fjysFqzKA=\n");

    /* JADX INFO: renamed from: ᵆ, reason: contains not printable characters */
    public static final String f2135 = StringFog.decrypt("fNHz5Hi00rBYztrmc73bu14=\n", "LL2Shx3Zt94=\n");

    /* JADX INFO: renamed from: ᘥ, reason: contains not printable characters */
    public static final String f2134 = StringFog.decrypt("8srGOo7+YSzW\n", "oqanWeuTBEI=\n");

    /* JADX INFO: renamed from: ᗀ, reason: contains not printable characters */
    public static final String f2133 = StringFog.decrypt("LTLy9aHeTAsQNef8n8RLFgEy4+I=\n", "ZFyGkNOtOGI=\n");

    /* JADX INFO: renamed from: ᖺ, reason: contains not printable characters */
    public static final String f2132 = StringFog.decrypt("itfHo1p+Fj2U28O2TXQWKw==\n", "2LKwwigac1k=\n");

    /* JADX INFO: renamed from: ᖸ, reason: contains not printable characters */
    public static final String f2131 = StringFog.decrypt("o6RtTiOS+viFp1ldMoA=\n", "6skdPEbhiZE=\n");

    /* JADX INFO: renamed from: ᖭ, reason: contains not printable characters */
    public static final String f2130 = StringFog.decrypt("G2O1pEcMVwomZKCt\n", "Ug3BwTV/I2M=\n");

    /* JADX INFO: renamed from: ᖫ, reason: contains not printable characters */
    public static final String f2129 = StringFog.decrypt("DpRWnekY7tkqrE6O6Q==\n", "Xvg3/ox1i7c=\n");

    /* JADX INFO: renamed from: ᖩ, reason: contains not printable characters */
    public static final String f2128 = StringFog.decrypt("UF7cuqQwxr4=\n", "Ajur29ZUo9o=\n");

    /* JADX INFO: renamed from: ᖅ, reason: contains not printable characters */
    public static final String f2127 = StringFog.decrypt("0sc21E97FbbuwSo=\n", "ga9ZowALYd8=\n");

    /* JADX INFO: renamed from: ᕆ, reason: contains not printable characters */
    public static final String f2126 = StringFog.decrypt("vB7tJwgJzuQ=\n", "/3+OT21tj4A=\n");

    /* JADX INFO: renamed from: ᕄ, reason: contains not printable characters */
    public static final String f2125 = StringFog.decrypt("ZDniK/DN/ZhOPeYo+s0=\n", "KlyWXJ+/ltk=\n");

    /* JADX INFO: renamed from: ᕃ, reason: contains not printable characters */
    public static final String f2124 = StringFog.decrypt("W353gNdMFUt1dXo=\n", "GhoW8KMpZxs=\n");

    /* JADX INFO: renamed from: ᕂ, reason: contains not printable characters */
    public static final String f2123 = StringFog.decrypt("XtKMBBCiDvZw2IsdA7IO1Gvfgho=\n", "H7btdGTHfLU=\n");

    /* JADX INFO: renamed from: ᔽ, reason: contains not printable characters */
    public static final String f2122 = StringFog.decrypt("tD22XyxA/5CUKr4=\n", "8UvTMVgTi+I=\n");

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0535
    /* JADX INFO: renamed from: ﻛ */
    public final String mo335() {
        try {
            try {
                return (String) FairBid.class.getDeclaredField(StringFog.decrypt("LrFuPzy7GR80ums=\n", "ffUlYGr+S0w=\n")).get(null);
            } catch (Exception unused) {
                C0679 c0679 = C0891.m648().f2390;
                String strDecrypt = StringFog.decrypt("pDWZ6Zpk25inNZnpmmTbmKc1memaZKQ=\n", "+m7FjcdPgLY=\n");
                c0679.getClass();
                return C0679.m570((Object) null, FairBid.class, strDecrypt);
            }
        } catch (Exception unused2) {
            return null;
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0535
    /* JADX INFO: renamed from: ﾇ */
    public final HashMap mo337() {
        HashMap map = new HashMap();
        map.put(f2161, new C0878(this));
        map.put(f2160, new C0873(this));
        map.put(f2159, new C0856(this));
        map.put(f2158, new C0853(this));
        map.put(f2157, new C0851(this));
        map.put(f2156, new C0850(this));
        map.put(f2155, new C0816(this));
        map.put(f2154, new C0813(this));
        map.put(f2153, new C0811(this));
        map.put(f2152, new C0961(this));
        map.put(f2151, new C0957(this));
        map.put(f2150, new C0955(this));
        map.put(f2149, new C0947(this));
        map.put(f2148, new C0899(this));
        map.put(f2147, new C0895(this));
        map.put(f2146, new C0894(this));
        map.put(f2145, new C0892(this));
        map.put(f2144, new C0882(this));
        map.put(f2143, new C0881(this));
        map.put(f2142, new C0877(this));
        map.put(f2141, new C0874(this));
        return map;
    }

    public C0810(String str) {
        super(str);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:62:0x00dc  */
    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0535
    /* JADX INFO: renamed from: ﾒ */
    public final Class mo336(String str) {
        byte b;
        switch (str.hashCode()) {
            case -2041833493:
                if (str.equals(f2124)) {
                    b = 16;
                } else {
                    b = -1;
                }
                break;
            case -1598046662:
                if (str.equals(f2136)) {
                    b = 4;
                } else {
                    b = -1;
                }
                break;
            case -1115843213:
                if (str.equals(f2131)) {
                    b = 9;
                } else {
                    b = -1;
                }
                break;
            case -847426041:
                if (str.equals(f2123)) {
                    b = 17;
                } else {
                    b = -1;
                }
                break;
            case -498060603:
                if (str.equals(f2134)) {
                    b = 6;
                } else {
                    b = -1;
                }
                break;
            case -368841467:
                if (str.equals(f2126)) {
                    b = 14;
                } else {
                    b = -1;
                }
                break;
            case -174936018:
                if (str.equals(f2128)) {
                    b = 12;
                } else {
                    b = -1;
                }
                break;
            case 99044255:
                if (str.equals(f2129)) {
                    b = 11;
                } else {
                    b = -1;
                }
                break;
            case 438795617:
                if (str.equals(f2125)) {
                    b = 15;
                } else {
                    b = -1;
                }
                break;
            case 578208537:
                if (str.equals(f2140)) {
                    b = 0;
                } else {
                    b = -1;
                }
                break;
            case 769047372:
                if (str.equals(f2130)) {
                    b = 10;
                } else {
                    b = -1;
                }
                break;
            case 806552769:
                if (str.equals(f2127)) {
                    b = 13;
                } else {
                    b = -1;
                }
                break;
            case 1062384924:
                if (str.equals(f2135)) {
                    b = 5;
                } else {
                    b = -1;
                }
                break;
            case 1212533506:
                if (str.equals(f2132)) {
                    b = 8;
                } else {
                    b = -1;
                }
                break;
            case 1297340448:
                if (str.equals(f2133)) {
                    b = 7;
                } else {
                    b = -1;
                }
                break;
            case 1775008410:
                if (str.equals(f2122)) {
                    b = 18;
                } else {
                    b = -1;
                }
                break;
            case 1884304309:
                if (str.equals(f2139)) {
                    b = 1;
                } else {
                    b = -1;
                }
                break;
            case 1955869213:
                if (str.equals(f2138)) {
                    b = 2;
                } else {
                    b = -1;
                }
                break;
            case 1969669106:
                if (str.equals(f2137)) {
                    b = 3;
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
                return FairBid.class;
            case 1:
                return MediationManager.class;
            case 2:
                return Constants.AdType.class;
            case 3:
                return FairBid.AdsConfig.class;
            case 4:
                return MediationConfig.class;
            case 5:
                return PlacementsHandler.class;
            case 6:
                return Placement.class;
            case 7:
                return InterstitialListener.class;
            case 8:
                return RewardedListener.class;
            case 9:
                return ImpressionData.class;
            case 10:
                return Interstitial.class;
            case 11:
                return PlacementType.class;
            case 12:
                return Rewarded.class;
            case 13:
                return ShowOptions.class;
            case 14:
                return CachedAd.class;
            case 15:
                return NetworkAdapter.class;
            case 16:
                return AdapterPool.class;
            case 17:
                return AdapterConfiguration.class;
            case 18:
                return EventStream.class;
            default:
                return null;
        }
    }
}
