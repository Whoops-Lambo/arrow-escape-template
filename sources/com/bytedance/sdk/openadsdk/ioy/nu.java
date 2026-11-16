package com.bytedance.sdk.openadsdk.ioy;

import defpackage.d;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
final class nu {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:15:0x0040 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:16:0x0041 A[RETURN] */
    public static boolean kgy(int i, int i2, int i3) {
        int i4;
        switch (i) {
            case 0:
                i3 += i2;
                i4 = i3 & 1;
                if (i4 == 0) {
                    return true;
                }
                return false;
            case 1:
                i4 = i3 & 1;
                if (i4 == 0) {
                    return true;
                }
                return false;
            case 2:
                i4 = i2 % 3;
                if (i4 == 0) {
                    return true;
                }
                return false;
            case 3:
                i4 = (i3 + i2) % 3;
                if (i4 == 0) {
                    return true;
                }
                return false;
            case 4:
                i4 = ((i2 / 3) + (i3 / 2)) & 1;
                if (i4 == 0) {
                    return true;
                }
                return false;
            case 5:
                int i5 = i3 * i2;
                i4 = (i5 & 1) + (i5 % 3);
                if (i4 == 0) {
                    return true;
                }
                return false;
            case 6:
                int i6 = i3 * i2;
                i3 = (i6 % 3) + (i6 & 1);
                i4 = i3 & 1;
                if (i4 == 0) {
                    return true;
                }
                return false;
            case 7:
                i4 = (((i3 * i2) % 3) + ((i3 + i2) & 1)) & 1;
                if (i4 == 0) {
                    return true;
                }
                return false;
            default:
                d.r("Invalid mask pattern: ".concat(String.valueOf(i)));
                return false;
        }
    }

    public static int ahm(rz rzVar) {
        byte[][] bArrRz = rzVar.rz();
        int iAhm = rzVar.ahm();
        int iKgy = rzVar.kgy();
        int i = 0;
        for (int i2 = 0; i2 < iKgy - 1; i2++) {
            byte[] bArr = bArrRz[i2];
            int i3 = 0;
            while (i3 < iAhm - 1) {
                byte b = bArr[i3];
                int i4 = i3 + 1;
                if (b == bArr[i4]) {
                    byte[] bArr2 = bArrRz[i2 + 1];
                    if (b == bArr2[i3] && b == bArr2[i4]) {
                        i++;
                    }
                }
                i3 = i4;
            }
        }
        return i * 3;
    }

    public static int rz(rz rzVar) {
        byte[][] bArrRz = rzVar.rz();
        int iAhm = rzVar.ahm();
        int iKgy = rzVar.kgy();
        int i = 0;
        for (int i2 = 0; i2 < iKgy; i2++) {
            for (int i3 = 0; i3 < iAhm; i3++) {
                byte[] bArr = bArrRz[i2];
                int i4 = i3 + 6;
                if (i4 < iAhm && bArr[i3] == 1 && bArr[i3 + 1] == 0 && bArr[i3 + 2] == 1 && bArr[i3 + 3] == 1 && bArr[i3 + 4] == 1 && bArr[i3 + 5] == 0 && bArr[i4] == 1 && (kgy(bArr, i3 - 4, i3) || kgy(bArr, i3 + 7, i3 + 11))) {
                    i++;
                }
                int i5 = i2 + 6;
                if (i5 < iKgy && bArrRz[i2][i3] == 1 && bArrRz[i2 + 1][i3] == 0 && bArrRz[i2 + 2][i3] == 1 && bArrRz[i2 + 3][i3] == 1 && bArrRz[i2 + 4][i3] == 1 && bArrRz[i2 + 5][i3] == 0 && bArrRz[i5][i3] == 1 && (kgy(bArrRz, i3, i2 - 4, i2) || kgy(bArrRz, i3, i2 + 7, i2 + 11))) {
                    i++;
                }
            }
        }
        return i * 40;
    }

    public static int uq(rz rzVar) {
        byte[][] bArrRz = rzVar.rz();
        int iAhm = rzVar.ahm();
        int iKgy = rzVar.kgy();
        int i = 0;
        for (int i2 = 0; i2 < iKgy; i2++) {
            byte[] bArr = bArrRz[i2];
            for (int i3 = 0; i3 < iAhm; i3++) {
                if (bArr[i3] == 1) {
                    i++;
                }
            }
        }
        int iAhm2 = rzVar.ahm() * rzVar.kgy();
        return ((Math.abs((i * 2) - iAhm2) * 10) / iAhm2) * 10;
    }

    private static boolean kgy(byte[] bArr, int i, int i2) {
        if (i < 0 || bArr.length < i2) {
            return false;
        }
        while (i < i2) {
            if (bArr[i] == 1) {
                return false;
            }
            i++;
        }
        return true;
    }

    private static boolean kgy(byte[][] bArr, int i, int i2, int i3) {
        if (i2 < 0 || bArr.length < i3) {
            return false;
        }
        while (i2 < i3) {
            if (bArr[i2][i] == 1) {
                return false;
            }
            i2++;
        }
        return true;
    }

    public static int kgy(rz rzVar) {
        return kgy(rzVar, true) + kgy(rzVar, false);
    }

    private static int kgy(rz rzVar, boolean z) {
        int iKgy = z ? rzVar.kgy() : rzVar.ahm();
        int iAhm = z ? rzVar.ahm() : rzVar.kgy();
        byte[][] bArrRz = rzVar.rz();
        int i = 0;
        for (int i2 = 0; i2 < iKgy; i2++) {
            byte b = -1;
            int i3 = 0;
            for (int i4 = 0; i4 < iAhm; i4++) {
                byte b2 = z ? bArrRz[i2][i4] : bArrRz[i4][i2];
                if (b2 == b) {
                    i3++;
                } else {
                    if (i3 >= 5) {
                        i += i3 - 2;
                    }
                    i3 = 1;
                    b = b2;
                }
            }
            if (i3 >= 5) {
                i = (i3 - 2) + i;
            }
        }
        return i;
    }
}
