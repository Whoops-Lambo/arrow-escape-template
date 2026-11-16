package com.vungle.ads.internal.ui.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.vungle.ads.internal.n1;
import com.vungle.ads.nativead.NativeVideoListener;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public class e extends RelativeLayout {
    public final n1 a;
    public ImageView b;
    public NativeVideoListener c;

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(com.safedk.android.utils.h.d, this, me);
        return super.dispatchTouchEvent(me);
    }

    @Override // android.widget.RelativeLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    @Nullable
    public final ImageView getImageView$vungle_ads_release() {
        return this.b;
    }

    @NotNull
    public final n1 getInternal() {
        return this.a;
    }

    @Nullable
    public final NativeVideoListener getNativeVideoListener() {
        return this.c;
    }

    public final void setImageView$vungle_ads_release(@Nullable ImageView imageView) {
        this.b = imageView;
    }

    public final void setNativeVideoListener(@Nullable NativeVideoListener nativeVideoListener) {
        this.c = nativeVideoListener;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(Context context, n1 n1Var) {
        super(context);
        context.getClass();
        n1Var.getClass();
        this.a = n1Var;
        ImageView imageView = new ImageView(context);
        this.b = imageView;
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.addRule(13);
        imageView.setLayoutParams(layoutParams);
        imageView.setAdjustViewBounds(true);
        addView(imageView);
    }

    public void a() {
        Drawable drawable;
        removeAllViews();
        try {
            ImageView imageView = this.b;
            if (imageView != null) {
                drawable = imageView.getDrawable();
            } else {
                drawable = null;
            }
            if (drawable instanceof BitmapDrawable) {
                Bitmap bitmap = ((BitmapDrawable) drawable).getBitmap();
                if (!bitmap.isRecycled()) {
                    bitmap.recycle();
                }
            }
        } catch (Throwable unused) {
        }
        ImageView imageView2 = this.b;
        if (imageView2 != null) {
            imageView2.setImageDrawable(null);
        }
    }

    public void a(Context context) {
        context.getClass();
        ImageView imageView = this.b;
        if (imageView != null) {
            imageView.setVisibility(0);
        }
        this.a.c(this.b);
        requestLayout();
    }
}
