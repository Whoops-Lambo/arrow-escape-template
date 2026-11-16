package io.p071bidmachine.rendering.internal.view.privacy;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.widget.Button;
import com.ecffri.arrows.R;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import io.p071bidmachine.util.p;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends Button {
    @Override // android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch("io.bidmachine", this, me);
        return super.dispatchTouchEvent(me);
    }

    @Override // android.widget.TextView, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    public final void setActionIcon(@Nullable Drawable drawable) {
        Drawable drawableMutate;
        Context context = getContext();
        context.getClass();
        int color = context.getColor(R.color.bm_privacy_button_icon_color);
        if (drawable != null) {
            if (drawable instanceof BitmapDrawable) {
                Bitmap bitmap = ((BitmapDrawable) drawable).getBitmap();
                Context context2 = getContext();
                context2.getClass();
                int iK = p.k(context2, 24.0f);
                int width = bitmap.getWidth();
                int height = bitmap.getHeight();
                if (width != iK || height != iK) {
                    float f = iK;
                    float f2 = width;
                    float f3 = height;
                    float fMin = Math.min(f / f2, f / f3);
                    drawable = new BitmapDrawable(getContext().getResources(), Bitmap.createScaledBitmap(bitmap, (int) (f2 * fMin), (int) (f3 * fMin), true));
                }
            }
            drawableMutate = drawable.mutate();
            drawableMutate.setTint(color);
        } else {
            drawableMutate = null;
        }
        setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, drawableMutate, (Drawable) null);
    }
}
