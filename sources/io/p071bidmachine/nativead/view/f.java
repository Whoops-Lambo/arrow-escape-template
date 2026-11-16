package io.p071bidmachine.nativead.view;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import io.p071bidmachine.LabelData;
import io.p071bidmachine.util.p;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes10.dex */
public final class f extends FrameLayout {
    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch("io.bidmachine", this, me);
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

    public final ImageView a(LabelData labelData, int i, int i2) {
        ImageView imageView = new ImageView(getContext());
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        imageView.setImageBitmap(labelData.getImage());
        Context context = imageView.getContext();
        context.getClass();
        int iK = p.k(context, labelData.getWidthDp());
        Context context2 = imageView.getContext();
        context2.getClass();
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(iK, p.k(context2, labelData.getHeightDp()));
        layoutParams.setMargins(i, 0, i2, 0);
        imageView.setLayoutParams(layoutParams);
        return imageView;
    }
}
