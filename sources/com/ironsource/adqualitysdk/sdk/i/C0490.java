package com.ironsource.adqualitysdk.sdk.i;

import java.util.ArrayList;
import tv.superawesome.lib.samodelspace.saad.SAAd;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.ˌ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class C0490 implements InterfaceC0536 {

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C0481 f1118;

    public C0490(C0481 c0481) {
        this.f1118 = c0481;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0536
    /* JADX INFO: renamed from: ﾒ */
    public final Object mo334(ArrayList arrayList, C0752 c0752) {
        C0481 c0481 = this.f1118;
        SAAd sAAd = (SAAd) arrayList.get(0);
        c0481.getClass();
        return sAAd.writeToJson();
    }
}
