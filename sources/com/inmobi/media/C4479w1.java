package com.inmobi.media;

import defpackage.jc1;

/* JADX INFO: renamed from: com.inmobi.media.w1, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class C4479w1 {
    public final int a;
    public final int b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4479w1)) {
            return false;
        }
        C4479w1 c4479w1 = (C4479w1) obj;
        return this.a == c4479w1.a && this.b == c4479w1.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return jc1.n("BannerSize(widthDp=", this.a, ", heightDp=", this.b, ")");
    }

    public C4479w1(int i, int i2) {
        this.a = i;
        this.b = i2;
    }
}
