package com.inmobi.media;

import defpackage.s71;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class Kf extends Nf {
    public final String a;
    public final Map b;
    public final Bm c;
    public final Map d;
    public final C3943ck e;
    public final boolean f;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Kf)) {
            return false;
        }
        Kf kf = (Kf) obj;
        return s71.b(this.a, kf.a) && s71.b(this.b, kf.b) && s71.b(this.c, kf.c) && s71.b(this.d, kf.d) && s71.b(this.e, kf.e) && this.f == kf.f;
    }

    public Kf(String str, Map map, Bm bm, Map map2, C3943ck c3943ck, boolean z, int i) {
        map = (i & 2) != 0 ? null : map;
        bm = (i & 4) != 0 ? null : bm;
        map2 = (i & 8) != 0 ? null : map2;
        c3943ck = (i & 16) != 0 ? null : c3943ck;
        z = (i & 32) != 0 ? true : z;
        str.getClass();
        this.a = str;
        this.b = map;
        this.c = bm;
        this.d = map2;
        this.e = c3943ck;
        this.f = z;
        String strA = Tf.a(str, map2);
        strA.getClass();
        this.a = strA;
    }

    @Override // com.inmobi.media.Nf
    public final Map a() {
        return this.b;
    }

    @Override // com.inmobi.media.Nf
    public final C3943ck b() {
        return this.e;
    }

    @Override // com.inmobi.media.Nf
    public final String c() {
        return this.a;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        Map map = this.b;
        int iHashCode2 = (iHashCode + (map == null ? 0 : map.hashCode())) * 31;
        Bm bm = this.c;
        int iHashCode3 = (iHashCode2 + (bm == null ? 0 : bm.hashCode())) * 31;
        Map map2 = this.d;
        int iHashCode4 = (iHashCode3 + (map2 == null ? 0 : map2.hashCode())) * 31;
        C3943ck c3943ck = this.e;
        return Boolean.hashCode(this.f) + ((iHashCode4 + (c3943ck != null ? c3943ck.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "GetRequest(url='" + this.a + "', headers=" + this.b + ", queryParams=" + this.d + ", retryPolicy=" + this.e + ", timeouts=" + this.c + ", followRedirects=" + this.f + ")";
    }
}
