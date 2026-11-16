package com.facebook.ads.redexgen.X;

import android.util.SparseArray;
import android.util.SparseIntArray;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Ng, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes.dex */
public class C2203Ng implements InterfaceC2690cu {
    public static String[] A05 = {"WrPJ0pg2mPJfrspahLmz5pjFVZ3GhqoW", "XFEX4XZYlFg40morts9AHvey8KOZtdLm", "6cuKepiJY3YuoKcwF9RqxVJry7zuXWia", "FhTxBa1JVVSZU0W7vi0M8MQjQwVICFNT", "5t1v8XDPU0UxAmsbKSZNGz4o0pupsy3y", "sc1mKX", "4t0AqRJOupFITXPu5dRmgnMWkOT1YaYH", "0ivFdIyTIrvJN3IRKWLvTn9YwUe91U3g"};
    public final int A00;
    public final /* synthetic */ C2202Nf A04;
    public final C2180Mj A03 = new C2180Mj(new byte[5]);
    public final SparseArray<InterfaceC2699d3> A01 = new SparseArray<>();
    public final SparseIntArray A02 = new SparseIntArray();

    public C2203Ng(C2202Nf c2202Nf, int i) {
        this.A04 = c2202Nf;
        this.A00 = i;
    }

    private C2695cz A00(C2181Mk c2181Mk, int i) {
        int iA09 = c2181Mk.A09();
        int descriptorTag = iA09 + i;
        int i2 = -1;
        String strTrim = null;
        ArrayList arrayList = null;
        while (true) {
            int iA010 = c2181Mk.A09();
            String[] strArr = A05;
            if (strArr[1].charAt(14) == strArr[6].charAt(14)) {
                throw new RuntimeException();
            }
            A05[3] = "FRrIYo9gZZwdZZnKdS5xpGv7sNAFUJd3";
            if (iA010 < descriptorTag) {
                int descriptorsStartPosition = c2181Mk.A0I();
                int descriptorLength = c2181Mk.A09() + c2181Mk.A0I();
                if (descriptorLength <= descriptorTag) {
                    if (descriptorsStartPosition == 5) {
                        long jA0Q = c2181Mk.A0Q();
                        if (jA0Q == 1094921523) {
                            i2 = 129;
                        } else if (jA0Q == 1161904947) {
                            i2 = 135;
                        } else if (jA0Q == 1094921524) {
                            i2 = 172;
                        } else if (jA0Q == 1212503619) {
                            i2 = 36;
                        }
                    } else if (descriptorsStartPosition == 106) {
                        i2 = 129;
                    } else if (descriptorsStartPosition == 122) {
                        i2 = 135;
                    } else if (descriptorsStartPosition == 127) {
                        if (c2181Mk.A0I() == 21) {
                            i2 = 172;
                        }
                    } else if (descriptorsStartPosition == 123) {
                        i2 = 138;
                    } else if (descriptorsStartPosition == 10) {
                        String strA0W = c2181Mk.A0W(3);
                        if (A05[7].charAt(23) != 85) {
                            String[] strArr2 = A05;
                            strArr2[1] = "86rcz2fFTzPsI86Gjcev7r1TLV4z3OrO";
                            strArr2[6] = "Q16PsPIOBdkA1kpc6X8ekK9PiWV3jtDj";
                            strTrim = strA0W.trim();
                        } else {
                            A05[3] = "FoFLSaMdUolFLraf7Ybm8uTRjuWnz4Vo";
                            strTrim = strA0W.trim();
                        }
                    } else if (descriptorsStartPosition == 89) {
                        i2 = 89;
                        arrayList = new ArrayList();
                        while (c2181Mk.A09() < descriptorLength) {
                            String dvbLanguage = c2181Mk.A0W(3).trim();
                            int iA0I = c2181Mk.A0I();
                            byte[] bArr = new byte[4];
                            c2181Mk.A0k(bArr, 0, 4);
                            arrayList.add(new C2694cy(dvbLanguage, iA0I, bArr));
                        }
                    } else if (descriptorsStartPosition == 111) {
                        i2 = 257;
                    }
                    c2181Mk.A0g(descriptorLength - c2181Mk.A09());
                }
            }
            c2181Mk.A0f(descriptorTag);
            return new C2695cz(i2, strTrim, arrayList, Arrays.copyOfRange(c2181Mk.A0l(), iA09, descriptorTag));
        }
    }

    /* JADX WARN: Code duplicated, block: B:15:0x003e  */
    /* JADX WARN: Code duplicated, block: B:33:0x0149 A[DONT_INVERT, PHI: r1 r2 r8 r9
  0x0149: PHI (r1v30 com.facebook.ads.redexgen.X.cz) = (r1v25 com.facebook.ads.redexgen.X.cz), (r1v34 com.facebook.ads.redexgen.X.cz) binds: [B:53:0x01d1, B:32:0x0147] A[DONT_GENERATE, DONT_INLINE]
  0x0149: PHI (r2v15 'tableId' int) = (r2v7 'tableId' int), (r2v16 'tableId' int) binds: [B:53:0x01d1, B:32:0x0147] A[DONT_GENERATE, DONT_INLINE]
  0x0149: PHI (r8v9 'programNumber' int) = (r8v6 'programNumber' int), (r8v11 'programNumber' int) binds: [B:53:0x01d1, B:32:0x0147] A[DONT_GENERATE, DONT_INLINE]
  0x0149: PHI (r9v7 'esInfoLength' int) = (r9v3 'esInfoLength' int), (r9v8 'esInfoLength' int) binds: [B:53:0x01d1, B:32:0x0147] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:37:0x0159  */
    /* JADX WARN: Code duplicated, block: B:41:0x016d  */
    /* JADX WARN: Code duplicated, block: B:43:0x0176 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:47:0x0187  */
    /* JADX WARN: Code duplicated, block: B:49:0x0191  */
    /* JADX WARN: Code duplicated, block: B:50:0x019c  */
    /* JADX WARN: Code duplicated, block: B:51:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:79:0x0166 A[SYNTHETIC] */
    @Override // com.facebook.ads.redexgen.X.InterfaceC2690cu
    public final void A5j(C2181Mk c2181Mk) {
        C2189Ms c2189Ms;
        int programNumber;
        int esInfoLength;
        int tableId;
        C2695cz c2695czA00;
        int tableId2;
        int tableId3;
        InterfaceC2699d3 interfaceC2699d3A64;
        if (c2181Mk.A0I() == 2) {
            int i = this.A04.A09;
            if (A05[3].charAt(0) == 'F') {
                A05[4] = "5ZtlFdMXD0W0AKqJcYLBU1vIsgZ10Iwd";
                if (i != 1) {
                    int tableId4 = this.A04.A09;
                    if (tableId4 != 2) {
                        int tableId5 = this.A04.A02;
                        if (tableId5 == 1) {
                            c2189Ms = (C2189Ms) this.A04.A0I.get(0);
                        } else {
                            c2189Ms = new C2189Ms(((C2189Ms) this.A04.A0I.get(0)).A02());
                            this.A04.A0I.add(c2189Ms);
                        }
                    } else {
                        c2189Ms = (C2189Ms) this.A04.A0I.get(0);
                    }
                } else {
                    c2189Ms = (C2189Ms) this.A04.A0I.get(0);
                }
                if ((c2181Mk.A0I() & 128) == 0) {
                    return;
                }
                c2181Mk.A0g(1);
                int i2 = c2181Mk.A0M();
                int programInfoLength = 3;
                c2181Mk.A0g(3);
                c2181Mk.A0h(this.A03, 2);
                this.A03.A09(3);
                int esInfoLength2 = 13;
                this.A04.A01 = this.A03.A04(13);
                c2181Mk.A0h(this.A03, 2);
                int tableId6 = 4;
                this.A03.A09(4);
                c2181Mk.A0g(this.A03.A04(12));
                int i3 = 21;
                if (this.A04.A09 == 2 && this.A04.A05 == null) {
                    C2695cz c2695cz = new C2695cz(21, null, null, N1.A07);
                    this.A04.A05 = this.A04.A0H.A64(21, c2695cz);
                    if (this.A04.A05 != null) {
                        this.A04.A05.AAo(c2189Ms, this.A04.A03, new C2698d2(i2, 21, 8192));
                    }
                }
                this.A01.clear();
                this.A02.clear();
                int iA07 = c2181Mk.A07();
                while (iA07 > 0) {
                    C2180Mj c2180Mj = this.A03;
                    String[] strArr = A05;
                    if (strArr[1].charAt(14) != strArr[6].charAt(14)) {
                        A05[5] = "dmuM78";
                        c2181Mk.A0h(c2180Mj, 5);
                        programNumber = this.A03.A04(8);
                        this.A03.A09(programInfoLength);
                        esInfoLength = this.A03.A04(esInfoLength2);
                        this.A03.A09(tableId6);
                        tableId = this.A03.A04(12);
                        c2695czA00 = A00(c2181Mk, tableId);
                        if (programNumber != 6) {
                            if (programNumber == 5) {
                            }
                        }
                        iA07 -= tableId + 5;
                        tableId2 = this.A04.A09;
                        if (tableId2 == 2) {
                            tableId3 = programNumber;
                        } else {
                            tableId3 = esInfoLength;
                        }
                        if (!this.A04.A0C.get(tableId3)) {
                            if (this.A04.A09 == 2 || programNumber != i3) {
                                interfaceC2699d3A64 = this.A04.A0H.A64(programNumber, c2695czA00);
                            } else {
                                interfaceC2699d3A64 = this.A04.A05;
                            }
                            if (this.A04.A09 == 2 || esInfoLength < this.A02.get(tableId3, 8192)) {
                                this.A02.put(tableId3, esInfoLength);
                                this.A01.put(tableId3, interfaceC2699d3A64);
                            }
                        }
                        i3 = 21;
                        programInfoLength = 3;
                        tableId6 = 4;
                        esInfoLength2 = 13;
                    } else {
                        c2181Mk.A0h(c2180Mj, 5);
                        programNumber = this.A03.A04(8);
                        this.A03.A09(programInfoLength);
                        esInfoLength = this.A03.A04(esInfoLength2);
                        this.A03.A09(tableId6);
                        tableId = this.A03.A04(12);
                        c2695czA00 = A00(c2181Mk, tableId);
                        if (programNumber != 6) {
                            if (programNumber == 5) {
                            }
                        }
                        iA07 -= tableId + 5;
                        tableId2 = this.A04.A09;
                        if (tableId2 == 2) {
                            tableId3 = programNumber;
                        } else {
                            tableId3 = esInfoLength;
                        }
                        if (!this.A04.A0C.get(tableId3)) {
                            if (this.A04.A09 == 2) {
                                interfaceC2699d3A64 = this.A04.A0H.A64(programNumber, c2695czA00);
                            } else {
                                interfaceC2699d3A64 = this.A04.A0H.A64(programNumber, c2695czA00);
                            }
                            if (this.A04.A09 == 2) {
                                this.A02.put(tableId3, esInfoLength);
                                this.A01.put(tableId3, interfaceC2699d3A64);
                            } else {
                                this.A02.put(tableId3, esInfoLength);
                                this.A01.put(tableId3, interfaceC2699d3A64);
                            }
                        }
                        i3 = 21;
                        programInfoLength = 3;
                        tableId6 = 4;
                        esInfoLength2 = 13;
                    }
                    programNumber = c2695czA00.A00;
                    iA07 -= tableId + 5;
                    tableId2 = this.A04.A09;
                    if (tableId2 == 2) {
                        tableId3 = programNumber;
                    } else {
                        tableId3 = esInfoLength;
                    }
                    if (!this.A04.A0C.get(tableId3)) {
                        if (this.A04.A09 == 2) {
                            interfaceC2699d3A64 = this.A04.A0H.A64(programNumber, c2695czA00);
                        } else {
                            interfaceC2699d3A64 = this.A04.A0H.A64(programNumber, c2695czA00);
                        }
                        if (this.A04.A09 == 2) {
                            this.A02.put(tableId3, esInfoLength);
                            this.A01.put(tableId3, interfaceC2699d3A64);
                        } else {
                            this.A02.put(tableId3, esInfoLength);
                            this.A01.put(tableId3, interfaceC2699d3A64);
                        }
                    }
                    i3 = 21;
                    programInfoLength = 3;
                    tableId6 = 4;
                    esInfoLength2 = 13;
                }
                int esInfoLength3 = this.A02.size();
                for (int programNumber2 = 0; programNumber2 < esInfoLength3; programNumber2++) {
                    int programInfoLength2 = this.A02.keyAt(programNumber2);
                    int trackIdCount = this.A02.valueAt(programNumber2);
                    this.A04.A0C.put(programInfoLength2, true);
                    this.A04.A0D.put(trackIdCount, true);
                    InterfaceC2699d3 interfaceC2699d3ValueAt = this.A01.valueAt(programNumber2);
                    if (interfaceC2699d3ValueAt != null) {
                        if (interfaceC2699d3ValueAt != this.A04.A05) {
                            interfaceC2699d3ValueAt.AAo(c2189Ms, this.A04.A03, new C2698d2(i2, programInfoLength2, 8192));
                        }
                        this.A04.A0B.put(trackIdCount, interfaceC2699d3ValueAt);
                    }
                }
                if (this.A04.A09 == 2) {
                    if (!this.A04.A08) {
                        this.A04.A03.A6x();
                        this.A04.A02 = 0;
                        this.A04.A08 = true;
                        return;
                    }
                    return;
                }
                int i4 = 0;
                this.A04.A0B.remove(this.A00);
                C2202Nf c2202Nf = this.A04;
                if (this.A04.A09 != 1) {
                    int i5 = this.A04.A02;
                    if (A05[7].charAt(23) != 'U') {
                        String[] strArr2 = A05;
                        strArr2[2] = "cOQDQpzMhrcl1CtsXtFiSTP6gwzqV3qW";
                        strArr2[0] = "yb3hnpA3u1t26YJLwEutzpd0DtxVnfej";
                        i4 = i5 - 1;
                    }
                }
                c2202Nf.A02 = i4;
                if (this.A04.A02 == 0) {
                    this.A04.A03.A6x();
                    this.A04.A08 = true;
                    return;
                }
                return;
            }
            throw new RuntimeException();
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC2690cu
    public final void AAo(C2189Ms c2189Ms, InterfaceC2481Yw interfaceC2481Yw, C2698d2 c2698d2) {
    }
}
