package io.p071bidmachine.rendering.model;

import android.graphics.PointF;
import defpackage.s71;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class p {
    public static final PointF d = new PointF(0.5f, 0.5f);
    public static final PointF e = new PointF(0.1f, 0.1f);
    public final PointF a;
    public final PointF b;
    public final Long c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return s71.b(this.a, pVar.a) && s71.b(this.b, pVar.b) && s71.b(this.c, pVar.c);
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        Long l = this.c;
        return iHashCode + (l == null ? 0 : l.hashCode());
    }

    public final String toString() {
        return "ClickArea(center=" + this.a + ", spread=" + this.b + ", seed=" + this.c + ')';
    }

    public p(PointF pointF, PointF pointF2, Long l) {
        pointF.getClass();
        pointF2.getClass();
        this.a = pointF;
        this.b = pointF2;
        this.c = l;
    }

    public /* synthetic */ p() {
        this(d, e, null);
    }
}
