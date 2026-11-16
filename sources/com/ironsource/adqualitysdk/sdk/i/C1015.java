package com.ironsource.adqualitysdk.sdk.i;

import com.smaato.sdk.video.vast.model.VastCompanionScenario;
import java.util.ArrayList;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.ᵔ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class C1015 implements InterfaceC0536 {

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C0984 f2988;

    public C1015(C0984 c0984) {
        this.f2988 = c0984;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0536
    /* JADX INFO: renamed from: ﾒ */
    public final Object mo334(ArrayList arrayList, C0752 c0752) {
        C0984 c0984 = this.f2988;
        VastCompanionScenario vastCompanionScenario = (VastCompanionScenario) arrayList.get(0);
        c0984.getClass();
        return vastCompanionScenario.companionClickThrough;
    }
}
