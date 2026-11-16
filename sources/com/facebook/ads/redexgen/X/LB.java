package com.facebook.ads.redexgen.X;

import android.view.ViewGroup;
import android.widget.ImageView;
import java.util.List;

/* JADX INFO: loaded from: assets/audience_network/classes.dex */
public abstract class LB extends AbstractC3045ik<C2012Fr> {
    public static final int A05 = (int) (AbstractC3482px.A02 * 4.0f);
    public InterfaceC2827f9 A00;
    public final List<GT> A01;
    public final int A02;
    public final C2055Hi A03;
    public final AbstractC2637c3 A04 = new LF(this);

    public LB(C3U c3u, List<GT> list, C2055Hi c2055Hi) {
        this.A03 = c2055Hi;
        this.A02 = c3u.getChildSpacing();
        this.A01 = list;
    }

    private ViewGroup.MarginLayoutParams A01(int i) {
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -1);
        int i2 = this.A02;
        if (i == 0) {
            i2 *= 2;
        }
        marginLayoutParams.setMargins(i2, 0, i >= this.A01.size() + (-1) ? this.A02 * 2 : this.A02, 0);
        return marginLayoutParams;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC3045ik
    public final int A0B() {
        return this.A01.size();
    }

    public final void A0Q(ImageView imageView, int i) {
        GT gt = this.A01.get(i);
        C3349ni adCoverImage = gt.getAdCoverImage();
        if (adCoverImage != null) {
            AsyncTaskC1989Et asyncTaskC1989EtA04 = new AsyncTaskC1989Et(imageView, this.A03).A04();
            asyncTaskC1989EtA04.A06(new LD(this, i, gt));
            asyncTaskC1989EtA04.A07(adCoverImage.getUrl());
        }
    }

    public final void A0R(InterfaceC2827f9 interfaceC2827f9) {
        this.A00 = interfaceC2827f9;
    }

    public void A0S(C2012Fr c2012Fr, int i) {
        c2012Fr.A0w().setLayoutParams(A01(i));
    }
}
