package com.ironsource.adqualitysdk.sdk.i;

import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.ironsource.adqualitysdk.sdk.StringFog;
import java.util.ArrayList;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.ẋ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes10.dex */
public final class C1062 implements InterfaceC0536 {

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C0921 f3083;

    public C1062(C0921 c0921) {
        this.f3083 = c0921;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0536
    /* JADX INFO: renamed from: ﾒ */
    public final Object mo334(ArrayList arrayList, C0752 c0752) {
        C0921 c0921 = this.f3083;
        String str = (String) arrayList.get(0);
        c0921.getClass();
        switch (str.hashCode()) {
            case -2032180703:
                if (str.equals(StringFog.decrypt("2IF1oG4vzw==\n", "nMQz4Ttjm+U=\n"))) {
                    return UnitDisplayType.DEFAULT;
                }
                return null;
            case -1841345251:
                if (str.equals(StringFog.decrypt("1b0BXfUl\n", "huxUHKdgxJU=\n"))) {
                    return UnitDisplayType.SQUARE;
                }
                return null;
            case -1372958932:
                if (str.equals(StringFog.decrypt("A8jUWlhY38wez8FT\n", "SoaAHwoLi4U=\n"))) {
                    return UnitDisplayType.INTERSTITIAL;
                }
                return null;
            case -1201514634:
                if (str.equals(StringFog.decrypt("Jnf5inH6m8g=\n", "cDKr3ji52oQ=\n"))) {
                    return UnitDisplayType.VERTICAL;
                }
                return null;
            case -77725029:
                if (str.equals(StringFog.decrypt("DxfYxPMwCRcG\n", "Q1aWgKBzSEc=\n"))) {
                    return UnitDisplayType.LANDSCAPE;
                }
                return null;
            case 73622449:
                if (str.equals(StringFog.decrypt("DwxnFs8=\n", "Ql4iVZs2vyA=\n"))) {
                    return UnitDisplayType.MRECT;
                }
                return null;
            case 543046670:
                if (str.equals(StringFog.decrypt("5mjd7M9OSC4=\n", "tC2KrZ0KDWo=\n"))) {
                    return UnitDisplayType.REWARDED;
                }
                return null;
            case 1951953708:
                if (str.equals(StringFog.decrypt("o/AS+w28\n", "4bFctUjumTg=\n"))) {
                    return UnitDisplayType.BANNER;
                }
                return null;
            default:
                return null;
        }
    }
}
