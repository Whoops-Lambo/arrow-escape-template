package com.facebook.ads.redexgen.X;

import android.widget.ImageView;
import android.widget.RelativeLayout;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Bs, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes.dex */
public final class C1910Bs extends C3759uQ {
    public final ImageView A00;
    public final C2055Hi A01;

    public C1910Bs(C2055Hi c2055Hi) {
        super(c2055Hi);
        this.A01 = c2055Hi;
        this.A00 = new ImageView(c2055Hi);
        this.A00.setAdjustViewBounds(true);
        addView(this.A00, new RelativeLayout.LayoutParams(-2, -1));
    }

    public final void A00(String str) {
        AsyncTaskC1989Et downloadImageTask = new AsyncTaskC1989Et(this.A00, this.A01);
        downloadImageTask.A04();
        downloadImageTask.A07(str);
    }
}
