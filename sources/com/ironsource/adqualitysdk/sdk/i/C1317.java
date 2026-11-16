package com.ironsource.adqualitysdk.sdk.i;

import com.ironsource.mediationsdk.adunit.adapter.utility.AdData;
import java.util.ArrayList;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.ｧ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class C1317 implements InterfaceC0536 {

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C1187 f3930;

    public C1317(C1187 c1187) {
        this.f3930 = c1187;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0536
    /* JADX INFO: renamed from: ﾒ */
    public final Object mo334(ArrayList arrayList, C0752 c0752) {
        C1187 c1187 = this.f3930;
        AdData adData = (AdData) arrayList.get(0);
        c1187.getClass();
        return adData.getServerData();
    }
}
