package com.inmobi.media;

import android.content.Context;
import android.view.MotionEvent;
import android.view.TextureView;
import android.view.View;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.unity3d.services.UnityAdsConstants;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class I5 extends TextureView {
    public float a;
    public int b;
    public int c;
    public int d;
    public int e;
    public Cg f;

    @Override // android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(com.safedk.android.utils.h.i, this, me);
        return super.dispatchTouchEvent(me);
    }

    public final void setAspectRatio(float f) {
        if (f <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            return;
        }
        this.a = f;
        requestLayout();
    }

    public final void setOnPositionChangeListener(@Nullable Cg cg) {
        this.f = cg;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public I5(Context context) {
        super(context);
        context.getClass();
        this.a = 1.0f;
        this.b = -1;
        this.c = -1;
        this.d = -1;
        this.e = -1;
        setFocusable(true);
        setFocusableInTouchMode(true);
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        int i5 = i3 - i;
        int i6 = i4 - i2;
        if (i != this.b || i2 != this.c || i5 != this.d || i6 != this.e) {
            this.b = i;
            this.c = i2;
            this.d = i5;
            this.e = i6;
            Cg cg = this.f;
            if (cg != null) {
                cg.a(i, i2, i5, i6);
            }
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        if (size != 0 && size2 != 0) {
            float f = this.a;
            if (f > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                int i3 = (int) (size / f);
                if (i3 <= size2) {
                    setMeasuredDimension(size, i3);
                    return;
                } else {
                    setMeasuredDimension((int) (size2 * f), size2);
                    return;
                }
            }
        }
        super.onMeasure(i, i2);
    }
}
