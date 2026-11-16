package com.ironsource.adqualitysdk.sdk.i;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.Ľ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class C0384 extends AbstractRunnableC1096 {

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ C1325 f751;

    public C0384(C1325 c1325) {
        this.f751 = c1325;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractRunnableC1096
    /* JADX INFO: renamed from: ﾒ */
    public final void mo344() {
        C1325 c1325 = this.f751;
        if (c1325.f3938 == null) {
            c1325.f3938 = new C0422(this);
            c1325.f3940.post(new C0397(this));
        }
    }
}
