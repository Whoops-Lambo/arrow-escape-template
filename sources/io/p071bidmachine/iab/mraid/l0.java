package io.p071bidmachine.iab.mraid;

import android.graphics.Point;
import android.view.GestureDetector;
import android.view.MotionEvent;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class l0 extends GestureDetector.SimpleOnGestureListener {
    public boolean a;
    public volatile long b;
    public volatile Point c;

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        Point point;
        motionEvent.getClass();
        boolean z = true;
        this.a = true;
        this.b = System.currentTimeMillis();
        if (motionEvent.getSource() != 2) {
            z = false;
        }
        if (!z) {
            point = new Point((int) motionEvent.getRawX(), (int) motionEvent.getRawY());
        } else {
            point = null;
        }
        this.c = point;
        return super.onSingleTapUp(motionEvent);
    }
}
