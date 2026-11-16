package com.inmobi.media;

import defpackage.pv1;
import defpackage.rl3;
import defpackage.s71;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class Jf {
    public final long a;
    public final Map b;
    public final int c;
    public final String d;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Jf)) {
            return false;
        }
        Jf jf = (Jf) obj;
        return this.a == jf.a && s71.b(this.b, jf.b) && this.c == jf.c && s71.b(this.d, jf.d);
    }

    public final int hashCode() {
        int iA = Hj.a(this.c, pv1.g(this.b, Long.hashCode(this.a) * 31, 31), 31);
        String str = this.d;
        return iA + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        long j = this.a;
        Map map = this.b;
        int i = this.c;
        String str = this.d;
        StringBuilder sb = new StringBuilder("NetworkMetaData(timeTaken=");
        sb.append(j);
        sb.append(", headers=");
        sb.append(map);
        rl3.m(i, ", contentLength=", ", contentType=", str, sb);
        sb.append(")");
        return sb.toString();
    }

    public Jf(long j, Map map, int i, String str) {
        map.getClass();
        this.a = j;
        this.b = map;
        this.c = i;
        this.d = str;
    }
}
