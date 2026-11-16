package com.ironsource.adqualitysdk.sdk.i;

import com.qq.e.ads.interstitial2.UnifiedInterstitialAD;
import java.util.ArrayList;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.h, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class C4619h implements InterfaceC0536 {

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C4621i f326;

    public C4619h(C4621i c4621i) {
        this.f326 = c4621i;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0536
    /* JADX INFO: renamed from: ﾒ */
    public final Object mo334(ArrayList arrayList, C0752 c0752) {
        C4621i c4621i = this.f326;
        UnifiedInterstitialAD unifiedInterstitialAD = (UnifiedInterstitialAD) arrayList.get(0);
        c4621i.getClass();
        return unifiedInterstitialAD.getExt();
    }
}
