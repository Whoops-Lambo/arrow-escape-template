package com.ironsource.adqualitysdk.sdk.i;

import com.smaato.sdk.core.ad.AdInteractor;
import com.smaato.sdk.core.util.StateMachine;
import java.util.ArrayList;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.ʸ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class C0474 implements InterfaceC0536 {

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C0984 f1033;

    public C0474(C0984 c0984) {
        this.f1033 = c0984;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0536
    /* JADX INFO: renamed from: ﾒ */
    public final Object mo334(ArrayList arrayList, C0752 c0752) {
        C0984 c0984 = this.f1033;
        AdInteractor adInteractor = (AdInteractor) arrayList.get(0);
        StateMachine.Listener listener = (StateMachine.Listener) arrayList.get(1);
        c0984.getClass();
        adInteractor.addStateListener(listener);
        return null;
    }
}
