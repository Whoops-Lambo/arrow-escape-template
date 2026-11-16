package com.bytedance.sdk.openadsdk.ioy;

import defpackage.d;
import defpackage.pv1;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class ahm {
    private int ahm;
    private int kgy;
    private int rz;
    private int[] uq;

    public boolean equals(Object obj) {
        if (!(obj instanceof ahm)) {
            return false;
        }
        ahm ahmVar = (ahm) obj;
        return this.kgy == ahmVar.kgy && this.ahm == ahmVar.ahm && this.rz == ahmVar.rz && Arrays.equals(this.uq, ahmVar.uq);
    }

    public int hashCode() {
        int i = this.kgy;
        return Arrays.hashCode(this.uq) + ((((pv1.c(i, 31, i, 31) + this.ahm) * 31) + this.rz) * 31);
    }

    public void kgy(int i, int i2, int i3, int i4) {
        if (i2 < 0 || i < 0) {
            d.r("Left and top must be nonnegative");
            return;
        }
        if (i4 <= 0 || i3 <= 0) {
            d.r("Height and width must be at least 1");
            return;
        }
        int i5 = i3 + i;
        int i6 = i4 + i2;
        if (i6 > this.ahm || i5 > this.kgy) {
            d.r("The region must fit inside the matrix");
            return;
        }
        while (i2 < i6) {
            int i7 = this.rz * i2;
            for (int i8 = i; i8 < i5; i8++) {
                int[] iArr = this.uq;
                int i9 = (i8 / 32) + i7;
                iArr[i9] = iArr[i9] | (1 << (i8 & 31));
            }
            i2++;
        }
    }

    public ahm(int i, int i2) {
        if (i > 0 && i2 > 0) {
            this.kgy = i;
            this.ahm = i2;
            int i3 = (i + 31) / 32;
            this.rz = i3;
            this.uq = new int[i3 * i2];
            return;
        }
        d.r("Both dimensions must be greater than 0");
        throw null;
    }

    public boolean kgy(int i, int i2) {
        return ((this.uq[(i / 32) + (i2 * this.rz)] >>> (i & 31)) & 1) != 0;
    }
}
