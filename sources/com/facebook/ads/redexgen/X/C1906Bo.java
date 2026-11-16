package com.facebook.ads.redexgen.X;

import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Bo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes.dex */
public final class C1906Bo extends C3759uQ {
    public final ImageView A00;
    public final C2055Hi A01;

    public C1906Bo(C2055Hi c2055Hi) {
        super(c2055Hi);
        this.A01 = c2055Hi;
        setRadius(30);
        this.A00 = new ImageView(c2055Hi);
        this.A00.setAdjustViewBounds(true);
        addView(this.A00, new RelativeLayout.LayoutParams(-2, -1));
    }

    public final /* synthetic */ void A00(C3713tg c3713tg) {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        layoutParams.width = -2;
        ViewGroup viewGroup = (ViewGroup) getParent();
        if (viewGroup != null) {
            viewGroup.updateViewLayout(this, layoutParams);
        }
    }

    public void setUrl(String str) {
        AsyncTaskC1989Et asyncTaskC1989Et = new AsyncTaskC1989Et(this.A00, this.A01);
        asyncTaskC1989Et.A04();
        asyncTaskC1989Et.A07(str);
        asyncTaskC1989Et.A06(new InterfaceC3714th() { // from class: com.facebook.ads.redexgen.X.Bp
            @Override // com.facebook.ads.redexgen.X.InterfaceC3714th
            public final void AFA(C3713tg c3713tg) {
                this.A00.A00(c3713tg);
            }
        });
    }
}
