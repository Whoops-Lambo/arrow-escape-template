package com.ironsource.adqualitysdk.sdk.i;

import com.unity3d.ads.UnityAdsLoadOptions;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class H implements InterfaceC0536 {

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ Y f158;

    public H(Y y) {
        this.f158 = y;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0536
    /* JADX INFO: renamed from: ﾒ */
    public final Object mo334(ArrayList arrayList, C0752 c0752) {
        Y y = this.f158;
        UnityAdsLoadOptions unityAdsLoadOptions = (UnityAdsLoadOptions) arrayList.get(0);
        y.getClass();
        return unityAdsLoadOptions.getData();
    }
}
