package com.ironsource.adqualitysdk.sdk.i;

import java.util.ArrayList;
import jp.maio.sdk.android.MaioAds;
import jp.maio.sdk.android.MaioAdsListenerInterface;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.דּ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class C1181 implements InterfaceC0536 {

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C1177 f3488;

    public C1181(C1177 c1177) {
        this.f3488 = c1177;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0536
    /* JADX INFO: renamed from: ﾒ */
    public final Object mo334(ArrayList arrayList, C0752 c0752) {
        C1177 c1177 = this.f3488;
        MaioAdsListenerInterface maioAdsListenerInterface = (MaioAdsListenerInterface) arrayList.get(0);
        c1177.getClass();
        MaioAds.setMaioAdsListener(maioAdsListenerInterface);
        return null;
    }
}
