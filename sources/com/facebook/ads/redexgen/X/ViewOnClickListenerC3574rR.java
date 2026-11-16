package com.facebook.ads.redexgen.X;

import android.view.View;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.rR, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes.dex */
public class ViewOnClickListenerC3574rR implements View.OnClickListener {
    public final /* synthetic */ C18036y A00;

    public ViewOnClickListenerC3574rR(C18036y c18036y) {
        this.A00 = c18036y;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View v) throws Throwable {
        if (AbstractC3408oi.A02(this)) {
            return;
        }
        try {
            this.A00.A0B.onClick(v);
        } catch (Throwable th) {
            AbstractC3408oi.A00(th, this);
        }
    }
}
