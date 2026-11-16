package com.inmobi.media;

import defpackage.s71;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class Ya extends AbstractC3878ab {
    public final Vg a;
    public final Vg b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Ya)) {
            return false;
        }
        Ya ya = (Ya) obj;
        return s71.b(this.a, ya.a) && s71.b(this.b, ya.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "InsertedWithEviction(ping=" + this.a + ", evicted=" + this.b + ")";
    }

    public Ya(Vg vg, Vg vg2) {
        vg.getClass();
        vg2.getClass();
        this.a = vg;
        this.b = vg2;
    }
}
