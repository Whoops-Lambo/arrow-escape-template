package com.ironsource.adqualitysdk.sdk.i;

import io.presage.interstitial.PresageInterstitial;
import io.presage.interstitial.PresageInterstitialCallback;
import java.util.ArrayList;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.ʅ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class C0450 implements InterfaceC0536 {

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C0416 f906;

    public C0450(C0416 c0416) {
        this.f906 = c0416;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0536
    /* JADX INFO: renamed from: ﾒ */
    public final Object mo334(ArrayList arrayList, C0752 c0752) {
        C0416 c0416 = this.f906;
        PresageInterstitial presageInterstitial = (PresageInterstitial) arrayList.get(0);
        PresageInterstitialCallback presageInterstitialCallback = (PresageInterstitialCallback) arrayList.get(1);
        c0416.getClass();
        presageInterstitial.setInterstitialCallback(presageInterstitialCallback);
        return null;
    }
}
