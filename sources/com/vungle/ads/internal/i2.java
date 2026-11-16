package com.vungle.ads.internal;

import com.vungle.ads.internal.protos.Sdk;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class i2 extends d1 {
    public Long c;

    public final void a(Long l) {
        this.c = l;
    }

    public final long c() {
        Long l = this.c;
        if (l != null) {
            return l.longValue();
        }
        return 0L;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i2(Sdk.SDKMetric.SDKMetricType sDKMetricType) {
        super(sDKMetricType);
        sDKMetricType.getClass();
    }
}
