package com.ironsource.adqualitysdk.sdk.i;

import io.presage.interstitial.optinvideo.PresageOptinVideo;
import io.presage.interstitial.optinvideo.PresageOptinVideoCallback;
import java.util.ArrayList;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.Ȋ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class C0420 implements InterfaceC0536 {

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C0416 f872;

    public C0420(C0416 c0416) {
        this.f872 = c0416;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0536
    /* JADX INFO: renamed from: ﾒ */
    public final Object mo334(ArrayList arrayList, C0752 c0752) {
        C0416 c0416 = this.f872;
        PresageOptinVideo presageOptinVideo = (PresageOptinVideo) arrayList.get(0);
        PresageOptinVideoCallback presageOptinVideoCallback = (PresageOptinVideoCallback) arrayList.get(1);
        c0416.getClass();
        presageOptinVideo.setOptinVideoCallback(presageOptinVideoCallback);
        return null;
    }
}
