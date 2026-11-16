package com.google.android.material.timepicker;

import android.view.ViewTreeObserver;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class b implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ ClockFaceView a;

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        ClockFaceView clockFaceView = this.a;
        ClockHandView clockHandView = clockFaceView.v;
        if (clockFaceView.isShown()) {
            clockFaceView.getViewTreeObserver().removeOnPreDrawListener(this);
            int height = ((clockFaceView.getHeight() / 2) - clockHandView.d) - clockFaceView.D;
            if (height != clockFaceView.t) {
                clockFaceView.t = height;
                clockFaceView.k();
                clockHandView.l = clockFaceView.t;
                clockHandView.invalidate();
            }
        }
        return true;
    }

    public b(ClockFaceView clockFaceView) {
        this.a = clockFaceView;
    }
}
