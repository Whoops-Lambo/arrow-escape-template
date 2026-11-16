package com.facebook.ads.redexgen.X;

import android.util.SparseArray;
import java.util.ArrayList;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.j3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes.dex */
public class C3064j3 {
    public static String[] A02 = {"hO0SXlIn7n5HXEBLx", "jESNVpuYnHPlnh4DZ", "CDLwN7DwmtArlNd144q1QIOvLDqs4yZF", "JntNhgZ58kYFXbwiJ6hzeVdvPNGn00kF", "yTsWpbzmHeCmcQEDkb0QkT5J3TV6CkfD", "Lh9pded4Clz2", "gnDNjs3GBImfOnnM5uEQWokXBd1c", "C4tnEN178k9sL9bIxtVolUttiI5dEdE5"};
    public SparseArray<C3063j2> A00 = new SparseArray<>();
    public int A01 = 0;

    private final long A00(long j, long j2) {
        if (j == 0) {
            return j2;
        }
        long j3 = j / 4;
        String[] strArr = A02;
        if (strArr[3].charAt(9) != strArr[7].charAt(9)) {
            throw new RuntimeException();
        }
        A02[4] = "GTVZcsVJP0WVKaHbsMtSVk9gu6Gyk4Ss";
        return (j3 * 3) + (j2 / 4);
    }

    private C3063j2 A01(int i) {
        C3063j2 c3063j2 = this.A00.get(i);
        if (c3063j2 == null) {
            C3063j2 c3063j3 = new C3063j2();
            this.A00.put(i, c3063j3);
            return c3063j3;
        }
        return c3063j2;
    }

    private final void A02() {
        for (int i = 0; i < i; i++) {
            this.A00.valueAt(i).A03.clear();
        }
    }

    public final AbstractC3075jE A03(int i) {
        C3063j2 c3063j2 = this.A00.get(i);
        if (c3063j2 != null && !c3063j2.A03.isEmpty()) {
            ArrayList<AbstractC3075jE> arrayList = c3063j2.A03;
            if (A02[4].charAt(1) != 'T') {
                throw new RuntimeException();
            }
            A02[6] = "6zOEmNGiTAHU1v9SGa3";
            return arrayList.remove(arrayList.size() - 1);
        }
        return null;
    }

    public final void A04() {
        this.A01--;
    }

    public final void A05(int i, long j) {
        C3063j2 c3063j2A01 = A01(i);
        c3063j2A01.A01 = A00(c3063j2A01.A01, j);
    }

    public final void A06(int i, long j) {
        C3063j2 c3063j2A01 = A01(i);
        c3063j2A01.A02 = A00(c3063j2A01.A02, j);
    }

    public final void A07(AbstractC3045ik abstractC3045ik) {
        this.A01++;
    }

    public final void A08(AbstractC3045ik abstractC3045ik, AbstractC3045ik abstractC3045ik2, boolean z) {
        if (abstractC3045ik != null) {
            A04();
        }
        if (!z && this.A01 == 0) {
            A02();
        }
        if (abstractC3045ik2 != null) {
            A07(abstractC3045ik2);
        }
    }

    public final void A09(AbstractC3075jE abstractC3075jE) {
        int iA0S = abstractC3075jE.A0S();
        ArrayList<AbstractC3075jE> arrayList = A01(iA0S).A03;
        int i = this.A00.get(iA0S).A00;
        int viewType = arrayList.size();
        if (i <= viewType) {
            return;
        }
        abstractC3075jE.A0b();
        String[] strArr = A02;
        String str = strArr[3];
        String str2 = strArr[7];
        int iCharAt = str.charAt(9);
        int viewType2 = str2.charAt(9);
        if (iCharAt != viewType2) {
            throw new RuntimeException();
        }
        String[] strArr2 = A02;
        strArr2[1] = "TnDeXYrDbfmyODeGX";
        strArr2[5] = "ziritv0xfrad";
        arrayList.add(abstractC3075jE);
    }

    public final boolean A0A(int i, long j, long j2) {
        long j3 = A01(i).A01;
        return j3 == 0 || j + j3 < j2;
    }

    public final boolean A0B(int i, long j, long j2) {
        long j3 = A01(i).A02;
        return j3 == 0 || j + j3 < j2;
    }
}
