package com.facebook.ads.redexgen.X;

import android.view.View;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.sT, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes.dex */
public class ViewOnClickListenerC3638sT implements View.OnClickListener {
    public final /* synthetic */ C2920ge A00;
    public final /* synthetic */ C3625sG A01;
    public final /* synthetic */ C3639sU A02;

    public ViewOnClickListenerC3638sT(C3639sU c3639sU, C3625sG c3625sG, C2920ge c2920ge) {
        this.A02 = c3639sU;
        this.A01 = c3625sG;
        this.A00 = c2920ge;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws Throwable {
        if (AbstractC3408oi.A02(this)) {
            return;
        }
        try {
            this.A01.A01();
            this.A02.A02.AG9(this.A00);
        } catch (Throwable th) {
            AbstractC3408oi.A00(th, this);
        }
    }
}
