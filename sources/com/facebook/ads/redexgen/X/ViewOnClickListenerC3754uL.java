package com.facebook.ads.redexgen.X;

import android.view.View;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.uL, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes.dex */
public class ViewOnClickListenerC3754uL implements View.OnClickListener {
    public final /* synthetic */ C3756uN A00;

    public ViewOnClickListenerC3754uL(C3756uN c3756uN) {
        this.A00 = c3756uN;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws Throwable {
        if (AbstractC3408oi.A02(this)) {
            return;
        }
        try {
            this.A00.A05();
        } catch (Throwable th) {
            AbstractC3408oi.A00(th, this);
        }
    }
}
