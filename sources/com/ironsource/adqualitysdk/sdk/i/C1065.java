package com.ironsource.adqualitysdk.sdk.i;

import com.ironsource.adqualitysdk.sdk.StringFog;
import com.safedk.android.internal.partials.IronSourceNetworkBridge;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.ẏ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes10.dex */
public final class C1065 extends AbstractRunnableC1096 {

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ C0949 f3086;

    public C1065(C0949 c0949) {
        this.f3086 = c0949;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractRunnableC1096
    /* JADX INFO: renamed from: ﾒ */
    public final void mo344() {
        C0630 c0630 = this.f3086.f2553;
        String strDecrypt = StringFog.decrypt("QiqLZk3ChehFLrVnXA==\n", "NlrUFSix9rc=\n");
        c0630.getClass();
        AbstractC4631n.m402(new C0645(c0630, strDecrypt));
        this.f3086.m728(StringFog.decrypt("n9lrRFyHYjKY3VVFTQ==\n", "66k0Nzn0EW0=\n"), IronSourceNetworkBridge.jsonObjectInit());
    }
}
