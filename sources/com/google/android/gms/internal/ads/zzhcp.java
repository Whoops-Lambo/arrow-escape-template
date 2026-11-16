package com.google.android.gms.internal.ads;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class zzhcp implements Serializable {
    public static final zzhcp c = new zzhcp(new long[0], 0);
    public final long[] a;
    public final int b;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzhcp)) {
            return false;
        }
        zzhcp zzhcpVar = (zzhcp) obj;
        int i = zzhcpVar.b;
        int i2 = this.b;
        if (i2 != i) {
            return false;
        }
        for (int i3 = 0; i3 < i2; i3++) {
            if (a(i3) != zzhcpVar.a(i3)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int iHashCode = 1;
        for (int i = 0; i < this.b; i++) {
            iHashCode = (iHashCode * 31) + Long.hashCode(this.a[i]);
        }
        return iHashCode;
    }

    public final long a(int i) {
        zzgvz.i(i, this.b);
        return this.a[i];
    }

    public final String toString() {
        int i = this.b;
        if (i == 0) {
            return "[]";
        }
        StringBuilder sb = new StringBuilder(i * 5);
        sb.append('[');
        long[] jArr = this.a;
        sb.append(jArr[0]);
        for (int i2 = 1; i2 < i; i2++) {
            sb.append(", ");
            sb.append(jArr[i2]);
        }
        sb.append(']');
        return sb.toString();
    }

    public zzhcp(long[] jArr, int i) {
        this.a = jArr;
        this.b = i;
    }
}
