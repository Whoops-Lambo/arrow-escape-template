package com.google.android.gms.internal.ads;

import defpackage.h50;
import java.util.ArrayDeque;
import java.util.Optional;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class zzawx {
    public final ArrayDeque a = new ArrayDeque();

    public final void a(long j, long j2, long j3) {
        int[] iArr = {1857962504, 67802545, 822753858, 1178641841, 1658857550, -1514359837, 393474692, 1520223205, 452867621};
        int i = iArr[0];
        int i2 = iArr[1];
        int i3 = iArr[2];
        int i4 = iArr[3];
        int i5 = iArr[4];
        int i6 = iArr[5];
        int i7 = iArr[6];
        int i8 = iArr[7];
        zzawu zzawuVar = new zzawu(j, j2, j3);
        ArrayDeque arrayDeque = this.a;
        if (arrayDeque.size() >= (h50.B((i2 & (~i)) | i3, (i & i4) | i5, i6, i7) ^ (i8 % 452867621))) {
            throw new zzawv();
        }
        arrayDeque.push(zzawuVar);
    }

    public final zzawu b() {
        return (zzawu) Optional.ofNullable((zzawu) this.a.peek()).orElseThrow(zzawt.b);
    }
}
