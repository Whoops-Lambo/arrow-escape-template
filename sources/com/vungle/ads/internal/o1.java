package com.vungle.ads.internal;

import com.vungle.ads.internal.protos.Sdk;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class o1 extends j2 {
    public boolean e;

    public final void g() {
        this.e = true;
    }

    @Override // com.vungle.ads.internal.j2
    public final void d() {
        if (this.d == null) {
            super.d();
        }
    }

    @Override // com.vungle.ads.internal.j2
    public final void e() {
        if (this.c == null) {
            super.e();
        }
    }

    public final boolean f() {
        return this.e;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o1(Sdk.SDKMetric.SDKMetricType sDKMetricType) {
        super(sDKMetricType);
        sDKMetricType.getClass();
    }
}
