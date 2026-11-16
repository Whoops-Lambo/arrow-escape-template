package com.ironsource.adqualitysdk.sdk.i;

import com.ironsource.adqualitysdk.sdk.StringFog;
import com.ogury.sdk.Ogury;
import io.presage.Presage;
import io.presage.common.AdConfig;
import io.presage.common.PresageSdk;
import io.presage.common.network.models.RewardItem;
import io.presage.interstitial.InterstitialActivity;
import io.presage.interstitial.PresageInterstitial;
import io.presage.interstitial.PresageInterstitialCallback;
import io.presage.interstitial.optinvideo.PresageOptinVideo;
import io.presage.interstitial.optinvideo.PresageOptinVideoCallback;
import java.util.HashMap;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.ǐ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class C0416 extends AbstractC0535 {

    /* JADX INFO: renamed from: סּ, reason: contains not printable characters */
    public static final String f863 = StringFog.decrypt("yroiFuM9DhjKuh8o4iwcF866\n", "rd9WRpFYfXk=\n");

    /* JADX INFO: renamed from: טּ, reason: contains not printable characters */
    public static final String f862 = StringFog.decrypt("OW2yKxXYCh85fK8WEs0DLitkqgAazwQ=\n", "SgjGYnusb20=\n");

    /* JADX INFO: renamed from: ﬤ, reason: contains not printable characters */
    public static final String f861 = StringFog.decrypt("tuRrg8j/STqT6Hup18hBOKnjfq/T\n", "xYEfzLiLIFQ=\n");

    /* JADX INFO: renamed from: 爫, reason: contains not printable characters */
    public static final String f860 = StringFog.decrypt("1hSL4EfIEprYHov5W9kEicwPzORczA3V9hXR9UfeFZLLEsT8dM4VkskS0ek=\n", "v3ulkDWtYfs=\n");

    /* JADX INFO: renamed from: 乁, reason: contains not printable characters */
    public static final String f859 = StringFog.decrypt("aG2dDV/MCvJVaogEbNwK8ldqnRE=\n", "IQPpaC2/fps=\n");

    /* JADX INFO: renamed from: 丫, reason: contains not printable characters */
    public static final String f858 = StringFog.decrypt("iCL9VYzpIKiGKP1MkPg2u5I5ulGX7T/nlCT9bJD4NruSObpRl+0/iII5ulOX+Co=\n", "4U3TJf6MU8k=\n");

    /* JADX INFO: renamed from: ヶ, reason: contains not printable characters */
    public static final String f857 = StringFog.decrypt("s9a00MCIL8KS1onX1YEc0pLWi9fAlA==\n", "5r/9vrTtXbE=\n");

    /* JADX INFO: renamed from: ヮ, reason: contains not printable characters */
    public static final String f856 = StringFog.decrypt("Qyc+TxM=\n", "DEBLPWqK3jg=\n");

    /* JADX INFO: renamed from: リ, reason: contains not printable characters */
    public static final String f855 = StringFog.decrypt("Ru35A/nWQg==\n", "Fp+ccJixJzc=\n");

    /* JADX INFO: renamed from: ト, reason: contains not printable characters */
    public static final String f854 = StringFog.decrypt("4c4DXylOETvV1w==\n", "sbxmLEgpdGg=\n");

    /* JADX INFO: renamed from: ゥ, reason: contains not printable characters */
    public static final String f853 = StringFog.decrypt("OGp+4NfSRRIGbH7hxcFJLwF5dw==\n", "aBgbk7a1IFs=\n");

    /* JADX INFO: renamed from: へ, reason: contains not printable characters */
    public static final String f852 = StringFog.decrypt("n4Wvj0PCUxuhg6+OUdFfJqaWpr9DyVowrpSh\n", "z/fK/CKlNlI=\n");

    /* JADX INFO: renamed from: っ, reason: contains not printable characters */
    public static final String f851 = StringFog.decrypt("h6OoexP1/B2npaRmJPv9N7g=\n", "19HNCHKSmVI=\n");

    /* JADX INFO: renamed from: く, reason: contains not printable characters */
    public static final String f850 = StringFog.decrypt("BalkiVFibTslr2iUZmxsETqYYJZcZ2kXPg==\n", "VdsB+jAFCHQ=\n");

    /* JADX INFO: renamed from: Ↄ, reason: contains not printable characters */
    public static final String f849 = StringFog.decrypt("Hd6I33jcoB0q1g==\n", "T7v/vgq46Wk=\n");

    /* JADX INFO: renamed from: Ⅽ, reason: contains not printable characters */
    public static final String f848 = StringFog.decrypt("wSe9f9tPD24=\n", "gEP+ELUpZgk=\n");

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0535
    /* JADX INFO: renamed from: ﾇ */
    public final HashMap mo337() {
        HashMap map = new HashMap();
        map.put(f863, new C0515(this));
        map.put(f862, new C0450(this));
        map.put(f861, new C0420(this));
        return map;
    }

    public C0416(String str) {
        super(str);
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0535
    /* JADX INFO: renamed from: ﻛ */
    public final String mo335() {
        String strMo342 = mo342();
        if (strMo342 != null) {
            return strMo342.split(StringFog.decrypt("MQ==\n", "HBYas3kay0Q=\n"))[0];
        }
        return null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0535
    /* JADX INFO: renamed from: ﾒ */
    public final Class mo336(String str) {
        switch (str.hashCode()) {
            case -2101347995:
                if (str.equals(f848)) {
                    return AdConfig.class;
                }
                return null;
            case -1907784110:
                if (str.equals(f851)) {
                    return PresageOptinVideo.class;
                }
                return null;
            case -1704786309:
                if (str.equals(f859)) {
                    return InterstitialActivity.class;
                }
                return null;
            case -938422005:
                if (str.equals(f854)) {
                    return PresageSdk.class;
                }
                return null;
            case -610604286:
                if (str.equals(f849)) {
                    return RewardItem.class;
                }
                return null;
            case -126768170:
                if (str.equals(f860)) {
                    return InterstitialActivity.class;
                }
                return null;
            case 76142724:
                if (str.equals(f856)) {
                    return Ogury.class;
                }
                return null;
            case 698887547:
                if (str.equals(f853)) {
                    return PresageInterstitial.class;
                }
                return null;
            case 1067648736:
                if (str.equals(f852)) {
                    return PresageInterstitialCallback.class;
                }
                return null;
            case 1346371759:
                if (str.equals(f855)) {
                    return Presage.class;
                }
                return null;
            case 1871097647:
                if (str.equals(f857)) {
                    return io.presage.interstitial.ui.InterstitialActivity.class;
                }
                return null;
            case 2109755994:
                if (str.equals(f858)) {
                    return io.presage.interstitial.ui.InterstitialActivity.class;
                }
                return null;
            case 2128976055:
                if (str.equals(f850)) {
                    return PresageOptinVideoCallback.class;
                }
                return null;
            default:
                return null;
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0535
    /* JADX INFO: renamed from: ﾒ */
    public final String mo342() {
        try {
            try {
                return (String) Class.forName(StringFog.decrypt("h7p1RRAL4DCJsHVWDQP+PoD7MlNMOPIyhrApXAwK5jmPoC9xDRvxIqO6NUEGIeE=\n", "7tVbNWJuk1E=\n")).getMethod(StringFog.decrypt("7g==\n", "j8qVH2auNHo=\n"), null).invoke(null, null);
            } catch (Throwable unused) {
                return null;
            }
        } catch (Exception unused2) {
            return PresageSdk.getAdsSdkVersion();
        }
    }
}
