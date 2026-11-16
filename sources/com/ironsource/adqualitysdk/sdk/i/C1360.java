package com.ironsource.adqualitysdk.sdk.i;

import com.smaato.sdk.interstitial.EventListener;
import com.smaato.sdk.interstitial.viewmodel.EventListenerNotificationsInterface;
import java.util.ArrayList;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.ﾟ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class C1360 implements InterfaceC0536 {

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C0984 f4058;

    public C1360(C0984 c0984) {
        this.f4058 = c0984;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0536
    /* JADX INFO: renamed from: ﾒ */
    public final Object mo334(ArrayList arrayList, C0752 c0752) {
        C0984 c0984 = this.f4058;
        EventListenerNotificationsInterface eventListenerNotificationsInterface = (EventListenerNotificationsInterface) arrayList.get(0);
        EventListener eventListener = (EventListener) arrayList.get(1);
        c0984.getClass();
        eventListenerNotificationsInterface.setEventListener(eventListener);
        return null;
    }
}
