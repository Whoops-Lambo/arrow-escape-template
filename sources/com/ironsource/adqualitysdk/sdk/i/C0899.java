package com.ironsource.adqualitysdk.sdk.i;

import com.fyber.fairbid.mediation.config.MediationConfig;
import java.util.ArrayList;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.ᔮ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public final class C0899 implements InterfaceC0536 {

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C0810 f2400;

    public C0899(C0810 c0810) {
        this.f2400 = c0810;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0536
    /* JADX INFO: renamed from: ﾒ */
    public final Object mo334(ArrayList arrayList, C0752 c0752) {
        C0810 c0810 = this.f2400;
        MediationConfig mediationConfig = (MediationConfig) arrayList.get(0);
        c0810.getClass();
        return mediationConfig.getAdapterConfigurations();
    }
}
