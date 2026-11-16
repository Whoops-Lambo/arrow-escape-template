package com.vungle.ads.internal;

import com.vungle.ads.internal.protos.Sdk;
import defpackage.rc1;
import defpackage.sr0;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class z extends rc1 implements sr0 {
    public final /* synthetic */ Sdk.SDKMetric.SDKMetricType a;
    public final /* synthetic */ long b;
    public final /* synthetic */ com.vungle.ads.internal.util.s c;
    public final /* synthetic */ Sdk.SDKMetric.Builder d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(Sdk.SDKMetric.SDKMetricType sDKMetricType, long j, com.vungle.ads.internal.util.s sVar, Sdk.SDKMetric.Builder builder) {
        super(0);
        this.a = sDKMetricType;
        this.b = j;
        this.c = sVar;
        this.d = builder;
    }

    @Override // defpackage.sr0
    public final Object invoke() {
        StringBuilder sbA = com.iab.omid.library.vungle.internal.l.a("Logging Metric ");
        sbA.append(this.a);
        sbA.append(" with value ");
        sbA.append(this.b);
        sbA.append(" for placement ");
        com.vungle.ads.internal.util.s sVar = this.c;
        sbA.append(sVar != null ? sVar.a : null);
        sbA.append(" mediation:");
        sbA.append(this.d.getMediationName());
        return sbA.toString();
    }
}
