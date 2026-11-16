package com.facebook.ads.redexgen.X;

import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: assets/audience_network/classes.dex */
public final class JB implements InterfaceC3040ie {
    public static byte[] A08;
    public static String[] A09 = {"X1JWoRd1RTsi5LXg3YfkE890Z0SkAp6s", "8cHG76lMVFwKxBGRg2kgut24eHhxfbd", "G9TzZa55JFGh4eGgvGtqHGY1m3qrW6LM", "T7A4lgHZzGr7V1uQcw7LfDSO4lerGRH7", "wT7nveBXif1G6UL4LkiEJi9kfhK", "XR1Jqmc9zxsTs7lfyBsyi3NvUHLKhP3K", "pVA6ZWYUVwE4UScIoRBBosOqE3FsfWwK", "nWmw"};
    public int A00;
    public InterfaceC2948h7<C3018iH> A01;
    public final InterfaceC3017iG A02;
    public final Cif A03;

    @Nullable
    public final Runnable A04;
    public final ArrayList<C3018iH> A05;
    public final ArrayList<C3018iH> A06;
    public final boolean A07;

    public static String A02(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A08, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 66);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A03() {
        A08 = new byte[]{-100, -75, -78, -75, -74, -66, -75, 103, -68, -73, -85, -88, -69, -84, 103, -74, -73, 103, -69, -64, -73, -84, 103, -83, -74, -71, 103, -44, -45, -47, -34, -123, -41, -54, -46, -44, -37, -54, -123, -58, -45, -55, -123, -38, -43, -55, -58, -39, -54, -123, -44, -43, -40, -123, -56, -58, -45, -123, -57, -54, -123, -55, -50, -40, -43, -58, -39, -56, -51, -54, -55, -123, -50, -45, -123, -53, -50, -41, -40, -39, -123, -43, -58, -40, -40, -24, -23, -103, -20, -31, -24, -18, -27, -35, -103, -37, -34, -103, -21, -34, -26, -24, -17, -34, -103, -24, -21, -103, -18, -23, -35, -38, -19, -34, -89, 30, 19, 26, 32, 23, 15, -53, 25, 26, 31, -53, 15, 20, 30, 27, 12, 31, 14, 19, -53, 12, 15, 15, -53, 26, 29, -53, 24, 26, 33, 16, -53, 17, 26, 29, -53, 27, 29, 16, -53, 23, 12, 36, 26, 32, 31};
    }

    static {
        A03();
    }

    public JB(InterfaceC3017iG interfaceC3017iG) {
        this(interfaceC3017iG, false);
    }

    public JB(InterfaceC3017iG interfaceC3017iG, boolean z) {
        this.A01 = new JP(30);
        this.A05 = new ArrayList<>();
        this.A06 = new ArrayList<>();
        this.A00 = 0;
        this.A02 = interfaceC3017iG;
        this.A07 = z;
        this.A03 = new Cif(this);
    }

    /* JADX WARN: Code duplicated, block: B:56:0x00d1  */
    private int A00(int i, int i2) {
        int i3;
        int count;
        int count2 = this.A06.size();
        for (int i4 = count2 - 1; i4 >= 0; i4--) {
            C3018iH c3018iH = this.A06.get(i4);
            int count3 = c3018iH.A00;
            if (count3 == 8) {
                int i5 = c3018iH.A02;
                int count4 = c3018iH.A01;
                if (i5 < count4) {
                    i3 = c3018iH.A02;
                    count = c3018iH.A01;
                } else {
                    i3 = c3018iH.A01;
                    count = c3018iH.A02;
                }
                if (i >= i3 && i <= count) {
                    int count5 = c3018iH.A02;
                    if (i3 == count5) {
                        if (i2 == 1) {
                            int count6 = c3018iH.A01;
                            c3018iH.A01 = count6 + 1;
                        } else if (i2 == 2) {
                            int count7 = c3018iH.A01;
                            c3018iH.A01 = count7 - 1;
                        }
                        i++;
                    } else {
                        if (i2 == 1) {
                            int count8 = c3018iH.A02;
                            c3018iH.A02 = count8 + 1;
                        } else if (i2 == 2) {
                            int count9 = c3018iH.A02;
                            c3018iH.A02 = count9 - 1;
                        }
                        i--;
                    }
                } else {
                    int count10 = c3018iH.A02;
                    if (i < count10) {
                        if (i2 == 1) {
                            int count11 = c3018iH.A02;
                            c3018iH.A02 = count11 + 1;
                            int count12 = c3018iH.A01;
                            c3018iH.A01 = count12 + 1;
                        } else if (i2 == 2) {
                            int count13 = c3018iH.A02;
                            c3018iH.A02 = count13 - 1;
                            int count14 = c3018iH.A01;
                            c3018iH.A01 = count14 - 1;
                        }
                    }
                }
            } else {
                int count15 = c3018iH.A02;
                if (count15 <= i) {
                    int count16 = c3018iH.A00;
                    if (count16 == 1) {
                        int i6 = c3018iH.A01;
                        int i7 = A09[7].length();
                        if (i7 != 4) {
                            throw new RuntimeException();
                        }
                        A09[7] = "N0sU";
                        i -= i6;
                    } else {
                        int count17 = c3018iH.A00;
                        if (count17 == 2) {
                            int count18 = c3018iH.A01;
                            i += count18;
                        }
                    }
                } else if (i2 == 1) {
                    int count19 = c3018iH.A02;
                    c3018iH.A02 = count19 + 1;
                } else if (i2 == 2) {
                    int count20 = c3018iH.A02;
                    c3018iH.A02 = count20 - 1;
                }
            }
        }
        for (int size = this.A06.size() - 1; size >= 0; size--) {
            C3018iH c3018iH2 = this.A06.get(size);
            int count21 = c3018iH2.A00;
            if (count21 == 8) {
                int i8 = c3018iH2.A01;
                int count22 = c3018iH2.A02;
                if (i8 != count22) {
                    int count23 = c3018iH2.A01;
                    if (count23 < 0) {
                        this.A06.remove(size);
                        AIj(c3018iH2);
                    }
                } else {
                    this.A06.remove(size);
                    AIj(c3018iH2);
                }
            } else {
                int count24 = c3018iH2.A01;
                if (count24 <= 0) {
                    this.A06.remove(size);
                    AIj(c3018iH2);
                }
            }
        }
        return i;
    }

    private final int A01(int i, int i2) {
        int size = this.A06.size();
        while (i2 < size) {
            C3018iH c3018iH = this.A06.get(i2);
            int i3 = c3018iH.A00;
            if (i3 == 8) {
                int count = c3018iH.A02;
                if (count == i) {
                    i = c3018iH.A01;
                } else {
                    int count2 = c3018iH.A02;
                    if (count2 < i) {
                        i--;
                    }
                    int count3 = c3018iH.A01;
                    if (count3 <= i) {
                        i++;
                    }
                }
            } else {
                int count4 = c3018iH.A02;
                if (count4 <= i) {
                    int i4 = c3018iH.A00;
                    if (i4 == 2) {
                        int i5 = c3018iH.A02;
                        int count5 = c3018iH.A01;
                        if (i < i5 + count5) {
                            return -1;
                        }
                        int count6 = c3018iH.A01;
                        i -= count6;
                    } else {
                        int i6 = c3018iH.A00;
                        String[] strArr = A09;
                        String str = strArr[6];
                        String str2 = strArr[5];
                        int i7 = str.charAt(31);
                        int count7 = str2.charAt(31);
                        if (i7 != count7) {
                            throw new RuntimeException();
                        }
                        A09[1] = "6d2Cvy1MfGwOem3AHh21iiz4RwVuOhP";
                        if (i6 == 1) {
                            int count8 = c3018iH.A01;
                            i += count8;
                        }
                    }
                } else {
                    continue;
                }
            }
            i2++;
        }
        return i;
    }

    private void A04(C3018iH c3018iH) {
        A09(c3018iH);
    }

    private void A05(C3018iH c3018iH) {
        A09(c3018iH);
    }

    private void A06(C3018iH c3018iH) {
        int i = c3018iH.A02;
        int i2 = 0;
        int i3 = c3018iH.A02;
        int tmpStart = c3018iH.A01;
        int i4 = i3 + tmpStart;
        byte b = -1;
        int i5 = c3018iH.A02;
        while (i5 < i4) {
            int tmpEnd = 0;
            if (this.A02.A79(i5) != null || A0C(i5)) {
                if (b == 0) {
                    A08(ADb(2, i, i2, null));
                    tmpEnd = 1;
                }
                b = 1;
            } else {
                if (b == 1) {
                    A09(ADb(2, i, i2, null));
                    tmpEnd = 1;
                }
                b = 0;
            }
            if (tmpEnd != 0) {
                i5 -= i2;
                i4 -= i2;
                i2 = 1;
            } else {
                i2++;
            }
            i5++;
        }
        int tmpStart2 = c3018iH.A01;
        if (i2 != tmpStart2) {
            AIj(c3018iH);
            c3018iH = ADb(2, i, i2, null);
        }
        if (b == 0) {
            A08(c3018iH);
        } else {
            A09(c3018iH);
        }
    }

    private void A07(C3018iH c3018iH) {
        int i = c3018iH.A02;
        int i2 = 0;
        int i3 = c3018iH.A02;
        int tmpStart = c3018iH.A01;
        int i4 = i3 + tmpStart;
        byte b = -1;
        int position = c3018iH.A02;
        while (true) {
            String[] strArr = A09;
            String str = strArr[6];
            String str2 = strArr[5];
            int tmpCount = str.charAt(31);
            int tmpStart2 = str2.charAt(31);
            if (tmpCount != tmpStart2) {
                throw new RuntimeException();
            }
            A09[0] = "QVMb2fRXyzWHiAZPpRD1aZXDVthvAAWC";
            if (position < i4) {
                if (this.A02.A79(position) != null || A0C(position)) {
                    if (b == 0) {
                        A08(ADb(4, i, i2, c3018iH.A03));
                        i2 = 0;
                        i = position;
                    }
                    b = 1;
                } else {
                    if (b == 1) {
                        A09(ADb(4, i, i2, c3018iH.A03));
                        i2 = 0;
                        i = position;
                    }
                    b = 0;
                }
                i2++;
                position++;
            } else {
                int tmpStart3 = c3018iH.A01;
                if (i2 != tmpStart3) {
                    Object obj = c3018iH.A03;
                    AIj(c3018iH);
                    c3018iH = ADb(4, i, i2, obj);
                }
                if (b == 0) {
                    A08(c3018iH);
                    return;
                } else {
                    A09(c3018iH);
                    return;
                }
            }
        }
    }

    private void A08(C3018iH c3018iH) {
        int i;
        if (c3018iH.A00 != 1) {
            int i2 = c3018iH.A00;
            if (A09[4].length() == 28) {
                throw new RuntimeException();
            }
            A09[7] = "fuh7";
            if (i2 != 8) {
                int offsetPositionForPartial = A00(c3018iH.A02, c3018iH.A00);
                int tmpCnt = 1;
                int positionMultiplier = c3018iH.A02;
                int tmpStart = c3018iH.A00;
                switch (tmpStart) {
                    case 2:
                        i = 0;
                        break;
                    case 3:
                    default:
                        throw new IllegalArgumentException(A02(85, 30, 55) + c3018iH);
                    case 4:
                        i = 1;
                        break;
                }
                for (int p = 1; p < tmpStart; p++) {
                    int tmpStart2 = i * p;
                    int i3 = c3018iH.A02 + tmpStart2;
                    int tmpStart3 = c3018iH.A00;
                    int iA00 = A00(i3, tmpStart3);
                    int pos = 0;
                    int tmpStart4 = c3018iH.A00;
                    switch (tmpStart4) {
                        case 2:
                            pos = iA00 == offsetPositionForPartial ? 1 : 0;
                            break;
                        case 4:
                            int tmpStart5 = offsetPositionForPartial + 1;
                            pos = iA00 == tmpStart5 ? 1 : 0;
                            break;
                    }
                    if (pos != 0) {
                        tmpCnt++;
                    } else {
                        C3018iH c3018iHADb = ADb(c3018iH.A00, offsetPositionForPartial, tmpCnt, c3018iH.A03);
                        A0A(c3018iHADb, positionMultiplier);
                        AIj(c3018iHADb);
                        if (c3018iH.A00 == 4) {
                            positionMultiplier += tmpCnt;
                        }
                        offsetPositionForPartial = iA00;
                        String[] strArr = A09;
                        String str = strArr[3];
                        String str2 = strArr[2];
                        int iCharAt = str.charAt(27);
                        int tmpStart6 = str2.charAt(27);
                        if (iCharAt != tmpStart6) {
                            tmpCnt = 1;
                        } else {
                            A09[1] = "yo86shE8ew7ry1OmrvVtBHjQ2wHk5Ec";
                            tmpCnt = 1;
                        }
                    }
                }
                Object payload = c3018iH.A03;
                AIj(c3018iH);
                if (tmpCnt > 0) {
                    int tmpStart7 = c3018iH.A00;
                    C3018iH c3018iHADb2 = ADb(tmpStart7, offsetPositionForPartial, tmpCnt, payload);
                    if (A09[7].length() != 4) {
                        throw new RuntimeException();
                    }
                    A09[4] = "6SUXoeHtz7oI0Lc";
                    A0A(c3018iHADb2, positionMultiplier);
                    AIj(c3018iHADb2);
                    return;
                }
                return;
            }
        }
        throw new IllegalArgumentException(A02(Sdk.SDKError.Reason.INVALID_INDEX_URL_VALUE, 46, 105));
    }

    private void A09(C3018iH c3018iH) {
        this.A06.add(c3018iH);
        switch (c3018iH.A00) {
            case 1:
                this.A02.ADc(c3018iH.A02, c3018iH.A01);
                return;
            case 2:
                this.A02.ADf(c3018iH.A02, c3018iH.A01);
                return;
            case 3:
            case 5:
            case 6:
            case 7:
            default:
                throw new IllegalArgumentException(A02(0, 27, 5) + c3018iH);
            case 4:
                this.A02.ADE(c3018iH.A02, c3018iH.A01, c3018iH.A03);
                return;
            case 8:
                this.A02.ADd(c3018iH.A02, c3018iH.A01);
                return;
        }
    }

    private final void A0A(C3018iH c3018iH, int i) {
        this.A02.AEg(c3018iH);
        switch (c3018iH.A00) {
            case 2:
                this.A02.ADe(i, c3018iH.A01);
                return;
            case 3:
            default:
                throw new IllegalArgumentException(A02(27, 58, 35));
            case 4:
                this.A02.ADE(i, c3018iH.A01, c3018iH.A03);
                return;
        }
    }

    private final void A0B(List<C3018iH> list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            AIj(list.get(i));
        }
        list.clear();
    }

    private boolean A0C(int i) {
        int size = this.A06.size();
        for (int pos = 0; pos < size; pos++) {
            C3018iH c3018iH = this.A06.get(pos);
            int i2 = c3018iH.A00;
            if (i2 == 8) {
                int i3 = c3018iH.A01;
                int count = pos + 1;
                if (A01(i3, count) == i) {
                    return true;
                }
            } else {
                int i4 = c3018iH.A00;
                int i5 = A09[4].length();
                if (i5 == 28) {
                    throw new RuntimeException();
                }
                A09[7] = "h3FT";
                if (i4 == 1) {
                    int i6 = c3018iH.A02;
                    int count2 = c3018iH.A01;
                    int i7 = i6 + count2;
                    for (int i8 = c3018iH.A02; i8 < i7; i8++) {
                        int count3 = pos + 1;
                        if (A01(i8, count3) == i) {
                            return true;
                        }
                    }
                } else {
                    continue;
                }
            }
        }
        return false;
    }

    public final int A0D(int i) {
        return A01(i, 0);
    }

    public final int A0E(int i) {
        int size = this.A05.size();
        for (int i2 = 0; i2 < size; i2++) {
            C3018iH op = this.A05.get(i2);
            int size2 = op.A00;
            switch (size2) {
                case 1:
                    int size3 = op.A02;
                    if (size3 <= i) {
                        int size4 = op.A01;
                        i += size4;
                    }
                    break;
                case 2:
                    int size5 = op.A02;
                    if (size5 <= i) {
                        int i3 = op.A02;
                        int size6 = op.A01;
                        if (i3 + size6 > i) {
                            return -1;
                        }
                        int size7 = op.A01;
                        i -= size7;
                    } else {
                        continue;
                    }
                    break;
                case 8:
                    int size8 = op.A02;
                    if (size8 == i) {
                        i = op.A01;
                    } else {
                        int size9 = op.A02;
                        if (size9 < i) {
                            i--;
                        }
                        int size10 = op.A01;
                        if (size10 <= i) {
                            i++;
                        }
                    }
                    break;
            }
        }
        return i;
    }

    public final void A0F() {
        int size = this.A06.size();
        for (int i = 0; i < size; i++) {
            this.A02.AEi(this.A06.get(i));
        }
        A0B(this.A06);
        this.A00 = 0;
    }

    public final void A0G() {
        A0F();
        int size = this.A05.size();
        for (int i = 0; i < size; i++) {
            C3018iH c3018iH = this.A05.get(i);
            int count = c3018iH.A00;
            switch (count) {
                case 1:
                    this.A02.AEi(c3018iH);
                    InterfaceC3017iG interfaceC3017iG = this.A02;
                    int i2 = c3018iH.A02;
                    int count2 = c3018iH.A01;
                    interfaceC3017iG.ADc(i2, count2);
                    break;
                case 2:
                    this.A02.AEi(c3018iH);
                    InterfaceC3017iG interfaceC3017iG2 = this.A02;
                    int i3 = c3018iH.A02;
                    int count3 = c3018iH.A01;
                    interfaceC3017iG2.ADe(i3, count3);
                    break;
                case 4:
                    this.A02.AEi(c3018iH);
                    InterfaceC3017iG interfaceC3017iG3 = this.A02;
                    int i4 = c3018iH.A02;
                    int i5 = c3018iH.A01;
                    interfaceC3017iG3.ADE(i4, i5, c3018iH.A03);
                    break;
                case 8:
                    this.A02.AEi(c3018iH);
                    InterfaceC3017iG interfaceC3017iG4 = this.A02;
                    int i6 = c3018iH.A02;
                    int count4 = c3018iH.A01;
                    interfaceC3017iG4.ADd(i6, count4);
                    break;
            }
            if (this.A04 != null) {
                this.A04.run();
            }
        }
        A0B(this.A05);
        this.A00 = 0;
        if (A09[0].charAt(28) != 'A') {
            throw new RuntimeException();
        }
        A09[1] = "6Qpi3zwbHCTXm3nhA4JhLro11ECL3LU";
    }

    public final void A0H() {
        this.A03.A05(this.A05);
        int size = this.A05.size();
        for (int i = 0; i < size; i++) {
            C3018iH c3018iH = this.A05.get(i);
            int i2 = c3018iH.A00;
            String[] strArr = A09;
            String str = strArr[6];
            String str2 = strArr[5];
            int i3 = str.charAt(31);
            int count = str2.charAt(31);
            if (i3 != count) {
                throw new RuntimeException();
            }
            A09[1] = "1BDdKJQJlsgxETOK14Gjs1hC7fjbuKK";
            switch (i2) {
                case 1:
                    A04(c3018iH);
                    break;
                case 2:
                    A06(c3018iH);
                    break;
                case 4:
                    A07(c3018iH);
                    break;
                case 8:
                    A05(c3018iH);
                    break;
            }
            if (this.A04 != null) {
                this.A04.run();
            }
        }
        this.A05.clear();
    }

    public final void A0I() {
        A0B(this.A05);
        A0B(this.A06);
        this.A00 = 0;
    }

    public final boolean A0J() {
        return this.A05.size() > 0;
    }

    public final boolean A0K() {
        return (this.A06.isEmpty() || this.A05.isEmpty()) ? false : true;
    }

    public final boolean A0L(int i) {
        return (this.A00 & i) != 0;
    }

    public final boolean A0M(@Nullable int i, int i2, Object obj) {
        if (i2 < 1) {
            return false;
        }
        this.A05.add(ADb(4, i, i2, obj));
        this.A00 |= 4;
        return this.A05.size() == 1;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC3040ie
    public final C3018iH ADb(@Nullable int i, int i2, int i3, Object obj) {
        C3018iH op = this.A01.A3X();
        if (op == null) {
            return new C3018iH(i, i2, i3, obj);
        }
        op.A00 = i;
        op.A02 = i2;
        op.A01 = i3;
        op.A03 = obj;
        return op;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC3040ie
    public final void AIj(C3018iH c3018iH) {
        if (!this.A07) {
            c3018iH.A03 = null;
            this.A01.AIt(c3018iH);
        }
    }
}
