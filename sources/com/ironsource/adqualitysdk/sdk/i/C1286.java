package com.ironsource.adqualitysdk.sdk.i;

import com.inmobi.ads.AdContainer;
import com.inmobi.ads.AdUnit;
import com.inmobi.ads.InMobiAdRequest;
import com.inmobi.ads.InMobiBanner;
import com.inmobi.ads.InMobiInterstitial;
import com.inmobi.ads.NativeRecyclerViewAdapter;
import com.inmobi.ads.NativeVideoView;
import com.inmobi.ads.ViewableAd;
import com.inmobi.ads.listeners.BannerAdEventListener;
import com.inmobi.ads.listeners.InterstitialAdEventListener;
import com.inmobi.ads.listeners.NativeAdEventListener;
import com.inmobi.ads.listeners.VideoEventListener;
import com.inmobi.media.ads.network.common.model.Ad;
import com.inmobi.media.ads.network.common.model.AdResponse;
import com.inmobi.media.ads.network.common.model.AdSet;
import com.inmobi.media.ads.network.common.model.ContextData;
import com.inmobi.rendering.InMobiAdActivity;
import com.inmobi.sdk.InMobiSdk;
import com.ironsource.adqualitysdk.sdk.StringFog;
import java.util.HashMap;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.ﻠ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class C1286 extends AbstractC0535 {

    /* JADX INFO: renamed from: סּ, reason: contains not printable characters */
    public static final String f3880 = StringFog.decrypt("6PzjSjTUl+Li/PluDMyE4sr34nc=\n", "j5mXGli19Ic=\n");

    /* JADX INFO: renamed from: טּ, reason: contains not printable characters */
    public static final String f3879 = StringFog.decrypt("PXHiDHM+qJUxYeYZbgOsojRh+w==\n", "WhSWTRdzyec=\n");

    /* JADX INFO: renamed from: ﬤ, reason: contains not printable characters */
    public static final String f3878 = StringFog.decrypt("8wEHofrsQ8z7ABaJ\n", "lGRz5ZuYIoE=\n");

    /* JADX INFO: renamed from: 爫, reason: contains not printable characters */
    public static final String f3877 = StringFog.decrypt("RRxrJzQSAclDDXYQNQUK3Ec=\n", "InkfZlBRc6w=\n");

    /* JADX INFO: renamed from: 乁, reason: contains not printable characters */
    public static final String f3876 = StringFog.decrypt("1z1EEI6GTfzfMH0WmoZ44Q==\n", "nlMJf+zvDJg=\n");

    /* JADX INFO: renamed from: 丫, reason: contains not printable characters */
    public static final String f3875 = StringFog.decrypt("wtawHekn8A7D0PNB5Sf5BNPQs1SuAPMsztu0cuQI/hXIz7RH+Q==\n", "obndM4BJnWE=\n");

    /* JADX INFO: renamed from: ヶ, reason: contains not printable characters */
    public static final String f3874 = StringFog.decrypt("v72F/7ST+ti3sLz5oJPPxaDr\n", "9tPIkNb6u7w=\n");

    /* JADX INFO: renamed from: ヮ, reason: contains not printable characters */
    public static final String f3873 = StringFog.decrypt("BuF8vaye5GsH5z/yoYOndgDgdfa3medjS8d/3qqS4EUBz3LnrIbgcBw=\n", "ZY4Rk8XwiQQ=\n");

    /* JADX INFO: renamed from: リ, reason: contains not printable characters */
    public static final String f3872 = StringFog.decrypt("2ndtYZY0c/Lwc3ZeiTRS\n", "lBYZCOBRJZs=\n");

    /* JADX INFO: renamed from: ト, reason: contains not printable characters */
    public static final String f3871 = StringFog.decrypt("pJLtUwNUWomxj9BX\n", "5fagMnE/L/k=\n");

    /* JADX INFO: renamed from: ゥ, reason: contains not printable characters */
    public static final String f3870 = StringFog.decrypt("H9qK9ysCT9cw27s=\n", "Xr7JmEV2Lr4=\n");

    /* JADX INFO: renamed from: へ, reason: contains not printable characters */
    public static final String f3869 = StringFog.decrypt("PLs6eqD0p08JjiZxteO8VQe7Jw==\n", "bt5UHsWGziE=\n");

    /* JADX INFO: renamed from: っ, reason: contains not printable characters */
    public static final String f3868 = StringFog.decrypt("Q2xd9yyYyTZnVEXkLA==\n", "EwA8lEn1rFg=\n");

    /* JADX INFO: renamed from: く, reason: contains not printable characters */
    public static final String f3867 = StringFog.decrypt("WPvNALjWrRB4\n", "HY2obsyC1GA=\n");

    /* JADX INFO: renamed from: Ↄ, reason: contains not printable characters */
    public static final String f3866 = StringFog.decrypt("OOJzKToVHbwf4ls0\n", "cYw+Rlh8X90=\n");

    /* JADX INFO: renamed from: Ⅽ, reason: contains not printable characters */
    public static final String f3865 = StringFog.decrypt("4LiW9B3hFODnr530DN8899a8lv8K\n", "otn4mniTVYQ=\n");

    /* JADX INFO: renamed from: K, reason: contains not printable characters */
    public static final String f3864 = StringFog.decrypt("zJKJwfec5grxmbbd4ZzbDeSQ\n", "hfzErpX1r2Q=\n");

    /* JADX INFO: renamed from: Ύ, reason: contains not printable characters */
    public static final String f3863 = StringFog.decrypt("JgRf/3oyGVIbA0r2SSUoTQoEX9ZhMhleAQ9Z\n", "b2ormghBbTs=\n");

    /* JADX INFO: renamed from: Ὺ, reason: contains not printable characters */
    public static final String f3862 = StringFog.decrypt("Zmq/UAzPUEttfa5XDuZ4XFxupVwI\n", "KAvLOXqqES8=\n");

    /* JADX INFO: renamed from: Ῡ, reason: contains not printable characters */
    public static final String f3861 = StringFog.decrypt("ZisS6yHDYB9eNjrnPfJzFFUw\n", "MEJ2jk6GFno=\n");

    /* JADX INFO: renamed from: Ῠ, reason: contains not printable characters */
    public static final String f3860 = StringFog.decrypt("S66FMKgv2Ilp\n", "AsDIX8pGi+0=\n");

    /* JADX INFO: renamed from: Ὑ, reason: contains not printable characters */
    public static final String f3859 = StringFog.decrypt("e9ooNHL74T1g0RQudeHU\n", "MrRlWxCSoFk=\n");

    /* JADX INFO: renamed from: Ṿ, reason: contains not printable characters */
    public static final String f3858 = StringFog.decrypt("1O0uLX+h21/D4A==\n", "goRLWh7Dtzo=\n");

    /* JADX INFO: renamed from: Ḽ, reason: contains not printable characters */
    public static final String f3857 = StringFog.decrypt("/1zHaZqh\n", "vjiSB/PVtWM=\n");

    /* JADX INFO: renamed from: Ḹ, reason: contains not printable characters */
    public static final String f3856 = StringFog.decrypt("8vqGLG0rm0jf4pEpfjyfRNnssyF6Pr1Izg==\n", "vJvyRRtOyS0=\n");

    /* JADX INFO: renamed from: Ḟ, reason: contains not printable characters */
    public static final String f3855 = StringFog.decrypt("2aPWgbex45rTo8ylkrQ=\n", "vsai0dvQgP8=\n");

    /* JADX INFO: renamed from: ᵆ, reason: contains not printable characters */
    public static final String f3854 = StringFog.decrypt("+gX7JLnkGRLu\n", "nWCPZd23fGY=\n");

    /* JADX INFO: renamed from: ᘥ, reason: contains not printable characters */
    public static final String f3853 = StringFog.decrypt("Q04p+91DT+dPWQ==\n", "Kj17nqoiPYM=\n");

    /* JADX INFO: renamed from: ᗀ, reason: contains not printable characters */
    public static final String f3852 = StringFog.decrypt("2kXEwcfo\n", "vSCwgKObMn8=\n");

    /* JADX INFO: renamed from: ᖺ, reason: contains not printable characters */
    public static final String f3851 = StringFog.decrypt("jpM1nZESnHuRggW/ih0=\n", "6fZB3v586B4=\n");

    /* JADX INFO: renamed from: ᖸ, reason: contains not printable characters */
    public static final String f3850 = StringFog.decrypt("N0XgLBGhuVY0Uw==\n", "UCCUfnTW2CQ=\n");

    /* JADX INFO: renamed from: ᖭ, reason: contains not printable characters */
    public static final String f3849 = StringFog.decrypt("dSA8SjN6MydhMQ==\n", "EkVIHVYYZUY=\n");

    /* JADX INFO: renamed from: ᖫ, reason: contains not printable characters */
    public static final String f3848 = StringFog.decrypt("s03rRLLqTFC9XvpOpA==\n", "1CifB8CPLSQ=\n");

    /* JADX INFO: renamed from: ᖩ, reason: contains not printable characters */
    public static final String f3847 = StringFog.decrypt("Vq5zbmmnT4RFonRKaZJFmEWuaVs=\n", "McsHLw3RKvY=\n");

    /* JADX INFO: renamed from: ᖅ, reason: contains not printable characters */
    public static final String f3846 = StringFog.decrypt("6EPTGym4AkraQg==\n", "qSeBflrIbSQ=\n");

    /* JADX INFO: renamed from: ᕆ, reason: contains not printable characters */
    public static final String f3845 = StringFog.decrypt("x5SOAvY=\n", "hvDdZ4IA8lo=\n");

    /* JADX INFO: renamed from: ᕄ, reason: contains not printable characters */
    public static final String f3844 = StringFog.decrypt("BhE=\n", "R3X4wu62Mbg=\n");

    /* JADX INFO: renamed from: ᕃ, reason: contains not printable characters */
    public static final String f3843 = StringFog.decrypt("gwY/QXbP0bmhHTA=\n", "wGlRNRO3pf0=\n");

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0535
    /* JADX INFO: renamed from: ﾇ */
    public final HashMap mo337() {
        HashMap map = new HashMap();
        map.put(f3880, new C0379(this));
        map.put(f3879, new C0378(this));
        map.put(f3878, new C1358(this));
        map.put(f3877, new C1341(this));
        map.put(f3855, new C1339(this));
        map.put(f3854, new C1320(this));
        map.put(f3853, new C1319(this));
        map.put(f3852, new C1303(this));
        map.put(f3851, new C1294(this));
        map.put(f3850, new C0393(this));
        map.put(f3849, new C0386(this));
        map.put(f3848, new C0382(this));
        map.put(f3847, new C0380(this));
        return map;
    }

    public C1286(String str) {
        super(str);
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0535
    /* JADX INFO: renamed from: ﻛ */
    public final String mo335() {
        return InMobiSdk.getVersion();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:80:0x0123  */
    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0535
    /* JADX INFO: renamed from: ﾒ */
    public final Class mo336(String str) {
        byte b;
        switch (str.hashCode()) {
            case -2044438337:
                if (str.equals(f3869)) {
                    b = 7;
                } else {
                    b = -1;
                }
                break;
            case -1769689844:
                if (str.equals(f3860)) {
                    b = 12;
                } else {
                    b = -1;
                }
                break;
            case -1716191362:
                if (str.equals(f3870)) {
                    b = 6;
                } else {
                    b = -1;
                }
                break;
            case -1405271692:
                if (str.equals(f3856)) {
                    b = 16;
                } else {
                    b = -1;
                }
                break;
            case -1401317165:
                if (str.equals(f3861)) {
                    b = 20;
                } else {
                    b = -1;
                }
                break;
            case -1304544044:
                if (str.equals(f3862)) {
                    b = 19;
                } else {
                    b = -1;
                }
                break;
            case -1062227179:
                if (str.equals(f3875)) {
                    b = 1;
                } else {
                    b = -1;
                }
                break;
            case -808014786:
                if (str.equals(f3859)) {
                    b = 13;
                } else {
                    b = -1;
                }
                break;
            case -595852006:
                if (str.equals(f3866)) {
                    b = 10;
                } else {
                    b = -1;
                }
                break;
            case -560158238:
                if (str.equals(f3874)) {
                    b = 2;
                } else {
                    b = -1;
                }
                break;
            case -541364416:
                if (str.equals(f3876)) {
                    b = 0;
                } else {
                    b = -1;
                }
                break;
            case -520974940:
                if (str.equals(f3846)) {
                    b = 21;
                } else {
                    b = -1;
                }
                break;
            case -235933147:
                if (str.equals(f3871)) {
                    b = 5;
                } else {
                    b = -1;
                }
                break;
            case -204096109:
                if (str.equals(f3873)) {
                    b = 3;
                } else {
                    b = -1;
                }
                break;
            case -93733047:
                if (str.equals(f3872)) {
                    b = 4;
                } else {
                    b = -1;
                }
                break;
            case -32161126:
                if (str.equals(f3864)) {
                    b = 11;
                } else {
                    b = -1;
                }
                break;
            case 2115:
                if (str.equals(f3844)) {
                    b = 23;
                } else {
                    b = -1;
                }
                break;
            case 63090975:
                if (str.equals(f3845)) {
                    b = 22;
                } else {
                    b = -1;
                }
                break;
            case 99044255:
                if (str.equals(f3868)) {
                    b = 8;
                } else {
                    b = -1;
                }
                break;
            case 515339810:
                if (str.equals(f3858)) {
                    b = 14;
                } else {
                    b = -1;
                }
                break;
            case 957243679:
                if (str.equals(f3865)) {
                    b = 18;
                } else {
                    b = -1;
                }
                break;
            case 1228411167:
                if (str.equals(f3863)) {
                    b = 17;
                } else {
                    b = -1;
                }
                break;
            case 1564529113:
                if (str.equals(f3843)) {
                    b = 24;
                } else {
                    b = -1;
                }
                break;
            case 1955888231:
                if (str.equals(f3857)) {
                    b = 15;
                } else {
                    b = -1;
                }
                break;
            case 2035398868:
                if (str.equals(f3867)) {
                    b = 9;
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
                return InMobiAdActivity.class;
            case 2:
            case 3:
                return com.inmobi.ads.rendering.InMobiAdActivity.class;
            case 4:
                return NativeVideoView.class;
            case 5:
                return AdUnit.AdMarkupType.class;
            case 6:
                return AdContainer.class;
            case 7:
                return AdContainer.RenderingProperties.class;
            case 8:
                return AdContainer.RenderingProperties.PlacementType.class;
            case 9:
                return AdContainer.EventType.class;
            case 10:
                return InMobiBanner.class;
            case 11:
                return InMobiInterstitial.class;
            case 12:
                return InMobiSdk.class;
            case 13:
                return InMobiAdRequest.class;
            case 14:
                return ViewableAd.class;
            case 15:
                return AdUnit.class;
            case 16:
                return NativeRecyclerViewAdapter.class;
            case 17:
                return InterstitialAdEventListener.class;
            case 18:
                return BannerAdEventListener.class;
            case 19:
                return NativeAdEventListener.class;
            case 20:
                return VideoEventListener.class;
            case 21:
                return AdResponse.class;
            case 22:
                return AdSet.class;
            case 23:
                return Ad.class;
            case 24:
                return ContextData.class;
            default:
                return null;
        }
    }
}
