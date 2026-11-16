package com.google.android.gms.internal.nearby;

import defpackage.a95;
import io.p071bidmachine.media3.extractor.ts.y;
import java.math.RoundingMode;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class zztj {
    public static int a(int i, int i2, RoundingMode roundingMode) {
        roundingMode.getClass();
        if (i2 != 0) {
            int i3 = i / i2;
            int i4 = i - (i2 * i3);
            if (i4 != 0) {
                int i5 = 1;
                int i6 = ((i ^ i2) >> 31) | 1;
                switch (a95.a[roundingMode.ordinal()]) {
                    case 1:
                        throw new ArithmeticException("mode was UNNECESSARY, but rounding was necessary");
                    case 2:
                        return i3;
                    case 3:
                        if (i6 >= 0) {
                            return i3;
                        }
                        break;
                    case 4:
                        break;
                    case 5:
                        if (i6 <= 0) {
                            return i3;
                        }
                        break;
                    case 6:
                    case 7:
                    case 8:
                        int iAbs = Math.abs(i4);
                        int iAbs2 = iAbs - (Math.abs(i2) - iAbs);
                        if (iAbs2 == 0) {
                            if (roundingMode != RoundingMode.HALF_UP) {
                                if (roundingMode != RoundingMode.HALF_EVEN) {
                                    i5 = 0;
                                }
                                if ((i3 & 1 & i5) == 0) {
                                    return i3;
                                }
                            }
                        } else if (iAbs2 <= 0) {
                            return i3;
                        }
                    default:
                        y.o();
                        return 0;
                }
                return i3 + i6;
            }
            return i3;
        }
        throw new ArithmeticException("/ by zero");
    }
}
