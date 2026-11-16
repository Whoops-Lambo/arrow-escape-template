package com.facebook.ads.redexgen.X;

import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.HashMap;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Er, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes.dex */
public final class C1987Er extends C2927gm {
    public static byte[] A07;
    public static final int A08;
    public static final int A09;
    public static final int A0A;
    public static final int A0B;
    public static final int A0C;
    public final LinearLayout A00;
    public final RelativeLayout A01;
    public final LA A02;
    public final C2055Hi A03;
    public final InterfaceC3321nG A04;
    public final C3514qT A05;
    public final InterfaceC3556r9 A06;

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A07, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 50);
        }
        return new String(bArrCopyOfRange);
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 19 out of bounds for length 17
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.restartVar(DebugInfoParser.java:193)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:141)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:656)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    private void A02() {
        RelativeLayout relativeLayout = new RelativeLayout(this.A03);
        C3758uP c3758uP = new C3758uP(this.A03);
        new AsyncTaskC1989Et(c3758uP, this.A03).A05(A0C, A0C).A07(this.A02.A35().A01());
        c3758uP.setFullCircleCorners(true);
        AbstractC3523qc.A0O(c3758uP, 0);
        AbstractC3523qc.A0L(c3758uP);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(A0C, A0C);
        layoutParams.setMargins(A0B, A0B, A0B, A0B);
        layoutParams.addRule(14);
        relativeLayout.addView(c3758uP, layoutParams);
        TextView textView = new TextView(this.A03);
        AbstractC3523qc.A0L(textView);
        textView.setTextColor(this.A02.A31().A01().A07(true));
        textView.setText(this.A02.A32().A0J().A0H());
        textView.setGravity(17);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams2.addRule(14);
        layoutParams2.addRule(3, c3758uP.getId());
        relativeLayout.addView(textView, layoutParams2);
        LinearLayout linearLayout = new LinearLayout(this.A03);
        AbstractC3523qc.A0L(linearLayout);
        linearLayout.setOrientation(0);
        linearLayout.setGravity(17);
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams3.setMargins(A0B, 0, A0B, A0B);
        layoutParams3.addRule(14);
        layoutParams3.addRule(3, textView.getId());
        relativeLayout.addView(linearLayout, layoutParams3);
        C3760uR c3760uR = new C3760uR(this.A03, A0A, 5, A09, -1);
        c3760uR.setGravity(16);
        linearLayout.addView(c3760uR, new LinearLayout.LayoutParams(-2, -1));
        TextView textView2 = new TextView(this.A03);
        textView2.setTextColor(this.A02.A31().A01().A07(true));
        textView2.setGravity(16);
        textView2.setIncludeFontPadding(false);
        AbstractC3523qc.A0b(textView2, false, 14);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-2, -1);
        layoutParams4.leftMargin = A08;
        linearLayout.addView(textView2, layoutParams4);
        if (TextUtils.isEmpty(this.A02.A32().A0J().A0D())) {
            linearLayout.setVisibility(8);
        } else {
            linearLayout.setVisibility(0);
            c3760uR.setRating(Float.parseFloat(this.A02.A32().A0J().A0D()));
            if (this.A02.A32().A0J().A0A() != null) {
                textView2.setText(A00(0, 1, 20) + NumberFormat.getNumberInstance().format(Integer.parseInt(this.A02.A32().A0J().A0A())) + A00(1, 1, 41));
            }
        }
        TextView textView3 = new TextView(this.A03);
        textView3.setTextColor(this.A02.A31().A01().A07(true));
        textView3.setText(this.A02.A32().A0J().A04());
        textView3.setGravity(17);
        textView3.setPadding(A0B, A0B, A0B, A0B);
        RelativeLayout.LayoutParams layoutParams5 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams5.addRule(14);
        layoutParams5.addRule(3, linearLayout.getId());
        relativeLayout.addView(textView3, layoutParams5);
        LinearLayout.LayoutParams layoutParams6 = new LinearLayout.LayoutParams(-1, -1);
        layoutParams6.gravity = 4;
        layoutParams6.weight = 0.8f;
        this.A00.addView(relativeLayout, layoutParams6);
    }

    public static void A03() {
        A07 = new byte[]{110, -124};
    }

    static {
        A03();
        A0B = (int) (C2927gm.A08 * 12.0f);
        A0C = (int) (C2927gm.A08 * 84.0f);
        A0A = (int) (C2927gm.A08 * 14.0f);
        A08 = AbstractC3480pv.A0y;
        A09 = AbstractC2938gx.A02(-1, 77);
    }

    public C1987Er(C2055Hi c2055Hi, LA la, InterfaceC3321nG interfaceC3321nG, InterfaceC3556r9 interfaceC3556r9) {
        super(c2055Hi);
        this.A05 = new C3514qT();
        this.A03 = c2055Hi;
        this.A02 = la;
        this.A04 = interfaceC3321nG;
        this.A06 = interfaceC3556r9;
        this.A05.A05();
        setRadius(20.0f);
        setMaxCardElevation(75.0f);
        this.A01 = new RelativeLayout(c2055Hi);
        String strA08 = la.A32().A0I().A08();
        if (strA08 != null) {
            AbstractC3765uW.A00(c2055Hi, this.A01, strA08);
        }
        this.A00 = new LinearLayout(this.A03);
        this.A00.setOrientation(1);
        A02();
        A01();
        this.A01.addView(this.A00, new RelativeLayout.LayoutParams(-1, -1));
        addView(this.A01, new FrameLayout.LayoutParams(-1, -1));
    }

    private void A01() {
        ViewOnClickListenerC1981El viewOnClickListenerC1981El = new ViewOnClickListenerC1981El(this.A03, EnumC2755dy.A04.A03(), this.A02.A31().A01(), this.A02.A32().A0K().A07(), this.A04, this.A06, null, this.A05, this.A02.A33());
        viewOnClickListenerC1981El.setViewShowsOverMedia(true);
        AbstractC3523qc.A0H(1001, viewOnClickListenerC1981El);
        viewOnClickListenerC1981El.setCta(this.A02.A32().A0K(), this.A02.A37(), new HashMap(), null);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        viewOnClickListenerC1981El.setPadding(A0B, A0B, A0B, A0B);
        layoutParams.setMargins(A0B, A0B, A0B, A0B * 2);
        this.A00.addView(viewOnClickListenerC1981El, layoutParams);
    }
}
