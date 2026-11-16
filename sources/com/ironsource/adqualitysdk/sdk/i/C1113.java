package com.ironsource.adqualitysdk.sdk.i;

import com.my.target.ads.Reward;
import java.util.ArrayList;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.⁔, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class C1113 implements InterfaceC0536 {

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C1112 f3228;

    public C1113(C1112 c1112) {
        this.f3228 = c1112;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0536
    /* JADX INFO: renamed from: ﾒ */
    public final Object mo334(ArrayList arrayList, C0752 c0752) {
        C1112 c1112 = this.f3228;
        Reward reward = (Reward) arrayList.get(0);
        c1112.getClass();
        return reward.type;
    }
}
