package com.ironsource.adqualitysdk.sdk.i;

import com.hyprmx.android.sdk.model.PreloadedVastData;
import java.util.ArrayList;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.ใ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class C0756 implements InterfaceC0536 {

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C0745 f2002;

    public C0756(C0745 c0745) {
        this.f2002 = c0745;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0536
    /* JADX INFO: renamed from: ﾒ */
    public final Object mo334(ArrayList arrayList, C0752 c0752) {
        C0745 c0745 = this.f2002;
        PreloadedVastData preloadedVastData = (PreloadedVastData) arrayList.get(0);
        c0745.getClass();
        return preloadedVastData.getParameters();
    }
}
