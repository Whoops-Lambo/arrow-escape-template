package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.core.view.ViewCompat;
import com.ecffri.arrows.R;
import com.unity3d.services.UnityAdsConstants;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
class AppCompatSeekBarHelper extends AppCompatProgressBarHelper {
    public final AppCompatSeekBar d;
    public Drawable e;
    public ColorStateList f;
    public PorterDuff.Mode g;
    public boolean h;
    public boolean i;

    public final void c() {
        Drawable drawable = this.e;
        if (drawable != null) {
            if (this.h || this.i) {
                Drawable drawableMutate = drawable.mutate();
                this.e = drawableMutate;
                if (this.h) {
                    drawableMutate.setTintList(this.f);
                }
                if (this.i) {
                    this.e.setTintMode(this.g);
                }
                if (this.e.isStateful()) {
                    this.e.setState(this.d.getDrawableState());
                }
            }
        }
    }

    public final void d(Canvas canvas) {
        if (this.e != null) {
            AppCompatSeekBar appCompatSeekBar = this.d;
            int max = appCompatSeekBar.getMax();
            if (max > 1) {
                int intrinsicWidth = this.e.getIntrinsicWidth();
                int intrinsicHeight = this.e.getIntrinsicHeight();
                int i = intrinsicWidth >= 0 ? intrinsicWidth / 2 : 1;
                int i2 = intrinsicHeight >= 0 ? intrinsicHeight / 2 : 1;
                this.e.setBounds(-i, -i2, i, i2);
                float width = ((appCompatSeekBar.getWidth() - appCompatSeekBar.getPaddingLeft()) - appCompatSeekBar.getPaddingRight()) / max;
                int iSave = canvas.save();
                canvas.translate(appCompatSeekBar.getPaddingLeft(), appCompatSeekBar.getHeight() / 2);
                for (int i3 = 0; i3 <= max; i3++) {
                    this.e.draw(canvas);
                    canvas.translate(width, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                }
                canvas.restoreToCount(iSave);
            }
        }
    }

    public AppCompatSeekBarHelper(AppCompatSeekBar appCompatSeekBar) {
        super(appCompatSeekBar);
        this.f = null;
        this.g = null;
        this.h = false;
        this.i = false;
        this.d = appCompatSeekBar;
    }

    @Override // androidx.appcompat.widget.AppCompatProgressBarHelper
    public final void a(AttributeSet attributeSet, int i) {
        super.a(attributeSet, R.attr.seekBarStyle);
        AppCompatSeekBar appCompatSeekBar = this.d;
        Context context = appCompatSeekBar.getContext();
        int[] iArr = androidx.appcompat.R.styleable.g;
        TintTypedArray tintTypedArrayE = TintTypedArray.e(context, attributeSet, iArr, R.attr.seekBarStyle);
        TypedArray typedArray = tintTypedArrayE.b;
        ViewCompat.y(appCompatSeekBar, appCompatSeekBar.getContext(), iArr, attributeSet, tintTypedArrayE.b, R.attr.seekBarStyle);
        Drawable drawableC = tintTypedArrayE.c(0);
        if (drawableC != null) {
            appCompatSeekBar.setThumb(drawableC);
        }
        Drawable drawableB = tintTypedArrayE.b(1);
        Drawable drawable = this.e;
        if (drawable != null) {
            drawable.setCallback(null);
        }
        this.e = drawableB;
        if (drawableB != null) {
            drawableB.setCallback(appCompatSeekBar);
            drawableB.setLayoutDirection(appCompatSeekBar.getLayoutDirection());
            if (drawableB.isStateful()) {
                drawableB.setState(appCompatSeekBar.getDrawableState());
            }
            c();
        }
        appCompatSeekBar.invalidate();
        if (typedArray.hasValue(3)) {
            this.g = DrawableUtils.c(typedArray.getInt(3, -1), this.g);
            this.i = true;
        }
        if (typedArray.hasValue(2)) {
            this.f = tintTypedArrayE.a(2);
            this.h = true;
        }
        tintTypedArrayE.f();
        c();
    }
}
