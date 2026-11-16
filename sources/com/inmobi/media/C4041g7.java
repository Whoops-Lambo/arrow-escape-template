package com.inmobi.media;

import defpackage.n30;

/* JADX INFO: renamed from: com.inmobi.media.g7, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class C4041g7 {
    public final float a;
    public final float b;
    public final int c;
    public final int d;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4041g7)) {
            return false;
        }
        C4041g7 c4041g7 = (C4041g7) obj;
        return Float.compare(this.a, c4041g7.a) == 0 && Float.compare(this.b, c4041g7.b) == 0 && this.c == c4041g7.c && this.d == c4041g7.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + Hj.a(this.c, n30.b(this.b, Float.hashCode(this.a) * 31, 31), 31);
    }

    public final String toString() {
        return "ExposureRectangle(x=" + this.a + ", y=" + this.b + ", width=" + this.c + ", height=" + this.d + ")";
    }

    public C4041g7(float f, float f2, int i, int i2) {
        this.a = f;
        this.b = f2;
        this.c = i;
        this.d = i2;
    }
}
