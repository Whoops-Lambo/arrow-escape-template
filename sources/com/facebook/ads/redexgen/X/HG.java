package com.facebook.ads.redexgen.X;

import android.content.Context;
import com.facebook.ads.internal.dynamicloading.DynamicLoaderImpl;
import com.facebook.ads.internal.util.process.ProcessUtils;
import com.vungle.ads.internal.protos.Sdk;
import java.util.Arrays;

/* JADX INFO: loaded from: assets/audience_network/classes.dex */
public final class HG implements InterfaceC3194lC {
    public static HG A07;
    public static byte[] A08;
    public static String[] A09 = {"kZNWMB05A80rolZkZr5gINRkemJedumA", "PGnlsDLswmZGHAGkHnqyou4j", "CQczeQcoxNMNqPeDO5UPH4delPie3CF6", "Ozs7AQnIuhnl4TF488yhCLnc3lqg3Tqv", "QUMQF15y8F49TOv2Mbtf3pi6YRJU7tsl", "iRM3Hx3PCEqf", "8yEJzjy1AvS4vnL", "zEXAgd0MZ6iopjt"};
    public InterfaceC2741dj A00;
    public InterfaceC3187l3 A01;
    public InterfaceC3193lB A02;
    public InterfaceC3209lR A03;
    public C3253mA A04;
    public InterfaceC3333nS A05;
    public AH A06;

    public static String A06(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A08, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = bArrCopyOfRange.length;
            String[] strArr = A09;
            if (strArr[6].length() != strArr[7].length()) {
                break;
            }
            String[] strArr2 = A09;
            strArr2[6] = "Hv2WK1fJh7GnXaP";
            strArr2[7] = "jwUFRNkRPBL5IaL";
            if (i4 >= length) {
                return new String(bArrCopyOfRange);
            }
            int i5 = bArrCopyOfRange[i4] - i3;
            String[] strArr3 = A09;
            if (strArr3[4].charAt(26) != strArr3[0].charAt(26)) {
                break;
            }
            String[] strArr4 = A09;
            strArr4[2] = "3jbuj6iR6sIerVLqEJ9xAsC0KuP7QrbG";
            strArr4[3] = "qsuffxm3RCjhy50iWQEl04Txy4tWGAPw";
            bArrCopyOfRange[i4] = (byte) (i5 - 98);
            i4++;
        }
        throw new RuntimeException();
    }

    public static void A07() {
        A08 = new byte[]{-57, -55, -10, -58, -57, -13, -64, -13, -16, 2, 16, 16, 6, 12, 11, -67, 1, -2, 17, -2, -67, 6, 11, 6, 17, 6, -2, 9, 6, 23, 2, 1, 33, 20, 31, 30, 33, 35, 2, 20, 34, 34, 24, 30, 29, -13, 16, 35, 16, -8, 29, 24, 35, 24, 16, 27, 24, 41, 20, 19};
        if (A09[1].length() == 32) {
            throw new RuntimeException();
        }
        String[] strArr = A09;
        strArr[2] = "XQj6tBQR93KUWcmqG7acynHpkyXbPHo4";
        strArr[3] = "0fPU7ngiro1m2vFzwgFa3cBnolZ3o5pA";
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public final synchronized void A0C(C2054Hh c2054Hh) {
        if (this.A06 != null) {
            return;
        }
        this.A03 = A01(c2054Hh);
        this.A06 = A05(c2054Hh, this.A03, A03(c2054Hh));
        A09(c2054Hh, A00(c2054Hh, this.A06));
        A0A(c2054Hh, this.A06);
        A0B(c2054Hh, this.A06);
        if (this.A06 != null) {
            this.A06.A7D();
        }
    }

    static {
        A07();
    }

    public static InterfaceC3152kT A00(C2054Hh c2054Hh, AH ah) {
        if (!C3300mv.A1r(c2054Hh) || ah == null) {
            return null;
        }
        return AbstractC3153kU.A00().A00(ah);
    }

    public static InterfaceC3209lR A01(C2054Hh c2054Hh) {
        return AbstractC3210lS.A00().A00(c2054Hh, new HN());
    }

    public static synchronized HG A02() {
        if (A07 == null) {
            A07 = new HG();
        }
        return A07;
    }

    public static InterfaceC2626bs A03(C2054Hh c2054Hh) {
        if (!C3300mv.A1n(c2054Hh)) {
            return null;
        }
        return C2551af.A01(c2054Hh);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.InterfaceC3194lC
    /* JADX INFO: renamed from: A04, reason: merged with bridge method [inline-methods] */
    public final synchronized AH A9s() {
        return this.A06;
    }

    public static AH A05(C2054Hh c2054Hh, InterfaceC3209lR interfaceC3209lR, InterfaceC2626bs interfaceC2626bs) {
        if (!C3300mv.A2p(c2054Hh) || interfaceC2626bs == null || ProcessUtils.isRemoteRenderingProcess()) {
            return null;
        }
        return AbstractC2479Yu.A00().A00(c2054Hh, interfaceC3209lR, interfaceC2626bs, AbstractC3390oP.A04(c2054Hh), new HH(new C3382oH(c2054Hh, A06(0, 0, Sdk.SDKError.Reason.INVALID_ADS_ENDPOINT_VALUE), null, EnumC3362nx.A07, 0, new C3366o1(), AbstractC3505qK.A01(C3300mv.A0L(c2054Hh)), null, null, new K5()), c2054Hh), ZO.A00().A00());
    }

    public static void A08() {
        String strA06 = A06(8, 24, 59);
        if (A09[5].length() == 20) {
            throw new RuntimeException();
        }
        A09[5] = "4ii3kc4oT9MJsiDOLfNQb5ib2";
        AbstractC3370o5.A05(A06(32, 28, 77), strA06, A06(0, 8, 46));
    }

    public static void A09(C2054Hh c2054Hh, InterfaceC3152kT interfaceC3152kT) {
        if (!C3300mv.A1r(c2054Hh) || interfaceC3152kT == null) {
            return;
        }
        AbstractC3150kR.A00().A00(interfaceC3152kT, c2054Hh);
    }

    public static void A0A(C2054Hh c2054Hh, AH ah) {
        if (!C3300mv.A0k(c2054Hh) || ah == null) {
            return;
        }
        new C3172ko(c2054Hh, ah, new C3173kp(), DynamicLoaderImpl.getBidderTokenProviderApi().A00());
    }

    public static void A0B(C2054Hh c2054Hh, AH ah) {
        if (ah == null) {
            return;
        }
        AbstractC3304mz.A00(c2054Hh, ah);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC3194lC
    public final InterfaceC3321nG A7N(C2054Hh c2054Hh) {
        return C2040Gt.A01(c2054Hh);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC3194lC
    public final synchronized InterfaceC3193lB A7e(C3192lA c3192lA) {
        if (this.A02 == null) {
            this.A02 = new HI(this);
        }
        return this.A02;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC3194lC
    public final synchronized InterfaceC3187l3 A7r() {
        if (this.A01 == null) {
            this.A01 = new C2056Hj();
        }
        return this.A01;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC3194lC
    public final synchronized InterfaceC3209lR A8M(C3192lA c3192lA) {
        if (this.A03 == null) {
            this.A03 = A01(c3192lA.A02());
        }
        return this.A03;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC3194lC
    public final synchronized InterfaceC3222le A8O(C3192lA c3192lA) {
        return new HW(c3192lA);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC3194lC
    public final synchronized InterfaceC3195lD A8Y(final C3192lA c3192lA) {
        return new HM(c3192lA) { // from class: com.facebook.ads.redexgen.X.7B
            @Override // com.facebook.ads.redexgen.X.InterfaceC3195lD
            public final boolean AAQ() {
                return TextureViewSurfaceTextureListenerC1868Ac.A09();
            }

            @Override // com.facebook.ads.redexgen.X.InterfaceC3195lD
            public final void ADG() {
                C3247m4.A06(C3110jn.A09(super.A00));
            }

            @Override // com.facebook.ads.redexgen.X.InterfaceC3195lD
            public final void ADj() {
                C3247m4.A07(C3110jn.A09(super.A00));
            }

            @Override // com.facebook.ads.redexgen.X.InterfaceC3195lD
            public final void AEE(C2054Hh c2054Hh) {
                AbstractC2899gJ.A01(c2054Hh);
            }
        };
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC3194lC
    public final synchronized InterfaceC2741dj A8n(C3192lA c3192lA) {
        if (!C3300mv.A12(c3192lA)) {
            return null;
        }
        if (this.A00 == null) {
            this.A00 = AbstractC2742dk.A00().A00(new HL(c3192lA));
        }
        return this.A00;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC3194lC
    public final synchronized InterfaceC3197lF A9b(C3192lA c3192lA) {
        return new HJ(c3192lA);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC3194lC
    public final C2054Hh A9c(Context context) {
        C2054Hh sdkContext = AbstractC3191l9.A00();
        if (sdkContext == null) {
            C2054Hh sdkContext2 = new C2054Hh(context, this);
            AbstractC3191l9.A01(sdkContext2);
            return sdkContext2;
        }
        return sdkContext;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC3194lC
    public final synchronized InterfaceC3333nS A9d(C2054Hh c2054Hh) {
        if (this.A05 == null) {
            this.A05 = new H1(c2054Hh);
        }
        return this.A05;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC3194lC
    public final synchronized C3253mA A9j() {
        if (this.A04 == null) {
            this.A04 = new C3253mA();
            A08();
        }
        return this.A04;
    }
}
