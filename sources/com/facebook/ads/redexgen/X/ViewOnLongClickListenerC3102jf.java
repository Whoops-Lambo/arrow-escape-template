package com.facebook.ads.redexgen.X;

import android.view.View;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.jf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes.dex */
public class ViewOnLongClickListenerC3102jf implements View.OnLongClickListener {
    public final /* synthetic */ IM A00;
    public final /* synthetic */ C3712tf A01;

    public ViewOnLongClickListenerC3102jf(IM im, C3712tf c3712tf) {
        this.A00 = im;
        this.A01 = c3712tf;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        if (this.A00.A00 != null) {
            this.A01.setBounds(0, 0, this.A00.A00.getWidth(), this.A00.A00.getHeight());
            this.A01.A0D(!this.A01.A0E());
        }
        return true;
    }
}
