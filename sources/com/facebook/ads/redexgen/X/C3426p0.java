package com.facebook.ads.redexgen.X;

import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.p0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes.dex */
public final class C3426p0 extends LinearLayout {
    public static final int A04 = (int) (AbstractC3482px.A02 * 32.0f);
    public static final int A05 = (int) (AbstractC3482px.A02 * 8.0f);
    public TextView A00;
    public TextView A01;
    public C3758uP A02;
    public final C2055Hi A03;

    public C3426p0(C2055Hi c2055Hi) {
        super(c2055Hi);
        this.A03 = c2055Hi;
        A00(c2055Hi);
    }

    private final void A00(C2055Hi c2055Hi) {
        setGravity(16);
        this.A02 = new C3758uP(c2055Hi);
        this.A02.setFullCircleCorners(true);
        LinearLayout.LayoutParams pageImageViewParams = new LinearLayout.LayoutParams(A04, A04);
        pageImageViewParams.setMargins(0, 0, A05, 0);
        addView(this.A02, pageImageViewParams);
        LinearLayout pageInfoView = new LinearLayout(c2055Hi);
        pageInfoView.setOrientation(1);
        this.A00 = new TextView(c2055Hi);
        ViewGroup.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        AbstractC3523qc.A0b(this.A00, true, 16);
        this.A00.setEllipsize(TextUtils.TruncateAt.END);
        this.A00.setSingleLine(true);
        this.A01 = new TextView(c2055Hi);
        AbstractC3523qc.A0b(this.A01, false, 14);
        pageInfoView.addView(this.A00);
        pageInfoView.addView(this.A01);
        addView(pageInfoView, layoutParams);
    }

    public final void A01() {
        this.A02.setImageBitmap(null);
        this.A00.setText("");
        this.A01.setText("");
    }

    public final void A02(int i, int i2) {
        this.A00.setTextColor(i);
        this.A01.setTextColor(i2);
    }

    public void setPageDetails(C2853fZ c2853fZ) {
        AsyncTaskC1989Et asyncTaskC1989Et = new AsyncTaskC1989Et(this.A02, this.A03);
        asyncTaskC1989Et.A05(A04, A04);
        asyncTaskC1989Et.A07(c2853fZ.A01());
        this.A00.setText(c2853fZ.A02());
        this.A01.setText(c2853fZ.A03());
    }
}
