package com.facebook.ads.redexgen.X;

import android.view.View;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.jJ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes.dex */
public final class C3080jJ {
    public static String[] A02 = {"m3GQXqMIPLmV90", "GJHyDe1taa8sHfj0RdGpKE", "t", "zKiEjVGqR6UxWk3mC7l5flqkwPkxbPZ9", "lYl1u7brtSi69pWajNdkV6Hph567Zy88", "N", "zHwy1NdKzCctMJy4ad", "VUD"};
    public C3077jG A00 = new C3077jG();
    public final InterfaceC3078jH A01;

    public C3080jJ(InterfaceC3078jH interfaceC3078jH) {
        this.A01 = interfaceC3078jH;
    }

    public final View A00(int i, int i2, int i3, int i4) {
        int iA9K = this.A01.A9K();
        int next = this.A01.A9J();
        int childEnd = i2 > i ? 1 : -1;
        View view = null;
        while (i != i2) {
            View viewA7s = this.A01.A7s(i);
            int iA7v = this.A01.A7v(viewA7s);
            int i5 = this.A01.A7u(viewA7s);
            this.A00.A03(iA9K, next, iA7v, i5);
            if (i3 != 0) {
                this.A00.A01();
                this.A00.A02(i3);
                if (this.A00.A04()) {
                    return viewA7s;
                }
            }
            if (i4 != 0) {
                this.A00.A01();
                this.A00.A02(i4);
                if (this.A00.A04()) {
                    view = viewA7s;
                }
            }
            i += childEnd;
        }
        return view;
    }

    public final boolean A01(View view, int i) {
        this.A00.A03(this.A01.A9K(), this.A01.A9J(), this.A01.A7v(view), this.A01.A7u(view));
        if (i != 0) {
            this.A00.A01();
            this.A00.A02(i);
            C3077jG c3077jG = this.A00;
            String[] strArr = A02;
            if (strArr[2].length() != strArr[5].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A02;
            strArr2[4] = "CcDsiz54oXOGEpv23ROy12CWsbWYVe77";
            strArr2[3] = "dAE2WpjUb7j7qwunRRlMht4isYwoMM8P";
            return c3077jG.A04();
        }
        return false;
    }
}
