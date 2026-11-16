package androidx.constraintlayout.utils.widget;

import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.widget.ImageView;
import androidx.annotation.RequiresApi;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.appcompat.widget.AppCompatImageView;
import com.unity3d.services.UnityAdsConstants;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public class ImageFilterView extends AppCompatImageView {
    public Drawable a;
    public float b;
    public float c;
    public float d;
    public float e;
    public float f;
    public float g;
    public float h;

    /* JADX INFO: renamed from: androidx.constraintlayout.utils.widget.ImageFilterView$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class AnonymousClass1 extends ViewOutlineProvider {
        @Override // android.view.ViewOutlineProvider
        public final void getOutline(View view, Outline outline) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: androidx.constraintlayout.utils.widget.ImageFilterView$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class AnonymousClass2 extends ViewOutlineProvider {
        @Override // android.view.ViewOutlineProvider
        public final void getOutline(View view, Outline outline) {
            throw null;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class ImageMatrix {
    }

    private void setOverlay(boolean z) {
    }

    public float getBrightness() {
        throw null;
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

    public final void c() {
        if (Float.isNaN(this.e) && Float.isNaN(this.f) && Float.isNaN(this.g) && Float.isNaN(this.h)) {
            return;
        }
        boolean zIsNaN = Float.isNaN(this.e);
        float f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        float f2 = zIsNaN ? 0.0f : this.e;
        float f3 = Float.isNaN(this.f) ? 0.0f : this.f;
        float f4 = Float.isNaN(this.g) ? 1.0f : this.g;
        if (!Float.isNaN(this.h)) {
            f = this.h;
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

    public final void d() {
        if (Float.isNaN(this.e) && Float.isNaN(this.f) && Float.isNaN(this.g) && Float.isNaN(this.h)) {
            setScaleType(ImageView.ScaleType.FIT_CENTER);
        } else {
            c();
        }
    }

    public float getCrossfade() {
        return this.b;
    }

    public float getImagePanX() {
        return this.e;
    }

    public float getImagePanY() {
        return this.f;
    }

    public float getImageRotate() {
        return this.h;
    }

    public float getImageZoom() {
        return this.g;
    }

    public float getRound() {
        return this.d;
    }

    public float getRoundPercent() {
        return this.c;
    }

    public void setCrossfade(float f) {
        this.b = f;
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        if (this.a == null || drawable == null) {
            super.setImageDrawable(drawable);
        } else {
            drawable.mutate();
            throw null;
        }
    }

    public void setImagePanX(float f) {
        this.e = f;
        d();
    }

    public void setImagePanY(float f) {
        this.f = f;
        d();
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageResource(int i) {
        if (this.a == null) {
            super.setImageResource(i);
        } else {
            AppCompatResources.a(getContext(), i).mutate();
            throw null;
        }
    }

    public void setImageRotate(float f) {
        this.h = f;
        d();
    }

    public void setImageZoom(float f) {
        this.g = f;
        d();
    }

    @RequiresApi
    public void setRoundPercent(float f) {
        boolean z = this.c != f;
        this.c = f;
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
        c();
    }

    public void setAltImageResource(int i) {
        this.a = AppCompatResources.a(getContext(), i).mutate();
        throw null;
    }

    @RequiresApi
    public void setRound(float f) {
        boolean z;
        if (Float.isNaN(f)) {
            this.d = f;
            float f2 = this.c;
            this.c = -1.0f;
            setRoundPercent(f2);
            return;
        }
        if (this.d != f) {
            z = true;
        } else {
            z = false;
        }
        this.d = f;
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
