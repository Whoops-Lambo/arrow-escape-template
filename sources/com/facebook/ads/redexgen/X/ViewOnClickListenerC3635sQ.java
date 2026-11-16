package com.facebook.ads.redexgen.X;

import android.view.View;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.sQ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes.dex */
public class ViewOnClickListenerC3635sQ implements View.OnClickListener {
    public final /* synthetic */ C2920ge A00;
    public final /* synthetic */ C3625sG A01;
    public final /* synthetic */ FD A02;

    public ViewOnClickListenerC3635sQ(FD fd, C3625sG c3625sG, C2920ge c2920ge) {
        this.A02 = fd;
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
            this.A02.A0D.AG9(this.A00);
        } catch (Throwable th) {
            AbstractC3408oi.A00(th, this);
        }
    }
}
