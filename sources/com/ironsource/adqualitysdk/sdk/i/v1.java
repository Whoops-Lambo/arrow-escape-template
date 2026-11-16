package com.ironsource.adqualitysdk.sdk.i;

import com.yandex.mobile.ads.interstitial.InterstitialAd;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class v1 implements InterfaceC0536 {

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C1 f515;

    public v1(C1 c1) {
        this.f515 = c1;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0536
    /* JADX INFO: renamed from: ﾒ */
    public final Object mo334(ArrayList arrayList, C0752 c0752) {
        C1 c1 = this.f515;
        InterstitialAd interstitialAd = (InterstitialAd) arrayList.get(0);
        c1.getClass();
        return interstitialAd.getInfo();
    }
}
