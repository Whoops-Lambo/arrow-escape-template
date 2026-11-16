package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzahi {
    public final List a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final int j;
    public final int k;
    public final float l;
    public final int m;
    public final String n;
    public final zzgs o;

    /* JADX WARN: Code duplicated, block: B:119:0x0275  */
    /* JADX WARN: Code duplicated, block: B:120:0x0278  */
    public static zzahi a(zzey zzeyVar, boolean z, zzgs zzgsVar) throws zzat {
        boolean z2;
        boolean z3;
        String str;
        int i;
        char c;
        zzgo zzgoVar;
        int i2;
        int i3;
        int i4 = 4;
        boolean z4 = true;
        if (z) {
            try {
                zzeyVar.G(4);
            } catch (ArrayIndexOutOfBoundsException e) {
                e = e;
                z3 = true;
                if (z3 != z) {
                    str = "HEVC config";
                } else {
                    str = "L-HEVC config";
                }
                throw zzat.b("Error parsing".concat(str), e);
            }
        } else {
            try {
                zzeyVar.G(21);
            } catch (ArrayIndexOutOfBoundsException e2) {
                e = e2;
                z2 = z4;
                z3 = z2;
                if (z3 != z) {
                    str = "HEVC config";
                } else {
                    str = "L-HEVC config";
                }
                throw zzat.b("Error parsing".concat(str), e);
            }
        }
        int iK = zzeyVar.K() & 3;
        int iK2 = zzeyVar.K();
        int i5 = zzeyVar.b;
        int i6 = 0;
        int i7 = 0;
        for (int i8 = 0; i8 < iK2; i8++) {
            zzeyVar.G(1);
            int iL = zzeyVar.L();
            for (int i9 = 0; i9 < iL; i9++) {
                int iL2 = zzeyVar.L();
                i7 += iL2 + 4;
                zzeyVar.G(iL2);
            }
        }
        zzeyVar.E(i5);
        byte[] bArr = new byte[i7];
        zzgs zzgsVar2 = zzgsVar;
        int i10 = 0;
        float f = 1.0f;
        int i11 = -1;
        int i12 = -1;
        int i13 = -1;
        int i14 = -1;
        int i15 = -1;
        int i16 = -1;
        int i17 = -1;
        int i18 = -1;
        int i19 = -1;
        int i20 = -1;
        String strA = null;
        int i21 = 0;
        while (i21 < iK2) {
            int iK3 = zzeyVar.K() & 63;
            int iL3 = zzeyVar.L();
            z2 = z4;
            int i22 = i6;
            zzgs zzgsVarE = zzgsVar2;
            while (i22 < iL3) {
                try {
                    int iL4 = zzeyVar.L();
                    int i23 = i22;
                    System.arraycopy(zzgv.a, i6, bArr, i10, i4);
                    int i24 = i10 + 4;
                    System.arraycopy(zzeyVar.a, zzeyVar.b, bArr, i24, iL4);
                    int i25 = 32;
                    if (iK3 == 32) {
                        if (i23 == 0) {
                            zzgsVarE = zzgv.e(i24, i24 + iL4, bArr);
                            i = iK;
                            i3 = 0;
                            i2 = 0;
                        }
                        c = '?';
                        i10 = i24 + iL4;
                        zzeyVar.G(iL4);
                        i22 = i3 + 1;
                        i4 = 4;
                        i6 = i2;
                        iK = i;
                    } else {
                        i25 = iK3;
                    }
                    i = iK;
                    if (i25 != 33) {
                        i24 = i24;
                        int i26 = 8;
                        if (i25 == 39 && i23 == 0) {
                            int i27 = i10 + 6;
                            int i28 = (i24 + iL4) - 1;
                            while (true) {
                                byte b = bArr[i28];
                                if (b != 0) {
                                    if (b == 0) {
                                        c = '?';
                                        zzgoVar = null;
                                        break;
                                    }
                                    if (i28 > i27) {
                                        zzhd zzhdVar = new zzhd(bArr, i27, i28 + 1);
                                        while (true) {
                                            if (zzhdVar.c(16)) {
                                                int i29 = i26;
                                                int iE = zzhdVar.e(i29);
                                                int i30 = 0;
                                                while (iE == 255) {
                                                    i30 += 255;
                                                    iE = zzhdVar.e(i29);
                                                }
                                                int i31 = i30 + iE;
                                                int iE2 = zzhdVar.e(i29);
                                                int i32 = 0;
                                                while (iE2 == 255) {
                                                    i32 += 255;
                                                    iE2 = zzhdVar.e(8);
                                                }
                                                i26 = 8;
                                                int i33 = i32 + iE2;
                                                if (i33 != 0) {
                                                    if (zzhdVar.c(i33)) {
                                                        if (i31 == 176) {
                                                            int iG = zzhdVar.g();
                                                            boolean zD = zzhdVar.d();
                                                            int iG2 = zD ? zzhdVar.g() : 0;
                                                            int iG3 = zzhdVar.g();
                                                            int i34 = -1;
                                                            int i35 = 0;
                                                            while (true) {
                                                                if (i35 > iG3) {
                                                                    c = '?';
                                                                    zzgoVar = new zzgo(i34);
                                                                    break;
                                                                }
                                                                int iG4 = zzhdVar.g();
                                                                zzhdVar.g();
                                                                int i36 = i35;
                                                                int iE3 = zzhdVar.e(6);
                                                                if (iE3 == 63) {
                                                                    c = '?';
                                                                } else {
                                                                    zzhdVar.e(iE3 == 0 ? Math.max(0, iG - 30) : Math.max(0, (iE3 + iG) - 31));
                                                                    if (zD) {
                                                                        int iE4 = zzhdVar.e(6);
                                                                        if (iE4 == 63) {
                                                                            c = '?';
                                                                        } else {
                                                                            zzhdVar.e(iE4 == 0 ? Math.max(0, iG2 - 30) : Math.max(0, (iE4 + iG2) - 31));
                                                                        }
                                                                    }
                                                                    if (zzhdVar.d()) {
                                                                        zzhdVar.b(10);
                                                                    }
                                                                    i35 = i36 + 1;
                                                                    i34 = iG4;
                                                                }
                                                                zzgoVar = null;
                                                                break;
                                                            }
                                                        }
                                                        zzhdVar.b(i33 * 8);
                                                    }
                                                }
                                            }
                                            c = '?';
                                            zzgoVar = null;
                                            break;
                                        }
                                    }
                                } else if (i28 > i27) {
                                    i28--;
                                }
                                zzgoVar = null;
                                c = '?';
                                break;
                            }
                            if (zzgoVar == null || zzgsVarE == null) {
                                i2 = 0;
                            } else {
                                i2 = 0;
                                if (zzgoVar.a == ((zzgi) zzgsVarE.a.get(0)).b) {
                                    i3 = i23;
                                    i19 = 4;
                                } else {
                                    i19 = 5;
                                }
                                i10 = i24 + iL4;
                                zzeyVar.G(iL4);
                                i22 = i3 + 1;
                                i4 = 4;
                                i6 = i2;
                                iK = i;
                            }
                        }
                        i3 = i23;
                        i10 = i24 + iL4;
                        zzeyVar.G(iL4);
                        i22 = i3 + 1;
                        i4 = 4;
                        i6 = i2;
                        iK = i;
                    } else if (i23 == 0) {
                        zzgp zzgpVarF = zzgv.f(bArr, i24, i24 + iL4, zzgsVarE);
                        int i37 = zzgpVarF.a + 1;
                        int i38 = zzgpVarF.g;
                        int i39 = zzgpVarF.h;
                        int i40 = zzgpVarF.c + 8;
                        int i41 = zzgpVarF.d + 8;
                        int i42 = zzgpVarF.k;
                        int i43 = zzgpVarF.l;
                        int i44 = zzgpVarF.m;
                        float f2 = zzgpVarF.i;
                        int i45 = zzgpVarF.j;
                        zzgk zzgkVar = zzgpVarF.b;
                        if (zzgkVar != null) {
                            strA = zzdr.a(zzgkVar.a, zzgkVar.b, zzgkVar.c, zzgkVar.d, zzgkVar.e, zzgkVar.f);
                        }
                        i18 = i44;
                        f = f2;
                        i20 = i45;
                        i3 = i23;
                        i15 = i41;
                        i16 = i42;
                        i17 = i43;
                        i14 = i40;
                        i12 = i38;
                        i13 = i39;
                        i2 = 0;
                        i11 = i37;
                        c = '?';
                        i10 = i24 + iL4;
                        zzeyVar.G(iL4);
                        i22 = i3 + 1;
                        i4 = 4;
                        i6 = i2;
                        iK = i;
                    } else {
                        i24 = i24;
                    }
                    i2 = 0;
                    c = '?';
                    i3 = i23;
                    i10 = i24 + iL4;
                    zzeyVar.G(iL4);
                    i22 = i3 + 1;
                    i4 = 4;
                    i6 = i2;
                    iK = i;
                } catch (ArrayIndexOutOfBoundsException e3) {
                    e = e3;
                    z3 = z2;
                    if (z3 != z) {
                        str = "HEVC config";
                    } else {
                        str = "L-HEVC config";
                    }
                    throw zzat.b("Error parsing".concat(str), e);
                }
            }
            i21++;
            zzgsVar2 = zzgsVarE;
            z4 = z2;
            iK = iK;
            i4 = 4;
        }
        z2 = z4;
        return new zzahi(i7 == 0 ? Collections.EMPTY_LIST : Collections.singletonList(bArr), iK + 1, i11, i12, i13, i14, i15, i16, i17, i18, i19, f, i20, strA, zzgsVar2);
    }

    public zzahi(List list, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, float f, int i11, String str, zzgs zzgsVar) {
        this.a = list;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
        this.f = i5;
        this.g = i6;
        this.h = i7;
        this.i = i8;
        this.j = i9;
        this.k = i10;
        this.l = f;
        this.m = i11;
        this.n = str;
        this.o = zzgsVar;
    }
}
