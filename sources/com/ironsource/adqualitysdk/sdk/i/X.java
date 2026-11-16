package com.ironsource.adqualitysdk.sdk.i;

import com.ironsource.adqualitysdk.sdk.StringFog;
import com.unity3d.ads.UnityAds;
import com.unity3d.services.ads.adunit.AdUnitActivity;
import com.unity3d.services.banners.BannerView;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class X extends AbstractC0535 {

    /* JADX INFO: renamed from: סּ, reason: contains not printable characters */
    public static final String f229 = StringFog.decrypt("kWJti/iGTwOkb06M5Ys=\n", "0AY45ZHyDmA=\n");

    /* JADX INFO: renamed from: טּ, reason: contains not printable characters */
    public static final String f228 = StringFog.decrypt("ETNnhD93J04Lb26EOXw8TBs/b9lkeCpJXD1u3yRwOhQzOF/EI20PWQY1fMM+YA==\n", "clwKqkoZTjo=\n");

    /* JADX INFO: renamed from: ﬤ, reason: contains not printable characters */
    public static final String f227 = StringFog.decrypt("rF5U8AV3N/+LSA==\n", "7j86nmAFYZY=\n");

    /* JADX INFO: renamed from: 爫, reason: contains not printable characters */
    public static final String f226 = StringFog.decrypt("EmjDVCAx0PUINMpUJjrL9xhkywl7PdjvH2LcCXsd2O8fYtwsPDrO\n", "cQeuelVfuYE=\n");

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0535
    /* JADX INFO: renamed from: ﾇ */
    public final HashMap mo337() {
        return new HashMap();
    }

    public X(String str) {
        super(str);
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0535
    /* JADX INFO: renamed from: ﻛ */
    public final String mo335() {
        String version = UnityAds.getVersion();
        if (version != null) {
            return version.split(StringFog.decrypt("JA==\n", "CerrnJIddFI=\n"))[0];
        }
        return null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0535
    /* JADX INFO: renamed from: ﾒ */
    public final Class mo336(String str) {
        int iHashCode = str.hashCode();
        if (iHashCode != 252148886) {
            if (iHashCode != 961844241) {
                if (iHashCode != 1067215379) {
                    if (iHashCode == 1531208100 && str.equals(f228)) {
                        return AdUnitActivity.class;
                    }
                    return null;
                }
                if (str.equals(f226)) {
                    return BannerView.class;
                }
                return null;
            }
            if (str.equals(f227)) {
                return BannerView.class;
            }
            return null;
        }
        if (str.equals(f229)) {
            return AdUnitActivity.class;
        }
        return null;
    }
}
