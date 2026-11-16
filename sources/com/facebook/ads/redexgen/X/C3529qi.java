package com.facebook.ads.redexgen.X;

import android.view.GestureDetector;
import android.view.MotionEvent;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.qi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes.dex */
public class C3529qi extends GestureDetector.SimpleOnGestureListener {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ InterfaceC3530qj A02;
    public final /* synthetic */ ViewOnTouchListenerC3531qk A03;

    public C3529qi(ViewOnTouchListenerC3531qk viewOnTouchListenerC3531qk, InterfaceC3530qj interfaceC3530qj, int i, int i2) {
        this.A03 = viewOnTouchListenerC3531qk;
        this.A02 = interfaceC3530qj;
        this.A00 = i;
        this.A01 = i2;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        if (motionEvent == null || motionEvent2 == null) {
            return false;
        }
        float y = motionEvent2.getY() - motionEvent.getY();
        float diffX = motionEvent2.getX() - motionEvent.getX();
        float diffY = Math.abs(y);
        if (diffY > Math.abs(diffX) && y > this.A00) {
            float diffY2 = Math.abs(f2);
            if (diffY2 > this.A01) {
                this.A02.AHF();
                return true;
            }
        }
        return false;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        this.A02.AH4();
        return true;
    }
}
