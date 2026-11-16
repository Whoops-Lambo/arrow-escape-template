package com.ironsource.adqualitysdk.sdk.i;

import com.smaato.sdk.ng.models.Ad;
import java.util.ArrayList;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.ᑊ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class C0805 implements InterfaceC0536 {

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C0984 f2109;

    public C0805(C0984 c0984) {
        this.f2109 = c0984;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0536
    /* JADX INFO: renamed from: ﾒ */
    public final Object mo334(ArrayList arrayList, C0752 c0752) {
        C0984 c0984 = this.f2109;
        Ad ad = (Ad) arrayList.get(0);
        c0984.getClass();
        return ad.getVast();
    }
}
