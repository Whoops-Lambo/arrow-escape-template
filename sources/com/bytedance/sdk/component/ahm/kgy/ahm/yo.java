package com.bytedance.sdk.component.ahm.kgy.ahm;

import defpackage.d;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
final class yo extends uq {
    final transient int[] fi;
    final transient byte[][] yo;

    public yo(kgy kgyVar, int i) {
        super(null);
        gf.kgy(kgyVar.ahm, 0L, i);
        ct ctVar = kgyVar.kgy;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i3 < i) {
            int i5 = ctVar.rz;
            int i6 = ctVar.ahm;
            if (i5 == i6) {
                d.p("s.limit == s.pos");
                throw null;
            }
            i3 += i5 - i6;
            i4++;
            ctVar = ctVar.noq;
        }
        this.yo = new byte[i4][];
        this.fi = new int[i4 * 2];
        ct ctVar2 = kgyVar.kgy;
        int i7 = 0;
        while (i2 < i) {
            byte[][] bArr = this.yo;
            bArr[i7] = ctVar2.kgy;
            int i8 = ctVar2.rz;
            int i9 = ctVar2.ahm;
            int i10 = (i8 - i9) + i2;
            i2 = i10 > i ? i : i10;
            int[] iArr = this.fi;
            iArr[i7] = i2;
            iArr[bArr.length + i7] = i9;
            ctVar2.uq = true;
            i7++;
            ctVar2 = ctVar2.noq;
        }
    }

    @Override // com.bytedance.sdk.component.ahm.kgy.ahm.uq
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof uq) {
            uq uqVar = (uq) obj;
            if (uqVar.rz() == rz() && kgy(0, uqVar, 0, rz())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.bytedance.sdk.component.ahm.kgy.ahm.uq
    public boolean kgy(int i, byte[] bArr, int i2, int i3) {
        if (i < 0 || i > rz() - i3 || i2 < 0 || i2 > bArr.length - i3) {
            return false;
        }
        int iAhm = ahm(i);
        while (i3 > 0) {
            int i4 = iAhm == 0 ? 0 : this.fi[iAhm - 1];
            int iMin = Math.min(i3, ((this.fi[iAhm] - i4) + i4) - i);
            int[] iArr = this.fi;
            byte[][] bArr2 = this.yo;
            if (!gf.kgy(bArr2[iAhm], (i - i4) + iArr[bArr2.length + iAhm], bArr, i2, iMin)) {
                return false;
            }
            i += iMin;
            i2 += iMin;
            i3 -= iMin;
            iAhm++;
        }
        return true;
    }

    private int ahm(int i) {
        int iBinarySearch = Arrays.binarySearch(this.fi, 0, this.yo.length, i + 1);
        return iBinarySearch >= 0 ? iBinarySearch : ~iBinarySearch;
    }

    private uq ct() {
        return new uq(uq());
    }

    @Override // com.bytedance.sdk.component.ahm.kgy.ahm.uq
    public int hashCode() {
        int i = this.ct;
        if (i != 0) {
            return i;
        }
        int length = this.yo.length;
        int i2 = 0;
        int i3 = 1;
        int i4 = 0;
        while (i2 < length) {
            byte[] bArr = this.yo[i2];
            int[] iArr = this.fi;
            int i5 = iArr[length + i2];
            int i6 = iArr[i2];
            int i7 = (i6 - i4) + i5;
            while (i5 < i7) {
                i3 = (i3 * 31) + bArr[i5];
                i5++;
            }
            i2++;
            i4 = i6;
        }
        this.ct = i3;
        return i3;
    }

    @Override // com.bytedance.sdk.component.ahm.kgy.ahm.uq
    public int rz() {
        return this.fi[this.yo.length - 1];
    }

    @Override // com.bytedance.sdk.component.ahm.kgy.ahm.uq
    public byte[] uq() {
        int[] iArr = this.fi;
        byte[][] bArr = this.yo;
        byte[] bArr2 = new byte[iArr[bArr.length - 1]];
        int length = bArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int[] iArr2 = this.fi;
            int i3 = iArr2[length + i];
            int i4 = iArr2[i];
            System.arraycopy(this.yo[i], i3, bArr2, i2, i4 - i2);
            i++;
            i2 = i4;
        }
        return bArr2;
    }

    @Override // com.bytedance.sdk.component.ahm.kgy.ahm.uq
    public String toString() {
        return ct().toString();
    }

    @Override // com.bytedance.sdk.component.ahm.kgy.ahm.uq
    public String ahm() {
        return ct().ahm();
    }

    @Override // com.bytedance.sdk.component.ahm.kgy.ahm.uq
    public uq kgy(int i, int i2) {
        return ct().kgy(i, i2);
    }

    @Override // com.bytedance.sdk.component.ahm.kgy.ahm.uq
    public byte kgy(int i) {
        gf.kgy(this.fi[this.yo.length - 1], i, 1L);
        int iAhm = ahm(i);
        int i2 = iAhm == 0 ? 0 : this.fi[iAhm - 1];
        int[] iArr = this.fi;
        byte[][] bArr = this.yo;
        return bArr[iAhm][(i - i2) + iArr[bArr.length + iAhm]];
    }

    @Override // com.bytedance.sdk.component.ahm.kgy.ahm.uq
    public boolean kgy(int i, uq uqVar, int i2, int i3) {
        if (i < 0 || i > rz() - i3) {
            return false;
        }
        int iAhm = ahm(i);
        while (i3 > 0) {
            int i4 = iAhm == 0 ? 0 : this.fi[iAhm - 1];
            int iMin = Math.min(i3, ((this.fi[iAhm] - i4) + i4) - i);
            int[] iArr = this.fi;
            byte[][] bArr = this.yo;
            if (!uqVar.kgy(i2, bArr[iAhm], (i - i4) + iArr[bArr.length + iAhm], iMin)) {
                return false;
            }
            i += iMin;
            i2 += iMin;
            i3 -= iMin;
            iAhm++;
        }
        return true;
    }

    @Override // com.bytedance.sdk.component.ahm.kgy.ahm.uq
    public String kgy() {
        return ct().kgy();
    }
}
