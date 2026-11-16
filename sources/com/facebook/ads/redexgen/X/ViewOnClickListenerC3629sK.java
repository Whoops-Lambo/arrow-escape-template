package com.facebook.ads.redexgen.X;

import android.view.View;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.sK, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes.dex */
public class ViewOnClickListenerC3629sK implements View.OnClickListener {
    public final /* synthetic */ FE A00;

    public ViewOnClickListenerC3629sK(FE fe) {
        this.A00 = fe;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws Throwable {
        if (AbstractC3408oi.A02(this)) {
            return;
        }
        try {
            this.A00.A0D.ABY();
        } catch (Throwable th) {
            AbstractC3408oi.A00(th, this);
        }
    }
}
