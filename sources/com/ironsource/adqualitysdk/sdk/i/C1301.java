package com.ironsource.adqualitysdk.sdk.i;

import com.ironsource.mediationsdk.model.Placement;
import java.util.ArrayList;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.Ｌ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class C1301 implements InterfaceC0536 {

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C1187 f3897;

    public C1301(C1187 c1187) {
        this.f3897 = c1187;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0536
    /* JADX INFO: renamed from: ﾒ */
    public final Object mo334(ArrayList arrayList, C0752 c0752) {
        C1187 c1187 = this.f3897;
        Placement placement = (Placement) arrayList.get(0);
        c1187.getClass();
        if (placement != null) {
            return placement.getPlacementName();
        }
        return null;
    }
}
