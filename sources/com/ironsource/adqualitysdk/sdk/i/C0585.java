package com.ironsource.adqualitysdk.sdk.i;

import com.google.android.libraries.ads.mobile.sdk.rewardedinterstitial.RewardedInterstitialAd;
import java.util.ArrayList;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.ӟ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public final class C0585 implements InterfaceC0536 {

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C0556 f1446;

    public C0585(C0556 c0556) {
        this.f1446 = c0556;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0536
    /* JADX INFO: renamed from: ﾒ */
    public final Object mo334(ArrayList arrayList, C0752 c0752) {
        this.f1446.getClass();
        return ((RewardedInterstitialAd) AbstractC1098.m806(arrayList, 0, RewardedInterstitialAd.class)).getRewardItem();
    }
}
