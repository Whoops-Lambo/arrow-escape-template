package com.facebook.ads.redexgen.X;

import android.view.View;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.s8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes.dex */
public class ViewOnClickListenerC3617s8 implements View.OnClickListener {
    public final /* synthetic */ C3619sA A00;

    public ViewOnClickListenerC3617s8(C3619sA c3619sA) {
        this.A00 = c3619sA;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws Throwable {
        if (AbstractC3408oi.A02(this)) {
            return;
        }
        try {
            this.A00.A04.ABX();
        } catch (Throwable th) {
            AbstractC3408oi.A00(th, this);
        }
    }
}
