package com.ironsource.adqualitysdk.sdk.i;

import com.bytedance.sdk.openadsdk.api.banner.PAGBannerAd;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerAdInteractionListener;
import java.util.ArrayList;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.ż, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class C0400 implements InterfaceC0536 {

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C0364 f834;

    public C0400(C0364 c0364) {
        this.f834 = c0364;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0536
    /* JADX INFO: renamed from: ﾒ */
    public final Object mo334(ArrayList arrayList, C0752 c0752) {
        C0364 c0364 = this.f834;
        PAGBannerAd pAGBannerAd = (PAGBannerAd) arrayList.get(0);
        PAGBannerAdInteractionListener pAGBannerAdInteractionListener = (PAGBannerAdInteractionListener) arrayList.get(1);
        c0364.getClass();
        pAGBannerAd.setAdInteractionListener(pAGBannerAdInteractionListener);
        return null;
    }
}
