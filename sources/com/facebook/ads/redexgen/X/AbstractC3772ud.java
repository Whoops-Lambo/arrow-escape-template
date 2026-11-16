package com.facebook.ads.redexgen.X;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.ud, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes.dex */
public abstract class AbstractC3772ud {
    public static float A00(C2832fE c2832fE) {
        int height = c2832fE.A0I().A01();
        int width = c2832fE.A0I().A00();
        if (width > 0) {
            return height / width;
        }
        return -1.0f;
    }

    public static int A01(double d) {
        int availableWidth = (int) (((double) (AbstractC3481pw.A00().widthPixels - (AbstractC3782un.A09 * 2))) / d);
        return availableWidth;
    }

    public static int A02(int bottomMargin) {
        int ctaMargin = AbstractC3523qc.A01(16);
        int ctaTextHeight = AbstractC3749uG.A0B;
        int ctaSpacing = ctaTextHeight * 2;
        int ctaTextHeight2 = AbstractC3782un.A09;
        int ctaMargin2 = ctaMargin + ctaSpacing + (ctaTextHeight2 * 2);
        int ctaTextHeight3 = AbstractC3481pw.A00().heightPixels;
        return (ctaTextHeight3 - bottomMargin) - ctaMargin2;
    }

    public static ViewOnClickListenerC3771uc A03(ViewOnClickListenerC1981El viewOnClickListenerC1981El, String str) {
        return new ViewOnClickListenerC3771uc(viewOnClickListenerC1981El, str);
    }

    public static boolean A04(double d) {
        return d < 0.9d;
    }

    public static boolean A05(double d, int i) {
        return A02(i) < A01(d);
    }

    public static boolean A06(int i, int i2, double d) {
        return i == 2 || A05(d, i2);
    }
}
