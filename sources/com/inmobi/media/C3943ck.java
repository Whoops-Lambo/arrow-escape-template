package com.inmobi.media;

import defpackage.pv1;

/* JADX INFO: renamed from: com.inmobi.media.ck, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class C3943ck {
    public final int a;
    public final long b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3943ck)) {
            return false;
        }
        C3943ck c3943ck = (C3943ck) obj;
        return this.a == c3943ck.a && this.b == c3943ck.b && Double.compare(1.0d, 1.0d) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(1.0d) + pv1.d(Integer.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        return "RetryPolicy(maxRetries=" + this.a + ", retryInterval=" + this.b + ", delayFactor=1.0)";
    }

    public C3943ck(int i, long j, int i2) {
        this.a = i;
        this.b = j;
    }

    public C3943ck(long j, int i) {
        this.a = i;
        this.b = j;
    }
}
