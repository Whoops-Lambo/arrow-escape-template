package com.facebook.ads.redexgen.X;

import android.view.View;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.s7, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes.dex */
public class ViewOnClickListenerC3616s7 implements View.OnClickListener {
    public final /* synthetic */ C3619sA A00;

    public ViewOnClickListenerC3616s7(C3619sA c3619sA) {
        this.A00 = c3619sA;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws Throwable {
        if (AbstractC3408oi.A02(this)) {
            return;
        }
        try {
            if (this.A00.A05) {
                this.A00.A04.A5c();
            } else {
                this.A00.A04.A5d();
            }
        } catch (Throwable th) {
            AbstractC3408oi.A00(th, this);
        }
    }
}
