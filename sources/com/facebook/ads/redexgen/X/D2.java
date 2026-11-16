package com.facebook.ads.redexgen.X;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.facebook.ads.internal.view.FullScreenAdToolbar;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/* JADX INFO: loaded from: assets/audience_network/classes.dex */
public final class D2 extends FrameLayout implements InterfaceC3557rA {
    public static byte[] A0L;
    public static String[] A0M = {"n8b1XAz0kHAkpiWEmzC3t1pF5U", "eWK394xXCAUBfgpESuKIG56NqbrNFWJq", "5CdOn8t3diym6HDjOq5Y6uNvOx4lt5g3", "HN0pIlpAYl374dQUYji0gU", "nPJn2NzIeBIJ0ob92wkGV5", "7vv965TmOe", "OL6PAd", "N5PSCRASy1"};
    public static final RelativeLayout.LayoutParams A0N;
    public int A00;
    public int A01;
    public int A02;
    public C3747uE A03;
    public AbstractC1958Do A04;
    public C2911gV A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public final C2145Kz A0A;
    public final InterfaceC3101je A0B;
    public final C3183kz A0C;
    public final C2055Hi A0D;
    public final InterfaceC3321nG A0E;
    public final C3329nO A0F;
    public final ViewOnSystemUiVisibilityChangeListenerC3509qO A0G;
    public final AbstractC3549r2 A0H;
    public final InterfaceC3556r9 A0I;
    public final InterfaceC3612s3 A0J;
    public final ArrayList<C3694tN> A0K;

    public static String A0D(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0L, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 39);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A0I() {
        A0L = new byte[]{113, -64, -73, 113, -62, -27, -95};
        String[] strArr = A0M;
        if (strArr[3].length() != strArr[4].length()) {
            throw new RuntimeException();
        }
        A0M[2] = "BvaU1dA3vF4hXYIjQV5InfWnSlZ4OmYy";
    }

    static {
        A0I();
        A0N = new RelativeLayout.LayoutParams(-1, -1);
    }

    public D2(C2055Hi c2055Hi, InterfaceC3612s3 interfaceC3612s3, InterfaceC3321nG interfaceC3321nG, C2145Kz c2145Kz, C3183kz c3183kz, InterfaceC3556r9 interfaceC3556r9) {
        FrameLayout.LayoutParams layoutParams;
        super(c2055Hi);
        this.A0K = new ArrayList<>();
        this.A09 = false;
        this.A07 = false;
        this.A08 = false;
        this.A06 = true;
        this.A02 = 1;
        this.A00 = 0;
        this.A01 = 0;
        this.A0B = new D5(this);
        this.A0D = c2055Hi;
        this.A0J = interfaceC3612s3;
        this.A0E = interfaceC3321nG;
        this.A0A = c2145Kz;
        this.A0C = c3183kz;
        this.A0I = interfaceC3556r9;
        this.A0F = new C3329nO(this.A0A.A2z(0).A37(), this.A0E);
        this.A0G = new ViewOnSystemUiVisibilityChangeListenerC3509qO(this);
        this.A0G.A05(EnumC3508qN.A03);
        this.A05 = new C2911gV(this.A0D, this.A0J, this.A0A.A1u(), interfaceC3556r9);
        this.A0H = A07();
        if (this.A0A.A2M()) {
            layoutParams = new FrameLayout.LayoutParams(-1, -2);
            layoutParams.setMargins(AbstractC3480pv.A0x, AbstractC3480pv.A0u, 0, 0);
        } else {
            layoutParams = new FrameLayout.LayoutParams(-1, this.A0H.getToolbarHeight());
        }
        addView(this.A0H, layoutParams);
    }

    /* JADX WARN: Code duplicated, block: B:103:0x01f3  */
    /* JADX WARN: Code duplicated, block: B:105:0x01f9  */
    /* JADX WARN: Code duplicated, block: B:18:0x0051  */
    /* JADX WARN: Code duplicated, block: B:39:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:41:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:43:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:45:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:47:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:51:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:60:0x011e  */
    /* JADX WARN: Code duplicated, block: B:62:0x0126  */
    /* JADX WARN: Code duplicated, block: B:93:0x01c1  */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00eb, code lost:
    
        if (r7.A04.A1o() != false) goto L57;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private int A00() {
        /*
            Method dump skipped, instruction units count: 536
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.D2.A00():int");
    }

    private int A01(int i) {
        if (this.A0A.A3B() && i < this.A0A.A33().size() && i >= 0) {
            return this.A0A.A33().get(i).intValue();
        }
        return this.A0A.A1M();
    }

    public static /* synthetic */ int A03(D2 d2, int i) {
        int i2 = d2.A01 + i;
        d2.A01 = i2;
        return i2;
    }

    private AbstractC3549r2 A07() {
        AbstractC3549r2 c2007Fl;
        if (!this.A0A.A2M()) {
            c2007Fl = new FullScreenAdToolbar(this.A0D, this.A0I, this.A0F, 2, -1, false);
        } else {
            c2007Fl = new C2007Fl(this.A0D, this.A0A.A2z(this.A00), 2);
        }
        c2007Fl.setFullscreen(true);
        c2007Fl.setToolbarListener(new D3(this));
        return c2007Fl;
    }

    private AbstractC1958Do A0C(boolean z, int i) {
        int i2;
        D4 d4 = new D4(this, i);
        LA laA2z = this.A0A.A2z(this.A00);
        Activity activityA0E = this.A0D.A0E();
        if (activityA0E != null) {
            boolean zA2R = laA2z.A2R();
            String[] strArr = A0M;
            if (strArr[3].length() != strArr[4].length()) {
                throw new RuntimeException();
            }
            A0M[2] = "bDB0WKM3tjeRkIfEXbhmbXqmjWoJ3lp1";
            if (!zA2R) {
                C2055Hi c2055Hi = this.A0D;
                if (A0M[1].charAt(22) != '6') {
                    AbstractC3545qy.A02(activityA0E, -1, c2055Hi);
                } else {
                    String[] strArr2 = A0M;
                    strArr2[6] = "kND67a";
                    strArr2[0] = "muWswOX35m7UhHe3NR7FnsVKJl";
                    AbstractC3545qy.A02(activityA0E, -1, c2055Hi);
                }
            } else {
                AbstractC3545qy.A02(activityA0E, 1, this.A0D);
            }
        }
        if (laA2z.A3R()) {
            this.A0H.setOnClickListener(new ViewOnClickListenerC3609s0(this));
        }
        boolean z2 = this.A0A.A38() && this.A00 > 0;
        boolean z3 = this.A0A.A37() && this.A00 > 0;
        String strA31 = this.A0A.A31();
        if (!laA2z.A2Q()) {
            if (laA2z.A39().size() > 1) {
                int iA01 = A01(this.A00);
                if (iA01 == 0) {
                    setUnskippableSecondsComplete(true);
                }
                this.A0D.A0F().ALB(EnumC2748dr.A05);
                this.A0D.A0F().AKd(this.A00);
                this.A0D.A0F().A5U(strA31);
                if (laA2z.A2K()) {
                    return new C6M(this.A0D, this.A0J, this.A00, this.A0E, laA2z, this.A0I, this.A0H, this.A0F, this.A0C, z2, z3, d4, iA01, this.A0A.A2v(), true);
                }
                return new C6J(this.A0D, this.A0J, this.A00, this.A0E, laA2z, this.A0I, this.A0H, this.A0F, this.A0C, z2, z3, d4, iA01, this.A0A.A2v());
            }
            if (A0d(laA2z)) {
                int iA02 = A01(this.A00);
                if (iA02 == 0) {
                    setUnskippableSecondsComplete(true);
                }
                this.A0D.A0F().ALB(EnumC2748dr.A06);
                this.A0D.A0F().AKd(this.A00);
                this.A0D.A0F().A5U(strA31);
                return new C6K(this.A0D, this.A0J, this.A00, this.A0E, laA2z, this.A0I, this.A0H, this.A0F, z2, z3, d4, iA02, this.A0A.A2v());
            }
            if (laA2z.A32().A0U()) {
                this.A0D.A0F().ALB(EnumC2748dr.A07);
                this.A0D.A0F().AKd(this.A00);
                this.A0D.A0F().A5U(strA31);
                if (this.A0A.A2M()) {
                    return new C17775y(this.A0D, this.A0E, this.A0H, laA2z, this.A0C, this.A0J, this.A00, this.A0I, this.A0F, i, z2, z3, d4, A01(this.A00), this.A0A.A2v());
                }
                return new AnonymousClass65(this.A0D, this.A0E, this.A0H, laA2z, this.A0C, this.A0J, this.A00, this.A0I, this.A0F, i, z2, z3, d4, A01(this.A00), this.A0A.A2v());
            }
            this.A0D.A0F().ALB(EnumC2748dr.A07);
            this.A0D.A0F().AKd(this.A00);
            this.A0D.A0F().A5U(strA31);
            return new C6C(this.A0D, this.A0E, laA2z, this.A0C, this.A0J, this.A00, this.A0I, this.A0F, this.A0H, this.A0A.A1M(), i, this.A0A.A2u(), z, this.A0A.A2w(), this.A0A.A3B(), z2, z3, d4, A01(this.A00), this.A0A.A2v());
        }
        if (this.A0J instanceof FG) {
            i2 = 0;
        } else {
            i2 = 1;
        }
        this.A0D.A0F().ALB(EnumC2748dr.A07);
        this.A0D.A0F().AKd(this.A00);
        this.A0D.A0F().A5U(strA31);
        int i3 = this.A0A.A3B() ? 0 : this.A01;
        C2055Hi c2055Hi2 = this.A0D;
        InterfaceC3612s3 interfaceC3612s3 = this.A0J;
        InterfaceC3321nG interfaceC3321nG = this.A0E;
        int forcedViewTimeCompletedForChild = this.A00;
        return new C6L(c2055Hi2, interfaceC3612s3, interfaceC3321nG, laA2z, forcedViewTimeCompletedForChild, z2, z3, this.A0I, d4, this.A0A.A2v(), i2, A01(this.A00), i3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0E() {
        int iA00 = A00();
        if (iA00 != 0) {
            this.A0D.A0F().A5X(iA00);
        }
    }

    private void A0F() {
        if (this.A00 > 0 && !TextUtils.isEmpty(this.A0A.A2z(this.A00 - 1).A37())) {
            this.A0E.ABt(this.A0A.A2z(this.A00 - 1).A37(), new C3715ti().A05(this.A04 != null ? this.A04.getAdViewabilityChecker() : null).A04(this.A04 != null ? this.A04.getTouchDataRecorder() : null).A07());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:18:0x004c  */
    /* JADX WARN: Code duplicated, block: B:34:0x0096  */
    public void A0G() {
        boolean z;
        boolean canShowEndCard;
        if (this.A0H.getToolbarActionMode() == 8) {
            if (this.A09) {
                if (A0a()) {
                    boolean zA0Y = A0Y();
                    if (A0M[1].charAt(22) != '6') {
                        throw new RuntimeException();
                    }
                    String[] strArr = A0M;
                    strArr[6] = "TvtNav";
                    strArr[0] = "7cv5ylY9IM1pTqkWAPRPJldmHk";
                    if (zA0Y || A0c()) {
                        z = false;
                    } else {
                        z = true;
                    }
                } else {
                    z = false;
                }
                if (this.A04 != null) {
                    boolean willShowCombinedEndCards = this.A04.A1o();
                    if (willShowCombinedEndCards) {
                        canShowEndCard = true;
                    } else {
                        canShowEndCard = false;
                    }
                } else {
                    canShowEndCard = false;
                }
                boolean willShowCombinedEndCards2 = A0Y();
                if (!willShowCombinedEndCards2 && !z && !canShowEndCard) {
                    this.A0H.setToolbarActionMode(0);
                } else {
                    this.A0H.setToolbarActionMode(1);
                }
            } else {
                this.A0H.setToolbarActionMode(2);
            }
        }
        int i = this.A00 - 1;
        if (this.A0A.A3C(i)) {
            LA laA2z = this.A0A.A2z(i);
            this.A0H.setProgressSpinnerInvisible(true ^ laA2z.A3Q());
            laA2z.A3D(false);
            laA2z.A32().A0N(-1);
        }
    }

    private void A0H() {
        this.A0D.A0F().A5V();
        this.A07 = true;
        this.A03 = new C3747uE(this.A0D, this.A0A, this.A0E, this.A0I, this.A0H.getToolbarHeight(), this.A02);
        C3694tN c3694tN = null;
        Iterator<C3694tN> it = this.A0K.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            if (A0M[1].charAt(22) == '6') {
                String[] strArr = A0M;
                strArr[7] = "ZPnrdglx3i";
                strArr[5] = "Z92DtyKnO3";
                if (!zHasNext) {
                    break;
                }
                C3694tN next = it.next();
                if (next.A00 == C3694tN.A06) {
                    c3694tN = next;
                    break;
                }
            } else {
                throw new RuntimeException();
            }
        }
        if (c3694tN != null) {
            A0N(this.A03, c3694tN);
        } else if (!this.A0K.isEmpty()) {
            C3747uE c3747uE = this.A03;
            C3694tN c3694tN2 = this.A0K.get(0);
            String[] strArr2 = A0M;
            if (strArr2[3].length() != strArr2[4].length()) {
                throw new RuntimeException();
            }
            A0M[1] = "QrfYDlJd0rSqFpmMPkZz6N62c1xeqnJu";
            A0N(c3747uE, c3694tN2);
        }
        A0W(true);
        if (this.A0H instanceof FullScreenAdToolbar) {
            ((FullScreenAdToolbar) this.A0H).setOnlyPageDetails(null);
        }
        if (this.A04 != null) {
            AbstractC3523qc.A0K(this.A04);
            this.A04.A1b();
            this.A04 = null;
        }
        AbstractC3523qc.A0K(this.A03);
        AbstractC3523qc.A0H(1102, this.A03);
        addView(this.A03, 0, new FrameLayout.LayoutParams(-1, -1));
    }

    private final void A0J() {
        this.A0G.A05(EnumC3508qN.A04);
    }

    private synchronized void A0K() {
        this.A0D.A0F().ACm();
        this.A0D.A0F().ABs();
        this.A0I.A5C(this.A0J.A7L());
        this.A05.A06();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0L(float f) {
        float f2;
        float fA01 = A01(this.A00 - 1);
        float f3 = (this.A0A.A3B() ? 0 : this.A01) + f;
        if (fA01 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            f2 = f3 / fA01;
        } else {
            f2 = 1.0f;
        }
        if (this.A06 && this.A0A.A3B()) {
            this.A06 = false;
            this.A0H.setProgressImmediate(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        }
        float unskippableSeconds = 100.0f * f2;
        this.A0H.setProgress(unskippableSeconds);
        if (f2 >= 1.0f && !this.A09) {
            setUnskippableSecondsComplete(true);
            if (!A0Z()) {
                this.A0H.setToolbarActionMode(1);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0M(int i) {
        this.A0D.A0F().A5S(i);
        setUnskippableSecondsComplete(true);
        A0K();
        A0F();
        this.A0D.A0F().ABl();
        this.A0I.A5C(this.A0J.A8X());
    }

    private void A0N(ViewGroup viewGroup, C3694tN c3694tN) {
        if (c3694tN.A00 == C3694tN.A06 && c3694tN.A03 != null) {
            AbstractC3765uW.A00(this.A0D, viewGroup, c3694tN.A03);
        } else {
            AbstractC3523qc.A0O(viewGroup, c3694tN.A01);
        }
        this.A0H.setFullscreen(c3694tN.A05);
        this.A0H.A0D(c3694tN.A02, c3694tN.A04);
    }

    private void A0O(LA la) {
        if (this.A0H instanceof FullScreenAdToolbar) {
            boolean zA0d = A0d(la);
            if (A0M[2].charAt(7) != '3') {
                throw new RuntimeException();
            }
            A0M[2] = "vyv5r133RkdgG8M1gH7WIgZDBjsgq9Je";
            if (zA0d && this.A02 == 2) {
                ((FullScreenAdToolbar) this.A0H).setOnlyPageDetails(la.A35());
            } else {
                ((FullScreenAdToolbar) this.A0H).setOnlyPageDetails(null);
            }
        }
    }

    private final void A0P(C3095jY c3095jY) {
        c3095jY.A0A(this.A0B);
        int i = c3095jY.A05().getResources().getConfiguration().orientation;
        this.A02 = i;
        A0X(this.A0A.A35(), i);
        A0J();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:13:0x002e  */
    /* JADX WARN: Code duplicated, block: B:32:0x0074  */
    public void A0W(boolean z) {
        boolean z2;
        boolean z3;
        if (A0Z()) {
            return;
        }
        if (!A0a() || A0Y()) {
            z2 = false;
        } else {
            boolean zA0c = A0c();
            if (A0M[1].charAt(22) != '6') {
                throw new RuntimeException();
            }
            String[] strArr = A0M;
            strArr[7] = "fhNsXNJVUA";
            strArr[5] = "wXa0tVX5fv";
            if (zA0c) {
                z2 = false;
            } else {
                z2 = true;
            }
        }
        if (this.A04 != null) {
            boolean willShowCombinedEndCards = this.A04.A1o();
            if (willShowCombinedEndCards) {
                z3 = true;
            } else {
                z3 = false;
            }
        } else {
            z3 = false;
        }
        boolean willShowCombinedEndCards2 = A0Y();
        if (!willShowCombinedEndCards2 && !z2 && !z3) {
            setUnskippableSecondsComplete(true);
            if (z) {
                this.A0H.setToolbarActionMessage(A0D(0, 0, 66));
            }
            this.A0H.setToolbarActionMode(0);
            return;
        }
        this.A0H.setToolbarActionMode(1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0X(boolean z, int i) {
        if (this.A04 != null) {
            this.A04.A1b();
            if (A0M[1].charAt(22) != '6') {
                throw new RuntimeException();
            }
            A0M[2] = "W3TlfOl3oEXDpQnuuCTH10eCcUmU4b3A";
            this.A04.removeAllViews();
            AbstractC3523qc.A0K(this.A04);
        }
        if (this.A0A.A2M()) {
            AbstractC3523qc.A0K(this.A0H);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
            layoutParams.setMargins(AbstractC3480pv.A0x, AbstractC3480pv.A0u, 0, 0);
            addView(this.A0H, layoutParams);
        }
        if (!A0Y()) {
            setUnskippableSecondsComplete(true);
            if (A0a()) {
                A0H();
                return;
            } else {
                A0M(1);
                return;
            }
        }
        if (this.A0A.A3B()) {
            setUnskippableSecondsComplete(false);
            this.A0H.setProgressImmediate(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        }
        boolean isLoaded = this.A0D.A01().AB4(this.A0A.A2z(this.A00).A37(), this.A0A.A30());
        if (!isLoaded) {
            this.A0D.A0F().A5T();
            A0M(2);
            return;
        }
        AbstractC1958Do abstractC1958DoA0C = A0C(z, i);
        this.A04 = abstractC1958DoA0C;
        AbstractC1958Do abstractC1958Do = this.A04;
        boolean isLoaded2 = this.A09;
        abstractC1958Do.A1i(isLoaded2);
        setupToolbarForAd(abstractC1958DoA0C);
        addView(this.A04, 0, A0N);
        this.A00++;
        this.A04.A1h();
    }

    private boolean A0Y() {
        return this.A00 < this.A0A.A2v();
    }

    private boolean A0Z() {
        if (this.A04 == null || this.A0H.getToolbarActionMode() != 8) {
            return false;
        }
        int i = this.A00 - 1;
        if (!this.A0A.A3C(i)) {
            return false;
        }
        LA laA2z = this.A0A.A2z(i);
        if (!laA2z.A3G() || !this.A04.A1l()) {
            return false;
        }
        int currentPlayCount = this.A04.getCurrentPlayCount();
        int curIdx = laA2z.A30();
        return currentPlayCount < curIdx;
    }

    private boolean A0a() {
        return this.A0A.A2u() == 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean A0b() {
        if (this.A0H.getToolbarActionMode() != 8) {
            return false;
        }
        int i = this.A00 - 1;
        if (this.A0A.A3C(i)) {
            return this.A0A.A2z(i).A3J();
        }
        return false;
    }

    private final boolean A0c() {
        return this.A07;
    }

    public static boolean A0d(LA la) {
        return TextUtils.isEmpty(la.A32().A0I().A09());
    }

    public final void A0h() {
        A0X(false, this.A02);
    }

    public final boolean A0i() {
        boolean z = this.A00 < this.A0A.A2v() && this.A0A.A39();
        if (z) {
            this.A0D.A0F().ACr();
        }
        return z;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC3557rA
    public final void ABc(Intent intent, Bundle bundle, C3095jY c3095jY) {
        this.A0I.A4V(this, A0N);
        A0P(c3095jY);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC3557rA
    public final void AGF(boolean z) {
        if (this.A04 != null) {
            this.A04.A1j(z);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC3557rA
    public final void AGp(boolean z) {
        if (this.A04 != null) {
            this.A04.A1k(z);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC3557rA
    public final void AKD(Bundle bundle) {
    }

    public AbstractC1958Do getContentView() {
        return this.A04;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC3557rA
    public String getCurrentClientToken() {
        return A0D(0, 0, 66);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC3557rA
    public final boolean onActivityResult(int i, int i2, Intent intent) {
        if (this.A04 != null) {
            return this.A04.A1r(i, i2, intent);
        }
        return false;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.A02 = configuration.orientation;
        if (this.A04 != null) {
            this.A04.onConfigurationChanged(configuration);
        }
        if (this.A04 instanceof C6K) {
            A0N(this.A04, this.A04.getFullScreenAdStyle());
            A0O(this.A04.getAdDataBundle());
        } else {
            if (this.A04 instanceof C6M) {
                A0N(this.A04, this.A04.getFullScreenAdStyle());
                return;
            }
            boolean z = this.A04 instanceof C6J;
            if (A0M[2].charAt(7) != '3') {
                throw new RuntimeException();
            }
            A0M[2] = "dTSLtaN3TPLZnVsUfzbb4eL6QIUFm0aB";
            if (!z) {
                return;
            }
            A0N(this.A04, this.A04.getFullScreenAdStyle());
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC3557rA
    public final void onDestroy() {
        if (this.A04 != null) {
            this.A04.A1b();
            this.A04 = null;
        }
        this.A0D.A01().A5Y(this.A0A.A30());
        this.A0G.A03();
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC3557rA
    public final void onStart() {
        if (this.A04 != null) {
            this.A04.A1c();
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC3557rA
    public final void onStop() {
        if (this.A04 != null) {
            this.A04.A1d();
        }
    }

    public void setListener(InterfaceC3556r9 interfaceC3556r9) {
    }

    public void setServerSideRewardHandler(C2911gV c2911gV) {
        this.A05 = c2911gV;
    }

    public void setUnskippableSecondsComplete(boolean z) {
        this.A09 = z;
        if (this.A04 != null) {
            this.A04.A1i(this.A09);
        }
    }

    private void setupToolbarForAd(AbstractC1958Do abstractC1958Do) {
        if (this.A0H == null) {
            return;
        }
        this.A06 = true;
        LA laA2z = this.A0A.A2z(this.A00);
        int iA01 = A01(this.A00);
        if (this.A0H instanceof FullScreenAdToolbar) {
            ((FullScreenAdToolbar) this.A0H).A0G(this.A0D, laA2z.A2u());
            ((FullScreenAdToolbar) this.A0H).A0F(laA2z.A35(), laA2z.A37(), iA01);
        } else if (this.A0H instanceof C2007Fl) {
            C2007Fl c2007Fl = (C2007Fl) this.A0H;
            String[] strArr = A0M;
            if (strArr[7].length() != strArr[5].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0M;
            strArr2[6] = "BSHe58";
            strArr2[0] = "ZBSZ6J22vFdXaG69CEBQUYT0cT";
            c2007Fl.A0I(laA2z);
            ((C2007Fl) this.A0H).setInitialUnskippableSeconds(iA01);
        }
        C3694tN fullScreenAdStyle = abstractC1958Do.getFullScreenAdStyle();
        A0N(abstractC1958Do, fullScreenAdStyle);
        this.A0K.add(fullScreenAdStyle);
        if (this.A0H instanceof FullScreenAdToolbar) {
            this.A0H.setToolbarActionMessage(A0D(4, 3, 90) + (this.A00 + 1) + A0D(0, 4, 42) + this.A0A.A2v());
        }
        boolean z = abstractC1958Do instanceof C6L;
        this.A0H.setVisibility(z ? 8 : 0);
        this.A0H.setSkipIconSuppressed(z);
        if (this.A08) {
            this.A0H.setToolbarActionMode(1);
        }
        A0O(laA2z);
    }
}
