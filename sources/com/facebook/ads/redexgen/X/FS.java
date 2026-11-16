package com.facebook.ads.redexgen.X;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.facebook.ads.internal.view.FullScreenAdToolbar;
import com.vungle.ads.internal.protos.Sdk;
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: assets/audience_network/classes.dex */
public final class FS extends RelativeLayout implements InterfaceC3557rA {
    public static byte[] A0h;
    public static String[] A0i = {"57rzzR6raHrat8cHk0n2c9utIvWN6OL8", "vZo4DQACnHxpUIABCEPhLIrXR", "3pKkUgRnbq5D8", "3oPHUcYdGBLGT6sjvwgTS6nCZs8dHXKK", "yMOWmEDq6oq3Yf8aoY", "BRjJ0geTmUVj6Aeo1VqVThKYcHpwhF7A", "bCnfD5Zsza6fNT9UI62TNCVdI9Gt63Qd", "0XbQU4AacrxlEwxF12eBigHvJ8"};
    public static final int A0j;
    public static final int A0k;
    public static final int A0l;
    public static final int A0m;
    public static final int A0n;
    public static final int A0o;
    public static final RelativeLayout.LayoutParams A0p;
    public View A00;
    public LinearLayout A01;
    public RelativeLayout A02;
    public RelativeLayout A03;
    public RelativeLayout A04;
    public Toast A05;
    public C3095jY A06;
    public C3467pi A07;
    public C3663ss A08;
    public C3667sw A09;
    public ViewOnClickListenerC1981El A0A;
    public C2973hX A0B;
    public C2911gV A0C;
    public String A0D;
    public String A0E;
    public boolean A0F;
    public boolean A0G;
    public boolean A0H;
    public boolean A0I;
    public boolean A0J;
    public boolean A0K;
    public boolean A0L;
    public boolean A0M;
    public final Handler A0N;
    public final LA A0O;
    public final C2855fb A0P;
    public final InterfaceC3101je A0Q;
    public final C2055Hi A0R;
    public final InterfaceC3321nG A0S;
    public final C3329nO A0T;
    public final C3467pi A0U;
    public final ViewOnSystemUiVisibilityChangeListenerC3509qO A0V;
    public final InterfaceC3556r9 A0W;
    public final InterfaceC3612s3 A0X;
    public final InterfaceC3755uM A0Y;
    public final C3756uN A0Z;
    public final C2967hR A0a;
    public final AtomicBoolean A0b;
    public final AtomicBoolean A0c;
    public final boolean A0d;
    public final boolean A0e;
    public final boolean A0f;
    public final AbstractC3549r2 A0g;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public FS(C2055Hi c2055Hi, InterfaceC3321nG interfaceC3321nG, InterfaceC3556r9 interfaceC3556r9, LA la, String str, InterfaceC3612s3 interfaceC3612s3, boolean z) {
        super(c2055Hi);
        String strA0D = A0D(0, 0, 66);
        this.A0E = strA0D;
        this.A0D = strA0D;
        this.A0Q = new FZ(this);
        this.A0c = new AtomicBoolean(false);
        this.A0b = new AtomicBoolean(false);
        this.A0K = false;
        this.A0M = true;
        this.A0H = false;
        this.A0G = false;
        this.A0N = new Handler(Looper.getMainLooper());
        this.A0F = false;
        this.A0f = z;
        this.A0R = c2055Hi;
        this.A0W = interfaceC3556r9;
        this.A0S = interfaceC3321nG;
        this.A0O = la;
        this.A0P = la.A32().A0I().A07();
        this.A0T = new C3329nO(this.A0O.A37(), this.A0S);
        this.A0X = interfaceC3612s3;
        this.A0C = new C2911gV(c2055Hi, this.A0X, str, this.A0W);
        if (la.A32().A0I().A07() != null) {
            this.A0I = la.A32().A0I().A07().A0c();
            this.A0E = la.A32().A0I().A07().A0P();
            this.A0D = la.A32().A0I().A07().A0O();
        }
        this.A0J = this.A0O.A32().A0T() && this.A0O.A32().A0I().A03() > 0;
        this.A0e = this.A0O.A32().A0I().A0B();
        if (this.A0P == null) {
            this.A0W.A5C(this.A0X.A8c());
            this.A0W.A5C(this.A0X.A8X());
        }
        int iA03 = this.A0P != null ? !this.A0P.A0h() ? (this.A0J && this.A0e) ? this.A0O.A32().A0I().A03() : this.A0P.A0C() : this.A0P.A0E() : 0;
        this.A0c.set(!this.A0P.A0Z());
        FZ fz = null;
        this.A0U = new C3467pi(iA03, new FU(this, fz));
        this.A0d = C3300mv.A0m(this.A0R);
        this.A0g = A07();
        if (this.A0P.A0h()) {
            this.A0g.A09();
        }
        this.A0a = new C2967hR(this.A0R, this.A0S, this.A0O);
        String strA08 = la.A32().A0I().A08();
        if (strA08 != null) {
            AbstractC3765uW.A00(c2055Hi, this, strA08);
        }
        this.A0V = new ViewOnSystemUiVisibilityChangeListenerC3509qO(this);
        this.A0V.A05(EnumC3508qN.A03);
        if (C3300mv.A2L(this.A0R)) {
            this.A0g.setProgressSpinnerInvisible(true);
        }
        FT ft = new FT(this, fz);
        HashMap map = new HashMap();
        map.put(A0D(56, 9, 37), this.A0X.A9O());
        this.A0B = new C2973hX(this.A0R, this.A0O, this.A0P, this.A0S, ft, map);
        A0K();
        this.A0W.A4V(this, new RelativeLayout.LayoutParams(-1, -1));
        A0H();
        this.A0Y = new FY(this);
        this.A0Z = new C3756uN(this.A0R, this.A0g, this.A0O, (C1896Be) null, this.A0W, this.A0Y, this.A0A, this.A02, this.A0B);
        if (Build.VERSION.SDK_INT >= 35) {
            setFitsSystemWindows(true);
        }
        if (this.A0P.A0h()) {
            this.A0R.A0F().AFX();
        }
    }

    public static String A0D(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0h, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 40);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A0P() {
        A0h = new byte[]{-98, 112, -4, 20, 6, 4, 20, -2, -77, -68, -71, -77, -69, -81, -65, -62, -71, -73, -71, -66, -17, -8, -11, -17, -9, -21, -1, -5, 1, -2, -17, -15, -60, -55, -49, -64, -51, -50, -49, -60, -49, -60, -68, -57, -45, -58, -39, -50, -37, -54, -60, -56, -47, -50, -56, -48, -67, -71, -82, -80, -78, -70, -78, -69, -63, -85, -98, -80, -102, -85, -99, -98, -99, -104, -81, -94, -99, -98, -88, -39, -57, -60, -40, -53, -57, -39, -63, -59, -50, -53, -59, -51};
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC3557rA
    public final /* synthetic */ void onStart() {
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC3557rA
    public final /* synthetic */ void onStop() {
    }

    static {
        A0P();
        A0p = new RelativeLayout.LayoutParams(-1, -1);
        A0k = AbstractC3480pv.A0P;
        A0l = AbstractC3480pv.A0A;
        A0o = AbstractC3480pv.A08;
        A0m = AbstractC3480pv.A06;
        A0n = AbstractC2938gx.A02(-1, 77);
        A0j = AbstractC3480pv.A0X;
    }

    public FS(C2055Hi c2055Hi, InterfaceC3321nG interfaceC3321nG, InterfaceC3556r9 interfaceC3556r9, LA la, String str, InterfaceC3612s3 interfaceC3612s3) {
        this(c2055Hi, interfaceC3321nG, interfaceC3556r9, la, str, interfaceC3612s3, false);
    }

    private FullScreenAdToolbar A07() {
        FullScreenAdToolbar fullScreenAdToolbar = new FullScreenAdToolbar(this.A0R, this.A0W, this.A0T, 0, this.A0O.A2u(), this.A0I);
        fullScreenAdToolbar.setFullscreen(true);
        fullScreenAdToolbar.A0D(this.A0O.A31().A01(), ViewOnClickListenerC1981El.A05(this.A0O));
        fullScreenAdToolbar.setPageDetailsVisible(false);
        fullScreenAdToolbar.setPageDetails(this.A0O.A35(), this.A0O.A37(), this.A0P.A0C(), this.A0O.A36());
        fullScreenAdToolbar.setToolbarListener(new FV(this));
        return fullScreenAdToolbar;
    }

    private ViewOnClickListenerC1981El A09() {
        if (this.A0B == null || this.A0B.getViewabilityChecker() == null || this.A0B.getTouchDataRecorder() == null) {
            return null;
        }
        ViewOnClickListenerC1981El viewOnClickListenerC1981El = new ViewOnClickListenerC1981El(this.A0R, this.A0X.A7x(), this.A0O.A31().A01(), this.A0S, this.A0W, this.A0B.getViewabilityChecker(), this.A0B.getTouchDataRecorder(), this.A0O.A33());
        AbstractC3523qc.A0L(viewOnClickListenerC1981El);
        viewOnClickListenerC1981El.setText(this.A0O.A32().A0K().A05());
        viewOnClickListenerC1981El.setTextSize(14.0f);
        viewOnClickListenerC1981El.setPadding(AbstractC3480pv.A02, AbstractC3480pv.A02, AbstractC3480pv.A02, AbstractC3480pv.A02);
        viewOnClickListenerC1981El.setOnClickListener(new ViewOnClickListenerC3582rZ(this));
        return viewOnClickListenerC1981El;
    }

    private C3764uV A0B() {
        C3764uV c3764uV = new C3764uV(this.A0R, this.A0O.A31().A01(), true, !this.A0J ? 16 : 17, !this.A0J ? 14 : 13, 0);
        c3764uV.A04(this.A0O.A32().A0J().A0H(), this.A0O.A32().A0J().A0G(), null, false, true);
        TextView descriptionTv = c3764uV.getDescriptionTextView();
        descriptionTv.setAlpha(0.8f);
        descriptionTv.setMaxLines(1);
        descriptionTv.setEllipsize(TextUtils.TruncateAt.END);
        TextView descriptionTv2 = c3764uV.getTitleTextView();
        descriptionTv2.setMaxLines(1);
        descriptionTv2.setEllipsize(TextUtils.TruncateAt.END);
        return c3764uV;
    }

    private void A0G() {
        String strA01;
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(A0k, A0k);
        layoutParams.addRule(15);
        layoutParams.addRule(9);
        C3758uP c3758uP = new C3758uP(this.A0R);
        AbstractC3523qc.A0O(c3758uP, 0);
        AbstractC3523qc.A0L(c3758uP);
        new AsyncTaskC1989Et(c3758uP, this.A0R).A05(A0k, A0k).A07(this.A0O.A35().A01());
        TextView textView = new TextView(this.A0R);
        AbstractC3523qc.A0L(textView);
        textView.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        textView.setTextColor(this.A0O.A31().A01().A07(true));
        textView.setText(this.A0O.A32().A0J().A0H());
        textView.setTextSize(!this.A0I ? 16.0f : 17.0f);
        textView.setMaxLines(1);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        C3760uR c3760uR = new C3760uR(this.A0R, !this.A0I ? A0o : A0m, 5, A0n, -1);
        c3760uR.setGravity(16);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -1);
        TextView titleView = new TextView(this.A0R);
        titleView.setTextColor(this.A0O.A31().A01().A07(true));
        titleView.setGravity(16);
        titleView.setIncludeFontPadding(false);
        if (!this.A0I) {
            titleView.setTextSize(13.0f);
        }
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -1);
        layoutParams3.leftMargin = AbstractC3480pv.A0X;
        LinearLayout linearLayout = new LinearLayout(this.A0R);
        linearLayout.setOrientation(0);
        linearLayout.setGravity(16);
        RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(-2, A0l);
        layoutParams4.topMargin = AbstractC3480pv.A0X / 2;
        layoutParams4.addRule(3, textView.getId());
        linearLayout.addView(c3760uR, layoutParams2);
        linearLayout.addView(titleView, layoutParams3);
        RelativeLayout.LayoutParams ratingInfoContainerParams = new RelativeLayout.LayoutParams(-2, -2);
        ratingInfoContainerParams.leftMargin = AbstractC3480pv.A0X;
        ratingInfoContainerParams.addRule(1, c3758uP.getId());
        ratingInfoContainerParams.addRule(15);
        RelativeLayout relativeLayout = new RelativeLayout(getContext());
        relativeLayout.addView(linearLayout, layoutParams4);
        relativeLayout.addView(textView);
        if (this.A04 != null) {
            this.A04.removeAllViews();
            this.A04.addView(relativeLayout, ratingInfoContainerParams);
            this.A04.addView(c3758uP, layoutParams);
        }
        if (TextUtils.isEmpty(this.A0O.A32().A0J().A0D())) {
            linearLayout.setVisibility(8);
            return;
        }
        linearLayout.setVisibility(0);
        if (A0i[7].length() == 4) {
            throw new RuntimeException();
        }
        A0i[7] = "eZ";
        c3760uR.setRating(Float.parseFloat(this.A0O.A32().A0J().A0D()));
        if (this.A0O.A32().A0J().A0A() == null) {
            return;
        }
        StringBuilder ratingSB = new StringBuilder();
        ratingSB.append(A0D(0, 1, 78));
        if (!this.A0I) {
            strA01 = NumberFormat.getNumberInstance().format(Integer.parseInt(this.A0O.A32().A0J().A0A()));
        } else {
            strA01 = AbstractC3492q7.A01(Integer.parseInt(this.A0O.A32().A0J().A0A()));
        }
        ratingSB.append(strA01);
        ratingSB.append(A0D(1, 1, 31));
        titleView.setText(ratingSB.toString());
    }

    private void A0H() {
        if (this.A0P.A0Z()) {
            A0J();
        } else {
            A0O();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0I() {
        this.A0L = true;
        if (this.A0O.A32().A0T()) {
            this.A0C.A06();
            this.A0W.A5D(this.A0X.A7L(), new C5Y(0, 0));
        }
    }

    private void A0J() {
        C3596rn c3596rnA0F = new C3598rp(this.A0R, this.A0O.A32().A0J(), this.A0O.A35()).A0A(this.A0O.A31().A01()).A0D(this.A0P.A0R()).A0C(this.A0P.A0L()).A09(2000).A0E(this.A0I).A0B(this.A0E).A0F();
        AbstractC3331nQ.A04(c3596rnA0F, this.A0T, EnumC3328nN.A0U);
        addView(c3596rnA0F, A0p);
        c3596rnA0F.A04(new FX(this));
    }

    private void A0K() {
        RelativeLayout.LayoutParams layoutParams;
        this.A0A = A09();
        this.A02 = new RelativeLayout(getContext());
        AbstractC3523qc.A0L(this.A02);
        this.A04 = new RelativeLayout(getContext());
        AbstractC3523qc.A0L(this.A04);
        if (this.A0d) {
            A0G();
        } else {
            RelativeLayout relativeLayout = this.A04;
            C3764uV c3764uVA0B = A0B();
            RelativeLayout.LayoutParams iconAndMetaDataContainerParams = new RelativeLayout.LayoutParams(-2, -2);
            relativeLayout.addView(c3764uVA0B, iconAndMetaDataContainerParams);
        }
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams2.setMargins(0, 0, AbstractC3480pv.A0A, 0);
        this.A02.addView(this.A04, layoutParams2);
        if (this.A0A != null) {
            layoutParams2.addRule(0, this.A0A.getId());
            if (!this.A0I) {
                layoutParams = new RelativeLayout.LayoutParams(-2, -2);
                layoutParams.addRule(6, this.A04.getId());
                layoutParams.addRule(8, this.A04.getId());
            } else {
                layoutParams = new RelativeLayout.LayoutParams(-2, -2);
                AbstractC3523qc.A0W(this.A0A, AbstractC3523qc.A06(-16738826, A0j));
                this.A0A.setStateListAnimator(null);
                this.A0A.setPadding(AbstractC3480pv.A0C, AbstractC3480pv.A07, AbstractC3480pv.A0C, AbstractC3480pv.A07);
                AbstractC3523qc.A0a(this.A0A);
            }
            layoutParams.addRule(11);
            this.A02.addView(this.A0A, layoutParams);
        }
        AbstractC3523qc.A0L(this.A0g);
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams3.addRule(10);
        this.A01 = new LinearLayout(getContext());
        AbstractC3523qc.A0L(this.A01);
        RelativeLayout.LayoutParams adWebViewParams = new RelativeLayout.LayoutParams(-2, -2);
        adWebViewParams.setMargins(AbstractC3480pv.A0A, AbstractC3480pv.A06, AbstractC3480pv.A0A, AbstractC3480pv.A06);
        adWebViewParams.addRule(12);
        this.A01.setOrientation(1);
        RelativeLayout.LayoutParams toolbarParams = new RelativeLayout.LayoutParams(-1, -1);
        toolbarParams.setMargins(AbstractC3480pv.A0A, 0, AbstractC3480pv.A0A, 0);
        toolbarParams.addRule(3, this.A0g.getId());
        toolbarParams.addRule(2, this.A01.getId());
        this.A01.addView(this.A02, new RelativeLayout.LayoutParams(-2, -2));
        this.A03 = new RelativeLayout(getContext());
        AbstractC3523qc.A0L(this.A03);
        this.A01.addView(this.A03);
        if (this.A0O.A3F()) {
            this.A0g.A08();
            A0M();
        }
        if (this.A0O.A3U()) {
            A0L();
        }
        this.A0g.setVisibility(4);
        this.A0B.setVisibility(4);
        this.A02.setVisibility(4);
        addView(this.A0g, layoutParams3);
        addView(this.A0B, toolbarParams);
        addView(this.A01, adWebViewParams);
        if (this.A0P.A0d()) {
            this.A0B.A0C();
        }
    }

    private void A0L() {
        this.A09 = AbstractC3668sx.A02(this.A0R, EnumC3666sv.A03, this.A0O);
        AbstractC3523qc.A0L(this.A09);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(9);
        layoutParams.topMargin = AbstractC3480pv.A0A;
        this.A03.addView(this.A09, layoutParams);
    }

    private void A0M() {
        this.A08 = AbstractC3668sx.A01(this.A0R, true, this.A0O, this.A0T, this.A0W, EnumC3666sv.A03, AbstractC3665su.A00(this.A0O));
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(11);
        layoutParams.topMargin = AbstractC3480pv.A0A;
        this.A03.addView(this.A08, layoutParams);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:18:0x0081  */
    /* JADX WARN: Code duplicated, block: B:20:0x0091  */
    /* JADX WARN: Code duplicated, block: B:22:0x009a  */
    /* JADX WARN: Code duplicated, block: B:25:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:29:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:31:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:33:0x0105  */
    /* JADX WARN: Code duplicated, block: B:34:0x0109  */
    /* JADX WARN: Code duplicated, block: B:37:0x011f A[PHI: r1 r3
  0x011f: PHI (r1v13 int) = (r1v8 int), (r1v24 int) binds: [B:35:0x011b, B:26:0x00d5] A[DONT_GENERATE, DONT_INLINE]
  0x011f: PHI (r3v4 int) = (r3v2 int), (r3v7 int) binds: [B:35:0x011b, B:26:0x00d5] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:39:0x012c  */
    /* JADX WARN: Code duplicated, block: B:41:0x0141  */
    /* JADX WARN: Code duplicated, block: B:43:0x014f  */
    /* JADX WARN: Code duplicated, block: B:45:0x015b  */
    /* JADX WARN: Code duplicated, block: B:46:0x0165 A[PHI: r1 r3
  0x0165: PHI (r1v9 int) = (r1v8 int), (r1v24 int) binds: [B:35:0x011b, B:26:0x00d5] A[DONT_GENERATE, DONT_INLINE]
  0x0165: PHI (r3v3 int) = (r3v2 int), (r3v7 int) binds: [B:35:0x011b, B:26:0x00d5] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:48:0x0177  */
    /* JADX WARN: Code duplicated, block: B:50:0x0191  */
    /* JADX WARN: Code duplicated, block: B:51:0x019f  */
    /* JADX WARN: Code duplicated, block: B:52:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:54:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:56:0x01e2  */
    /* JADX WARN: Code duplicated, block: B:58:0x01f1  */
    /* JADX WARN: Code duplicated, block: B:60:0x0201  */
    /* JADX WARN: Code duplicated, block: B:64:? A[RETURN, SYNTHETIC] */
    public void A0N() {
        int[] iArr;
        Object obj;
        String[] strArr;
        int i;
        int i2;
        int i3;
        RelativeLayout.LayoutParams layoutParams;
        RelativeLayout.LayoutParams screenshotParams;
        RelativeLayout.LayoutParams layoutParams2;
        int id;
        InterfaceC2737df interfaceC2737dfA0F;
        int i4;
        boolean z;
        if (this.A0O.A3F() && this.A08 != null) {
            this.A08.A0P();
            if (this.A0O.A3S()) {
                AbstractC3665su.A05(this.A0R, EnumC3666sv.A02);
            } else {
                AbstractC3665su.A06(this.A0R, EnumC3666sv.A02);
            }
        }
        if (this.A0O.A3U() && this.A09 != null) {
            C2055Hi c2055Hi = this.A0R;
            EnumC3666sv enumC3666sv = EnumC3666sv.A02;
            if (A0i[5].charAt(2) != 'm') {
                A0i[0] = "6k4i0rLafWNu6HrnPvo1bAEbeaagXJGg";
                AbstractC3665su.A07(c2055Hi, enumC3666sv);
                new C3329nO(this.A0O.A37(), this.A0S).A04(EnumC3328nN.A1D, null);
                this.A0b.set(true);
                AbstractC3523qc.A0X(this);
                AbstractC3523qc.A0I(this.A0B);
                AbstractC3523qc.A0e(this.A0Z, this.A00, this.A0B);
                if (this.A0I) {
                    z = this.A0d;
                    if (A0i[5].charAt(2) != 'm') {
                        A0i[7] = "zEEZOPKoSNVBjVMgZJuGrCvhSdzM";
                        if (z) {
                            AbstractC3523qc.A0I(this.A0g);
                        }
                    }
                } else {
                    AbstractC3523qc.A0M(this.A0g);
                }
                AbstractC3523qc.A0M(this.A0A);
                Pair<EnumC2968hS, View> pairA03 = this.A0a.A03(this.A0A);
                this.A00 = (View) pairA03.second;
                iArr = C3583ra.A00;
                obj = pairA03.first;
                strArr = A0i;
                if (strArr[3].charAt(19) != strArr[6].charAt(19)) {
                    i4 = iArr[((EnumC2968hS) obj).ordinal()];
                    i2 = 8;
                    i3 = -1;
                    switch (i4) {
                        case 1:
                            layoutParams = new RelativeLayout.LayoutParams(i3, i3);
                            layoutParams.setMargins(0, this.A0g.getToolbarHeight(), 0, 0);
                            if (!this.A0I) {
                                AbstractC3523qc.A0M(this.A02);
                                layoutParams.addRule(2, this.A01.getId());
                                if (A0i[7].length() != 4) {
                                    addView(this.A00, layoutParams);
                                } else {
                                    A0i[0] = "icoWBTg9rYjeEkG7v6VzgCyo6GWZLUtb";
                                    addView(this.A00, layoutParams);
                                }
                            } else {
                                View c3703tW = new C3703tW(this.A0R, this.A0O.A35(), this.A0O.A32().A0J(), A09(), this.A0D, new ViewOnClickListenerC3581rY(this));
                                screenshotParams = new RelativeLayout.LayoutParams(i3, i3);
                                if (this.A0O.A3F()) {
                                    screenshotParams.addRule(2, this.A01.getId());
                                    if (this.A02 != null) {
                                        AbstractC3523qc.A0P(this.A02, i2);
                                    }
                                }
                                addView(c3703tW, screenshotParams);
                                removeView(this.A0g);
                            }
                            break;
                        case 2:
                            layoutParams2 = new RelativeLayout.LayoutParams(i3, i3);
                            if (this.A0O.A3F()) {
                                id = this.A01.getId();
                                if (A0i[0].charAt(29) != 'D') {
                                    throw new RuntimeException();
                                }
                                A0i[5] = "VAHNC1P4RBkuL3irqbFU8y6RUzC9H5KG";
                                layoutParams2.addRule(2, id);
                                if (this.A02 != null) {
                                    AbstractC3523qc.A0P(this.A02, i2);
                                }
                            } else {
                                AbstractC3523qc.A0e(this.A01);
                            }
                            addView(this.A00, layoutParams2);
                            break;
                    }
                } else {
                    A0i[5] = "CWd9rKrOeQbDNpEihJyRkvyhU2YuIgjh";
                    i = iArr[((EnumC2968hS) obj).ordinal()];
                    i2 = 8;
                    i3 = -1;
                    switch (i) {
                        case 1:
                            layoutParams = new RelativeLayout.LayoutParams(i3, i3);
                            layoutParams.setMargins(0, this.A0g.getToolbarHeight(), 0, 0);
                            if (!this.A0I) {
                                AbstractC3523qc.A0M(this.A02);
                                layoutParams.addRule(2, this.A01.getId());
                                if (A0i[7].length() != 4) {
                                    addView(this.A00, layoutParams);
                                } else {
                                    A0i[0] = "icoWBTg9rYjeEkG7v6VzgCyo6GWZLUtb";
                                    addView(this.A00, layoutParams);
                                }
                            } else {
                                View c3703tW2 = new C3703tW(this.A0R, this.A0O.A35(), this.A0O.A32().A0J(), A09(), this.A0D, new ViewOnClickListenerC3581rY(this));
                                screenshotParams = new RelativeLayout.LayoutParams(i3, i3);
                                if (this.A0O.A3F()) {
                                    screenshotParams.addRule(2, this.A01.getId());
                                    if (this.A02 != null) {
                                        AbstractC3523qc.A0P(this.A02, i2);
                                    }
                                }
                                addView(c3703tW2, screenshotParams);
                                removeView(this.A0g);
                            }
                            break;
                        case 2:
                            layoutParams2 = new RelativeLayout.LayoutParams(i3, i3);
                            if (this.A0O.A3F()) {
                                id = this.A01.getId();
                                if (A0i[0].charAt(29) != 'D') {
                                    throw new RuntimeException();
                                }
                                A0i[5] = "VAHNC1P4RBkuL3irqbFU8y6RUzC9H5KG";
                                layoutParams2.addRule(2, id);
                                if (this.A02 != null) {
                                    AbstractC3523qc.A0P(this.A02, i2);
                                }
                            } else {
                                AbstractC3523qc.A0e(this.A01);
                            }
                            addView(this.A00, layoutParams2);
                            break;
                    }
                }
                if (this.A0P.A0h()) {
                    interfaceC2737dfA0F = this.A0R.A0F();
                    if (A0i[0].charAt(29) != 'D') {
                        String[] strArr2 = A0i;
                        strArr2[3] = "r0g43FXfQnx9t7rigJmT6UuKbf0C8Pnv";
                        strArr2[6] = "P4UbBzaC1s2Wo3EeRciTBjjQYhuDTIDZ";
                        interfaceC2737dfA0F.AFS();
                        return;
                    }
                    interfaceC2737dfA0F.AFS();
                    return;
                }
                return;
            }
        } else {
            new C3329nO(this.A0O.A37(), this.A0S).A04(EnumC3328nN.A1D, null);
            this.A0b.set(true);
            AbstractC3523qc.A0X(this);
            AbstractC3523qc.A0I(this.A0B);
            AbstractC3523qc.A0e(this.A0Z, this.A00, this.A0B);
            if (this.A0I) {
                z = this.A0d;
                if (A0i[5].charAt(2) != 'm') {
                    A0i[7] = "zEEZOPKoSNVBjVMgZJuGrCvhSdzM";
                    if (z) {
                        AbstractC3523qc.A0I(this.A0g);
                    }
                }
            } else {
                AbstractC3523qc.A0M(this.A0g);
            }
            AbstractC3523qc.A0M(this.A0A);
            Pair<EnumC2968hS, View> pairA04 = this.A0a.A03(this.A0A);
            this.A00 = (View) pairA04.second;
            iArr = C3583ra.A00;
            obj = pairA04.first;
            strArr = A0i;
            if (strArr[3].charAt(19) != strArr[6].charAt(19)) {
                i4 = iArr[((EnumC2968hS) obj).ordinal()];
                i2 = 8;
                i3 = -1;
                switch (i4) {
                    case 1:
                        layoutParams = new RelativeLayout.LayoutParams(i3, i3);
                        layoutParams.setMargins(0, this.A0g.getToolbarHeight(), 0, 0);
                        if (!this.A0I) {
                            AbstractC3523qc.A0M(this.A02);
                            layoutParams.addRule(2, this.A01.getId());
                            if (A0i[7].length() != 4) {
                                addView(this.A00, layoutParams);
                            } else {
                                A0i[0] = "icoWBTg9rYjeEkG7v6VzgCyo6GWZLUtb";
                                addView(this.A00, layoutParams);
                            }
                        } else {
                            View c3703tW3 = new C3703tW(this.A0R, this.A0O.A35(), this.A0O.A32().A0J(), A09(), this.A0D, new ViewOnClickListenerC3581rY(this));
                            screenshotParams = new RelativeLayout.LayoutParams(i3, i3);
                            if (this.A0O.A3F()) {
                                screenshotParams.addRule(2, this.A01.getId());
                                if (this.A02 != null) {
                                    AbstractC3523qc.A0P(this.A02, i2);
                                }
                            }
                            addView(c3703tW3, screenshotParams);
                            removeView(this.A0g);
                        }
                        break;
                    case 2:
                        layoutParams2 = new RelativeLayout.LayoutParams(i3, i3);
                        if (this.A0O.A3F()) {
                            id = this.A01.getId();
                            if (A0i[0].charAt(29) != 'D') {
                                throw new RuntimeException();
                            }
                            A0i[5] = "VAHNC1P4RBkuL3irqbFU8y6RUzC9H5KG";
                            layoutParams2.addRule(2, id);
                            if (this.A02 != null) {
                                AbstractC3523qc.A0P(this.A02, i2);
                            }
                        } else {
                            AbstractC3523qc.A0e(this.A01);
                        }
                        addView(this.A00, layoutParams2);
                        break;
                }
            } else {
                A0i[5] = "CWd9rKrOeQbDNpEihJyRkvyhU2YuIgjh";
                i = iArr[((EnumC2968hS) obj).ordinal()];
                i2 = 8;
                i3 = -1;
                switch (i) {
                    case 1:
                        layoutParams = new RelativeLayout.LayoutParams(i3, i3);
                        layoutParams.setMargins(0, this.A0g.getToolbarHeight(), 0, 0);
                        if (!this.A0I) {
                            AbstractC3523qc.A0M(this.A02);
                            layoutParams.addRule(2, this.A01.getId());
                            if (A0i[7].length() != 4) {
                                addView(this.A00, layoutParams);
                            } else {
                                A0i[0] = "icoWBTg9rYjeEkG7v6VzgCyo6GWZLUtb";
                                addView(this.A00, layoutParams);
                            }
                        } else {
                            View c3703tW4 = new C3703tW(this.A0R, this.A0O.A35(), this.A0O.A32().A0J(), A09(), this.A0D, new ViewOnClickListenerC3581rY(this));
                            screenshotParams = new RelativeLayout.LayoutParams(i3, i3);
                            if (this.A0O.A3F()) {
                                screenshotParams.addRule(2, this.A01.getId());
                                if (this.A02 != null) {
                                    AbstractC3523qc.A0P(this.A02, i2);
                                }
                            }
                            addView(c3703tW4, screenshotParams);
                            removeView(this.A0g);
                        }
                        break;
                    case 2:
                        layoutParams2 = new RelativeLayout.LayoutParams(i3, i3);
                        if (this.A0O.A3F()) {
                            id = this.A01.getId();
                            if (A0i[0].charAt(29) != 'D') {
                                throw new RuntimeException();
                            }
                            A0i[5] = "VAHNC1P4RBkuL3irqbFU8y6RUzC9H5KG";
                            layoutParams2.addRule(2, id);
                            if (this.A02 != null) {
                                AbstractC3523qc.A0P(this.A02, i2);
                            }
                        } else {
                            AbstractC3523qc.A0e(this.A01);
                        }
                        addView(this.A00, layoutParams2);
                        break;
                }
            }
            if (this.A0P.A0h()) {
                interfaceC2737dfA0F = this.A0R.A0F();
                if (A0i[0].charAt(29) != 'D') {
                    String[] strArr3 = A0i;
                    strArr3[3] = "r0g43FXfQnx9t7rigJmT6UuKbf0C8Pnv";
                    strArr3[6] = "P4UbBzaC1s2Wo3EeRciTBjjQYhuDTIDZ";
                    interfaceC2737dfA0F.AFS();
                    return;
                }
                interfaceC2737dfA0F.AFS();
                return;
            }
            return;
        }
        throw new RuntimeException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0O() {
        AbstractC3523qc.A0X(this);
        if (!this.A0P.A0d()) {
            C2973hX c2973hX = this.A0B;
            if (A0i[4].length() != 18) {
                throw new RuntimeException();
            }
            String[] strArr = A0i;
            strArr[1] = "xj34PAIXy0BC0JvFurkBkOtWc";
            strArr[2] = "hWQrQPNffHRqy";
            c2973hX.A0C();
        }
        this.A0g.setVisibility(0);
        this.A0B.setVisibility(0);
        if (this.A02 != null) {
            RelativeLayout relativeLayout = this.A02;
            if (A0i[7].length() != 4) {
                A0i[7] = "GHPvfAAYCmFSIETbcdzzC0huzOqb6N";
                relativeLayout.setVisibility(0);
            } else {
                String[] strArr2 = A0i;
                strArr2[3] = "tvYjLA1oGXNhTHZAIhYTsER90pYUTPum";
                strArr2[6] = "jKhXSIgEZQzlredWxanTIzgk7i5P2ie1";
                relativeLayout.setVisibility(0);
            }
        }
        this.A0R.A0F().A3s();
        if (this.A0A != null && this.A0O.A2x() > 0 && this.A07 == null) {
            this.A07 = new C3467pi(this.A0O.A2x(), new FW(this));
            this.A07.A07();
        }
        this.A0U.A07();
        if (this.A08 != null && this.A0O.A3O()) {
            this.A08.A0Q();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0Q(int i) {
        String strValueOf = String.valueOf(i);
        Toast toast = this.A05;
        String strA0K = this.A0P.A0K();
        String progress = A0D(2, 6, Sdk.SDKError.Reason.TPAT_ERROR_VALUE);
        AbstractC3523qc.A0c(toast, strA0K.replace(progress, strValueOf), 49, 0, AbstractC3480pv.A0V);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0W(boolean z, String str) {
        this.A0H = true;
        HashMap map = new HashMap();
        map.put(A0D(8, 12, 40), z ? A0D(79, 13, 58) : A0D(44, 12, 61));
        map.put(A0D(20, 12, 100), str);
        C3741u8 c3741u8 = new C3741u8(this.A0R, this.A0X.A7x(), this.A0B.getViewabilityChecker(), this.A0B.getTouchDataRecorder(), this.A0S, this.A0O.A33(), this.A0W);
        c3741u8.A0A(this.A0O);
        c3741u8.A06(this.A0O.A37(), this.A0O.A32().A0K().A06(), map);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean A0X() {
        if (!this.A0O.A1c().equals(A0D(65, 14, 17))) {
            if (this.A0O.A1c().equals(A0D(32, 12, 51))) {
                LA la = this.A0O;
                if (A0i[4].length() != 18) {
                    throw new RuntimeException();
                }
                A0i[0] = "r5y7OBqhAYVA47bIfl4AlIWKO2XfiX80";
                if (la.A32().A0W()) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean A0Y() {
        return this.A0e && !this.A0K && !this.A0M && this.A0P.A0C() < this.A0O.A32().A0I().A03();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC3557rA
    public final void ABc(Intent intent, Bundle bundle, C3095jY c3095jY) {
        this.A06 = c3095jY;
        this.A06.A0A(this.A0Q);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC3557rA
    public final void AGF(boolean z) {
        this.A0U.A06();
        this.A0G = true;
        if (!this.A0F && !z) {
            C3663ss c3663ss = this.A08;
            if (A0i[4].length() != 18) {
                throw new RuntimeException();
            }
            String[] strArr = A0i;
            strArr[3] = "khoeLKhAkDTHqtvHh44TDBpYJbcg0vVG";
            strArr[6] = "EayQQNVlJFU2ogZcZ4XThOAwKTaD1bU7";
            if (c3663ss != null) {
                this.A08.A0P();
            }
        }
        this.A0F = false;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC3557rA
    public final void AGp(boolean z) {
        if (this.A0e && this.A0M) {
            return;
        }
        boolean z2 = this.A0K;
        if (A0i[5].charAt(2) == 'm') {
            throw new RuntimeException();
        }
        A0i[0] = "UQp6GtSKm4mkcrS1rXAjxFqYQJcA6U4M";
        if (!z2 && this.A0c.get() && !this.A0U.A05()) {
            this.A0U.A07();
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC3557rA
    public final void AKD(Bundle bundle) {
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC3557rA
    public String getCurrentClientToken() {
        return this.A0O.A37();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC3557rA
    public final boolean onActivityResult(int i, int i2, Intent intent) {
        return false;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (Build.VERSION.SDK_INT >= 35) {
            setFitsSystemWindows(true);
        }
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0033  */
    /* JADX WARN: Code duplicated, block: B:14:0x003f  */
    /* JADX WARN: Code duplicated, block: B:17:0x007b  */
    /* JADX WARN: Code duplicated, block: B:20:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:22:0x00b2  */
    @Override // com.facebook.ads.redexgen.X.InterfaceC3557rA
    public final void onDestroy() {
        C2973hX c2973hX;
        String[] strArr;
        this.A0V.A03();
        if (this.A08 != null) {
            this.A08.A0O();
        }
        if (this.A06 != null) {
            C3095jY c3095jY = this.A06;
            if (A0i[0].charAt(29) != 'D') {
                A0i[0] = "voPpcOtL9PQSCLq1wYvqOCQr8JaLbGKq";
                c3095jY.A0B(this.A0Q);
                if (this.A0B != null) {
                    if (!TextUtils.isEmpty(this.A0O.A37())) {
                        this.A0S.ABt(this.A0O.A37(), new C3715ti().A05(this.A0B.getViewabilityChecker()).A04(this.A0B.getTouchDataRecorder()).A07());
                    }
                    c2973hX = this.A0B;
                    strArr = A0i;
                    if (strArr[1].length() != strArr[2].length()) {
                        String[] strArr2 = A0i;
                        strArr2[1] = "HjELnbww4zRnKHk33aEIOd3z3";
                        strArr2[2] = "L9K5feiifaRZL";
                        c2973hX.A0D();
                    }
                }
                this.A0U.A06();
                this.A0g.setToolbarListener(null);
                this.A0N.removeCallbacksAndMessages(null);
                if (A0i[7].length() != 4) {
                    throw new RuntimeException();
                }
                A0i[4] = "edn3At82DbAhSP2VjV";
                this.A05 = null;
                this.A06 = null;
                return;
            }
        } else {
            if (this.A0B != null) {
                if (!TextUtils.isEmpty(this.A0O.A37())) {
                    this.A0S.ABt(this.A0O.A37(), new C3715ti().A05(this.A0B.getViewabilityChecker()).A04(this.A0B.getTouchDataRecorder()).A07());
                }
                c2973hX = this.A0B;
                strArr = A0i;
                if (strArr[1].length() != strArr[2].length()) {
                    String[] strArr3 = A0i;
                    strArr3[1] = "HjELnbww4zRnKHk33aEIOd3z3";
                    strArr3[2] = "L9K5feiifaRZL";
                    c2973hX.A0D();
                }
            }
            this.A0U.A06();
            this.A0g.setToolbarListener(null);
            this.A0N.removeCallbacksAndMessages(null);
            if (A0i[7].length() != 4) {
                throw new RuntimeException();
            }
            A0i[4] = "edn3At82DbAhSP2VjV";
            this.A05 = null;
            this.A06 = null;
            return;
        }
        throw new RuntimeException();
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (z) {
            AGp(false);
        } else {
            if (A0i[7].length() == 4) {
                throw new RuntimeException();
            }
            A0i[0] = "oMjhyB5nK2QQecdmAxokhN3bvhPRjHlA";
            this.A0F = true;
            AGF(false);
        }
    }

    public void setListener(InterfaceC3556r9 interfaceC3556r9) {
    }

    public void setServerSideRewardHandler(C2911gV c2911gV) {
        this.A0C = c2911gV;
    }
}
