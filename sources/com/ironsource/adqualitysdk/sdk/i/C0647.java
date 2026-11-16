package com.ironsource.adqualitysdk.sdk.i;

import com.five_corp.ad.FiveAdConfig;
import java.util.ArrayList;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.ٱ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class C0647 implements InterfaceC0536 {

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C0565 f1682;

    public C0647(C0565 c0565) {
        this.f1682 = c0565;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0536
    /* JADX INFO: renamed from: ﾒ */
    public final Object mo334(ArrayList arrayList, C0752 c0752) {
        C0565 c0565 = this.f1682;
        FiveAdConfig fiveAdConfig = (FiveAdConfig) arrayList.get(0);
        c0565.getClass();
        return fiveAdConfig.appId;
    }
}
