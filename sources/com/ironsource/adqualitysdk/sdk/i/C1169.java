package com.ironsource.adqualitysdk.sdk.i;

import com.chartboost.sdk.Chartboost;
import java.util.ArrayList;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.忄, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class C1169 implements InterfaceC0536 {

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C1055 f3442;

    public C1169(C1055 c1055) {
        this.f3442 = c1055;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0536
    /* JADX INFO: renamed from: ﾒ */
    public final Object mo334(ArrayList arrayList, C0752 c0752) {
        C1055 c1055 = this.f3442;
        c1055.getClass();
        Chartboost.setDelegate(new C1074(c1055, Chartboost.getDelegate(), c0752));
        return null;
    }
}
