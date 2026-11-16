package com.bytedance.adsdk.ugeno.ahm.ahm;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.Choreographer;
import com.unity3d.services.UnityAdsConstants;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
final class kgy extends Drawable {
    private final ahm.uq[] ahm;
    private Choreographer ct;
    private final ct kgy;
    private boolean noq;
    private final Paint rz;
    private final Path uq = new Path();
    private final Choreographer.FrameCallback yo = new Choreographer.FrameCallback() { // from class: com.bytedance.adsdk.ugeno.ahm.ahm.kgy.1
        @Override // android.view.Choreographer.FrameCallback
        public void doFrame(long j) {
            if (kgy.this.noq) {
                kgy.this.invalidateSelf();
                if (!kgy.this.noq || kgy.this.ct == null) {
                    return;
                }
                kgy.this.ct.postFrameCallback(this);
            }
        }
    };

    public void ahm() {
        this.noq = false;
        Choreographer choreographer = this.ct;
        if (choreographer != null) {
            choreographer.removeFrameCallback(this.yo);
            this.ct = null;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
    }

    private void kgy(Canvas canvas, noq noqVar, int i) {
        ahm.kgy kgyVar;
        int i2;
        int i3 = i;
        int[] iArrKgy = kgy(noqVar, i3);
        float[] fArr = noqVar.rz;
        float[] fArr2 = noqVar.uq;
        float[] fArr3 = noqVar.ct;
        float[] fArr4 = noqVar.noq;
        int[] iArr = noqVar.fi;
        ahm.uq[] uqVarArr = this.ahm;
        int i4 = 0;
        while (i4 < i3) {
            int i5 = iArrKgy[i4];
            int i6 = iArr[i5];
            if (i6 >= 0 && i6 < uqVarArr.length && (kgyVar = uqVarArr[i6].at) != null) {
                float f = fArr3[i5];
                float f2 = kgyVar.rz * f;
                float f3 = kgyVar.uq * f;
                if (f2 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && f3 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && (i2 = (int) ((fArr4[i5] * 255.0f) + 0.5f)) > 0) {
                    if (i2 > 255) {
                        i2 = 255;
                    }
                    this.rz.setColor(kgyVar.ct);
                    this.rz.setAlpha(i2);
                    float f4 = fArr[i5];
                    float f5 = fArr2[i5];
                    int i7 = kgyVar.ahm;
                    if (i7 == 1) {
                        float f6 = f2 / 2.0f;
                        float f7 = f3 / 2.0f;
                        canvas.drawRect(f4 - f6, f5 - f7, f6 + f4, f5 + f7, this.rz);
                    } else if (i7 != 2) {
                        canvas.drawCircle(f4, f5, Math.min(f2, f3) / 2.0f, this.rz);
                    } else {
                        kgy(canvas, f4, f5, Math.min(f2, f3) / 2.0f);
                    }
                }
            }
            i4++;
            i3 = i;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.rz.setColorFilter(colorFilter);
    }

    public kgy(ct ctVar) {
        this.kgy = ctVar;
        this.ahm = ctVar.rz();
        Paint paint = new Paint(1);
        this.rz = paint;
        paint.setStyle(Paint.Style.FILL);
        if (ctVar.ahm().kgy().noq == 1) {
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.ADD));
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        noq noqVarKgy;
        int i;
        Rect bounds = getBounds();
        if (bounds.width() > 0 && bounds.height() > 0 && (i = (noqVarKgy = this.kgy.kgy()).kgy) > 0) {
            int iSave = canvas.save();
            canvas.translate(bounds.left, bounds.top);
            try {
                kgy(canvas, noqVarKgy, i);
            } finally {
                canvas.restoreToCount(iSave);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.kgy.kgy(rect.width(), rect.height());
    }

    public void kgy() {
        if (this.noq) {
            return;
        }
        this.noq = true;
        try {
            Choreographer choreographer = Choreographer.getInstance();
            this.ct = choreographer;
            choreographer.postFrameCallback(this.yo);
        } catch (Throwable unused) {
            this.noq = false;
        }
    }

    private int[] kgy(noq noqVar, int i) {
        int[] iArr = noqVar.gf;
        for (int i2 = 0; i2 < i; i2++) {
            iArr[i2] = i2;
        }
        int i3 = noqVar.ahm;
        if (i3 != 0 && i3 != 1 && i > 1) {
            kgy(iArr, noqVar.yo, i, i3 == 4);
        }
        return iArr;
    }

    private static void kgy(int[] iArr, float[] fArr, int i, boolean z) {
        for (int i2 = 1; i2 < i; i2++) {
            int i3 = iArr[i2];
            float f = fArr[i3];
            int i4 = i2 - 1;
            if (!z) {
                while (i4 >= 0) {
                    int i5 = iArr[i4];
                    if (fArr[i5] >= f) {
                        break;
                    }
                    iArr[i4 + 1] = i5;
                    i4--;
                }
            } else {
                while (i4 >= 0) {
                    int i6 = iArr[i4];
                    if (fArr[i6] <= f) {
                        break;
                    }
                    iArr[i4 + 1] = i6;
                    i4--;
                }
            }
            iArr[i4 + 1] = i3;
        }
    }

    private void kgy(Canvas canvas, float f, float f2, float f3) {
        float f4 = 0.5f * f3;
        Path path = this.uq;
        path.rewind();
        float f5 = -1.5707964f;
        for (int i = 0; i < 10; i++) {
            float f6 = i % 2 == 0 ? f3 : f4;
            double d = f5;
            float fCos = (((float) Math.cos(d)) * f6) + f;
            float fSin = (((float) Math.sin(d)) * f6) + f2;
            if (i == 0) {
                path.moveTo(fCos, fSin);
            } else {
                path.lineTo(fCos, fSin);
            }
            f5 += 0.62831855f;
        }
        path.close();
        canvas.drawPath(path, this.rz);
    }
}
