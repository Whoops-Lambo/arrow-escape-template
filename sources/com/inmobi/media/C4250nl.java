package com.inmobi.media;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: com.inmobi.media.nl, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class C4250nl extends ImageView {
    public static final /* synthetic */ int b = 0;
    public double a;

    @Override // android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(com.safedk.android.utils.h.i, this, me);
        return super.dispatchTouchEvent(me);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4250nl(Context context) {
        super(context);
        context.getClass();
        this.a = 1.0d;
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        if (size == 0 && size2 == 0) {
            super.onMeasure(i, i2);
            return;
        }
        if (size == 0) {
            setMeasuredDimension((int) (((double) size2) * this.a), size2);
            return;
        }
        double d = this.a;
        if (size2 == 0) {
            setMeasuredDimension(size, (int) (((double) size) / d));
            return;
        }
        int i3 = (int) (((double) size) / d);
        if (i3 <= size2) {
            setMeasuredDimension(size, i3);
        } else {
            setMeasuredDimension((int) (((double) size2) * d), size2);
        }
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(@Nullable Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        if (bitmap != null && bitmap.getHeight() > 0) {
            this.a = ((double) bitmap.getWidth()) / ((double) bitmap.getHeight());
            requestLayout();
        }
    }
}
