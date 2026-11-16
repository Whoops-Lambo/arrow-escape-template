package com.ironsource.adqualitysdk.sdk.i;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.ŧ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class C0397 extends AbstractRunnableC1096 {

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ C0384 f830;

    public C0397(C0384 c0384) {
        this.f830 = c0384;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractRunnableC1096
    /* JADX INFO: renamed from: ﾒ */
    public final void mo344() {
        AbstractC1227 abstractC1227M885 = AbstractC1227.m885();
        C0422 c0422 = this.f830.f751.f3938;
        synchronized (abstractC1227M885) {
            abstractC1227M885.f3730.add(c0422);
        }
        AbstractC4631n.m402(new C0410(this));
    }
}
