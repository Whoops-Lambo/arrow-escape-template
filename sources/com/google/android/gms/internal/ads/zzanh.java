package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzanh {
    public final zzane a;
    public final int b;
    public final long[] c;
    public final int[] d;
    public final int e;
    public final long[] f;
    public final int[] g;
    public final int[] h;
    public final long i;
    public final boolean j;

    public final int a(long j) {
        long[] jArr = this.f;
        if (jArr.length > 0) {
            int i = 0;
            if (this.j) {
                return zzfq.s(jArr, j, false);
            }
            int[] iArr = this.h;
            int length = iArr.length - 1;
            int i2 = -1;
            while (i <= length) {
                int i3 = ((length - i) / 2) + i;
                if (jArr[iArr[i3]] <= j) {
                    i = i3 + 1;
                    i2 = i3;
                } else {
                    length = i3 - 1;
                }
            }
            if (i2 != -1) {
                long j2 = jArr[iArr[i2]];
                if (j2 == j) {
                    while (i2 > 0) {
                        int i4 = i2 - 1;
                        if (jArr[iArr[i4]] != j2) {
                            break;
                        }
                        i2 = i4;
                    }
                }
                return iArr[i2];
            }
        }
        return -1;
    }

    public final int b(long j) {
        long[] jArr = this.f;
        if (jArr.length > 0) {
            if (this.j) {
                String str = zzfq.a;
                int iBinarySearch = Arrays.binarySearch(jArr, j);
                if (iBinarySearch < 0) {
                    return ~iBinarySearch;
                }
                while (true) {
                    int i = iBinarySearch + 1;
                    if (i >= jArr.length || jArr[i] != j) {
                        break;
                    }
                    iBinarySearch = i;
                }
                return iBinarySearch;
            }
            int[] iArr = this.h;
            int length = iArr.length - 1;
            int i2 = 0;
            int i3 = -1;
            while (i2 <= length) {
                int i4 = ((length - i2) / 2) + i2;
                if (jArr[iArr[i4]] >= j) {
                    length = i4 - 1;
                    i3 = i4;
                } else {
                    i2 = i4 + 1;
                }
            }
            if (i3 != -1) {
                long j2 = jArr[iArr[i3]];
                if (j2 == j) {
                    while (i3 < iArr.length - 1) {
                        int i5 = i3 + 1;
                        if (jArr[iArr[i5]] != j2) {
                            break;
                        }
                        i3 = i5;
                    }
                }
                return iArr[i3];
            }
        }
        return -1;
    }

    public zzanh(zzane zzaneVar, long[] jArr, int[] iArr, int i, long[] jArr2, int[] iArr2, int[] iArr3, boolean z, long j, int i2) {
        boolean z2;
        boolean z3;
        int length = iArr.length;
        int length2 = jArr2.length;
        if (length == length2) {
            z2 = true;
        } else {
            z2 = false;
        }
        zzgvz.a(z2);
        if (jArr.length == length2) {
            z3 = true;
        } else {
            z3 = false;
        }
        zzgvz.a(z3);
        int length3 = iArr2.length;
        zzgvz.a(length3 == length2);
        this.a = zzaneVar;
        this.c = jArr;
        this.d = iArr;
        this.e = i;
        this.f = jArr2;
        this.g = iArr2;
        this.h = iArr3;
        this.j = z;
        this.i = j;
        this.b = i2;
        if (length3 > 0) {
            int i3 = length3 - 1;
            iArr2[i3] = iArr2[i3] | 536870912;
        }
    }
}
