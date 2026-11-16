package com.ironsource.adqualitysdk.sdk.i;

import com.hyprmx.android.sdk.api.data.Ad;
import java.util.ArrayList;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.ᓶ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public final class C0869 implements InterfaceC0536 {

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C0745 f2351;

    public C0869(C0745 c0745) {
        this.f2351 = c0745;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0536
    /* JADX INFO: renamed from: ﾒ */
    public final Object mo334(ArrayList arrayList, C0752 c0752) {
        C0745 c0745 = this.f2351;
        Ad ad = (Ad) arrayList.get(0);
        c0745.getClass();
        return ad.type;
    }
}
