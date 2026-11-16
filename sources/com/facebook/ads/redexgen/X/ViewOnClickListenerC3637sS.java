package com.facebook.ads.redexgen.X;

import android.view.View;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.sS, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes.dex */
public class ViewOnClickListenerC3637sS implements View.OnClickListener {
    public final /* synthetic */ C3639sU A00;

    public ViewOnClickListenerC3637sS(C3639sU c3639sU) {
        this.A00 = c3639sU;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws Throwable {
        if (AbstractC3408oi.A02(this)) {
            return;
        }
        try {
            this.A00.A02.AAG();
        } catch (Throwable th) {
            AbstractC3408oi.A00(th, this);
        }
    }
}
