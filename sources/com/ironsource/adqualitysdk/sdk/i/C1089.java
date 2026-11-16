package com.ironsource.adqualitysdk.sdk.i;

import com.facebook.ads.AdView;
import java.util.ArrayList;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.Ἴ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class C1089 implements InterfaceC0536 {

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C0971 f3166;

    public C1089(C0971 c0971) {
        this.f3166 = c0971;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0536
    /* JADX INFO: renamed from: ﾒ */
    public final Object mo334(ArrayList arrayList, C0752 c0752) {
        C0971 c0971 = this.f3166;
        AdView adView = (AdView) arrayList.get(0);
        c0971.getClass();
        return adView.getPlacementId();
    }
}
