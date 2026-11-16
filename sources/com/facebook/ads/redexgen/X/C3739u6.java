package com.facebook.ads.redexgen.X;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.unity3d.services.UnityAdsConstants;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.u6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes.dex */
public final class C3739u6 extends RelativeLayout {
    public static byte[] A0E;
    public static String[] A0F = {"xsUPlRCeoLzFC37Rq9JMYM7iX3bsuHdB", "3os6lxnFhvXdiVl0rZV65lsnKU3KSEIH", "ehKf7VVuykQdHVllv8tSrtO9VjF0epQ", "VVWHKhRNuaENvRDFoieWRKQbXxG1K5", "M1KEsMQqNwIwnMwtqrKXMAaQG3BWXTOc", "sIunNAxWwMAB0c9J35TP00", "CEIZkjvXEhXRbrbOcit70U", "cg6HBKkblrHzWPkAjyZy4maowCBLS0aI"};
    public static final int A0G;
    public AnimatorSet A00;
    public AnimatorSet A01;
    public AnimatorSet A02;
    public LinearLayout A03;
    public C3692tL A04;
    public F4 A05;
    public final int A06;
    public final int A07;
    public final View A08;
    public final AbstractC2798ef A09;
    public final C2927gm A0A;
    public final C2055Hi A0B;
    public final InterfaceC3556r9 A0C;
    public final ViewOnClickListenerC1981El A0D;

    public static String A06(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0E, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 98);
            if (A0F[6].length() != 22) {
                throw new RuntimeException();
            }
            String[] strArr = A0F;
            strArr[3] = "C1U42TeYYRv8UUijKyPrgKUlfuJFYA";
            strArr[2] = "qV7bTYhnTcwD5gFaBTDI3yjUAX8xNfo";
        }
        return new String(bArrCopyOfRange);
    }

    public static void A08() {
        A0E = new byte[]{46};
    }

    static {
        A08();
        A0G = AbstractC3480pv.A02;
    }

    public C3739u6(C2055Hi c2055Hi, InterfaceC3556r9 interfaceC3556r9, int i, AbstractC2798ef abstractC2798ef, ViewOnClickListenerC1981El viewOnClickListenerC1981El, View view) {
        super(c2055Hi);
        this.A0B = c2055Hi;
        this.A0C = interfaceC3556r9;
        this.A09 = abstractC2798ef;
        this.A0D = viewOnClickListenerC1981El;
        this.A08 = view;
        if (getResources().getConfiguration().orientation == 1) {
            this.A02 = new AnimatorSet();
            this.A01 = new AnimatorSet();
            this.A00 = new AnimatorSet();
        }
        int i2 = (int) (i * AbstractC3482px.A02);
        this.A07 = i2;
        this.A06 = i2 - A0G;
        this.A0A = A02();
    }

    private LinearLayout A00() {
        F4 f4;
        this.A03 = new LinearLayout(this.A0B);
        this.A03.setOrientation(1);
        this.A03.addView(A01());
        C1983En c1983En = new C1983En(this);
        if (AbstractC3301mw.A02(this.A0B) || this.A0B.A0E() == null) {
            f4 = new F4(this.A0B, c1983En);
        } else {
            f4 = new F4(this.A0B, this.A0B.A0E(), c1983En);
        }
        this.A05 = f4;
        this.A03.addView(this.A05, new LinearLayout.LayoutParams(-1, -1));
        this.A05.loadUrl(((C18267v) this.A09).A0O().toString());
        return this.A03;
    }

    private LinearLayout A01() {
        this.A04 = new C3692tL(this.A0B);
        this.A04.setGravity(17);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.setMargins(AbstractC3480pv.A0H, 0, AbstractC3480pv.A0H, 0);
        this.A04.setLayoutParams(layoutParams);
        LinearLayout linearLayout = new LinearLayout(this.A0B);
        linearLayout.addView(this.A04);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams2.setMargins(AbstractC3480pv.A0X, AbstractC3480pv.A0X, AbstractC3480pv.A0X, AbstractC3480pv.A0X);
        linearLayout.setLayoutParams(layoutParams2);
        return linearLayout;
    }

    private C2927gm A02() {
        C2927gm c2927gm = new C2927gm(this.A0B);
        c2927gm.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        c2927gm.setRadius(40.0f);
        c2927gm.addView(A00());
        c2927gm.setTranslationY(getResources().getDisplayMetrics().heightPixels);
        View view = new View(this.A0B);
        view.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        view.setBackgroundColor(0);
        view.setOnClickListener(new ViewOnClickListenerC3738u5(this));
        c2927gm.addView(view);
        return c2927gm;
    }

    private void A07() {
        if (this.A02 != null) {
            this.A02.cancel();
            this.A02 = null;
        }
        if (this.A01 != null) {
            this.A01.cancel();
            this.A01 = null;
        }
        if (this.A00 != null) {
            this.A00.cancel();
            this.A00 = null;
        }
    }

    private final void A09() {
        this.A08.setTranslationY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
    }

    public final void A0A() {
        int i = getResources().getDisplayMetrics().heightPixels;
        C2927gm c2927gm = this.A0A;
        int screenHeight = this.A07;
        String strA06 = A06(0, 1, 83);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(c2927gm, strA06, i - screenHeight);
        objectAnimatorOfFloat.setDuration(300L);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.A08, strA06, -this.A07);
        objectAnimatorOfFloat2.setDuration(300L);
        ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(this.A0A, strA06, i - this.A06);
        objectAnimatorOfFloat3.setDuration(300L);
        ObjectAnimator adDetailsViewDown = ObjectAnimator.ofFloat(this.A08, strA06, -this.A06);
        adDetailsViewDown.setDuration(300L);
        if (this.A02 != null && this.A01 != null && this.A00 != null) {
            this.A02.setInterpolator(new AccelerateDecelerateInterpolator());
            this.A02.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2);
            this.A01.playTogether(objectAnimatorOfFloat3, adDetailsViewDown);
            this.A00.playSequentially(this.A02, this.A01);
            this.A00.start();
        }
    }

    public final void A0B() {
        A07();
        this.A05.destroy();
        this.A0A.setVisibility(8);
        A09();
    }

    public final void A0C() {
        if (this.A02 != null) {
            this.A02.pause();
        }
        if (this.A01 != null) {
            this.A01.pause();
        }
        if (this.A00 != null) {
            this.A00.pause();
        }
    }

    public final void A0D(int i) {
        if (i == 2) {
            this.A0A.setVisibility(8);
            this.A08.setTranslationY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            A07();
            A09();
            return;
        }
        if (i != 1) {
            return;
        }
        int i2 = getResources().getDisplayMetrics().heightPixels;
        this.A0A.setVisibility(0);
        C2927gm c2927gm = this.A0A;
        int screenHeight = this.A06;
        c2927gm.setTranslationY(i2 - screenHeight);
        View view = this.A08;
        if (A0F[5].length() == 3) {
            throw new RuntimeException();
        }
        A0F[6] = "IUUUFMkp7wD0AV6j7TnZYJ";
        int screenHeight2 = this.A06;
        view.setTranslationY(-screenHeight2);
    }

    public C2927gm getBrowserPeekView() {
        return this.A0A;
    }
}
