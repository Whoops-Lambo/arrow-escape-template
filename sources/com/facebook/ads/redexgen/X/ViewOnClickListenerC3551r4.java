package com.facebook.ads.redexgen.X;

import android.view.View;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.r4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes.dex */
public class ViewOnClickListenerC3551r4 implements View.OnClickListener {
    public final /* synthetic */ C2019Fy A00;

    public ViewOnClickListenerC3551r4(C2019Fy c2019Fy) {
        this.A00 = c2019Fy;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws Throwable {
        if (AbstractC3408oi.A02(this)) {
            return;
        }
        try {
            this.A00.A0G();
        } catch (Throwable th) {
            AbstractC3408oi.A00(th, this);
        }
    }
}
