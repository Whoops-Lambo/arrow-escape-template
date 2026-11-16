package com.facebook.ads.redexgen.X;

import android.view.View;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.tE, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes.dex */
public class ViewOnClickListenerC3685tE implements View.OnClickListener {
    public final /* synthetic */ F6 A00;

    public ViewOnClickListenerC3685tE(F6 f6) {
        this.A00 = f6;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws Throwable {
        if (AbstractC3408oi.A02(this)) {
            return;
        }
        try {
            if (this.A00.A08.canGoForward()) {
                this.A00.A08.goForward();
            }
        } catch (Throwable th) {
            AbstractC3408oi.A00(th, this);
        }
    }
}
