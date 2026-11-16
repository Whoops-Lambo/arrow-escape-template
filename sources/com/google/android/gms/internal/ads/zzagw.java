package com.google.android.gms.internal.ads;

import com.inmobi.media.core.config.models.AdConfig;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
public final class zzagw {
    /* JADX WARN: Code duplicated, block: B:57:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:59:0x00c6 A[LOOP:0: B:58:0x00c4->B:59:0x00c6, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:62:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:65:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:68:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:70:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:72:0x00f0  */
    public static boolean a(zzey zzeyVar, zzahb zzahbVar, int i, zzagv zzagvVar) {
        int iK;
        byte[] bArr;
        int i2;
        int i3;
        int I;
        int i4;
        long jP = zzeyVar.P();
        long j = jP >>> 16;
        if (j != i) {
            return false;
        }
        boolean z = (j & 1) == 1;
        long j2 = jP >> 12;
        long j3 = jP >> 8;
        long j4 = jP >> 4;
        long j5 = jP >> 1;
        long j6 = jP & 1;
        int i5 = (int) (j4 & 15);
        if (i5 > 7 ? !(i5 > 10 || zzahbVar.g != 2) : i5 == zzahbVar.g - 1) {
            int i6 = (int) (j5 & 7);
            if ((i6 == 0 || i6 == zzahbVar.i) && j6 != 1 && c(zzeyVar, zzahbVar, z, zzagvVar)) {
                long j7 = zzagvVar.a;
                int iB = b((int) (j2 & 15), zzeyVar);
                long j8 = zzahbVar.j;
                boolean z2 = j8 == 0 || j7 + ((long) iB) >= j8;
                if (iB != -1 && ((z2 || iB >= zzahbVar.a) && iB <= zzahbVar.b)) {
                    int i7 = zzahbVar.e;
                    int i8 = (int) (j3 & 15);
                    if (i8 == 0) {
                        iK = zzeyVar.K();
                        int i9 = zzeyVar.b;
                        bArr = zzeyVar.a;
                        i2 = i9 - 1;
                        i3 = 0;
                        for (int i10 = zzeyVar.b; i10 < i2; i10++) {
                            i3 = zzfq.i[i3 ^ (bArr[i10] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED)];
                        }
                        String str = zzfq.a;
                        if (iK == i3) {
                            if (zzeyVar.B() != 0) {
                                I = zzeyVar.I();
                                if ((I & 128) == 0) {
                                    i4 = (I & 126) >> 1;
                                    if (i4 < 2) {
                                        StringBuilder sb = new StringBuilder(String.valueOf(i4).length() + 57);
                                        sb.append("Ignoring frame where first subframe has a reserved type: ");
                                        sb.append(i4);
                                        zzeh.b("FlacFrameReader", sb.toString());
                                    } else {
                                        StringBuilder sb2 = new StringBuilder(String.valueOf(i4).length() + 57);
                                        sb2.append("Ignoring frame where first subframe has a reserved type: ");
                                        sb2.append(i4);
                                        zzeh.b("FlacFrameReader", sb2.toString());
                                    }
                                }
                            }
                            return true;
                        }
                    } else if (i8 <= 11) {
                        if (i8 == zzahbVar.f) {
                            iK = zzeyVar.K();
                            int i11 = zzeyVar.b;
                            bArr = zzeyVar.a;
                            i2 = i11 - 1;
                            i3 = 0;
                            while (i10 < i2) {
                                i3 = zzfq.i[i3 ^ (bArr[i10] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED)];
                            }
                            String str2 = zzfq.a;
                            if (iK == i3) {
                                if (zzeyVar.B() != 0) {
                                    I = zzeyVar.I();
                                    if ((I & 128) == 0) {
                                        i4 = (I & 126) >> 1;
                                        if ((i4 < 2 && i4 <= 7) || (i4 >= 13 && i4 <= 31)) {
                                            StringBuilder sb3 = new StringBuilder(String.valueOf(i4).length() + 57);
                                            sb3.append("Ignoring frame where first subframe has a reserved type: ");
                                            sb3.append(i4);
                                            zzeh.b("FlacFrameReader", sb3.toString());
                                        }
                                    }
                                }
                                return true;
                            }
                        }
                    } else if (i8 == 12) {
                        if (zzeyVar.K() * 1000 == i7) {
                            iK = zzeyVar.K();
                            int i12 = zzeyVar.b;
                            bArr = zzeyVar.a;
                            i2 = i12 - 1;
                            i3 = 0;
                            while (i10 < i2) {
                                i3 = zzfq.i[i3 ^ (bArr[i10] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED)];
                            }
                            String str3 = zzfq.a;
                            if (iK == i3) {
                                if (zzeyVar.B() != 0) {
                                    I = zzeyVar.I();
                                    if ((I & 128) == 0) {
                                        i4 = (I & 126) >> 1;
                                        if (i4 < 2) {
                                            StringBuilder sb4 = new StringBuilder(String.valueOf(i4).length() + 57);
                                            sb4.append("Ignoring frame where first subframe has a reserved type: ");
                                            sb4.append(i4);
                                            zzeh.b("FlacFrameReader", sb4.toString());
                                        } else {
                                            StringBuilder sb5 = new StringBuilder(String.valueOf(i4).length() + 57);
                                            sb5.append("Ignoring frame where first subframe has a reserved type: ");
                                            sb5.append(i4);
                                            zzeh.b("FlacFrameReader", sb5.toString());
                                        }
                                    }
                                }
                                return true;
                            }
                        }
                    } else if (i8 <= 14) {
                        int iL = zzeyVar.L();
                        if (i8 == 14) {
                            iL *= 10;
                        }
                        if (iL == i7) {
                            iK = zzeyVar.K();
                            int i13 = zzeyVar.b;
                            bArr = zzeyVar.a;
                            i2 = i13 - 1;
                            i3 = 0;
                            while (i10 < i2) {
                                i3 = zzfq.i[i3 ^ (bArr[i10] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED)];
                            }
                            String str4 = zzfq.a;
                            if (iK == i3) {
                                if (zzeyVar.B() != 0) {
                                    I = zzeyVar.I();
                                    if ((I & 128) == 0) {
                                        i4 = (I & 126) >> 1;
                                        if (i4 < 2) {
                                            StringBuilder sb6 = new StringBuilder(String.valueOf(i4).length() + 57);
                                            sb6.append("Ignoring frame where first subframe has a reserved type: ");
                                            sb6.append(i4);
                                            zzeh.b("FlacFrameReader", sb6.toString());
                                        } else {
                                            StringBuilder sb7 = new StringBuilder(String.valueOf(i4).length() + 57);
                                            sb7.append("Ignoring frame where first subframe has a reserved type: ");
                                            sb7.append(i4);
                                            zzeh.b("FlacFrameReader", sb7.toString());
                                        }
                                    }
                                }
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public static int b(int i, zzey zzeyVar) {
        switch (i) {
            case 1:
                return 192;
            case 2:
            case 3:
            case 4:
            case 5:
                return 576 << (i - 2);
            case 6:
                return zzeyVar.K() + 1;
            case 7:
                return zzeyVar.L() + 1;
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                return 256 << (i - 8);
            default:
                return -1;
        }
    }

    public static boolean c(zzey zzeyVar, zzahb zzahbVar, boolean z, zzagv zzagvVar) {
        try {
            long jO = zzeyVar.o();
            if (!z) {
                jO *= (long) zzahbVar.b;
            }
            long j = zzahbVar.j;
            if (j == 0 || jO <= j) {
                zzagvVar.a = jO;
                return true;
            }
            return false;
        } catch (NumberFormatException unused) {
            return false;
        }
    }
}
