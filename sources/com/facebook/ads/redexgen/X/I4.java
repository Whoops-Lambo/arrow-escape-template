package com.facebook.ads.redexgen.X;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;

/* JADX INFO: loaded from: assets/audience_network/classes.dex */
public class I4 implements InterfaceC3131k8 {
    public final /* synthetic */ ImageView A00;
    public final /* synthetic */ C3133kA A01;
    public final /* synthetic */ GT A02;

    public I4(C3133kA c3133kA, ImageView imageView, GT gt) {
        this.A01 = c3133kA;
        this.A00 = imageView;
        this.A02 = gt;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC3131k8
    public final void AFB(Drawable drawable) {
        GT.A0f(drawable, this.A00);
        this.A02.A1P(drawable);
    }
}
