package com.facebook.ads.redexgen.X;

import android.content.Context;
import android.graphics.Point;
import android.text.TextUtils;
import android.util.Pair;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.8h, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes.dex */
public final class C18368h extends R9 {
    public static byte[] A07;
    public static String[] A08 = {"N3ZG1EAeWs47seL3n7lh4Wuuxpt5dQ9S", "oZrngbnpXdb0MQsdT0zVvrp", "Fim13Buiqg0QqQi", "NCw8HvhGeegFdSJV0JTkOh", "1Y8AJD0wDjMc9jtVVPnZ14pSQIsLBm5S", "5vnPQraei", "qi33", "eVlKumeRx"};
    public static final AbstractC2391Vc<Integer> A09;
    public static final AbstractC2391Vc<Integer> A0A;
    public VL A00;
    public C18378i A01;
    public WR A02;
    public final Context A03;
    public final WY A04;
    public final Object A05;
    public final boolean A06;

    /* JADX WARN: Code duplicated, block: B:23:0x007d  */
    /* JADX WARN: Code duplicated, block: B:25:0x0085  */
    /* JADX WARN: Code duplicated, block: B:32:0x00ae A[LOOP:0: B:3:0x000c->B:32:0x00ae, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:61:0x00d5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:67:0x008b A[SYNTHETIC] */
    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @MetaExoPlayerCustomization
    private <T extends WT<T>> Pair<WX, Integer> A0A(int i, C2413Wa c2413Wa, int[][][] iArr, WS<T> ws, Comparator<List<T>> comparator) {
        List arrayList;
        ArrayList arrayList2 = new ArrayList();
        int iA02 = c2413Wa.A02();
        int i2 = 0;
        while (i2 < iA02) {
            if (i == c2413Wa.A03(i2)) {
                RY ryA07 = c2413Wa.A07(i2);
                for (int i3 = 0; i3 < ryA07.A01; i3++) {
                    U8 u8A05 = ryA07.A05(i3);
                    List<T> listA5o = ws.A5o(i2, u8A05, iArr[i2][i3]);
                    boolean[] zArr = new boolean[u8A05.A01];
                    ArrayList arrayList3 = new ArrayList();
                    ArrayList arrayList4 = new ArrayList();
                    for (int i4 = 0; i4 < u8A05.A01; i4++) {
                        T t = listA5o.get(i4);
                        int iA08 = t.A08();
                        if (!zArr[i4] && iA08 != 0) {
                            if (iA08 == 1) {
                                arrayList = AbstractC18519l.A04(t);
                                String[] strArr = A08;
                                if (strArr[5].length() == strArr[7].length()) {
                                    A08[2] = "ZAJHyq1TMCFZthjm457ogzB9XlfcGEFJ";
                                    arrayList3.add(t);
                                }
                            } else {
                                arrayList = new ArrayList();
                                arrayList.add(t);
                                for (int i5 = i4 + 1; i5 < u8A05.A01; i5++) {
                                    T t2 = listA5o.get(i5);
                                    if (t2.A08() == 2 && t.A09(t2)) {
                                        arrayList.add(t2);
                                        zArr[i5] = true;
                                    }
                                }
                            }
                            arrayList4.add(arrayList);
                        }
                    }
                    if (this.A01.A0A) {
                        boolean zIsEmpty = arrayList3.isEmpty();
                        if (A08[4].charAt(13) != 'L') {
                            A08[1] = "2CpqC9UnHnvdpm4Z";
                            if (!zIsEmpty) {
                                if (arrayList3.size() == u8A05.A01) {
                                    arrayList4.clear();
                                    arrayList4.add(arrayList3);
                                }
                            }
                        } else {
                            String[] strArr2 = A08;
                            strArr2[5] = "wigRhAYLK";
                            strArr2[7] = "JAXAgZPha";
                            if (!zIsEmpty) {
                                if (arrayList3.size() == u8A05.A01) {
                                    arrayList4.clear();
                                    arrayList4.add(arrayList3);
                                }
                            }
                        }
                    }
                    arrayList2.addAll(arrayList4);
                }
                i2++;
                if (A08[2].length() != 0) {
                    String[] strArr3 = A08;
                    strArr3[6] = "sOOT";
                    strArr3[3] = "kMH3ngEeEucpvaC7iBfT6l";
                }
            } else {
                i2++;
                if (A08[2].length() != 0) {
                    String[] strArr4 = A08;
                    strArr4[6] = "sOOT";
                    strArr4[3] = "kMH3ngEeEucpvaC7iBfT6l";
                }
            }
            throw new RuntimeException();
        }
        if (arrayList2.isEmpty()) {
            return null;
        }
        List list = (List) Collections.max(arrayList2, comparator);
        int[] iArr2 = new int[list.size()];
        for (int i6 = 0; i6 < list.size(); i6++) {
            iArr2[i6] = ((WT) list.get(i6)).A01;
        }
        WT wt = (WT) list.get(0);
        return Pair.create(new WX(wt.A03, iArr2), Integer.valueOf(wt.A00));
    }

    public static String A0J(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A07, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 98);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A0M() {
        A07 = new byte[]{-52, -84, -32, -49, -44, -38, -117, -50, -45, -52, -39, -39, -48, -41, -117, -50, -38, -32, -39, -33, -117, -50, -38, -39, -34, -33, -35, -52, -44, -39, -33, -34, -117, -50, -52, -39, -39, -38, -33, -117, -51, -48, -117, -52, -37, -37, -41, -44, -48, -49, -117, -30, -44, -33, -45, -38, -32, -33, -117, -35, -48, -47, -48, -35, -48, -39, -50, -48, -117, -33, -38, -117, -82, -38, -39, -33, -48, -29, -33, -103, -117, -83, -32, -44, -41, -49, -117, -33, -45, -48, -117, -33, -35, -52, -50, -42, -117, -34, -48, -41, -48, -50, -33, -38, -35, -117, -44, -39, -34, -33, -52, -39, -50, -48, -117, -30, -44, -33, -45, -117, -38, -39, -48, -117, -38, -47, -117, -33, -45, -48, -117, -39, -38, -39, -104, -49, -48, -37, -35, -48, -50, -52, -33, -48, -49, -117, -50, -38, -39, -34, -33, -35, -32, -50, -33, -38, -35, -34, -117, -33, -45, -52, -33, -117, -33, -52, -42, -48, -117, -52, -117, -82, -38, -39, -33, -48, -29, -33, -117, -52, -35, -46, -32, -40, -48, -39, -33, -103, -41, -8, -7, -12, 8, -1, 7, -25, 5, -12, -10, -2, -26, -8, -1, -8, -10, 7, 2, 5, -46, -26, -43, -38, -32, -96, -46, -44, -92, -27, -7, -24, -19, -13, -77, -27, -25, -72, 58, 78, 61, 66, 72, 8, 62, 58, 60, 12, 19, 39, 22, 27, 33, -31, 23, 19, 21, -27, -33, 28, 33, 21, -38, -45, -55, -4, -17, -22, -21, -11, -75, -25, -4, -74, -73, 2, -11, -16, -15, -5, -69, -19, 2, -17, 60, 47, 42, 43, 53, -11, 42, 53, 50, 40, 63, -13, 60, 47, 57, 47, 53, 52, 60, 47, 42, 43, 53, -11, 46, 43, 60, 41, 10, -3, -8, -7, 3, -61, 12, -63, 10, 2, -8, -62, 3, 2, -58, -62, 10, 4, -51};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static void A0N(RY ry, U1 u1, Map<Integer, U6> map) {
        U6 u6;
        for (int i = 0; i < ry.A01; i++) {
            U6 u7 = u1.A0G.get(ry.A05(i));
            if (u7 != null && ((u6 = map.get(Integer.valueOf(u7.A01()))) == null || (u6.A01.isEmpty() && !u7.A01.isEmpty()))) {
                map.put(Integer.valueOf(u7.A01()), u7);
            }
        }
    }

    static {
        A0M();
        A09 = AbstractC2391Vc.A04(new Comparator() { // from class: com.facebook.ads.redexgen.X.WL
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return C18368h.A05((Integer) obj, (Integer) obj2);
            }
        });
        A0A = AbstractC2391Vc.A04(new Comparator() { // from class: com.facebook.ads.redexgen.X.WM
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return C18368h.A06((Integer) obj, (Integer) obj2);
            }
        });
    }

    @Deprecated
    public C18368h() {
        this(C18378i.A0J, new RT());
    }

    @Deprecated
    public C18368h(U1 u1, WY wy) {
        this(u1, wy, null);
    }

    public C18368h(U1 u1, WY wy, Context context) {
        this.A05 = new Object();
        this.A03 = context != null ? context.getApplicationContext() : null;
        this.A04 = wy;
        if (u1 instanceof C18378i) {
            this.A01 = (C18378i) u1;
        } else {
            C18378i defaultParameters = context == null ? C18378i.A0J : C18378i.A02(context);
            this.A01 = defaultParameters.A0P().A0u(u1).A0p();
        }
        this.A00 = VL.A07;
        this.A06 = context != null && N1.A18(context);
        if (!this.A06 && context != null && N1.A02 >= 32) {
            this.A02 = WR.A00(context);
        }
        if (this.A01.A08 && context == null) {
            MV.A07(A0J(188, 20, 49), A0J(1, 187, 9));
        }
    }

    @MetaExoPlayerCustomization
    public C18368h(WY wy) {
        this(C18378i.A0J, wy);
    }

    public static int A00(int i, int i2) {
        if (i != 0 && i == i2) {
            return Integer.MAX_VALUE;
        }
        return Integer.bitCount(i & i2);
    }

    public static int A02(VC vc, String str, boolean z) {
        if (!TextUtils.isEmpty(str) && str.equals(vc.A0V)) {
            return 4;
        }
        String strA0K = A0K(str);
        String strA0K2 = A0K(vc.A0V);
        if (strA0K2 == null || strA0K == null) {
            return (z && strA0K2 == null) ? 1 : 0;
        }
        if (strA0K2.startsWith(strA0K) || strA0K.startsWith(strA0K2)) {
            return 3;
        }
        String strA0J = A0J(0, 1, 61);
        String str2 = N1.A1P(strA0K2, strA0J)[0];
        String formatLanguage = N1.A1P(strA0K, strA0J)[0];
        if (!str2.equals(formatLanguage)) {
            return 0;
        }
        return 2;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x006a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:22:0x006c  */
    /* JADX WARN: Code duplicated, block: B:36:0x006d A[SYNTHETIC] */
    public static int A03(U8 u8, int i, int i2, boolean z) {
        if (i == Integer.MAX_VALUE || i2 == Integer.MAX_VALUE) {
            return Integer.MAX_VALUE;
        }
        int i3 = Integer.MAX_VALUE;
        if (A08[0].charAt(25) == 'O') {
            throw new RuntimeException();
        }
        A08[1] = "wfFv1AieXG9eNvhmPq2a11ljL";
        for (int i4 = 0; i4 < maxVideoPixelsToRetain; i4++) {
            VC format = u8.A08(i4);
            int maxVideoPixelsToRetain = format.A0L;
            if (maxVideoPixelsToRetain > 0) {
                int maxVideoPixelsToRetain2 = format.A0A;
                if (maxVideoPixelsToRetain2 > 0) {
                    int i5 = format.A0L;
                    int maxVideoPixelsToRetain3 = format.A0A;
                    Point pointA09 = A09(z, i, i2, i5, maxVideoPixelsToRetain3);
                    int i6 = format.A0L;
                    int maxVideoPixelsToRetain4 = format.A0A;
                    int i7 = i6 * maxVideoPixelsToRetain4;
                    int i8 = format.A0L;
                    int maxVideoPixelsToRetain5 = pointA09.x;
                    if (i8 >= ((int) (maxVideoPixelsToRetain5 * 0.98f))) {
                        int videoPixels = format.A0A;
                        int i9 = A08[4].charAt(13);
                        if (i9 != 76) {
                            A08[2] = "ADP1T0Hh";
                            int maxVideoPixelsToRetain6 = pointA09.y;
                            if (videoPixels >= ((int) (maxVideoPixelsToRetain6 * 0.98f))) {
                                if (i7 < i3) {
                                    i3 = i7;
                                }
                            }
                        } else {
                            A08[2] = "3Njng6TDHfmlDodg";
                            int maxVideoPixelsToRetain7 = pointA09.y;
                            if (videoPixels >= ((int) (maxVideoPixelsToRetain7 * 0.98f))) {
                                if (i7 < i3) {
                                    i3 = i7;
                                }
                            }
                        }
                    }
                }
            }
        }
        return i3;
    }

    public static /* synthetic */ int A05(Integer num, Integer num2) {
        if (num.intValue() == -1) {
            return num2.intValue() == -1 ? 0 : -1;
        }
        if (num2.intValue() == -1) {
            return 1;
        }
        return num.intValue() - num2.intValue();
    }

    public static /* synthetic */ int A06(Integer num, Integer num2) {
        return 0;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:7:0x000f  */
    public static int A07(String str) {
        byte b;
        if (str == null) {
            return 0;
        }
        switch (str.hashCode()) {
            case -1851077871:
                if (!str.equals(A0J(272, 18, 100))) {
                    b = -1;
                } else {
                    b = 0;
                }
                break;
            case -1662735862:
                if (!str.equals(A0J(253, 10, 36))) {
                    b = -1;
                } else {
                    b = 1;
                }
                break;
            case -1662541442:
                if (!str.equals(A0J(290, 10, 100))) {
                    b = -1;
                } else {
                    b = 2;
                }
                break;
            case 1331836730:
                if (!str.equals(A0J(263, 9, 42))) {
                    b = -1;
                } else {
                    b = 4;
                }
                break;
            case 1599127257:
                if (!str.equals(A0J(300, 19, 50))) {
                    b = -1;
                } else {
                    b = 3;
                }
                break;
            default:
                b = -1;
                break;
        }
        switch (b) {
            case 0:
                return 5;
            case 1:
                return 4;
            case 2:
                return 3;
            case 3:
                return 2;
            case 4:
                return 1;
            default:
                return 0;
        }
    }

    @MetaExoPlayerCustomization
    public static Point A09(boolean z, int i, int i2, int i3, int i4) {
        if (z) {
            if ((i3 > i4) != (i > i2)) {
                String[] strArr = A08;
                if (strArr[6].length() == strArr[3].length()) {
                    throw new RuntimeException();
                }
                A08[2] = "MRAL2PEWT7Lor36iYCvDrRdop0p2Kv";
                i = i2;
                i2 = i;
            }
        }
        if (i3 * i2 >= i4 * i) {
            return new Point(i, N1.A05(i * i4, i3));
        }
        return new Point(N1.A05(i2 * i3, i4), i2);
    }

    private final Pair<WX, Integer> A0B(C2413Wa c2413Wa, int[][][] iArr, final C18378i c18378i, final String str) throws AnonymousClass96 {
        return A0A(3, c2413Wa, iArr, new WS() { // from class: com.facebook.ads.redexgen.X.RP
            @Override // com.facebook.ads.redexgen.X.WS
            public final List A5o(int i, U8 u8, int[] iArr2) {
                return RI.A02(i, u8, c18378i, iArr2, str);
            }
        }, new Comparator() { // from class: com.facebook.ads.redexgen.X.WK
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return RI.A01((List) obj, (List) obj2);
            }
        });
    }

    private final Pair<WX, Integer> A0C(C2413Wa c2413Wa, int[][][] iArr, int[] iArr2, final C18378i c18378i) throws AnonymousClass96 {
        final boolean z = false;
        for (int i = 0; i < c2413Wa.A02(); i++) {
            if (2 == c2413Wa.A03(i) && c2413Wa.A07(i).A01 > 0) {
                z = true;
                break;
            }
        }
        return A0A(1, c2413Wa, iArr, new WS() { // from class: com.facebook.ads.redexgen.X.RQ
            @Override // com.facebook.ads.redexgen.X.WS
            public final List A5o(int i2, U8 u8, int[] iArr3) {
                return this.A01.A0e(c18378i, z, i2, u8, iArr3);
            }
        }, new Comparator() { // from class: com.facebook.ads.redexgen.X.WJ
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return RO.A02((List) obj, (List) obj2);
            }
        });
    }

    private final Pair<WX, Integer> A0D(C2413Wa c2413Wa, int[][][] iArr, final int[] iArr2, final C18378i c18378i, final String str) throws AnonymousClass96 {
        return A0A(2, c2413Wa, iArr, new WS() { // from class: com.facebook.ads.redexgen.X.RS
            @Override // com.facebook.ads.redexgen.X.WS
            public final List A5o(int i, U8 u8, int[] iArr3) {
                return RH.A06(i, u8, c18378i, iArr3, str, iArr2[i]);
            }
        }, new Comparator() { // from class: com.facebook.ads.redexgen.X.WI
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return RH.A05((List) obj, (List) obj2);
            }
        });
    }

    private final WX A0E(int i, RY ry, int[][] iArr, C18378i c18378i) throws AnonymousClass96 {
        U8 u8 = null;
        int i2 = 0;
        WO wo = null;
        for (int trackIndex = 0; trackIndex < ry.A01; trackIndex++) {
            U8 trackGroup = ry.A05(trackIndex);
            int[] iArr2 = iArr[trackIndex];
            for (int groupIndex = 0; groupIndex < trackGroup.A01; groupIndex++) {
                int selectedTrackIndex = iArr2[groupIndex];
                if (A0S(selectedTrackIndex, c18378i.A0B)) {
                    WO wo2 = new WO(trackGroup.A08(groupIndex), iArr2[groupIndex]);
                    if (wo == null || wo2.compareTo(wo) > 0) {
                        u8 = trackGroup;
                        i2 = groupIndex;
                        wo = wo2;
                    }
                }
            }
        }
        if (u8 == null) {
            return null;
        }
        return new WX(u8, i2);
    }

    public static String A0K(String str) {
        if (TextUtils.isEmpty(str) || TextUtils.equals(str, A0J(250, 3, 3))) {
            return null;
        }
        return str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0L() {
        boolean z;
        synchronized (this.A05) {
            z = this.A01.A08 && !this.A06 && N1.A02 >= 32 && this.A02 != null && this.A02.A06();
        }
        if (z) {
            A01();
        }
    }

    public static void A0P(C2413Wa c2413Wa, U1 u1, WX[] wxArr) {
        WX wx;
        int iA02 = c2413Wa.A02();
        HashMap map = new HashMap();
        for (int i = 0; i < iA02; i++) {
            A0N(c2413Wa.A07(i), u1, map);
        }
        A0N(c2413Wa.A06(), u1, map);
        for (int i2 = 0; i2 < iA02; i2++) {
            int rendererCount = c2413Wa.A03(i2);
            U6 u6 = (U6) map.get(Integer.valueOf(rendererCount));
            if (u6 != null) {
                if (!u6.A01.isEmpty() && c2413Wa.A07(i2).A04(u6.A00) != -1) {
                    wx = new WX(u6.A00, AnonymousClass19.A0B(u6.A01));
                } else {
                    wx = null;
                }
                wxArr[i2] = wx;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0031  */
    public static void A0Q(C2413Wa c2413Wa, C18378i c18378i, WX[] wxArr) {
        WX wx;
        int iA02 = c2413Wa.A02();
        for (int i = 0; i < iA02; i++) {
            RY trackGroups = c2413Wa.A07(i);
            if (c18378i.A0S(i, trackGroups)) {
                RJ rjA0Q = c18378i.A0Q(i, trackGroups);
                if (rjA0Q != null) {
                    int rendererCount = rjA0Q.A03.length;
                    if (rendererCount != 0) {
                        int rendererCount2 = rjA0Q.A00;
                        U8 u8A05 = trackGroups.A05(rendererCount2);
                        int[] iArr = rjA0Q.A03;
                        int rendererIndex = rjA0Q.A02;
                        wx = new WX(u8A05, iArr, rendererIndex);
                    } else {
                        wx = null;
                    }
                } else {
                    wx = null;
                }
                wxArr[i] = wx;
            }
        }
    }

    public static void A0R(C2413Wa c2413Wa, int[][][] iArr, C2251Ph[] c2251PhArr, RA[] raArr) {
        int i = -1;
        int i2 = -1;
        int i3 = 1;
        for (int i4 = 0; i4 < tunnelingAudioRendererIndex; i4++) {
            int i5 = c2413Wa.A03(i4);
            RA ra = raArr[i4];
            if ((i5 == 1 || i5 == 2) && ra != null && A0W(iArr[i4], c2413Wa.A07(i4), ra)) {
                if (i5 == 1) {
                    if (i != -1) {
                        i3 = 0;
                        break;
                    }
                    i = i4;
                } else {
                    if (i2 != -1) {
                        i3 = 0;
                        break;
                    }
                    i2 = i4;
                }
            }
        }
        int tunnelingAudioRendererIndex = (i == -1 || i2 == -1) ? 0 : 1;
        if ((i3 & tunnelingAudioRendererIndex) != 0) {
            C2251Ph c2251Ph = new C2251Ph(true);
            c2251PhArr[i] = c2251Ph;
            c2251PhArr[i2] = c2251Ph;
        }
    }

    @MetaExoPlayerCustomization
    public static boolean A0S(int i, boolean z) {
        int iA03 = PX.A03(i);
        return iA03 == 4 || (z && iA03 == 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean A0T(VC vc) {
        boolean z;
        synchronized (this.A05) {
            z = !this.A01.A08 || this.A06 || vc.A06 <= 2 || (A0U(vc) && (N1.A02 < 32 || this.A02 == null || !this.A02.A06())) || (N1.A02 >= 32 && this.A02 != null && this.A02.A06() && this.A02.A04() && this.A02.A05() && this.A02.A07(this.A00, vc));
        }
        return z;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:9:0x002e  */
    public static boolean A0U(VC vc) {
        byte b;
        if (vc.A0W == null) {
            return false;
        }
        String str = vc.A0W;
        int iHashCode = str.hashCode();
        String[] strArr = A08;
        if (strArr[6].length() == strArr[3].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A08;
        strArr2[6] = "Km1e";
        strArr2[3] = "HhuKc9C19fuqudqOrF8WI4";
        switch (iHashCode) {
            case -2123537834:
                if (!str.equals(A0J(236, 14, 80))) {
                    b = -1;
                } else {
                    b = 2;
                }
                break;
            case 187078296:
                if (!str.equals(A0J(208, 9, 15))) {
                    b = -1;
                } else {
                    b = 0;
                }
                break;
            case 187078297:
                if (!str.equals(A0J(Sdk.SDKError.Reason.AD_RESPONSE_TIMED_OUT_VALUE, 9, 34))) {
                    b = -1;
                } else {
                    b = 3;
                }
                break;
            case 1504578661:
                if (!str.equals(A0J(Sdk.SDKError.Reason.PRIVACY_ICON_FALLBACK_ERROR_VALUE, 10, Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE))) {
                    b = -1;
                } else {
                    b = 1;
                }
                break;
            default:
                b = -1;
                break;
        }
        switch (b) {
            case 0:
            case 1:
            case 2:
            case 3:
                return true;
            default:
                return false;
        }
    }

    public static boolean A0W(int[][] iArr, RY ry, RA ra) {
        if (ra == null) {
            return false;
        }
        int iA04 = ry.A04(ra.A9y());
        for (int i = 0; i < ra.length(); i++) {
            int trackGroupIndex = PX.A05(iArr[iA04][ra.A8t(i)]);
            if (trackGroupIndex != 32) {
                return false;
            }
        }
        return true;
    }

    private final WX[] A0X(C2413Wa c2413Wa, int[][][] iArr, int[] iArr2, C18378i c18378i) throws AnonymousClass96 {
        String str;
        int iA02 = c2413Wa.A02();
        WX[] wxArr = new WX[iA02];
        Pair<WX, Integer> pairA0C = A0C(c2413Wa, iArr, iArr2, c18378i);
        if (pairA0C != null) {
            int iIntValue = ((Integer) pairA0C.second).intValue();
            WX wx = (WX) pairA0C.first;
            if (A08[1].length() == 30) {
                throw new RuntimeException();
            }
            String[] strArr = A08;
            strArr[6] = "i1l7";
            strArr[3] = "8gR5IAybtJJSc0KWEFd8Nb";
            wxArr[iIntValue] = wx;
        }
        if (pairA0C == null) {
            str = null;
        } else {
            U8 u8 = ((WX) pairA0C.first).A01;
            int rendererCount = ((WX) pairA0C.first).A02[0];
            str = u8.A08(rendererCount).A0V;
        }
        Pair<WX, Integer> pairA0D = A0D(c2413Wa, iArr, iArr2, c18378i, str);
        if (pairA0D != null) {
            wxArr[((Integer) pairA0D.second).intValue()] = (WX) pairA0D.first;
        }
        Pair<WX, Integer> pairA0B = A0B(c2413Wa, iArr, c18378i, str);
        if (pairA0B != null) {
            wxArr[((Integer) pairA0B.second).intValue()] = (WX) pairA0B.first;
        }
        for (int i = 0; i < iA02; i++) {
            int iA03 = c2413Wa.A03(i);
            if (iA03 != 2 && iA03 != 1 && iA03 != 3) {
                wxArr[i] = A0E(iA03, c2413Wa.A07(i), iArr[i], c18378i);
            }
        }
        return wxArr;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC2420Wi
    public final boolean A0Y() {
        return true;
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x00a3 */
    @Override // com.facebook.ads.redexgen.X.R9
    @com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.util.Pair<com.facebook.ads.redexgen.X.C2251Ph[], com.facebook.ads.redexgen.X.RA[]> A0d(com.facebook.ads.redexgen.X.C2413Wa r10, int[][][] r11, int[] r12, com.facebook.ads.redexgen.X.C2299Rk r13, com.facebook.ads.androidx.media3.common.Timeline r14) throws java.lang.Throwable {
        /*
            r9 = this;
            r8 = r9
            java.lang.Object r2 = r8.A05
            monitor-enter(r2)
            com.facebook.ads.redexgen.X.8i r6 = r8.A01     // Catch: java.lang.Throwable -> La0
            boolean r0 = r6.A08     // Catch: java.lang.Throwable -> La0
            if (r0 == 0) goto L23
            int r1 = com.facebook.ads.redexgen.X.N1.A02     // Catch: java.lang.Throwable -> La0
            r0 = 32
            if (r1 < r0) goto L23
            com.facebook.ads.redexgen.X.WR r0 = r8.A02     // Catch: java.lang.Throwable -> La0
            if (r0 == 0) goto L23
            com.facebook.ads.redexgen.X.WR r1 = r8.A02     // Catch: java.lang.Throwable -> La0
            android.os.Looper r0 = android.os.Looper.myLooper()     // Catch: java.lang.Throwable -> La0
            java.lang.Object r0 = com.facebook.ads.redexgen.X.AbstractC2159Ln.A02(r0)     // Catch: java.lang.Throwable -> La0
            android.os.Looper r0 = (android.os.Looper) r0     // Catch: java.lang.Throwable -> La0
            r1.A03(r8, r0)     // Catch: java.lang.Throwable -> La0
        L23:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> La0
            int r5 = r10.A02()
            com.facebook.ads.redexgen.X.WX[] r7 = r8.A0X(r10, r11, r12, r6)
            A0P(r10, r6, r7)
            A0Q(r10, r6, r7)
            r4 = 0
        L33:
            r3 = 0
            if (r4 >= r5) goto L51
            int r2 = r10.A03(r4)
            boolean r0 = r6.A0R(r4)
            if (r0 != 0) goto L4c
            com.facebook.ads.redexgen.X.9k<java.lang.Integer> r1 = r6.A0H
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L4e
        L4c:
            r7[r4] = r3
        L4e:
            int r4 = r4 + 1
            goto L33
        L51:
            com.facebook.ads.redexgen.X.WY r1 = r8.A04
            com.facebook.ads.redexgen.X.Ws r0 = r9.A00()
            com.facebook.ads.redexgen.X.RA[] r4 = r1.A6A(r7, r0, r13, r14)
            com.facebook.ads.redexgen.X.Ph[] r3 = new com.facebook.ads.redexgen.X.C2251Ph[r5]
            r2 = 0
        L5e:
            if (r2 >= r5) goto L94
            int r7 = r10.A03(r2)
            boolean r0 = r6.A0R(r2)
            if (r0 != 0) goto L76
            com.facebook.ads.redexgen.X.9k<java.lang.Integer> r1 = r6.A0H
            java.lang.Integer r0 = java.lang.Integer.valueOf(r7)
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L92
        L76:
            r0 = 1
        L77:
            if (r0 != 0) goto L90
            int r1 = r10.A03(r2)
            r0 = -2
            if (r1 == r0) goto L84
            r0 = r4[r2]
            if (r0 == 0) goto L90
        L84:
            r0 = 1
        L85:
            if (r0 == 0) goto L8e
            com.facebook.ads.redexgen.X.Ph r0 = com.facebook.ads.redexgen.X.C2251Ph.A01
        L89:
            r3[r2] = r0
            int r2 = r2 + 1
            goto L5e
        L8e:
            r0 = 0
            goto L89
        L90:
            r0 = 0
            goto L85
        L92:
            r0 = 0
            goto L77
        L94:
            boolean r0 = r6.A0D
            if (r0 == 0) goto L9b
            A0R(r10, r11, r3, r4)
        L9b:
            android.util.Pair r0 = android.util.Pair.create(r3, r4)
            return r0
        La0:
            r0 = move-exception
        La1:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> La3
            goto La5
        La3:
            r0 = move-exception
            goto La1
        La5:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C18368h.A0d(com.facebook.ads.redexgen.X.Wa, int[][][], int[], com.facebook.ads.redexgen.X.Rk, com.facebook.ads.androidx.media3.common.Timeline):android.util.Pair");
    }

    public final /* synthetic */ AbstractC18519l A0e(C18378i c18378i, boolean z, int i, U8 u8, int[] iArr) {
        return RO.A03(i, u8, c18378i, iArr, z, new InterfaceC2431Wt() { // from class: com.facebook.ads.redexgen.X.RR
            @Override // com.facebook.ads.redexgen.X.InterfaceC2431Wt
            public final boolean A4d(Object obj) {
                return this.A00.A0T((VC) obj);
            }
        });
    }
}
