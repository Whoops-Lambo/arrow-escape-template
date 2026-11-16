package com.google.android.recaptcha.internal;

import defpackage.d;
import io.p071bidmachine.media3.extractor.ts.y;
import java.math.RoundingMode;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzkj {
    public static int zzb(int i, RoundingMode roundingMode) {
        if (i <= 0) {
            d.r("x (0) must be > 0");
            return 0;
        }
        switch (zzki.zza[roundingMode.ordinal()]) {
            case 1:
                zzkl.zzb(((i + (-1)) & i) == 0);
                break;
            case 2:
            case 3:
                break;
            case 4:
            case 5:
                return 32 - Integer.numberOfLeadingZeros(i - 1);
            case 6:
            case 7:
            case 8:
                int iNumberOfLeadingZeros = Integer.numberOfLeadingZeros(i);
                return (31 - iNumberOfLeadingZeros) + ((((-1257966797) >>> iNumberOfLeadingZeros) - i) >>> 31);
            default:
                y.o();
                return 0;
        }
        return 31 - Integer.numberOfLeadingZeros(i);
    }

    public static int zza(int i, int i2, RoundingMode roundingMode) {
        roundingMode.getClass();
        if (i2 != 0) {
            int i3 = i / i2;
            int i4 = i - (i2 * i3);
            if (i4 != 0) {
                int i5 = 1;
                int i6 = ((i ^ i2) >> 31) | 1;
                switch (zzki.zza[roundingMode.ordinal()]) {
                    case 1:
                        zzkl.zzb(false);
                        return i3;
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
