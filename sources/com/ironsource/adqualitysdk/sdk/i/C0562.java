package com.ironsource.adqualitysdk.sdk.i;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.ь, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
public final class C0562 extends AbstractRunnableC1096 {

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final /* synthetic */ C0517 f1365;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final /* synthetic */ EnumC0584 f1366;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ String f1367;

    public C0562(C0517 c0517, String str, EnumC0584 enumC0584) {
        this.f1365 = c0517;
        this.f1367 = str;
        this.f1366 = enumC0584;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractRunnableC1096
    /* JADX INFO: renamed from: ﾒ */
    public final void mo344() {
        C0582 c0582M512 = this.f1365.m512(this.f1367);
        if (c0582M512 != null) {
            c0582M512.m528(this.f1366);
            C0517.m510(this.f1365, this.f1367, c0582M512);
        }
    }
}
