package com.facebook.ads.redexgen.X;

import android.view.View;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.rw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes.dex */
public class ViewOnClickListenerC3605rw implements View.OnClickListener {
    public final /* synthetic */ FI A00;

    public ViewOnClickListenerC3605rw(FI fi) {
        this.A00 = fi;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws Throwable {
        if (AbstractC3408oi.A02(this)) {
            return;
        }
        try {
            this.A00.A07.AEx();
        } catch (Throwable th) {
            AbstractC3408oi.A00(th, this);
        }
    }
}
