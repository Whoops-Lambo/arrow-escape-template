package io.p071bidmachine.media3.container;

import defpackage.d31;
import defpackage.jc1;
import defpackage.kd0;
import defpackage.l63;
import defpackage.nc2;
import defpackage.y21;
import defpackage.y32;
import io.p071bidmachine.media3.common.f;
import io.p071bidmachine.media3.common.f0;
import io.p071bidmachine.media3.common.n;
import io.p071bidmachine.media3.common.util.a;
import io.p071bidmachine.media3.common.util.b;
import io.p071bidmachine.media3.common.util.p;
import java.lang.reflect.Array;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public abstract class o {
    public static final byte[] a = {0, 0, 0, 1};
    public static final float[] b = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 2.1818182f, 1.8181819f, 2.909091f, 2.4242425f, 1.6363636f, 1.3636364f, 1.939394f, 1.6161616f, 1.3333334f, 1.5f, 2.0f};
    public static final Object c = new Object();
    public static int[] d = new int[10];

    public static void b(boolean[] zArr) {
        zArr[0] = false;
        zArr[1] = false;
        zArr[2] = false;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01ac  */
    /* JADX WARN: Code duplicated, block: B:104:0x01be  */
    /* JADX WARN: Code duplicated, block: B:106:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:107:0x01c7  */
    /* JADX WARN: Code duplicated, block: B:110:0x01d4  */
    /* JADX WARN: Code duplicated, block: B:113:0x01dd  */
    /* JADX WARN: Code duplicated, block: B:116:0x01e8  */
    /* JADX WARN: Code duplicated, block: B:119:0x01f0  */
    /* JADX WARN: Code duplicated, block: B:120:0x0206  */
    /* JADX WARN: Code duplicated, block: B:121:0x0209  */
    /* JADX WARN: Code duplicated, block: B:124:0x0212  */
    /* JADX WARN: Code duplicated, block: B:127:0x021e  */
    /* JADX WARN: Code duplicated, block: B:130:0x0229  */
    /* JADX WARN: Code duplicated, block: B:133:0x0232  */
    /* JADX WARN: Code duplicated, block: B:136:0x0239  */
    /* JADX WARN: Code duplicated, block: B:139:0x0245  */
    /* JADX WARN: Code duplicated, block: B:141:0x0264  */
    /* JADX WARN: Code duplicated, block: B:61:0x011c  */
    /* JADX WARN: Code duplicated, block: B:64:0x012e  */
    /* JADX WARN: Code duplicated, block: B:66:0x0144  */
    /* JADX WARN: Code duplicated, block: B:67:0x0149  */
    /* JADX WARN: Code duplicated, block: B:69:0x014e  */
    /* JADX WARN: Code duplicated, block: B:71:0x0152  */
    /* JADX WARN: Code duplicated, block: B:73:0x0157  */
    /* JADX WARN: Code duplicated, block: B:74:0x015a  */
    /* JADX WARN: Code duplicated, block: B:78:0x016e  */
    /* JADX WARN: Code duplicated, block: B:96:0x019c  */
    /* JADX WARN: Code duplicated, block: B:98:0x01a2  */
    public static n k(int i, int i2, byte[] bArr) {
        int iM;
        int iM2;
        int i3;
        boolean z;
        int i4;
        int iM3;
        boolean z2;
        boolean zH;
        int i5;
        int iB;
        int iB2;
        int i6;
        int iM4;
        float f;
        int i7;
        int i8;
        int i9;
        int i10;
        int iG;
        int iF;
        boolean zH2;
        boolean zH3;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        p pVar = new p(bArr, i + 1, i2);
        int i17 = pVar.i(8);
        int i18 = pVar.i(8);
        int i19 = pVar.i(8);
        int iM5 = pVar.m();
        if (i17 == 100 || i17 == 110 || i17 == 122 || i17 == 244 || i17 == 44 || i17 == 83 || i17 == 86 || i17 == 118 || i17 == 128 || i17 == 138) {
            iM = pVar.m();
            boolean zH4 = iM == 3 ? pVar.h() : false;
            int iM6 = pVar.m();
            iM2 = pVar.m();
            pVar.s();
            if (pVar.h()) {
                int i20 = iM != 3 ? 8 : 12;
                i3 = 16;
                int i21 = 0;
                while (i21 < i20) {
                    if (pVar.h()) {
                        int i22 = i21 < 6 ? 16 : 64;
                        int iN = 8;
                        int i23 = 8;
                        for (int i24 = 0; i24 < i22; i24++) {
                            if (iN != 0) {
                                iN = ((pVar.n() + i23) + 256) % 256;
                            }
                            if (iN != 0) {
                                i23 = iN;
                            }
                        }
                    }
                    i21++;
                }
            } else {
                i3 = 16;
            }
            z = zH4;
            i4 = iM6;
        } else {
            iM = 1;
            i3 = 16;
            i4 = 0;
            z = false;
            iM2 = 0;
        }
        int iM7 = pVar.m() + 4;
        int iM8 = pVar.m();
        if (iM8 != 0) {
            if (iM8 == 1) {
                boolean zH5 = pVar.h();
                pVar.n();
                pVar.n();
                i17 = i17;
                long jM = pVar.m();
                iM8 = iM8;
                for (int i25 = 0; i25 < jM; i25++) {
                    pVar.m();
                }
                iM2 = iM2;
                z2 = zH5;
                iM3 = 0;
            } else {
                iM3 = 0;
            }
            pVar.m();
            pVar.s();
            int iM9 = pVar.m() + 1;
            int iM10 = pVar.m() + 1;
            zH = pVar.h();
            i5 = 2 - (zH ? 1 : 0);
            int i26 = iM10 * i5;
            if (!zH) {
                pVar.s();
            }
            pVar.s();
            iB = iM9 * 16;
            iB2 = i26 * 16;
            if (pVar.h()) {
                int iM11 = pVar.m();
                int iM12 = pVar.m();
                int iM13 = pVar.m();
                int iM14 = pVar.m();
                if (iM == 0) {
                    i6 = 1;
                    i16 = 1;
                } else {
                    if (iM == 3) {
                        i14 = 1;
                    } else {
                        i14 = 2;
                    }
                    i6 = 1;
                    if (iM == 1) {
                        i15 = 2;
                    } else {
                        i15 = 1;
                    }
                    i5 *= i15;
                    i16 = i14;
                }
                iB = jc1.B(iM11, iM12, i16, iB);
                iB2 = jc1.B(iM13, iM14, i5, iB2);
            } else {
                i18 = i18;
                i6 = 1;
            }
            int i27 = iB2;
            int i28 = iB;
            int i29 = i17;
            iM4 = ((i29 != 44 || i29 == 86 || i29 == 100 || i29 == 110 || i29 == 122 || i29 == 244) && (i18 & 16) != 0) ? 0 : i3;
            f = 1.0f;
            if (pVar.h()) {
                if (pVar.h()) {
                    i11 = pVar.i(8);
                    if (i11 == 255) {
                        int i30 = i3;
                        i12 = pVar.i(i30);
                        i13 = pVar.i(i30);
                        if (i12 != 0 && i13 != 0) {
                            f = i12 / i13;
                        }
                    } else if (i11 < 17) {
                        f = b[i11];
                    } else {
                        b.c(i11, "Unexpected aspect_ratio_idc value: ", "NalUnitUtil");
                    }
                }
                if (pVar.h()) {
                    pVar.s();
                }
                if (pVar.h()) {
                    pVar.t(3);
                    if (!pVar.h()) {
                        i6 = 2;
                    }
                    if (pVar.h()) {
                        int i31 = pVar.i(8);
                        int i32 = pVar.i(8);
                        pVar.t(8);
                        iF = f.f(i31);
                        iG = f.g(i32);
                    } else {
                        iG = -1;
                        iF = -1;
                    }
                } else {
                    iG = -1;
                    iF = -1;
                    i6 = -1;
                }
                if (pVar.h()) {
                    pVar.m();
                    pVar.m();
                }
                if (pVar.h()) {
                    pVar.t(65);
                }
                zH2 = pVar.h();
                if (zH2) {
                    l(pVar);
                }
                zH3 = pVar.h();
                if (zH3) {
                    l(pVar);
                }
                if (zH2 || zH3) {
                    pVar.s();
                }
                pVar.s();
                if (pVar.h()) {
                    pVar.s();
                    pVar.m();
                    pVar.m();
                    pVar.m();
                    pVar.m();
                    iM4 = pVar.m();
                    pVar.m();
                }
                i7 = iM4;
                i10 = iG;
                i8 = iF;
                i9 = i6;
            } else {
                i7 = iM4;
                i8 = -1;
                i9 = -1;
                i10 = -1;
            }
            return new n(i29, i18, i19, iM5, i28, i27, f, i4, iM2, z, zH, iM7, iM8, iM3, z2, i8, i9, i10, i7);
        }
        iM3 = pVar.m() + 4;
        z2 = false;
        pVar.m();
        pVar.s();
        int iM15 = pVar.m() + 1;
        int iM16 = pVar.m() + 1;
        zH = pVar.h();
        i5 = 2 - (zH ? 1 : 0);
        int i210 = iM16 * i5;
        if (!zH) {
            pVar.s();
        }
        pVar.s();
        iB = iM15 * 16;
        iB2 = i210 * 16;
        if (pVar.h()) {
            int iM17 = pVar.m();
            int iM18 = pVar.m();
            int iM19 = pVar.m();
            int iM110 = pVar.m();
            if (iM == 0) {
                i6 = 1;
                i16 = 1;
            } else {
                if (iM == 3) {
                    i14 = 1;
                } else {
                    i14 = 2;
                }
                i6 = 1;
                if (iM == 1) {
                    i15 = 2;
                } else {
                    i15 = 1;
                }
                i5 *= i15;
                i16 = i14;
            }
            iB = jc1.B(iM17, iM18, i16, iB);
            iB2 = jc1.B(iM19, iM110, i5, iB2);
        } else {
            i18 = i18;
            i6 = 1;
        }
        int i211 = iB2;
        int i212 = iB;
        int i213 = i17;
        if (i213 != 44) {
        }
        f = 1.0f;
        if (pVar.h()) {
            if (pVar.h()) {
                i11 = pVar.i(8);
                if (i11 == 255) {
                    int i33 = i3;
                    i12 = pVar.i(i33);
                    i13 = pVar.i(i33);
                    if (i12 != 0) {
                        f = i12 / i13;
                    }
                } else if (i11 < 17) {
                    f = b[i11];
                } else {
                    b.c(i11, "Unexpected aspect_ratio_idc value: ", "NalUnitUtil");
                }
            }
            if (pVar.h()) {
                pVar.s();
            }
            if (pVar.h()) {
                pVar.t(3);
                if (!pVar.h()) {
                    i6 = 2;
                }
                if (pVar.h()) {
                    int i34 = pVar.i(8);
                    int i35 = pVar.i(8);
                    pVar.t(8);
                    iF = f.f(i34);
                    iG = f.g(i35);
                } else {
                    iG = -1;
                    iF = -1;
                }
            } else {
                iG = -1;
                iF = -1;
                i6 = -1;
            }
            if (pVar.h()) {
                pVar.m();
                pVar.m();
            }
            if (pVar.h()) {
                pVar.t(65);
            }
            zH2 = pVar.h();
            if (zH2) {
                l(pVar);
            }
            zH3 = pVar.h();
            if (zH3) {
                l(pVar);
            }
            if (zH2) {
                pVar.s();
            } else {
                pVar.s();
            }
            pVar.s();
            if (pVar.h()) {
                pVar.s();
                pVar.m();
                pVar.m();
                pVar.m();
                pVar.m();
                iM4 = pVar.m();
                pVar.m();
            }
            i7 = iM4;
            i10 = iG;
            i8 = iF;
            i9 = i6;
        } else {
            i7 = iM4;
            i8 = -1;
            i9 = -1;
            i10 = -1;
        }
        return new n(i213, i18, i19, iM5, i212, i211, f, i4, iM2, z, zH, iM7, iM8, iM3, z2, i8, i9, i10, i7);
    }

    public static void a(boolean z) {
        if (z) {
            throw new q();
        }
    }

    public static int c(byte[] bArr, int i, int i2, boolean[] zArr) {
        int i3 = i2 - i;
        a.i(i3 >= 0);
        if (i3 == 0) {
            return i2;
        }
        if (zArr[0]) {
            b(zArr);
            return i - 3;
        }
        if (i3 > 1 && zArr[1] && bArr[i] == 1) {
            b(zArr);
            return i - 2;
        }
        if (i3 > 2 && zArr[2] && bArr[i] == 0 && bArr[i + 1] == 1) {
            b(zArr);
            return i - 1;
        }
        int i4 = i2 - 1;
        int i5 = i + 2;
        while (i5 < i4) {
            byte b2 = bArr[i5];
            if ((b2 & 254) == 0) {
                int i6 = i5 - 2;
                if (bArr[i6] == 0 && bArr[i5 - 1] == 0 && b2 == 1) {
                    b(zArr);
                    return i6;
                }
                i5 -= 2;
            }
            i5 += 3;
        }
        zArr[0] = i3 <= 2 ? !(i3 != 2 ? !(zArr[1] && bArr[i4] == 1) : !(zArr[2] && bArr[i2 + (-2)] == 0 && bArr[i4] == 1)) : bArr[i2 + (-3)] == 0 && bArr[i2 + (-2)] == 0 && bArr[i4] == 1;
        zArr[1] = i3 <= 1 ? zArr[2] && bArr[i4] == 0 : bArr[i2 + (-2)] == 0 && bArr[i4] == 0;
        zArr[2] = bArr[i4] == 0;
        return i2;
    }

    public static boolean d(byte[] bArr, int i, n nVar) {
        int i2;
        if (Objects.equals(nVar.n, "video/avc")) {
            byte b2 = bArr[4];
            if (((b2 & 96) >> 5) == 0 && ((i2 = b2 & 31) == 1 || i2 == 9 || i2 == 14)) {
                return false;
            }
        } else if (Objects.equals(nVar.n, "video/hevc")) {
            l63 l63VarF = f(new p(bArr, 4, i + 4));
            int i3 = l63VarF.a;
            if (i3 == 35) {
                return false;
            }
            if (i3 <= 14 && i3 % 2 == 0 && l63VarF.c == nVar.C - 1) {
                return false;
            }
        }
        return true;
    }

    public static int e(n nVar) {
        if (Objects.equals(nVar.n, "video/avc")) {
            return 1;
        }
        return (Objects.equals(nVar.n, "video/hevc") || f0.c(nVar.k, "video/hevc") != null) ? 2 : 0;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x005e  */
    /* JADX WARN: Code duplicated, block: B:23:0x0064  */
    /* JADX WARN: Code duplicated, block: B:26:0x006c  */
    /* JADX WARN: Code duplicated, block: B:30:0x0076  */
    /* JADX WARN: Code duplicated, block: B:39:0x006e A[SYNTHETIC] */
    public static h g(p pVar, boolean z, int i, h hVar) {
        int[] iArr;
        int i2;
        boolean z2;
        int i3;
        int i4;
        boolean zH;
        int i5;
        int i6;
        int i7;
        int[] iArr2 = new int[6];
        if (!z) {
            if (hVar != null) {
                int i8 = hVar.a;
                zH = hVar.b;
                i5 = hVar.c;
                i6 = hVar.d;
                iArr2 = hVar.e;
                i2 = i8;
            } else {
                iArr = iArr2;
                i2 = 0;
                z2 = false;
                i3 = 0;
                i4 = 0;
            }
            int i9 = pVar.i(8);
            i7 = 0;
            for (int i10 = 0; i10 < i; i10++) {
                if (pVar.h()) {
                    i7 += 88;
                }
                if (pVar.h()) {
                    i7 += 8;
                }
            }
            pVar.t(i7);
            if (i > 0) {
                pVar.t((8 - i) * 2);
            }
            return new h(i2, z2, i3, i4, iArr, i9);
        }
        int i11 = pVar.i(2);
        zH = pVar.h();
        i5 = pVar.i(5);
        i6 = 0;
        for (int i12 = 0; i12 < 32; i12++) {
            if (pVar.h()) {
                i6 |= 1 << i12;
            }
        }
        for (int i13 = 0; i13 < 6; i13++) {
            iArr2[i13] = pVar.i(8);
        }
        i2 = i11;
        iArr = iArr2;
        z2 = zH;
        i3 = i5;
        i4 = i6;
        int i14 = pVar.i(8);
        i7 = 0;
        while (i10 < i) {
            if (pVar.h()) {
                i7 += 88;
            }
            if (pVar.h()) {
                i7 += 8;
            }
        }
        pVar.t(i7);
        if (i > 0) {
            pVar.t((8 - i) * 2);
        }
        return new h(i2, z2, i3, i4, iArr, i14);
    }

    public static nc2 h(int i, int i2, byte[] bArr) {
        byte b2;
        int i3 = i + 2;
        int i4 = i2 - 1;
        while (true) {
            b2 = bArr[i4];
            if (b2 != 0 || i4 <= i3) {
                break;
            }
            i4--;
        }
        if (b2 == 0 || i4 <= i3) {
            return null;
        }
        p pVar = new p(bArr, i3, i4 + 1);
        while (pVar.d(16)) {
            int i5 = pVar.i(8);
            int i6 = 0;
            while (i5 == 255) {
                i6 += 255;
                i5 = pVar.i(8);
            }
            int i7 = i6 + i5;
            int i8 = pVar.i(8);
            int i9 = 0;
            while (i8 == 255) {
                i9 += 255;
                i8 = pVar.i(8);
            }
            int i10 = i9 + i8;
            if (i10 == 0 || !pVar.d(i10)) {
                return null;
            }
            if (i7 == 176) {
                int iM = pVar.m();
                boolean zH = pVar.h();
                int iM2 = zH ? pVar.m() : 0;
                int iM3 = pVar.m();
                int iM4 = -1;
                for (int i11 = 0; i11 <= iM3; i11++) {
                    iM4 = pVar.m();
                    pVar.m();
                    int i12 = pVar.i(6);
                    if (i12 == 63) {
                        return null;
                    }
                    pVar.i(i12 == 0 ? Math.max(0, iM - 30) : Math.max(0, (i12 + iM) - 31));
                    if (zH) {
                        int i13 = pVar.i(6);
                        if (i13 == 63) {
                            return null;
                        }
                        pVar.i(i13 == 0 ? Math.max(0, iM2 - 30) : Math.max(0, (i13 + iM2) - 31));
                    }
                    if (pVar.h()) {
                        pVar.t(10);
                    }
                }
                return new nc2(iM4, 1);
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01ad  */
    /* JADX WARN: Code duplicated, block: B:101:0x01af  */
    /* JADX WARN: Code duplicated, block: B:12:0x004a  */
    /* JADX WARN: Code duplicated, block: B:152:0x027d  */
    /* JADX WARN: Code duplicated, block: B:154:0x0292 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:155:0x0294  */
    /* JADX WARN: Code duplicated, block: B:156:0x0299  */
    /* JADX WARN: Code duplicated, block: B:160:0x02ae A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:161:0x02b0  */
    /* JADX WARN: Code duplicated, block: B:162:0x02b5  */
    /* JADX WARN: Code duplicated, block: B:168:0x02dc  */
    /* JADX WARN: Code duplicated, block: B:170:0x02e3 A[LOOP:12: B:169:0x02e1->B:170:0x02e3, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:173:0x02f7  */
    /* JADX WARN: Code duplicated, block: B:175:0x02fd  */
    /* JADX WARN: Code duplicated, block: B:177:0x0307  */
    /* JADX WARN: Code duplicated, block: B:179:0x0313 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:181:0x0319  */
    /* JADX WARN: Code duplicated, block: B:183:0x031d  */
    /* JADX WARN: Code duplicated, block: B:184:0x0322  */
    /* JADX WARN: Code duplicated, block: B:187:0x032f  */
    /* JADX WARN: Code duplicated, block: B:190:0x0338  */
    /* JADX WARN: Code duplicated, block: B:192:0x0342  */
    /* JADX WARN: Code duplicated, block: B:193:0x0345  */
    /* JADX WARN: Code duplicated, block: B:196:0x034c  */
    /* JADX WARN: Code duplicated, block: B:197:0x0362  */
    /* JADX WARN: Code duplicated, block: B:198:0x0365  */
    /* JADX WARN: Code duplicated, block: B:199:0x0367  */
    /* JADX WARN: Code duplicated, block: B:204:0x038a  */
    /* JADX WARN: Code duplicated, block: B:207:0x0393  */
    /* JADX WARN: Code duplicated, block: B:210:0x03a2  */
    /* JADX WARN: Code duplicated, block: B:212:0x03ac  */
    /* JADX WARN: Code duplicated, block: B:57:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:59:0x0105  */
    /* JADX WARN: Code duplicated, block: B:60:0x0107  */
    /* JADX WARN: Code duplicated, block: B:63:0x010b A[LOOP:0: B:62:0x0109->B:63:0x010b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:64:0x011c  */
    /* JADX WARN: Code duplicated, block: B:67:0x0135 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:68:0x0137  */
    /* JADX WARN: Code duplicated, block: B:69:0x013c  */
    /* JADX WARN: Code duplicated, block: B:72:0x0140  */
    /* JADX WARN: Code duplicated, block: B:74:0x0145  */
    /* JADX WARN: Code duplicated, block: B:76:0x014b  */
    /* JADX WARN: Code duplicated, block: B:78:0x014e  */
    /* JADX WARN: Code duplicated, block: B:80:0x0151  */
    /* JADX WARN: Code duplicated, block: B:82:0x0157  */
    /* JADX WARN: Code duplicated, block: B:84:0x015c  */
    /* JADX WARN: Code duplicated, block: B:86:0x016a  */
    /* JADX WARN: Code duplicated, block: B:89:0x0170 A[LOOP:3: B:88:0x016e->B:89:0x0170, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:91:0x0178  */
    /* JADX WARN: Code duplicated, block: B:92:0x017a  */
    /* JADX WARN: Code duplicated, block: B:97:0x018d  */
    public static k i(byte[] bArr, int i, int i2, com.moloco.sdk.internal.error.crash.data.network.b bVar) {
        int i3;
        int iB;
        int i4;
        int iM;
        int iM2;
        int i5;
        int iM3;
        int iMax;
        int iM4;
        int[] iArr;
        int[] iArrCopyOf;
        int i6;
        int iM5;
        int i7;
        float f;
        int i8;
        int i9;
        int i10;
        int i11;
        int iF;
        int iG;
        int i12;
        i iVar;
        int i13;
        int i14;
        int i15;
        int iM6;
        int i16;
        int iM7;
        int[] iArr2;
        int i17;
        int[] iArr3;
        int i18;
        int i19;
        int i20;
        boolean zH;
        int i21;
        int i22;
        int i23;
        int iMin;
        int i24;
        int i25;
        int i26;
        i iVar2;
        l63 l63VarF = f(new p(bArr, i, i2));
        int i27 = 2;
        p pVar = new p(bArr, i + 2, i2);
        int i28 = 4;
        pVar.t(4);
        int i29 = pVar.i(3);
        int i30 = l63VarF.b;
        boolean z = i30 != 0 && i29 == 7;
        if (bVar != null) {
            d31 d31Var = (d31) bVar.b;
            if (d31Var.isEmpty()) {
                i3 = 0;
            } else {
                i3 = ((g) d31Var.get(Math.min(i30, d31Var.size() - 1))).a;
            }
        } else {
            i3 = 0;
        }
        h hVarG = null;
        if (!z) {
            pVar.s();
            hVarG = g(pVar, true, i29, null);
        } else if (bVar != null) {
            i iVar3 = (i) bVar.c;
            int[] iArr4 = iVar3.b;
            d31 d31Var2 = iVar3.a;
            int i31 = iArr4[i3];
            if (d31Var2.size() > i31) {
                hVarG = (h) d31Var2.get(i31);
            }
        }
        pVar.m();
        if (z) {
            int i32 = pVar.h() ? pVar.i(8) : -1;
            if (bVar != null && (iVar2 = (i) bVar.d) != null) {
                d31 d31Var3 = iVar2.a;
                if (i32 == -1) {
                    i32 = iVar2.b[i3];
                }
                if (i32 != -1 && d31Var3.size() > i32) {
                    j jVar = (j) d31Var3.get(i32);
                    int i33 = jVar.a;
                    i4 = jVar.d;
                    iB = jVar.e;
                    iM = jVar.b;
                    iM2 = jVar.c;
                }
                iM3 = pVar.m();
                if (z) {
                    iMax = -1;
                } else {
                    if (pVar.h()) {
                        i26 = 0;
                    } else {
                        i26 = i29;
                    }
                    iMax = -1;
                    while (i26 <= i29) {
                        pVar.m();
                        iMax = Math.max(pVar.m(), iMax);
                        pVar.m();
                        i26++;
                    }
                }
                pVar.m();
                pVar.m();
                pVar.m();
                pVar.m();
                pVar.m();
                pVar.m();
                if (pVar.h()) {
                    if (z) {
                        zH = pVar.h();
                    } else {
                        zH = false;
                    }
                    i21 = 6;
                    if (zH) {
                        pVar.t(6);
                    } else if (pVar.h()) {
                        i22 = 0;
                        while (i22 < i28) {
                            i23 = 0;
                            while (i23 < i21) {
                                if (pVar.h()) {
                                    iMin = Math.min(64, 1 << ((i22 << 1) + 4));
                                    if (i22 > 1) {
                                        pVar.n();
                                    }
                                    for (i24 = 0; i24 < iMin; i24++) {
                                        pVar.n();
                                    }
                                } else {
                                    pVar.m();
                                }
                                if (i22 == 3) {
                                    i25 = 3;
                                } else {
                                    i25 = 1;
                                }
                                i23 += i25;
                                i21 = 6;
                            }
                            i22++;
                            i28 = 4;
                            i21 = 6;
                        }
                    }
                }
                pVar.t(2);
                if (pVar.h()) {
                    pVar.t(8);
                    pVar.m();
                    pVar.m();
                    pVar.s();
                }
                iM4 = pVar.m();
                iArr = new int[0];
                iArrCopyOf = new int[0];
                i6 = 0;
                iM5 = -1;
                i7 = -1;
                while (i6 < iM4) {
                    if (i6 == 0 && pVar.h()) {
                        int i34 = i7 + iM5;
                        int iM8 = (1 - ((pVar.h() ? 1 : 0) * 2)) * (pVar.m() + 1);
                        int i35 = i34 + 1;
                        boolean[] zArr = new boolean[i35];
                        for (int i36 = 0; i36 <= i34; i36++) {
                            if (pVar.h()) {
                                zArr[i36] = true;
                            } else {
                                zArr[i36] = pVar.h();
                            }
                        }
                        int[] iArr5 = new int[i35];
                        int[] iArr6 = new int[i35];
                        int i37 = 0;
                        for (int i38 = iM5 - 1; i38 >= 0; i38--) {
                            int i39 = iArrCopyOf[i38] + iM8;
                            if (i39 < 0 && zArr[i7 + i38]) {
                                iArr5[i37] = i39;
                                i37++;
                            }
                        }
                        if (iM8 < 0 && zArr[i34]) {
                            iArr5[i37] = iM8;
                            i37++;
                        }
                        iM7 = i37;
                        for (int i40 = 0; i40 < i7; i40++) {
                            int i41 = iArr[i40] + iM8;
                            if (i41 < 0 && zArr[i40]) {
                                iArr5[iM7] = i41;
                                iM7++;
                            }
                        }
                        int[] iArrCopyOf2 = Arrays.copyOf(iArr5, iM7);
                        int i42 = 0;
                        for (int i43 = i7 - 1; i43 >= 0; i43--) {
                            int i44 = iArr[i43] + iM8;
                            if (i44 > 0 && zArr[i43]) {
                                iArr6[i42] = i44;
                                i42++;
                            }
                        }
                        if (iM8 > 0 && zArr[i34]) {
                            iArr6[i42] = iM8;
                            i42++;
                        }
                        int i45 = i42;
                        for (int i46 = 0; i46 < iM5; i46++) {
                            int i47 = iArrCopyOf[i46] + iM8;
                            if (i47 > 0 && zArr[i7 + i46]) {
                                iArr6[i45] = i47;
                                i45++;
                            }
                        }
                        iArrCopyOf = Arrays.copyOf(iArr6, i45);
                        iArr = iArrCopyOf2;
                        iM5 = i45;
                    } else {
                        iM7 = pVar.m();
                        iM5 = pVar.m();
                        iArr2 = new int[iM7];
                        for (i17 = 0; i17 < iM7; i17++) {
                            if (i17 > 0) {
                                i20 = iArr2[i17 - 1];
                            } else {
                                i20 = 0;
                            }
                            iArr2[i17] = i20 - (pVar.m() + 1);
                            pVar.s();
                        }
                        iArr3 = new int[iM5];
                        for (i18 = 0; i18 < iM5; i18++) {
                            if (i18 > 0) {
                                i19 = iArr3[i18 - 1];
                            } else {
                                i19 = 0;
                            }
                            iArr3[i18] = pVar.m() + 1 + i19;
                            pVar.s();
                        }
                        iArr = iArr2;
                        iArrCopyOf = iArr3;
                    }
                    i7 = iM7;
                    i6++;
                    iM4 = iM4;
                    i3 = i3;
                    iMax = iMax;
                }
                int i48 = i3;
                int i49 = iMax;
                if (pVar.h()) {
                    iM6 = pVar.m();
                    for (i16 = 0; i16 < iM6; i16++) {
                        pVar.t(iM3 + 5);
                    }
                }
                pVar.t(2);
                f = 1.0f;
                if (pVar.h()) {
                    if (pVar.h()) {
                        i13 = pVar.i(8);
                        if (i13 == 255) {
                            i14 = pVar.i(16);
                            i15 = pVar.i(16);
                            if (i14 != 0 && i15 != 0) {
                                f = i14 / i15;
                            }
                        } else if (i13 < 17) {
                            f = b[i13];
                        } else {
                            b.c(i13, "Unexpected aspect_ratio_idc value: ", "NalUnitUtil");
                        }
                    }
                    if (pVar.h()) {
                        pVar.s();
                    }
                    if (pVar.h()) {
                        pVar.t(3);
                        if (pVar.h()) {
                            i12 = 1;
                        } else {
                            i12 = 2;
                        }
                        if (pVar.h()) {
                            int i50 = pVar.i(8);
                            int i51 = pVar.i(8);
                            pVar.t(8);
                            iF = f.f(i50);
                            iG = f.g(i51);
                        } else {
                            iF = -1;
                            iG = -1;
                        }
                    } else if (bVar != null || (iVar = (i) bVar.e) == null) {
                        iF = -1;
                        iG = -1;
                        i12 = -1;
                    } else {
                        d31 d31Var4 = iVar.a;
                        int i52 = iVar.b[i48];
                        if (d31Var4.size() > i52) {
                            l lVar = (l) d31Var4.get(i52);
                            int i53 = lVar.a;
                            int i54 = lVar.b;
                            iG = lVar.c;
                            iF = i53;
                            i12 = i54;
                        } else {
                            iF = -1;
                            iG = -1;
                            i12 = -1;
                        }
                    }
                    if (pVar.h()) {
                        pVar.m();
                        pVar.m();
                    }
                    pVar.s();
                    if (pVar.h()) {
                        iB *= 2;
                    }
                    i9 = iF;
                    i11 = iG;
                    i10 = i12;
                    i8 = iB;
                } else {
                    i8 = iB;
                    i9 = -1;
                    i10 = -1;
                    i11 = -1;
                }
                return new k(i29, hVarG, iM, i5, i4, i8, f, i49, i9, i10, i11);
            }
            i5 = 0;
            iM = 0;
            i4 = 0;
            iB = 0;
            iM3 = pVar.m();
            if (z) {
                if (pVar.h()) {
                    i26 = 0;
                } else {
                    i26 = i29;
                }
                iMax = -1;
                while (i26 <= i29) {
                    pVar.m();
                    iMax = Math.max(pVar.m(), iMax);
                    pVar.m();
                    i26++;
                }
            } else {
                iMax = -1;
            }
            pVar.m();
            pVar.m();
            pVar.m();
            pVar.m();
            pVar.m();
            pVar.m();
            if (pVar.h()) {
                if (z) {
                    zH = pVar.h();
                } else {
                    zH = false;
                }
                i21 = 6;
                if (zH) {
                    pVar.t(6);
                } else if (pVar.h()) {
                    i22 = 0;
                    while (i22 < i28) {
                        i23 = 0;
                        while (i23 < i21) {
                            if (pVar.h()) {
                                pVar.m();
                            } else {
                                iMin = Math.min(64, 1 << ((i22 << 1) + 4));
                                if (i22 > 1) {
                                    pVar.n();
                                }
                                while (i24 < iMin) {
                                    pVar.n();
                                }
                            }
                            if (i22 == 3) {
                                i25 = 3;
                            } else {
                                i25 = 1;
                            }
                            i23 += i25;
                            i21 = 6;
                        }
                        i22++;
                        i28 = 4;
                        i21 = 6;
                    }
                }
            }
            pVar.t(2);
            if (pVar.h()) {
                pVar.t(8);
                pVar.m();
                pVar.m();
                pVar.s();
            }
            iM4 = pVar.m();
            iArr = new int[0];
            iArrCopyOf = new int[0];
            i6 = 0;
            iM5 = -1;
            i7 = -1;
            while (i6 < iM4) {
                if (i6 == 0) {
                    iM7 = pVar.m();
                    iM5 = pVar.m();
                    iArr2 = new int[iM7];
                    while (i17 < iM7) {
                        if (i17 > 0) {
                            i20 = iArr2[i17 - 1];
                        } else {
                            i20 = 0;
                        }
                        iArr2[i17] = i20 - (pVar.m() + 1);
                        pVar.s();
                    }
                    iArr3 = new int[iM5];
                    while (i18 < iM5) {
                        if (i18 > 0) {
                            i19 = iArr3[i18 - 1];
                        } else {
                            i19 = 0;
                        }
                        iArr3[i18] = pVar.m() + 1 + i19;
                        pVar.s();
                    }
                    iArr = iArr2;
                    iArrCopyOf = iArr3;
                } else {
                    iM7 = pVar.m();
                    iM5 = pVar.m();
                    iArr2 = new int[iM7];
                    while (i17 < iM7) {
                        if (i17 > 0) {
                            i20 = iArr2[i17 - 1];
                        } else {
                            i20 = 0;
                        }
                        iArr2[i17] = i20 - (pVar.m() + 1);
                        pVar.s();
                    }
                    iArr3 = new int[iM5];
                    while (i18 < iM5) {
                        if (i18 > 0) {
                            i19 = iArr3[i18 - 1];
                        } else {
                            i19 = 0;
                        }
                        iArr3[i18] = pVar.m() + 1 + i19;
                        pVar.s();
                    }
                    iArr = iArr2;
                    iArrCopyOf = iArr3;
                }
                i7 = iM7;
                i6++;
                iM4 = iM4;
                i3 = i3;
                iMax = iMax;
            }
            int i410 = i3;
            int i411 = iMax;
            if (pVar.h()) {
                iM6 = pVar.m();
                while (i16 < iM6) {
                    pVar.t(iM3 + 5);
                }
            }
            pVar.t(2);
            f = 1.0f;
            if (pVar.h()) {
                if (pVar.h()) {
                    i13 = pVar.i(8);
                    if (i13 == 255) {
                        i14 = pVar.i(16);
                        i15 = pVar.i(16);
                        if (i14 != 0) {
                            f = i14 / i15;
                        }
                    } else if (i13 < 17) {
                        f = b[i13];
                    } else {
                        b.c(i13, "Unexpected aspect_ratio_idc value: ", "NalUnitUtil");
                    }
                }
                if (pVar.h()) {
                    pVar.s();
                }
                if (pVar.h()) {
                    pVar.t(3);
                    if (pVar.h()) {
                        i12 = 1;
                    } else {
                        i12 = 2;
                    }
                    if (pVar.h()) {
                        int i55 = pVar.i(8);
                        int i56 = pVar.i(8);
                        pVar.t(8);
                        iF = f.f(i55);
                        iG = f.g(i56);
                    } else {
                        iF = -1;
                        iG = -1;
                    }
                } else if (bVar != null) {
                    iF = -1;
                    iG = -1;
                    i12 = -1;
                } else {
                    iF = -1;
                    iG = -1;
                    i12 = -1;
                }
                if (pVar.h()) {
                    pVar.m();
                    pVar.m();
                }
                pVar.s();
                if (pVar.h()) {
                    iB *= 2;
                }
                i9 = iF;
                i11 = iG;
                i10 = i12;
                i8 = iB;
            } else {
                i8 = iB;
                i9 = -1;
                i10 = -1;
                i11 = -1;
            }
            return new k(i29, hVarG, iM, i5, i4, i8, f, i411, i9, i10, i11);
        }
        int iM9 = pVar.m();
        if (iM9 == 3) {
            pVar.s();
        }
        int iM10 = pVar.m();
        int iM11 = pVar.m();
        if (pVar.h()) {
            int iM12 = pVar.m();
            int iM13 = pVar.m();
            int iM14 = pVar.m();
            int iM15 = pVar.m();
            if (iM9 != 1 && iM9 != 2) {
                i27 = 1;
            }
            int iB2 = jc1.B(iM12, iM13, i27, iM10);
            iB = jc1.B(iM14, iM15, iM9 == 1 ? 2 : 1, iM11);
            i4 = iB2;
        } else {
            iB = iM11;
            i4 = iM10;
        }
        iM = pVar.m();
        iM2 = pVar.m();
        i5 = iM2;
        iM3 = pVar.m();
        if (z) {
            if (pVar.h()) {
                i26 = 0;
            } else {
                i26 = i29;
            }
            iMax = -1;
            while (i26 <= i29) {
                pVar.m();
                iMax = Math.max(pVar.m(), iMax);
                pVar.m();
                i26++;
            }
        } else {
            iMax = -1;
        }
        pVar.m();
        pVar.m();
        pVar.m();
        pVar.m();
        pVar.m();
        pVar.m();
        if (pVar.h()) {
            if (z) {
                zH = pVar.h();
            } else {
                zH = false;
            }
            i21 = 6;
            if (zH) {
                pVar.t(6);
            } else if (pVar.h()) {
                i22 = 0;
                while (i22 < i28) {
                    i23 = 0;
                    while (i23 < i21) {
                        if (pVar.h()) {
                            pVar.m();
                        } else {
                            iMin = Math.min(64, 1 << ((i22 << 1) + 4));
                            if (i22 > 1) {
                                pVar.n();
                            }
                            while (i24 < iMin) {
                                pVar.n();
                            }
                        }
                        if (i22 == 3) {
                            i25 = 3;
                        } else {
                            i25 = 1;
                        }
                        i23 += i25;
                        i21 = 6;
                    }
                    i22++;
                    i28 = 4;
                    i21 = 6;
                }
            }
        }
        pVar.t(2);
        if (pVar.h()) {
            pVar.t(8);
            pVar.m();
            pVar.m();
            pVar.s();
        }
        iM4 = pVar.m();
        iArr = new int[0];
        iArrCopyOf = new int[0];
        i6 = 0;
        iM5 = -1;
        i7 = -1;
        while (i6 < iM4) {
            if (i6 == 0) {
                iM7 = pVar.m();
                iM5 = pVar.m();
                iArr2 = new int[iM7];
                while (i17 < iM7) {
                    if (i17 > 0) {
                        i20 = iArr2[i17 - 1];
                    } else {
                        i20 = 0;
                    }
                    iArr2[i17] = i20 - (pVar.m() + 1);
                    pVar.s();
                }
                iArr3 = new int[iM5];
                while (i18 < iM5) {
                    if (i18 > 0) {
                        i19 = iArr3[i18 - 1];
                    } else {
                        i19 = 0;
                    }
                    iArr3[i18] = pVar.m() + 1 + i19;
                    pVar.s();
                }
                iArr = iArr2;
                iArrCopyOf = iArr3;
            } else {
                iM7 = pVar.m();
                iM5 = pVar.m();
                iArr2 = new int[iM7];
                while (i17 < iM7) {
                    if (i17 > 0) {
                        i20 = iArr2[i17 - 1];
                    } else {
                        i20 = 0;
                    }
                    iArr2[i17] = i20 - (pVar.m() + 1);
                    pVar.s();
                }
                iArr3 = new int[iM5];
                while (i18 < iM5) {
                    if (i18 > 0) {
                        i19 = iArr3[i18 - 1];
                    } else {
                        i19 = 0;
                    }
                    iArr3[i18] = pVar.m() + 1 + i19;
                    pVar.s();
                }
                iArr = iArr2;
                iArrCopyOf = iArr3;
            }
            i7 = iM7;
            i6++;
            iM4 = iM4;
            i3 = i3;
            iMax = iMax;
        }
        int i412 = i3;
        int i413 = iMax;
        if (pVar.h()) {
            iM6 = pVar.m();
            while (i16 < iM6) {
                pVar.t(iM3 + 5);
            }
        }
        pVar.t(2);
        f = 1.0f;
        if (pVar.h()) {
            if (pVar.h()) {
                i13 = pVar.i(8);
                if (i13 == 255) {
                    i14 = pVar.i(16);
                    i15 = pVar.i(16);
                    if (i14 != 0) {
                        f = i14 / i15;
                    }
                } else if (i13 < 17) {
                    f = b[i13];
                } else {
                    b.c(i13, "Unexpected aspect_ratio_idc value: ", "NalUnitUtil");
                }
            }
            if (pVar.h()) {
                pVar.s();
            }
            if (pVar.h()) {
                pVar.t(3);
                if (pVar.h()) {
                    i12 = 1;
                } else {
                    i12 = 2;
                }
                if (pVar.h()) {
                    int i57 = pVar.i(8);
                    int i58 = pVar.i(8);
                    pVar.t(8);
                    iF = f.f(i57);
                    iG = f.g(i58);
                } else {
                    iF = -1;
                    iG = -1;
                }
            } else if (bVar != null) {
                iF = -1;
                iG = -1;
                i12 = -1;
            } else {
                iF = -1;
                iG = -1;
                i12 = -1;
            }
            if (pVar.h()) {
                pVar.m();
                pVar.m();
            }
            pVar.s();
            if (pVar.h()) {
                iB *= 2;
            }
            i9 = iF;
            i11 = iG;
            i10 = i12;
            i8 = iB;
        } else {
            i8 = iB;
            i9 = -1;
            i10 = -1;
            i11 = -1;
        }
        return new k(i29, hVarG, iM, i5, i4, i8, f, i413, i9, i10, i11);
    }

    /* JADX WARN: Code duplicated, block: B:474:0x0159 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:60:0x0116  */
    /* JADX WARN: Code duplicated, block: B:62:0x011c  */
    /* JADX WARN: Code duplicated, block: B:64:0x0122  */
    /* JADX WARN: Code duplicated, block: B:65:0x0128  */
    /* JADX WARN: Code duplicated, block: B:67:0x012e  */
    /* JADX WARN: Code duplicated, block: B:69:0x013b  */
    /* JADX WARN: Code duplicated, block: B:72:0x0146  */
    /* JADX WARN: Code duplicated, block: B:74:0x014b  */
    /* JADX WARN: Code duplicated, block: B:76:0x0153  */
    /* JADX WARN: Multi-variable type inference failed */
    public static com.moloco.sdk.internal.error.crash.data.network.b j(int i, int i2, byte[] bArr) {
        int[] iArr;
        i iVar;
        int i3;
        int i4;
        int i5;
        y32 y32Var;
        boolean[][] zArr;
        int i6;
        boolean[][] zArr2;
        int[] iArr2;
        int[] iArr3;
        boolean z;
        int i7;
        boolean zH;
        int i8;
        int i9;
        int i10;
        boolean zH2;
        boolean zH3;
        int iM;
        int i11;
        int i12;
        int i13;
        boolean z2;
        boolean z3;
        p pVar = new p(bArr, i, i2);
        f(pVar);
        pVar.t(4);
        boolean zH4 = pVar.h();
        boolean zH5 = pVar.h();
        int i14 = pVar.i(6);
        int i15 = i14 + 1;
        int i16 = pVar.i(3);
        pVar.t(17);
        h hVarG = g(pVar, true, i16, null);
        for (int i17 = pVar.h() ? 0 : i16; i17 <= i16; i17++) {
            pVar.m();
            pVar.m();
            pVar.m();
        }
        int i18 = pVar.i(6);
        int iM2 = pVar.m() + 1;
        int i19 = 6;
        i iVar2 = new i(d31.E(hVarG), new int[1], 0);
        boolean z4 = i15 >= 2 && iM2 >= 2;
        boolean z5 = zH4 && zH5;
        int i20 = i18 + 1;
        boolean z6 = i20 >= i15;
        if (!z4 || !z5 || !z6) {
            return new com.moloco.sdk.internal.error.crash.data.network.b((y32) null, iVar2, (i) null, (i) null);
        }
        Class cls = Integer.TYPE;
        int[][] iArr4 = (int[][]) Array.newInstance((Class<?>) cls, iM2, i20);
        int i21 = 1;
        int[] iArr5 = new int[iM2];
        int[] iArr6 = new int[iM2];
        iArr4[0][0] = 0;
        iArr5[0] = 1;
        iArr6[0] = 0;
        for (int i22 = 1; i22 < iM2; i22++) {
            int i23 = 0;
            for (int i24 = 0; i24 <= i18; i24++) {
                if (pVar.h()) {
                    iArr4[i22][i23] = i24;
                    iArr6[i22] = i24;
                    i23++;
                }
                iArr5[i22] = i23;
            }
        }
        if (pVar.h()) {
            pVar.t(64);
            if (pVar.h()) {
                pVar.m();
            }
            int iM3 = pVar.m();
            int i25 = 0;
            while (i25 < iM3) {
                pVar.m();
                if (i25 == 0 || pVar.h()) {
                    boolean zH6 = pVar.h();
                    boolean zH7 = pVar.h();
                    z3 = zH6;
                    z2 = zH7;
                    if (zH6 || zH7) {
                        zH = pVar.h();
                        if (zH) {
                            pVar.t(19);
                        }
                        pVar.t(8);
                        if (zH) {
                            pVar.t(4);
                        }
                        pVar.t(15);
                        i9 = zH6;
                        i8 = zH7;
                    }
                    i10 = 0;
                    while (i10 <= i16) {
                        zH2 = pVar.h();
                        if (!zH2) {
                            zH2 = pVar.h();
                        }
                        if (zH2) {
                            pVar.m();
                            zH3 = false;
                        } else {
                            zH3 = pVar.h();
                        }
                        if (zH3) {
                            iM = 0;
                        } else {
                            iM = pVar.m();
                        }
                        int[][] iArr7 = iArr4;
                        i11 = i9 + i8;
                        int[] iArr8 = iArr6;
                        i12 = 0;
                        while (i12 < i11) {
                            int i26 = i11;
                            for (i13 = 0; i13 <= iM; i13++) {
                                pVar.m();
                                pVar.m();
                                if (zH) {
                                    pVar.m();
                                    pVar.m();
                                }
                                pVar.s();
                            }
                            i12++;
                            i11 = i26;
                        }
                        i10++;
                        i25 = i25;
                        iArr4 = iArr7;
                        iArr6 = iArr8;
                    }
                    i25++;
                } else {
                    z3 = false;
                    z2 = false;
                }
                zH = false;
                i9 = z3;
                i8 = z2;
                i10 = 0;
                while (i10 <= i16) {
                    zH2 = pVar.h();
                    if (!zH2) {
                        zH2 = pVar.h();
                    }
                    if (zH2) {
                        pVar.m();
                        zH3 = false;
                    } else {
                        zH3 = pVar.h();
                    }
                    if (zH3) {
                        iM = pVar.m();
                    } else {
                        iM = 0;
                    }
                    int[][] iArr9 = iArr4;
                    i11 = i9 + i8;
                    int[] iArr10 = iArr6;
                    i12 = 0;
                    while (i12 < i11) {
                        int i27 = i11;
                        while (i13 <= iM) {
                            pVar.m();
                            pVar.m();
                            if (zH) {
                                pVar.m();
                                pVar.m();
                            }
                            pVar.s();
                        }
                        i12++;
                        i11 = i27;
                    }
                    i10++;
                    i25 = i25;
                    iArr4 = iArr9;
                    iArr6 = iArr10;
                }
                i25++;
            }
        }
        int[][] iArr11 = iArr4;
        int[] iArr12 = iArr6;
        if (!pVar.h()) {
            return new com.moloco.sdk.internal.error.crash.data.network.b((y32) null, iVar2, (i) null, (i) null);
        }
        int i28 = pVar.e;
        if (i28 > 0) {
            pVar.t(8 - i28);
        }
        h hVarG2 = g(pVar, false, i16, hVarG);
        boolean zH8 = pVar.h();
        boolean[] zArr3 = new boolean[16];
        int i29 = 0;
        for (int i30 = 0; i30 < 16; i30++) {
            boolean zH9 = pVar.h();
            zArr3[i30] = zH9;
            if (zH9) {
                i29++;
            }
        }
        if (i29 == 0 || !zArr3[1]) {
            return new com.moloco.sdk.internal.error.crash.data.network.b((y32) null, iVar2, (i) null, (i) null);
        }
        int[] iArr13 = new int[i29];
        for (int i31 = 0; i31 < i29 - (zH8 ? 1 : 0); i31++) {
            iArr13[i31] = pVar.i(3);
        }
        int[] iArr14 = new int[i29 + 1];
        if (zH8) {
            int i32 = 1;
            while (i32 < i29) {
                int[] iArr15 = iArr14;
                for (int i33 = 0; i33 < i32; i33++) {
                    iArr15[i32] = iArr13[i33] + 1 + iArr15[i32];
                }
                i32++;
                iArr14 = iArr15;
            }
            iArr = iArr14;
            iArr[i29] = 6;
        } else {
            iArr = iArr14;
        }
        int[][] iArr16 = (int[][]) Array.newInstance((Class<?>) cls, i15, i29);
        int[] iArr17 = new int[i15];
        iArr17[0] = 0;
        boolean zH10 = pVar.h();
        int i34 = 1;
        while (i34 < i15) {
            if (zH10) {
                i7 = i34;
                iArr17[i7] = pVar.i(i19);
            } else {
                i7 = i34;
                iArr17[i7] = i7;
            }
            if (zH8) {
                int i35 = 0;
                while (i35 < i29) {
                    int i36 = i35 + 1;
                    iArr16[i7][i35] = (iArr17[i7] & ((1 << iArr[i36]) - 1)) >> iArr[i35];
                    i35 = i36;
                }
            } else {
                int i37 = 0;
                while (i37 < i29) {
                    int i38 = i37;
                    iArr16[i7][i38] = pVar.i(iArr13[i37] + 1);
                    i37 = i38 + 1;
                }
            }
            i34 = i7 + 1;
            i19 = 6;
        }
        int[] iArr18 = new int[i20];
        int i39 = 1;
        int i40 = 0;
        while (i40 < i15) {
            iArr18[iArr17[i40]] = -1;
            int[] iArr19 = iArr18;
            int i41 = 0;
            int i42 = 0;
            while (i41 < 16) {
                if (zArr3[i41]) {
                    if (i41 == i21) {
                        iArr19[iArr17[i40]] = iArr16[i40][i42];
                    }
                    i42++;
                }
                i41++;
                i21 = 1;
            }
            if (i40 > 0) {
                int i43 = 0;
                while (true) {
                    if (i43 >= i40) {
                        z = true;
                        break;
                    }
                    int i44 = i43;
                    if (iArr19[iArr17[i40]] == iArr19[iArr17[i43]]) {
                        z = false;
                        break;
                    }
                    i43 = i44 + 1;
                }
                if (z) {
                    i39++;
                }
            }
            i40++;
            iArr18 = iArr19;
            i21 = 1;
        }
        int[] iArr20 = iArr18;
        int i45 = pVar.i(4);
        if (i39 < 2 || i45 == 0) {
            return new com.moloco.sdk.internal.error.crash.data.network.b((y32) null, iVar2, (i) null, (i) null);
        }
        int[] iArr21 = new int[i39];
        for (int i46 = 0; i46 < i39; i46++) {
            iArr21[i46] = pVar.i(i45);
        }
        int[] iArr22 = new int[i20];
        for (int i47 = 0; i47 < i15; i47++) {
            iArr22[Math.min(iArr17[i47], i18)] = i47;
        }
        y21 y21VarX = d31.x();
        int i48 = 0;
        while (i48 <= i18) {
            int[] iArr23 = iArr22;
            int i49 = i39;
            int iMin = Math.min(iArr20[i48], i49 - 1);
            y21VarX.a(new g(iArr23[i48], iMin >= 0 ? iArr21[iMin] : -1));
            i48++;
            iArr22 = iArr23;
            iArr17 = iArr17;
            i39 = i49;
        }
        int[] iArr24 = iArr17;
        y32 y32VarG = y21VarX.g();
        if (((g) y32VarG.get(0)).b == -1) {
            return new com.moloco.sdk.internal.error.crash.data.network.b((y32) null, iVar2, (i) null, (i) null);
        }
        int i50 = 1;
        while (true) {
            if (i50 > i18) {
                i50 = -1;
                break;
            }
            if (((g) y32VarG.get(i50)).b != -1) {
                break;
            }
            i50++;
        }
        if (i50 == -1) {
            return new com.moloco.sdk.internal.error.crash.data.network.b((y32) null, iVar2, (i) null, (i) null);
        }
        Class cls2 = Boolean.TYPE;
        boolean[][] zArr4 = (boolean[][]) Array.newInstance((Class<?>) cls2, i15, i15);
        boolean[][] zArr5 = (boolean[][]) Array.newInstance((Class<?>) cls2, i15, i15);
        for (int i51 = 1; i51 < i15; i51++) {
            for (int i52 = 0; i52 < i51; i52++) {
                boolean[] zArr6 = zArr4[i51];
                boolean[] zArr7 = zArr5[i51];
                boolean zH11 = pVar.h();
                zArr7[i52] = zH11;
                zArr6[i52] = zH11;
            }
        }
        for (int i53 = 1; i53 < i15; i53++) {
            int i54 = 0;
            while (i54 < i14) {
                boolean[][] zArr8 = zArr4;
                for (int i55 = 0; i55 < i53; i55++) {
                    boolean[] zArr9 = zArr5[i53];
                    if (zArr9[i55] && zArr5[i55][i54]) {
                        zArr9[i54] = true;
                        break;
                    }
                }
                i54++;
                zArr4 = zArr8;
            }
        }
        boolean[][] zArr10 = zArr4;
        int[] iArr25 = new int[i20];
        for (int i56 = 0; i56 < i15; i56++) {
            int i57 = 0;
            for (int i58 = 0; i58 < i56; i58++) {
                i57 += zArr10[i56][i58] ? 1 : 0;
            }
            iArr25[iArr24[i56]] = i57;
        }
        int i59 = 0;
        for (int i60 = 0; i60 < i15; i60++) {
            if (iArr25[iArr24[i60]] == 0) {
                i59++;
            }
        }
        if (i59 > 1) {
            return new com.moloco.sdk.internal.error.crash.data.network.b((y32) null, iVar2, (i) null, (i) null);
        }
        int[] iArr26 = new int[i15];
        int[] iArr27 = new int[iM2];
        if (pVar.h()) {
            int i61 = 0;
            while (i61 < i15) {
                int i62 = i61;
                iArr26[i62] = pVar.i(3);
                i61 = i62 + 1;
            }
        } else {
            Arrays.fill(iArr26, 0, i15, i16);
        }
        int i63 = 0;
        while (i63 < iM2) {
            int i64 = i63;
            boolean[][] zArr11 = zArr5;
            int[] iArr28 = iArr26;
            int iMax = 0;
            for (int i65 = 0; i65 < iArr5[i64]; i65++) {
                iMax = Math.max(iMax, iArr28[((g) y32VarG.get(iArr11[i64][i65])).a]);
            }
            iArr27[i64] = iMax + 1;
            i63 = i64 + 1;
            zArr5 = zArr11;
            iArr26 = iArr28;
        }
        boolean[][] zArr12 = zArr5;
        if (pVar.h()) {
            int i66 = 0;
            while (i66 < i14) {
                int i67 = i66 + 1;
                int i68 = i67;
                while (i68 < i15) {
                    if (zArr10[i68][i66]) {
                        pVar.t(3);
                    }
                    i68++;
                    i14 = i14;
                }
                i66 = i67;
            }
        }
        pVar.s();
        int iM4 = pVar.m() + 1;
        y21 y21VarX2 = d31.x();
        y21VarX2.a(hVarG);
        if (iM4 > 1) {
            y21VarX2.a(hVarG2);
            for (int i69 = 2; i69 < iM4; i69++) {
                hVarG2 = g(pVar, pVar.h(), i16, hVarG2);
                y21VarX2.a(hVarG2);
            }
        }
        y32 y32VarG2 = y21VarX2.g();
        int iM5 = pVar.m() + iM2;
        if (iM5 > iM2) {
            return new com.moloco.sdk.internal.error.crash.data.network.b((y32) null, iVar2, (i) null, (i) null);
        }
        int i70 = pVar.i(2);
        boolean[][] zArr13 = (boolean[][]) Array.newInstance((Class<?>) cls2, iM5, i20);
        int[] iArr29 = new int[iM5];
        int i71 = 0;
        int[] iArr30 = new int[iM5];
        int i72 = 0;
        while (i72 < iM2) {
            iArr29[i72] = i71;
            iArr30[i72] = iArr12[i72];
            if (i70 == 0) {
                i6 = i72;
                zArr2 = zArr13;
                iArr2 = iArr29;
                iArr3 = iArr27;
                Arrays.fill(zArr13[i6], i71, iArr5[i6], true);
                iArr2[i6] = iArr5[i6];
            } else {
                i6 = i72;
                zArr2 = zArr13;
                iArr2 = iArr29;
                iArr3 = iArr27;
                if (i70 == 1) {
                    int i73 = iArr12[i6];
                    for (int i74 = 0; i74 < iArr5[i6]; i74++) {
                        zArr2[i6][i74] = iArr11[i6][i74] == i73;
                    }
                    iArr2[i6] = 1;
                } else {
                    i71 = 0;
                    zArr2[0][0] = true;
                    iArr2[0] = 1;
                }
                i72 = i6 + 1;
                zArr13 = zArr2;
                iArr29 = iArr2;
                iArr27 = iArr3;
            }
            i71 = 0;
            i72 = i6 + 1;
            zArr13 = zArr2;
            iArr29 = iArr2;
            iArr27 = iArr3;
        }
        boolean[][] zArr14 = zArr13;
        int[] iArr31 = iArr29;
        int[] iArr32 = iArr27;
        int[] iArr33 = new int[i20];
        int i75 = 2;
        int[] iArr34 = new int[2];
        iArr34[1] = i20;
        iArr34[i71] = iM5;
        boolean[][] zArr15 = (boolean[][]) Array.newInstance((Class<?>) cls2, iArr34);
        int i76 = 1;
        int i77 = 0;
        while (i76 < iM5) {
            if (i70 == i75) {
                for (int i78 = 0; i78 < iArr5[i76]; i78++) {
                    zArr14[i76][i78] = pVar.h();
                    int i79 = iArr31[i76];
                    boolean z7 = zArr14[i76][i78];
                    iArr31[i76] = i79 + (z7 ? 1 : 0);
                    if (z7) {
                        iArr30[i76] = iArr11[i76][i78];
                    }
                }
            }
            if (i77 == 0 && iArr11[i76][0] == 0 && zArr14[i76][0]) {
                for (int i80 = 1; i80 < iArr5[i76]; i80++) {
                    if (iArr11[i76][i80] == i50 && zArr14[i76][i50]) {
                        i77 = i76;
                    }
                }
            }
            int i81 = 0;
            while (i81 < iArr5[i76]) {
                if (iM4 > 1) {
                    zArr15[i76][i81] = zArr14[i76][i81];
                    y32Var = y32VarG2;
                    zArr = zArr15;
                    RoundingMode roundingMode = RoundingMode.CEILING;
                    int iD = kd0.d(iM4);
                    if (!zArr[i76][i81]) {
                        int i82 = ((g) y32VarG.get(iArr11[i76][i81])).a;
                        int i83 = 0;
                        while (i83 < i81) {
                            int i84 = i83;
                            if (zArr12[i82][((g) y32VarG.get(iArr11[i76][i84])).a]) {
                                zArr[i76][i81] = true;
                                break;
                            }
                            i83 = i84 + 1;
                        }
                    }
                    if (zArr[i76][i81]) {
                        if (i77 <= 0 || i76 != i77) {
                            pVar.t(iD);
                        } else {
                            iArr33[i81] = pVar.i(iD);
                        }
                    }
                } else {
                    y32Var = y32VarG2;
                    zArr = zArr15;
                }
                i81++;
                y32VarG2 = y32Var;
                zArr15 = zArr;
            }
            y32 y32Var2 = y32VarG2;
            boolean[][] zArr16 = zArr15;
            if (iArr31[i76] == 1 && iArr25[iArr30[i76]] > 0) {
                pVar.s();
            }
            i76++;
            y32VarG2 = y32Var2;
            zArr15 = zArr16;
            i75 = 2;
        }
        y32 y32Var3 = y32VarG2;
        boolean[][] zArr17 = zArr15;
        if (i77 == 0) {
            return new com.moloco.sdk.internal.error.crash.data.network.b((y32) null, iVar2, (i) null, (i) null);
        }
        int iM6 = pVar.m();
        int i85 = iM6 + 1;
        y21 y21VarY = d31.y(i85);
        int[] iArr35 = new int[i15];
        int i86 = 0;
        while (i86 < i85) {
            int i87 = pVar.i(16);
            int i88 = pVar.i(16);
            if (pVar.h()) {
                i3 = pVar.i(2);
                if (i3 == 3) {
                    pVar.s();
                }
                i4 = pVar.i(4);
                i5 = pVar.i(4);
            } else {
                i3 = 0;
                i4 = 0;
                i5 = 0;
            }
            if (pVar.h()) {
                int iM7 = pVar.m();
                int iM8 = pVar.m();
                int iM9 = pVar.m();
                int iM10 = pVar.m();
                i87 = jc1.B(iM7, iM8, (i3 == 1 || i3 == 2) ? 2 : 1, i87);
                i88 = jc1.B(iM9, iM10, i3 == 1 ? 2 : 1, i88);
            }
            y21VarY.a(new j(i3, i4, i5, i87, i88));
            i86++;
            y32Var3 = y32Var3;
            y32VarG = y32VarG;
            iArr33 = iArr33;
        }
        y32 y32Var4 = y32VarG;
        int[] iArr36 = iArr33;
        y32 y32Var5 = y32Var3;
        if (i85 <= 1 || !pVar.h()) {
            for (int i89 = 1; i89 < i15; i89++) {
                iArr35[i89] = Math.min(i89, iM6);
            }
        } else {
            double d2 = i85;
            RoundingMode roundingMode2 = RoundingMode.CEILING;
            int iD2 = kd0.d(d2);
            for (int i90 = 1; i90 < i15; i90++) {
                iArr35[i90] = pVar.i(iD2);
            }
        }
        i iVar3 = new i(y21VarY.g(), iArr35, 1);
        pVar.t(2);
        for (int i91 = 1; i91 < i15; i91++) {
            if (iArr25[iArr24[i91]] == 0) {
                pVar.s();
            }
        }
        for (int i92 = 1; i92 < iM5; i92++) {
            boolean zH12 = pVar.h();
            int i93 = 0;
            while (i93 < iArr32[i92]) {
                if ((i93 <= 0 || !zH12) ? i93 == 0 : pVar.h()) {
                    for (int i94 = 0; i94 < iArr5[i92]; i94++) {
                        if (zArr17[i92][i94]) {
                            pVar.m();
                        }
                    }
                    pVar.m();
                    pVar.m();
                }
                i93++;
            }
        }
        int iM11 = pVar.m() + 2;
        if (pVar.h()) {
            pVar.t(iM11);
        } else {
            for (int i95 = 1; i95 < i15; i95++) {
                for (int i96 = 0; i96 < i95; i96++) {
                    if (zArr10[i95][i96]) {
                        pVar.t(iM11);
                    }
                }
            }
        }
        int iM12 = pVar.m();
        for (int i97 = 1; i97 <= iM12; i97++) {
            pVar.t(8);
        }
        if (pVar.h()) {
            int i98 = pVar.e;
            if (i98 > 0) {
                pVar.t(8 - i98);
            }
            if (!pVar.h() ? pVar.h() : true) {
                pVar.s();
            }
            boolean zH13 = pVar.h();
            boolean zH14 = pVar.h();
            if (zH13 || zH14) {
                for (int i99 = 0; i99 < iM2; i99++) {
                    for (int i100 = 0; i100 < iArr32[i99]; i100++) {
                        boolean zH15 = zH13 ? pVar.h() : false;
                        boolean zH16 = zH14 ? pVar.h() : false;
                        if (zH15) {
                            pVar.t(32);
                        }
                        if (zH16) {
                            pVar.t(18);
                        }
                    }
                }
            }
            boolean zH17 = pVar.h();
            int i101 = zH17 ? pVar.i(4) + 1 : i15;
            y21 y21VarY2 = d31.y(i101);
            int[] iArr37 = new int[i15];
            for (int i102 = 0; i102 < i101; i102++) {
                pVar.t(3);
                int i103 = pVar.h() ? 1 : 2;
                int iF = f.f(pVar.i(8));
                int iG = f.g(pVar.i(8));
                pVar.t(8);
                y21VarY2.a(new l(iF, i103, iG));
            }
            if (zH17 && i101 > 1) {
                for (int i104 = 0; i104 < i15; i104++) {
                    iArr37[i104] = pVar.i(4);
                }
            }
            iVar = new i(y21VarY2.g(), iArr37, 2);
        } else {
            iVar = null;
        }
        return new com.moloco.sdk.internal.error.crash.data.network.b(y32Var4, new i(y32Var5, iArr36, 0), iVar3, iVar);
    }

    public static int n(byte[] bArr, int i) {
        int i2;
        synchronized (c) {
            int i3 = 0;
            int i4 = 0;
            while (i3 < i) {
                while (true) {
                    if (i3 >= i - 2) {
                        i3 = i;
                        break;
                    }
                    try {
                        if (bArr[i3] == 0 && bArr[i3 + 1] == 0 && bArr[i3 + 2] == 3) {
                            break;
                        }
                        i3++;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (i3 < i) {
                    int[] iArr = d;
                    if (iArr.length <= i4) {
                        d = Arrays.copyOf(iArr, iArr.length * 2);
                    }
                    d[i4] = i3;
                    i3 += 3;
                    i4++;
                }
            }
            i2 = i - i4;
            int i5 = 0;
            int i6 = 0;
            for (int i7 = 0; i7 < i4; i7++) {
                int i8 = d[i7] - i6;
                System.arraycopy(bArr, i6, bArr, i5, i8);
                int i9 = i5 + i8;
                int i10 = i9 + 1;
                bArr[i9] = 0;
                i5 = i9 + 2;
                bArr[i10] = 0;
                i6 += i8 + 3;
            }
            System.arraycopy(bArr, i6, bArr, i5, i2 - i5);
        }
        return i2;
    }

    public static l63 f(p pVar) {
        pVar.s();
        return new l63(pVar.i(6), pVar.i(6), pVar.i(3) - 1);
    }

    public static void l(p pVar) {
        int iM = pVar.m() + 1;
        pVar.t(8);
        for (int i = 0; i < iM; i++) {
            pVar.m();
            pVar.m();
            pVar.s();
        }
        pVar.t(20);
    }

    public static ArrayList m(ByteBuffer byteBuffer) {
        int iRemaining;
        ByteBuffer byteBufferAsReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
        ArrayList arrayList = new ArrayList();
        while (byteBufferAsReadOnlyBuffer.hasRemaining()) {
            byte b2 = byteBufferAsReadOnlyBuffer.get();
            int i = (b2 >> 3) & 15;
            if (((b2 >> 2) & 1) != 0) {
                byteBufferAsReadOnlyBuffer.get();
            }
            if (((b2 >> 1) & 1) != 0) {
                iRemaining = 0;
                for (int i2 = 0; i2 < 8; i2++) {
                    byte b3 = byteBufferAsReadOnlyBuffer.get();
                    iRemaining |= (b3 & 127) << (i2 * 7);
                    if ((b3 & 128) == 0) {
                        break;
                    }
                }
            } else {
                iRemaining = byteBufferAsReadOnlyBuffer.remaining();
            }
            ByteBuffer byteBufferDuplicate = byteBufferAsReadOnlyBuffer.duplicate();
            byteBufferDuplicate.limit(byteBufferAsReadOnlyBuffer.position() + iRemaining);
            arrayList.add(new r(i, byteBufferDuplicate));
            byteBufferAsReadOnlyBuffer.position(byteBufferAsReadOnlyBuffer.position() + iRemaining);
        }
        return arrayList;
    }
}
