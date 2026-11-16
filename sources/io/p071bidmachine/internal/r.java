package io.p071bidmachine.internal;

import defpackage.jc1;
import defpackage.n30;
import defpackage.pv1;
import defpackage.s71;
import io.p071bidmachine.util.version.a;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class r {
    public final a a;
    public final int b;
    public final long c;
    public final long d;
    public final long e;
    public final long f;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return s71.b(this.a, rVar.a) && this.b == rVar.b && this.c == rVar.c && this.d == rVar.d && this.e == rVar.e && this.f == rVar.f;
    }

    public static r a(r rVar, int i, long j, long j2, long j3, int i2) {
        a aVar = rVar.a;
        if ((i2 & 2) != 0) {
            i = rVar.b;
        }
        int i3 = i;
        long j4 = rVar.c;
        if ((i2 & 8) != 0) {
            j = rVar.d;
        }
        long j5 = j;
        long j6 = (i2 & 32) != 0 ? rVar.f : j3;
        aVar.getClass();
        return new r(aVar, i3, j4, j5, j2, j6);
    }

    public final int hashCode() {
        return Long.hashCode(this.f) + pv1.d(pv1.d(pv1.d(jc1.d(this.b, this.a.hashCode() * 31, 31), 31, this.c), 31, this.d), 31, this.e);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VersionMilestone(version=");
        sb.append(this.a);
        sb.append(", sessionCount=");
        sb.append(this.b);
        sb.append(", firstSessionTime=");
        sb.append(this.c);
        sb.append(", lastSessionTime=");
        sb.append(this.d);
        sb.append(", currentSessionDuration=");
        sb.append(this.e);
        sb.append(", lastSessionDuration=");
        return n30.o(sb, this.f, ')');
    }

    public r(a aVar, int i, long j, long j2, long j3, long j4) {
        aVar.getClass();
        this.a = aVar;
        this.b = i;
        this.c = j;
        this.d = j2;
        this.e = j3;
        this.f = j4;
    }
}
