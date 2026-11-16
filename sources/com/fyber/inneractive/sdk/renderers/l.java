package com.fyber.inneractive.sdk.renderers;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.RelativeLayout;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.unity3d.services.UnityAdsConstants;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class l extends RelativeLayout {
    public final float a;

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(com.safedk.android.utils.h.p, this, me);
        return super.dispatchTouchEvent(me);
    }

    public l(Context context, float f) {
        super(context);
        this.a = f;
    }

    @Override // android.widget.RelativeLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int iMakeMeasureSpec;
        View.MeasureSpec.getMode(i);
        int mode = View.MeasureSpec.getMode(i2);
        if (mode != 0 && (mode != Integer.MIN_VALUE || View.MeasureSpec.getSize(i2) <= 0)) {
            int size = View.MeasureSpec.getSize(i);
            int size2 = View.MeasureSpec.getSize(i2);
            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, 1073741824);
            i2 = View.MeasureSpec.makeMeasureSpec(size2, 1073741824);
        } else {
            int size3 = View.MeasureSpec.getSize(i);
            int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(size3, 1073741824);
            float f = this.a;
            if (f != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                i2 = View.MeasureSpec.makeMeasureSpec((int) (size3 * f), 1073741824);
            }
            iMakeMeasureSpec = iMakeMeasureSpec2;
        }
        super.onMeasure(iMakeMeasureSpec, i2);
    }
}
