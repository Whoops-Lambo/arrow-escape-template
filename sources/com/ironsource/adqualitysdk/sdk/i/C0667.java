package com.ironsource.adqualitysdk.sdk.i;

import io.p071bidmachine.AdRequestParameters;
import java.util.ArrayList;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.ړ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class C0667 implements InterfaceC0536 {

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C0520 f1716;

    public C0667(C0520 c0520) {
        this.f1716 = c0520;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0536
    /* JADX INFO: renamed from: ﾒ */
    public final Object mo334(ArrayList arrayList, C0752 c0752) {
        C0520 c0520 = this.f1716;
        AdRequestParameters adRequestParameters = (AdRequestParameters) arrayList.get(0);
        c0520.getClass();
        return adRequestParameters.getPlacementId();
    }
}
