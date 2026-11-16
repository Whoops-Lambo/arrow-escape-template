package com.ironsource.adqualitysdk.sdk.i;

import com.smaato.sdk.core.api.ApiAdResponse;
import java.util.ArrayList;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.ɩ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class C0436 implements InterfaceC0536 {

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C0984 f891;

    public C0436(C0984 c0984) {
        this.f891 = c0984;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0536
    /* JADX INFO: renamed from: ﾒ */
    public final Object mo334(ArrayList arrayList, C0752 c0752) {
        C0984 c0984 = this.f891;
        ApiAdResponse apiAdResponse = (ApiAdResponse) arrayList.get(0);
        c0984.getClass();
        return apiAdResponse.getCreativeId();
    }
}
