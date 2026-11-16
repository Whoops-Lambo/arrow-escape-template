package com.google.android.gms.internal.ads;

import defpackage.ap3;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
public final class zzafr {
    public static final int[] a = {2002, 2000, 1920, 1601, 1600, 1001, 1000, 960, 800, 800, 480, 400, 400, 2048};

    public static void b(int i, zzey zzeyVar) {
        zzeyVar.y(7);
        byte[] bArr = zzeyVar.a;
        bArr[0] = -84;
        bArr[1] = 64;
        bArr[2] = -1;
        bArr[3] = -1;
        bArr[4] = (byte) ((i >> 16) & 255);
        bArr[5] = (byte) ((i >> 8) & 255);
        bArr[6] = (byte) (i & 255);
    }

    public static void c(zzet zzetVar, ap3 ap3Var) throws zzat {
        int iH = zzetVar.h(5);
        zzetVar.f(2);
        if (zzetVar.g()) {
            zzetVar.f(5);
        }
        if (iH >= 7 && iH <= 10) {
            zzetVar.e();
        }
        if (zzetVar.g()) {
            int iH2 = zzetVar.h(3);
            if (ap3Var.b == -1 && iH >= 0 && iH <= 15 && (iH2 == 0 || iH2 == 1)) {
                ap3Var.b = iH;
            }
            if (zzetVar.g()) {
                e(zzetVar);
            }
        }
    }

    public static void d(zzet zzetVar, ap3 ap3Var) throws zzat {
        zzetVar.f(2);
        boolean zG = zzetVar.g();
        int iH = zzetVar.h(8);
        for (int i = 0; i < iH; i++) {
            zzetVar.f(2);
            if (zzetVar.g()) {
                zzetVar.f(5);
            }
            if (zG) {
                zzetVar.f(24);
            } else {
                if (zzetVar.g()) {
                    if (!zzetVar.g()) {
                        zzetVar.f(4);
                    }
                    ap3Var.c = zzetVar.h(6) + 1;
                }
                zzetVar.f(4);
            }
        }
        if (zzetVar.g()) {
            zzetVar.f(3);
            if (zzetVar.g()) {
                e(zzetVar);
            }
        }
    }

    public static void e(zzet zzetVar) throws zzat {
        int iH = zzetVar.h(6);
        if (iH < 2 || iH > 42) {
            throw zzat.c(String.format("Invalid language tag bytes number: %d. Must be between 2 and 42.", Integer.valueOf(iH)));
        }
        zzetVar.f(iH * 8);
    }

    /* JADX WARN: Code duplicated, block: B:41:0x0084  */
    /* JADX WARN: Code duplicated, block: B:45:0x008c  */
    /* JADX WARN: Code duplicated, block: B:48:0x0091  */
    public static zzafq a(zzet zzetVar) {
        int i;
        int i2;
        int iH = zzetVar.h(16);
        int iH2 = zzetVar.h(16);
        if (iH2 == 65535) {
            iH2 = zzetVar.h(24);
            i = 7;
        } else {
            i = 4;
        }
        int i3 = iH2 + i;
        if (iH == 44097) {
            i3 += 2;
        }
        if (zzetVar.h(2) == 3) {
            do {
                zzetVar.h(2);
            } while (zzetVar.g());
        }
        int iH3 = zzetVar.h(10);
        if (zzetVar.g() && zzetVar.h(3) > 0) {
            zzetVar.f(2);
        }
        int i4 = true != zzetVar.g() ? 44100 : 48000;
        int iH4 = zzetVar.h(4);
        int[] iArr = a;
        if (i4 == 44100 && iH4 == 13) {
            i2 = iArr[13];
        } else if (i4 != 48000 || iH4 >= 14) {
            i2 = 0;
        } else {
            int i5 = iArr[iH4];
            int i6 = iH3 % 5;
            if (i6 == 1) {
                if (iH4 != 3 || iH4 == 8) {
                    i2 = i5 + 1;
                } else {
                    i2 = i5;
                }
            } else if (i6 != 2) {
                if (i6 == 3) {
                    if (iH4 != 3) {
                    }
                    i2 = i5 + 1;
                } else if (i6 == 4 && (iH4 == 3 || iH4 == 8 || iH4 == 11)) {
                    i2 = i5 + 1;
                } else {
                    i2 = i5;
                }
            } else if (iH4 == 8 || iH4 == 11) {
                i2 = i5 + 1;
            } else {
                i2 = i5;
            }
        }
        return new zzafq(i4, i3, i2);
    }
}
