package com.vungle.ads.internal;

import com.vungle.ads.internal.protos.Sdk;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public abstract class d1 {
    public Sdk.SDKMetric.SDKMetricType a;
    public String b;

    public final Sdk.SDKMetric.SDKMetricType b() {
        return this.a;
    }

    public d1(Sdk.SDKMetric.SDKMetricType sDKMetricType) {
        sDKMetricType.getClass();
        this.a = sDKMetricType;
    }

    public final void a(Sdk.SDKMetric.SDKMetricType sDKMetricType) {
        sDKMetricType.getClass();
        this.a = sDKMetricType;
    }

    public final String a() {
        return this.b;
    }

    public final void a(String str) {
        this.b = str;
    }
}
