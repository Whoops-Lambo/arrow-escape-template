package com.inmobi.media;

import defpackage.jc1;

/* JADX INFO: renamed from: com.inmobi.media.uk, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class C4444uk {
    public final int a;
    public final int b;
    public final int c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4444uk)) {
            return false;
        }
        C4444uk c4444uk = (C4444uk) obj;
        return this.a == c4444uk.a && this.b == c4444uk.b && this.c == c4444uk.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + Hj.a(this.b, Integer.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        return defpackage.nj.l(this.c, ")", jc1.t("SemVer(major=", this.a, ", minor=", this.b, ", patch="));
    }

    public C4444uk(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }
}
