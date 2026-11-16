package com.ironsource.adqualitysdk.sdk.i;

import com.yandex.mobile.ads.common.ImpressionData;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class t1 implements InterfaceC0536 {

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C1 f465;

    public t1(C1 c1) {
        this.f465 = c1;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0536
    /* JADX INFO: renamed from: ﾒ */
    public final Object mo334(ArrayList arrayList, C0752 c0752) {
        C1 c1 = this.f465;
        ImpressionData impressionData = (ImpressionData) arrayList.get(0);
        c1.getClass();
        return impressionData.getRawData();
    }
}
