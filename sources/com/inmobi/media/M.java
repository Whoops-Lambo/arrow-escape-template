package com.inmobi.media;

import android.graphics.RectF;
import defpackage.s71;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class M {
    public final RectF a;
    public final RectF b;
    public final RectF c;
    public final RectF d;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof M)) {
            return false;
        }
        M m = (M) obj;
        return s71.b(this.a, m.a) && s71.b(this.b, m.b) && s71.b(this.c, m.c) && s71.b(this.d, m.d);
    }

    public final int hashCode() {
        RectF rectF = this.a;
        int iHashCode = (rectF == null ? 0 : rectF.hashCode()) * 31;
        RectF rectF2 = this.b;
        int iHashCode2 = (iHashCode + (rectF2 == null ? 0 : rectF2.hashCode())) * 31;
        RectF rectF3 = this.c;
        int iHashCode3 = (iHashCode2 + (rectF3 == null ? 0 : rectF3.hashCode())) * 31;
        RectF rectF4 = this.d;
        return iHashCode3 + (rectF4 != null ? rectF4.hashCode() : 0);
    }

    public final String toString() {
        return "CurvedEdges(topLeft=" + this.a + ", topRight=" + this.b + ", bottomLeft=" + this.c + ", bottomRight=" + this.d + ")";
    }

    public M(RectF rectF, RectF rectF2, RectF rectF3, RectF rectF4) {
        this.a = rectF;
        this.b = rectF2;
        this.c = rectF3;
        this.d = rectF4;
    }
}
