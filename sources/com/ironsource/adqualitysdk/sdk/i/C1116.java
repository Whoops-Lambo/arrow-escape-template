package com.ironsource.adqualitysdk.sdk.i;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.ℐ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class C1116 extends AbstractRunnableC1096 {

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final /* synthetic */ C1082 f3237;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ C0657 f3238;

    public C1116(C1082 c1082, C0657 c0657) {
        this.f3237 = c1082;
        this.f3238 = c0657;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractRunnableC1096
    /* JADX INFO: renamed from: ﾒ */
    public final void mo344() {
        boolean z;
        C1082 c1082 = this.f3237;
        synchronized (c1082) {
            z = c1082.f3122;
        }
        if (z) {
            this.f3238.mo418();
        } else {
            this.f3237.f3125.add(this.f3238);
        }
    }
}
