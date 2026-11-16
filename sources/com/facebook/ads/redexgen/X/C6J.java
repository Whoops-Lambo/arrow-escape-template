package com.facebook.ads.redexgen.X;

import android.animation.ObjectAnimator;
import android.content.res.Configuration;
import android.graphics.Typeface;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.6J, reason: invalid class name */
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
public final class C6J extends AbstractC1958Do {
    public static byte[] A0G;
    public static String[] A0H = {"zmfuAAdsWF5bboPH5APszGSkwrNjJok6", "XWbaPXrYLQznu0OckW2LOvbDL", "QXci", "aOHe6V6F8txhFIQidr0w8G1x6Nk4S", "ILYwhJqVaKxFQVioYmyMVPi8Rkm1lJYl", "6wfNJcRbuFCQ3RCTyiXr4ELUGWK4PzYN", "e4OfDXnyY91mKzJJOGUPBsuKAufhMlyE", "zoXpKsaIUnAnpB2FhTxs94rKkMLjx"};
    public static final C1E A0I;
    public static final int A0J;
    public static final int A0K;
    public static final int A0L;
    public static final int A0M;
    public static final int A0N;
    public static final int A0O;
    public static final RelativeLayout.LayoutParams A0P;
    public ObjectAnimator A00;
    public LinearLayout A01;
    public TextView A02;
    public C3467pi A03;
    public C17213u A04;
    public C3663ss A05;
    public C3667sw A06;
    public C3757uO A07;
    public C1920Cc A08;
    public C1878Am A09;
    public List<? extends C3411ol> A0A;
    public final int A0B;
    public final C3183kz A0C;
    public final C3329nO A0D;
    public final AbstractC3549r2 A0E;
    public final InterfaceC3608rz A0F;

    public static String A04(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0G, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 127);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A05() {
        A0G = new byte[]{-4, -1, -35, 0, 3, -4, 17, 4, 10, 13, 76, 79, 46, 76, 78, 83, 80, 56, 76, 89, 76, 82, 80, 93, -29, -26, -59, -15, -16, -10, -25, -6, -10, -39, -12, -29, -14, -14, -25, -12, 16, 19, -13, 16, 35, 16, -15, 36, 29, 19, 27, 20, 75, 78, 47, 96, 79, 88, 94, 55, 75, 88, 75, 81, 79, 92, 88, 93, 86, 94, 99, 90, 89, 56, 93, 94, 97, 89, 54, 89, 65, 94, 104, 105, 90, 99, 90, 103, 25, 37, 36, 28, 31, 29, -30, -15, -28, -32, -13, -28, -59, -12, -21, -21, -46, -30, -15, -28, -28, -19, -64, -29, -62, -15, -28, -29, -24, -13, -53, -24, -19, -28, -46, -13, -32, -13, -24, -30, -43, -24, -28, -10, -89, -83, -83, -83, -88, -1, 14, 1, -3, 16, 1, -30, 17, 8, 8, -17, -1, 14, 1, 1, 10, -35, 0, -33, 14, 1, 0, 5, 16, -24, 5, 10, 1, -14, 5, 1, 19, -60, -54, -54, -54, -59, -10, 5, -2, -2, -11, -4, -36, -1, -9, -9, -7, -2, -9, -40, -15, -2, -12, -4, -11, 2, -19, -21, -6, -57, -22, -49, -12, -20, -11, -46, -17, -7, -6, -82, -76, -76, -76, -81, 26, 24, 39, 3, 34, 37, 39, 37, 20, 28, 39, -10, 34, 31, 34, 37, -4, 33, 25, 34, -37, -31, -31, -31, -36, 86, 83, 93, 94, 79, 88, 79, 92, 60, 62, 59, 51, 62, 49, 63, 63, 109, 105, 111, 108, 93, 95, 54, 49, 49, 46, 36, 35, 52};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    private final void A07() {
        List<C2832fE> listA39 = super.A08.A39();
        C1h.A08(listA39, A04(194, 18, 7));
        List<C2832fE> list = listA39;
        ArrayList arrayList = new ArrayList(C0Y.A05(list, 10));
        int i = 0;
        for (Object obj : list) {
            int i2 = i + 1;
            if (i < 0) {
                AbstractC16670v.A0C();
                throw null;
            }
            arrayList.add(new C3411ol(i, listA39.size(), (C2832fE) obj));
            i = i2;
        }
        this.A0A = arrayList;
    }

    static {
        A05();
        A0I = new C1E(null);
        A0P = new RelativeLayout.LayoutParams(-1, -1);
        float f = 8;
        A0N = (int) (AbstractC3482px.A02 * f);
        A0K = AbstractC3480pv.A0y;
        A0J = (int) (48 * AbstractC3482px.A02);
        A0L = (int) (f * AbstractC3482px.A02);
        A0O = (int) (56 * AbstractC3482px.A02);
        A0M = (int) (12 * AbstractC3482px.A02);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6J(C2055Hi c2055Hi, InterfaceC3612s3 interfaceC3612s3, int i, InterfaceC3321nG interfaceC3321nG, LA la, InterfaceC3556r9 interfaceC3556r9, AbstractC3549r2 abstractC3549r2, C3329nO c3329nO, C3183kz c3183kz, boolean z, boolean z2, InterfaceC3608rz interfaceC3608rz, int i2, int i3) {
        super(c2055Hi, interfaceC3612s3, interfaceC3321nG, la, i, z, z2, interfaceC3556r9, i3);
        C1h.A09(c2055Hi, A04(24, 16, 3));
        C1h.A09(interfaceC3612s3, A04(0, 10, 28));
        C1h.A09(interfaceC3321nG, A04(52, 14, 107));
        C1h.A09(la, A04(40, 12, 48));
        C1h.A09(interfaceC3556r9, A04(237, 8, 107));
        C1h.A09(abstractC3549r2, A04(259, 7, 67));
        C1h.A09(c3329nO, A04(174, 20, 17));
        C1h.A09(c3183kz, A04(10, 14, 108));
        C1h.A09(interfaceC3608rz, A04(66, 22, Sdk.SDKError.Reason.PROTOBUF_SERIALIZATION_ERROR_VALUE));
        this.A0E = abstractC3549r2;
        this.A0D = c3329nO;
        this.A0C = c3183kz;
        this.A0F = interfaceC3608rz;
        this.A0B = i2;
        super.A01 = true;
        A07();
        setUpLayout(getResources().getConfiguration().orientation);
    }

    private final void A06() {
        TextView it = this.A02;
        if (it != null) {
            AbstractC3523qc.A0K(it);
        }
        this.A02 = null;
        String strA1V = AbstractC1958Do.A1V(super.A07, super.A06);
        TextView textView = new TextView(getContext());
        textView.setText(strA1V);
        textView.setTextColor(-872415232);
        textView.setMaxLines(1);
        textView.setTypeface(Typeface.DEFAULT);
        textView.setTextSize(14.0f);
        AbstractC3523qc.A0L(textView);
        this.A02 = textView;
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        if (this.A05 != null) {
            C3663ss c3663ss = this.A05;
            C1h.A06(c3663ss);
            layoutParams.addRule(2, c3663ss.getId());
        } else {
            layoutParams.addRule(12);
        }
        layoutParams.setMargins(AbstractC3480pv.A0H, 0, 0, AbstractC3480pv.A0y);
        textView.setLayoutParams(layoutParams);
        addView(textView);
    }

    private final void A08() {
        C1878Am c1878Am = this.A09;
        if (c1878Am == null) {
            return;
        }
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, A0N);
        if (this.A02 != null) {
            TextView textView = this.A02;
            C1h.A06(textView);
            layoutParams.addRule(2, textView.getId());
        } else if (this.A05 != null) {
            C3663ss c3663ss = this.A05;
            C1h.A06(c3663ss);
            layoutParams.addRule(2, c3663ss.getId());
        } else {
            layoutParams.addRule(12);
        }
        layoutParams.addRule(14);
        layoutParams.setMargins(AbstractC3480pv.A0H, AbstractC3480pv.A00, AbstractC3480pv.A0H, AbstractC3480pv.A0y);
        c1878Am.setLayoutParams(layoutParams);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0060  */
    /* JADX WARN: Code duplicated, block: B:15:0x0084  */
    /* JADX WARN: Code duplicated, block: B:17:0x0088  */
    /* JADX WARN: Code duplicated, block: B:19:0x0097  */
    /* JADX WARN: Code duplicated, block: B:20:0x00a9  */
    private final void A09() {
        RelativeLayout.LayoutParams layoutParams;
        C3663ss c3663ss;
        ObjectAnimator objectAnimator = this.A00;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        this.A00 = null;
        C1878Am c1878Am = this.A09;
        if (c1878Am == null) {
            int iA05 = super.A08.A31().A01().A05(false);
            C2055Hi c2055Hi = super.A09;
            int accentColor = this.A0B;
            C1878Am c1878Am2 = new C1878Am(c2055Hi, accentColor);
            c1878Am2.A0A(iA05, AbstractC2938gx.A02(iA05, 128), true);
            this.A09 = c1878Am2;
            AbstractC3523qc.A0L(c1878Am2);
            layoutParams = new RelativeLayout.LayoutParams(-1, A0N);
            if (this.A02 != null) {
                TextView textView = this.A02;
                C1h.A06(textView);
                int accentColor2 = textView.getId();
                layoutParams.addRule(2, accentColor2);
            } else if (this.A05 != null) {
                c3663ss = this.A05;
                if (A0H[1].length() != 27) {
                    A0H[2] = "8dGf";
                    C1h.A06(c3663ss);
                    int accentColor3 = c3663ss.getId();
                    layoutParams.addRule(2, accentColor3);
                }
            } else {
                layoutParams.addRule(12);
            }
            layoutParams.addRule(14);
            int i = AbstractC3480pv.A0H;
            int i2 = AbstractC3480pv.A00;
            int i3 = AbstractC3480pv.A0H;
            int accentColor4 = AbstractC3480pv.A0y;
            layoutParams.setMargins(i, i2, i3, accentColor4);
            addView(c1878Am2, layoutParams);
            return;
        }
        if (A0H[5].charAt(29) != 81) {
            A0H[2] = "4QEX";
            AbstractC3523qc.A0K(c1878Am);
            int iA06 = super.A08.A31().A01().A05(false);
            C2055Hi c2055Hi2 = super.A09;
            int accentColor5 = this.A0B;
            C1878Am c1878Am3 = new C1878Am(c2055Hi2, accentColor5);
            c1878Am3.A0A(iA06, AbstractC2938gx.A02(iA06, 128), true);
            this.A09 = c1878Am3;
            AbstractC3523qc.A0L(c1878Am3);
            layoutParams = new RelativeLayout.LayoutParams(-1, A0N);
            if (this.A02 != null) {
                TextView textView2 = this.A02;
                C1h.A06(textView2);
                int accentColor6 = textView2.getId();
                layoutParams.addRule(2, accentColor6);
            } else if (this.A05 != null) {
                c3663ss = this.A05;
                if (A0H[1].length() != 27) {
                    A0H[2] = "8dGf";
                    C1h.A06(c3663ss);
                    int accentColor7 = c3663ss.getId();
                    layoutParams.addRule(2, accentColor7);
                }
            } else {
                layoutParams.addRule(12);
            }
            layoutParams.addRule(14);
            int i4 = AbstractC3480pv.A0H;
            int i5 = AbstractC3480pv.A00;
            int i6 = AbstractC3480pv.A0H;
            int accentColor8 = AbstractC3480pv.A0y;
            layoutParams.setMargins(i4, i5, i6, accentColor8);
            addView(c1878Am3, layoutParams);
            return;
        }
        throw new RuntimeException();
    }

    private final void A0A() {
        A09();
        this.A03 = new C3467pi(this.A0B, 100.0f, 100L, new Handler(Looper.getMainLooper()), new C1946Dc(this));
        C3467pi c3467pi = this.A03;
        if (c3467pi != null) {
            c3467pi.A07();
        }
        A0B();
    }

    private final void A0B() {
        C1878Am bar = this.A09;
        if (bar == null) {
            return;
        }
        View childAt = bar.getChildAt(0);
        ProgressBar progressBar = childAt instanceof ProgressBar ? (ProgressBar) childAt : null;
        if (progressBar == null) {
            return;
        }
        ObjectAnimator objectAnimatorOfInt = ObjectAnimator.ofInt(progressBar, A04(245, 8, 77), 0, 10000);
        objectAnimatorOfInt.setDuration(this.A0B);
        objectAnimatorOfInt.setInterpolator(new LinearInterpolator());
        objectAnimatorOfInt.start();
        this.A00 = objectAnimatorOfInt;
    }

    private final void A0C(List<? extends C3411ol> list) {
        C2841fN c2841fNA01;
        new C7P().A0G(this.A04);
        C1920Cc c1920Cc = this.A08;
        if (c1920Cc != null) {
            c1920Cc.A0i(new C1948De(this));
        }
        LA la = super.A08;
        String[] strArr = A0H;
        if (strArr[3].length() != strArr[7].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0H;
        strArr2[3] = "TqbC5b2qVKwkDoKqqzqncjqgTvQF0";
        strArr2[7] = "ufQKY2Tjn3hzKO7QKIX5GLCCT1MVk";
        C2828fA c2828fAA31 = la.A31();
        if (c2828fAA31 == null || (c2841fNA01 = c2828fAA31.A01()) == null) {
            return;
        }
        C3757uO $this$configPortrait_u24lambda_u2410 = new C3757uO(super.A09, c2841fNA01, list.size());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, A0L);
        layoutParams.setMargins(0, A0M, 0, 0);
        $this$configPortrait_u24lambda_u2410.setLayoutParams(layoutParams);
        this.A07 = $this$configPortrait_u24lambda_u2410;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1958Do
    public final EnumC2795ec A1a(String str) {
        EnumC2795ec enumC2795ecA0E;
        C1h.A09(str, A04(253, 6, Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE));
        C17213u c17213u = this.A04;
        if (c17213u == null) {
            return EnumC2795ec.A08;
        }
        AbstractC3075jE abstractC3075jEA1I = c17213u.A1I(c17213u.getLayoutManager().A38());
        CQ cq = abstractC3075jEA1I instanceof CQ ? (CQ) abstractC3075jEA1I : null;
        if (cq == null) {
            return EnumC2795ec.A08;
        }
        ViewOnClickListenerC1981El viewOnClickListenerC1981ElA0w = cq.A0w();
        return (viewOnClickListenerC1981ElA0w == null || (enumC2795ecA0E = viewOnClickListenerC1981ElA0w.A0E(str)) == null) ? EnumC2795ec.A08 : enumC2795ecA0E;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1958Do
    public final void A1b() {
        super.A1b();
        C3467pi c3467pi = this.A03;
        if (c3467pi != null) {
            c3467pi.A06();
        }
        ObjectAnimator objectAnimator = this.A00;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        this.A00 = null;
        C1920Cc c1920Cc = this.A08;
        if (c1920Cc != null) {
            c1920Cc.A0U();
        }
        super.A0F.A0V();
        C3663ss c3663ss = this.A05;
        if (c3663ss != null) {
            c3663ss.A0O();
        }
        C1878Am c1878Am = this.A09;
        if (c1878Am != null) {
            AbstractC3523qc.A0K(c1878Am);
        }
        this.A09 = null;
        C17213u $this$onDestroy_u24lambda_u2416 = this.A04;
        if ($this$onDestroy_u24lambda_u2416 != null) {
            $this$onDestroy_u24lambda_u2416.removeAllViews();
            $this$onDestroy_u24lambda_u2416.A1U();
        }
        LinearLayout linearLayout = this.A01;
        if (linearLayout != null) {
            linearLayout.removeAllViews();
        }
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1958Do
    public final void A1g() {
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1958Do
    public final void A1h() {
        if (this.A0B > 0) {
            A0A();
            C2835fH c2835fHA0I = super.A08.A32().A0I();
            if (A0H[6].charAt(7) == 'p') {
                throw new RuntimeException();
            }
            String[] strArr = A0H;
            strArr[4] = "OqCTLN5PmavFXPyqEYGvVvlA0g0S9AhN";
            strArr[0] = "3nGN5LM01ATvfmDfPiFT5uvQnRQeu3P2";
            int iA02 = c2835fHA0I.A02();
            if (iA02 >= 0) {
                AbstractC3549r2 abstractC3549r2 = this.A0E;
                String[] strArr2 = A0H;
                String str = strArr2[3];
                String str2 = strArr2[7];
                int length = str.length();
                int secondsForNextCta = str2.length();
                if (length != secondsForNextCta) {
                    throw new RuntimeException();
                }
                A0H[2] = "m5zg";
                abstractC3549r2.setProgressSpinnerInvisible(true);
            }
            if (iA02 == 0 || iA02 >= this.A0B) {
                this.A0E.setToolbarActionMode(8);
            } else if (iA02 > 0) {
                new C3467pi(iA02, new C1947Dd(this)).A07();
            }
        } else {
            this.A0F.AHT();
            this.A0F.AH3(false);
        }
        A1f();
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1958Do
    public final void A1j(boolean z) {
        C1920Cc c1920Cc = this.A08;
        if (c1920Cc != null) {
            c1920Cc.A0U();
        }
        C3467pi c3467pi = this.A03;
        if (c3467pi != null && c3467pi.A05()) {
            c3467pi.A06();
        }
        ObjectAnimator objectAnimator = this.A00;
        if (objectAnimator != null) {
            objectAnimator.pause();
        }
        if (!z) {
            C3663ss c3663ss = this.A05;
            if (A0H[6].charAt(7) == 'p') {
                throw new RuntimeException();
            }
            A0H[1] = "JuYWyewUmON3M";
            if (c3663ss != null) {
                c3663ss.A0P();
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1958Do
    public final void A1k(boolean z) {
        C1920Cc c1920Cc = this.A08;
        if (c1920Cc != null) {
            c1920Cc.A0W();
        }
        C3467pi c3467pi = this.A03;
        if (c3467pi != null && !c3467pi.A04()) {
            c3467pi.A07();
        }
        ObjectAnimator objectAnimator = this.A00;
        if (objectAnimator != null) {
            objectAnimator.resume();
        }
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1958Do
    public final boolean A1o() {
        return false;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1958Do
    public final boolean A1p() {
        return false;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1958Do
    public final boolean A1q() {
        return true;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1958Do
    public C3694tN getFullScreenAdStyle() {
        C2841fN c2841fNA01 = super.A08.A31().A01();
        C1h.A08(c2841fNA01, A04(212, 25, 52));
        return new C3694tN(false, C3694tN.A07, c2841fNA01, ViewOnClickListenerC1981El.A05(super.A08), c2841fNA01.A08(false), null);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1958Do, android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        C1h.A09(configuration, A04(88, 6, 55));
        super.onConfigurationChanged(configuration);
        removeView(this.A01);
        setUpLayout(configuration.orientation);
    }

    private final void setUpCreditLine(int i) {
        C3663ss view = this.A05;
        if (view != null) {
            view.A0O();
            AbstractC3523qc.A0K(view);
        }
        this.A05 = null;
        C3667sw c3667sw = this.A06;
        if (A0H[6].charAt(7) == 'p') {
            throw new RuntimeException();
        }
        String[] strArr = A0H;
        strArr[4] = "WcoRPF5vTc3cekJUqnn8GRZBufuhUodG";
        strArr[0] = "gQfZyAO4l38W7boUZ3cn8kLe5AFwWHEO";
        if (c3667sw != null) {
            AbstractC3523qc.A0K(c3667sw);
        }
        this.A06 = null;
        if (super.A08.A3S() || super.A08.A3O()) {
            C3663ss creditLine = AbstractC3668sx.A01(super.A09, true, super.A08, this.A0D, super.A0D, EnumC3666sv.A03, AbstractC3665su.A00(super.A08));
            C1h.A08(creditLine, A04(Sdk.SDKError.Reason.TPAT_RETRY_FAILED_VALUE, 37, 29));
            this.A05 = creditLine;
            AbstractC3523qc.A0H(1116, creditLine);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams.addRule(12);
            layoutParams.addRule(11);
            layoutParams.setMargins(AbstractC3480pv.A00, AbstractC3480pv.A00, AbstractC3480pv.A0H, AbstractC3480pv.A0A);
            creditLine.setLayoutParams(layoutParams);
            addView(creditLine);
        }
        if (super.A08.A3U()) {
            C3667sw staticCreditLine = AbstractC3668sx.A02(super.A09, EnumC3666sv.A03, super.A08);
            C1h.A08(staticCreditLine, A04(94, 43, 0));
            this.A06 = staticCreditLine;
            staticCreditLine.setBackgroundColor(-2145637581);
            AbstractC3523qc.A0H(1117, staticCreditLine);
            RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams2.addRule(12);
            layoutParams2.addRule(9);
            layoutParams2.setMargins(AbstractC3480pv.A0H, AbstractC3480pv.A00, AbstractC3480pv.A00, AbstractC3480pv.A0A);
            staticCreditLine.setLayoutParams(layoutParams2);
            addView(staticCreditLine);
        }
        A06();
        A08();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void setUpLayout(int width) {
        String strA37;
        int iMin;
        int i;
        int childWidth;
        List<? extends C3411ol> list;
        int extraSpacing;
        int i2;
        LinearLayout linearLayout;
        LinearLayout linearLayout2 = this.A01;
        if (linearLayout2 != null) {
            linearLayout2.removeAllViews();
        }
        C17213u c17213u = this.A04;
        if (c17213u != null) {
            c17213u.removeAllViews();
            c17213u.A1U();
        }
        C3757uO c3757uO = this.A07;
        String[] strArr = A0H;
        if (strArr[4].charAt(16) == strArr[0].charAt(16)) {
            throw new RuntimeException();
        }
        A0H[1] = "0wi3zLaxSJ";
        if (c3757uO != null) {
            c3757uO.removeAllViews();
        }
        this.A01 = null;
        this.A04 = null;
        this.A07 = null;
        List<? extends C3411ol> list2 = this.A0A;
        if (list2 == null || (strA37 = super.A08.A37()) == null) {
            return;
        }
        LinearLayout linearLayout3 = new LinearLayout(getContext());
        linearLayout3.setGravity(width == 1 ? 17 : 48);
        linearLayout3.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        linearLayout3.setOrientation(1);
        this.A01 = linearLayout3;
        int extraSpacing2 = AbstractC3482px.A04.widthPixels;
        int i3 = AbstractC3482px.A04.heightPixels;
        if (width == 1) {
            int childWidth2 = A0K;
            int childSpacing = extraSpacing2 - (childWidth2 * 4);
            int childWidth3 = i3 / 2;
            iMin = Math.min(childSpacing, childWidth3);
            i = (extraSpacing2 - iMin) / 8;
            childWidth = i * 4;
        } else {
            int childSpacing2 = A0O;
            iMin = i3 - ((childSpacing2 + A0J) + (A0K * 4));
            i = A0K;
            childWidth = i * 2;
        }
        C17213u c17213u2 = new C17213u(super.A09);
        c17213u2.setLayoutParams(new RelativeLayout.LayoutParams(-1, -2));
        this.A04 = c17213u2;
        C1920Cc c1920Cc = new C1920Cc(this.A04, width, list2.size(), super.A0F, null, false);
        c1920Cc.A0k(list2);
        this.A08 = c1920Cc;
        C17213u c17213u3 = this.A04;
        if (c17213u3 != null) {
            i2 = 1;
            list = list2;
            extraSpacing = width;
            c17213u3.setAdapter(new CX(super.A09, list, super.A08, super.A0A, this.A0C, super.A0F, super.A0C, super.A0D, strA37, iMin, i, childWidth, extraSpacing, this.A08, this.A0E));
        } else {
            list = list2;
            extraSpacing = width;
            i2 = 1;
        }
        C17213u c17213u4 = this.A04;
        if (c17213u4 != null) {
            C17213u c17213u5 = this.A04;
            C1h.A06(c17213u5);
            c17213u4.A1o(c17213u5.getOnScrollListener());
        }
        if (extraSpacing == i2) {
            A0C(list);
        }
        LinearLayout linearLayout4 = this.A01;
        if (linearLayout4 != null) {
            linearLayout4.addView(this.A04);
        }
        C3757uO c3757uO2 = this.A07;
        if (c3757uO2 != null && (linearLayout = this.A01) != null) {
            linearLayout.addView(c3757uO2);
        }
        addView(this.A01, A0P);
        String[] strArr2 = A0H;
        if (strArr2[4].charAt(16) != strArr2[0].charAt(16)) {
            A0H[2] = "OOqn";
            setUpCreditLine(extraSpacing);
        } else {
            String[] strArr3 = A0H;
            strArr3[4] = "RKd4gweRPXeSLFl8w39op5SDIHtTG87v";
            strArr3[0] = "wjAYtwDVHCn8FYZfL0TBm0im3A4Jztqh";
            setUpCreditLine(extraSpacing);
        }
    }
}
