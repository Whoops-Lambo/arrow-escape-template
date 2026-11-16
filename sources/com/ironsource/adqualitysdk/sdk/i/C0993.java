package com.ironsource.adqualitysdk.sdk.i;

import java.util.ArrayList;
import net.pubnative.lite.sdk.vpaid.VideoAdListener;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.ᴾ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class C0993 implements InterfaceC0536 {

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C1010 f2831;

    public C0993(C1010 c1010) {
        this.f2831 = c1010;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0536
    /* JADX INFO: renamed from: ﾒ */
    public final Object mo334(ArrayList arrayList, C0752 c0752) {
        C1010 c1010 = this.f2831;
        VideoAdListener videoAdListener = (VideoAdListener) arrayList.get(0);
        c1010.getClass();
        return new C1131(c1010, videoAdListener, c0752);
    }
}
