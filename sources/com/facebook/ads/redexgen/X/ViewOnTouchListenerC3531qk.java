package com.facebook.ads.redexgen.X;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.qk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes.dex */
public final class ViewOnTouchListenerC3531qk implements View.OnTouchListener {
    public final GestureDetector A00;

    public ViewOnTouchListenerC3531qk(int i, int i2, Context context, InterfaceC3530qj interfaceC3530qj) {
        this.A00 = new GestureDetector(context, new C3529qi(this, interfaceC3530qj, i, i2));
    }

    public final void A00(View view) {
        if (view != null) {
            view.setOnTouchListener(this);
        }
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        return this.A00.onTouchEvent(motionEvent);
    }
}
