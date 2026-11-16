package com.facebook.ads.redexgen.X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.facebook.ads.internal.api.AdNativeComponentView;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.rM, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes.dex */
public final class C3569rM extends AdNativeComponentView {
    public static final int A01 = (int) (AbstractC3482px.A02 * 1.0f);
    public final ImageView A00;

    public C3569rM(C2055Hi c2055Hi) {
        super(c2055Hi);
        this.A00 = new C3599rq(c2055Hi);
        this.A00.setScaleType(ImageView.ScaleType.CENTER_CROP);
        EnumC3488q3.A04(this.A00, EnumC3488q3.A0A);
        addView(this.A00, new ViewGroup.LayoutParams(-1, -1));
        AbstractC3523qc.A0O(this.A00, -2130706433);
        setPadding(A01, A01, A01, A01);
    }

    @Override // com.facebook.ads.internal.api.AdNativeComponentView
    public View getAdContentsView() {
        return this.A00;
    }

    public ImageView getImageCardView() {
        return this.A00;
    }
}
