package com.inmobi.media;

import defpackage.s71;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class Mf extends Nf {
    public final String a;
    public final Map b;
    public final Bm c;
    public final Wj d;
    public final C3943ck e;
    public final boolean f;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Mf)) {
            return false;
        }
        Mf mf = (Mf) obj;
        return s71.b(this.a, mf.a) && s71.b(this.b, mf.b) && s71.b(this.c, mf.c) && s71.b(this.d, mf.d) && s71.b(this.e, mf.e) && this.f == mf.f;
    }

    public Mf(String str, Map map, Bm bm, Wj wj, C3943ck c3943ck, int i) {
        map = (i & 2) != 0 ? null : map;
        bm = (i & 4) != 0 ? null : bm;
        c3943ck = (i & 16) != 0 ? null : c3943ck;
        str.getClass();
        this.a = str;
        this.b = map;
        this.c = bm;
        this.d = wj;
        this.e = c3943ck;
        this.f = true;
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
        Wj wj = this.d;
        int iHashCode4 = (iHashCode3 + (wj == null ? 0 : wj.hashCode())) * 31;
        C3943ck c3943ck = this.e;
        return Boolean.hashCode(this.f) + ((iHashCode4 + (c3943ck != null ? c3943ck.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "PostRequest(url='" + this.a + "', headers=" + this.b + ", body=" + this.d + ", retryPolicy=" + this.e + ", timeouts=" + this.c + ", followRedirects=" + this.f + ")";
    }
}
