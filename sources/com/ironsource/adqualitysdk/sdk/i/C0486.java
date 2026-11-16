package com.ironsource.adqualitysdk.sdk.i;

import java.util.ArrayList;
import tv.superawesome.sdk.publisher.SABannerAd;
import tv.superawesome.sdk.publisher.SAInterface;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.ˈ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class C0486 implements InterfaceC0536 {

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C0481 f1081;

    public C0486(C0481 c0481) {
        this.f1081 = c0481;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0536
    /* JADX INFO: renamed from: ﾒ */
    public final Object mo334(ArrayList arrayList, C0752 c0752) {
        C0481 c0481 = this.f1081;
        SABannerAd sABannerAd = (SABannerAd) arrayList.get(0);
        SAInterface sAInterface = (SAInterface) arrayList.get(1);
        c0481.getClass();
        sABannerAd.setListener(sAInterface);
        return null;
    }
}
