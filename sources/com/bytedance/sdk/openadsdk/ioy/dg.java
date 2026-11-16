package com.bytedance.sdk.openadsdk.ioy;

import defpackage.d;
import io.p071bidmachine.media3.extractor.ts.y;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes10.dex */
public final class dg {
    public ahm kgy(String str, int i, int i2, Map<noq, ?> map) throws sx {
        if (!str.isEmpty()) {
            if (i >= 0 && i2 >= 0) {
                fi fiVarValueOf = fi.L;
                int i3 = 4;
                if (map != null) {
                    noq noqVar = noq.ERROR_CORRECTION;
                    if (map.containsKey(noqVar)) {
                        fiVarValueOf = fi.valueOf(map.get(noqVar).toString());
                    }
                    noq noqVar2 = noq.MARGIN;
                    if (map.containsKey(noqVar2)) {
                        i3 = Integer.parseInt(map.get(noqVar2).toString());
                    }
                }
                return kgy(yo.kgy(str, fiVarValueOf, map), i, i2, i3);
            }
            throw new IllegalArgumentException("Requested dimensions are too small: " + i + 'x' + i2);
        }
        d.r("Found empty contents");
        return null;
    }

    private static ahm kgy(vs vsVar, int i, int i2, int i3) {
        rz rzVarKgy = vsVar.kgy();
        if (rzVarKgy != null) {
            int iAhm = rzVarKgy.ahm();
            int iKgy = rzVarKgy.kgy();
            int i4 = i3 * 2;
            int i5 = iAhm + i4;
            int i6 = i4 + iKgy;
            int iMax = Math.max(i, i5);
            int iMax2 = Math.max(i2, i6);
            int iMin = Math.min(iMax / i5, iMax2 / i6);
            int i7 = (iMax - (iAhm * iMin)) / 2;
            int i8 = (iMax2 - (iKgy * iMin)) / 2;
            ahm ahmVar = new ahm(iMax, iMax2);
            int i9 = 0;
            while (i9 < iKgy) {
                int i10 = 0;
                int i11 = i7;
                while (i10 < iAhm) {
                    if (rzVarKgy.kgy(i10, i9) == 1) {
                        ahmVar.kgy(i11, i8, iMin, iMin);
                    }
                    i10++;
                    i11 += iMin;
                }
                i9++;
                i8 += iMin;
            }
            return ahmVar;
        }
        y.b();
        return null;
    }
}
