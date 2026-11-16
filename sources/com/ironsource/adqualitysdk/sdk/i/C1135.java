package com.ironsource.adqualitysdk.sdk.i;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.〱, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class C1135 extends AbstractRunnableC1096 {

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final /* synthetic */ C1082 f3317;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC1265 f3318;

    public C1135(C1082 c1082, InterfaceC1265 interfaceC1265) {
        this.f3317 = c1082;
        this.f3318 = interfaceC1265;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractRunnableC1096
    /* JADX INFO: renamed from: ﾒ */
    public final void mo344() {
        boolean z;
        this.f3317.f3124.add(this.f3318);
        C1082 c1082 = this.f3317;
        synchronized (c1082) {
            z = c1082.f3122;
        }
        if (z) {
            this.f3318.mo418();
        }
    }
}
