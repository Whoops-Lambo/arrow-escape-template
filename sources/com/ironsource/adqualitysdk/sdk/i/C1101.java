package com.ironsource.adqualitysdk.sdk.i;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.ῖ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class C1101 extends AbstractRunnableC1096 {

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final /* synthetic */ C1082 f3191;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ C0670 f3192;

    public C1101(C1082 c1082, C0670 c0670) {
        this.f3191 = c1082;
        this.f3192 = c0670;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractRunnableC1096
    /* JADX INFO: renamed from: ﾒ */
    public final void mo344() {
        boolean z;
        C1082 c1082 = this.f3191;
        c1082.f3126 = this.f3192;
        synchronized (c1082) {
            z = c1082.f3122;
        }
        if (z) {
            this.f3192.mo418();
        }
    }
}
