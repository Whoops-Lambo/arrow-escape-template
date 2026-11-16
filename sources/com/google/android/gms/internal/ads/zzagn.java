package com.google.android.gms.internal.ads;

import com.inmobi.media.core.config.models.AdConfig;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
public final class zzagn {
    public static final int[] a = {1, 2, 2, 2, 2, 3, 3, 4, 4, 5, 6, 6, 6, 7, 8, 8};
    public static final int[] b = {-1, 8000, 16000, 32000, -1, -1, 11025, 22050, 44100, -1, -1, 12000, 24000, 48000, -1, -1};
    public static final int[] c = {64, 112, 128, 192, 224, 256, 384, 448, 512, 640, 768, 896, 1024, 1152, 1280, 1536, 1920, 2048, 2304, 2560, 2688, 2816, 2823, 2944, 3072, 3840, 4096, 6144, 7680};
    public static final int[] d = {8000, 16000, 32000, 64000, 128000, 22050, 44100, 88200, 176400, 352800, 12000, 24000, 48000, 96000, 192000, 384000};
    public static final int[] e = {5, 8, 10, 12};
    public static final int[] f = {6, 9, 12, 15};
    public static final int[] g = {2, 4, 6, 8};
    public static final int[] h = {9, 11, 13, 16};
    public static final int[] i = {5, 8, 10, 12};

    /* JADX WARN: Code duplicated, block: B:15:0x005e  */
    /* JADX WARN: Code duplicated, block: B:17:? A[RETURN, SYNTHETIC] */
    public static int c(byte[] bArr) {
        int i2;
        int i3;
        byte b2;
        int i4;
        int i5;
        int i6;
        byte b3;
        boolean z = false;
        byte b4 = bArr[0];
        if (b4 != -2) {
            if (b4 == -1) {
                i5 = (bArr[7] & 3) << 12;
                i6 = (bArr[6] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 4;
                b3 = bArr[9];
            } else if (b4 != 31) {
                i2 = (bArr[5] & 3) << 12;
                i3 = (bArr[6] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 4;
                b2 = bArr[7];
            } else {
                i5 = (bArr[6] & 3) << 12;
                i6 = (bArr[7] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 4;
                b3 = bArr[8];
            }
            i4 = (((b3 & 60) >> 2) | i5 | i6) + 1;
            z = true;
            if (z) {
                return (i4 * 16) / 14;
            }
            return i4;
        }
        i2 = (bArr[4] & 3) << 12;
        i3 = (bArr[7] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 4;
        b2 = bArr[6];
        i4 = (((b2 & 240) >> 4) | i2 | i3) + 1;
        if (z) {
            return (i4 * 16) / 14;
        }
        return i4;
    }

    public static int g(zzet zzetVar, int[] iArr) {
        int i2 = 0;
        for (int i3 = 0; i3 < 3 && zzetVar.g(); i3++) {
            i2++;
        }
        int i4 = 0;
        for (int i5 = 0; i5 < i2; i5++) {
            i4 += 1 << iArr[i5];
        }
        return zzetVar.h(iArr[i2]) + i4;
    }

    public static zzet h(byte[] bArr) {
        byte[] bArr2;
        byte b2 = bArr[0];
        if (b2 == 127 || b2 == 100 || b2 == 64 || b2 == 113) {
            return new zzet(bArr, bArr.length);
        }
        byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
        byte b3 = bArrCopyOf[0];
        if (b3 == -2 || b3 == -1 || b3 == 37 || b3 == -14 || b3 == -24) {
            for (int i2 = 0; i2 < bArrCopyOf.length - 1; i2 += 2) {
                byte b4 = bArrCopyOf[i2];
                int i3 = i2 + 1;
                bArrCopyOf[i2] = bArrCopyOf[i3];
                bArrCopyOf[i3] = b4;
            }
        }
        int length = bArrCopyOf.length;
        zzet zzetVar = new zzet(bArrCopyOf, length);
        if (bArrCopyOf[0] == 31) {
            zzet zzetVar2 = new zzet(bArrCopyOf, length);
            while (zzetVar2.b() >= 16) {
                zzetVar2.f(2);
                int iH = zzetVar2.h(14);
                int iMin = Math.min(8 - zzetVar.c, 14);
                int i4 = zzetVar.c;
                int i5 = (8 - i4) - iMin;
                byte[] bArr3 = zzetVar.a;
                int i6 = zzetVar.b;
                byte b5 = (byte) (((65280 >> i4) | ((1 << i5) - 1)) & bArr3[i6]);
                bArr3[i6] = b5;
                int i7 = 14 - iMin;
                int i8 = iH & 16383;
                bArr3[i6] = (byte) (b5 | ((i8 >>> i7) << i5));
                int i9 = i6 + 1;
                while (true) {
                    bArr2 = zzetVar.a;
                    if (i7 > 8) {
                        i7 -= 8;
                        bArr2[i9] = (byte) (i8 >>> i7);
                        i9++;
                    }
                }
                int i10 = 8 - i7;
                byte b6 = (byte) (bArr2[i9] & ((1 << i10) - 1));
                bArr2[i9] = b6;
                bArr2[i9] = (byte) (((i8 & ((1 << i7) - 1)) << i10) | b6);
                zzetVar.f(14);
                zzetVar.m();
            }
        }
        int length2 = bArrCopyOf.length;
        zzetVar.a = bArrCopyOf;
        zzetVar.b = 0;
        zzetVar.c = 0;
        zzetVar.d = length2;
        return zzetVar;
    }

    public static boolean a(String str) {
        return Objects.equals(str, "audio/vnd.dts") || Objects.equals(str, "audio/vnd.dts.hd");
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0063  */
    /* JADX WARN: Code duplicated, block: B:19:0x0066  */
    /* JADX WARN: Code duplicated, block: B:26:0x0084  */
    /* JADX WARN: Code duplicated, block: B:29:0x008c  */
    public static zzv e(zzagp zzagpVar, int i2, zzv zzvVar) {
        zzet zzetVarH;
        int i3;
        int iH;
        String str;
        String str2;
        zzey zzeyVar = new zzey(i2);
        if (zzagpVar.d(zzeyVar.a, 0, i2, true)) {
            zzagpVar.zzl();
            int iJ = zzeyVar.J();
            if (b(iJ) != 1) {
                if (b(iJ) == 2 && zzeyVar.B() >= 7) {
                    int i4 = zzeyVar.b;
                    byte[] bArr = new byte[7];
                    zzeyVar.H(0, 7, bArr);
                    zzeyVar.E(i4);
                    zzetVarH = h(bArr);
                    zzetVarH.f(42);
                    if (true != zzetVarH.g()) {
                        i3 = 8;
                    } else {
                        i3 = 12;
                    }
                    iH = zzetVarH.h(i3) + 1;
                    if (iH > 0 && zzeyVar.B() >= iH) {
                        byte[] bArr2 = new byte[iH];
                        zzeyVar.H(0, iH, bArr2);
                        str = d(bArr2).a;
                        str2 = zzvVar.o;
                        if (str == null) {
                            str = "audio/vnd.dts.hd";
                        }
                        if (!Objects.equals(str2, str)) {
                            zzt zztVar = new zzt(zzvVar);
                            zztVar.e(str);
                            return new zzv(zztVar);
                        }
                    }
                }
            } else if (zzeyVar.B() >= 10) {
                byte[] bArr3 = new byte[10];
                zzeyVar.H(0, 10, bArr3);
                int iC = c(bArr3);
                if (zzeyVar.c >= iC + 4) {
                    zzeyVar.E(iC);
                    iJ = zzeyVar.J();
                    if (b(iJ) == 2) {
                        int i5 = zzeyVar.b;
                        byte[] bArr4 = new byte[7];
                        zzeyVar.H(0, 7, bArr4);
                        zzeyVar.E(i5);
                        zzetVarH = h(bArr4);
                        zzetVarH.f(42);
                        if (true != zzetVarH.g()) {
                            i3 = 8;
                        } else {
                            i3 = 12;
                        }
                        iH = zzetVarH.h(i3) + 1;
                        if (iH > 0) {
                            byte[] bArr5 = new byte[iH];
                            zzeyVar.H(0, iH, bArr5);
                            str = d(bArr5).a;
                            str2 = zzvVar.o;
                            if (str == null) {
                                str = "audio/vnd.dts.hd";
                            }
                            if (!Objects.equals(str2, str)) {
                                zzt zztVar2 = new zzt(zzvVar);
                                zztVar2.e(str);
                                return new zzv(zztVar2);
                            }
                        }
                    }
                }
            }
        }
        return zzvVar;
    }

    public static int f(int i2) {
        int i3 = i2 & 1;
        if ((i2 & 2) != 0) {
            i3 += 2;
        }
        if ((i2 & 4) != 0) {
            i3 += 2;
        }
        if ((i2 & 8) != 0) {
            i3++;
        }
        if ((i2 & 16) != 0) {
            i3++;
        }
        if ((i2 & 32) != 0) {
            i3 += 2;
        }
        if ((i2 & 64) != 0) {
            i3 += 2;
        }
        if ((i2 & 128) != 0) {
            i3++;
        }
        if ((i2 & 256) != 0) {
            i3++;
        }
        if ((i2 & 512) != 0) {
            i3 += 2;
        }
        if ((i2 & 1024) != 0) {
            i3 += 2;
        }
        if ((i2 & 2048) != 0) {
            i3 += 2;
        }
        if ((i2 & 4096) != 0) {
            i3++;
        }
        if ((i2 & 8192) != 0) {
            i3 += 2;
        }
        if ((i2 & 16384) != 0) {
            i3++;
        }
        return (i2 & 32768) != 0 ? i3 + 2 : i3;
    }

    public static int b(int i2) {
        if (i2 != 2147385345 && i2 != -25230976 && i2 != 536864768 && i2 != -14745368) {
            if (i2 != 1683496997 && i2 != 622876772) {
                if (i2 != 1078008818 && i2 != -233094848) {
                    if (i2 != 1908687592 && i2 != -398277519) {
                        return 0;
                    }
                    return 4;
                }
                return 3;
            }
            return 2;
        }
        return 1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v13 */
    /* JADX WARN: Type inference failed for: r11v14 */
    /* JADX WARN: Type inference failed for: r11v15 */
    /* JADX WARN: Type inference failed for: r11v2 */
    /* JADX WARN: Type inference failed for: r11v6 */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Type inference failed for: r19v1 */
    /* JADX WARN: Type inference failed for: r19v2 */
    /* JADX WARN: Type inference failed for: r19v5 */
    /* JADX WARN: Type inference failed for: r19v6 */
    /* JADX WARN: Type inference failed for: r19v8 */
    /* JADX WARN: Type inference failed for: r19v9 */
    public static zzagm d(byte[] bArr) {
        int i2;
        int i3;
        int i4;
        boolean zG;
        int i5;
        int iH;
        int[] iArr;
        int i6;
        String str;
        int iH2;
        long jW;
        int i7;
        int i8;
        ?? r19;
        ?? r11;
        int i9;
        int i10;
        ?? r12;
        ?? G;
        int iH3;
        boolean zG2;
        zzet zzetVarH = h(bArr);
        zzetVarH.f(40);
        int iH4 = zzetVarH.h(2);
        boolean zG3 = zzetVarH.g();
        int i11 = 1;
        if (true != zG3) {
            i2 = 16;
        } else {
            i2 = 20;
        }
        if (true != zG3) {
            i3 = 8;
        } else {
            i3 = 12;
        }
        zzetVarH.f(i3);
        int iH5 = zzetVarH.h(i2) + 1;
        boolean zG4 = zzetVarH.g();
        if (zG4) {
            iH = zzetVarH.h(2);
            int iH6 = zzetVarH.h(3) + 1;
            if (zzetVarH.g()) {
                zzetVarH.f(36);
            }
            int iH7 = zzetVarH.h(3) + 1;
            int iH8 = zzetVarH.h(3) + 1;
            if (iH7 == 1 && iH8 == 1) {
                int i12 = iH4 + 1;
                int iH9 = zzetVarH.h(i12);
                for (int i13 = 0; i13 < i12; i13++) {
                    if (((iH9 >> i13) & 1) == 1) {
                        zzetVarH.f(8);
                    }
                }
                i4 = 0;
                zG = zzetVarH.g();
                if (zG) {
                    zzetVarH.f(2);
                    int iH10 = (zzetVarH.h(2) + 1) << 2;
                    int iH11 = zzetVarH.h(2) + 1;
                    iArr = new int[iH11];
                    for (int i14 = 0; i14 < iH11; i14++) {
                        iArr[i14] = f(zzetVarH.h(iH10));
                    }
                } else {
                    iArr = null;
                }
                i5 = iH6 * 512;
            } else {
                throw zzat.c("Multiple audio presentations or assets not supported");
            }
        } else {
            i4 = 0;
            zG = false;
            i5 = 0;
            iH = -1;
            iArr = null;
        }
        zzetVarH.f(i2);
        zzetVarH.f(12);
        if (zG4) {
            if (zzetVarH.g()) {
                zzetVarH.f(4);
            }
            if (zzetVarH.g()) {
                zzetVarH.f(24);
            }
            if (zzetVarH.g()) {
                zzetVarH.l(zzetVarH.h(10) + 1);
            }
            int i15 = 5;
            zzetVarH.f(5);
            i6 = d[zzetVarH.h(4)];
            iH2 = zzetVarH.h(8) + 1;
            int i16 = 6;
            if (zzetVarH.g()) {
                if (iH2 > 2) {
                    zG2 = zzetVarH.g();
                } else {
                    r12 = i4;
                }
                if (iH2 > 6) {
                    r12 = zG2;
                    G = zzetVarH.g();
                } else {
                    r12 = zG2;
                    G = i4;
                }
                if (zzetVarH.g()) {
                    iH3 = (zzetVarH.h(2) + 1) << 2;
                    zzetVarH.f(iH3);
                } else {
                    iH3 = i4;
                }
                int iH12 = zzetVarH.h(3);
                int[] iArr2 = new int[iH12];
                for (int i17 = i4; i17 < iH12; i17++) {
                    iArr2[i17] = zzetVarH.h(iH3);
                }
                int i18 = i4;
                while (i18 < iH12) {
                    int iF = f(iArr2[i18]);
                    int i19 = i15;
                    int iH13 = zzetVarH.h(i15) + 1;
                    int i20 = i4;
                    while (i20 < iF) {
                        zzetVarH.f(Integer.bitCount(zzetVarH.h(iH13)) * 5);
                        i20++;
                        iArr2 = iArr2;
                    }
                    i18++;
                    i15 = i19;
                }
                i8 = i15;
                r11 = r12;
                r19 = G;
            } else {
                i11 = 1;
                i8 = 5;
                zzetVarH.f(3);
                int i21 = i4;
                r19 = i21 == true ? 1 : 0;
                r11 = i21;
            }
            boolean zG5 = zzetVarH.g();
            if (zG5) {
                zzetVarH.f(8);
            }
            if (zzetVarH.g()) {
                zzetVarH.f(i8);
            }
            if (zG5 && r11 != 0) {
                zzetVarH.f(8);
            }
            if (zG && zzetVarH.g()) {
                iArr.getClass();
                zzetVarH.f(7);
                if (zzetVarH.h(2) < 3) {
                    zzetVarH.f(3);
                } else {
                    zzetVarH.f(8);
                }
                boolean zG6 = zzetVarH.g();
                int length = iArr.length;
                int i22 = i4;
                while (i22 < length) {
                    int i23 = iArr[i22];
                    if (zG6) {
                        zzetVarH.f(i23 * 6);
                        i10 = i16;
                    } else {
                        i10 = i16;
                        zzetVarH.f(i10);
                    }
                    i22++;
                    i16 = i10;
                }
                int i24 = i16;
                int[] iArr3 = new int[3];
                iArr3[i4] = iH2;
                if (r19 != 0) {
                    iArr3[i11] = i24;
                    i9 = 2;
                } else {
                    i9 = i11;
                }
                if (r11 != 0) {
                    iArr3[i9] = 2;
                    i9++;
                }
                int length2 = iArr.length;
                for (int i25 = i4; i25 < length2; i25++) {
                    int i26 = iArr[i25];
                    for (int i27 = i4; i27 < i9; i27++) {
                        int i28 = iArr3[i27];
                        int i29 = i4;
                        while (i29 < i28) {
                            zzetVarH.f(Integer.bitCount(zzetVarH.h(i26)) * 6);
                            i29++;
                            iArr3 = iArr3;
                        }
                    }
                }
            }
            int iH14 = zzetVarH.h(2);
            String str2 = "audio/vnd.dts.hd";
            if (iH14 != 0) {
                if (iH14 != i11) {
                    if (iH14 != 2) {
                        StringBuilder sb = new StringBuilder(String.valueOf(iH14).length() + 42);
                        sb.append("Unsupported coding mode in DTS HD header: ");
                        sb.append(iH14);
                        throw zzat.b(sb.toString(), null);
                    }
                    str2 = "audio/vnd.dts.hd;profile=lbr";
                }
            } else if ((zzetVarH.h(12) & 256) != 0) {
                str2 = "audio/vnd.dts.hd;profile=lbr";
            }
            str = str2;
        } else {
            i6 = -2147483647;
            str = null;
            iH2 = -1;
        }
        if (zG4) {
            if (iH != 0) {
                if (iH != 1) {
                    if (iH == 2) {
                        i7 = 48000;
                    } else {
                        StringBuilder sb2 = new StringBuilder(String.valueOf(iH).length() + 51);
                        sb2.append("Unsupported reference clock code in DTS HD header: ");
                        sb2.append(iH);
                        throw zzat.b(sb2.toString(), null);
                    }
                } else {
                    i7 = 44100;
                }
            } else {
                i7 = 32000;
            }
            jW = zzfq.w(i5, 1000000L, i7, RoundingMode.DOWN);
        } else {
            jW = -9223372036854775807L;
        }
        return new zzagm(iH2, jW, str, i6, iH5);
    }
}
