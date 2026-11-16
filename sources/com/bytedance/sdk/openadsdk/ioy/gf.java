package com.bytedance.sdk.openadsdk.ioy;

import defpackage.e32;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class gf {
    public static final gf kgy = new gf(285, 256, 0);
    private final int[] ahm;
    private final int ct;
    private final int noq;
    private final int[] rz;
    private final ra uq;

    public int ahm(int i) {
        if (i != 0) {
            return this.ahm[(this.ct - this.rz[i]) - 1];
        }
        throw new ArithmeticException();
    }

    public ra kgy(int i, int i2) {
        if (i < 0) {
            e32.a();
            return null;
        }
        if (i2 == 0) {
            return this.uq;
        }
        int[] iArr = new int[i + 1];
        iArr[0] = i2;
        return new ra(this, iArr);
    }

    public int rz(int i, int i2) {
        if (i == 0 || i2 == 0) {
            return 0;
        }
        int[] iArr = this.ahm;
        int[] iArr2 = this.rz;
        return iArr[(iArr2[i] + iArr2[i2]) % (this.ct - 1)];
    }

    public gf(int i, int i2, int i3) {
        this.ct = i2;
        this.noq = i3;
        this.ahm = new int[i2];
        this.rz = new int[i2];
        int i4 = 1;
        for (int i5 = 0; i5 < i2; i5++) {
            this.ahm[i5] = i4;
            i4 *= 2;
            if (i4 >= i2) {
                i4 = (i4 ^ i) & (i2 - 1);
            }
        }
        for (int i6 = 0; i6 < i2 - 1; i6++) {
            this.rz[this.ahm[i6]] = i6;
        }
        this.uq = new ra(this, new int[]{0});
    }

    public static int ahm(int i, int i2) {
        return i ^ i2;
    }

    public int ahm() {
        return this.noq;
    }

    public ra kgy() {
        return this.uq;
    }

    public int kgy(int i) {
        return this.ahm[i];
    }
}
