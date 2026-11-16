package com.google.android.gms.internal.ads;

import com.singular.sdk.internal.UserDetailsUtils;
import java.util.List;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzaid {
    public final List a;
    public final int b;
    public final String c;
    public final int d;

    public static zzaid a(zzey zzeyVar) throws zzat {
        int iK;
        int iK2;
        int i;
        int i2;
        int i3;
        try {
            if (zzeyVar.b() != 0) {
                throw zzat.b("Unsupported VVC version", null);
            }
            int iK3 = zzeyVar.K();
            int i4 = iK3 >> 1;
            int i5 = 1;
            String str = "L";
            if ((iK3 & 1) != 0) {
                zzeyVar.G(1);
                int iK4 = zzeyVar.K() >> 4;
                iK = zzeyVar.K() >> 5;
                int iK5 = zzeyVar.K() & 63;
                int iK6 = zzeyVar.K();
                i = iK6 >> 1;
                str = (iK6 & 1) != 0 ? "H" : "L";
                iK2 = zzeyVar.K();
                zzeyVar.G(iK5);
                int i6 = iK4 & 7;
                if (i6 > 1) {
                    int iK7 = zzeyVar.K();
                    for (int i7 = 0; i7 < i6 - 1; i7++) {
                        if (((iK7 >> (7 - i7)) & 1) != 0) {
                            zzeyVar.G(1);
                        }
                    }
                }
                zzeyVar.G(zzeyVar.K() * 4);
                zzeyVar.G(6);
            } else {
                iK = 0;
                iK2 = 0;
                i = 0;
            }
            int iK8 = zzeyVar.K();
            int i8 = zzeyVar.b;
            int i9 = 0;
            int i10 = 0;
            while (true) {
                i2 = 12;
                i3 = 13;
                if (i9 >= iK8) {
                    break;
                }
                int iK9 = zzeyVar.K() & 31;
                int iL = (iK9 == 13 || iK9 == 12) ? 1 : zzeyVar.L();
                for (int i11 = 0; i11 < iL; i11++) {
                    int iL2 = zzeyVar.L();
                    i10 = iL2 + 4 + i10;
                    zzeyVar.G(iL2);
                }
                i9++;
            }
            zzeyVar.E(i8);
            byte[] bArr = new byte[i10];
            int i12 = 0;
            int i13 = 0;
            while (i12 < iK8) {
                int iK10 = zzeyVar.K() & 31;
                int iL3 = (iK10 == i3 || iK10 == i2) ? i5 : zzeyVar.L();
                int i14 = i5;
                for (int i15 = 0; i15 < iL3; i15++) {
                    int iL4 = zzeyVar.L();
                    System.arraycopy(zzgv.a, 0, bArr, i13, 4);
                    int i16 = i13 + 4;
                    zzeyVar.H(i16, iL4, bArr);
                    i13 = i16 + iL4;
                }
                i12++;
                i5 = i14;
                i2 = 12;
                i3 = 13;
            }
            Locale locale = Locale.US;
            return new zzaid(zzgzb.x(bArr), (i4 & 3) + 1, "vvc1." + i + UserDetailsUtils.UserDetailsLiterals.DOT + str + iK2, iK + 8);
        } catch (ArrayIndexOutOfBoundsException e) {
            throw zzat.b("Error parsing VVC configuration", e);
        }
    }

    public zzaid(w wVar, int i, String str, int i2) {
        this.a = wVar;
        this.b = i;
        this.c = str;
        this.d = i2;
    }
}
