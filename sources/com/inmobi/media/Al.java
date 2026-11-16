package com.inmobi.media;

import defpackage.s71;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class Al extends Dl {
    public final String a;
    public final AbstractC4553yl b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Al)) {
            return false;
        }
        Al al = (Al) obj;
        return s71.b(this.a, al.a) && s71.b(this.b, al.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Content(collectorId=" + this.a + ", payload=" + this.b + ")";
    }

    public Al(String str, AbstractC4553yl abstractC4553yl) {
        str.getClass();
        abstractC4553yl.getClass();
        this.a = str;
        this.b = abstractC4553yl;
    }
}
