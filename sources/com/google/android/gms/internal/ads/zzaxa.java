package com.google.android.gms.internal.ads;

import defpackage.h50;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class zzaxa {
    public final ArrayList a = new ArrayList();
    public int b = 0;

    public final int a(long j) throws zzawy {
        long j2;
        int[] iArr = {2001100545, 2130723407, 140753313, -149863858, -2003236720, 202391198, 23353437, 1141616124, 84353895};
        int i = iArr[0];
        int i2 = iArr[1];
        int i3 = iArr[2];
        int i4 = iArr[3];
        int i5 = iArr[4];
        int i6 = iArr[5];
        int i7 = iArr[6];
        int i8 = iArr[7];
        int iB = h50.B((i2 & (~i)) | i3, (i & i4) | i5, i6, i7);
        int i9 = i8 % 84353895;
        long[] jArr = {269441500, 1994078854, 158128940, -158130045, -1992289935, 556430036, 8936987, 2147469841, 438792350};
        long j3 = jArr[0];
        long j4 = jArr[1];
        long j5 = jArr[2];
        long j6 = jArr[3];
        long j7 = jArr[4];
        long j8 = jArr[5];
        long j9 = jArr[6];
        long j10 = jArr[7];
        long j11 = (((((~j3) & j4) | j5) + ((j3 & j6) | j7)) - j8) + j9;
        long j12 = j10 % 438792350;
        if (j >= 0) {
            j2 = ((long) (this.b + (iB ^ i9))) - j;
        } else {
            j2 = (j11 ^ j12) + (-j);
        }
        if (j2 < 0 || j2 >= this.b) {
            throw new zzawy();
        }
        return (int) j2;
    }

    public final void b(zzaxj zzaxjVar) {
        int[] iArr = {524133589, 740889625, 408955079, 621796408, 24562149, 1207357565, 297783268, 1066077375, 937558955};
        int i = iArr[0];
        int i2 = iArr[1];
        int i3 = iArr[2];
        int i4 = iArr[3];
        int i5 = iArr[4];
        int i6 = iArr[5];
        int i7 = iArr[6];
        int i8 = iArr[7];
        int iB = h50.B((i2 & (~i)) | i3, (i & i4) | i5, i6, i7);
        int i9 = this.b;
        if (i9 >= ((i8 % 937558955) ^ iB)) {
            throw new zzawz();
        }
        ArrayList arrayList = this.a;
        if (i9 == arrayList.size()) {
            arrayList.add(zzaxjVar);
        } else {
            arrayList.set(this.b, zzaxjVar);
        }
        this.b++;
    }

    public final zzaxj c() {
        int[] iArr = {91119157, 1459677288, 586253619, -183145911, -1567288443, 919325394, 146725508, 787086305, 459541652};
        int i = iArr[0];
        int i2 = iArr[1];
        int i3 = iArr[2];
        int i4 = iArr[3];
        int i5 = iArr[4];
        int i6 = iArr[5];
        int i7 = iArr[6];
        int i8 = iArr[7];
        int iB = h50.B((i2 & (~i)) | i3, (i & i4) | i5, i6, i7);
        int i9 = i8 % 459541652;
        int i10 = this.b;
        if (i10 <= 0) {
            throw new zzawy();
        }
        int i11 = i9 ^ iB;
        ArrayList arrayList = this.a;
        zzaxj zzaxjVar = (zzaxj) arrayList.get(i10 + i11);
        arrayList.set(this.b + i11, null);
        this.b += i11;
        return zzaxjVar;
    }

    public final zzaxj d(long j) {
        return (zzaxj) this.a.get(a(j));
    }
}
