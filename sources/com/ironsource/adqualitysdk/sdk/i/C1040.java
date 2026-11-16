package com.ironsource.adqualitysdk.sdk.i;

import com.facebook.ads.internal.adapters.AdAdapter;
import java.util.ArrayList;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.ḭ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class C1040 implements InterfaceC0536 {

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C0971 f3021;

    public C1040(C0971 c0971) {
        this.f3021 = c0971;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0536
    /* JADX INFO: renamed from: ﾒ */
    public final Object mo334(ArrayList arrayList, C0752 c0752) {
        C0971 c0971 = this.f3021;
        AdAdapter adAdapter = (AdAdapter) arrayList.get(0);
        c0971.getClass();
        return adAdapter.getPlacementType();
    }
}
