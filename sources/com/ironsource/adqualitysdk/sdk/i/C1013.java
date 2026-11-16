package com.ironsource.adqualitysdk.sdk.i;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.ᵒ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class C1013 implements InterfaceC0610 {

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final /* synthetic */ C0915 f2984;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC1209 f2985;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ AbstractC0806 f2986;

    public C1013(C0915 c0915, AbstractC0806 abstractC0806, InterfaceC1209 interfaceC1209) {
        this.f2984 = c0915;
        this.f2986 = abstractC0806;
        this.f2985 = interfaceC1209;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0610
    /* JADX INFO: renamed from: ﾒ */
    public final void mo556() {
        C0994 c0994 = this.f2984.f2420.f2409.f3040;
        synchronized (c0994) {
            c0994.f2833.remove(this);
        }
        this.f2984.f2420.m677(this.f2986, this.f2985);
    }
}
