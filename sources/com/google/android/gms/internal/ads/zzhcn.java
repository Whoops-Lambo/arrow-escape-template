package com.google.android.gms.internal.ads;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class zzhcn implements Serializable {
    public static final zzhcn c = new zzhcn(new int[0], 0);
    public final int[] a;
    public final int b;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzhcn)) {
            return false;
        }
        zzhcn zzhcnVar = (zzhcn) obj;
        int i = zzhcnVar.b;
        int i2 = this.b;
        if (i2 != i) {
            return false;
        }
        for (int i3 = 0; i3 < i2; i3++) {
            if (a(i3) != zzhcnVar.a(i3)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int iHashCode = 1;
        for (int i = 0; i < this.b; i++) {
            iHashCode = (iHashCode * 31) + Integer.hashCode(this.a[i]);
        }
        return iHashCode;
    }

    public final int a(int i) {
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
        int[] iArr = this.a;
        sb.append(iArr[0]);
        for (int i2 = 1; i2 < i; i2++) {
            sb.append(", ");
            sb.append(iArr[i2]);
        }
        sb.append(']');
        return sb.toString();
    }

    public zzhcn(int[] iArr, int i) {
        this.a = iArr;
        this.b = i;
    }
}
