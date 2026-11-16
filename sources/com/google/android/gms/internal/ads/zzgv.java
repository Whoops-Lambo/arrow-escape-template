package com.google.android.gms.internal.ads;

import defpackage.c71;
import defpackage.jc1;
import defpackage.rl3;
import java.lang.reflect.Array;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class zzgv {
    public static final byte[] a = {0, 0, 0, 1};
    public static final float[] b = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 2.1818182f, 1.8181819f, 2.909091f, 2.4242425f, 1.6363636f, 1.3636364f, 1.939394f, 1.6161616f, 1.3333334f, 1.5f, 2.0f};
    public static final Object c = new Object();
    public static int[] d = new int[10];

    public static void h(boolean[] zArr) {
        zArr[0] = false;
        zArr[1] = false;
        zArr[2] = false;
    }

    public static int a(int i, byte[] bArr) {
        int i2;
        synchronized (c) {
            int i3 = 0;
            int i4 = 0;
            while (i3 < i) {
                while (true) {
                    try {
                        if (i3 >= i - 2) {
                            i3 = i;
                            break;
                        }
                        int i5 = i3 + 1;
                        if (bArr[i3] == 0 && bArr[i5] == 0 && bArr[i3 + 2] == 3) {
                            break;
                        }
                        i3 = i5;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (i3 < i) {
                    int[] iArr = d;
                    int length = iArr.length;
                    if (length <= i4) {
                        d = Arrays.copyOf(iArr, length + length);
                    }
                    d[i4] = i3;
                    i3 += 3;
                    i4++;
                }
            }
            i2 = i - i4;
            int i6 = 0;
            int i7 = 0;
            for (int i8 = 0; i8 < i4; i8++) {
                int i9 = d[i8] - i6;
                System.arraycopy(bArr, i6, bArr, i7, i9);
                int i10 = i7 + i9;
                int i11 = i10 + 1;
                bArr[i10] = 0;
                i7 = i10 + 2;
                bArr[i11] = 0;
                i6 += i9 + 3;
            }
            System.arraycopy(bArr, i6, bArr, i7, i2 - i7);
        }
        return i2;
    }

    public static boolean c(byte[] bArr, int i, zzv zzvVar) {
        int i2;
        String str = zzvVar.o;
        if (Objects.equals(str, "video/avc")) {
            byte b2 = bArr[4];
            if (((b2 & 96) >> 5) == 0 && ((i2 = b2 & 31) == 1 || i2 == 9 || i2 == 14)) {
                return false;
            }
        } else if (Objects.equals(str, "video/hevc")) {
            zzgj zzgjVarI = i(new zzhd(bArr, 4, i + 4));
            int i3 = zzgjVarI.a;
            if (i3 == 35) {
                return false;
            }
            if (i3 <= 14 && i3 % 2 == 0 && zzgjVarI.c == zzvVar.G - 1) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0185  */
    /* JADX WARN: Code duplicated, block: B:102:0x0189  */
    /* JADX WARN: Code duplicated, block: B:103:0x018e  */
    /* JADX WARN: Code duplicated, block: B:106:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:109:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:111:0x01bd  */
    /* JADX WARN: Code duplicated, block: B:114:0x01c4  */
    /* JADX WARN: Code duplicated, block: B:116:0x01dd  */
    /* JADX WARN: Code duplicated, block: B:117:0x01e0  */
    /* JADX WARN: Code duplicated, block: B:120:0x01e8  */
    /* JADX WARN: Code duplicated, block: B:123:0x01f4  */
    /* JADX WARN: Code duplicated, block: B:126:0x01ff  */
    /* JADX WARN: Code duplicated, block: B:129:0x0208  */
    /* JADX WARN: Code duplicated, block: B:132:0x020f  */
    /* JADX WARN: Code duplicated, block: B:135:0x021b  */
    /* JADX WARN: Code duplicated, block: B:137:0x023a  */
    /* JADX WARN: Code duplicated, block: B:142:0x00a6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:145:0x00a1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:21:0x0057  */
    /* JADX WARN: Code duplicated, block: B:23:0x005e  */
    /* JADX WARN: Code duplicated, block: B:26:0x0071 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:27:0x0073  */
    /* JADX WARN: Code duplicated, block: B:28:0x0075  */
    /* JADX WARN: Code duplicated, block: B:31:0x007a  */
    /* JADX WARN: Code duplicated, block: B:33:0x0080  */
    /* JADX WARN: Code duplicated, block: B:35:0x0083  */
    /* JADX WARN: Code duplicated, block: B:36:0x0086  */
    /* JADX WARN: Code duplicated, block: B:39:0x008f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:40:0x0091  */
    /* JADX WARN: Code duplicated, block: B:42:0x009f  */
    /* JADX WARN: Code duplicated, block: B:91:0x0160  */
    /* JADX WARN: Code duplicated, block: B:93:0x0166  */
    /* JADX WARN: Code duplicated, block: B:95:0x0170  */
    /* JADX WARN: Code duplicated, block: B:99:0x0182  */
    public static zzgu d(int i, int i2, byte[] bArr) {
        int iG;
        int i3;
        int i4;
        int iG2;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int iF;
        int i10;
        int i11;
        int iG3;
        int i12;
        int i13;
        int i14;
        int i15;
        float f;
        int i16;
        int i17;
        float f2;
        int i18;
        int iC;
        boolean zD;
        boolean zD2;
        int iE;
        int iE2;
        int i19;
        zzhd zzhdVar = new zzhd(bArr, i, i2);
        int iE3 = zzhdVar.e(8);
        int iE4 = zzhdVar.e(8);
        int iE5 = zzhdVar.e(8);
        int iG4 = zzhdVar.g();
        if (iE3 == 100 || iE3 == 110 || iE3 == 122 || iE3 == 244 || iE3 == 44 || iE3 == 83 || iE3 == 86 || iE3 == 118 || iE3 == 128) {
            iG = zzhdVar.g();
            if (iG == 3) {
                zzhdVar.d();
                i3 = 3;
            } else {
                i3 = iG;
            }
            i4 = 16;
            iG2 = zzhdVar.g();
            int iG5 = zzhdVar.g();
            zzhdVar.a();
            if (zzhdVar.d()) {
                if (i3 != 3) {
                    i6 = 8;
                } else {
                    i6 = 12;
                }
                for (i7 = 0; i7 < i6; i7++) {
                    if (!zzhdVar.d()) {
                        if (i7 < 6) {
                            i8 = 16;
                        } else {
                            i8 = 64;
                        }
                        iF = 8;
                        i10 = 8;
                        for (i9 = 0; i9 < i8; i9++) {
                            if (iF != 0) {
                                iF = ((zzhdVar.f() + i10) + 256) % 256;
                            }
                            if (iF != 0) {
                                i10 = iF;
                            }
                        }
                    }
                }
            }
            i5 = iG5;
        } else if (iE3 == 138) {
            iE3 = 138;
            iG = zzhdVar.g();
            if (iG == 3) {
                zzhdVar.d();
                i3 = 3;
            } else {
                i3 = iG;
            }
            i4 = 16;
            iG2 = zzhdVar.g();
            int iG6 = zzhdVar.g();
            zzhdVar.a();
            if (zzhdVar.d()) {
                if (i3 != 3) {
                    i6 = 8;
                } else {
                    i6 = 12;
                }
                while (i7 < i6) {
                    if (!zzhdVar.d()) {
                        if (i7 < 6) {
                            i8 = 16;
                        } else {
                            i8 = 64;
                        }
                        iF = 8;
                        i10 = 8;
                        while (i9 < i8) {
                            if (iF != 0) {
                                iF = ((zzhdVar.f() + i10) + 256) % 256;
                            }
                            if (iF != 0) {
                                i10 = iF;
                            }
                        }
                    }
                }
            }
            i5 = iG6;
        } else {
            iG = 1;
            i4 = 16;
            i5 = 0;
            iG2 = 0;
        }
        zzhdVar.g();
        int iG7 = zzhdVar.g();
        if (iG7 == 0) {
            zzhdVar.g();
        } else if (iG7 == 1) {
            zzhdVar.d();
            zzhdVar.f();
            zzhdVar.f();
            long jG = zzhdVar.g();
            for (int i20 = 0; i20 < jG; i20++) {
                zzhdVar.g();
            }
        }
        zzhdVar.g();
        zzhdVar.a();
        int iG8 = zzhdVar.g() + 1;
        int iG9 = zzhdVar.g() + 1;
        boolean zD3 = zzhdVar.d();
        int i21 = 2 - (zD3 ? 1 : 0);
        if (!zD3) {
            zzhdVar.a();
        }
        zzhdVar.a();
        int iB = iG8 * 16;
        int iB2 = iG9 * i21 * 16;
        if (zzhdVar.d()) {
            int iG10 = zzhdVar.g();
            int iG11 = zzhdVar.g();
            int iG12 = zzhdVar.g();
            int iG13 = zzhdVar.g();
            if (iG == 0) {
                i19 = 1;
            } else {
                int i22 = iG == 3 ? 1 : 2;
                i21 *= iG == 1 ? 2 : 1;
                i19 = i22;
            }
            iB = jc1.B(iG10, iG11, i19, iB);
            iB2 = jc1.B(iG12, iG13, i21, iB2);
        }
        int i23 = iB;
        int i24 = iB2;
        if (iE3 != 44 && iE3 != 86 && iE3 != 100 && iE3 != 110 && iE3 != 122) {
            if (iE3 == 244) {
                i11 = 244;
            } else {
                iG3 = i4;
                i12 = iE3;
            }
            i13 = -1;
            if (zzhdVar.d()) {
                if (zzhdVar.d()) {
                    iE = zzhdVar.e(8);
                    if (iE == 255) {
                        int i25 = i4;
                        iE2 = zzhdVar.e(i25);
                        int iE6 = zzhdVar.e(i25);
                        if (iE2 != 0 || iE6 == 0) {
                            f2 = 1.0f;
                        } else {
                            f2 = iE2 / iE6;
                        }
                    } else if (iE < 17) {
                        f2 = b[iE];
                    } else {
                        rl3.q(new StringBuilder(String.valueOf(iE).length() + 35), "Unexpected aspect_ratio_idc value: ", iE, "NalUnitUtil");
                        f2 = 1.0f;
                    }
                } else {
                    f2 = 1.0f;
                }
                if (zzhdVar.d()) {
                    zzhdVar.a();
                }
                if (zzhdVar.d()) {
                    zzhdVar.b(3);
                    int i26 = true != zzhdVar.d() ? 2 : 1;
                    if (zzhdVar.d()) {
                        int iE7 = zzhdVar.e(8);
                        int iE8 = zzhdVar.e(8);
                        zzhdVar.b(8);
                        int iB3 = zzi.b(iE7);
                        iC = zzi.c(iE8);
                        i18 = iB3;
                    } else {
                        i18 = -1;
                        iC = -1;
                    }
                    i13 = i26;
                } else {
                    i18 = -1;
                    iC = -1;
                }
                if (zzhdVar.d()) {
                    zzhdVar.g();
                    zzhdVar.g();
                }
                if (zzhdVar.d()) {
                    zzhdVar.b(65);
                }
                zD = zzhdVar.d();
                if (zD) {
                    k(zzhdVar);
                }
                zD2 = zzhdVar.d();
                if (zD2) {
                    k(zzhdVar);
                }
                if (zD || zD2) {
                    zzhdVar.a();
                }
                zzhdVar.a();
                if (zzhdVar.d()) {
                    zzhdVar.a();
                    zzhdVar.g();
                    zzhdVar.g();
                    zzhdVar.g();
                    zzhdVar.g();
                    iG3 = zzhdVar.g();
                    zzhdVar.g();
                }
                i14 = i13;
                i15 = iC;
                f = f2;
                i16 = iG3;
                i17 = i18;
            } else {
                i14 = -1;
                i15 = -1;
                f = 1.0f;
                i16 = iG3;
                i17 = -1;
            }
            return new zzgu(i12, iE4, iE5, iG4, i23, i24, f, iG2, i5, i17, i14, i15, i16);
        }
        i11 = iE3;
        if ((iE4 & 16) != 0) {
            i12 = i11;
            iG3 = 0;
        } else {
            iG3 = i4;
            i12 = i11;
        }
        i13 = -1;
        if (zzhdVar.d()) {
            if (zzhdVar.d()) {
                f2 = 1.0f;
            } else {
                iE = zzhdVar.e(8);
                if (iE == 255) {
                    int i27 = i4;
                    iE2 = zzhdVar.e(i27);
                    int iE9 = zzhdVar.e(i27);
                    if (iE2 != 0) {
                        f2 = 1.0f;
                    } else {
                        f2 = 1.0f;
                    }
                } else if (iE < 17) {
                    f2 = b[iE];
                } else {
                    rl3.q(new StringBuilder(String.valueOf(iE).length() + 35), "Unexpected aspect_ratio_idc value: ", iE, "NalUnitUtil");
                    f2 = 1.0f;
                }
            }
            if (zzhdVar.d()) {
                zzhdVar.a();
            }
            if (zzhdVar.d()) {
                zzhdVar.b(3);
                if (true != zzhdVar.d()) {
                }
                if (zzhdVar.d()) {
                    int iE10 = zzhdVar.e(8);
                    int iE11 = zzhdVar.e(8);
                    zzhdVar.b(8);
                    int iB4 = zzi.b(iE10);
                    iC = zzi.c(iE11);
                    i18 = iB4;
                } else {
                    i18 = -1;
                    iC = -1;
                }
                i13 = i26;
            } else {
                i18 = -1;
                iC = -1;
            }
            if (zzhdVar.d()) {
                zzhdVar.g();
                zzhdVar.g();
            }
            if (zzhdVar.d()) {
                zzhdVar.b(65);
            }
            zD = zzhdVar.d();
            if (zD) {
                k(zzhdVar);
            }
            zD2 = zzhdVar.d();
            if (zD2) {
                k(zzhdVar);
            }
            if (zD) {
                zzhdVar.a();
            } else {
                zzhdVar.a();
            }
            zzhdVar.a();
            if (zzhdVar.d()) {
                zzhdVar.a();
                zzhdVar.g();
                zzhdVar.g();
                zzhdVar.g();
                zzhdVar.g();
                iG3 = zzhdVar.g();
                zzhdVar.g();
            }
            i14 = i13;
            i15 = iC;
            f = f2;
            i16 = iG3;
            i17 = i18;
        } else {
            i14 = -1;
            i15 = -1;
            f = 1.0f;
            i16 = iG3;
            i17 = -1;
        }
        return new zzgu(i12, iE4, iE5, iG4, i23, i24, f, iG2, i5, i17, i14, i15, i16);
    }

    /* JADX WARN: Code duplicated, block: B:469:0x014e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:57:0x010f  */
    /* JADX WARN: Code duplicated, block: B:66:0x0128  */
    /* JADX WARN: Code duplicated, block: B:70:0x013b  */
    /* JADX WARN: Code duplicated, block: B:72:0x0140  */
    /* JADX WARN: Code duplicated, block: B:74:0x0148  */
    /* JADX WARN: Multi-variable type inference failed */
    public static zzgs e(int i, int i2, byte[] bArr) {
        zzgr zzgrVar;
        boolean z;
        int iE;
        int iE2;
        int iE3;
        int iE4;
        int i3;
        int i4;
        w wVar;
        boolean[][] zArr;
        boolean[][] zArr2;
        int[] iArr;
        int[] iArr2;
        int i5;
        int i6;
        boolean zD;
        int i7;
        int i8;
        int i9;
        int iG;
        int i10;
        int i11;
        int i12;
        boolean z2;
        boolean z3;
        zzhd zzhdVar = new zzhd(bArr, i, i2);
        i(zzhdVar);
        zzhdVar.b(4);
        boolean zD2 = zzhdVar.d();
        boolean zD3 = zzhdVar.d();
        int iE5 = zzhdVar.e(6);
        int i13 = iE5 + 1;
        int iE6 = zzhdVar.e(3);
        zzhdVar.b(17);
        zzgk zzgkVarJ = j(zzhdVar, true, iE6, null);
        for (int i14 = true != zzhdVar.d() ? iE6 : 0; i14 <= iE6; i14++) {
            zzhdVar.g();
            zzhdVar.g();
            zzhdVar.g();
        }
        int iE7 = zzhdVar.e(6);
        int iG2 = zzhdVar.g() + 1;
        int i15 = 6;
        zzgl zzglVar = new zzgl(zzgzb.x(zzgkVarJ), new int[1]);
        boolean z4 = i13 >= 2 && iG2 >= 2;
        boolean z5 = zD2 && zD3;
        int i16 = iE7 + 1;
        if (!z4 || !z5 || i16 < i13) {
            return new zzgs(null, zzglVar, null, null);
        }
        Class cls = Integer.TYPE;
        int[][] iArr3 = (int[][]) Array.newInstance((Class<?>) cls, iG2, i16);
        int i17 = 1;
        int[] iArr4 = new int[iG2];
        int[] iArr5 = new int[iG2];
        iArr3[0][0] = 0;
        iArr4[0] = 1;
        iArr5[0] = 0;
        for (int i18 = 1; i18 < iG2; i18++) {
            int i19 = 0;
            for (int i20 = 0; i20 <= iE7; i20++) {
                if (zzhdVar.d()) {
                    iArr3[i18][i19] = i20;
                    iArr5[i18] = i20;
                    i19++;
                }
                iArr4[i18] = i19;
            }
        }
        if (zzhdVar.d()) {
            zzhdVar.b(64);
            if (zzhdVar.d()) {
                zzhdVar.g();
            }
            int iG3 = zzhdVar.g();
            int i21 = 0;
            while (i21 < iG3) {
                zzhdVar.g();
                if (i21 == 0 || zzhdVar.d()) {
                    boolean zD4 = zzhdVar.d();
                    boolean zD5 = zzhdVar.d();
                    z3 = zD4;
                    z2 = zD5;
                    if (zD4 || zD5) {
                        zD = zzhdVar.d();
                        if (zD) {
                            zzhdVar.b(19);
                        }
                        zzhdVar.b(8);
                        if (zD) {
                            zzhdVar.b(4);
                        }
                        zzhdVar.b(15);
                        i8 = zD4;
                        i7 = zD5;
                    }
                    i9 = 0;
                    while (i9 <= iE6) {
                        if (!zzhdVar.d() || zzhdVar.d()) {
                            zzhdVar.g();
                        } else {
                            if (zzhdVar.d()) {
                                iG = 0;
                            }
                            int[][] iArr6 = iArr3;
                            i10 = i8 + i7;
                            int[] iArr7 = iArr5;
                            i11 = 0;
                            while (i11 < i10) {
                                int i22 = i10;
                                for (i12 = 0; i12 <= iG; i12++) {
                                    zzhdVar.g();
                                    zzhdVar.g();
                                    if (zD) {
                                        zzhdVar.g();
                                        zzhdVar.g();
                                    }
                                    zzhdVar.a();
                                }
                                i11++;
                                i10 = i22;
                            }
                            i9++;
                            iArr3 = iArr6;
                            i21 = i21;
                            iArr5 = iArr7;
                        }
                        iG = zzhdVar.g();
                        int[][] iArr8 = iArr3;
                        i10 = i8 + i7;
                        int[] iArr9 = iArr5;
                        i11 = 0;
                        while (i11 < i10) {
                            int i23 = i10;
                            while (i12 <= iG) {
                                zzhdVar.g();
                                zzhdVar.g();
                                if (zD) {
                                    zzhdVar.g();
                                    zzhdVar.g();
                                }
                                zzhdVar.a();
                            }
                            i11++;
                            i10 = i23;
                        }
                        i9++;
                        iArr3 = iArr8;
                        i21 = i21;
                        iArr5 = iArr9;
                    }
                    i21++;
                } else {
                    z3 = false;
                    z2 = false;
                }
                zD = false;
                i8 = z3;
                i7 = z2;
                i9 = 0;
                while (i9 <= iE6) {
                    if (zzhdVar.d()) {
                        zzhdVar.g();
                        iG = zzhdVar.g();
                    } else {
                        zzhdVar.g();
                        iG = zzhdVar.g();
                    }
                    int[][] iArr10 = iArr3;
                    i10 = i8 + i7;
                    int[] iArr11 = iArr5;
                    i11 = 0;
                    while (i11 < i10) {
                        int i24 = i10;
                        while (i12 <= iG) {
                            zzhdVar.g();
                            zzhdVar.g();
                            if (zD) {
                                zzhdVar.g();
                                zzhdVar.g();
                            }
                            zzhdVar.a();
                        }
                        i11++;
                        i10 = i24;
                    }
                    i9++;
                    iArr3 = iArr10;
                    i21 = i21;
                    iArr5 = iArr11;
                }
                i21++;
            }
        }
        int[][] iArr12 = iArr3;
        int[] iArr13 = iArr5;
        if (!zzhdVar.d()) {
            return new zzgs(null, zzglVar, null, null);
        }
        int i25 = zzhdVar.e;
        if (i25 > 0) {
            zzhdVar.b(8 - i25);
        }
        zzgk zzgkVarJ2 = j(zzhdVar, false, iE6, zzgkVarJ);
        boolean zD6 = zzhdVar.d();
        boolean[] zArr3 = new boolean[16];
        int i26 = 0;
        for (int i27 = 0; i27 < 16; i27++) {
            boolean zD7 = zzhdVar.d();
            zArr3[i27] = zD7;
            if (zD7) {
                i26++;
            }
        }
        if (i26 == 0 || !zArr3[1]) {
            return new zzgs(null, zzglVar, null, null);
        }
        int i28 = i26 + 1;
        int[] iArr14 = new int[i26];
        for (int i29 = 0; i29 < i26 - (zD6 ? 1 : 0); i29++) {
            iArr14[i29] = zzhdVar.e(3);
        }
        int[] iArr15 = new int[i28];
        if (zD6) {
            for (int i30 = 1; i30 < i26; i30++) {
                for (int i31 = 0; i31 < i30; i31++) {
                    iArr15[i30] = iArr14[i31] + 1 + iArr15[i30];
                }
            }
            iArr15[i26] = 6;
        }
        int[][] iArr16 = (int[][]) Array.newInstance((Class<?>) cls, i13, i26);
        int[] iArr17 = new int[i13];
        iArr17[0] = 0;
        boolean zD8 = zzhdVar.d();
        int i32 = 1;
        while (i32 < i13) {
            if (zD8) {
                iArr17[i32] = zzhdVar.e(i15);
            } else {
                iArr17[i32] = i32;
            }
            if (zD6) {
                i6 = i32;
                int i33 = 0;
                while (i33 < i26) {
                    int i34 = i33 + 1;
                    iArr16[i6][i33] = (iArr17[i6] & ((1 << iArr15[i34]) - 1)) >> iArr15[i33];
                    i33 = i34;
                }
            } else {
                int i35 = 0;
                while (i35 < i26) {
                    iArr16[i32][i35] = zzhdVar.e(iArr14[i35] + 1);
                    i35++;
                    i32 = i32;
                }
                i6 = i32;
            }
            i32 = i6 + 1;
            i15 = 6;
        }
        int[] iArr18 = new int[i16];
        int i36 = 1;
        int i37 = 0;
        while (i37 < i13) {
            iArr18[iArr17[i37]] = -1;
            int[] iArr19 = iArr18;
            int i38 = 0;
            int i39 = 0;
            while (i38 < 16) {
                if (zArr3[i38]) {
                    i5 = i17;
                    if (i38 == i5) {
                        iArr19[iArr17[i37]] = iArr16[i37][i39];
                        i38 = i5;
                    }
                    i39++;
                } else {
                    i5 = i17;
                }
                i38 += i5;
                i17 = i5;
            }
            if (i37 > 0) {
                int i40 = 0;
                while (true) {
                    if (i40 >= i37) {
                        i36++;
                        break;
                    }
                    int i41 = i40;
                    if (iArr19[iArr17[i37]] == iArr19[iArr17[i40]]) {
                        break;
                    }
                    i40 = i41 + 1;
                }
            }
            i37++;
            iArr18 = iArr19;
            i17 = 1;
        }
        int[] iArr20 = iArr18;
        int iE8 = zzhdVar.e(4);
        if (i36 < 2 || iE8 == 0) {
            return new zzgs(null, zzglVar, null, null);
        }
        int[] iArr21 = new int[i36];
        for (int i42 = 0; i42 < i36; i42++) {
            iArr21[i42] = zzhdVar.e(iE8);
        }
        int[] iArr22 = new int[i16];
        for (int i43 = 0; i43 < i13; i43++) {
            iArr22[Math.min(iArr17[i43], iE7)] = i43;
        }
        zzgyy zzgyyVar = new zzgyy();
        int i44 = 0;
        while (i44 <= iE7) {
            int[] iArr23 = iArr21;
            int i45 = i36;
            int iMin = Math.min(iArr20[i44], i45 - 1);
            int[] iArr24 = iArr22;
            zzgyyVar.c(new zzgi(iArr24[i44], iMin >= 0 ? iArr23[iMin] : -1));
            i44++;
            i36 = i45;
            iArr21 = iArr23;
            iArr22 = iArr24;
        }
        w wVarF = zzgyyVar.f();
        if (((zzgi) wVarF.get(0)).b == -1) {
            return new zzgs(null, zzglVar, null, null);
        }
        int i46 = 1;
        while (true) {
            if (i46 > iE7) {
                i46 = -1;
                break;
            }
            if (((zzgi) wVarF.get(i46)).b != -1) {
                break;
            }
            i46++;
        }
        if (i46 == -1) {
            return new zzgs(null, zzglVar, null, null);
        }
        Class cls2 = Boolean.TYPE;
        boolean[][] zArr4 = (boolean[][]) Array.newInstance((Class<?>) cls2, i13, i13);
        boolean[][] zArr5 = (boolean[][]) Array.newInstance((Class<?>) cls2, i13, i13);
        int i47 = 1;
        while (i47 < i13) {
            boolean[][] zArr6 = zArr5;
            for (int i48 = 0; i48 < i47; i48++) {
                boolean[] zArr7 = zArr4[i47];
                boolean[] zArr8 = zArr6[i47];
                boolean zD9 = zzhdVar.d();
                zArr8[i48] = zD9;
                zArr7[i48] = zD9;
            }
            i47++;
            zArr5 = zArr6;
        }
        boolean[][] zArr9 = zArr5;
        for (int i49 = 1; i49 < i13; i49++) {
            int i50 = 0;
            while (i50 < iE5) {
                boolean[][] zArr10 = zArr4;
                for (int i51 = 0; i51 < i49; i51++) {
                    boolean[] zArr11 = zArr9[i49];
                    if (zArr11[i51] && zArr9[i51][i50]) {
                        zArr11[i50] = true;
                        break;
                    }
                }
                i50++;
                zArr4 = zArr10;
            }
        }
        boolean[][] zArr12 = zArr4;
        int[] iArr25 = new int[i16];
        for (int i52 = 0; i52 < i13; i52++) {
            int i53 = 0;
            for (int i54 = 0; i54 < i52; i54++) {
                i53 += zArr12[i52][i54] ? 1 : 0;
            }
            iArr25[iArr17[i52]] = i53;
        }
        int i55 = 0;
        for (int i56 = 0; i56 < i13; i56++) {
            if (iArr25[iArr17[i56]] == 0) {
                i55++;
            }
        }
        if (i55 > 1) {
            return new zzgs(null, zzglVar, null, null);
        }
        int[] iArr26 = new int[i13];
        int[] iArr27 = new int[iG2];
        if (zzhdVar.d()) {
            int i57 = 0;
            while (i57 < i13) {
                int i58 = i57;
                iArr26[i58] = zzhdVar.e(3);
                i57 = i58 + 1;
            }
        } else {
            Arrays.fill(iArr26, 0, i13, iE6);
        }
        int i59 = 0;
        while (i59 < iG2) {
            int i60 = i59;
            int[] iArr28 = iArr26;
            int[] iArr29 = iArr27;
            int iMax = 0;
            for (int i61 = 0; i61 < iArr4[i60]; i61++) {
                iMax = Math.max(iMax, iArr28[((zzgi) wVarF.get(iArr12[i60][i61])).a]);
            }
            iArr29[i60] = iMax + 1;
            i59 = i60 + 1;
            iArr26 = iArr28;
            iArr27 = iArr29;
        }
        int[] iArr30 = iArr27;
        if (zzhdVar.d()) {
            int i62 = 0;
            while (i62 < iE5) {
                int i63 = i62 + 1;
                int i64 = i63;
                while (i64 < i13) {
                    if (zArr12[i64][i62]) {
                        zzhdVar.b(3);
                    }
                    i64++;
                    iE5 = iE5;
                }
                i62 = i63;
            }
        }
        zzhdVar.a();
        int iG4 = zzhdVar.g() + 1;
        zzgyy zzgyyVar2 = new zzgyy();
        zzgyyVar2.c(zzgkVarJ);
        if (iG4 > 1) {
            zzgyyVar2.c(zzgkVarJ2);
            for (int i65 = 2; i65 < iG4; i65++) {
                zzgkVarJ2 = j(zzhdVar, zzhdVar.d(), iE6, zzgkVarJ2);
                zzgyyVar2.c(zzgkVarJ2);
            }
        }
        w wVarF2 = zzgyyVar2.f();
        int iG5 = zzhdVar.g() + iG2;
        if (iG5 > iG2) {
            return new zzgs(null, zzglVar, null, null);
        }
        int iE9 = zzhdVar.e(2);
        boolean[][] zArr13 = (boolean[][]) Array.newInstance((Class<?>) cls2, iG5, i16);
        int[] iArr31 = new int[iG5];
        int i66 = 0;
        int[] iArr32 = new int[iG5];
        int i67 = 0;
        while (i67 < iG2) {
            iArr31[i67] = i66;
            int i68 = i67;
            int i69 = iArr13[i68];
            iArr32[i68] = i69;
            if (iE9 == 0) {
                zArr2 = zArr13;
                iArr = iArr31;
                iArr2 = iArr17;
                Arrays.fill(zArr13[i68], i66, iArr4[i68], true);
                iArr[i68] = iArr4[i68];
            } else {
                zArr2 = zArr13;
                iArr = iArr31;
                iArr2 = iArr17;
                if (iE9 == 1) {
                    for (int i70 = 0; i70 < iArr4[i68]; i70++) {
                        zArr2[i68][i70] = iArr12[i68][i70] == i69;
                    }
                    iArr[i68] = 1;
                } else {
                    i66 = 0;
                    zArr2[0][0] = true;
                    iArr[0] = 1;
                }
                i67 = i68 + 1;
                zArr13 = zArr2;
                iArr31 = iArr;
                iArr17 = iArr2;
            }
            i66 = 0;
            i67 = i68 + 1;
            zArr13 = zArr2;
            iArr31 = iArr;
            iArr17 = iArr2;
        }
        boolean[][] zArr14 = zArr13;
        int[] iArr33 = iArr31;
        int[] iArr34 = iArr17;
        int[] iArr35 = new int[i16];
        int i71 = 2;
        int[] iArr36 = new int[2];
        iArr36[1] = i16;
        iArr36[i66] = iG5;
        boolean[][] zArr15 = (boolean[][]) Array.newInstance((Class<?>) cls2, iArr36);
        int i72 = 1;
        int i73 = 0;
        while (i72 < iG5) {
            if (iE9 == i71) {
                for (int i74 = 0; i74 < iArr4[i72]; i74++) {
                    zArr14[i72][i74] = zzhdVar.d();
                    int i75 = iArr33[i72];
                    boolean z6 = zArr14[i72][i74];
                    iArr33[i72] = i75 + (z6 ? 1 : 0);
                    if (z6) {
                        iArr32[i72] = iArr12[i72][i74];
                    }
                }
            }
            if (i73 == 0) {
                i4 = 0;
                if (iArr12[i72][0] == 0 && zArr14[i72][0]) {
                    i73 = 0;
                    for (int i76 = 1; i76 < iArr4[i72]; i76++) {
                        if (iArr12[i72][i76] == i46 && zArr14[i72][i46]) {
                            i73 = i72;
                        }
                    }
                } else {
                    i73 = 0;
                }
            } else {
                i4 = 0;
            }
            int i77 = i4;
            while (i77 < iArr4[i72]) {
                if (iG4 > 1) {
                    zArr15[i72][i77] = zArr14[i72][i77];
                    wVar = wVarF2;
                    zArr = zArr15;
                    RoundingMode roundingMode = RoundingMode.CEILING;
                    int iB = zzhcg.b(iG4);
                    if (!zArr[i72][i77]) {
                        int i78 = ((zzgi) wVarF.get(iArr12[i72][i77])).a;
                        int i79 = i4;
                        while (i79 < i77) {
                            int i80 = i79;
                            if (zArr9[i78][((zzgi) wVarF.get(iArr12[i72][i80])).a]) {
                                zArr[i72][i77] = true;
                                break;
                            }
                            i79 = i80 + 1;
                        }
                    }
                    if (zArr[i72][i77]) {
                        if (i73 <= 0 || i72 != i73) {
                            zzhdVar.b(iB);
                        } else {
                            iArr35[i77] = zzhdVar.e(iB);
                        }
                    }
                } else {
                    wVar = wVarF2;
                    zArr = zArr15;
                }
                i77++;
                wVarF2 = wVar;
                zArr15 = zArr;
            }
            w wVar2 = wVarF2;
            boolean[][] zArr16 = zArr15;
            if (iArr33[i72] == 1 && iArr25[iArr32[i72]] > 0) {
                zzhdVar.a();
            }
            i72++;
            wVarF2 = wVar2;
            zArr15 = zArr16;
            i71 = 2;
        }
        w wVar3 = wVarF2;
        boolean[][] zArr17 = zArr15;
        if (i73 == 0) {
            return new zzgs(null, zzglVar, null, null);
        }
        int iG6 = zzhdVar.g();
        int i81 = iG6 + 1;
        c71.z(i81, "expectedSize");
        zzgyy zzgyyVar3 = new zzgyy(i81);
        int[] iArr37 = new int[i13];
        int i82 = 0;
        while (i82 < i81) {
            int iE10 = zzhdVar.e(16);
            int iE11 = zzhdVar.e(16);
            if (zzhdVar.d()) {
                iE2 = zzhdVar.e(2);
                if (iE2 == 3) {
                    zzhdVar.a();
                }
                iE3 = zzhdVar.e(4);
                iE4 = zzhdVar.e(4);
            } else {
                iE2 = 0;
                iE3 = 0;
                iE4 = 0;
            }
            if (zzhdVar.d()) {
                int iG7 = zzhdVar.g();
                int iG8 = zzhdVar.g();
                int iG9 = zzhdVar.g();
                int iG10 = zzhdVar.g();
                iE10 = jc1.B(iG7, iG8, (iE2 == 1 || iE2 == 2) ? 2 : 1, iE10);
                i3 = iE11 - ((iE2 == 1 ? 2 : 1) * (iG9 + iG10));
            } else {
                i3 = iE11;
            }
            zzgyyVar3.c(new zzgm(iE2, iE3, iE4, iE10, i3));
            i82++;
            wVar3 = wVar3;
        }
        w wVar4 = wVar3;
        if (i81 <= 1 || !zzhdVar.d()) {
            for (int i83 = 1; i83 < i13; i83++) {
                iArr37[i83] = Math.min(i83, iG6);
            }
        } else {
            RoundingMode roundingMode2 = RoundingMode.CEILING;
            int iB2 = zzhcg.b(i81);
            for (int i84 = 1; i84 < i13; i84++) {
                iArr37[i84] = zzhdVar.e(iB2);
            }
        }
        zzgn zzgnVar = new zzgn(zzgyyVar3.f(), iArr37);
        zzhdVar.b(2);
        for (int i85 = 1; i85 < i13; i85++) {
            if (iArr25[iArr34[i85]] == 0) {
                zzhdVar.a();
            }
        }
        for (int i86 = 1; i86 < iG5; i86++) {
            boolean zD10 = zzhdVar.d();
            int i87 = 0;
            while (i87 < iArr30[i86]) {
                if ((i87 <= 0 || !zD10) ? i87 == 0 : zzhdVar.d()) {
                    for (int i88 = 0; i88 < iArr4[i86]; i88++) {
                        if (zArr17[i86][i88]) {
                            zzhdVar.g();
                        }
                    }
                    zzhdVar.g();
                    zzhdVar.g();
                }
                i87++;
            }
        }
        int iG11 = zzhdVar.g() + 2;
        if (zzhdVar.d()) {
            zzhdVar.b(iG11);
        } else {
            for (int i89 = 1; i89 < i13; i89++) {
                for (int i90 = 0; i90 < i89; i90++) {
                    if (zArr12[i89][i90]) {
                        zzhdVar.b(iG11);
                    }
                }
            }
        }
        int iG12 = zzhdVar.g();
        for (int i91 = 1; i91 <= iG12; i91++) {
            zzhdVar.b(8);
        }
        if (zzhdVar.d()) {
            int i92 = zzhdVar.e;
            if (i92 > 0) {
                zzhdVar.b(8 - i92);
            }
            if (zzhdVar.d() || zzhdVar.d()) {
                zzhdVar.a();
            }
            boolean zD11 = zzhdVar.d();
            boolean zD12 = zzhdVar.d();
            if (zD11 || zD12) {
                for (int i93 = 0; i93 < iG2; i93++) {
                    for (int i94 = 0; i94 < iArr30[i93]; i94++) {
                        boolean zD13 = zD11 ? zzhdVar.d() : false;
                        boolean zD14 = zD12 ? zzhdVar.d() : false;
                        if (zD13) {
                            zzhdVar.b(32);
                        }
                        if (zD14) {
                            zzhdVar.b(18);
                        }
                    }
                }
            }
            boolean zD15 = zzhdVar.d();
            if (zD15) {
                z = true;
                iE = zzhdVar.e(4) + 1;
            } else {
                z = true;
                iE = i13;
            }
            c71.z(iE, "expectedSize");
            zzgyy zzgyyVar4 = new zzgyy(iE);
            int[] iArr38 = new int[i13];
            int i95 = 0;
            while (i95 < iE) {
                zzhdVar.b(3);
                int i96 = z != zzhdVar.d() ? 2 : 1;
                int iB3 = zzi.b(zzhdVar.e(8));
                int iC = zzi.c(zzhdVar.e(8));
                zzhdVar.b(8);
                zzgyyVar4.c(new zzgq(iB3, i96, iC));
                i95++;
                z = true;
            }
            if (zD15 && iE > 1) {
                for (int i97 = 0; i97 < i13; i97++) {
                    iArr38[i97] = zzhdVar.e(4);
                }
            }
            zzgrVar = new zzgr(zzgyyVar4.f(), iArr38);
        } else {
            zzgrVar = null;
        }
        return new zzgs(wVarF, new zzgl(wVar4, iArr35), zzgnVar, zzgrVar);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x004b  */
    /* JADX WARN: Code duplicated, block: B:37:0x00b3  */
    public static zzgp f(byte[] bArr, int i, int i2, zzgs zzgsVar) {
        int i3;
        boolean z;
        int i4;
        int iB;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int iG;
        int i10;
        int i11;
        float f;
        int i12;
        int i13;
        int i14;
        int i15;
        int iC;
        int i16;
        zzgr zzgrVar;
        int iB2;
        int i17;
        zzgn zzgnVar;
        zzgj zzgjVarI = i(new zzhd(bArr, i, i2));
        zzhd zzhdVar = new zzhd(bArr, i + 2, i2);
        int i18 = 4;
        zzhdVar.b(4);
        int iE = zzhdVar.e(3);
        int i19 = zzgjVarI.b;
        if (i19 == 0 || iE != 7) {
            i3 = iE;
            z = false;
        } else {
            z = true;
            i3 = 7;
        }
        if (zzgsVar != null) {
            zzgzb zzgzbVar = zzgsVar.a;
            if (zzgzbVar.isEmpty()) {
                i4 = 0;
            } else {
                i4 = ((zzgi) zzgzbVar.get(Math.min(i19, zzgzbVar.size() - 1))).a;
            }
        } else {
            i4 = 0;
        }
        zzgk zzgkVarJ = null;
        if (!z) {
            zzhdVar.a();
            zzgkVarJ = j(zzhdVar, true, i3, null);
        } else if (zzgsVar != null) {
            zzgl zzglVar = zzgsVar.b;
            int i20 = zzglVar.b[i4];
            zzgzb zzgzbVar2 = zzglVar.a;
            if (zzgzbVar2.size() > i20) {
                zzgkVarJ = (zzgk) zzgzbVar2.get(i20);
            }
        }
        zzgk zzgkVar = zzgkVarJ;
        zzhdVar.g();
        if (z) {
            int iE2 = zzhdVar.d() ? zzhdVar.e(8) : -1;
            if (zzgsVar == null || (zzgnVar = zzgsVar.c) == null) {
                i9 = 0;
                i10 = 0;
                iG = 0;
                i8 = 0;
                i6 = 0;
                i7 = 0;
            } else {
                if (iE2 == -1) {
                    iE2 = zzgnVar.b[i4];
                }
                if (iE2 != -1) {
                    zzgzb zzgzbVar3 = zzgnVar.a;
                    if (zzgzbVar3.size() > iE2) {
                        zzgm zzgmVar = (zzgm) zzgzbVar3.get(iE2);
                        int i21 = zzgmVar.a;
                        int i22 = zzgmVar.d;
                        int i23 = zzgmVar.e;
                        int i24 = zzgmVar.b;
                        i6 = i22;
                        i9 = i23;
                        i7 = i9;
                        iG = zzgmVar.c;
                        i8 = i6;
                        i10 = i24;
                    } else {
                        i9 = 0;
                        i10 = 0;
                        iG = 0;
                        i8 = 0;
                        i6 = 0;
                        i7 = 0;
                    }
                } else {
                    i9 = 0;
                    i10 = 0;
                    iG = 0;
                    i8 = 0;
                    i6 = 0;
                    i7 = 0;
                }
            }
        } else {
            int iG2 = zzhdVar.g();
            if (iG2 == 3) {
                zzhdVar.a();
                iG2 = 3;
            }
            int iG3 = zzhdVar.g();
            int iG4 = zzhdVar.g();
            if (zzhdVar.d()) {
                int iG5 = zzhdVar.g();
                int iG6 = zzhdVar.g();
                int iG7 = zzhdVar.g();
                int iG8 = zzhdVar.g();
                iB = jc1.B(iG5, iG6, (iG2 == 1 || iG2 == 2) ? 2 : 1, iG3);
                i5 = iG4 - ((iG2 == 1 ? 2 : 1) * (iG7 + iG8));
            } else {
                iB = iG3;
                i5 = iG4;
            }
            int iG9 = zzhdVar.g();
            i6 = iG3;
            i7 = iG4;
            i8 = iB;
            i9 = i5;
            iG = zzhdVar.g();
            i10 = iG9;
        }
        int iG10 = zzhdVar.g();
        if (z) {
            i11 = -1;
        } else {
            int iMax = -1;
            for (int i25 = true != zzhdVar.d() ? i3 : 0; i25 <= i3; i25++) {
                zzhdVar.g();
                iMax = Math.max(zzhdVar.g(), iMax);
                zzhdVar.g();
            }
            i11 = iMax;
        }
        zzhdVar.g();
        zzhdVar.g();
        zzhdVar.g();
        zzhdVar.g();
        zzhdVar.g();
        zzhdVar.g();
        if (zzhdVar.d()) {
            if (z && zzhdVar.d()) {
                zzhdVar.b(6);
            } else if (zzhdVar.d()) {
                int i26 = 0;
                while (i26 < i18) {
                    int i27 = 0;
                    while (i27 < 6) {
                        if (zzhdVar.d()) {
                            int iMin = Math.min(64, 1 << ((i26 + i26) + i18));
                            if (i26 > 1) {
                                zzhdVar.f();
                            }
                            for (int i28 = 0; i28 < iMin; i28++) {
                                zzhdVar.f();
                            }
                        } else {
                            zzhdVar.g();
                        }
                        i27 += i26 == 3 ? 3 : 1;
                        i18 = 4;
                    }
                    i26++;
                    i18 = 4;
                }
            }
        }
        zzhdVar.b(2);
        if (zzhdVar.d()) {
            zzhdVar.b(8);
            zzhdVar.g();
            zzhdVar.g();
            zzhdVar.a();
        }
        int iG11 = zzhdVar.g();
        int[] iArr = new int[0];
        int[] iArr2 = new int[0];
        int i29 = 0;
        int i30 = -1;
        int i31 = -1;
        while (i29 < iG11) {
            if (i29 == 0 || !zzhdVar.d()) {
                int iG12 = zzhdVar.g();
                int iG13 = zzhdVar.g();
                iArr = new int[iG12];
                int i32 = 0;
                while (i32 < iG12) {
                    iArr[i32] = (i32 > 0 ? iArr[i32 - 1] : 0) - (zzhdVar.g() + 1);
                    zzhdVar.a();
                    i32++;
                }
                int[] iArr3 = new int[iG13];
                int i33 = 0;
                while (i33 < iG13) {
                    iArr3[i33] = zzhdVar.g() + 1 + (i33 > 0 ? iArr3[i33 - 1] : 0);
                    zzhdVar.a();
                    i33++;
                }
                i31 = iG13;
                iArr2 = iArr3;
                i30 = iG12;
            } else {
                int i34 = i30 + i31;
                boolean zD = zzhdVar.d();
                int iG14 = zzhdVar.g() + 1;
                int i35 = 1 - ((zD ? 1 : 0) + (zD ? 1 : 0));
                int[] iArr4 = iArr;
                int i36 = i34 + 1;
                boolean[] zArr = new boolean[i36];
                for (int i37 = 0; i37 <= i34; i37++) {
                    if (zzhdVar.d()) {
                        zArr[i37] = true;
                    } else {
                        zArr[i37] = zzhdVar.d();
                    }
                }
                int i38 = i31 - 1;
                int[] iArr5 = new int[i36];
                int[] iArr6 = new int[i36];
                int i39 = 0;
                while (true) {
                    i17 = i35 * iG14;
                    if (i38 < 0) {
                        break;
                    }
                    int i40 = iArr2[i38] + i17;
                    if (i40 < 0 && zArr[i30 + i38]) {
                        iArr5[i39] = i40;
                        i39++;
                    }
                    i38--;
                }
                if (i17 < 0 && zArr[i34]) {
                    iArr5[i39] = i17;
                    i39++;
                }
                int[] iArr7 = iArr2;
                int i41 = i39;
                for (int i42 = 0; i42 < i30; i42++) {
                    int i43 = iArr4[i42] + i17;
                    if (i43 < 0 && zArr[i42]) {
                        iArr5[i41] = i43;
                        i41++;
                    }
                }
                int[] iArrCopyOf = Arrays.copyOf(iArr5, i41);
                int i44 = 0;
                for (int i45 = i30 - 1; i45 >= 0; i45--) {
                    int i46 = iArr4[i45] + i17;
                    if (i46 > 0 && zArr[i45]) {
                        iArr6[i44] = i46;
                        i44++;
                    }
                }
                if (i17 > 0 && zArr[i34]) {
                    iArr6[i44] = i17;
                    i44++;
                }
                int i47 = i44;
                for (int i48 = 0; i48 < i31; i48++) {
                    int i49 = iArr7[i48] + i17;
                    if (i49 > 0 && zArr[i30 + i48]) {
                        iArr6[i47] = i49;
                        i47++;
                    }
                }
                int[] iArrCopyOf2 = Arrays.copyOf(iArr6, i47);
                i30 = i41;
                i31 = i47;
                iArr = iArrCopyOf;
                iArr2 = iArrCopyOf2;
            }
            i29++;
            iG11 = iG11;
            i4 = i4;
        }
        int i50 = i4;
        if (zzhdVar.d()) {
            int iG15 = zzhdVar.g();
            for (int i51 = 0; i51 < iG15; i51++) {
                zzhdVar.b(iG10 + 5);
            }
        }
        zzhdVar.b(2);
        float f2 = 1.0f;
        if (zzhdVar.d()) {
            if (zzhdVar.d()) {
                int iE3 = zzhdVar.e(8);
                if (iE3 == 255) {
                    int iE4 = zzhdVar.e(16);
                    int iE5 = zzhdVar.e(16);
                    if (iE4 != 0 && iE5 != 0) {
                        f2 = iE4 / iE5;
                    }
                } else if (iE3 < 17) {
                    f2 = b[iE3];
                } else {
                    rl3.q(new StringBuilder(String.valueOf(iE3).length() + 35), "Unexpected aspect_ratio_idc value: ", iE3, "NalUnitUtil");
                }
            }
            if (zzhdVar.d()) {
                zzhdVar.a();
            }
            if (zzhdVar.d()) {
                zzhdVar.b(3);
                i16 = true != zzhdVar.d() ? 2 : 1;
                if (zzhdVar.d()) {
                    int iE6 = zzhdVar.e(8);
                    int iE7 = zzhdVar.e(8);
                    zzhdVar.b(8);
                    iB2 = zzi.b(iE6);
                    iC = zzi.c(iE7);
                } else {
                    iC = -1;
                    iB2 = -1;
                }
            } else {
                if (zzgsVar != null && (zzgrVar = zzgsVar.d) != null) {
                    int i52 = zzgrVar.b[i50];
                    zzgzb zzgzbVar4 = zzgrVar.a;
                    if (zzgzbVar4.size() > i52) {
                        zzgq zzgqVar = (zzgq) zzgzbVar4.get(i52);
                        iB2 = zzgqVar.a;
                        int i53 = zzgqVar.b;
                        iC = zzgqVar.c;
                        i16 = i53;
                    }
                }
                iC = -1;
                i16 = -1;
                iB2 = -1;
            }
            if (zzhdVar.d()) {
                zzhdVar.g();
                zzhdVar.g();
            }
            zzhdVar.a();
            if (zzhdVar.d()) {
                i9 += i9;
            }
            i15 = iC;
            f = f2;
            i14 = i16;
            i12 = i9;
            i13 = iB2;
        } else {
            f = 1.0f;
            i12 = i9;
            i13 = -1;
            i14 = -1;
            i15 = -1;
        }
        return new zzgp(i3, zzgkVar, i10, iG, i8, i12, i6, i7, f, i11, i13, i14, i15);
    }

    public static int g(byte[] bArr, int i, int i2, boolean[] zArr) {
        int i3 = i2 - i;
        zzgvz.f(i3 >= 0);
        if (i3 == 0) {
            return i2;
        }
        if (zArr[0]) {
            h(zArr);
            return i - 3;
        }
        if (i3 > 1 && zArr[1] && bArr[i] == 1) {
            h(zArr);
            return i - 2;
        }
        if (i3 > 2 && zArr[2] && bArr[i] == 0 && bArr[i + 1] == 1) {
            h(zArr);
            return i - 1;
        }
        int i4 = i2 - 1;
        int i5 = i + 2;
        while (i5 < i4) {
            byte b2 = bArr[i5];
            if ((b2 & 254) == 0) {
                int i6 = i5 - 2;
                if (bArr[i6] == 0 && bArr[i5 - 1] == 0 && b2 == 1) {
                    h(zArr);
                    return i6;
                }
                i5 = i6;
            }
            i5 += 3;
        }
        zArr[0] = i3 <= 2 ? !(i3 != 2 ? !(zArr[1] && bArr[i4] == 1) : !(zArr[2] && bArr[i2 + (-2)] == 0 && bArr[i4] == 1)) : bArr[i2 + (-3)] == 0 && bArr[i2 + (-2)] == 0 && bArr[i4] == 1;
        zArr[1] = i3 <= 1 ? zArr[2] && bArr[i4] == 0 : bArr[i2 + (-2)] == 0 && bArr[i4] == 0;
        zArr[2] = bArr[i4] == 0;
        return i2;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x005c  */
    /* JADX WARN: Code duplicated, block: B:23:0x0062  */
    /* JADX WARN: Code duplicated, block: B:26:0x006a  */
    /* JADX WARN: Code duplicated, block: B:30:0x0074  */
    /* JADX WARN: Code duplicated, block: B:39:0x006c A[SYNTHETIC] */
    public static zzgk j(zzhd zzhdVar, boolean z, int i, zzgk zzgkVar) {
        int[] iArr;
        int i2;
        boolean z2;
        int i3;
        int i4;
        boolean zD;
        int iE;
        int i5;
        int i6;
        int[] iArr2 = new int[6];
        if (!z) {
            if (zzgkVar != null) {
                int i7 = zzgkVar.a;
                zD = zzgkVar.b;
                iE = zzgkVar.c;
                i5 = zzgkVar.d;
                iArr2 = zzgkVar.e;
                i2 = i7;
            } else {
                iArr = iArr2;
                i2 = 0;
                z2 = false;
                i3 = 0;
                i4 = 0;
            }
            int iE2 = zzhdVar.e(8);
            i6 = 0;
            for (int i8 = 0; i8 < i; i8++) {
                if (zzhdVar.d()) {
                    i6 += 88;
                }
                if (zzhdVar.d()) {
                    i6 += 8;
                }
            }
            zzhdVar.b(i6);
            if (i > 0) {
                int i9 = 8 - i;
                zzhdVar.b(i9 + i9);
            }
            return new zzgk(i2, z2, i3, i4, iArr, iE2);
        }
        int iE3 = zzhdVar.e(2);
        zD = zzhdVar.d();
        iE = zzhdVar.e(5);
        i5 = 0;
        for (int i10 = 0; i10 < 32; i10++) {
            if (zzhdVar.d()) {
                i5 |= 1 << i10;
            }
        }
        for (int i11 = 0; i11 < 6; i11++) {
            iArr2[i11] = zzhdVar.e(8);
        }
        i2 = iE3;
        iArr = iArr2;
        z2 = zD;
        i3 = iE;
        i4 = i5;
        int iE4 = zzhdVar.e(8);
        i6 = 0;
        while (i8 < i) {
            if (zzhdVar.d()) {
                i6 += 88;
            }
            if (zzhdVar.d()) {
                i6 += 8;
            }
        }
        zzhdVar.b(i6);
        if (i > 0) {
            int i12 = 8 - i;
            zzhdVar.b(i12 + i12);
        }
        return new zzgk(i2, z2, i3, i4, iArr, iE4);
    }

    public static String l(zzv zzvVar) {
        String str;
        String str2 = zzvVar.o;
        if (Objects.equals(str2, "video/dolby-vision") && (str = zzvVar.k) != null) {
            if (str.startsWith("dva1") || str.startsWith("dvav")) {
                return "video/avc";
            }
            if (str.startsWith("dvh1") || str.startsWith("dvhe")) {
                return "video/hevc";
            }
        }
        return str2;
    }

    public static int b(zzv zzvVar) {
        String strL = l(zzvVar);
        if (Objects.equals(strL, "video/avc")) {
            return 1;
        }
        if (!Objects.equals(strL, "video/hevc") && !Objects.equals(strL, "video/vvc")) {
            return 0;
        }
        return 2;
    }

    public static zzgj i(zzhd zzhdVar) {
        zzhdVar.a();
        return new zzgj(zzhdVar.e(6), zzhdVar.e(6), zzhdVar.e(3) - 1);
    }

    public static void k(zzhd zzhdVar) {
        int iG = zzhdVar.g() + 1;
        zzhdVar.b(8);
        for (int i = 0; i < iG; i++) {
            zzhdVar.g();
            zzhdVar.g();
            zzhdVar.a();
        }
        zzhdVar.b(20);
    }
}
