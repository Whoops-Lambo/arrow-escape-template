package com.ironsource.adqualitysdk.sdk.i;

import com.smaato.sdk.rewarded.EventListener;
import com.smaato.sdk.rewarded.viewmodel.RewardedAdEventListenerNotifications;
import java.util.ArrayList;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.ı, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class C0376 implements InterfaceC0536 {

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C0984 f733;

    public C0376(C0984 c0984) {
        this.f733 = c0984;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0536
    /* JADX INFO: renamed from: ﾒ */
    public final Object mo334(ArrayList arrayList, C0752 c0752) {
        C0984 c0984 = this.f733;
        RewardedAdEventListenerNotifications rewardedAdEventListenerNotifications = (RewardedAdEventListenerNotifications) arrayList.get(0);
        EventListener eventListener = (EventListener) arrayList.get(1);
        c0984.getClass();
        rewardedAdEventListenerNotifications.setEventListener(eventListener);
        return null;
    }
}
