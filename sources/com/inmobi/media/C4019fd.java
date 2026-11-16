package com.inmobi.media;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.MediaController;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;

/* JADX INFO: renamed from: com.inmobi.media.fd, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class C4019fd extends MediaController {
    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(com.safedk.android.utils.h.i, this, me);
        return super.dispatchTouchEvent(me);
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    public C4019fd(Context context) {
        super(context);
    }

    @Override // android.widget.MediaController
    public final void show(int i) {
        super.show(i);
    }
}
