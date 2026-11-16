package com.inmobi.media;

import defpackage.h50;
import defpackage.jc1;
import defpackage.pv1;
import defpackage.s71;
import java.util.List;

/* JADX INFO: renamed from: com.inmobi.media.km, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class C4167km {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final List f;
    public final double g;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4167km)) {
            return false;
        }
        C4167km c4167km = (C4167km) obj;
        return this.a == c4167km.a && this.b == c4167km.b && this.c == c4167km.c && this.d == c4167km.d && this.e == c4167km.e && s71.b(this.f, c4167km.f) && Double.compare(this.g, c4167km.g) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.g) + pv1.e(jc1.f(jc1.f(jc1.f(jc1.f(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f);
    }

    public final String toString() {
        boolean z = this.a;
        boolean z2 = this.b;
        boolean z3 = this.c;
        boolean z4 = this.d;
        boolean z5 = this.e;
        List list = this.f;
        double d = this.g;
        StringBuilder sb = new StringBuilder("TelemetryConfigMetaData(isTelemetryEnabled=");
        sb.append(z);
        sb.append(", isImageEnabled=");
        sb.append(z2);
        sb.append(", isGIFEnabled=");
        h50.z(sb, z3, ", isVideoEnabled=", z4, ", isGeneralEventsDisabled=");
        sb.append(z5);
        sb.append(", priorityEventsList=");
        sb.append(list);
        sb.append(", samplingFactor=");
        sb.append(d);
        sb.append(")");
        return sb.toString();
    }

    public C4167km(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, List list, double d) {
        list.getClass();
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
        this.e = z5;
        this.f = list;
        this.g = d;
    }
}
