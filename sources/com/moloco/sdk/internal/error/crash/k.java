package com.moloco.sdk.internal.error.crash;

import defpackage.h50;
import defpackage.jc1;
import defpackage.pv1;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class k {
    public static final k h = new k(20, 10, 5, 40, 250, 20, 864000000);
    public final int a;
    public final int b;
    public final long c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return this.a == kVar.a && this.b == kVar.b && this.c == kVar.c && this.d == kVar.d && this.e == kVar.e && this.f == kVar.f && this.g == kVar.g;
    }

    public final int hashCode() {
        return Integer.hashCode(this.g) + jc1.d(this.f, jc1.d(this.e, jc1.d(this.d, pv1.d(jc1.d(this.b, Integer.hashCode(this.a) * 31, 31), 31, this.c), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CrashReportingTunables(maxStoredReports=");
        sb.append(this.a);
        sb.append(", maxDeliveryAttempts=");
        sb.append(this.b);
        sb.append(", reportTtlMs=");
        sb.append(this.c);
        sb.append(", maxAnrsPerScan=");
        sb.append(this.d);
        sb.append(", maxThreadsPerAnr=");
        sb.append(this.e);
        sb.append(", maxFramesPerStack=");
        sb.append(this.f);
        sb.append(", maxCauseChainDepth=");
        return h50.l(sb, this.g, ')');
    }

    public k(int i, int i2, int i3, int i4, int i5, int i6, long j) {
        this.a = i;
        this.b = i2;
        this.c = j;
        this.d = i3;
        this.e = i4;
        this.f = i5;
        this.g = i6;
    }
}
