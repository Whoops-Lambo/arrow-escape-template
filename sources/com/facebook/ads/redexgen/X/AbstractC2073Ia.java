package com.facebook.ads.redexgen.X;

import android.view.View;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Ia, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes.dex */
public abstract class AbstractC2073Ia extends AbstractC3053is {
    public static String[] A01 = {"ufm8s7LRmOM7", "sIBwdoM05ajejE", "0NxvrnR7UZDHrBy4xVhLU5lsqzWJ5R3x", "FsILnIqpIa8iE3wffvJrO4tNlZdDmpUd", "wKnqjXSh8f61FKWyknAGi8xlXXoDdiLA", "lpMPMGmveEx5YZPPZgDkriuB4nzdouJK", "fQPzW90JHWOApVaaQbndX59CGXgCnXlm", "Pp9SKBa6RS3IfLIGXA9e4oeVKGHa5CsE"};
    public boolean A00 = true;

    public abstract boolean A0X(AbstractC3075jE abstractC3075jE);

    public abstract boolean A0Y(AbstractC3075jE abstractC3075jE);

    public abstract boolean A0Z(AbstractC3075jE abstractC3075jE, int i, int i2, int i3, int i4);

    public abstract boolean A0a(AbstractC3075jE abstractC3075jE, AbstractC3075jE abstractC3075jE2, int i, int i2, int i3, int i4);

    @Override // com.facebook.ads.redexgen.X.AbstractC3053is
    public final boolean A0N(AbstractC3075jE abstractC3075jE) {
        return !this.A00 || abstractC3075jE.A0m();
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC3053is
    public final boolean A0O(AbstractC3075jE abstractC3075jE, C3052ir c3052ir, C3052ir c3052ir2) {
        if (c3052ir != null && (c3052ir.A01 != c3052ir2.A01 || c3052ir.A03 != c3052ir2.A03)) {
            return A0Z(abstractC3075jE, c3052ir.A01, c3052ir.A03, c3052ir2.A01, c3052ir2.A03);
        }
        return A0X(abstractC3075jE);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC3053is
    public final boolean A0P(AbstractC3075jE abstractC3075jE, C3052ir c3052ir, C3052ir c3052ir2) {
        int i = c3052ir.A01;
        int i2 = c3052ir.A03;
        View view = abstractC3075jE.A0H;
        int oldLeft = c3052ir2 == null ? view.getLeft() : c3052ir2.A01;
        int oldTop = c3052ir2 == null ? view.getTop() : c3052ir2.A03;
        if (!abstractC3075jE.A0n() && (i != oldLeft || i2 != oldTop)) {
            view.layout(oldLeft, oldTop, view.getWidth() + oldLeft, view.getHeight() + oldTop);
            return A0Z(abstractC3075jE, i, i2, oldLeft, oldTop);
        }
        return A0Y(abstractC3075jE);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC3053is
    public final boolean A0Q(AbstractC3075jE abstractC3075jE, C3052ir c3052ir, C3052ir c3052ir2) {
        if (c3052ir.A01 != c3052ir2.A01 || c3052ir.A03 != c3052ir2.A03) {
            return A0Z(abstractC3075jE, c3052ir.A01, c3052ir.A03, c3052ir2.A01, c3052ir2.A03);
        }
        A0U(abstractC3075jE);
        return false;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC3053is
    public final boolean A0R(AbstractC3075jE abstractC3075jE, AbstractC3075jE abstractC3075jE2, C3052ir c3052ir, C3052ir c3052ir2) {
        int fromTop;
        int toLeft;
        int i = c3052ir.A01;
        int fromLeft = c3052ir.A03;
        if (abstractC3075jE2.A0s()) {
            fromTop = c3052ir.A01;
            toLeft = c3052ir.A03;
        } else {
            fromTop = c3052ir2.A01;
            toLeft = c3052ir2.A03;
        }
        int toTop = A01[1].length();
        if (toTop != 14) {
            throw new RuntimeException();
        }
        A01[1] = "7F8ns227Orjao7";
        return A0a(abstractC3075jE, abstractC3075jE2, i, fromLeft, fromTop, toLeft);
    }

    public final void A0T(AbstractC3075jE abstractC3075jE) {
        A0K(abstractC3075jE);
    }

    public final void A0U(AbstractC3075jE abstractC3075jE) {
        A0K(abstractC3075jE);
    }

    public final void A0V(AbstractC3075jE abstractC3075jE) {
        A0K(abstractC3075jE);
    }

    public final void A0W(AbstractC3075jE abstractC3075jE, boolean z) {
        A0K(abstractC3075jE);
    }
}
