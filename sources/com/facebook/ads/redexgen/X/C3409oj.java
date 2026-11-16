package com.facebook.ads.redexgen.X;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import java.util.Map;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.oj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes.dex */
public final class C3409oj extends FrameLayout {
    public static final int A08 = AbstractC3480pv.A0e;
    public C18016w A00;
    public C1901Bj A01;
    public C5Z A02;
    public C1883Ar A03;
    public C5B A04;
    public AnonymousClass51 A05;
    public final C2055Hi A06;
    public final C3329nO A07;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 12 out of bounds for length 12
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:656)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    public final void A04(InterfaceC3321nG interfaceC3321nG, String str, Map<String, String> map) {
        A02();
        this.A02 = new C5Z(this.A06, interfaceC3321nG, this.A00, str, null, map);
        if (C3300mv.A20(this.A06)) {
            this.A01 = new C1901Bj(this.A06, interfaceC3321nG, this.A00, str, false, this.A02, map);
        } else {
            this.A01 = null;
        }
    }

    public C3409oj(C2055Hi c2055Hi, C3329nO c3329nO) {
        super(c2055Hi);
        this.A07 = c3329nO;
        this.A06 = c2055Hi;
        setUpView(c2055Hi);
    }

    public final void A01() {
        A0j(true, 10);
    }

    public final void A02() {
        if (this.A01 != null) {
            this.A01.A07();
            this.A01 = null;
        }
        if (this.A02 != null) {
            this.A02.A0p();
            this.A02 = null;
        }
    }

    public final void A03(AbstractC3269mQ abstractC3269mQ) {
        getEventBus().A05(abstractC3269mQ);
    }

    public final void A05(EnumC2761e4 enumC2761e4) {
        A0f(enumC2761e4, 13);
    }

    public final boolean A06() {
        return A0q();
    }

    public C1896Be getSimpleVideoView() {
        return this.A00;
    }

    public float getVolume() {
        return getVolume();
    }

    public void setPlaceholderUrl(String str) {
        this.A04.setImage(str);
    }

    private void setUpPlugins(C2055Hi c2055Hi) {
        A0Z();
        this.A04 = new C5B(c2055Hi);
        A0g(this.A04);
        this.A03 = new C1883Ar(c2055Hi, this.A07);
        A0g(new C5M(c2055Hi));
        A0g(this.A03);
        this.A05 = new AnonymousClass51(c2055Hi, true, this.A07);
        A0g(this.A05);
        A0g(new C1885At(this.A05, EnumC2751du.A03, true, true));
        if (!A0l()) {
            return;
        }
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(10);
        layoutParams.addRule(11);
        layoutParams.setMargins(A08, A08, A08, A08);
        this.A03.setLayoutParams(layoutParams);
        addView(this.A03);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.facebook.ads.redexgen.X.6w] */
    private void setUpVideo(final C2055Hi c2055Hi) {
        this.A00 = new C1896Be(c2055Hi) { // from class: com.facebook.ads.redexgen.X.6w
            @Override // android.widget.RelativeLayout, android.view.View
            public final void onMeasure(int i, int i2) {
                int newWidthSpec = View.MeasureSpec.getMode(i);
                if (newWidthSpec == 1073741824) {
                    i2 = i;
                } else {
                    int newWidthSpec2 = View.MeasureSpec.getMode(i2);
                    if (newWidthSpec2 == 1073741824) {
                        i = i2;
                    }
                }
                super.onMeasure(i, i2);
            }
        };
        setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        AbstractC3523qc.A0L(this.A00);
        addView(this.A00);
        setOnClickListener(new ViewOnClickListenerC3410ok(this));
    }

    private void setUpView(C2055Hi c2055Hi) {
        setUpVideo(c2055Hi);
        setUpPlugins(c2055Hi);
    }

    public void setVideoURI(String str) {
        setVideoURI(str);
    }

    public void setVolume(float f) {
        setVolume(f);
        this.A03.A09();
    }
}
