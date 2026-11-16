package com.ironsource.adqualitysdk.sdk.i;

import com.inmobi.ads.AdContainer;
import java.util.ArrayList;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.ﾝ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class C1358 implements InterfaceC0536 {

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C1286 f4057;

    public C1358(C1286 c1286) {
        this.f4057 = c1286;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0536
    /* JADX INFO: renamed from: ﾒ */
    public final Object mo334(ArrayList arrayList, C0752 c0752) {
        C1286 c1286 = this.f4057;
        AdContainer adContainer = (AdContainer) arrayList.get(0);
        c1286.getClass();
        return adContainer.getDataModel();
    }
}
