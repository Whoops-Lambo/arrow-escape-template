package io.p071bidmachine.internal;

import defpackage.h50;
import defpackage.pv1;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class d {
    public final long a;
    public final long b;
    public final boolean c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.a == dVar.a && this.b == dVar.b && this.c == dVar.c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [int] */
    /* JADX WARN: Type inference failed for: r4v2, types: [int] */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4 */
    public final int hashCode() {
        int iD = pv1.d(Long.hashCode(this.a) * 31, 31, this.b);
        boolean z = this.c;
        ?? r4 = z;
        if (z) {
            r4 = 1;
        }
        return iD + r4;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StartupMetrics(startTime=");
        sb.append(this.a);
        sb.append(", duration=");
        sb.append(this.b);
        sb.append(", isFinished=");
        return h50.m(sb, this.c, ')');
    }

    public d(long j, long j2, boolean z) {
        this.a = j;
        this.b = j2;
        this.c = z;
    }
}
