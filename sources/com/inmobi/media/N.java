package com.inmobi.media;

import android.graphics.RectF;
import defpackage.s71;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class N {
    public final RectF a;
    public final ArrayList b;
    public final int c;
    public final int d;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof N)) {
            return false;
        }
        N n = (N) obj;
        return s71.b(this.a, n.a) && s71.b(this.b, n.b) && this.c == n.c && this.d == n.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + Hj.a(this.c, (this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31);
    }

    public final String toString() {
        return "ExposureInputData(visibleRect=" + this.a + ", obstructions=" + this.b + ", screenWidth=" + this.c + ", screenHeight=" + this.d + ")";
    }

    public N(RectF rectF, ArrayList arrayList, int i, int i2) {
        rectF.getClass();
        arrayList.getClass();
        this.a = rectF;
        this.b = arrayList;
        this.c = i;
        this.d = i2;
    }
}
