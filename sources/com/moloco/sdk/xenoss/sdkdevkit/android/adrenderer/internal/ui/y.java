package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Space;
import android.widget.TextView;
import androidx.annotation.ColorInt;
import androidx.compose.runtime.internal.StabilityInferred;
import com.ecffri.arrows.R;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.unity3d.services.UnityAdsConstants;
import defpackage.e80;
import defpackage.rd1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
@StabilityInferred
@SuppressLint({"ViewConstructor"})
public final class y extends LinearLayout {
    public static final int a = 0;

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(com.safedk.android.utils.h.D, this, me);
        return super.dispatchTouchEvent(me);
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class a extends ImageView {
        @Override // android.view.View
        public boolean dispatchTouchEvent(MotionEvent me) {
            DetectTouchUtils.viewOnTouch(com.safedk.android.utils.h.D, this, me);
            return super.dispatchTouchEvent(me);
        }

        @Override // android.widget.ImageView, android.view.View
        protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
            if (1 == 0) {
                setMeasuredDimension(0, 0);
            } else {
                super.onMeasure(widthMeasureSpec, heightMeasureSpec);
            }
        }

        public a(Context context) {
            super(context);
        }

        @Override // android.widget.ImageView, android.view.View
        public void onDraw(Canvas canvas) {
            canvas.getClass();
            canvas.save();
            canvas.clipRect(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, getWidth() / 2.0f, getHeight());
            super.onDraw(canvas);
            canvas.restore();
        }
    }

    public final FrameLayout a(Context context, int i, @ColorInt int i2, @ColorInt int i3) {
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setLayoutParams(new LinearLayout.LayoutParams(i, i));
        ImageView imageView = new ImageView(context);
        imageView.setLayoutParams(new FrameLayout.LayoutParams(i, i));
        imageView.setImageResource(R.drawable.moloco_star);
        imageView.setImageTintList(ColorStateList.valueOf(i3));
        frameLayout.addView(imageView);
        a aVar = new a(context);
        aVar.setLayoutParams(new FrameLayout.LayoutParams(i, i));
        aVar.setImageResource(R.drawable.moloco_star);
        aVar.setImageTintList(ColorStateList.valueOf(i2));
        frameLayout.addView(aVar);
        return frameLayout;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(@NotNull Context context, float f, int i, int i2, @ColorInt int i3, @ColorInt int i4, float f2) {
        super(context);
        context.getClass();
        setOrientation(0);
        setGravity(16);
        int iA = c.a(i2, context);
        int iFloor = (int) Math.floor(f);
        int iP = rd1.p(10.0f * f) - (iFloor * 10);
        if (1 <= i) {
            int i5 = 1;
            while (true) {
                if (i5 <= iFloor) {
                    addView(a(context, iA, i3));
                } else if (i5 == iFloor + 1 && 1 <= iP && iP < 10) {
                    addView(a(context, iA, i3, i4));
                } else {
                    addView(a(context, iA, i4));
                }
                if (i5 == i) {
                    break;
                } else {
                    i5++;
                }
            }
        }
        View space = new Space(context);
        space.setLayoutParams(new LinearLayout.LayoutParams(c.a(4, context), 0));
        addView(space);
        TextView textView = new TextView(context);
        textView.setText(String.valueOf(f));
        textView.setTextColor(-1);
        textView.setTextSize(f2);
        textView.setMaxLines(1);
        addView(textView);
    }

    public final ImageView a(Context context, int i, @ColorInt int i2) {
        ImageView imageView = new ImageView(context);
        imageView.setLayoutParams(new LinearLayout.LayoutParams(i, i));
        imageView.setImageResource(R.drawable.moloco_star);
        imageView.setImageTintList(ColorStateList.valueOf(i2));
        return imageView;
    }

    public /* synthetic */ y(Context context, float f, int i, int i2, int i3, int i4, float f2, int i5, e80 e80Var) {
        this(context, (i5 & 2) != 0 ? 4.8f : f, (i5 & 4) != 0 ? 5 : i, (i5 & 8) != 0 ? 12 : i2, (i5 & 16) != 0 ? -1 : i3, (i5 & 32) != 0 ? -7829368 : i4, (i5 & 64) != 0 ? 9.0f : f2);
    }
}
