package com.bytedance.adsdk.ugeno.ra.uq;

import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.util.Log;
import android.widget.ImageView;
import com.unity3d.services.UnityAdsConstants;
import defpackage.d;
import defpackage.h50;
import defpackage.ra3;
import java.util.HashSet;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public class ahm extends Drawable {
    private Shader.TileMode at;
    private final Paint ct;
    private final boolean[] dg;
    private final RectF fi;
    private ColorStateList fpp;
    private final Paint gf;
    private boolean kus;
    private final int noq;
    private final RectF nu;
    private final Matrix ra;
    private final RectF rz;
    private ImageView.ScaleType sx;
    private Shader.TileMode twf;
    private float um;
    private final Bitmap uq;
    private float vs;
    private boolean xh;
    private final int yo;
    private final RectF kgy = new RectF();
    private final RectF ahm = new RectF();

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    /* JADX INFO: renamed from: com.bytedance.adsdk.ugeno.ra.uq.ahm$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] kgy;

        static {
            int[] iArr = new int[ImageView.ScaleType.values().length];
            kgy = iArr;
            try {
                iArr[ImageView.ScaleType.CENTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                kgy[ImageView.ScaleType.CENTER_CROP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                kgy[ImageView.ScaleType.CENTER_INSIDE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                kgy[ImageView.ScaleType.FIT_CENTER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                kgy[ImageView.ScaleType.FIT_END.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                kgy[ImageView.ScaleType.FIT_START.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                kgy[ImageView.ScaleType.FIT_XY.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    private void ahm(Canvas canvas) {
        float f;
        float f2;
        if (ahm(this.dg) || this.vs == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            return;
        }
        RectF rectF = this.ahm;
        float f3 = rectF.left;
        float f4 = rectF.top;
        float fWidth = rectF.width() + f3;
        float fHeight = this.ahm.height() + f4;
        float f5 = this.vs;
        float f6 = this.um / 2.0f;
        if (this.dg[0]) {
            f = f4;
        } else {
            f = f4;
            canvas.drawLine(f3 - f6, f4, f3 + f5, f, this.gf);
            canvas.drawLine(f3, f - f6, f3, f + f5, this.gf);
        }
        if (!this.dg[1]) {
            float f7 = f;
            canvas.drawLine((fWidth - f5) - f6, f7, fWidth, f, this.gf);
            canvas.drawLine(fWidth, f7 - f6, fWidth, f7 + f5, this.gf);
            fWidth = fWidth;
        }
        if (this.dg[2]) {
            f2 = fHeight;
        } else {
            canvas.drawLine((fWidth - f5) - f6, fHeight, fWidth + f6, fHeight, this.gf);
            float f8 = fWidth;
            canvas.drawLine(f8, fHeight - f5, fWidth, fHeight, this.gf);
            f2 = fHeight;
        }
        if (this.dg[3]) {
            return;
        }
        canvas.drawLine(f3 - f6, f2, f3 + f5, f2, this.gf);
        canvas.drawLine(f3, f2 - f5, f3, f2, this.gf);
    }

    private void kgy() {
        float fWidth;
        float fHeight;
        int i = AnonymousClass1.kgy[this.sx.ordinal()];
        if (i == 1) {
            this.fi.set(this.kgy);
            RectF rectF = this.fi;
            float f = this.um;
            rectF.inset(f / 2.0f, f / 2.0f);
            this.ra.reset();
            this.ra.setTranslate((int) h50.c(this.fi.width(), this.noq, 0.5f, 0.5f), (int) h50.c(this.fi.height(), this.yo, 0.5f, 0.5f));
        } else if (i == 2) {
            this.fi.set(this.kgy);
            RectF rectF2 = this.fi;
            float f2 = this.um;
            rectF2.inset(f2 / 2.0f, f2 / 2.0f);
            this.ra.reset();
            float fHeight2 = this.fi.height() * this.noq;
            float fWidth2 = this.fi.width() * this.yo;
            RectF rectF3 = this.fi;
            float fWidth3 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            if (fHeight2 > fWidth2) {
                fWidth = rectF3.height() / this.yo;
                fWidth3 = (this.fi.width() - (this.noq * fWidth)) * 0.5f;
                fHeight = 0.0f;
            } else {
                fWidth = rectF3.width() / this.noq;
                fHeight = (this.fi.height() - (this.yo * fWidth)) * 0.5f;
            }
            this.ra.setScale(fWidth, fWidth);
            Matrix matrix = this.ra;
            float f3 = this.um;
            matrix.postTranslate((f3 / 2.0f) + ((int) (fWidth3 + 0.5f)), (f3 / 2.0f) + ((int) (fHeight + 0.5f)));
        } else if (i == 3) {
            this.ra.reset();
            float fMin = (((float) this.noq) > this.kgy.width() || ((float) this.yo) > this.kgy.height()) ? Math.min(this.kgy.width() / this.noq, this.kgy.height() / this.yo) : 1.0f;
            float fWidth4 = (int) (((this.kgy.width() - (this.noq * fMin)) * 0.5f) + 0.5f);
            float fHeight3 = (int) (((this.kgy.height() - (this.yo * fMin)) * 0.5f) + 0.5f);
            this.ra.setScale(fMin, fMin);
            this.ra.postTranslate(fWidth4, fHeight3);
            this.fi.set(this.rz);
            this.ra.mapRect(this.fi);
            RectF rectF4 = this.fi;
            float f4 = this.um;
            rectF4.inset(f4 / 2.0f, f4 / 2.0f);
            this.ra.setRectToRect(this.rz, this.fi, Matrix.ScaleToFit.FILL);
        } else if (i == 5) {
            this.fi.set(this.rz);
            this.ra.setRectToRect(this.rz, this.kgy, Matrix.ScaleToFit.END);
            this.ra.mapRect(this.fi);
            RectF rectF5 = this.fi;
            float f5 = this.um;
            rectF5.inset(f5 / 2.0f, f5 / 2.0f);
            this.ra.setRectToRect(this.rz, this.fi, Matrix.ScaleToFit.FILL);
        } else if (i != 6) {
            RectF rectF6 = this.fi;
            if (i != 7) {
                rectF6.set(this.rz);
                this.ra.setRectToRect(this.rz, this.kgy, Matrix.ScaleToFit.CENTER);
                this.ra.mapRect(this.fi);
                RectF rectF7 = this.fi;
                float f6 = this.um;
                rectF7.inset(f6 / 2.0f, f6 / 2.0f);
                this.ra.setRectToRect(this.rz, this.fi, Matrix.ScaleToFit.FILL);
            } else {
                rectF6.set(this.kgy);
                RectF rectF8 = this.fi;
                float f7 = this.um;
                rectF8.inset(f7 / 2.0f, f7 / 2.0f);
                this.ra.reset();
                this.ra.setRectToRect(this.rz, this.fi, Matrix.ScaleToFit.FILL);
            }
        } else {
            this.fi.set(this.rz);
            this.ra.setRectToRect(this.rz, this.kgy, Matrix.ScaleToFit.START);
            this.ra.mapRect(this.fi);
            RectF rectF9 = this.fi;
            float f8 = this.um;
            rectF9.inset(f8 / 2.0f, f8 / 2.0f);
            this.ra.setRectToRect(this.rz, this.fi, Matrix.ScaleToFit.FILL);
        }
        this.ahm.set(this.fi);
        this.kus = true;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (this.kus) {
            BitmapShader bitmapShader = new BitmapShader(this.uq, this.at, this.twf);
            Shader.TileMode tileMode = this.at;
            Shader.TileMode tileMode2 = Shader.TileMode.CLAMP;
            if (tileMode == tileMode2 && this.twf == tileMode2) {
                bitmapShader.setLocalMatrix(this.ra);
            }
            this.ct.setShader(bitmapShader);
            this.kus = false;
        }
        if (this.xh) {
            float f = this.um;
            RectF rectF = this.ahm;
            if (f <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                canvas.drawOval(rectF, this.ct);
                return;
            } else {
                canvas.drawOval(rectF, this.ct);
                canvas.drawOval(this.fi, this.gf);
                return;
            }
        }
        if (!kgy(this.dg)) {
            canvas.drawRect(this.ahm, this.ct);
            if (this.um > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                canvas.drawRect(this.fi, this.gf);
                return;
            }
            return;
        }
        float f2 = this.vs;
        float f3 = this.um;
        RectF rectF2 = this.ahm;
        if (f3 <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            canvas.drawRoundRect(rectF2, f2, f2, this.ct);
            kgy(canvas);
        } else {
            canvas.drawRoundRect(rectF2, f2, f2, this.ct);
            canvas.drawRoundRect(this.fi, f2, f2, this.gf);
            kgy(canvas);
            ahm(canvas);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.ct.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        return this.ct.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.yo;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.noq;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        return this.fpp.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        int colorForState = this.fpp.getColorForState(iArr, 0);
        if (this.gf.getColor() == colorForState) {
            return super.onStateChange(iArr);
        }
        this.gf.setColor(colorForState);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.ct.setAlpha(i);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.ct.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setDither(boolean z) {
        this.ct.setDither(z);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setFilterBitmap(boolean z) {
        this.ct.setFilterBitmap(z);
        invalidateSelf();
    }

    public ahm(Bitmap bitmap) {
        RectF rectF = new RectF();
        this.rz = rectF;
        this.fi = new RectF();
        this.ra = new Matrix();
        this.nu = new RectF();
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        this.at = tileMode;
        this.twf = tileMode;
        this.kus = true;
        this.vs = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.dg = new boolean[]{true, true, true, true};
        this.xh = false;
        this.um = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.fpp = ColorStateList.valueOf(-16777216);
        this.sx = ImageView.ScaleType.FIT_CENTER;
        this.uq = bitmap;
        int width = bitmap.getWidth();
        this.noq = width;
        int height = bitmap.getHeight();
        this.yo = height;
        rectF.set(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, width, height);
        Paint paint = new Paint();
        this.ct = paint;
        paint.setStyle(Paint.Style.FILL);
        paint.setAntiAlias(true);
        Paint paint2 = new Paint();
        this.gf = paint2;
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setAntiAlias(true);
        paint2.setColor(this.fpp.getColorForState(getState(), -16777216));
        paint2.setStrokeWidth(this.um);
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.kgy.set(rect);
        kgy();
    }

    public static Bitmap ahm(Drawable drawable) {
        if (drawable == null) {
            return null;
        }
        if (drawable instanceof BitmapDrawable) {
            return ((BitmapDrawable) drawable).getBitmap();
        }
        try {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(Math.max(drawable.getIntrinsicWidth(), 2), Math.max(drawable.getIntrinsicHeight(), 2), Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
            drawable.draw(canvas);
            return bitmapCreateBitmap;
        } catch (Throwable unused) {
            Log.w("RoundedDrawable", "Failed to create bitmap from drawable!");
            return null;
        }
    }

    public ahm ahm(Shader.TileMode tileMode) {
        if (this.twf != tileMode) {
            this.twf = tileMode;
            this.kus = true;
            invalidateSelf();
        }
        return this;
    }

    private static boolean ahm(boolean[] zArr) {
        for (boolean z : zArr) {
            if (z) {
                return false;
            }
        }
        return true;
    }

    public static Drawable kgy(Drawable drawable) {
        if (drawable != null) {
            if (drawable instanceof ahm) {
                return drawable;
            }
            if (Build.VERSION.SDK_INT >= 28 && ra3.u(drawable)) {
                return drawable;
            }
            if (drawable instanceof LayerDrawable) {
                Drawable.ConstantState constantState = drawable.mutate().getConstantState();
                if (constantState != null) {
                    drawable = constantState.newDrawable();
                }
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                int numberOfLayers = layerDrawable.getNumberOfLayers();
                for (int i = 0; i < numberOfLayers; i++) {
                    layerDrawable.setDrawableByLayerId(layerDrawable.getId(i), kgy(layerDrawable.getDrawable(i)));
                }
                return layerDrawable;
            }
        }
        Bitmap bitmapAhm = ahm(drawable);
        return bitmapAhm != null ? new ahm(bitmapAhm) : drawable;
    }

    public static ahm kgy(Bitmap bitmap) {
        if (bitmap != null) {
            return new ahm(bitmap);
        }
        return null;
    }

    private void kgy(Canvas canvas) {
        if (ahm(this.dg) || this.vs == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            return;
        }
        RectF rectF = this.ahm;
        float f = rectF.left;
        float f2 = rectF.top;
        float fWidth = rectF.width() + f;
        float fHeight = this.ahm.height() + f2;
        float f3 = this.vs;
        if (!this.dg[0]) {
            this.nu.set(f, f2, f + f3, f2 + f3);
            canvas.drawRect(this.nu, this.ct);
        }
        if (!this.dg[1]) {
            this.nu.set(fWidth - f3, f2, fWidth, f3);
            canvas.drawRect(this.nu, this.ct);
        }
        if (!this.dg[2]) {
            this.nu.set(fWidth - f3, fHeight - f3, fWidth, fHeight);
            canvas.drawRect(this.nu, this.ct);
        }
        if (this.dg[3]) {
            return;
        }
        this.nu.set(f, fHeight - f3, f3 + f, fHeight);
        canvas.drawRect(this.nu, this.ct);
    }

    public ahm kgy(float f, float f2, float f3, float f4) {
        HashSet hashSet = new HashSet(4);
        hashSet.add(Float.valueOf(f));
        hashSet.add(Float.valueOf(f2));
        hashSet.add(Float.valueOf(f3));
        hashSet.add(Float.valueOf(f4));
        hashSet.remove(Float.valueOf(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
        if (hashSet.size() <= 1) {
            if (!hashSet.isEmpty()) {
                float fFloatValue = ((Float) hashSet.iterator().next()).floatValue();
                if (!Float.isInfinite(fFloatValue) && !Float.isNaN(fFloatValue) && fFloatValue >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    this.vs = fFloatValue;
                } else {
                    d.r("Invalid radius value: ".concat(String.valueOf(fFloatValue)));
                    return null;
                }
            } else {
                this.vs = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            }
            boolean[] zArr = this.dg;
            zArr[0] = f > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            zArr[1] = f2 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            zArr[2] = f3 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            zArr[3] = f4 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            return this;
        }
        d.r("Multiple nonzero corner radii not yet supported.");
        return null;
    }

    public ahm kgy(float f) {
        this.um = f;
        this.gf.setStrokeWidth(f);
        return this;
    }

    public ahm kgy(ColorStateList colorStateList) {
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        this.fpp = colorStateList;
        this.gf.setColor(colorStateList.getColorForState(getState(), -16777216));
        return this;
    }

    public ahm kgy(boolean z) {
        this.xh = z;
        return this;
    }

    public ahm kgy(ImageView.ScaleType scaleType) {
        if (scaleType == null) {
            scaleType = ImageView.ScaleType.FIT_CENTER;
        }
        if (this.sx != scaleType) {
            this.sx = scaleType;
            kgy();
        }
        return this;
    }

    public ahm kgy(Shader.TileMode tileMode) {
        if (this.at != tileMode) {
            this.at = tileMode;
            this.kus = true;
            invalidateSelf();
        }
        return this;
    }

    private static boolean kgy(boolean[] zArr) {
        for (boolean z : zArr) {
            if (z) {
                return true;
            }
        }
        return false;
    }
}
