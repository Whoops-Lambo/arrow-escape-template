package com.facebook.ads.redexgen.X;

import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.jM, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes.dex */
public final class C3083jM {
    public static byte[] A02;
    public static String[] A03 = {"WXpxlTya5H7kpLIT7UUfzIgXOYds4Vfk", "JVDNa5tAOP", "C1CZfaM4quGDjTOWU4x6KBGTC5pPu33J", "VymAVHyd", "K8p7KG0zsDoAf7GmBTiUCUpdPzk9iS4o", "MydLOSuorekD0WEADrXIrTB2aFx1Ufvf", "1zIVUT6Fxq52O6VZbnoN9TsXnO1jN3fj", "z9Q03TMU5lxkReREt3I6AE4mCa6N3G46"};
    public final JR<AbstractC3075jE, C3081jK> A00 = new JR<>();
    public final C2941h0<AbstractC3075jE> A01 = new C2941h0<>();

    public static String A01(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 71);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A02 = new byte[]{-99, -59, -61, -60, 112, -64, -62, -65, -58, -71, -76, -75, 112, -74, -68, -79, -73, 112, -96, -94, -107, 112, -65, -62, 112, -96, -97, -93, -92};
    }

    static {
        A02();
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0041, code lost:
    
        if (r5 != 0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0043, code lost:
    
        r1 = r3.A00;
        r0 = ~r9;
        r3.A00 = r1 & r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x004a, code lost:
    
        if (r9 != 4) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x004c, code lost:
    
        r5 = r3.A02;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x004e, code lost:
    
        r6 = r3.A00;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x005d, code lost:
    
        if (com.facebook.ads.redexgen.X.C3083jM.A03[5].charAt(20) == 'R') goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x005f, code lost:
    
        r2 = com.facebook.ads.redexgen.X.C3083jM.A03;
        r2[0] = "LDlhycQGZBtlD6IMRSONBH11SqKxQWfy";
        r2[6] = "DCgYh9gvbnrpKHe96mnmPCff01xTtOfJ";
        r0 = r6 & 12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x006d, code lost:
    
        if (r0 != 0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x006f, code lost:
    
        r7.A00.A0B(r4);
        com.facebook.ads.redexgen.X.C3081jK.A02(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0077, code lost:
    
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0078, code lost:
    
        r2 = com.facebook.ads.redexgen.X.C3083jM.A03;
        r2[7] = "9mfdPnfY5V3FVy8Q2gQ6uDsmmOIXndsz";
        r2[2] = "ekMjHGebRREBiMI4gT56rHDvbCCByAvd";
        r0 = r6 & 12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0086, code lost:
    
        if (r0 != 0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0089, code lost:
    
        r2 = com.facebook.ads.redexgen.X.C3083jM.A03;
        r1 = r2[7];
        r2 = r2[2];
        r1 = r1.charAt(19);
        r0 = r2.charAt(19);
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x009d, code lost:
    
        if (r1 == r0) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00a4, code lost:
    
        throw new java.lang.RuntimeException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00a5, code lost:
    
        r2 = com.facebook.ads.redexgen.X.C3083jM.A03;
        r2[1] = "AZoo0ocwP6";
        r2[3] = "Mxzo3dXJ";
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00b1, code lost:
    
        if (r9 != 8) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00b3, code lost:
    
        r5 = r3.A01;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00c2, code lost:
    
        if (r5 != 0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00d4, code lost:
    
        throw new java.lang.IllegalArgumentException(A01(0, 29, 9));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private com.facebook.ads.redexgen.X.C3052ir A00(com.facebook.ads.redexgen.X.AbstractC3075jE r8, int r9) {
        /*
            Method dump skipped, instruction units count: 220
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C3083jM.A00(com.facebook.ads.redexgen.X.jE, int):com.facebook.ads.redexgen.X.ir");
    }

    public final C3052ir A03(AbstractC3075jE abstractC3075jE) {
        return A00(abstractC3075jE, 8);
    }

    public final C3052ir A04(AbstractC3075jE abstractC3075jE) {
        return A00(abstractC3075jE, 4);
    }

    public final AbstractC3075jE A05(long j) {
        return this.A01.A08(j);
    }

    public final void A06() {
        this.A00.clear();
        this.A01.A09();
    }

    public final void A07() {
        C3081jK.A01();
    }

    public final void A08(long j, AbstractC3075jE abstractC3075jE) {
        this.A01.A0B(j, abstractC3075jE);
    }

    public final void A09(AbstractC3075jE abstractC3075jE) {
        C3081jK c3081jKA00 = this.A00.get(abstractC3075jE);
        if (c3081jKA00 == null) {
            c3081jKA00 = C3081jK.A00();
            this.A00.put(abstractC3075jE, c3081jKA00);
        }
        c3081jKA00.A00 |= 1;
    }

    public final void A0A(AbstractC3075jE abstractC3075jE) {
        C3081jK c3081jK = this.A00.get(abstractC3075jE);
        if (c3081jK == null) {
            return;
        }
        c3081jK.A00 &= -2;
    }

    public final void A0B(AbstractC3075jE abstractC3075jE) {
        for (int iA06 = this.A01.A06() - 1; iA06 >= 0; iA06--) {
            if (abstractC3075jE == this.A01.A07(iA06)) {
                this.A01.A0A(iA06);
                break;
            }
        }
        C3081jK info = this.A00.remove(abstractC3075jE);
        if (info != null) {
            C3081jK.A02(info);
        }
    }

    public final void A0C(AbstractC3075jE abstractC3075jE) {
        A0A(abstractC3075jE);
    }

    public final void A0D(AbstractC3075jE abstractC3075jE, C3052ir c3052ir) {
        C3081jK c3081jKA00 = this.A00.get(abstractC3075jE);
        if (c3081jKA00 == null) {
            c3081jKA00 = C3081jK.A00();
            this.A00.put(abstractC3075jE, c3081jKA00);
        }
        c3081jKA00.A00 |= 2;
        c3081jKA00.A02 = c3052ir;
    }

    public final void A0E(AbstractC3075jE abstractC3075jE, C3052ir c3052ir) {
        C3081jK c3081jKA00 = this.A00.get(abstractC3075jE);
        if (c3081jKA00 == null) {
            c3081jKA00 = C3081jK.A00();
            this.A00.put(abstractC3075jE, c3081jKA00);
        }
        c3081jKA00.A01 = c3052ir;
        c3081jKA00.A00 |= 8;
    }

    public final void A0F(AbstractC3075jE abstractC3075jE, C3052ir c3052ir) {
        C3081jK c3081jKA00 = this.A00.get(abstractC3075jE);
        if (c3081jKA00 == null) {
            c3081jKA00 = C3081jK.A00();
            this.A00.put(abstractC3075jE, c3081jKA00);
        }
        c3081jKA00.A02 = c3052ir;
        c3081jKA00.A00 |= 4;
    }

    public final void A0G(InterfaceC3082jL interfaceC3082jL) {
        for (int size = this.A00.size() - 1; size >= 0; size--) {
            AbstractC3075jE abstractC3075jEA0A = this.A00.A0A(size);
            C3081jK c3081jKA0B = this.A00.A0B(size);
            if ((c3081jKA0B.A00 & 3) == 3) {
                interfaceC3082jL.ALt(abstractC3075jEA0A);
            } else {
                int index = c3081jKA0B.A00;
                if ((index & 1) != 0) {
                    if (c3081jKA0B.A02 == null) {
                        interfaceC3082jL.ALt(abstractC3075jEA0A);
                    } else {
                        C3052ir c3052ir = c3081jKA0B.A02;
                        C3052ir c3052ir2 = c3081jKA0B.A01;
                        if (A03[5].charAt(20) == 'R') {
                            throw new RuntimeException();
                        }
                        String[] strArr = A03;
                        strArr[1] = "fJVAe19tdP";
                        strArr[3] = "3fJsXDGb";
                        interfaceC3082jL.AIO(abstractC3075jEA0A, c3052ir, c3052ir2);
                    }
                } else if ((c3081jKA0B.A00 & 14) == 14) {
                    interfaceC3082jL.AIM(abstractC3075jEA0A, c3081jKA0B.A02, c3081jKA0B.A01);
                } else if ((c3081jKA0B.A00 & 12) == 12) {
                    interfaceC3082jL.AIQ(abstractC3075jEA0A, c3081jKA0B.A02, c3081jKA0B.A01);
                } else {
                    int index2 = c3081jKA0B.A00;
                    if ((index2 & 4) != 0) {
                        interfaceC3082jL.AIO(abstractC3075jEA0A, c3081jKA0B.A02, null);
                    } else {
                        int index3 = c3081jKA0B.A00;
                        if ((index3 & 8) != 0) {
                            interfaceC3082jL.AIM(abstractC3075jEA0A, c3081jKA0B.A02, c3081jKA0B.A01);
                        }
                    }
                }
            }
            C3081jK.A02(c3081jKA0B);
        }
    }

    public final boolean A0H(AbstractC3075jE abstractC3075jE) {
        C3081jK record = this.A00.get(abstractC3075jE);
        return (record == null || (record.A00 & 1) == 0) ? false : true;
    }

    public final boolean A0I(AbstractC3075jE abstractC3075jE) {
        C3081jK record = this.A00.get(abstractC3075jE);
        return (record == null || (record.A00 & 4) == 0) ? false : true;
    }
}
