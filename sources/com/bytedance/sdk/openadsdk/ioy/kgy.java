package com.bytedance.sdk.openadsdk.ioy;

import defpackage.d;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class kgy {
    private static final int[] kgy = new int[0];
    private int rz = 0;
    private int[] ahm = kgy;

    private void ahm(int i) {
        if (i > this.ahm.length * 32) {
            int[] iArrRz = rz((int) Math.ceil(i / 0.75f));
            int[] iArr = this.ahm;
            System.arraycopy(iArr, 0, iArrRz, 0, iArr.length);
            this.ahm = iArrRz;
        }
    }

    private static int[] rz(int i) {
        return new int[(i + 31) / 32];
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof kgy)) {
            return false;
        }
        kgy kgyVar = (kgy) obj;
        return this.rz == kgyVar.rz && Arrays.equals(this.ahm, kgyVar.ahm);
    }

    public int hashCode() {
        return Arrays.hashCode(this.ahm) + (this.rz * 31);
    }

    public void kgy(int i, int i2) {
        if (i2 < 0 || i2 > 32) {
            d.r("Num bits must be between 0 and 32");
            return;
        }
        int i3 = this.rz;
        ahm(i3 + i2);
        for (int i4 = i2 - 1; i4 >= 0; i4--) {
            if (((1 << i4) & i) != 0) {
                int[] iArr = this.ahm;
                int i5 = i3 / 32;
                iArr[i5] = iArr[i5] | (1 << (i3 & 31));
            }
            i3++;
        }
        this.rz = i3;
    }

    public int ahm() {
        return (this.rz + 7) / 8;
    }

    public void ahm(kgy kgyVar) {
        if (this.rz != kgyVar.rz) {
            d.r("Sizes don't match");
            return;
        }
        int i = 0;
        while (true) {
            int[] iArr = this.ahm;
            if (i >= iArr.length) {
                return;
            }
            iArr[i] = iArr[i] ^ kgyVar.ahm[i];
            i++;
        }
    }

    public boolean kgy(int i) {
        return (this.ahm[i / 32] & (1 << (i & 31))) != 0;
    }

    public void kgy(boolean z) {
        ahm(this.rz + 1);
        if (z) {
            int[] iArr = this.ahm;
            int i = this.rz;
            int i2 = i / 32;
            iArr[i2] = (1 << (i & 31)) | iArr[i2];
        }
        this.rz++;
    }

    public int kgy() {
        return this.rz;
    }

    public void kgy(kgy kgyVar) {
        int i = kgyVar.rz;
        ahm(this.rz + i);
        for (int i2 = 0; i2 < i; i2++) {
            kgy(kgyVar.kgy(i2));
        }
    }

    public void kgy(int i, byte[] bArr, int i2, int i3) {
        for (int i4 = 0; i4 < i3; i4++) {
            int i5 = 0;
            for (int i6 = 0; i6 < 8; i6++) {
                if (kgy(i)) {
                    i5 |= 1 << (7 - i6);
                }
                i++;
            }
            bArr[i2 + i4] = (byte) i5;
        }
    }
}
