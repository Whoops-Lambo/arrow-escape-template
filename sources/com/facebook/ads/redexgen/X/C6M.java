package com.facebook.ads.redexgen.X;

import android.content.res.Configuration;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.widget.RelativeLayout;
import com.vungle.ads.internal.protos.Sdk;
import java.util.Arrays;
import java.util.HashMap;
import kotlin.Metadata;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.6M, reason: invalid class name */
/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    java.lang.IllegalArgumentException: Provided Metadata instance does not have metadataVersion in it and therefore is malformed and cannot be read.
    	at kotlin.metadata.jvm.internal.JvmReadUtils.checkMetadataVersionForRead(JvmReadUtils.kt:79)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:46)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:68)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:31)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:33)
    */
/* JADX INFO: loaded from: assets/audience_network/classes.dex */
@Metadata
public final class C6M extends AbstractC1958Do {
    public static byte[] A0D;
    public static String[] A0E = {"UzutHhweNKA6I6XDZye6UhBKaL9x6j29", "4hoNcuDBHqhxwa87", "K9Pp3y8diVelGbM7aQpqLBr68c6UUhMz", "y3BzvMqIeQRH2aQx", "XzKBwpVR9JGJkXe", "RT6mp0SPjZzcwqF6Xr39KNrE10CRftIA", "GSsPkrMKr0cmxxP", "XUrnCKxzP99jksvK45kzmcN4iGFy0nJd"};
    public static final C1F A0F;
    public static final RelativeLayout.LayoutParams A0G;
    public FG A00;
    public ViewOnClickListenerC1981El A01;
    public C3770ub A02;
    public C3798v3 A03;
    public C3287mi A04;
    public C2911gV A05;
    public boolean A06;
    public boolean A07;
    public final int A08;
    public final C3329nO A09;
    public final AbstractC3549r2 A0A;
    public final InterfaceC3608rz A0B;
    public final boolean A0C;

    public static String A05(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0D, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            byte b = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 62);
            String[] strArr = A0E;
            if (strArr[2].charAt(16) == strArr[0].charAt(16)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0E;
            strArr2[3] = "4smmZYi0Af2QJONg";
            strArr2[1] = "4xmyMBYTJ6PUAhDX";
            bArrCopyOfRange[i4] = b;
        }
        return new String(bArrCopyOfRange);
    }

    public static void A06() {
        A0D = new byte[]{118, 115, 85, 114, 127, 118, 97, 126, 120, 101, 69, 64, 103, 69, 71, 76, 65, 105, 69, 74, 69, 67, 65, 86, 80, 85, 114, 94, 95, 69, 84, 73, 69, 102, 67, 80, 65, 65, 84, 67, 37, 32, 0, 37, 48, 37, 6, 49, 42, 32, 40, 33, 55, 50, 19, 32, 51, 56, 34, 27, 55, 56, 55, 49, 51, 36, 113, 122, 115, 123, 124, 119, 118, 81, 122, 123, 126, 118, 83, 118, 94, 123, 97, 102, 119, 124, 119, 96, 42, 38, 39, 47, 32, 46, 59, 40, 51, 51, 56, 49, 17, 50, 58, 58, 52, 51, 58, 21, 60, 51, 57, 49, 56, 47, 24, 26, 17, 26, 13, 22, 28, 60, 62, 47, 11, 52, 41, 47, 41, 58, 50, 47, 24, 52, 55, 52, 41, 18, 53, 61, 52, 115, 117, 117, 117, 114, 86, 83, 73, 78, 95, 84, 95, 72, 19, 63, 26, 61, 17, 16, 10, 27, 6, 10, 41, 12, 31, 14, 14, 27, 12, 49, 29, 56, 24, 61, 40, 61, 30, 41, 50, 56, 48, 57, 87, 118, 83, 73, 78, 95, 84, 95, 72, 113, 105, 107, 114, 117, 105, 115, 116, 101, 99, 119, 108, 108, 111, 97, 98, 113};
    }

    static {
        A06();
        A0F = new C1F(null);
        A0G = new RelativeLayout.LayoutParams(-1, -1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6M(C2055Hi c2055Hi, InterfaceC3612s3 interfaceC3612s3, int i, InterfaceC3321nG interfaceC3321nG, LA la, InterfaceC3556r9 interfaceC3556r9, AbstractC3549r2 abstractC3549r2, C3329nO c3329nO, C3183kz c3183kz, boolean z, boolean z2, InterfaceC3608rz interfaceC3608rz, int i2, int i3, boolean z3) {
        super(c2055Hi, interfaceC3612s3, interfaceC3321nG, la, i, z, z2, interfaceC3556r9, i3);
        C1h.A09(c2055Hi, A05(24, 16, 15));
        C1h.A09(interfaceC3612s3, A05(0, 10, 41));
        C1h.A09(interfaceC3321nG, A05(52, 14, 104));
        C1h.A09(la, A05(40, 12, Sdk.SDKError.Reason.INVALID_ADS_ENDPOINT_VALUE));
        C1h.A09(interfaceC3556r9, A05(146, 8, 4));
        C1h.A09(abstractC3549r2, A05(203, 7, 61));
        C1h.A09(c3329nO, A05(94, 20, 99));
        C1h.A09(c3183kz, A05(10, 14, 26));
        C1h.A09(interfaceC3608rz, A05(66, 22, 44));
        this.A0A = abstractC3549r2;
        this.A09 = c3329nO;
        this.A0B = interfaceC3608rz;
        this.A08 = i2;
        this.A0C = z3;
        super.A01 = this.A0C;
        if (!this.A0C && (la instanceof C18117g)) {
            this.A07 = true;
            this.A00 = new FG();
            FG fg = this.A00;
            C1h.A06(fg);
            this.A05 = new C2911gV(c2055Hi, fg, super.A08.A1u(), interfaceC3556r9);
        }
        A07();
        A08();
    }

    private final void A07() {
        this.A04 = new C3287mi(super.A09, super.A08, super.A0A, this.A0F, super.A0C, this.A0D, this.A0A, this.A09);
        ViewOnClickListenerC1981El regularCtaForEndCard = getRegularCtaForEndCard();
        this.A01 = regularCtaForEndCard;
        C3287mi c3287mi = this.A04;
        if (c3287mi != null) {
            c3287mi.A0q(regularCtaForEndCard);
        }
    }

    private final void A08() {
        C3287mi c3287mi = this.A04;
        if (c3287mi == null || c3287mi.A0d() == null) {
            return;
        }
        c3287mi.A0s(true);
        c3287mi.A0i();
        if (super.A01) {
            c3287mi.A0r(AbstractC1958Do.A1V(super.A07, super.A06));
        }
        ViewOnClickListenerC1981El viewOnClickListenerC1981El = this.A01;
        if (viewOnClickListenerC1981El != null) {
            c3287mi.A0p(viewOnClickListenerC1981El);
        }
        c3287mi.A0j();
        c3287mi.A0h();
        addView(c3287mi.A0d(), A0G);
        String[] strArr = A0E;
        if (strArr[3].length() != strArr[1].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0E;
        strArr2[3] = "lHfXLdp7I01w499Y";
        strArr2[1] = "KBmZBlGM3V5mcO8y";
        A1f();
    }

    private final void A09() {
        C3287mi c3287mi = this.A04;
        if (c3287mi != null) {
            c3287mi.A0n(this.A08, new C1956Dm(this));
        }
    }

    private final void A0A() {
        this.A0A.setToolbarActionMode(2);
        long j = ((long) this.A08) * 1000;
        C3287mi c3287mi = this.A04;
        if (c3287mi != null) {
            c3287mi.A0n(j, new C1955Dl(this));
        }
    }

    private final boolean A0B() {
        C2843fP c2843fPA0K;
        String strA06;
        C2832fE c2832fEA32 = super.A08.A32();
        if (c2832fEA32 == null || (c2843fPA0K = c2832fEA32.A0K()) == null || (strA06 = c2843fPA0K.A06()) == null) {
            return false;
        }
        try {
            Uri uriA00 = AbstractC3448pP.A00(strA06);
            C1h.A06(uriA00);
            return C3238lu.A0S.A03(uriA00) == null;
        } catch (SecurityException e) {
            super.A09.A08().ABz(A05(Sdk.SDKError.Reason.ASSET_WRITE_ERROR_VALUE, 7, 65), AbstractC3223lf.A2a, new C3224lg(e));
            return false;
        }
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1958Do
    public final EnumC2795ec A1a(String str) {
        EnumC2795ec enumC2795ecA0E;
        C1h.A09(str, A05(197, 6, 56));
        ViewOnClickListenerC1981El viewOnClickListenerC1981El = this.A01;
        return (viewOnClickListenerC1981El == null || (enumC2795ecA0E = viewOnClickListenerC1981El.A0E(A05(193, 4, 60))) == null) ? EnumC2795ec.A08 : enumC2795ecA0E;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1958Do
    public final void A1b() {
        super.A1b();
        C3287mi c3287mi = this.A04;
        if (c3287mi != null) {
            c3287mi.A0e();
        }
        C3770ub c3770ub = this.A02;
        if (c3770ub != null) {
            c3770ub.A0E();
        }
        this.A0F.A0V();
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1958Do
    public final void A1g() {
        RelativeLayout relativeLayoutA0d;
        if (this.A0C) {
            C2055Hi c2055Hi = super.A09;
            String[] strArr = A0E;
            if (strArr[2].charAt(16) == strArr[0].charAt(16)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0E;
            strArr2[3] = "SyHgw7Sy9rEYHKXs";
            strArr2[1] = "XGzC0gT38krGJvRo";
            c2055Hi.A0F().A5W();
        }
        this.A06 = true;
        C3287mi c3287mi = this.A04;
        if (c3287mi != null) {
            c3287mi.A0l();
        }
        C3287mi c3287mi2 = this.A04;
        if (c3287mi2 != null && (relativeLayoutA0d = c3287mi2.A0d()) != null) {
            relativeLayoutA0d.removeAllViews();
        }
        if (A0B()) {
            C2055Hi c2055Hi2 = super.A09;
            C1h.A08(c2055Hi2, A05(154, 17, 64));
            LA la = super.A08;
            C1h.A08(la, A05(171, 13, 98));
            C3329nO c3329nO = this.A09;
            Handler handler = new Handler(Looper.getMainLooper());
            InterfaceC3556r9 interfaceC3556r9 = this.A0D;
            C1h.A08(interfaceC3556r9, A05(184, 9, 4));
            this.A02 = new C3770ub(c2055Hi2, la, c3329nO, handler, interfaceC3556r9);
            C3770ub c3770ub = this.A02;
            addView(c3770ub != null ? c3770ub.A0D(this.A01) : null);
        } else {
            this.A03 = new C3798v3(super.A09, super.A08, this.A09, new Handler(Looper.getMainLooper()), this.A0D);
            C3798v3 c3798v3 = this.A03;
            if (c3798v3 != null) {
                c3798v3.A0K(false);
            }
            C3798v3 c3798v4 = this.A03;
            addView(c3798v4 != null ? c3798v4.A0E(this.A01) : null);
        }
        this.A0A.bringToFront();
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0027  */
    @Override // com.facebook.ads.redexgen.X.AbstractC1958Do
    public final void A1h() {
        if (this.A08 > 0) {
            if (this.A0C) {
                A09();
            } else {
                A0A();
            }
            int iA02 = super.A08.A32().A0I().A02();
            if (iA02 >= 0) {
                this.A0A.setProgressSpinnerInvisible(true);
            }
            if (iA02 != 0) {
                int secondsForNextCta = this.A08;
                if (iA02 >= secondsForNextCta) {
                    this.A0A.setToolbarActionMode(8);
                } else if (iA02 > 0) {
                    new C3467pi(iA02, new C1957Dn(this)).A07();
                }
            } else {
                this.A0A.setToolbarActionMode(8);
            }
        } else {
            this.A0B.AH3(false);
        }
        A1f();
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1958Do
    public final void A1j(boolean z) {
        C3287mi c3287mi = this.A04;
        if (c3287mi != null) {
            c3287mi.A0f();
        }
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1958Do
    public final void A1k(boolean z) {
        C3287mi c3287mi = this.A04;
        if (c3287mi != null) {
            c3287mi.A0g();
        }
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1958Do
    public final boolean A1o() {
        if (super.A08.A2H()) {
            boolean z = this.A06;
            String[] strArr = A0E;
            if (strArr[3].length() != strArr[1].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0E;
            strArr2[3] = "EMpXE7ymYpQm8ghS";
            strArr2[1] = "p1eQOWvOMAlHDzhH";
            if (!z) {
                return true;
            }
        }
        return false;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1958Do
    public final boolean A1p() {
        return this.A06;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1958Do
    public final boolean A1q() {
        return true;
    }

    public final void A1s() {
        this.A0A.setToolbarActionMode(2);
        ViewOnClickListenerC1981El viewOnClickListenerC1981El = this.A01;
        if (viewOnClickListenerC1981El != null) {
            viewOnClickListenerC1981El.A0E(A05(193, 4, 60));
        }
    }

    public final boolean A1t() {
        if (this.A0A.getToolbarActionMode() == 0) {
            return false;
        }
        if (this.A0A.getToolbarActionMode() == 1) {
            this.A0A.setToolbarActionMode(2);
            A1g();
            this.A0A.setToolbarActionMode(0);
        }
        return true;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1958Do
    public C3694tN getFullScreenAdStyle() {
        C2841fN c2841fNA01 = super.A08.A31().A01();
        C1h.A08(c2841fNA01, A05(Sdk.SDKError.Reason.TPAT_ERROR_VALUE, 25, 101));
        return new C3694tN(false, C3694tN.A07, c2841fNA01, ViewOnClickListenerC1981El.A05(super.A08), c2841fNA01.A08(false), null);
    }

    private final ViewOnClickListenerC1981El getRegularCtaForEndCard() {
        ViewOnClickListenerC1981El button = new ViewOnClickListenerC1981El(super.A09, super.A08.A1X(), super.A08.A31().A01(), super.A0A, this.A0D, this.A0F, super.A0C, super.A08.A33());
        button.setViewShowsOverMedia(true);
        AbstractC3523qc.A0L(button);
        button.setText((CharSequence) super.A08.A32().A0K().A05());
        AbstractC3523qc.A0H(1001, button);
        button.setCta(super.A08.A32().A0K(), super.A08.A37(), new HashMap(), null);
        return button;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1958Do, android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        C1h.A09(configuration, A05(88, 6, Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE));
        super.onConfigurationChanged(configuration);
    }
}
