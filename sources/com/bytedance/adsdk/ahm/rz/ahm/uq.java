package com.bytedance.adsdk.ahm.rz.ahm;

import defpackage.d;
import defpackage.nj;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public class uq {
    private final int[] ahm;
    private final float[] kgy;

    public int[] ahm() {
        return this.ahm;
    }

    public void kgy(uq uqVar, uq uqVar2, float f) {
        if (uqVar.ahm.length != uqVar2.ahm.length) {
            StringBuilder sb = new StringBuilder("Cannot interpolate between gradients. Lengths vary (");
            sb.append(uqVar.ahm.length);
            sb.append(" vs ");
            d.r(nj.l(uqVar2.ahm.length, ")", sb));
            return;
        }
        for (int i = 0; i < uqVar.ahm.length; i++) {
            this.kgy[i] = com.bytedance.adsdk.ahm.noq.ct.kgy(uqVar.kgy[i], uqVar2.kgy[i], f);
            this.ahm[i] = com.bytedance.adsdk.ahm.noq.ahm.kgy(f, uqVar.ahm[i], uqVar2.ahm[i]);
        }
    }

    public int rz() {
        return this.ahm.length;
    }

    public uq(float[] fArr, int[] iArr) {
        this.kgy = fArr;
        this.ahm = iArr;
    }

    public float[] kgy() {
        return this.kgy;
    }

    public uq kgy(float[] fArr) {
        int[] iArr = new int[fArr.length];
        for (int i = 0; i < fArr.length; i++) {
            iArr[i] = kgy(fArr[i]);
        }
        return new uq(fArr, iArr);
    }

    private int kgy(float f) {
        int iBinarySearch = Arrays.binarySearch(this.kgy, f);
        if (iBinarySearch >= 0) {
            return this.ahm[iBinarySearch];
        }
        int i = -(iBinarySearch + 1);
        int[] iArr = this.ahm;
        if (i == 0) {
            return iArr[0];
        }
        if (i == iArr.length - 1) {
            return iArr[iArr.length - 1];
        }
        float[] fArr = this.kgy;
        int i2 = i - 1;
        float f2 = fArr[i2];
        return com.bytedance.adsdk.ahm.noq.ahm.kgy((f - f2) / (fArr[i] - f2), iArr[i2], iArr[i]);
    }
}
