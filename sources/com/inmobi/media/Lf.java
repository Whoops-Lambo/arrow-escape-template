package com.inmobi.media;

import defpackage.s71;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class Lf extends Nf {
    public final String a;
    public final Bm b;

    @Override // com.inmobi.media.Nf
    public final Map a() {
        return null;
    }

    @Override // com.inmobi.media.Nf
    public final C3943ck b() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Lf)) {
            return false;
        }
        Lf lf = (Lf) obj;
        return s71.b(this.a, lf.a) && s71.b(this.b, lf.b);
    }

    @Override // com.inmobi.media.Nf
    public final String c() {
        return this.a;
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + ((this.b.hashCode() + (this.a.hashCode() * 961)) * 961);
    }

    public final String toString() {
        return "HeadRequest(url=" + this.a + ", headers=null, timeouts=" + this.b + ", retryPolicy=null, followRedirects=true)";
    }

    public Lf(String str, Bm bm) {
        str.getClass();
        this.a = str;
        this.b = bm;
    }
}
