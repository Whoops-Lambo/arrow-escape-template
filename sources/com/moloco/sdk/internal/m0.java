package com.moloco.sdk.internal;

import android.animation.LayoutTransition;
import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Space;
import android.widget.TextView;
import com.ecffri.arrows.R;
import com.facebook.internal.x0;
import com.fyber.inneractive.sdk.external.NativeAdContent;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import defpackage.sr0;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class m0 extends LinearLayout {
    public final sr0 a;
    public final int b;
    public final float c;

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(com.safedk.android.utils.h.D, this, me);
        return super.dispatchTouchEvent(me);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(Context context, String str, String str2, int i, int i2, sr0 sr0Var) {
        Drawable drawableMutate;
        super(context);
        context.getClass();
        this.a = sr0Var;
        this.b = getResources().getDimensionPixelSize(R.dimen.moloco_moloco_vast_cta_max_width);
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.moloco_moloco_vast_cta_image_size);
        this.c = getResources().getDimension(R.dimen.moloco_moloco_vast_cta_corner_radius);
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(R.dimen.moloco_moloco_vast_cta_image_text_gap);
        int dimensionPixelSize3 = getResources().getDimensionPixelSize(R.dimen.moloco_moloco_vast_cta_text_horizontal_padding);
        int dimensionPixelSize4 = getResources().getDimensionPixelSize(R.dimen.moloco_moloco_vast_cta_text_vertical_padding);
        setOrientation(0);
        setGravity(17);
        Drawable drawable = context.getDrawable(R.drawable.moloco_moloco_vast_cta_background);
        Drawable drawable2 = null;
        drawable2 = null;
        if (drawable != null && (drawableMutate = drawable.mutate()) != null) {
            GradientDrawable gradientDrawable = drawableMutate instanceof GradientDrawable ? (GradientDrawable) drawableMutate : null;
            if (gradientDrawable != null) {
                gradientDrawable.setColor(i2);
            }
            drawable2 = drawableMutate;
        }
        setBackground(drawable2);
        setClipToOutline(true);
        setOutlineProvider(new l0(this, 0));
        LayoutTransition layoutTransition = new LayoutTransition();
        layoutTransition.enableTransitionType(4);
        setLayoutTransition(layoutTransition);
        setClickable(true);
        setFocusable(true);
        setOnClickListener(new x0(this, 1));
        setContentDescription(NativeAdContent.ViewTag.CTA);
        if (str2 != null) {
            View space = new Space(context);
            space.setLayoutParams(new LinearLayout.LayoutParams(dimensionPixelSize2, 0));
            addView(space);
            ImageView imageView = new ImageView(context);
            imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
            imageView.setLayoutParams(new LinearLayout.LayoutParams(dimensionPixelSize, dimensionPixelSize));
            imageView.setClipToOutline(true);
            imageView.setOutlineProvider(new l0(this, 1));
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.k.a(imageView, str2);
            addView(imageView);
        }
        TextView textView = new TextView(context);
        textView.setText(str);
        textView.setMaxLines(1);
        textView.setTextColor(i);
        textView.setTypeface(Typeface.create(Typeface.DEFAULT, 1));
        textView.setPadding(dimensionPixelSize3, dimensionPixelSize4, dimensionPixelSize3, dimensionPixelSize4);
        addView(textView);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        if (View.MeasureSpec.getMode(i) != 1073741824) {
            i = View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i), this.b), Integer.MIN_VALUE);
        }
        super.onMeasure(i, i2);
    }
}
