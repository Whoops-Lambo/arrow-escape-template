package com.bytedance.adsdk.ugeno.ra.uq;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.net.Uri;
import android.util.Log;
import android.view.MotionEvent;
import android.widget.ImageView;
import com.bytedance.adsdk.ugeno.core.IAnimation;
import com.bytedance.adsdk.ugeno.ct;
import com.bytedance.adsdk.ugeno.kgy.fi;
import com.bytedance.adsdk.ugeno.kgy.yo;
import com.unity3d.services.UnityAdsConstants;
import defpackage.jc1;
import io.p071bidmachine.media3.extractor.ts.y;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public class kgy extends ImageView implements IAnimation, yo {
    static final /* synthetic */ boolean ahm = true;
    public static final Shader.TileMode kgy = Shader.TileMode.CLAMP;
    private static final ImageView.ScaleType[] uq = {ImageView.ScaleType.MATRIX, ImageView.ScaleType.FIT_XY, ImageView.ScaleType.FIT_START, ImageView.ScaleType.FIT_CENTER, ImageView.ScaleType.FIT_END, ImageView.ScaleType.CENTER, ImageView.ScaleType.CENTER_CROP, ImageView.ScaleType.CENTER_INSIDE};
    private boolean at;
    private boolean ay;
    private final float[] ct;
    private int dg;
    private float fi;
    private Shader.TileMode fpp;
    private Paint fpz;
    private float ft;
    private ColorFilter gf;
    private fi gm;
    private float ioy;
    private float jpc;
    private boolean kus;
    private Path lqi;
    private Drawable noq;
    private Drawable nu;
    private boolean ra;
    private float rz;
    private ct sx;
    private boolean twf;
    private Bitmap uf;
    private Shader.TileMode um;
    private final RectF vg;
    private int vs;
    private Canvas wy;
    private ImageView.ScaleType xh;
    private ColorStateList yo;

    public void setEraseEnabled(boolean z) {
        if (z) {
            this.lqi = new Path();
            Paint paint = new Paint();
            this.fpz = paint;
            paint.setAntiAlias(true);
            this.fpz.setDither(true);
            this.fpz.setStyle(Paint.Style.STROKE);
            this.fpz.setStrokeWidth(this.ioy * 2.0f);
            this.fpz.setStrokeCap(Paint.Cap.ROUND);
            this.fpz.setStrokeJoin(Paint.Join.ROUND);
            this.fpz.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
            this.fpz.setColor(0);
            this.ay = true;
        } else {
            this.ay = false;
        }
        postInvalidate();
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        this.vs = 0;
        this.nu = ahm.kgy(bitmap);
        rz();
        super.setImageDrawable(this.nu);
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        this.vs = 0;
        this.nu = ahm.kgy(drawable);
        rz();
        super.setImageDrawable(drawable);
    }

    /* JADX INFO: renamed from: com.bytedance.adsdk.ugeno.ra.uq.kgy$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] kgy;

        static {
            int[] iArr = new int[ImageView.ScaleType.values().length];
            kgy = iArr;
            try {
                iArr[ImageView.ScaleType.FIT_CENTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                kgy[ImageView.ScaleType.FIT_START.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                kgy[ImageView.ScaleType.FIT_END.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                kgy[ImageView.ScaleType.FIT_XY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                kgy[ImageView.ScaleType.CENTER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                kgy[ImageView.ScaleType.CENTER_CROP.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                kgy[ImageView.ScaleType.CENTER_INSIDE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    private void kgy(Drawable drawable, ImageView.ScaleType scaleType) {
        if (drawable == null) {
            return;
        }
        if (drawable instanceof ahm) {
            ahm ahmVar = (ahm) drawable;
            ahmVar.kgy(scaleType).kgy(this.fi).kgy(this.yo).kgy(this.twf).kgy(this.um).ahm(this.fpp);
            float[] fArr = this.ct;
            if (fArr != null) {
                ahmVar.kgy(fArr[0], fArr[1], fArr[2], fArr[3]);
            }
            uq();
            return;
        }
        if (drawable instanceof LayerDrawable) {
            LayerDrawable layerDrawable = (LayerDrawable) drawable;
            int numberOfLayers = layerDrawable.getNumberOfLayers();
            for (int i = 0; i < numberOfLayers; i++) {
                kgy(layerDrawable.getDrawable(i), scaleType);
            }
        }
    }

    private void rz() {
        kgy(this.nu, this.xh);
    }

    private void uq() {
        Drawable drawable = this.nu;
        if (drawable == null || !this.ra) {
            return;
        }
        Drawable drawableMutate = drawable.mutate();
        this.nu = drawableMutate;
        if (this.at) {
            drawableMutate.setColorFilter(this.gf);
        }
    }

    public int getBorderColor() {
        return this.yo.getDefaultColor();
    }

    public ColorStateList getBorderColors() {
        return this.yo;
    }

    public float getBorderRadius() {
        return this.gm.kgy();
    }

    public float getBorderWidth() {
        return this.fi;
    }

    public float getMaxCornerRadius() {
        float[] fArr = this.ct;
        float fMax = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        for (float f : fArr) {
            fMax = Math.max(f, fMax);
        }
        return fMax;
    }

    @Override // com.bytedance.adsdk.ugeno.core.IAnimation, com.bytedance.adsdk.ugeno.kgy.yo
    public float getRipple() {
        return this.rz;
    }

    @Override // com.bytedance.adsdk.ugeno.kgy.yo
    public float getRubIn() {
        return this.gm.getRubIn();
    }

    @Override // android.widget.ImageView
    public ImageView.ScaleType getScaleType() {
        return this.xh;
    }

    @Override // com.bytedance.adsdk.ugeno.kgy.yo
    public float getShine() {
        return this.gm.getShine();
    }

    @Override // com.bytedance.adsdk.ugeno.kgy.yo
    public float getStretch() {
        return this.gm.getStretch();
    }

    public Shader.TileMode getTileModeX() {
        return this.um;
    }

    public Shader.TileMode getTileModeY() {
        return this.fpp;
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        Canvas canvas2;
        try {
            if (!this.ay || (canvas2 = this.wy) == null || this.uf == null) {
                super.onDraw(canvas);
            } else {
                super.onDraw(canvas2);
                this.wy.drawPath(this.lqi, this.fpz);
                canvas.drawBitmap(this.uf, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, (Paint) null);
            }
            ct ctVar = this.sx;
            if (ctVar != null) {
                ctVar.kgy(canvas, this);
                this.sx.kgy(canvas);
            }
        } catch (Throwable unused) {
        }
    }

    @Override // android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        ct ctVar = this.sx;
        if (ctVar != null) {
            ctVar.kgy(i, i2, i3, i4);
        }
        super.onLayout(z, i, i2, i3, i4);
    }

    @Override // android.widget.ImageView, android.view.View
    public void onMeasure(int i, int i2) {
        ct ctVar = this.sx;
        if (ctVar == null) {
            super.onMeasure(i, i2);
        } else {
            int[] iArrKgy = ctVar.kgy(i, i2);
            super.onMeasure(iArrKgy[0], iArrKgy[1]);
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int iWidth;
        if (!this.ay) {
            return super.onTouchEvent(motionEvent);
        }
        this.sx.yo();
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        int action = motionEvent.getAction();
        if (action == 0) {
            this.lqi.moveTo(x, y);
            this.jpc = x;
            this.ft = y;
            HashMap map = new HashMap();
            map.put("state", 1);
            this.sx.kgy("eraseState", map);
        } else if (action == 1) {
            this.lqi.computeBounds(this.vg, true);
            try {
                iWidth = (int) (((this.vg.width() * this.vg.height()) / (getWidth() * getHeight())) * 100.0f);
            } catch (Exception unused) {
                iWidth = 0;
            }
            HashMap map2 = new HashMap();
            jc1.u(2, map2, "state", iWidth, "percent");
            this.sx.kgy("eraseState", map2);
        } else if (action == 2 && x > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && x < getWidth() && y > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && y < getHeight()) {
            float f = this.jpc;
            float f2 = this.ft;
            this.lqi.quadTo(f, f2, (f + x) / 2.0f, (f2 + y) / 2.0f);
            this.jpc = x;
            this.ft = y;
        }
        postInvalidate();
        return true;
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        ColorDrawable colorDrawable = new ColorDrawable(i);
        this.noq = colorDrawable;
        setBackgroundDrawable(colorDrawable);
    }

    @Override // android.view.View
    @Deprecated
    public void setBackgroundDrawable(Drawable drawable) {
        this.noq = drawable;
        kgy(true);
        super.setBackgroundDrawable(this.noq);
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        if (this.dg != i) {
            this.dg = i;
            Drawable drawableAhm = ahm();
            this.noq = drawableAhm;
            setBackgroundDrawable(drawableAhm);
        }
    }

    public void setBorderColor(ColorStateList colorStateList) {
        if (this.yo.equals(colorStateList)) {
            return;
        }
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(-16777216);
        }
        this.yo = colorStateList;
        rz();
        kgy(false);
        if (this.fi > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            invalidate();
        }
    }

    public void setBorderRadius(float f) {
        fi fiVar = this.gm;
        if (fiVar != null) {
            fiVar.kgy(f);
        }
    }

    public void setBorderWidth(float f) {
        if (this.fi == f) {
            return;
        }
        this.fi = f;
        rz();
        kgy(false);
        invalidate();
    }

    @Override // android.widget.ImageView
    public void setColorFilter(ColorFilter colorFilter) {
        if (this.gf != colorFilter) {
            this.gf = colorFilter;
            this.at = true;
            this.ra = true;
            uq();
            invalidate();
        }
    }

    public void setEraseRadius(float f) {
        this.ioy = f;
        Paint paint = this.fpz;
        if (paint != null) {
            paint.setStrokeWidth(f * 2.0f);
        }
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i) {
        if (this.vs != i) {
            this.vs = i;
            this.nu = kgy();
            rz();
            super.setImageDrawable(this.nu);
        }
    }

    public void setOval(boolean z) {
        this.twf = z;
        rz();
        kgy(false);
        invalidate();
    }

    @Override // com.bytedance.adsdk.ugeno.core.IAnimation
    public void setRipple(float f) {
        this.rz = f;
        fi fiVar = this.gm;
        if (fiVar != null) {
            fiVar.ahm(f);
        }
        postInvalidate();
    }

    public void setRubIn(float f) {
        fi fiVar = this.gm;
        if (fiVar != null) {
            fiVar.ct(f);
        }
    }

    @Override // android.widget.ImageView
    public void setScaleType(ImageView.ScaleType scaleType) {
        if (!ahm && scaleType == null) {
            y.o();
            return;
        }
        if (this.xh != scaleType) {
            this.xh = scaleType;
            int i = AnonymousClass1.kgy[scaleType.ordinal()];
            if (i == 1 || i == 2 || i == 3 || i == 4) {
                super.setScaleType(scaleType);
            } else {
                super.setScaleType(ImageView.ScaleType.FIT_XY);
            }
            rz();
            kgy(false);
            invalidate();
        }
    }

    public void setShine(float f) {
        fi fiVar = this.gm;
        if (fiVar != null) {
            fiVar.rz(f);
        }
    }

    public void setStretch(float f) {
        fi fiVar = this.gm;
        if (fiVar != null) {
            fiVar.uq(f);
        }
    }

    public void setTileModeX(Shader.TileMode tileMode) {
        if (this.um == tileMode) {
            return;
        }
        this.um = tileMode;
        rz();
        kgy(false);
        invalidate();
    }

    public void setTileModeY(Shader.TileMode tileMode) {
        if (this.fpp == tileMode) {
            return;
        }
        this.fpp = tileMode;
        rz();
        kgy(false);
        invalidate();
    }

    public kgy(Context context) {
        super(context);
        this.ct = new float[]{UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT};
        this.yo = ColorStateList.valueOf(-16777216);
        this.fi = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.gf = null;
        this.ra = false;
        this.at = false;
        this.twf = false;
        this.kus = false;
        Shader.TileMode tileMode = kgy;
        this.um = tileMode;
        this.fpp = tileMode;
        this.ay = false;
        this.ioy = 50.0f;
        this.vg = new RectF();
        this.gm = new fi(this);
    }

    private Drawable ahm() {
        Resources resources = getResources();
        Drawable drawable = null;
        if (resources == null) {
            return null;
        }
        int i = this.dg;
        if (i != 0) {
            try {
                drawable = resources.getDrawable(i);
            } catch (Exception e) {
                Log.w("RoundedImageView", "Unable to find resource: " + this.dg, e);
                this.dg = 0;
            }
        }
        return ahm.kgy(drawable);
    }

    @Override // android.view.View
    public void dispatchDraw(Canvas canvas) {
        try {
            super.dispatchDraw(canvas);
            ct ctVar = this.sx;
            if (ctVar != null) {
                ctVar.ahm(canvas);
            }
        } catch (Throwable unused) {
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        invalidate();
    }

    public float getCornerRadius() {
        return getMaxCornerRadius();
    }

    @Override // android.widget.ImageView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        ct ctVar = this.sx;
        if (ctVar != null) {
            ctVar.yo();
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ct ctVar = this.sx;
        if (ctVar != null) {
            ctVar.fi();
        }
        Canvas canvas = this.wy;
        if (canvas != null) {
            canvas.setBitmap(null);
        }
        Bitmap bitmap = this.uf;
        if (bitmap != null) {
            bitmap.recycle();
            this.wy = null;
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        ct ctVar = this.sx;
        if (ctVar != null) {
            ctVar.ahm(i, i2, i3, i3);
        }
        if (i > 0 && i2 > 0 && this.ay) {
            this.uf = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
            this.wy = new Canvas(this.uf);
        }
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        ct ctVar = this.sx;
        if (ctVar != null) {
            ctVar.kgy(z);
        }
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    public void setCornerRadius(float f) {
        kgy(f, f, f, f);
    }

    public void setCornerRadiusDimen(int i) {
        float dimension = getResources().getDimension(i);
        kgy(dimension, dimension, dimension, dimension);
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        setImageDrawable(getDrawable());
    }

    public void setBorderWidth(int i) {
        setBorderWidth(getResources().getDimension(i));
    }

    public void setBorderColor(int i) {
        setBorderColor(ColorStateList.valueOf(i));
    }

    private void kgy(boolean z) {
        if (this.kus) {
            if (z) {
                this.noq = ahm.kgy(this.noq);
            }
            kgy(this.noq, ImageView.ScaleType.FIT_XY);
        }
    }

    private Drawable kgy() {
        Resources resources = getResources();
        Drawable drawable = null;
        if (resources == null) {
            return null;
        }
        int i = this.vs;
        if (i != 0) {
            try {
                drawable = resources.getDrawable(i);
            } catch (Exception e) {
                Log.w("RoundedImageView", "Unable to find resource: " + this.vs, e);
                this.vs = 0;
            }
        }
        return ahm.kgy(drawable);
    }

    public void kgy(float f, float f2, float f3, float f4) {
        float[] fArr = this.ct;
        if (fArr[0] == f && fArr[1] == f2 && fArr[2] == f4 && fArr[3] == f3) {
            return;
        }
        fArr[0] = f;
        fArr[1] = f2;
        fArr[3] = f3;
        fArr[2] = f4;
        rz();
        kgy(false);
        invalidate();
    }

    public void kgy(ct ctVar) {
        this.sx = ctVar;
    }
}
