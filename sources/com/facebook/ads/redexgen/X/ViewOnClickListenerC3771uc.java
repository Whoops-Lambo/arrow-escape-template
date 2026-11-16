package com.facebook.ads.redexgen.X;

import android.view.View;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.uc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes.dex */
public class ViewOnClickListenerC3771uc implements View.OnClickListener {
    public final /* synthetic */ ViewOnClickListenerC1981El A00;
    public final /* synthetic */ String A01;

    public ViewOnClickListenerC3771uc(ViewOnClickListenerC1981El viewOnClickListenerC1981El, String str) {
        this.A00 = viewOnClickListenerC1981El;
        this.A01 = str;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws Throwable {
        if (AbstractC3408oi.A02(this)) {
            return;
        }
        try {
            this.A00.A0E(this.A01);
        } catch (Throwable th) {
            AbstractC3408oi.A00(th, this);
        }
    }
}
