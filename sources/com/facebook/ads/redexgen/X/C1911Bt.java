package com.facebook.ads.redexgen.X;

import android.view.ViewGroup;
import java.util.List;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Bt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes.dex */
public final class C1911Bt extends AbstractC3045ik<C1909Br> {
    public final int A00;
    public final C2055Hi A01;
    public final ViewOnClickListenerC1981El A02;
    public final List<String> A03;

    public C1911Bt(C2055Hi c2055Hi, List<String> screenshotUrls, int i, ViewOnClickListenerC1981El viewOnClickListenerC1981El) {
        this.A03 = screenshotUrls;
        this.A00 = i;
        this.A01 = c2055Hi;
        this.A02 = viewOnClickListenerC1981El;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.AbstractC3045ik
    /* JADX INFO: renamed from: A01, reason: merged with bridge method [inline-methods] */
    public final C1909Br A0F(ViewGroup viewGroup, int i) {
        C1910Bs c1910Bs = new C1910Bs(this.A01);
        if (C3300mv.A1C(this.A01)) {
            c1910Bs.setOnClickListener(new ViewOnClickListenerC2924gi(this));
        }
        return new C1909Br(c1910Bs);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.AbstractC3045ik
    /* JADX INFO: renamed from: A02, reason: merged with bridge method [inline-methods] */
    public final void A0M(C1909Br c1909Br, int i) {
        String str = this.A03.get(i);
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -1);
        int startSpacing = this.A00 * 4;
        if (i != 0) {
            startSpacing = this.A00;
        }
        marginLayoutParams.setMargins(startSpacing, 0, i >= A0B() + (-1) ? this.A00 * 4 : this.A00, 0);
        c1909Br.A0w().setLayoutParams(marginLayoutParams);
        c1909Br.A0w().A00(str);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC3045ik
    public final int A0B() {
        return this.A03.size();
    }
}
