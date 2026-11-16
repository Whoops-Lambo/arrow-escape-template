package com.inmobi.media;

import defpackage.jc1;
import defpackage.n30;
import defpackage.pv1;
import defpackage.s71;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class Vg {
    public final String a;
    public final String b;
    public final Map c;
    public final boolean d;
    public final String e;
    public final boolean f;
    public final int g;
    public final String h;
    public final long i;
    public final Long j;
    public final Ij k;
    public String l;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Vg)) {
            return false;
        }
        Vg vg = (Vg) obj;
        return s71.b(this.a, vg.a) && s71.b(this.b, vg.b) && s71.b(this.c, vg.c) && this.d == vg.d && s71.b(this.e, vg.e) && this.f == vg.f && this.g == vg.g && s71.b(this.h, vg.h) && this.i == vg.i && s71.b(this.j, vg.j) && s71.b(this.k, vg.k) && s71.b(this.l, vg.l);
    }

    public final int hashCode() {
        int iD = pv1.d(n30.c(Hj.a(this.g, jc1.f(n30.c(jc1.f(pv1.g(this.c, n30.c(this.a.hashCode() * 31, 31, this.b), 31), 31, this.d), 31, this.e), 31, this.f), 31), 31, this.h), 31, this.i);
        Long l = this.j;
        int iHashCode = (iD + (l == null ? 0 : l.hashCode())) * 31;
        Ij ij = this.k;
        return this.l.hashCode() + ((iHashCode + (ij != null ? ij.hashCode() : 0)) * 31);
    }

    public final String toString() {
        String str = this.a;
        String str2 = this.b;
        Map map = this.c;
        boolean z = this.d;
        String str3 = this.e;
        boolean z2 = this.f;
        int i = this.g;
        String str4 = this.h;
        long j = this.i;
        Long l = this.j;
        Ij ij = this.k;
        String str5 = this.l;
        StringBuilder sbR = pv1.r("Ping(url=", str, ", id=", str2, ", headers=");
        sbR.append(map);
        sbR.append(", allowRedirects=");
        sbR.append(z);
        sbR.append(", priority=");
        sbR.append(str3);
        sbR.append(", ackRequired=");
        sbR.append(z2);
        sbR.append(", retryCount=");
        sbR.append(i);
        sbR.append(", ownerId=");
        sbR.append(str4);
        sbR.append(", createdAt=");
        sbR.append(j);
        sbR.append(", retryAfterTimestamp=");
        sbR.append(l);
        sbR.append(", telemetryData=");
        sbR.append(ij);
        sbR.append(", status=");
        sbR.append(str5);
        sbR.append(")");
        return sbR.toString();
    }

    public Vg(String str, String str2, Map map, boolean z, String str3, boolean z2, int i, String str4, long j, Long l, Ij ij, String str5) {
        str.getClass();
        str2.getClass();
        map.getClass();
        str3.getClass();
        str4.getClass();
        str5.getClass();
        this.a = str;
        this.b = str2;
        this.c = map;
        this.d = z;
        this.e = str3;
        this.f = z2;
        this.g = i;
        this.h = str4;
        this.i = j;
        this.j = l;
        this.k = ij;
        this.l = str5;
    }
}
