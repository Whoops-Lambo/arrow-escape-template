package com.inmobi.media;

import defpackage.s71;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public final class Dg {
    public final String a;
    public final Set b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Dg)) {
            return false;
        }
        Dg dg = (Dg) obj;
        return s71.b(this.a, dg.a) && s71.b(this.b, dg.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ReporterState(appVersion=" + this.a + ", reportedEvents=" + this.b + ")";
    }

    public Dg(String str, Set set) {
        str.getClass();
        set.getClass();
        this.a = str;
        this.b = set;
    }
}
