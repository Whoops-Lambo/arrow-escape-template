package io.p071bidmachine.util.file;

import defpackage.n30;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class a {
    public final long a;
    public final long b;
    public final double c;
    public final double d;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.a == aVar.a && this.b == aVar.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StorageSpaceStat(totalBytes=");
        sb.append(this.a);
        sb.append(", availableBytes=");
        return n30.o(sb, this.b, ')');
    }

    public a(long j, long j2) {
        double d;
        this.a = j;
        this.b = j2;
        if (j == 0) {
            d = 0.0d;
        } else {
            d = j2 / j;
        }
        this.c = d;
        this.d = 1.0d - d;
    }
}
