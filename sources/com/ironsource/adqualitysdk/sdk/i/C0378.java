package com.ironsource.adqualitysdk.sdk.i;

import com.inmobi.ads.AdUnit;
import com.ironsource.adqualitysdk.sdk.StringFog;
import java.util.ArrayList;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.ĵ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class C0378 implements InterfaceC0536 {

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C1286 f745;

    public C0378(C1286 c1286) {
        this.f745 = c1286;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0051  */
    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0536
    /* JADX INFO: renamed from: ﾒ */
    public final Object mo334(ArrayList arrayList, C0752 c0752) {
        C1286 c1286 = this.f745;
        byte b = 0;
        String str = (String) arrayList.get(0);
        c1286.getClass();
        int iHashCode = str.hashCode();
        if (iHashCode != 556003820) {
            if (iHashCode != 556062505) {
                if (iHashCode == 1382961856 && str.equals(StringFog.decrypt("xjximHUAuTHXJ2mMZBetMckzc5pjHA==\n", "h3g91TRS8mQ=\n"))) {
                    b = 2;
                } else {
                    b = -1;
                }
            } else if (str.equals(StringFog.decrypt("pOsWBnKhSsy18B0SY7Ze0KviFgFgvE8=\n", "5a9JSzPzAZk=\n"))) {
                b = 1;
            } else {
                b = -1;
            }
        } else if (!str.equals(StringFog.decrypt("PbpTx+dHMJ8soVjT9lAkgzKzU8LyWDc=\n", "fP4MiqYVe8o=\n"))) {
            b = -1;
        }
        if (b == 0) {
            return AdUnit.AdMarkupType.AD_MARKUP_TYPE_INM_HTML;
        }
        if (b == 1) {
            return AdUnit.AdMarkupType.AD_MARKUP_TYPE_INM_JSON;
        }
        if (b != 2) {
            return null;
        }
        return AdUnit.AdMarkupType.AD_MARKUP_TYPE_UNKNOWN;
    }
}
