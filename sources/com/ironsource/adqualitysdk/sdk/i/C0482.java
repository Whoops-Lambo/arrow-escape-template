package com.ironsource.adqualitysdk.sdk.i;

import com.smaato.sdk.banner.widget.BannerView;
import java.util.ArrayList;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.ˀ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class C0482 implements InterfaceC0536 {

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C0984 f1077;

    public C0482(C0984 c0984) {
        this.f1077 = c0984;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0536
    /* JADX INFO: renamed from: ﾒ */
    public final Object mo334(ArrayList arrayList, C0752 c0752) {
        C0984 c0984 = this.f1077;
        BannerView bannerView = (BannerView) arrayList.get(0);
        BannerView.EventListener eventListener = (BannerView.EventListener) arrayList.get(1);
        c0984.getClass();
        bannerView.setEventListener(eventListener);
        return null;
    }
}
