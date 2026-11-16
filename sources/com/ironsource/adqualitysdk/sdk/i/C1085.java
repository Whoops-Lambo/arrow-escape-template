package com.ironsource.adqualitysdk.sdk.i;

import com.mintegral.msdk.out.BannerAdListener;
import com.mintegral.msdk.out.MTGBannerView;
import java.util.ArrayList;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.Ἰ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class C1085 implements InterfaceC0536 {

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C0868 f3162;

    public C1085(C0868 c0868) {
        this.f3162 = c0868;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0536
    /* JADX INFO: renamed from: ﾒ */
    public final Object mo334(ArrayList arrayList, C0752 c0752) {
        C0868 c0868 = this.f3162;
        MTGBannerView mTGBannerView = (MTGBannerView) arrayList.get(0);
        BannerAdListener bannerAdListener = (BannerAdListener) arrayList.get(1);
        c0868.getClass();
        mTGBannerView.setBannerAdListener(bannerAdListener);
        return null;
    }
}
