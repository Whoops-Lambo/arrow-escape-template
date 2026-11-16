package com.facebook.ads.redexgen.X;

import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.facebook.ads.internal.view.FullScreenAdToolbar;
import java.lang.ref.WeakReference;
import java.util.Arrays;

/* JADX INFO: loaded from: assets/audience_network/classes.dex */
public abstract class D8 extends FrameLayout implements InterfaceC3557rA {
    public static byte[] A0F;
    public static String[] A0G = {"2Xyaln6pEv", "U0a3JqFqqkDVhXbmlhDLXicSxteMexx", "xzpI97Jg3aS17fwtqg1jZWsfReheMZxV", "0HUxaz9ggnFIA", "Uunhkc3", "kqN9", "fWeU9xYsODnan54TmlbSL1hNy6Lef7fu", "qbKhPFfRzVPGu"};
    public static final RelativeLayout.LayoutParams A0H;
    public boolean A00;
    public ViewGroup A01;
    public boolean A02;
    public final LA A03;
    public final C3183kz A04;
    public final C2055Hi A05;
    public final InterfaceC3321nG A06;
    public final C3329nO A07;
    public final C3514qT A08;
    public final AbstractC3549r2 A09;
    public final InterfaceC3556r9 A0A;
    public final InterfaceC3612s3 A0B;
    public final C2636c2 A0C;
    public final ViewOnSystemUiVisibilityChangeListenerC3509qO A0D;
    public final AbstractC2637c3 A0E;

    public static String A0g(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0F, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 80);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A0i() {
        A0F = new byte[]{84, 91, 74, 87, 86};
    }

    public abstract void A0p();

    public abstract void A0q();

    public abstract void A0s(C3095jY c3095jY);

    public abstract boolean A0t();

    public abstract boolean A0u();

    public /* synthetic */ void onStart() {
    }

    public /* synthetic */ void onStop() {
    }

    static {
        A0i();
        A0H = new RelativeLayout.LayoutParams(-1, -1);
    }

    public D8(C2055Hi c2055Hi, InterfaceC3612s3 interfaceC3612s3, InterfaceC3321nG interfaceC3321nG, LA la, C3183kz c3183kz, InterfaceC3556r9 interfaceC3556r9) {
        super(c2055Hi);
        this.A02 = false;
        this.A0E = new DE(this);
        this.A08 = new C3514qT();
        this.A00 = false;
        this.A05 = c2055Hi;
        this.A0B = interfaceC3612s3;
        this.A06 = interfaceC3321nG;
        this.A03 = la;
        this.A04 = c3183kz;
        this.A0A = interfaceC3556r9;
        this.A07 = new C3329nO(this.A03.A37(), this.A06);
        this.A0C = new C2636c2(this, 1, new WeakReference(this.A0E), this.A05);
        this.A0C.A0W(this.A03.A1J());
        this.A0C.A0X(this.A03.A1K());
        this.A09 = A0f();
        this.A0D = new ViewOnSystemUiVisibilityChangeListenerC3509qO(this);
        this.A0D.A05(EnumC3508qN.A03);
        if (!A0u() && Build.VERSION.SDK_INT >= 35) {
            setFitsSystemWindows(true);
        }
    }

    private AbstractC3549r2 A0f() {
        AbstractC3549r2 abstractC3549r2A0l = A0l();
        abstractC3549r2A0l.setFullscreen(true);
        int unskippableSeconds = this.A03.A32().A0I().A04();
        abstractC3549r2A0l.setPageDetails(this.A03.A35(), this.A03.A37(), unskippableSeconds, this.A03.A36());
        abstractC3549r2A0l.A0D(this.A03.A31().A01(), ViewOnClickListenerC1981El.A05(this.A03));
        if (this.A03.A32().A0I().A02() == 0) {
            this.A02 = true;
            abstractC3549r2A0l.setToolbarActionMode(8);
        } else if (unskippableSeconds < 0 && this.A03.A32().A0T()) {
            if (A0G[5].length() != 4) {
                throw new RuntimeException();
            }
            A0G[5] = "12R7";
            abstractC3549r2A0l.setToolbarActionMode(4);
        }
        if (this.A03.A32().A0I().A02() >= 0) {
            abstractC3549r2A0l.setProgressSpinnerInvisible(true);
        }
        abstractC3549r2A0l.setToolbarListener(new D9(this));
        return abstractC3549r2A0l;
    }

    private void A0h() {
        if (this.A03.A32().A0X()) {
            C3596rn c3596rnA0F = new C3598rp(this.A05, this.A03.A32().A0J(), this.A03.A35()).A0A(this.A03.A31().A01()).A0F();
            AbstractC3331nQ.A04(c3596rnA0F, this.A07, EnumC3328nN.A0U);
            addView(c3596rnA0F, A0H);
            c3596rnA0F.A04(new DB(this));
            return;
        }
        A0q();
    }

    public final C3467pi A0j(int i, AbstractRunnableC3416oq abstractRunnableC3416oq, C1878Am c1878Am) {
        C3467pi timer = new C3467pi(i, new DD(this, i, c1878Am, abstractRunnableC3416oq));
        timer.A07();
        return timer;
    }

    public final C3467pi A0k(int i, AbstractRunnableC3416oq abstractRunnableC3416oq, C1878Am c1878Am, InterfaceC3624sF interfaceC3624sF) {
        C3467pi timer = new C3467pi(i, new DC(this, i, c1878Am, interfaceC3624sF, abstractRunnableC3416oq));
        timer.A07();
        return timer;
    }

    public AbstractC3549r2 A0l() {
        if (A0u()) {
            if (this.A03.A2D()) {
                return new C2019Fy(this.A05, getAppOpenAdVariant(), this.A03, 8, new DA(this));
            }
            return new C2007Fl(this.A05, this.A03, 1);
        }
        return new FullScreenAdToolbar(this.A05, this.A0A, this.A07, 1, this.A03.A2u(), this.A03.A2e());
    }

    public void A0m() {
        if (!this.A03.A2D()) {
            return;
        }
        AbstractC3549r2 abstractC3549r2 = this.A09;
        if (A0G[4].length() == 31) {
            throw new RuntimeException();
        }
        A0G[4] = "c";
        Rect margins = abstractC3549r2.getRequestedMargins();
        if (margins == null) {
            return;
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.A09.getLayoutParams();
        layoutParams.setMargins(margins.left, margins.top, margins.right, margins.bottom);
        this.A09.setLayoutParams(layoutParams);
    }

    public final void A0n() {
        if (!this.A00) {
            this.A0C.A0U();
            this.A00 = true;
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0047  */
    /* JADX WARN: Code duplicated, block: B:13:0x005e  */
    /* JADX WARN: Code duplicated, block: B:16:0x008e  */
    /* JADX WARN: Code duplicated, block: B:18:0x009f  */
    public final void A0o() {
        C2832fE c2832fEA32;
        String[] strArr;
        C2835fH c2835fHA0I;
        if (this.A09.getToolbarActionMode() == 8) {
            AbstractC3549r2 abstractC3549r2 = this.A09;
            String[] strArr2 = A0G;
            if (strArr2[6].charAt(27) == strArr2[2].charAt(27)) {
                String[] strArr3 = A0G;
                strArr3[3] = "eZr61MFsF2rwL";
                strArr3[7] = "T1wa3uRffD5Dg";
                abstractC3549r2.setToolbarActionMode(2);
                if (this.A03.A32().A0I().A07() != null) {
                    c2835fHA0I = this.A03.A32().A0I();
                    if (A0G[4].length() != 31) {
                        String[] strArr4 = A0G;
                        strArr4[6] = "COHiJK7VoTgBq0De7peYJOsfOEOe3XIQ";
                        strArr4[2] = "lGG8rOrP44fRkZ7H96nSjg4VgGaefoVT";
                        c2835fHA0I.A07().A0T(0);
                    }
                }
                this.A03.A3D(false);
                c2832fEA32 = this.A03.A32();
                strArr = A0G;
                if (strArr[1].length() != strArr[0].length()) {
                    String[] strArr5 = A0G;
                    strArr5[1] = "wiu2MLgd3UkZmOSHZtDxRr0HkSCWnOg";
                    strArr5[0] = "Ed0NbamE8O";
                    c2832fEA32.A0N(-1);
                    return;
                }
                String[] strArr6 = A0G;
                strArr6[3] = "aRfbrWr89hb3J";
                strArr6[7] = "GJWDx2ihyHFEK";
                c2832fEA32.A0N(-1);
                return;
            }
        } else {
            if (this.A03.A32().A0I().A07() != null) {
                c2835fHA0I = this.A03.A32().A0I();
                if (A0G[4].length() != 31) {
                    String[] strArr7 = A0G;
                    strArr7[6] = "COHiJK7VoTgBq0De7peYJOsfOEOe3XIQ";
                    strArr7[2] = "lGG8rOrP44fRkZ7H96nSjg4VgGaefoVT";
                    c2835fHA0I.A07().A0T(0);
                }
            }
            this.A03.A3D(false);
            c2832fEA32 = this.A03.A32();
            strArr = A0G;
            if (strArr[1].length() != strArr[0].length()) {
                String[] strArr8 = A0G;
                strArr8[1] = "wiu2MLgd3UkZmOSHZtDxRr0HkSCWnOg";
                strArr8[0] = "Ed0NbamE8O";
                c2832fEA32.A0N(-1);
                return;
            }
            String[] strArr9 = A0G;
            strArr9[3] = "aRfbrWr89hb3J";
            strArr9[7] = "GJWDx2ihyHFEK";
            c2832fEA32.A0N(-1);
            return;
        }
        throw new RuntimeException();
    }

    public final void A0r(ViewGroup viewGroup) {
        if (this.A03.A2D() && getAppOpenAdVariant() == EnumC3554r7.A07) {
            C3759uQ c3759uQ = new C3759uQ(this.A05);
            c3759uQ.setRadius(AbstractC3480pv.A0y);
            c3759uQ.addView(viewGroup, new ViewGroup.LayoutParams(-1, -1));
            this.A01 = c3759uQ;
            return;
        }
        this.A01 = viewGroup;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC3557rA
    public final void ABc(Intent intent, Bundle bundle, C3095jY c3095jY) {
        this.A0A.A4V(this, A0H);
        A0s(c3095jY);
        A0h();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC3557rA
    public final void AKD(Bundle bundle) {
    }

    private EnumC3554r7 getAppOpenAdVariant() {
        if (this.A03.A1U().equals(A0g(0, 5, 98))) {
            return EnumC3554r7.A07;
        }
        return EnumC3554r7.A08;
    }

    public Integer getBackgroundColorForToolbar() {
        if (this.A03.A2D()) {
            Integer num = getAppOpenAdVariant().A03;
            if (A0G[4].length() == 31) {
                throw new RuntimeException();
            }
            String[] strArr = A0G;
            strArr[1] = "PAMmmot6Tf7Ql1BWqbyc3bNBHIv9DUl";
            strArr[0] = "h1W7xn1Xng";
            return num;
        }
        return null;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC3557rA
    public String getCurrentClientToken() {
        return this.A03.A37();
    }

    public boolean onActivityResult(int i, int i2, Intent intent) {
        return false;
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (!A0u() && Build.VERSION.SDK_INT >= 35) {
            setFitsSystemWindows(true);
        }
        A0m();
        if (A0G[4].length() == 31) {
            throw new RuntimeException();
        }
        String[] strArr = A0G;
        strArr[3] = "ppFHHBjYkV1v1";
        strArr[7] = "EE8p4ctuHDbMc";
    }

    public void onDestroy() {
        this.A0D.A03();
        if (!TextUtils.isEmpty(this.A03.A37())) {
            this.A06.ABt(this.A03.A37(), new C3715ti().A05(this.A0C).A04(this.A08).A07());
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        this.A08.A06(this.A05, motionEvent, this, this);
        return super.onInterceptTouchEvent(motionEvent);
    }

    public void setListener(InterfaceC3556r9 interfaceC3556r9) {
    }

    public void setUpFullscreenMode(boolean z) {
        EnumC3508qN enumC3508qN;
        if (z) {
            enumC3508qN = EnumC3508qN.A04;
        } else {
            enumC3508qN = EnumC3508qN.A03;
        }
        ViewOnSystemUiVisibilityChangeListenerC3509qO viewOnSystemUiVisibilityChangeListenerC3509qO = this.A0D;
        String[] strArr = A0G;
        if (strArr[3].length() != strArr[7].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0G;
        strArr2[6] = "qfOTxDoWDRCl3cD5KSGOieDqypiePN9l";
        strArr2[2] = "QItBARXNxGEv5WetvuW2OzigLPzeTM1z";
        viewOnSystemUiVisibilityChangeListenerC3509qO.A05(enumC3508qN);
    }
}
