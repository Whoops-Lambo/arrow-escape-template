package com.facebook.ads.redexgen.X;

import android.widget.ImageView;
import android.widget.LinearLayout;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.rk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes.dex */
public final class C3593rk extends LinearLayout {
    public static final int A03 = (int) (AbstractC3482px.A02 * 10.0f);
    public static final int A04 = (int) (AbstractC3482px.A02 * 24.0f);
    public final ImageView A00;
    public final C2916ga A01;
    public final C2055Hi A02;

    public C3593rk(C2055Hi c2055Hi) {
        super(c2055Hi);
        this.A02 = c2055Hi;
        this.A01 = AbstractC2917gb.A00(c2055Hi.A02());
        this.A00 = new ImageView(c2055Hi);
        A02();
    }

    private void A02() {
        A03(this.A00, EnumC3534qn.REDESIGN_INFO_ICON);
        setPadding(A03, A03 / 3, A03, A03 / 3);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(A04, A04);
        layoutParams.gravity = 16;
        addView(this.A00, layoutParams);
    }

    public static void A03(ImageView imageView, EnumC3534qn enumC3534qn) {
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        imageView.setImageBitmap(AbstractC3535qo.A01(enumC3534qn));
        imageView.setColorFilter(-1);
    }

    public void setAdDetails(C2853fZ c2853fZ, String str, C3329nO c3329nO, InterfaceC3556r9 interfaceC3556r9) {
        setOnClickListener(new ViewOnClickListenerC3592rj(this, c3329nO, interfaceC3556r9, str, c2853fZ));
    }

    public void setIconColors(int i) {
        this.A00.setColorFilter(i);
    }
}
