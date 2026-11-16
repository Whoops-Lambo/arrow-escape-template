package com.facebook.ads.redexgen.X;

import android.view.ViewGroup;
import com.facebook.ads.redexgen.X.AbstractC3075jE;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.ik, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes.dex */
public abstract class AbstractC3045ik<VH extends AbstractC3075jE> {
    public static byte[] A02;
    public static String[] A03 = {"W324oDAhe3QD27ZyNAxx1dE4409WhTwA", "Ikg10MzvREcGgl38", "tAS262iMJzRr57vvpxPoG7SYxewns3xN", "rCt", "3uu7", "cbDGC8uMMSmc1mSYy17nilWnTwttZfvA", "2T", "U5f6pdP97"};
    public final C3046il A01 = new C3046il();
    public boolean A00 = false;

    public static String A08(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = bArrCopyOfRange.length;
            if (A03[2].charAt(21) != '7') {
                throw new RuntimeException();
            }
            String[] strArr = A03;
            strArr[1] = "WHsKZN6zyncpMK6d";
            strArr[4] = "wlW4";
            if (i4 >= length) {
                return new String(bArrCopyOfRange);
            }
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 32);
            i4++;
        }
    }

    public static void A09() {
        A02 = new byte[]{-48, -44, -98, -63, -16, -29, -33, -14, -29, -44, -25, -29, -11, -54, -50, -104, -57, -26, -70, -31, -26, -36, -50, -31, -35, -17};
    }

    public abstract int A0B();

    public abstract VH A0F(ViewGroup viewGroup, int i);

    public abstract void A0M(VH vh, int i);

    static {
        A09();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.ik != com.facebook.ads.internal.androidx.support.v7.widget.RecyclerView$Adapter<VH extends com.facebook.ads.redexgen.X.jE> */
    private final void A0A(VH holder, int i, List<Object> payloads) {
        A0M(holder, i);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.ik != com.facebook.ads.internal.androidx.support.v7.widget.RecyclerView$Adapter<VH extends com.facebook.ads.redexgen.X.jE> */
    public int A0C(int i) {
        return 0;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.ik != com.facebook.ads.internal.androidx.support.v7.widget.RecyclerView$Adapter<VH extends com.facebook.ads.redexgen.X.jE> */
    public final long A0D(int i) {
        return -1L;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.ik != com.facebook.ads.internal.androidx.support.v7.widget.RecyclerView$Adapter<VH extends com.facebook.ads.redexgen.X.jE> */
    public final VH A0E(ViewGroup viewGroup, int i) {
        AbstractC2939gy.A01(A08(0, 13, 94));
        VH vh = (VH) A0F(viewGroup, i);
        vh.A00 = i;
        AbstractC2939gy.A00();
        return vh;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.ik != com.facebook.ads.internal.androidx.support.v7.widget.RecyclerView$Adapter<VH extends com.facebook.ads.redexgen.X.jE> */
    public final void A0G() {
        this.A01.A00();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.ik != com.facebook.ads.internal.androidx.support.v7.widget.RecyclerView$Adapter<VH extends com.facebook.ads.redexgen.X.jE> */
    public final void A0H(int i) {
        this.A01.A01(i, 1);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.ik != com.facebook.ads.internal.androidx.support.v7.widget.RecyclerView$Adapter<VH extends com.facebook.ads.redexgen.X.jE> */
    public final void A0I(AbstractC3047im abstractC3047im) {
        this.A01.registerObserver(abstractC3047im);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.ik != com.facebook.ads.internal.androidx.support.v7.widget.RecyclerView$Adapter<VH extends com.facebook.ads.redexgen.X.jE> */
    public final void A0J(AbstractC3047im abstractC3047im) {
        this.A01.unregisterObserver(abstractC3047im);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.ik != com.facebook.ads.internal.androidx.support.v7.widget.RecyclerView$Adapter<VH extends com.facebook.ads.redexgen.X.jE> */
    public void A0K(VH holder) {
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0074  */
    /* JADX WARN: Code duplicated, block: B:9:0x0053  */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.ik != com.facebook.ads.internal.androidx.support.v7.widget.RecyclerView$Adapter<VH extends com.facebook.ads.redexgen.X.jE> */
    public final void A0L(VH vh, int i) {
        ViewGroup.LayoutParams layoutParams;
        String[] strArr;
        vh.A03 = i;
        if (A0O()) {
            long jA0D = A0D(i);
            String[] strArr2 = A03;
            if (strArr2[7].length() != strArr2[6].length()) {
                String[] strArr3 = A03;
                strArr3[7] = "OgtetI94x";
                strArr3[6] = "QU";
                vh.A05 = jA0D;
                vh.A0f(1, 519);
                AbstractC2939gy.A01(A08(13, 13, 88));
                A0A(vh, i, vh.A0W());
                vh.A0Y();
                layoutParams = vh.A0H.getLayoutParams();
                if (layoutParams instanceof C3058ix) {
                    ((C3058ix) layoutParams).A01 = true;
                }
                AbstractC2939gy.A00();
                strArr = A03;
                if (strArr[5].charAt(31) == strArr[0].charAt(31)) {
                    String[] strArr4 = A03;
                    strArr4[7] = "GQKIQ0ZEK";
                    strArr4[6] = "Zf";
                    return;
                }
            }
        } else {
            vh.A0f(1, 519);
            AbstractC2939gy.A01(A08(13, 13, 88));
            A0A(vh, i, vh.A0W());
            vh.A0Y();
            layoutParams = vh.A0H.getLayoutParams();
            if (layoutParams instanceof C3058ix) {
                ((C3058ix) layoutParams).A01 = true;
            }
            AbstractC2939gy.A00();
            strArr = A03;
            if (strArr[5].charAt(31) == strArr[0].charAt(31)) {
                String[] strArr5 = A03;
                strArr5[7] = "GQKIQ0ZEK";
                strArr5[6] = "Zf";
                return;
            }
        }
        throw new RuntimeException();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.ik != com.facebook.ads.internal.androidx.support.v7.widget.RecyclerView$Adapter<VH extends com.facebook.ads.redexgen.X.jE> */
    public void A0N(C7O c7o) {
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.ik != com.facebook.ads.internal.androidx.support.v7.widget.RecyclerView$Adapter<VH extends com.facebook.ads.redexgen.X.jE> */
    public final boolean A0O() {
        return this.A00;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.ik != com.facebook.ads.internal.androidx.support.v7.widget.RecyclerView$Adapter<VH extends com.facebook.ads.redexgen.X.jE> */
    public final boolean A0P(VH holder) {
        return false;
    }
}
