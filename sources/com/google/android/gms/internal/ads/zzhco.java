package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class zzhco {
    public long[] a;
    public int b;

    public final void a(long j) {
        int i = this.b;
        int i2 = i + 1;
        long[] jArr = this.a;
        int length = jArr.length;
        if (i2 > length) {
            int i3 = length + (length >> 1) + 1;
            if (i3 < i2) {
                int iHighestOneBit = Integer.highestOneBit(i);
                i3 = iHighestOneBit + iHighestOneBit;
            }
            if (i3 < 0) {
                i3 = Integer.MAX_VALUE;
            }
            this.a = Arrays.copyOf(jArr, i3);
        }
        long[] jArr2 = this.a;
        int i4 = this.b;
        jArr2[i4] = j;
        this.b = i4 + 1;
    }
}
