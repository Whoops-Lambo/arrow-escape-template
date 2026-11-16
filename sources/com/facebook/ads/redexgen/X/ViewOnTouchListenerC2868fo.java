package com.facebook.ads.redexgen.X;

import android.view.MotionEvent;
import android.view.View;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.fo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes.dex */
public class ViewOnTouchListenerC2868fo implements View.OnTouchListener {
    public final /* synthetic */ C1896Be A00;

    public ViewOnTouchListenerC2868fo(C1896Be c1896Be) {
        this.A00 = c1896Be;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        this.A00.A0C.A02(new B6(view, motionEvent));
        return false;
    }
}
