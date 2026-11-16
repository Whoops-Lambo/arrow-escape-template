package androidx.constraintlayout.utils.widget;

import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.widget.ImageView;
import androidx.annotation.RequiresApi;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.appcompat.widget.AppCompatImageButton;
import com.unity3d.services.UnityAdsConstants;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public class ImageFilterButton extends AppCompatImageButton {
    public float d;
    public float e;
    public float f;
    public Drawable g;
    public float h;
    public float i;
    public float j;
    public float k;

    /* JADX INFO: renamed from: androidx.constraintlayout.utils.widget.ImageFilterButton$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class AnonymousClass1 extends ViewOutlineProvider {
        @Override // android.view.ViewOutlineProvider
        public final void getOutline(View view, Outline outline) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: androidx.constraintlayout.utils.widget.ImageFilterButton$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class AnonymousClass2 extends ViewOutlineProvider {
        @Override // android.view.ViewOutlineProvider
        public final void getOutline(View view, Outline outline) {
            throw null;
        }
    }

    private void setOverlay(boolean z) {
    }

    public float getContrast() {
        throw null;
    }

    public float getSaturation() {
        throw null;
    }

    public float getWarmth() {
        throw null;
    }

    public void setBrightness(float f) {
        throw null;
    }

    public void setContrast(float f) {
        throw null;
    }

    public void setSaturation(float f) {
        throw null;
    }

    public void setWarmth(float f) {
        throw null;
    }

    public final void a() {
        if (Float.isNaN(this.h) && Float.isNaN(this.i) && Float.isNaN(this.j) && Float.isNaN(this.k)) {
            return;
        }
        boolean zIsNaN = Float.isNaN(this.h);
        float f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        float f2 = zIsNaN ? 0.0f : this.h;
        float f3 = Float.isNaN(this.i) ? 0.0f : this.i;
        float f4 = Float.isNaN(this.j) ? 1.0f : this.j;
        if (!Float.isNaN(this.k)) {
            f = this.k;
        }
        Matrix matrix = new Matrix();
        matrix.reset();
        float intrinsicWidth = getDrawable().getIntrinsicWidth();
        float intrinsicHeight = getDrawable().getIntrinsicHeight();
        float width = getWidth();
        float height = getHeight();
        float f5 = f4 * (intrinsicWidth * height < intrinsicHeight * width ? width / intrinsicWidth : height / intrinsicHeight);
        matrix.postScale(f5, f5);
        float f6 = intrinsicWidth * f5;
        float f7 = f5 * intrinsicHeight;
        matrix.postTranslate(((((width - f6) * f2) + width) - f6) * 0.5f, ((((height - f7) * f3) + height) - f7) * 0.5f);
        matrix.postRotate(f, width / 2.0f, height / 2.0f);
        setImageMatrix(matrix);
        setScaleType(ImageView.ScaleType.MATRIX);
    }

    public final void b() {
        if (Float.isNaN(this.h) && Float.isNaN(this.i) && Float.isNaN(this.j) && Float.isNaN(this.k)) {
            setScaleType(ImageView.ScaleType.FIT_CENTER);
        } else {
            a();
        }
    }

    public float getCrossfade() {
        return this.d;
    }

    public float getImagePanX() {
        return this.h;
    }

    public float getImagePanY() {
        return this.i;
    }

    public float getImageRotate() {
        return this.k;
    }

    public float getImageZoom() {
        return this.j;
    }

    public float getRound() {
        return this.f;
    }

    public float getRoundPercent() {
        return this.e;
    }

    public void setCrossfade(float f) {
        this.d = f;
    }

    @Override // androidx.appcompat.widget.AppCompatImageButton, android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        if (this.g == null || drawable == null) {
            super.setImageDrawable(drawable);
        } else {
            drawable.mutate();
            throw null;
        }
    }

    public void setImagePanX(float f) {
        this.h = f;
        b();
    }

    public void setImagePanY(float f) {
        this.i = f;
        b();
    }

    @Override // androidx.appcompat.widget.AppCompatImageButton, android.widget.ImageView
    public void setImageResource(int i) {
        if (this.g == null) {
            super.setImageResource(i);
        } else {
            AppCompatResources.a(getContext(), i).mutate();
            throw null;
        }
    }

    public void setImageRotate(float f) {
        this.k = f;
        b();
    }

    public void setImageZoom(float f) {
        this.j = f;
        b();
    }

    @RequiresApi
    public void setRoundPercent(float f) {
        boolean z = this.e != f;
        this.e = f;
        if (f != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            setClipToOutline(true);
            Math.min(getWidth(), getHeight());
            throw null;
        }
        setClipToOutline(false);
        if (z) {
            invalidateOutline();
        }
    }

    @Override // android.view.View
    public final void layout(int i, int i2, int i3, int i4) {
        super.layout(i, i2, i3, i4);
        a();
    }

    public void setAltImageResource(int i) {
        this.g = AppCompatResources.a(getContext(), i).mutate();
        throw null;
    }

    @RequiresApi
    public void setRound(float f) {
        boolean z;
        if (Float.isNaN(f)) {
            this.f = f;
            float f2 = this.e;
            this.e = -1.0f;
            setRoundPercent(f2);
            return;
        }
        if (this.f != f) {
            z = true;
        } else {
            z = false;
        }
        this.f = f;
        if (f == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            setClipToOutline(false);
            if (z) {
                invalidateOutline();
                return;
            }
            return;
        }
        setClipToOutline(true);
        getWidth();
        getHeight();
        throw null;
    }
}
