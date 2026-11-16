package com.bytedance.sdk.openadsdk.ioy;

import com.vungle.ads.internal.protos.Sdk;
import defpackage.d;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
final class at {
    private static final int[][] kgy = {new int[]{1, 1, 1, 1, 1, 1, 1}, new int[]{1, 0, 0, 0, 0, 0, 1}, new int[]{1, 0, 1, 1, 1, 0, 1}, new int[]{1, 0, 1, 1, 1, 0, 1}, new int[]{1, 0, 1, 1, 1, 0, 1}, new int[]{1, 0, 0, 0, 0, 0, 1}, new int[]{1, 1, 1, 1, 1, 1, 1}};
    private static final int[][] ahm = {new int[]{1, 1, 1, 1, 1}, new int[]{1, 0, 0, 0, 1}, new int[]{1, 0, 1, 0, 1}, new int[]{1, 0, 0, 0, 1}, new int[]{1, 1, 1, 1, 1}};
    private static final int[][] rz = {new int[]{-1, -1, -1, -1, -1, -1, -1}, new int[]{6, 18, -1, -1, -1, -1, -1}, new int[]{6, 22, -1, -1, -1, -1, -1}, new int[]{6, 26, -1, -1, -1, -1, -1}, new int[]{6, 30, -1, -1, -1, -1, -1}, new int[]{6, 34, -1, -1, -1, -1, -1}, new int[]{6, 22, 38, -1, -1, -1, -1}, new int[]{6, 24, 42, -1, -1, -1, -1}, new int[]{6, 26, 46, -1, -1, -1, -1}, new int[]{6, 28, 50, -1, -1, -1, -1}, new int[]{6, 30, 54, -1, -1, -1, -1}, new int[]{6, 32, 58, -1, -1, -1, -1}, new int[]{6, 34, 62, -1, -1, -1, -1}, new int[]{6, 26, 46, 66, -1, -1, -1}, new int[]{6, 26, 48, 70, -1, -1, -1}, new int[]{6, 26, 50, 74, -1, -1, -1}, new int[]{6, 30, 54, 78, -1, -1, -1}, new int[]{6, 30, 56, 82, -1, -1, -1}, new int[]{6, 30, 58, 86, -1, -1, -1}, new int[]{6, 34, 62, 90, -1, -1, -1}, new int[]{6, 28, 50, 72, 94, -1, -1}, new int[]{6, 26, 50, 74, 98, -1, -1}, new int[]{6, 30, 54, 78, 102, -1, -1}, new int[]{6, 28, 54, 80, 106, -1, -1}, new int[]{6, 32, 58, 84, 110, -1, -1}, new int[]{6, 30, 58, 86, Sdk.SDKError.Reason.ASSET_WRITE_ERROR_VALUE, -1, -1}, new int[]{6, 34, 62, 90, Sdk.SDKError.Reason.PROTOBUF_SERIALIZATION_ERROR_VALUE, -1, -1}, new int[]{6, 26, 50, 74, 98, Sdk.SDKError.Reason.INVALID_ADS_ENDPOINT_VALUE, -1}, new int[]{6, 30, 54, 78, 102, 126, -1}, new int[]{6, 26, 52, 78, 104, 130, -1}, new int[]{6, 30, 56, 82, 108, 134, -1}, new int[]{6, 34, 60, 86, 112, 138, -1}, new int[]{6, 30, 58, 86, Sdk.SDKError.Reason.ASSET_WRITE_ERROR_VALUE, 142, -1}, new int[]{6, 34, 62, 90, Sdk.SDKError.Reason.PROTOBUF_SERIALIZATION_ERROR_VALUE, 146, -1}, new int[]{6, 30, 54, 78, 102, 126, 150}, new int[]{6, 24, 50, 76, 102, 128, 154}, new int[]{6, 28, 54, 80, 106, Sdk.SDKError.Reason.OMSDK_DOWNLOAD_JS_ERROR_VALUE, 158}, new int[]{6, 32, 58, 84, 110, 136, 162}, new int[]{6, 26, 54, 82, 110, 138, 166}, new int[]{6, 30, 58, 86, Sdk.SDKError.Reason.ASSET_WRITE_ERROR_VALUE, 142, 170}};
    private static final int[][] uq = {new int[]{8, 0}, new int[]{8, 1}, new int[]{8, 2}, new int[]{8, 3}, new int[]{8, 4}, new int[]{8, 5}, new int[]{8, 7}, new int[]{8, 8}, new int[]{7, 8}, new int[]{5, 8}, new int[]{4, 8}, new int[]{3, 8}, new int[]{2, 8}, new int[]{1, 8}, new int[]{0, 8}};

    private static void uq(rz rzVar) throws sx {
        int length = kgy[0].length;
        uq(0, 0, rzVar);
        uq(rzVar.ahm() - length, 0, rzVar);
        uq(0, rzVar.ahm() - length, rzVar);
        kgy(0, 7, rzVar);
        kgy(rzVar.ahm() - 8, 7, rzVar);
        kgy(0, rzVar.ahm() - 8, rzVar);
        ahm(7, 0, rzVar);
        ahm(rzVar.kgy() - 8, 0, rzVar);
        ahm(7, rzVar.kgy() - 7, rzVar);
    }

    public static void ahm(fpp fppVar, rz rzVar) throws sx {
        if (fppVar.kgy() >= 7) {
            kgy kgyVar = new kgy();
            kgy(fppVar, kgyVar);
            int i = 17;
            for (int i2 = 0; i2 < 6; i2++) {
                for (int i3 = 0; i3 < 3; i3++) {
                    boolean zKgy = kgyVar.kgy(i);
                    i--;
                    rzVar.kgy(i2, (rzVar.kgy() - 11) + i3, zKgy);
                    rzVar.kgy((rzVar.kgy() - 11) + i3, i2, zKgy);
                }
            }
        }
    }

    public static void kgy(kgy kgyVar, int i, rz rzVar) throws sx {
        boolean zKgy;
        int iAhm = rzVar.ahm() - 1;
        int iKgy = rzVar.kgy() - 1;
        int i2 = 0;
        int i3 = -1;
        while (iAhm > 0) {
            if (iAhm == 6) {
                iAhm--;
            }
            while (iKgy >= 0 && iKgy < rzVar.kgy()) {
                for (int i4 = 0; i4 < 2; i4++) {
                    int i5 = iAhm - i4;
                    if (ahm(rzVar.kgy(i5, iKgy))) {
                        if (i2 < kgyVar.kgy()) {
                            zKgy = kgyVar.kgy(i2);
                            i2++;
                        } else {
                            zKgy = false;
                        }
                        if (i != -1 && nu.kgy(i, i5, iKgy)) {
                            zKgy = !zKgy;
                        }
                        rzVar.kgy(i5, iKgy, zKgy);
                    }
                }
                iKgy += i3;
            }
            i3 = -i3;
            iKgy += i3;
            iAhm -= 2;
        }
        if (i2 == kgyVar.kgy()) {
            return;
        }
        throw new sx("Not all bits consumed: " + i2 + '/' + kgyVar.kgy());
    }

    private static void rz(fpp fppVar, rz rzVar) {
        if (fppVar.kgy() >= 2) {
            int[] iArr = rz[fppVar.kgy() - 1];
            for (int i : iArr) {
                if (i >= 0) {
                    for (int i2 : iArr) {
                        if (i2 >= 0 && ahm(rzVar.kgy(i2, i))) {
                            rz(i2 - 2, i - 2, rzVar);
                        }
                    }
                }
            }
        }
    }

    private static void rz(int i, int i2, rz rzVar) {
        for (int i3 = 0; i3 < 5; i3++) {
            int[] iArr = ahm[i3];
            for (int i4 = 0; i4 < 5; i4++) {
                rzVar.kgy(i + i4, i2 + i3, iArr[i4]);
            }
        }
    }

    private static boolean ahm(int i) {
        return i == -1;
    }

    private static void ahm(rz rzVar) {
        int i = 8;
        while (i < rzVar.ahm() - 8) {
            int i2 = i + 1;
            int i3 = i2 % 2;
            if (ahm(rzVar.kgy(i, 6))) {
                rzVar.kgy(i, 6, i3);
            }
            if (ahm(rzVar.kgy(6, i))) {
                rzVar.kgy(6, i, i3);
            }
            i = i2;
        }
    }

    private static void rz(rz rzVar) throws sx {
        if (rzVar.kgy(8, rzVar.kgy() - 8) != 0) {
            rzVar.kgy(8, rzVar.kgy() - 8, 1);
            return;
        }
        throw new sx();
    }

    private static void ahm(int i, int i2, rz rzVar) throws sx {
        for (int i3 = 0; i3 < 7; i3++) {
            int i4 = i2 + i3;
            if (ahm(rzVar.kgy(i, i4))) {
                rzVar.kgy(i, i4, 0);
            } else {
                throw new sx();
            }
        }
    }

    private static void uq(int i, int i2, rz rzVar) {
        for (int i3 = 0; i3 < 7; i3++) {
            int[] iArr = kgy[i3];
            for (int i4 = 0; i4 < 7; i4++) {
                rzVar.kgy(i + i4, i2 + i3, iArr[i4]);
            }
        }
    }

    public static void kgy(kgy kgyVar, fi fiVar, fpp fppVar, int i, rz rzVar) throws sx {
        kgy(rzVar);
        kgy(fppVar, rzVar);
        kgy(fiVar, i, rzVar);
        ahm(fppVar, rzVar);
        kgy(kgyVar, i, rzVar);
    }

    public static void kgy(fpp fppVar, rz rzVar) throws sx {
        uq(rzVar);
        rz(rzVar);
        rz(fppVar, rzVar);
        ahm(rzVar);
    }

    public static void kgy(fi fiVar, int i, rz rzVar) throws sx {
        int iKgy;
        kgy kgyVar = new kgy();
        kgy(fiVar, i, kgyVar);
        for (int i2 = 0; i2 < kgyVar.kgy(); i2++) {
            boolean zKgy = kgyVar.kgy((kgyVar.kgy() - 1) - i2);
            int[] iArr = uq[i2];
            rzVar.kgy(iArr[0], iArr[1], zKgy);
            int iAhm = 8;
            if (i2 < 8) {
                iKgy = 8;
                iAhm = (rzVar.ahm() - i2) - 1;
            } else {
                iKgy = (i2 - 8) + (rzVar.kgy() - 7);
            }
            rzVar.kgy(iAhm, iKgy, zKgy);
        }
    }

    public static void kgy(rz rzVar) {
        rzVar.kgy((byte) -1);
    }

    public static int kgy(int i) {
        return 32 - Integer.numberOfLeadingZeros(i);
    }

    public static int kgy(int i, int i2) {
        if (i2 != 0) {
            int iKgy = kgy(i2);
            int iKgy2 = i << (iKgy - 1);
            while (kgy(iKgy2) >= iKgy) {
                iKgy2 ^= i2 << (kgy(iKgy2) - iKgy);
            }
            return iKgy2;
        }
        d.r("0 polynomial");
        return 0;
    }

    public static void kgy(fi fiVar, int i, kgy kgyVar) throws sx {
        if (vs.kgy(i)) {
            int iKgy = (fiVar.kgy() << 3) | i;
            kgyVar.kgy(iKgy, 5);
            kgyVar.kgy(kgy(iKgy, 1335), 10);
            kgy kgyVar2 = new kgy();
            kgyVar2.kgy(21522, 15);
            kgyVar.ahm(kgyVar2);
            if (kgyVar.kgy() == 15) {
                return;
            }
            throw new sx("should not happen but we got: " + kgyVar.kgy());
        }
        throw new sx("Invalid mask pattern");
    }

    public static void kgy(fpp fppVar, kgy kgyVar) throws sx {
        kgyVar.kgy(fppVar.kgy(), 6);
        kgyVar.kgy(kgy(fppVar.kgy(), 7973), 12);
        if (kgyVar.kgy() == 18) {
            return;
        }
        throw new sx("should not happen but we got: " + kgyVar.kgy());
    }

    private static void kgy(int i, int i2, rz rzVar) throws sx {
        for (int i3 = 0; i3 < 8; i3++) {
            int i4 = i + i3;
            if (ahm(rzVar.kgy(i4, i2))) {
                rzVar.kgy(i4, i2, 0);
            } else {
                throw new sx();
            }
        }
    }
}
