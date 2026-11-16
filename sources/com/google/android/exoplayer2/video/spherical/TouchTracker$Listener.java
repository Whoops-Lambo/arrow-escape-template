package com.google.android.exoplayer2.video.spherical;

import android.graphics.PointF;
import android.view.MotionEvent;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public interface TouchTracker$Listener {
    void onScrollChange(PointF pointF);

    default boolean onSingleTapUp(MotionEvent motionEvent) {
        return false;
    }
}
