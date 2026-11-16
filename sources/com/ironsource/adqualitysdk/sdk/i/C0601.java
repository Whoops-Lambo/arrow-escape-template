package com.ironsource.adqualitysdk.sdk.i;

import com.google.android.libraries.ads.mobile.sdk.banner.AdView;
import java.util.ArrayList;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.ո, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class C0601 implements InterfaceC0536 {

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C0556 f1469;

    public C0601(C0556 c0556) {
        this.f1469 = c0556;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0536
    /* JADX INFO: renamed from: ﾒ */
    public final Object mo334(ArrayList arrayList, C0752 c0752) {
        this.f1469.getClass();
        return ((AdView) AbstractC1098.m806(arrayList, 0, AdView.class)).getBannerAd();
    }
}
