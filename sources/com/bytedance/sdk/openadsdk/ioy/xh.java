package com.bytedance.sdk.openadsdk.ioy;

import defpackage.d;
import defpackage.pv1;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class xh {
    private final List<ra> ahm;
    private final gf kgy;

    private ra kgy(int i) {
        if (i >= this.ahm.size()) {
            ra raVarAhm = (ra) pv1.i(1, this.ahm);
            for (int size = this.ahm.size(); size <= i; size++) {
                gf gfVar = this.kgy;
                raVarAhm = raVarAhm.ahm(new ra(gfVar, new int[]{1, gfVar.kgy(gfVar.ahm() + (size - 1))}));
                this.ahm.add(raVarAhm);
            }
        }
        return this.ahm.get(i);
    }

    public xh(gf gfVar) {
        this.kgy = gfVar;
        ArrayList arrayList = new ArrayList();
        this.ahm = arrayList;
        arrayList.add(new ra(gfVar, new int[]{1}));
    }

    public void kgy(int[] iArr, int i) {
        if (i != 0) {
            int length = iArr.length - i;
            if (length > 0) {
                ra raVarKgy = kgy(i);
                int[] iArr2 = new int[length];
                System.arraycopy(iArr, 0, iArr2, 0, length);
                int[] iArrKgy = new ra(this.kgy, iArr2).kgy(i, 1).rz(raVarKgy)[1].kgy();
                int length2 = i - iArrKgy.length;
                for (int i2 = 0; i2 < length2; i2++) {
                    iArr[length + i2] = 0;
                }
                System.arraycopy(iArrKgy, 0, iArr, length + length2, iArrKgy.length);
                return;
            }
            d.r("No data bytes provided");
            return;
        }
        d.r("No error correction bytes");
    }
}
