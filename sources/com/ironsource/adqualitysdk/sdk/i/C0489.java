package com.ironsource.adqualitysdk.sdk.i;

import com.tapjoy.TJSplitWebView;
import java.util.ArrayList;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.ˋ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class C0489 implements InterfaceC0536 {

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C0488 f1117;

    public C0489(C0488 c0488) {
        this.f1117 = c0488;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0536
    /* JADX INFO: renamed from: ﾒ */
    public final Object mo334(ArrayList arrayList, C0752 c0752) {
        C0488 c0488 = this.f1117;
        TJSplitWebView tJSplitWebView = (TJSplitWebView) arrayList.get(0);
        c0488.getClass();
        return tJSplitWebView.getLastUrl();
    }
}
