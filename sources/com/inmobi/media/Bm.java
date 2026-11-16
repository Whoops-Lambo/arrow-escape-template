package com.inmobi.media;

import defpackage.h50;
import defpackage.pv1;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class Bm {
    public final long a;
    public final long b;
    public final long c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Bm)) {
            return false;
        }
        Bm bm = (Bm) obj;
        return this.a == bm.a && this.b == bm.b && this.c == bm.c;
    }

    public final int hashCode() {
        return Long.hashCode(this.c) + pv1.d(Long.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        long j = this.a;
        long j2 = this.b;
        long j3 = this.c;
        StringBuilder sbO = h50.o(j, "TimeoutConfig(connectTimeoutInSec=", ", readTimeoutInSec=");
        sbO.append(j2);
        sbO.append(", callTimeoutInSec=");
        sbO.append(j3);
        sbO.append(")");
        return sbO.toString();
    }

    public Bm(long j, long j2, long j3) {
        this.a = j;
        this.b = j2;
        this.c = j3;
    }
}
