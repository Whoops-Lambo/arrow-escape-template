package com.bytedance.sdk.openadsdk.ioy;

import defpackage.d;
import defpackage.e32;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
final class ra {
    private final int[] ahm;
    private final gf kgy;

    public ra ahm(ra raVar) {
        if (!this.kgy.equals(raVar.kgy)) {
            d.r("GenericGFPolys do not have same GenericGF field");
            return null;
        }
        if (rz() || raVar.rz()) {
            return this.kgy.kgy();
        }
        int[] iArr = this.ahm;
        int length = iArr.length;
        int[] iArr2 = raVar.ahm;
        int length2 = iArr2.length;
        int[] iArr3 = new int[(length + length2) - 1];
        for (int i = 0; i < length; i++) {
            int i2 = iArr[i];
            for (int i3 = 0; i3 < length2; i3++) {
                int i4 = i + i3;
                iArr3[i4] = gf.ahm(iArr3[i4], this.kgy.rz(i2, iArr2[i3]));
            }
        }
        return new ra(this.kgy, iArr3);
    }

    public ra kgy(ra raVar) {
        if (!this.kgy.equals(raVar.kgy)) {
            d.r("GenericGFPolys do not have same GenericGF field");
            return null;
        }
        if (rz()) {
            return raVar;
        }
        if (raVar.rz()) {
            return this;
        }
        int[] iArr = this.ahm;
        int[] iArr2 = raVar.ahm;
        if (iArr.length <= iArr2.length) {
            iArr = iArr2;
            iArr2 = iArr;
        }
        int[] iArr3 = new int[iArr.length];
        int length = iArr.length - iArr2.length;
        System.arraycopy(iArr, 0, iArr3, 0, length);
        for (int i = length; i < iArr.length; i++) {
            iArr3[i] = gf.ahm(iArr2[i - length], iArr[i]);
        }
        return new ra(this.kgy, iArr3);
    }

    public ra[] rz(ra raVar) {
        if (!this.kgy.equals(raVar.kgy)) {
            d.r("GenericGFPolys do not have same GenericGF field");
            return null;
        }
        if (raVar.rz()) {
            d.r("Divide by 0");
            return null;
        }
        ra raVarKgy = this.kgy.kgy();
        int iAhm = this.kgy.ahm(raVar.kgy(raVar.ahm()));
        ra raVarKgy2 = this;
        while (raVarKgy2.ahm() >= raVar.ahm() && !raVarKgy2.rz()) {
            int iAhm2 = raVarKgy2.ahm() - raVar.ahm();
            int iRz = this.kgy.rz(raVarKgy2.kgy(raVarKgy2.ahm()), iAhm);
            ra raVarKgy3 = raVar.kgy(iAhm2, iRz);
            raVarKgy = raVarKgy.kgy(this.kgy.kgy(iAhm2, iRz));
            raVarKgy2 = raVarKgy2.kgy(raVarKgy3);
        }
        return new ra[]{raVarKgy, raVarKgy2};
    }

    public ra(gf gfVar, int[] iArr) {
        if (iArr.length != 0) {
            this.kgy = gfVar;
            int length = iArr.length;
            int i = 1;
            if (length > 1 && iArr[0] == 0) {
                while (i < length && iArr[i] == 0) {
                    i++;
                }
                if (i == length) {
                    this.ahm = new int[]{0};
                    return;
                }
                int[] iArr2 = new int[length - i];
                this.ahm = iArr2;
                System.arraycopy(iArr, i, iArr2, 0, iArr2.length);
                return;
            }
            this.ahm = iArr;
            return;
        }
        e32.a();
        throw null;
    }

    public int kgy(int i) {
        int[] iArr = this.ahm;
        return iArr[(iArr.length - 1) - i];
    }

    public int[] kgy() {
        return this.ahm;
    }

    public ra kgy(int i, int i2) {
        if (i < 0) {
            e32.a();
            return null;
        }
        if (i2 == 0) {
            return this.kgy.kgy();
        }
        int length = this.ahm.length;
        int[] iArr = new int[i + length];
        int i3 = 0;
        while (true) {
            gf gfVar = this.kgy;
            if (i3 < length) {
                iArr[i3] = gfVar.rz(this.ahm[i3], i2);
                i3++;
            } else {
                return new ra(gfVar, iArr);
            }
        }
    }

    public int ahm() {
        return this.ahm.length - 1;
    }

    public boolean rz() {
        return this.ahm[0] == 0;
    }
}
