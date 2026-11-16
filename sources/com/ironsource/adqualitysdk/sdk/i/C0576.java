package com.ironsource.adqualitysdk.sdk.i;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.ҫ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public final class C0576 extends AbstractRunnableC1096 {

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final /* synthetic */ C0517 f1408;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final /* synthetic */ EnumC0591 f1409;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ String f1410;

    public C0576(C0517 c0517, String str, EnumC0591 enumC0591) {
        this.f1408 = c0517;
        this.f1410 = str;
        this.f1409 = enumC0591;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractRunnableC1096
    /* JADX INFO: renamed from: ﾒ */
    public final void mo344() {
        C0582 c0582M512 = this.f1408.m512(this.f1410);
        if (c0582M512 != null) {
            EnumC0584 enumC0584 = c0582M512.f1430;
            if (enumC0584 == EnumC0584.f1444 || enumC0584 == EnumC0584.f1443 || enumC0584 == EnumC0584.f1445) {
                c0582M512.f1429 = this.f1409;
                c0582M512.m528(EnumC0584.f1440);
                C0517.m510(this.f1408, this.f1410, c0582M512);
            }
        }
    }
}
