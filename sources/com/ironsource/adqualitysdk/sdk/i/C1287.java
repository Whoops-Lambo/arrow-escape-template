package com.ironsource.adqualitysdk.sdk.i;

import com.ironsource.adqualitysdk.sdk.StringFog;
import defpackage.nj;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.ﻡ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class C1287 extends AbstractRunnableC1096 {

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final /* synthetic */ C1258 f3881;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ C0950 f3882;

    public C1287(C1258 c1258, C0950 c0950) {
        this.f3881 = c1258;
        this.f3882 = c0950;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractRunnableC1096
    /* JADX INFO: renamed from: ﾒ */
    public final void mo344() {
        int iM505;
        C1258 c1258 = this.f3881;
        C0969 c0969 = c1258.f3807;
        String strQ = nj.q(new StringBuilder(), c1258.f3808, StringFog.decrypt("PQ==\n", "FxH6gDHV7wQ=\n"));
        C0571 c0571 = c0969.f2592;
        c0571.getClass();
        try {
            iM505 = c0571.f1401.m505(strQ);
        } catch (Throwable unused) {
            iM505 = 0;
        }
        AbstractC4631n.m402(new C1313(this, iM505));
    }
}
