package com.facebook.ads.redexgen.X;

import android.view.View;
import android.view.ViewGroup;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.vungle.ads.internal.protos.Sdk;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.j4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes.dex */
public final class C3065j4 {
    public static byte[] A09;
    public static String[] A0A = {"ulA9tMpXJ0Fgz3L6", "kmBp6JcSqPlb9eogqvbvj6g5ppHVaWSS", "klPqAM4BpBJNr6xIOjiQhoS6UO4TrOHS", "7VyM9GgXJuu8YzSYQI3HrMroeBYRJajD", "jF2bnw6E6wYHKm8plX11kYiLrSAbSJmD", "6pBnRch9VxXRPJwtqH0gd323b09mKXXU", "Clk2oRExhn8z5HC1wWkAqM8aEwWEfAA8", "Myq33IQdIYqIzBMhSJhfspyke76FBM0c"};
    public C3064j3 A01;
    public AbstractC3073jC A04;
    public final /* synthetic */ C7O A08;
    public final ArrayList<AbstractC3075jE> A05 = new ArrayList<>();
    public ArrayList<AbstractC3075jE> A02 = null;
    public final ArrayList<AbstractC3075jE> A06 = new ArrayList<>();
    public final List<AbstractC3075jE> A07 = Collections.unmodifiableList(this.A05);
    public int A03 = 2;
    public int A00 = 2;

    public static String A04(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A09, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 58);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A05() {
        A09 = new byte[]{-91, -18, -8, -58, -7, -7, -26, -24, -19, -22, -23, -65, -59, -32, 39, 30, 30, 43, 29, 44, -14, -53, -48, -62, -21, 22, 7, 15, -62, 5, 17, 23, 16, 22, -36, -38, -33, 36, 37, 18, 37, 22, -21, -120, 122, -83, -50, -69, -50, -65, 122, -61, -50, -65, -57, 122, -67, -55, -49, -56, -50, 122, -61, -51, 122, -13, 17, 28, 28, 21, 20, -48, 35, 19, 34, 17, 32, -48, 38, 25, 21, 39, -48, 39, 25, 36, 24, -48, 17, 30, -48, 25, 30, 38, 17, 28, 25, 20, -48, 38, 25, 21, 39, -34, -48, -7, 30, 38, 17, 28, 25, 20, -48, 38, 25, 21, 39, 35, -48, 19, 17, 30, 30, 31, 36, -48, 18, 21, -48, 34, 21, 37, 35, 21, 20, -48, 22, 34, 31, 29, -48, 35, 19, 34, 17, 32, -36, -48, 36, 24, 21, 41, -48, 35, 24, 31, 37, 28, 20, -48, 34, 21, 18, 31, 37, 30, 20, -48, 22, 34, 31, 29, -48, 34, 21, 19, 41, 19, 28, 21, 34, -48, 32, 31, 31, 28, -34, -13, 24, 13, 25, 24, 29, 19, 29, 30, 15, 24, 13, 35, -54, 14, 15, 30, 15, 13, 30, 15, 14, -40, -54, -13, 24, 32, 11, 22, 19, 14, -54, 19, 30, 15, 23, -54, 26, 25, 29, 19, 30, 19, 25, 24, -54, -125, -88, -99, -87, -88, -83, -93, -83, -82, -97, -88, -99, -77, 90, -98, -97, -82, -97, -99, -82, -97, -98, 104, 90, -125, -88, -80, -101, -90, -93, -98, 90, -80, -93, -97, -79, 90, -94, -87, -90, -98, -97, -84, 90, -101, -98, -101, -86, -82, -97, -84, 90, -86, -87, -83, -93, -82, -93, -87, -88, -73, -36, -28, -49, -38, -41, -46, -114, -41, -30, -45, -37, -114, -34, -35, -31, -41, -30, -41, -35, -36, -114, -36, -20, -5, -22, -7, -7, -18, -19, -87, -8, -5, -87, -22, -3, -3, -22, -20, -15, -18, -19, -87, -1, -14, -18, 0, -4, -87, -10, -22, 2, -87, -9, -8, -3, -87, -21, -18, -87, -5, -18, -20, 2, -20, -11, -18, -19, -73, -87, -14, -4, -36, -20, -5, -22, -7, -61, -102, -77, -74, 102, -86, -85, -70, -89, -87, -82, -85, -86, 102, -68, -81, -85, -67, 102, -71, -82, -75, -69, -78, -86, 102, -88, -85, 102, -72, -85, -77, -75, -68, -85, -86, 102, -84, -72, -75, -77, 102, -104, -85, -87, -65, -87, -78, -85, -72, -100, -81, -85, -67, 102, -88, -85, -84, -75, -72, -85, 102, -81, -70, 102, -87, -89, -76, 102, -88, -85, 102, -72, -85, -87, -65, -87, -78, -85, -86, -128, 102, -38, -8, -1, -17, -12, -19, -90, -6, -11, -90, -8, -21, -23, -1, -23, -14, -21, -90, -25, -12, -90, -17, -19, -12, -11, -8, -21, -22, -90, -4, -17, -21, -3, -90, -18, -11, -14, -22, -21, -8, -76, -90, -33, -11, -5, -90, -7, -18, -11, -5, -14, -22, -90, -20, -17, -8, -7, -6, -90, -23, -25, -14, -14, -90, -7, -6, -11, -10, -49, -19, -12, -11, -8, -17, -12, -19, -36, -17, -21, -3, -82, -4, -17, -21, -3, -81, -90, -24, -21, -20, -11, -8, -21, -90, -23, -25, -14, -14, -17, -12, -19, -90, -8, -21, -23, -1, -23, -14, -21, -76, -78, -80, -65, -95, -76, -80, -62, -111, -70, -67, -101, -70, -66, -76, -65, -76, -70, -71, -116, -71, -81, -97, -60, -69, -80, -66, -61, -53, -74, -63, -66, -71, 117, -59, -60, -56, -66, -55, -66, -60, -61, 117, -28, -39, -15, -25, -19, -20, -104, -31, -26, -36, -35, -16, -104, -21, -32, -25, -19, -28, -36, -104, -26, -25, -20, -104, -38, -35, -104, -91, -87, -104, -39, -34, -20, -35, -22, -104, -19, -26, -32, -31, -36, -31, -26, -33, -104, -39, -104, -18, -31, -35, -17, -78, -12, -13, -37, -18, -22, -4, -41, -22, -24, -2, -24, -15, -22, -23};
    }

    static {
        A05();
    }

    public C3065j4(C7O c7o) {
        this.A08 = c7o;
    }

    private final View A00(int i, boolean z) {
        return A0J(i, z, Long.MAX_VALUE).A0H;
    }

    private final AbstractC3075jE A01(int i) {
        int size;
        int iA0D;
        if (this.A02 == null || (size = this.A02.size()) == 0) {
            return null;
        }
        for (int i2 = 0; i2 < size; i2++) {
            AbstractC3075jE abstractC3075jE = this.A02.get(i2);
            if (!abstractC3075jE.A0t()) {
                int i3 = abstractC3075jE.A0T();
                if (i3 == i) {
                    abstractC3075jE.A0e(32);
                    return abstractC3075jE;
                }
            }
        }
        if (this.A08.A04.A0O() && (iA0D = this.A08.A00.A0D(i)) > 0) {
            int offsetPosition = this.A08.A04.A0B();
            if (iA0D < offsetPosition) {
                long jA0D = this.A08.A04.A0D(iA0D);
                for (int i4 = 0; i4 < size; i4++) {
                    AbstractC3075jE abstractC3075jE2 = this.A02.get(i4);
                    if (!abstractC3075jE2.A0t() && abstractC3075jE2.A0V() == jA0D) {
                        abstractC3075jE2.A0e(32);
                        return abstractC3075jE2;
                    }
                }
            }
        }
        return null;
    }

    private final AbstractC3075jE A02(int i, boolean z) {
        View viewA08;
        int size = this.A05.size();
        for (int i2 = 0; i2 < size; i2++) {
            AbstractC3075jE abstractC3075jE = this.A05.get(i2);
            if (!abstractC3075jE.A0t()) {
                int scrapCount = abstractC3075jE.A0T();
                if (scrapCount == i && !abstractC3075jE.A0m() && (this.A08.A0s.A09 || !abstractC3075jE.A0n())) {
                    abstractC3075jE.A0e(32);
                    return abstractC3075jE;
                }
            }
        }
        if (!z && (viewA08 = this.A08.A01.A08(i)) != null) {
            AbstractC3075jE abstractC3075jEA0F = C7O.A0F(viewA08);
            this.A08.A01.A0G(viewA08);
            int iA07 = this.A08.A01.A07(viewA08);
            if (iA07 != -1) {
                this.A08.A01.A0C(iA07);
                A0X(viewA08);
                abstractC3075jEA0F.A0e(8224);
                return abstractC3075jEA0F;
            }
            throw new IllegalStateException(A04(604, 52, 62) + abstractC3075jEA0F + this.A08.A1L());
        }
        int size2 = this.A06.size();
        for (int i3 = 0; i3 < size2; i3++) {
            AbstractC3075jE abstractC3075jE2 = this.A06.get(i3);
            if (!abstractC3075jE2.A0m()) {
                int scrapCount2 = abstractC3075jE2.A0T();
                if (scrapCount2 == i) {
                    if (!z) {
                        this.A06.remove(i3);
                    }
                    return abstractC3075jE2;
                }
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x009a  */
    /* JADX WARN: Code duplicated, block: B:31:0x00af  */
    /* JADX WARN: Code duplicated, block: B:33:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:49:0x0130  */
    /* JADX WARN: Code duplicated, block: B:60:0x00d4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:63:0x00ec A[SYNTHETIC] */
    private final AbstractC3075jE A03(long j, int i, boolean z) {
        ArrayList<AbstractC3075jE> arrayList;
        int cacheSize;
        int count;
        int cacheSize2;
        int count2;
        int count3 = this.A05.size();
        for (int i2 = count3 - 1; i2 >= 0; i2--) {
            AbstractC3075jE abstractC3075jE = this.A05.get(i2);
            if (abstractC3075jE.A0V() == j && !abstractC3075jE.A0t()) {
                int count4 = abstractC3075jE.A0S();
                if (i == count4) {
                    abstractC3075jE.A0e(32);
                    if (abstractC3075jE.A0n()) {
                        C7O c7o = this.A08;
                        int i3 = A0A[4].charAt(3);
                        if (i3 == 98) {
                            A0A[0] = "q3aWXTgT7NsVf007";
                            if (!c7o.A0s.A07()) {
                                String[] strArr = A0A;
                                String str = strArr[2];
                                String str2 = strArr[1];
                                int cacheSize3 = str.charAt(0);
                                int count5 = str2.charAt(0);
                                if (cacheSize3 != count5) {
                                    A0A[4] = "NC6bFXUosLdTEwJsXrsHGkbXBsQUMG7q";
                                    abstractC3075jE.A0f(2, 14);
                                } else {
                                    String[] strArr2 = A0A;
                                    strArr2[2] = "kBSMDIkt47Rx4hHhTamY1xnSrMWRxYxp";
                                    strArr2[1] = "kToZLwND7zKVFlbtf8XZb6UwHA5zPLAu";
                                    abstractC3075jE.A0f(2, 14);
                                }
                            }
                        }
                        throw new RuntimeException();
                    }
                    return abstractC3075jE;
                }
                if (!z) {
                    this.A05.remove(i2);
                    this.A08.removeDetachedView(abstractC3075jE.A0H, false);
                    A0W(abstractC3075jE.A0H);
                }
            }
        }
        int count6 = this.A06.size();
        for (int i4 = count6 - 1; i4 >= 0; i4--) {
            AbstractC3075jE abstractC3075jE2 = this.A06.get(i4);
            if (abstractC3075jE2.A0V() == j) {
                int iA0S = abstractC3075jE2.A0S();
                int cacheSize4 = A0A[0].length();
                if (cacheSize4 != 16) {
                    String[] strArr3 = A0A;
                    strArr3[7] = "lrD7iCy3KBiO8gA6PsFToJiVZrW1xMAl";
                    strArr3[6] = "amz9CZtibeJcU8bEqG7a4ZYgRNeZgxWk";
                    if (i == iA0S) {
                        if (!z) {
                            arrayList = this.A06;
                            String[] strArr4 = A0A;
                            String str3 = strArr4[5];
                            String str4 = strArr4[3];
                            cacheSize = str3.charAt(0);
                            count = str4.charAt(0);
                            if (cacheSize != count) {
                                String[] strArr5 = A0A;
                                strArr5[5] = "or4YmCu0ppqzW1VFAnuQtpcwvOCNSyKL";
                                strArr5[3] = "x7G8xrEgau2heO3LEdjWfX9qC3RDyC0d";
                                arrayList.remove(i4);
                            } else {
                                arrayList.remove(i4);
                            }
                        }
                        return abstractC3075jE2;
                    }
                    if (!z) {
                        A07(i4);
                        String[] strArr6 = A0A;
                        String str5 = strArr6[2];
                        String str6 = strArr6[1];
                        cacheSize2 = str5.charAt(0);
                        count2 = str6.charAt(0);
                        if (cacheSize2 == count2) {
                            A0A[4] = "2lrbY7WLbUziAPe6QkcwvBQ2VEr9QFta";
                            return null;
                        }
                        throw new RuntimeException();
                    }
                } else {
                    String[] strArr7 = A0A;
                    strArr7[2] = "kYzWBiiTSiU3KogqfJ4EJctPAodLTQqF";
                    strArr7[1] = "kIBKgO4naDZyukeXVXxcwMENrZxoY36q";
                    if (i == iA0S) {
                        if (!z) {
                            arrayList = this.A06;
                            String[] strArr8 = A0A;
                            String str7 = strArr8[5];
                            String str8 = strArr8[3];
                            cacheSize = str7.charAt(0);
                            count = str8.charAt(0);
                            if (cacheSize != count) {
                                String[] strArr9 = A0A;
                                strArr9[5] = "or4YmCu0ppqzW1VFAnuQtpcwvOCNSyKL";
                                strArr9[3] = "x7G8xrEgau2heO3LEdjWfX9qC3RDyC0d";
                                arrayList.remove(i4);
                            } else {
                                arrayList.remove(i4);
                            }
                        }
                        return abstractC3075jE2;
                    }
                    if (!z) {
                        A07(i4);
                        String[] strArr10 = A0A;
                        String str9 = strArr10[2];
                        String str10 = strArr10[1];
                        cacheSize2 = str9.charAt(0);
                        count2 = str10.charAt(0);
                        if (cacheSize2 == count2) {
                            A0A[4] = "2lrbY7WLbUziAPe6QkcwvBQ2VEr9QFta";
                            return null;
                        }
                        throw new RuntimeException();
                    }
                }
            }
        }
        return null;
    }

    private final void A06() {
        int count = this.A06.size();
        for (int count2 = count - 1; count2 >= 0; count2--) {
            A07(count2);
        }
        this.A06.clear();
        if (C7O.A1E) {
            this.A08.A02.A02();
        }
    }

    private final void A07(int i) {
        A0e(this.A06.get(i), true);
        this.A06.remove(i);
    }

    private void A08(ViewGroup viewGroup, boolean z) {
        for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = viewGroup.getChildAt(childCount);
            if (childAt instanceof ViewGroup) {
                String[] strArr = A0A;
                String str = strArr[7];
                String str2 = strArr[6];
                int iCharAt = str.charAt(8);
                int i = str2.charAt(8);
                if (iCharAt == i) {
                    throw new RuntimeException();
                }
                A0A[4] = "0ZJbYELQTNKw4GYvMFOIJ2JFgvUoupt2";
                A08((ViewGroup) childAt, true);
            }
        }
        if (!z) {
            return;
        }
        if (viewGroup.getVisibility() == 4) {
            viewGroup.setVisibility(0);
            viewGroup.setVisibility(4);
        } else {
            int visibility = viewGroup.getVisibility();
            viewGroup.setVisibility(4);
            viewGroup.setVisibility(visibility);
        }
    }

    private void A09(AbstractC3075jE abstractC3075jE) {
        if (this.A08.A1x()) {
            View view = abstractC3075jE.A0H;
            if (AbstractC2977hb.A00(view) == 0) {
                AbstractC2977hb.A09(view, 1);
            }
            if (!AbstractC2977hb.A0F(view)) {
                abstractC3075jE.A0e(16384);
                AbstractC2977hb.A0B(view, this.A08.A09.A0A());
            }
        }
    }

    private void A0A(AbstractC3075jE abstractC3075jE) {
        if (abstractC3075jE.A0H instanceof ViewGroup) {
            A08((ViewGroup) abstractC3075jE.A0H, false);
        }
    }

    private final void A0B(AbstractC3075jE abstractC3075jE) {
        if (0 != 0) {
            throw new NullPointerException(A04(656, 14, 75));
        }
        if (this.A08.A04 != null) {
            this.A08.A04.A0K(abstractC3075jE);
        }
        if (this.A08.A0s != null) {
            this.A08.A0t.A0B(abstractC3075jE);
        }
    }

    private final boolean A0C(AbstractC3075jE abstractC3075jE) {
        if (abstractC3075jE.A0n()) {
            return this.A08.A0s.A07();
        }
        if (abstractC3075jE.A03 >= 0 && abstractC3075jE.A03 < this.A08.A04.A0B()) {
            if (!this.A08.A0s.A07()) {
                int iA0C = this.A08.A04.A0C(abstractC3075jE.A03);
                int type = abstractC3075jE.A0S();
                if (iA0C != type) {
                    return false;
                }
            }
            return !this.A08.A04.A0O() || abstractC3075jE.A0V() == this.A08.A04.A0D(abstractC3075jE.A03);
        }
        throw new IndexOutOfBoundsException(A04(233, 60, 0) + abstractC3075jE + this.A08.A1L());
    }

    private boolean A0D(AbstractC3075jE abstractC3075jE, int i, int i2, long startBindNs) {
        abstractC3075jE.A08 = this.A08;
        int iA0S = abstractC3075jE.A0S();
        long nanoTime = this.A08.getNanoTime();
        if (startBindNs != Long.MAX_VALUE) {
            C3064j3 c3064j3 = this.A01;
            String[] strArr = A0A;
            String str = strArr[5];
            String str2 = strArr[3];
            int iCharAt = str.charAt(0);
            int viewType = str2.charAt(0);
            if (iCharAt == viewType) {
                throw new RuntimeException();
            }
            A0A[0] = "We3abAYlnqMpJzTP";
            if (!c3064j3.A0A(iA0S, nanoTime, startBindNs)) {
                return false;
            }
        }
        this.A08.A04.A0L(abstractC3075jE, i);
        this.A01.A05(abstractC3075jE.A0S(), this.A08.getNanoTime() - nanoTime);
        A09(abstractC3075jE);
        if (this.A08.A0s.A07()) {
            abstractC3075jE.A04 = i2;
            return true;
        }
        return true;
    }

    public final int A0E() {
        return this.A05.size();
    }

    public final int A0F(int i) {
        if (i >= 0) {
            C7O c7o = this.A08;
            if (A0A[0].length() != 16) {
                throw new RuntimeException();
            }
            A0A[0] = "3KxCBQFQ0qPnaRqJ";
            if (i < c7o.A0s.A03()) {
                if (!this.A08.A0s.A07()) {
                    return i;
                }
                return this.A08.A00.A0D(i);
            }
        }
        throw new IndexOutOfBoundsException(A04(587, 17, 27) + i + A04(43, 22, 32) + this.A08.A0s.A03() + this.A08.A1L());
    }

    public final View A0G(int i) {
        return this.A05.get(i).A0H;
    }

    public final View A0H(int i) {
        return A00(i, false);
    }

    public final C3064j3 A0I() {
        if (this.A01 == null) {
            this.A01 = new C3064j3();
        }
        return this.A01;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0246  */
    /* JADX WARN: Code duplicated, block: B:102:0x024c  */
    /* JADX WARN: Code duplicated, block: B:104:0x0264  */
    /* JADX WARN: Code duplicated, block: B:106:0x026d  */
    /* JADX WARN: Code duplicated, block: B:108:0x0273  */
    /* JADX WARN: Code duplicated, block: B:110:0x028f  */
    /* JADX WARN: Code duplicated, block: B:111:0x02a1 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:67:0x0180 A[DONT_INVERT, PHI: r7 r9
  0x0180: PHI (r7v3 boolean) = (r7v2 boolean), (r7v4 boolean), (r7v4 boolean) binds: [B:24:0x0052, B:50:0x00c5, B:66:0x0173] A[DONT_GENERATE, DONT_INLINE]
  0x0180: PHI (r9v3 com.facebook.ads.redexgen.X.jE) = (r9v2 com.facebook.ads.redexgen.X.jE), (r9v5 com.facebook.ads.redexgen.X.jE), (r9v6 com.facebook.ads.redexgen.X.jE) binds: [B:24:0x0052, B:50:0x00c5, B:66:0x0173] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:68:0x0182  */
    /* JADX WARN: Code duplicated, block: B:74:0x019f  */
    /* JADX WARN: Code duplicated, block: B:77:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:80:0x01cd A[PHI: r6
  0x01cd: PHI (r6v3 boolean) = (r6v2 boolean), (r6v1 boolean), (r6v1 boolean) binds: [B:110:0x028f, B:107:0x0271, B:79:0x01cb] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:84:0x01e3  */
    /* JADX WARN: Code duplicated, block: B:86:0x01f5  */
    /* JADX WARN: Code duplicated, block: B:89:0x0206 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:92:0x020b  */
    /* JADX WARN: Code duplicated, block: B:93:0x020d  */
    /* JADX WARN: Code duplicated, block: B:95:0x0215  */
    /* JADX WARN: Code duplicated, block: B:98:0x022f  */
    /* JADX WARN: Code duplicated, block: B:99:0x0243  */
    public final AbstractC3075jE A0J(int i, boolean z, long j) {
        boolean zA0D;
        int iA0D;
        String[] strArr;
        boolean zA0r;
        String[] strArr2;
        View view;
        ViewGroup.LayoutParams layoutParams;
        C3058ix c3058ix;
        ViewGroup.LayoutParams layoutParamsGenerateLayoutParams;
        String[] strArr3;
        C7O c7oA0H;
        if (i >= 0 && i < this.A08.A0s.A03()) {
            boolean z2 = false;
            AbstractC3075jE abstractC3075jEA0E = null;
            boolean fromScrapOrHiddenOrCache = this.A08.A0s.A07();
            if (fromScrapOrHiddenOrCache) {
                abstractC3075jEA0E = A01(i);
                z2 = abstractC3075jEA0E != null;
            }
            if (abstractC3075jEA0E == null && (abstractC3075jEA0E = A02(i, z)) != null) {
                boolean fromScrapOrHiddenOrCache2 = A0C(abstractC3075jEA0E);
                if (!fromScrapOrHiddenOrCache2) {
                    if (!z) {
                        abstractC3075jEA0E.A0e(4);
                        boolean fromScrapOrHiddenOrCache3 = abstractC3075jEA0E.A0o();
                        if (fromScrapOrHiddenOrCache3) {
                            this.A08.removeDetachedView(abstractC3075jEA0E.A0H, false);
                            abstractC3075jEA0E.A0d();
                        } else {
                            boolean fromScrapOrHiddenOrCache4 = abstractC3075jEA0E.A0t();
                            if (fromScrapOrHiddenOrCache4) {
                                abstractC3075jEA0E.A0Z();
                            }
                        }
                        A0c(abstractC3075jEA0E);
                    }
                    abstractC3075jEA0E = null;
                } else {
                    z2 = true;
                }
            }
            if (abstractC3075jEA0E == null) {
                int iA0D2 = this.A08.A00.A0D(i);
                if (iA0D2 < 0 || iA0D2 >= this.A08.A04.A0B()) {
                    throw new IndexOutOfBoundsException(A04(187, 46, 112) + i + A04(13, 8, 126) + iA0D2 + A04(35, 8, Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE) + this.A08.A0s.A03() + this.A08.A1L());
                }
                int iA0C = this.A08.A04.A0C(iA0D2);
                boolean fromScrapOrHiddenOrCache5 = this.A08.A04.A0O();
                if (fromScrapOrHiddenOrCache5 && (abstractC3075jEA0E = A03(this.A08.A04.A0D(iA0D2), iA0C, z)) != null) {
                    abstractC3075jEA0E.A03 = iA0D2;
                    z2 = true;
                }
                if (abstractC3075jEA0E == null && 0 != 0) {
                    throw new NullPointerException(A04(TTAdConstant.STYLE_SIZE_RADIO_9_16, 25, 17));
                }
                if (abstractC3075jEA0E == null && (abstractC3075jEA0E = A0I().A03(iA0C)) != null) {
                    abstractC3075jEA0E.A0b();
                    boolean fromScrapOrHiddenOrCache6 = C7O.A1C;
                    if (fromScrapOrHiddenOrCache6) {
                        A0A(abstractC3075jEA0E);
                    }
                }
                if (abstractC3075jEA0E == null) {
                    long nanoTime = this.A08.getNanoTime();
                    if (j != Long.MAX_VALUE) {
                        boolean fromScrapOrHiddenOrCache7 = this.A01.A0B(iA0C, nanoTime, j);
                        if (!fromScrapOrHiddenOrCache7) {
                            String[] strArr4 = A0A;
                            if (strArr4[7].charAt(8) != strArr4[6].charAt(8)) {
                                A0A[4] = "fdYbLns5cH4Uqi6qZhk44zURNmgZymnf";
                                return null;
                            }
                        }
                    }
                    abstractC3075jEA0E = this.A08.A04.A0E(this.A08, iA0C);
                    boolean fromScrapOrHiddenOrCache8 = C7O.A1E;
                    if (fromScrapOrHiddenOrCache8 && (c7oA0H = C7O.A0H(abstractC3075jEA0E.A0H)) != null) {
                        abstractC3075jEA0E.A09 = new WeakReference<>(c7oA0H);
                    }
                    this.A01.A06(iA0C, this.A08.getNanoTime() - nanoTime);
                    if (z2) {
                        abstractC3075jEA0E.A0f(0, 8192);
                        if (this.A08.A0s.A0C) {
                            int changeFlags = AbstractC3053is.A06(abstractC3075jEA0E);
                            C3052ir info = this.A08.A05.A0F(this.A08.A0s, abstractC3075jEA0E, changeFlags | 4096, abstractC3075jEA0E.A0W());
                            this.A08.A1r(abstractC3075jEA0E, info);
                        }
                    }
                    zA0D = false;
                    if (!this.A08.A0s.A07()) {
                        if (abstractC3075jEA0E.A0l()) {
                            zA0r = abstractC3075jEA0E.A0r();
                            strArr2 = A0A;
                            if (strArr2[7].charAt(8) != strArr2[6].charAt(8)) {
                                A0A[0] = "CFgmPUuP3iY97c6j";
                                if (!zA0r) {
                                    if (abstractC3075jEA0E.A0m()) {
                                        view = abstractC3075jEA0E.A0H;
                                        if (A0A[4].charAt(3) == 'b') {
                                            String[] strArr5 = A0A;
                                            strArr5[5] = "ymmTOXtQojU6rRVoJMbBfUBDtyf096Lh";
                                            strArr5[3] = "VCdUEMmmzbvfUZbBbNepcELfQrdDFyYX";
                                            layoutParams = view.getLayoutParams();
                                            if (layoutParams == null) {
                                                c3058ix = (C3058ix) this.A08.generateDefaultLayoutParams();
                                                abstractC3075jEA0E.A0H.setLayoutParams(c3058ix);
                                            } else if (!this.A08.checkLayoutParams(layoutParams)) {
                                                layoutParamsGenerateLayoutParams = this.A08.generateLayoutParams(layoutParams);
                                                strArr3 = A0A;
                                                if (strArr3[2].charAt(0) == strArr3[1].charAt(0)) {
                                                    String[] strArr6 = A0A;
                                                    strArr6[2] = "kqh2PWeHxAL2DpvJL4iRMn0O7hIhaGbv";
                                                    strArr6[1] = "kmhB7ilmrFE2abkLd0sKBmmWm2mWDiPj";
                                                    c3058ix = (C3058ix) layoutParamsGenerateLayoutParams;
                                                    abstractC3075jEA0E.A0H.setLayoutParams(c3058ix);
                                                }
                                            } else {
                                                c3058ix = (C3058ix) layoutParams;
                                            }
                                            c3058ix.A00 = abstractC3075jEA0E;
                                            c3058ix.A02 = !z2 && zA0D;
                                            return abstractC3075jEA0E;
                                        }
                                    }
                                }
                            } else if (!zA0r) {
                                if (abstractC3075jEA0E.A0m()) {
                                    view = abstractC3075jEA0E.A0H;
                                    if (A0A[4].charAt(3) == 'b') {
                                        String[] strArr7 = A0A;
                                        strArr7[5] = "ymmTOXtQojU6rRVoJMbBfUBDtyf096Lh";
                                        strArr7[3] = "VCdUEMmmzbvfUZbBbNepcELfQrdDFyYX";
                                        layoutParams = view.getLayoutParams();
                                        if (layoutParams == null) {
                                            c3058ix = (C3058ix) this.A08.generateDefaultLayoutParams();
                                            abstractC3075jEA0E.A0H.setLayoutParams(c3058ix);
                                        } else if (!this.A08.checkLayoutParams(layoutParams)) {
                                            layoutParamsGenerateLayoutParams = this.A08.generateLayoutParams(layoutParams);
                                            strArr3 = A0A;
                                            if (strArr3[2].charAt(0) == strArr3[1].charAt(0)) {
                                                String[] strArr8 = A0A;
                                                strArr8[2] = "kqh2PWeHxAL2DpvJL4iRMn0O7hIhaGbv";
                                                strArr8[1] = "kmhB7ilmrFE2abkLd0sKBmmWm2mWDiPj";
                                                c3058ix = (C3058ix) layoutParamsGenerateLayoutParams;
                                                abstractC3075jEA0E.A0H.setLayoutParams(c3058ix);
                                            }
                                        } else {
                                            c3058ix = (C3058ix) layoutParams;
                                        }
                                        c3058ix.A00 = abstractC3075jEA0E;
                                        c3058ix.A02 = !z2 && zA0D;
                                        return abstractC3075jEA0E;
                                    }
                                }
                            }
                            iA0D = this.A08.A00.A0D(i);
                            strArr = A0A;
                            if (strArr[5].charAt(0) != strArr[3].charAt(0)) {
                                String[] strArr9 = A0A;
                                strArr9[7] = "X7QTRdk7uAM61axx4OEln6Aqdeva9JgC";
                                strArr9[6] = "2m6xaCXVB1m17nX7qirmFmeuDGGSO6lD";
                                zA0D = A0D(abstractC3075jEA0E, iA0D, i, j);
                                view = abstractC3075jEA0E.A0H;
                                if (A0A[4].charAt(3) == 'b') {
                                    String[] strArr10 = A0A;
                                    strArr10[5] = "ymmTOXtQojU6rRVoJMbBfUBDtyf096Lh";
                                    strArr10[3] = "VCdUEMmmzbvfUZbBbNepcELfQrdDFyYX";
                                    layoutParams = view.getLayoutParams();
                                    if (layoutParams == null) {
                                        c3058ix = (C3058ix) this.A08.generateDefaultLayoutParams();
                                        abstractC3075jEA0E.A0H.setLayoutParams(c3058ix);
                                    } else if (!this.A08.checkLayoutParams(layoutParams)) {
                                        layoutParamsGenerateLayoutParams = this.A08.generateLayoutParams(layoutParams);
                                        strArr3 = A0A;
                                        if (strArr3[2].charAt(0) == strArr3[1].charAt(0)) {
                                            String[] strArr11 = A0A;
                                            strArr11[2] = "kqh2PWeHxAL2DpvJL4iRMn0O7hIhaGbv";
                                            strArr11[1] = "kmhB7ilmrFE2abkLd0sKBmmWm2mWDiPj";
                                            c3058ix = (C3058ix) layoutParamsGenerateLayoutParams;
                                            abstractC3075jEA0E.A0H.setLayoutParams(c3058ix);
                                        }
                                    } else {
                                        c3058ix = (C3058ix) layoutParams;
                                    }
                                    c3058ix.A00 = abstractC3075jEA0E;
                                    c3058ix.A02 = !z2 && zA0D;
                                    return abstractC3075jEA0E;
                                }
                            }
                        } else {
                            iA0D = this.A08.A00.A0D(i);
                            strArr = A0A;
                            if (strArr[5].charAt(0) != strArr[3].charAt(0)) {
                                String[] strArr12 = A0A;
                                strArr12[7] = "X7QTRdk7uAM61axx4OEln6Aqdeva9JgC";
                                strArr12[6] = "2m6xaCXVB1m17nX7qirmFmeuDGGSO6lD";
                                zA0D = A0D(abstractC3075jEA0E, iA0D, i, j);
                                view = abstractC3075jEA0E.A0H;
                                if (A0A[4].charAt(3) == 'b') {
                                    String[] strArr13 = A0A;
                                    strArr13[5] = "ymmTOXtQojU6rRVoJMbBfUBDtyf096Lh";
                                    strArr13[3] = "VCdUEMmmzbvfUZbBbNepcELfQrdDFyYX";
                                    layoutParams = view.getLayoutParams();
                                    if (layoutParams == null) {
                                        c3058ix = (C3058ix) this.A08.generateDefaultLayoutParams();
                                        abstractC3075jEA0E.A0H.setLayoutParams(c3058ix);
                                    } else if (!this.A08.checkLayoutParams(layoutParams)) {
                                        layoutParamsGenerateLayoutParams = this.A08.generateLayoutParams(layoutParams);
                                        strArr3 = A0A;
                                        if (strArr3[2].charAt(0) == strArr3[1].charAt(0)) {
                                            String[] strArr14 = A0A;
                                            strArr14[2] = "kqh2PWeHxAL2DpvJL4iRMn0O7hIhaGbv";
                                            strArr14[1] = "kmhB7ilmrFE2abkLd0sKBmmWm2mWDiPj";
                                            c3058ix = (C3058ix) layoutParamsGenerateLayoutParams;
                                            abstractC3075jEA0E.A0H.setLayoutParams(c3058ix);
                                        }
                                    } else {
                                        c3058ix = (C3058ix) layoutParams;
                                    }
                                    c3058ix.A00 = abstractC3075jEA0E;
                                    c3058ix.A02 = !z2 && zA0D;
                                    return abstractC3075jEA0E;
                                }
                            }
                        }
                    } else if (abstractC3075jEA0E.A0l()) {
                        zA0r = abstractC3075jEA0E.A0r();
                        strArr2 = A0A;
                        if (strArr2[7].charAt(8) != strArr2[6].charAt(8)) {
                            A0A[0] = "CFgmPUuP3iY97c6j";
                            if (!zA0r) {
                                if (abstractC3075jEA0E.A0m()) {
                                    view = abstractC3075jEA0E.A0H;
                                    if (A0A[4].charAt(3) == 'b') {
                                        String[] strArr15 = A0A;
                                        strArr15[5] = "ymmTOXtQojU6rRVoJMbBfUBDtyf096Lh";
                                        strArr15[3] = "VCdUEMmmzbvfUZbBbNepcELfQrdDFyYX";
                                        layoutParams = view.getLayoutParams();
                                        if (layoutParams == null) {
                                            c3058ix = (C3058ix) this.A08.generateDefaultLayoutParams();
                                            abstractC3075jEA0E.A0H.setLayoutParams(c3058ix);
                                        } else if (!this.A08.checkLayoutParams(layoutParams)) {
                                            layoutParamsGenerateLayoutParams = this.A08.generateLayoutParams(layoutParams);
                                            strArr3 = A0A;
                                            if (strArr3[2].charAt(0) == strArr3[1].charAt(0)) {
                                                String[] strArr16 = A0A;
                                                strArr16[2] = "kqh2PWeHxAL2DpvJL4iRMn0O7hIhaGbv";
                                                strArr16[1] = "kmhB7ilmrFE2abkLd0sKBmmWm2mWDiPj";
                                                c3058ix = (C3058ix) layoutParamsGenerateLayoutParams;
                                                abstractC3075jEA0E.A0H.setLayoutParams(c3058ix);
                                            }
                                        } else {
                                            c3058ix = (C3058ix) layoutParams;
                                        }
                                        c3058ix.A00 = abstractC3075jEA0E;
                                        c3058ix.A02 = !z2 && zA0D;
                                        return abstractC3075jEA0E;
                                    }
                                }
                            }
                        } else if (!zA0r) {
                            if (abstractC3075jEA0E.A0m()) {
                                view = abstractC3075jEA0E.A0H;
                                if (A0A[4].charAt(3) == 'b') {
                                    String[] strArr17 = A0A;
                                    strArr17[5] = "ymmTOXtQojU6rRVoJMbBfUBDtyf096Lh";
                                    strArr17[3] = "VCdUEMmmzbvfUZbBbNepcELfQrdDFyYX";
                                    layoutParams = view.getLayoutParams();
                                    if (layoutParams == null) {
                                        c3058ix = (C3058ix) this.A08.generateDefaultLayoutParams();
                                        abstractC3075jEA0E.A0H.setLayoutParams(c3058ix);
                                    } else if (!this.A08.checkLayoutParams(layoutParams)) {
                                        layoutParamsGenerateLayoutParams = this.A08.generateLayoutParams(layoutParams);
                                        strArr3 = A0A;
                                        if (strArr3[2].charAt(0) == strArr3[1].charAt(0)) {
                                            String[] strArr18 = A0A;
                                            strArr18[2] = "kqh2PWeHxAL2DpvJL4iRMn0O7hIhaGbv";
                                            strArr18[1] = "kmhB7ilmrFE2abkLd0sKBmmWm2mWDiPj";
                                            c3058ix = (C3058ix) layoutParamsGenerateLayoutParams;
                                            abstractC3075jEA0E.A0H.setLayoutParams(c3058ix);
                                        }
                                    } else {
                                        c3058ix = (C3058ix) layoutParams;
                                    }
                                    c3058ix.A00 = abstractC3075jEA0E;
                                    c3058ix.A02 = !z2 && zA0D;
                                    return abstractC3075jEA0E;
                                }
                            }
                        }
                        iA0D = this.A08.A00.A0D(i);
                        strArr = A0A;
                        if (strArr[5].charAt(0) != strArr[3].charAt(0)) {
                            String[] strArr19 = A0A;
                            strArr19[7] = "X7QTRdk7uAM61axx4OEln6Aqdeva9JgC";
                            strArr19[6] = "2m6xaCXVB1m17nX7qirmFmeuDGGSO6lD";
                            zA0D = A0D(abstractC3075jEA0E, iA0D, i, j);
                            view = abstractC3075jEA0E.A0H;
                            if (A0A[4].charAt(3) == 'b') {
                                String[] strArr110 = A0A;
                                strArr110[5] = "ymmTOXtQojU6rRVoJMbBfUBDtyf096Lh";
                                strArr110[3] = "VCdUEMmmzbvfUZbBbNepcELfQrdDFyYX";
                                layoutParams = view.getLayoutParams();
                                if (layoutParams == null) {
                                    c3058ix = (C3058ix) this.A08.generateDefaultLayoutParams();
                                    abstractC3075jEA0E.A0H.setLayoutParams(c3058ix);
                                } else if (!this.A08.checkLayoutParams(layoutParams)) {
                                    layoutParamsGenerateLayoutParams = this.A08.generateLayoutParams(layoutParams);
                                    strArr3 = A0A;
                                    if (strArr3[2].charAt(0) == strArr3[1].charAt(0)) {
                                        String[] strArr111 = A0A;
                                        strArr111[2] = "kqh2PWeHxAL2DpvJL4iRMn0O7hIhaGbv";
                                        strArr111[1] = "kmhB7ilmrFE2abkLd0sKBmmWm2mWDiPj";
                                        c3058ix = (C3058ix) layoutParamsGenerateLayoutParams;
                                        abstractC3075jEA0E.A0H.setLayoutParams(c3058ix);
                                    }
                                } else {
                                    c3058ix = (C3058ix) layoutParams;
                                }
                                c3058ix.A00 = abstractC3075jEA0E;
                                c3058ix.A02 = !z2 && zA0D;
                                return abstractC3075jEA0E;
                            }
                        }
                    } else {
                        iA0D = this.A08.A00.A0D(i);
                        strArr = A0A;
                        if (strArr[5].charAt(0) != strArr[3].charAt(0)) {
                            String[] strArr112 = A0A;
                            strArr112[7] = "X7QTRdk7uAM61axx4OEln6Aqdeva9JgC";
                            strArr112[6] = "2m6xaCXVB1m17nX7qirmFmeuDGGSO6lD";
                            zA0D = A0D(abstractC3075jEA0E, iA0D, i, j);
                            view = abstractC3075jEA0E.A0H;
                            if (A0A[4].charAt(3) == 'b') {
                                String[] strArr113 = A0A;
                                strArr113[5] = "ymmTOXtQojU6rRVoJMbBfUBDtyf096Lh";
                                strArr113[3] = "VCdUEMmmzbvfUZbBbNepcELfQrdDFyYX";
                                layoutParams = view.getLayoutParams();
                                if (layoutParams == null) {
                                    c3058ix = (C3058ix) this.A08.generateDefaultLayoutParams();
                                    abstractC3075jEA0E.A0H.setLayoutParams(c3058ix);
                                } else if (!this.A08.checkLayoutParams(layoutParams)) {
                                    layoutParamsGenerateLayoutParams = this.A08.generateLayoutParams(layoutParams);
                                    strArr3 = A0A;
                                    if (strArr3[2].charAt(0) == strArr3[1].charAt(0)) {
                                        String[] strArr114 = A0A;
                                        strArr114[2] = "kqh2PWeHxAL2DpvJL4iRMn0O7hIhaGbv";
                                        strArr114[1] = "kmhB7ilmrFE2abkLd0sKBmmWm2mWDiPj";
                                        c3058ix = (C3058ix) layoutParamsGenerateLayoutParams;
                                        abstractC3075jEA0E.A0H.setLayoutParams(c3058ix);
                                    }
                                } else {
                                    c3058ix = (C3058ix) layoutParams;
                                }
                                c3058ix.A00 = abstractC3075jEA0E;
                                c3058ix.A02 = !z2 && zA0D;
                                return abstractC3075jEA0E;
                            }
                        }
                    }
                } else {
                    if (z2) {
                        abstractC3075jEA0E.A0f(0, 8192);
                        if (this.A08.A0s.A0C) {
                            int changeFlags2 = AbstractC3053is.A06(abstractC3075jEA0E);
                            C3052ir info2 = this.A08.A05.A0F(this.A08.A0s, abstractC3075jEA0E, changeFlags2 | 4096, abstractC3075jEA0E.A0W());
                            this.A08.A1r(abstractC3075jEA0E, info2);
                        }
                    }
                    zA0D = false;
                    if (!this.A08.A0s.A07()) {
                        if (abstractC3075jEA0E.A0l()) {
                            zA0r = abstractC3075jEA0E.A0r();
                            strArr2 = A0A;
                            if (strArr2[7].charAt(8) != strArr2[6].charAt(8)) {
                                A0A[0] = "CFgmPUuP3iY97c6j";
                                if (!zA0r) {
                                    if (abstractC3075jEA0E.A0m()) {
                                        view = abstractC3075jEA0E.A0H;
                                        if (A0A[4].charAt(3) == 'b') {
                                            String[] strArr115 = A0A;
                                            strArr115[5] = "ymmTOXtQojU6rRVoJMbBfUBDtyf096Lh";
                                            strArr115[3] = "VCdUEMmmzbvfUZbBbNepcELfQrdDFyYX";
                                            layoutParams = view.getLayoutParams();
                                            if (layoutParams == null) {
                                                c3058ix = (C3058ix) this.A08.generateDefaultLayoutParams();
                                                abstractC3075jEA0E.A0H.setLayoutParams(c3058ix);
                                            } else if (!this.A08.checkLayoutParams(layoutParams)) {
                                                layoutParamsGenerateLayoutParams = this.A08.generateLayoutParams(layoutParams);
                                                strArr3 = A0A;
                                                if (strArr3[2].charAt(0) == strArr3[1].charAt(0)) {
                                                    String[] strArr116 = A0A;
                                                    strArr116[2] = "kqh2PWeHxAL2DpvJL4iRMn0O7hIhaGbv";
                                                    strArr116[1] = "kmhB7ilmrFE2abkLd0sKBmmWm2mWDiPj";
                                                    c3058ix = (C3058ix) layoutParamsGenerateLayoutParams;
                                                    abstractC3075jEA0E.A0H.setLayoutParams(c3058ix);
                                                }
                                            } else {
                                                c3058ix = (C3058ix) layoutParams;
                                            }
                                            c3058ix.A00 = abstractC3075jEA0E;
                                            c3058ix.A02 = !z2 && zA0D;
                                            return abstractC3075jEA0E;
                                        }
                                    }
                                }
                            } else if (!zA0r) {
                                if (abstractC3075jEA0E.A0m()) {
                                    view = abstractC3075jEA0E.A0H;
                                    if (A0A[4].charAt(3) == 'b') {
                                        String[] strArr117 = A0A;
                                        strArr117[5] = "ymmTOXtQojU6rRVoJMbBfUBDtyf096Lh";
                                        strArr117[3] = "VCdUEMmmzbvfUZbBbNepcELfQrdDFyYX";
                                        layoutParams = view.getLayoutParams();
                                        if (layoutParams == null) {
                                            c3058ix = (C3058ix) this.A08.generateDefaultLayoutParams();
                                            abstractC3075jEA0E.A0H.setLayoutParams(c3058ix);
                                        } else if (!this.A08.checkLayoutParams(layoutParams)) {
                                            layoutParamsGenerateLayoutParams = this.A08.generateLayoutParams(layoutParams);
                                            strArr3 = A0A;
                                            if (strArr3[2].charAt(0) == strArr3[1].charAt(0)) {
                                                String[] strArr118 = A0A;
                                                strArr118[2] = "kqh2PWeHxAL2DpvJL4iRMn0O7hIhaGbv";
                                                strArr118[1] = "kmhB7ilmrFE2abkLd0sKBmmWm2mWDiPj";
                                                c3058ix = (C3058ix) layoutParamsGenerateLayoutParams;
                                                abstractC3075jEA0E.A0H.setLayoutParams(c3058ix);
                                            }
                                        } else {
                                            c3058ix = (C3058ix) layoutParams;
                                        }
                                        c3058ix.A00 = abstractC3075jEA0E;
                                        c3058ix.A02 = !z2 && zA0D;
                                        return abstractC3075jEA0E;
                                    }
                                }
                            }
                            iA0D = this.A08.A00.A0D(i);
                            strArr = A0A;
                            if (strArr[5].charAt(0) != strArr[3].charAt(0)) {
                                String[] strArr119 = A0A;
                                strArr119[7] = "X7QTRdk7uAM61axx4OEln6Aqdeva9JgC";
                                strArr119[6] = "2m6xaCXVB1m17nX7qirmFmeuDGGSO6lD";
                                zA0D = A0D(abstractC3075jEA0E, iA0D, i, j);
                                view = abstractC3075jEA0E.A0H;
                                if (A0A[4].charAt(3) == 'b') {
                                    String[] strArr1110 = A0A;
                                    strArr1110[5] = "ymmTOXtQojU6rRVoJMbBfUBDtyf096Lh";
                                    strArr1110[3] = "VCdUEMmmzbvfUZbBbNepcELfQrdDFyYX";
                                    layoutParams = view.getLayoutParams();
                                    if (layoutParams == null) {
                                        c3058ix = (C3058ix) this.A08.generateDefaultLayoutParams();
                                        abstractC3075jEA0E.A0H.setLayoutParams(c3058ix);
                                    } else if (!this.A08.checkLayoutParams(layoutParams)) {
                                        layoutParamsGenerateLayoutParams = this.A08.generateLayoutParams(layoutParams);
                                        strArr3 = A0A;
                                        if (strArr3[2].charAt(0) == strArr3[1].charAt(0)) {
                                            String[] strArr1111 = A0A;
                                            strArr1111[2] = "kqh2PWeHxAL2DpvJL4iRMn0O7hIhaGbv";
                                            strArr1111[1] = "kmhB7ilmrFE2abkLd0sKBmmWm2mWDiPj";
                                            c3058ix = (C3058ix) layoutParamsGenerateLayoutParams;
                                            abstractC3075jEA0E.A0H.setLayoutParams(c3058ix);
                                        }
                                    } else {
                                        c3058ix = (C3058ix) layoutParams;
                                    }
                                    c3058ix.A00 = abstractC3075jEA0E;
                                    c3058ix.A02 = !z2 && zA0D;
                                    return abstractC3075jEA0E;
                                }
                            }
                        } else {
                            iA0D = this.A08.A00.A0D(i);
                            strArr = A0A;
                            if (strArr[5].charAt(0) != strArr[3].charAt(0)) {
                                String[] strArr1112 = A0A;
                                strArr1112[7] = "X7QTRdk7uAM61axx4OEln6Aqdeva9JgC";
                                strArr1112[6] = "2m6xaCXVB1m17nX7qirmFmeuDGGSO6lD";
                                zA0D = A0D(abstractC3075jEA0E, iA0D, i, j);
                                view = abstractC3075jEA0E.A0H;
                                if (A0A[4].charAt(3) == 'b') {
                                    String[] strArr1113 = A0A;
                                    strArr1113[5] = "ymmTOXtQojU6rRVoJMbBfUBDtyf096Lh";
                                    strArr1113[3] = "VCdUEMmmzbvfUZbBbNepcELfQrdDFyYX";
                                    layoutParams = view.getLayoutParams();
                                    if (layoutParams == null) {
                                        c3058ix = (C3058ix) this.A08.generateDefaultLayoutParams();
                                        abstractC3075jEA0E.A0H.setLayoutParams(c3058ix);
                                    } else if (!this.A08.checkLayoutParams(layoutParams)) {
                                        layoutParamsGenerateLayoutParams = this.A08.generateLayoutParams(layoutParams);
                                        strArr3 = A0A;
                                        if (strArr3[2].charAt(0) == strArr3[1].charAt(0)) {
                                            String[] strArr1114 = A0A;
                                            strArr1114[2] = "kqh2PWeHxAL2DpvJL4iRMn0O7hIhaGbv";
                                            strArr1114[1] = "kmhB7ilmrFE2abkLd0sKBmmWm2mWDiPj";
                                            c3058ix = (C3058ix) layoutParamsGenerateLayoutParams;
                                            abstractC3075jEA0E.A0H.setLayoutParams(c3058ix);
                                        }
                                    } else {
                                        c3058ix = (C3058ix) layoutParams;
                                    }
                                    c3058ix.A00 = abstractC3075jEA0E;
                                    c3058ix.A02 = !z2 && zA0D;
                                    return abstractC3075jEA0E;
                                }
                            }
                        }
                    } else if (abstractC3075jEA0E.A0l()) {
                        zA0r = abstractC3075jEA0E.A0r();
                        strArr2 = A0A;
                        if (strArr2[7].charAt(8) != strArr2[6].charAt(8)) {
                            A0A[0] = "CFgmPUuP3iY97c6j";
                            if (!zA0r) {
                                if (abstractC3075jEA0E.A0m()) {
                                    view = abstractC3075jEA0E.A0H;
                                    if (A0A[4].charAt(3) == 'b') {
                                        String[] strArr1115 = A0A;
                                        strArr1115[5] = "ymmTOXtQojU6rRVoJMbBfUBDtyf096Lh";
                                        strArr1115[3] = "VCdUEMmmzbvfUZbBbNepcELfQrdDFyYX";
                                        layoutParams = view.getLayoutParams();
                                        if (layoutParams == null) {
                                            c3058ix = (C3058ix) this.A08.generateDefaultLayoutParams();
                                            abstractC3075jEA0E.A0H.setLayoutParams(c3058ix);
                                        } else if (!this.A08.checkLayoutParams(layoutParams)) {
                                            layoutParamsGenerateLayoutParams = this.A08.generateLayoutParams(layoutParams);
                                            strArr3 = A0A;
                                            if (strArr3[2].charAt(0) == strArr3[1].charAt(0)) {
                                                String[] strArr1116 = A0A;
                                                strArr1116[2] = "kqh2PWeHxAL2DpvJL4iRMn0O7hIhaGbv";
                                                strArr1116[1] = "kmhB7ilmrFE2abkLd0sKBmmWm2mWDiPj";
                                                c3058ix = (C3058ix) layoutParamsGenerateLayoutParams;
                                                abstractC3075jEA0E.A0H.setLayoutParams(c3058ix);
                                            }
                                        } else {
                                            c3058ix = (C3058ix) layoutParams;
                                        }
                                        c3058ix.A00 = abstractC3075jEA0E;
                                        c3058ix.A02 = !z2 && zA0D;
                                        return abstractC3075jEA0E;
                                    }
                                }
                            }
                        } else if (!zA0r) {
                            if (abstractC3075jEA0E.A0m()) {
                                view = abstractC3075jEA0E.A0H;
                                if (A0A[4].charAt(3) == 'b') {
                                    String[] strArr1117 = A0A;
                                    strArr1117[5] = "ymmTOXtQojU6rRVoJMbBfUBDtyf096Lh";
                                    strArr1117[3] = "VCdUEMmmzbvfUZbBbNepcELfQrdDFyYX";
                                    layoutParams = view.getLayoutParams();
                                    if (layoutParams == null) {
                                        c3058ix = (C3058ix) this.A08.generateDefaultLayoutParams();
                                        abstractC3075jEA0E.A0H.setLayoutParams(c3058ix);
                                    } else if (!this.A08.checkLayoutParams(layoutParams)) {
                                        layoutParamsGenerateLayoutParams = this.A08.generateLayoutParams(layoutParams);
                                        strArr3 = A0A;
                                        if (strArr3[2].charAt(0) == strArr3[1].charAt(0)) {
                                            String[] strArr1118 = A0A;
                                            strArr1118[2] = "kqh2PWeHxAL2DpvJL4iRMn0O7hIhaGbv";
                                            strArr1118[1] = "kmhB7ilmrFE2abkLd0sKBmmWm2mWDiPj";
                                            c3058ix = (C3058ix) layoutParamsGenerateLayoutParams;
                                            abstractC3075jEA0E.A0H.setLayoutParams(c3058ix);
                                        }
                                    } else {
                                        c3058ix = (C3058ix) layoutParams;
                                    }
                                    c3058ix.A00 = abstractC3075jEA0E;
                                    c3058ix.A02 = !z2 && zA0D;
                                    return abstractC3075jEA0E;
                                }
                            }
                        }
                        iA0D = this.A08.A00.A0D(i);
                        strArr = A0A;
                        if (strArr[5].charAt(0) != strArr[3].charAt(0)) {
                            String[] strArr1119 = A0A;
                            strArr1119[7] = "X7QTRdk7uAM61axx4OEln6Aqdeva9JgC";
                            strArr1119[6] = "2m6xaCXVB1m17nX7qirmFmeuDGGSO6lD";
                            zA0D = A0D(abstractC3075jEA0E, iA0D, i, j);
                            view = abstractC3075jEA0E.A0H;
                            if (A0A[4].charAt(3) == 'b') {
                                String[] strArr11110 = A0A;
                                strArr11110[5] = "ymmTOXtQojU6rRVoJMbBfUBDtyf096Lh";
                                strArr11110[3] = "VCdUEMmmzbvfUZbBbNepcELfQrdDFyYX";
                                layoutParams = view.getLayoutParams();
                                if (layoutParams == null) {
                                    c3058ix = (C3058ix) this.A08.generateDefaultLayoutParams();
                                    abstractC3075jEA0E.A0H.setLayoutParams(c3058ix);
                                } else if (!this.A08.checkLayoutParams(layoutParams)) {
                                    layoutParamsGenerateLayoutParams = this.A08.generateLayoutParams(layoutParams);
                                    strArr3 = A0A;
                                    if (strArr3[2].charAt(0) == strArr3[1].charAt(0)) {
                                        String[] strArr11111 = A0A;
                                        strArr11111[2] = "kqh2PWeHxAL2DpvJL4iRMn0O7hIhaGbv";
                                        strArr11111[1] = "kmhB7ilmrFE2abkLd0sKBmmWm2mWDiPj";
                                        c3058ix = (C3058ix) layoutParamsGenerateLayoutParams;
                                        abstractC3075jEA0E.A0H.setLayoutParams(c3058ix);
                                    }
                                } else {
                                    c3058ix = (C3058ix) layoutParams;
                                }
                                c3058ix.A00 = abstractC3075jEA0E;
                                c3058ix.A02 = !z2 && zA0D;
                                return abstractC3075jEA0E;
                            }
                        }
                    } else {
                        iA0D = this.A08.A00.A0D(i);
                        strArr = A0A;
                        if (strArr[5].charAt(0) != strArr[3].charAt(0)) {
                            String[] strArr11112 = A0A;
                            strArr11112[7] = "X7QTRdk7uAM61axx4OEln6Aqdeva9JgC";
                            strArr11112[6] = "2m6xaCXVB1m17nX7qirmFmeuDGGSO6lD";
                            zA0D = A0D(abstractC3075jEA0E, iA0D, i, j);
                            view = abstractC3075jEA0E.A0H;
                            if (A0A[4].charAt(3) == 'b') {
                                String[] strArr11113 = A0A;
                                strArr11113[5] = "ymmTOXtQojU6rRVoJMbBfUBDtyf096Lh";
                                strArr11113[3] = "VCdUEMmmzbvfUZbBbNepcELfQrdDFyYX";
                                layoutParams = view.getLayoutParams();
                                if (layoutParams == null) {
                                    c3058ix = (C3058ix) this.A08.generateDefaultLayoutParams();
                                    abstractC3075jEA0E.A0H.setLayoutParams(c3058ix);
                                } else if (!this.A08.checkLayoutParams(layoutParams)) {
                                    layoutParamsGenerateLayoutParams = this.A08.generateLayoutParams(layoutParams);
                                    strArr3 = A0A;
                                    if (strArr3[2].charAt(0) == strArr3[1].charAt(0)) {
                                        String[] strArr11114 = A0A;
                                        strArr11114[2] = "kqh2PWeHxAL2DpvJL4iRMn0O7hIhaGbv";
                                        strArr11114[1] = "kmhB7ilmrFE2abkLd0sKBmmWm2mWDiPj";
                                        c3058ix = (C3058ix) layoutParamsGenerateLayoutParams;
                                        abstractC3075jEA0E.A0H.setLayoutParams(c3058ix);
                                    }
                                } else {
                                    c3058ix = (C3058ix) layoutParams;
                                }
                                c3058ix.A00 = abstractC3075jEA0E;
                                c3058ix.A02 = !z2 && zA0D;
                                return abstractC3075jEA0E;
                            }
                        }
                    }
                }
            } else {
                if (z2 && !this.A08.A0s.A07() && abstractC3075jEA0E.A0v(8192)) {
                    abstractC3075jEA0E.A0f(0, 8192);
                    if (this.A08.A0s.A0C) {
                        int changeFlags3 = AbstractC3053is.A06(abstractC3075jEA0E);
                        C3052ir info3 = this.A08.A05.A0F(this.A08.A0s, abstractC3075jEA0E, changeFlags3 | 4096, abstractC3075jEA0E.A0W());
                        this.A08.A1r(abstractC3075jEA0E, info3);
                    }
                }
                zA0D = false;
                if (!this.A08.A0s.A07() && abstractC3075jEA0E.A0l()) {
                    abstractC3075jEA0E.A04 = i;
                } else if (abstractC3075jEA0E.A0l()) {
                    zA0r = abstractC3075jEA0E.A0r();
                    strArr2 = A0A;
                    if (strArr2[7].charAt(8) != strArr2[6].charAt(8)) {
                        A0A[0] = "CFgmPUuP3iY97c6j";
                        if (!zA0r) {
                            if (abstractC3075jEA0E.A0m()) {
                            }
                        }
                    } else if (!zA0r) {
                        if (abstractC3075jEA0E.A0m()) {
                        }
                    }
                    iA0D = this.A08.A00.A0D(i);
                    strArr = A0A;
                    if (strArr[5].charAt(0) != strArr[3].charAt(0)) {
                        String[] strArr11115 = A0A;
                        strArr11115[7] = "X7QTRdk7uAM61axx4OEln6Aqdeva9JgC";
                        strArr11115[6] = "2m6xaCXVB1m17nX7qirmFmeuDGGSO6lD";
                        zA0D = A0D(abstractC3075jEA0E, iA0D, i, j);
                    }
                } else {
                    iA0D = this.A08.A00.A0D(i);
                    strArr = A0A;
                    if (strArr[5].charAt(0) != strArr[3].charAt(0)) {
                        String[] strArr11116 = A0A;
                        strArr11116[7] = "X7QTRdk7uAM61axx4OEln6Aqdeva9JgC";
                        strArr11116[6] = "2m6xaCXVB1m17nX7qirmFmeuDGGSO6lD";
                        zA0D = A0D(abstractC3075jEA0E, iA0D, i, j);
                    }
                }
                view = abstractC3075jEA0E.A0H;
                if (A0A[4].charAt(3) == 'b') {
                    String[] strArr11117 = A0A;
                    strArr11117[5] = "ymmTOXtQojU6rRVoJMbBfUBDtyf096Lh";
                    strArr11117[3] = "VCdUEMmmzbvfUZbBbNepcELfQrdDFyYX";
                    layoutParams = view.getLayoutParams();
                    if (layoutParams == null) {
                        c3058ix = (C3058ix) this.A08.generateDefaultLayoutParams();
                        abstractC3075jEA0E.A0H.setLayoutParams(c3058ix);
                    } else if (!this.A08.checkLayoutParams(layoutParams)) {
                        layoutParamsGenerateLayoutParams = this.A08.generateLayoutParams(layoutParams);
                        strArr3 = A0A;
                        if (strArr3[2].charAt(0) == strArr3[1].charAt(0)) {
                            String[] strArr11118 = A0A;
                            strArr11118[2] = "kqh2PWeHxAL2DpvJL4iRMn0O7hIhaGbv";
                            strArr11118[1] = "kmhB7ilmrFE2abkLd0sKBmmWm2mWDiPj";
                            c3058ix = (C3058ix) layoutParamsGenerateLayoutParams;
                            abstractC3075jEA0E.A0H.setLayoutParams(c3058ix);
                        }
                    } else {
                        c3058ix = (C3058ix) layoutParams;
                    }
                    c3058ix.A00 = abstractC3075jEA0E;
                    c3058ix.A02 = !z2 && zA0D;
                    return abstractC3075jEA0E;
                }
            }
            throw new RuntimeException();
        }
        throw new IndexOutOfBoundsException(A04(293, 22, 52) + i + A04(12, 1, 99) + i + A04(21, 14, 104) + this.A08.A0s.A03() + this.A08.A1L());
    }

    public final List<AbstractC3075jE> A0K() {
        return this.A07;
    }

    public final void A0L() {
        int size = this.A06.size();
        for (int i = 0; i < size; i++) {
            this.A06.get(i).A0X();
        }
        int i2 = this.A05.size();
        for (int scrapCount = 0; scrapCount < i2; scrapCount++) {
            this.A05.get(scrapCount).A0X();
        }
        ArrayList<AbstractC3075jE> arrayList = this.A02;
        String[] strArr = A0A;
        String str = strArr[2];
        String str2 = strArr[1];
        int scrapCount2 = str.charAt(0);
        int cachedCount = str2.charAt(0);
        if (scrapCount2 != cachedCount) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0A;
        strArr2[7] = "w7WcMXH384MQxArKBWq9tfOfmOANhXYh";
        strArr2[6] = "ji6HgViVTGyvfONq8Vqt8Uaju4D1iJHU";
        if (arrayList != null) {
            int changedScrapCount = this.A02.size();
            for (int scrapCount3 = 0; scrapCount3 < changedScrapCount; scrapCount3++) {
                this.A02.get(scrapCount3).A0X();
            }
        }
    }

    public final void A0M() {
        this.A05.clear();
        if (this.A02 != null) {
            this.A02.clear();
        }
    }

    public final void A0N() {
        int size = this.A06.size();
        for (int i = 0; i < size; i++) {
            C3058ix c3058ix = (C3058ix) this.A06.get(i).A0H.getLayoutParams();
            if (c3058ix != null) {
                c3058ix.A01 = true;
            }
        }
    }

    public final void A0O() {
        if (this.A08.A04 != null && this.A08.A04.A0O()) {
            int size = this.A06.size();
            for (int i = 0; i < size; i++) {
                AbstractC3075jE abstractC3075jE = this.A06.get(i);
                int i2 = A0A[0].length();
                if (i2 != 16) {
                    throw new RuntimeException();
                }
                String[] strArr = A0A;
                strArr[2] = "kx9etu5Uswf3mlSSd54JM5SDJxoMGNTv";
                strArr[1] = "kxxNK4Rys8aPJuu822sP3fs8sDM7v1G0";
                if (abstractC3075jE != null) {
                    abstractC3075jE.A0e(6);
                    abstractC3075jE.A0j(null);
                }
            }
            return;
        }
        A06();
    }

    public final void A0P() {
        int extraCache;
        if (this.A08.A06 != null) {
            AbstractC3057iw abstractC3057iw = this.A08.A06;
            if (A0A[0].length() == 16) {
                String[] strArr = A0A;
                strArr[2] = "kSelswvDf1EbxUzrii1mBr6dHJR0d4zj";
                strArr[1] = "kcuGN1lunmBh6z5P1vsNJWvgiUTpOK0Q";
                extraCache = abstractC3057iw.A00;
            }
            throw new RuntimeException();
        }
        extraCache = 0;
        this.A00 = this.A03 + extraCache;
        int extraCache2 = this.A06.size();
        for (int i = extraCache2 - 1; i >= 0; i--) {
            int size = this.A06.size();
            String[] strArr2 = A0A;
            String str = strArr2[2];
            String str2 = strArr2[1];
            int i2 = str.charAt(0);
            int extraCache3 = str2.charAt(0);
            if (i2 != extraCache3) {
                throw new RuntimeException();
            }
            String[] strArr3 = A0A;
            strArr3[2] = "kpxxdOz3cEfo3MLV8RPQuR2Jasv2n6jF";
            strArr3[1] = "kgO1H2GjmHeLX2ZusVi9gFRUJKE1zGI0";
            int extraCache4 = this.A00;
            if (size > extraCache4) {
                A07(i);
            } else {
                return;
            }
        }
    }

    public final void A0Q() {
        this.A05.clear();
        A06();
    }

    public final void A0R(int i) {
        this.A03 = i;
        A0P();
    }

    public final void A0S(int i, int i2) {
        int size = this.A06.size();
        for (int i3 = 0; i3 < size; i3++) {
            AbstractC3075jE abstractC3075jE = this.A06.get(i3);
            if (abstractC3075jE != null) {
                int cachedCount = abstractC3075jE.A03;
                if (cachedCount >= i) {
                    abstractC3075jE.A0h(i2, true);
                }
            }
        }
    }

    public final void A0T(int i, int i2) {
        int i3;
        int i4;
        int i5;
        if (i < i2) {
            i3 = i;
            i4 = i2;
            i5 = -1;
        } else {
            i3 = i2;
            i4 = i;
            i5 = 1;
        }
        int size = this.A06.size();
        for (int i6 = 0; i6 < size; i6++) {
            AbstractC3075jE abstractC3075jE = this.A06.get(i6);
            if (abstractC3075jE != null) {
                int start = abstractC3075jE.A03;
                if (start >= i3) {
                    int start2 = abstractC3075jE.A03;
                    if (start2 > i4) {
                        continue;
                    } else {
                        int i7 = abstractC3075jE.A03;
                        String[] strArr = A0A;
                        String str = strArr[5];
                        String str2 = strArr[3];
                        int end = str.charAt(0);
                        int start3 = str2.charAt(0);
                        if (end == start3) {
                            throw new RuntimeException();
                        }
                        String[] strArr2 = A0A;
                        strArr2[2] = "kvvW4F2OCwdEIl1qwIuxYVFpmp0ugJY5";
                        strArr2[1] = "kzcCp2wTfEGQm2KGuN32b5oIYABnQWPG";
                        if (i7 == i) {
                            int end2 = i2 - i;
                            abstractC3075jE.A0h(end2, false);
                        } else {
                            abstractC3075jE.A0h(i5, false);
                        }
                    }
                } else {
                    continue;
                }
            }
        }
    }

    public final void A0U(int i, int i2) {
        int positionEnd;
        int i3 = i + i2;
        for (int i4 = this.A06.size() - 1; i4 >= 0; i4--) {
            AbstractC3075jE abstractC3075jE = this.A06.get(i4);
            if (abstractC3075jE != null && (positionEnd = abstractC3075jE.A03) >= i && positionEnd < i3) {
                abstractC3075jE.A0e(2);
                A07(i4);
            }
        }
    }

    public final void A0V(int i, int i2, boolean z) {
        int i3 = i + i2;
        int removedEnd = this.A06.size();
        for (int i4 = removedEnd - 1; i4 >= 0; i4--) {
            AbstractC3075jE abstractC3075jE = this.A06.get(i4);
            if (abstractC3075jE != null) {
                int removedEnd2 = abstractC3075jE.A03;
                if (removedEnd2 >= i3) {
                    int removedEnd3 = -i2;
                    abstractC3075jE.A0h(removedEnd3, z);
                } else {
                    int removedEnd4 = abstractC3075jE.A03;
                    if (removedEnd4 >= i) {
                        abstractC3075jE.A0e(8);
                        A07(i4);
                    }
                }
            }
        }
    }

    public final void A0W(View view) {
        AbstractC3075jE abstractC3075jEA0F = C7O.A0F(view);
        abstractC3075jEA0F.A0F = null;
        abstractC3075jEA0F.A0G = false;
        abstractC3075jEA0F.A0Z();
        A0c(abstractC3075jEA0F);
    }

    public final void A0X(View view) {
        AbstractC3075jE abstractC3075jEA0F = C7O.A0F(view);
        if (abstractC3075jEA0F.A0v(12) || !abstractC3075jEA0F.A0q() || this.A08.A25(abstractC3075jEA0F)) {
            boolean zA0m = abstractC3075jEA0F.A0m();
            if (A0A[0].length() != 16) {
                throw new RuntimeException();
            }
            String[] strArr = A0A;
            strArr[5] = "cscHAR4ImnAFzAxZJ9yqjMNa91RcN8Vb";
            strArr[3] = "pspTzLDNU823NSI2ymIgIumCpfqVQlal";
            if (!zA0m || abstractC3075jEA0F.A0n() || this.A08.A04.A0O()) {
                abstractC3075jEA0F.A0i(this, false);
                this.A05.add(abstractC3075jEA0F);
                return;
            }
            throw new IllegalArgumentException(A04(65, Sdk.SDKError.Reason.INVALID_ADS_ENDPOINT_VALUE, Sdk.SDKError.Reason.PROTOBUF_SERIALIZATION_ERROR_VALUE) + this.A08.A1L());
        }
        if (this.A02 == null) {
            this.A02 = new ArrayList<>();
        }
        abstractC3075jEA0F.A0i(this, true);
        this.A02.add(abstractC3075jEA0F);
    }

    public final void A0Y(View view) {
        AbstractC3075jE abstractC3075jEA0F = C7O.A0F(view);
        if (abstractC3075jEA0F.A0p()) {
            this.A08.removeDetachedView(view, false);
        }
        if (abstractC3075jEA0F.A0o()) {
            abstractC3075jEA0F.A0d();
        } else if (abstractC3075jEA0F.A0t()) {
            abstractC3075jEA0F.A0Z();
        }
        A0c(abstractC3075jEA0F);
    }

    public final void A0Z(AbstractC3045ik abstractC3045ik, AbstractC3045ik abstractC3045ik2, boolean z) {
        A0Q();
        A0I().A08(abstractC3045ik, abstractC3045ik2, z);
    }

    public final void A0a(C3064j3 c3064j3) {
        if (this.A01 != null) {
            C3064j3 c3064j4 = this.A01;
            String[] strArr = A0A;
            if (strArr[7].charAt(8) == strArr[6].charAt(8)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0A;
            strArr2[5] = "eg5celMCH5XhNc8VzkIGx3YtNAPnP9H4";
            strArr2[3] = "1J6YUmXidV7MMEP0bzwuQdNnIs5cPq10";
            c3064j4.A04();
        }
        this.A01 = c3064j3;
        if (c3064j3 != null) {
            this.A01.A07(this.A08.getAdapter());
        }
    }

    public final void A0b(AbstractC3073jC abstractC3073jC) {
        this.A04 = abstractC3073jC;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:31:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:33:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:35:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:37:0x00d6 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:41:0x00e3 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:44:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:46:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:51:0x0113  */
    /* JADX WARN: Code duplicated, block: B:58:0x0128 A[LOOP:0: B:45:0x00f3->B:58:0x0128, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:59:0x012b  */
    /* JADX WARN: Code duplicated, block: B:62:0x0135  */
    /* JADX WARN: Code duplicated, block: B:68:0x0109 A[EDGE_INSN: B:68:0x0109->B:48:0x0109 BREAK  A[LOOP:0: B:45:0x00f3->B:58:0x0128], SYNTHETIC] */
    public final void A0c(AbstractC3075jE abstractC3075jE) {
        boolean transientStatePreventsRecycling;
        int i;
        String[] strArr;
        boolean transientStatePreventsRecycling2;
        int size;
        boolean transientStatePreventsRecycling3;
        boolean transientStatePreventsRecycling4;
        int i2;
        boolean transientStatePreventsRecycling5;
        if (abstractC3075jE.A0o() || abstractC3075jE.A0H.getParent() != null) {
            throw new IllegalArgumentException(A04(Sdk.SDKError.Reason.JSON_PARAMS_ENCODE_ERROR_VALUE, 56, 79) + abstractC3075jE.A0o() + A04(0, 12, 75) + (abstractC3075jE.A0H.getParent() != null) + this.A08.A1L());
        }
        boolean zA0p = abstractC3075jE.A0p();
        String[] strArr2 = A0A;
        if (strArr2[2].charAt(0) != strArr2[1].charAt(0)) {
            throw new RuntimeException();
        }
        A0A[4] = "QZZbfikyhDCMiV1imXgamooHNWBI4VfH";
        if (!zA0p) {
            if (abstractC3075jE.A0s()) {
                throw new IllegalArgumentException(A04(452, 110, 76) + this.A08.A1L());
            }
            boolean zA0K = abstractC3075jE.A0K();
            if (this.A08.A04 != null && zA0K) {
                boolean transientStatePreventsRecycling6 = this.A08.A04.A0P(abstractC3075jE);
                if (transientStatePreventsRecycling6) {
                    transientStatePreventsRecycling = true;
                } else {
                    transientStatePreventsRecycling = false;
                }
            } else {
                transientStatePreventsRecycling = false;
            }
            boolean z = false;
            boolean z2 = false;
            if (transientStatePreventsRecycling) {
                i = this.A00;
                strArr = A0A;
                if (strArr[2].charAt(0) != strArr[1].charAt(0)) {
                    A0A[4] = "JXkbPmQXP2BcwiEI3FqqjfiGok6rwhAB";
                    if (i > 0) {
                        transientStatePreventsRecycling2 = abstractC3075jE.A0v(IronSourceError.ERROR_CAPPED_PER_SESSION);
                        if (!transientStatePreventsRecycling2) {
                            size = this.A06.size();
                            if (size >= this.A00) {
                                A07(0);
                                size--;
                            }
                            transientStatePreventsRecycling3 = C7O.A1E;
                            if (transientStatePreventsRecycling3) {
                                transientStatePreventsRecycling4 = this.A08.A02.A05(abstractC3075jE.A03);
                                if (!transientStatePreventsRecycling4) {
                                    i2 = size - 1;
                                    while (i2 >= 0) {
                                        int targetCacheIndex = this.A06.get(i2).A03;
                                        transientStatePreventsRecycling5 = this.A08.A02.A05(targetCacheIndex);
                                        if (!transientStatePreventsRecycling5) {
                                            break;
                                            break;
                                        }
                                        i2--;
                                    }
                                    size = i2 + 1;
                                }
                            }
                            this.A06.add(size, abstractC3075jE);
                            z = true;
                        }
                    }
                } else {
                    A0A[4] = "iMRb6lH7bzEtCSJD4TfZYArDATXy6kqw";
                    if (i > 0) {
                        transientStatePreventsRecycling2 = abstractC3075jE.A0v(IronSourceError.ERROR_CAPPED_PER_SESSION);
                        if (!transientStatePreventsRecycling2) {
                            size = this.A06.size();
                            if (size >= this.A00) {
                                A07(0);
                                size--;
                            }
                            transientStatePreventsRecycling3 = C7O.A1E;
                            if (transientStatePreventsRecycling3) {
                                transientStatePreventsRecycling4 = this.A08.A02.A05(abstractC3075jE.A03);
                                if (!transientStatePreventsRecycling4) {
                                    i2 = size - 1;
                                    while (i2 >= 0) {
                                        int targetCacheIndex2 = this.A06.get(i2).A03;
                                        transientStatePreventsRecycling5 = this.A08.A02.A05(targetCacheIndex2);
                                        if (!transientStatePreventsRecycling5) {
                                            break;
                                            break;
                                        }
                                        i2--;
                                    }
                                    size = i2 + 1;
                                }
                            }
                            this.A06.add(size, abstractC3075jE);
                            z = true;
                        }
                    }
                }
                if (!z) {
                    A0e(abstractC3075jE, true);
                    z2 = true;
                }
            } else {
                boolean transientStatePreventsRecycling7 = abstractC3075jE.A0u();
                if (transientStatePreventsRecycling7) {
                    i = this.A00;
                    strArr = A0A;
                    if (strArr[2].charAt(0) != strArr[1].charAt(0)) {
                        A0A[4] = "JXkbPmQXP2BcwiEI3FqqjfiGok6rwhAB";
                        if (i > 0) {
                            transientStatePreventsRecycling2 = abstractC3075jE.A0v(IronSourceError.ERROR_CAPPED_PER_SESSION);
                            if (!transientStatePreventsRecycling2) {
                                size = this.A06.size();
                                if (size >= this.A00 && size > 0) {
                                    A07(0);
                                    size--;
                                }
                                transientStatePreventsRecycling3 = C7O.A1E;
                                if (transientStatePreventsRecycling3 && size > 0) {
                                    transientStatePreventsRecycling4 = this.A08.A02.A05(abstractC3075jE.A03);
                                    if (!transientStatePreventsRecycling4) {
                                        i2 = size - 1;
                                        while (i2 >= 0) {
                                            int targetCacheIndex3 = this.A06.get(i2).A03;
                                            transientStatePreventsRecycling5 = this.A08.A02.A05(targetCacheIndex3);
                                            if (!transientStatePreventsRecycling5) {
                                                break;
                                            } else {
                                                i2--;
                                            }
                                        }
                                        size = i2 + 1;
                                    }
                                }
                                this.A06.add(size, abstractC3075jE);
                                z = true;
                            }
                        }
                    } else {
                        A0A[4] = "iMRb6lH7bzEtCSJD4TfZYArDATXy6kqw";
                        if (i > 0) {
                            transientStatePreventsRecycling2 = abstractC3075jE.A0v(IronSourceError.ERROR_CAPPED_PER_SESSION);
                            if (!transientStatePreventsRecycling2) {
                                size = this.A06.size();
                                if (size >= this.A00) {
                                    A07(0);
                                    size--;
                                }
                                transientStatePreventsRecycling3 = C7O.A1E;
                                if (transientStatePreventsRecycling3) {
                                    transientStatePreventsRecycling4 = this.A08.A02.A05(abstractC3075jE.A03);
                                    if (!transientStatePreventsRecycling4) {
                                        i2 = size - 1;
                                        while (i2 >= 0) {
                                            int targetCacheIndex4 = this.A06.get(i2).A03;
                                            transientStatePreventsRecycling5 = this.A08.A02.A05(targetCacheIndex4);
                                            if (!transientStatePreventsRecycling5) {
                                                break;
                                                break;
                                            }
                                            i2--;
                                        }
                                        size = i2 + 1;
                                    }
                                }
                                this.A06.add(size, abstractC3075jE);
                                z = true;
                            }
                        }
                    }
                    if (!z) {
                        A0e(abstractC3075jE, true);
                        z2 = true;
                    }
                }
            }
            this.A08.A0t.A0B(abstractC3075jE);
            if (!z && !z2 && zA0K) {
                abstractC3075jE.A08 = null;
                return;
            }
            return;
        }
        throw new IllegalArgumentException(A04(371, 81, 12) + abstractC3075jE + this.A08.A1L());
    }

    public final void A0d(AbstractC3075jE abstractC3075jE) {
        if (abstractC3075jE.A0G) {
            this.A02.remove(abstractC3075jE);
        } else {
            this.A05.remove(abstractC3075jE);
        }
        abstractC3075jE.A0F = null;
        abstractC3075jE.A0G = false;
        abstractC3075jE.A0Z();
    }

    public final void A0e(AbstractC3075jE abstractC3075jE, boolean z) {
        C7O.A0t(abstractC3075jE);
        if (abstractC3075jE.A0v(16384)) {
            abstractC3075jE.A0f(0, 16384);
            AbstractC2977hb.A0B(abstractC3075jE.A0H, null);
        }
        if (z) {
            A0B(abstractC3075jE);
        }
        abstractC3075jE.A08 = null;
        A0I().A09(abstractC3075jE);
    }
}
