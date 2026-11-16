package com.ironsource.adqualitysdk.sdk.i;

import com.ogury.ad.OguryRewardedAd;
import com.ogury.ad.OguryRewardedAdListener;
import java.util.ArrayList;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.ſ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class C0401 implements InterfaceC0536 {

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C0392 f835;

    public C0401(C0392 c0392) {
        this.f835 = c0392;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0536
    /* JADX INFO: renamed from: ﾒ */
    public final Object mo334(ArrayList arrayList, C0752 c0752) {
        C0392 c0392 = this.f835;
        OguryRewardedAd oguryRewardedAd = (OguryRewardedAd) arrayList.get(0);
        OguryRewardedAdListener oguryRewardedAdListener = (OguryRewardedAdListener) arrayList.get(1);
        c0392.getClass();
        oguryRewardedAd.setListener(oguryRewardedAdListener);
        return null;
    }
}
