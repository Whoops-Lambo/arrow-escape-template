package com.inmobi.media;

import defpackage.jc1;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class Mo {
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Mo)) {
            return false;
        }
        Mo mo = (Mo) obj;
        return this.a == mo.a && this.b == mo.b && this.c == mo.c && this.d == mo.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + Hj.a(this.c, Hj.a(this.b, Integer.hashCode(this.a) * 31, 31), 31);
    }

    public final String toString() {
        int i = this.a;
        int i2 = this.b;
        int i3 = this.c;
        int i4 = this.d;
        StringBuilder sbT = jc1.t("VideoLayoutRect(x=", i, ", y=", i2, ", width=");
        sbT.append(i3);
        sbT.append(", height=");
        sbT.append(i4);
        sbT.append(")");
        return sbT.toString();
    }

    public Mo(int i, int i2, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    public /* synthetic */ Mo() {
        this(0, 0, 0, 0);
    }
}
