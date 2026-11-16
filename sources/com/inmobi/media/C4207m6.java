package com.inmobi.media;

import defpackage.jc1;

/* JADX INFO: renamed from: com.inmobi.media.m6, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class C4207m6 {
    public final int a;
    public final int b;
    public final float c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4207m6)) {
            return false;
        }
        C4207m6 c4207m6 = (C4207m6) obj;
        return this.a == c4207m6.a && this.b == c4207m6.b && Float.compare(this.c, c4207m6.c) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.c) + Hj.a(this.b, Integer.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        int i = this.a;
        int i2 = this.b;
        float f = this.c;
        StringBuilder sbT = jc1.t("DisplayProperties(width=", i, ", height=", i2, ", density=");
        sbT.append(f);
        sbT.append(")");
        return sbT.toString();
    }

    public C4207m6(int i, int i2, float f) {
        this.a = i;
        this.b = i2;
        this.c = f;
    }
}
