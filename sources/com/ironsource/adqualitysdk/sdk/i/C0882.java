package com.ironsource.adqualitysdk.sdk.i;

import com.fyber.fairbid.internal.Constants;
import com.ironsource.adqualitysdk.sdk.StringFog;
import java.util.ArrayList;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.ᔃ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public final class C0882 implements InterfaceC0536 {

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C0810 f2367;

    public C0882(C0810 c0810) {
        this.f2367 = c0810;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0536
    /* JADX INFO: renamed from: ﾒ */
    public final Object mo334(ArrayList arrayList, C0752 c0752) {
        C0810 c0810 = this.f2367;
        String str = (String) arrayList.get(0);
        c0810.getClass();
        int iHashCode = str.hashCode();
        if (iHashCode == -1372958932) {
            if (str.equals(StringFog.decrypt("3ywDvM1RgbvCKxa1\n", "lmJX+Z8C1fI=\n"))) {
                return Constants.AdType.INTERSTITIAL;
            }
            return null;
        }
        if (iHashCode == 433141802) {
            if (str.equals(StringFog.decrypt("Vm12vw0cYw==\n", "AyM98UJLLbA=\n"))) {
                return Constants.AdType.UNKNOWN;
            }
            return null;
        }
        if (iHashCode == 543046670) {
            if (str.equals(StringFog.decrypt("J3+XGfDAKqM=\n", "dTrAWKKEb+c=\n"))) {
                return Constants.AdType.REWARDED;
            }
            return null;
        }
        if (iHashCode == 1951953708 && str.equals(StringFog.decrypt("aK4MmKyP\n", "Ku9C1undqIQ=\n"))) {
            return Constants.AdType.BANNER;
        }
        return null;
    }
}
