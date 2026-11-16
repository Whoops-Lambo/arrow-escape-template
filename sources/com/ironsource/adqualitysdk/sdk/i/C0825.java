package com.ironsource.adqualitysdk.sdk.i;

import com.hyprmx.android.sdk.placement.PlacementType;
import com.ironsource.adqualitysdk.sdk.StringFog;
import java.util.ArrayList;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.ᒩ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
public final class C0825 implements InterfaceC0536 {

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C0745 f2195;

    public C0825(C0745 c0745) {
        this.f2195 = c0745;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0536
    /* JADX INFO: renamed from: ﾒ */
    public final Object mo334(ArrayList arrayList, C0752 c0752) {
        C0745 c0745 = this.f2195;
        String str = (String) arrayList.get(0);
        c0745.getClass();
        int iHashCode = str.hashCode();
        if (iHashCode == -1617199657) {
            if (str.equals(StringFog.decrypt("37J7MwESLw==\n", "lvwtck1ba20=\n"))) {
                return PlacementType.INVALID;
            }
            return null;
        }
        if (iHashCode == -1372958932) {
            if (str.equals(StringFog.decrypt("SZ1t5WtBNYJUmnjs\n", "ANM5oDkSYcs=\n"))) {
                return PlacementType.INTERSTITIAL;
            }
            return null;
        }
        if (iHashCode == -65580248) {
            if (str.equals(StringFog.decrypt("JxW73r6J/zQgG6PIrYLy\n", "aVrvgffHtmA=\n"))) {
                return PlacementType.NOT_INITIALIZED;
            }
            return null;
        }
        if (iHashCode == 543046670 && str.equals(StringFog.decrypt("o/pP4vlY/qQ=\n", "8b8Yo6scu+A=\n"))) {
            return PlacementType.REWARDED;
        }
        return null;
    }
}
