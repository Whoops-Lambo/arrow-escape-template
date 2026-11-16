package com.facebook.ads.redexgen.X;

import android.view.View;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.ok, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes.dex */
public class ViewOnClickListenerC3410ok implements View.OnClickListener {
    public final /* synthetic */ C3409oj A00;

    public ViewOnClickListenerC3410ok(C3409oj c3409oj) {
        this.A00 = c3409oj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws Throwable {
        if (AbstractC3408oi.A02(this)) {
            return;
        }
        try {
            this.A00.A05.performClick();
        } catch (Throwable th) {
            AbstractC3408oi.A00(th, this);
        }
    }
}
