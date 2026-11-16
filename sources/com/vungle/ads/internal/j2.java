package com.vungle.ads.internal;

import com.vungle.ads.internal.protos.Sdk;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public class j2 extends d1 {
    public Long c;
    public Long d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j2(Sdk.SDKMetric.SDKMetricType sDKMetricType) {
        super(sDKMetricType);
        sDKMetricType.getClass();
    }

    public final long c() {
        long jLongValue;
        long jNanoTime = System.nanoTime();
        Long l = this.d;
        if (l != null) {
            jLongValue = l.longValue();
        } else {
            jLongValue = jNanoTime;
        }
        Long l2 = this.c;
        if (l2 != null) {
            jNanoTime = l2.longValue();
        }
        return (jLongValue - jNanoTime) / 1000000;
    }

    public void d() {
        this.d = Long.valueOf(System.nanoTime());
    }

    public void e() {
        this.c = Long.valueOf(System.nanoTime());
    }
}
