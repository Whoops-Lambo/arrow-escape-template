package com.facebook.ads.redexgen.X;

import android.view.View;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.rS, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes.dex */
public class ViewOnClickListenerC3575rS implements View.OnClickListener {
    public final /* synthetic */ C3578rV A00;

    public ViewOnClickListenerC3575rS(C3578rV c3578rV) {
        this.A00 = c3578rV;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws Throwable {
        if (AbstractC3408oi.A02(this)) {
            return;
        }
        try {
            this.A00.A0D();
        } catch (Throwable th) {
            AbstractC3408oi.A00(th, this);
        }
    }
}
