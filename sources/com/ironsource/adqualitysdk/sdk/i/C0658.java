package com.ironsource.adqualitysdk.sdk.i;

import java.util.ArrayList;
import net.pubnative.lite.sdk.vpaid.models.vast.Companion;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.ڊ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class C0658 implements InterfaceC0536 {

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C1010 f1694;

    public C0658(C1010 c1010) {
        this.f1694 = c1010;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0536
    /* JADX INFO: renamed from: ﾒ */
    public final Object mo334(ArrayList arrayList, C0752 c0752) {
        C1010 c1010 = this.f1694;
        Companion companion = (Companion) arrayList.get(0);
        c1010.getClass();
        return companion.getCompanionClickThrough();
    }
}
