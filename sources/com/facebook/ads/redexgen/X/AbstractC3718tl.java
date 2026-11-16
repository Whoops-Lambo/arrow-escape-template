package com.facebook.ads.redexgen.X;

import android.view.View;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.tl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes.dex */
public abstract class AbstractC3718tl {
    public static void A00(View view, boolean z, View.OnClickListener onClickListener) {
        if (!z) {
            view.setOnClickListener(onClickListener);
        } else {
            if (!z) {
                return;
            }
            ViewOnClickListenerC3717tk viewOnClickListenerC3717tk = new ViewOnClickListenerC3717tk(onClickListener);
            view.setOnClickListener(viewOnClickListenerC3717tk);
            view.setOnTouchListener(new ViewOnTouchListenerC3716tj(viewOnClickListenerC3717tk));
        }
    }
}
