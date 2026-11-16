package com.bytedance.sdk.openadsdk.core.at.ahm.ahm;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Camera;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.os.Handler;
import android.os.Looper;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.h;
import com.unity3d.services.UnityAdsConstants;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
class kgy extends View {
    private int ahm;
    private Camera at;
    private float[] ay;
    private final Path bmz;
    private C0238kgy[] cc;
    private int ct;
    private float[] dg;
    private float dta;
    private Paint fi;
    private ValueAnimator[] fpp;
    private final RectF fpz;
    private final RectF ft;
    private int ftg;
    private float gbb;
    private com.bytedance.adsdk.ugeno.ra.noq.kgy gf;
    private float gg;
    private float[] gm;
    private final float[] ikw;
    private final AccelerateDecelerateInterpolator ioy;
    private float jc;
    private final RectF jpc;
    private int kgy;
    private String[] kus;
    private float lb;
    private final RectF lqi;
    private int mca;
    private Paint muf;
    private int mw;
    private float noq;
    private String[] nu;
    private final Runnable pxt;
    private Handler ra;
    private int rz;
    private ahm[] sm;
    private ValueAnimator[] sx;
    private float tp;
    private Matrix twf;
    private final Path uf;
    private boolean[] um;
    private int uq;
    private final float[] uxe;
    private final Path vg;
    private long vrj;
    private float[] vs;
    private int wl;
    private final Path wy;
    private boolean[] xh;
    private com.bytedance.sdk.openadsdk.core.at.ahm.ahm.ahm yo;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class ahm implements Animator.AnimatorListener {
        private final kgy ahm;
        private final int kgy;

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.ahm.xh[this.kgy] = false;
            this.ahm.sx[this.kgy].start();
        }

        public ahm(kgy kgyVar, int i) {
            this.ahm = kgyVar;
            this.kgy = i;
        }
    }

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.at.ahm.ahm.kgy$kgy, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class C0238kgy implements Animator.AnimatorListener {
        private final kgy ahm;
        private final int kgy;

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.ahm.um[this.kgy] = false;
            this.ahm.nu[this.kgy] = this.ahm.kus[this.kgy];
        }

        public C0238kgy(kgy kgyVar, int i) {
            this.ahm = kgyVar;
            this.kgy = i;
        }
    }

    private void rz() {
        this.sm = new ahm[3];
        this.cc = new C0238kgy[3];
        for (int i = 0; i < 3; i++) {
            this.sm[i] = new ahm(this, i);
            this.cc[i] = new C0238kgy(this, i);
        }
    }

    public void ahm() {
        for (int i = 0; i < 3; i++) {
            ValueAnimator valueAnimator = this.fpp[i];
            if (valueAnimator != null && valueAnimator.isRunning()) {
                this.fpp[i].cancel();
            }
            ValueAnimator valueAnimator2 = this.sx[i];
            if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                this.sx[i].cancel();
            }
        }
    }

    @Override // android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(h.u, this, me);
        return super.dispatchTouchEvent(me);
    }

    private void ct() {
        if (this.gf == null) {
            com.bytedance.adsdk.ugeno.ra.noq.kgy kgyVar = new com.bytedance.adsdk.ugeno.ra.noq.kgy(getContext());
            this.gf = kgyVar;
            this.muf = kgyVar.getPaint();
        }
    }

    private void kgy(Canvas canvas, float f, float f2, float f3, float f4, String str, int i) {
        this.fpz.set(f, f2, f3 + f, f4 + f2);
        float fCenterY = this.fpz.centerY();
        float fCenterY2 = this.fpz.centerY() - ((this.gf.getPaint().ascent() + this.gf.getPaint().descent()) / 2.0f);
        RectF rectF = this.jpc;
        RectF rectF2 = this.fpz;
        rectF.set(rectF2.left, rectF2.top, rectF2.right, fCenterY);
        this.wy.reset();
        Path path = this.wy;
        RectF rectF3 = this.jpc;
        float[] fArr = this.ikw;
        Path.Direction direction = Path.Direction.CW;
        path.addRoundRect(rectF3, fArr, direction);
        this.fi.setColor(this.ahm);
        canvas.drawPath(this.wy, this.fi);
        this.muf.setTextAlign(Paint.Align.CENTER);
        canvas.drawText(str, this.fpz.centerX(), fCenterY2, this.muf);
        RectF rectF4 = this.ft;
        RectF rectF5 = this.fpz;
        rectF4.set(rectF5.left, fCenterY, rectF5.right, rectF5.bottom);
        this.uf.reset();
        this.uf.addRoundRect(this.ft, this.uxe, direction);
        this.fi.setColor(this.rz);
        canvas.drawPath(this.uf, this.fi);
        canvas.drawText(str, this.fpz.centerX(), fCenterY2, this.gf.getPaint());
        boolean z = this.xh[i];
        if (z || this.um[i]) {
            if (z) {
                canvas.save();
                this.twf.reset();
                this.at.save();
                this.at.rotateX(this.vs[i]);
                this.at.getMatrix(this.twf);
                this.twf.preTranslate(-this.fpz.centerX(), -fCenterY);
                this.twf.postTranslate(this.fpz.centerX(), fCenterY);
                canvas.concat(this.twf);
                this.vg.reset();
                this.vg.addRoundRect(this.jpc, this.ikw, direction);
                this.fi.setColor(this.ahm);
                canvas.drawPath(this.vg, this.fi);
                int alpha = this.muf.getAlpha();
                this.muf.setAlpha((int) (this.gm[i] * 255.0f));
                canvas.drawText(this.nu[i], this.fpz.centerX(), fCenterY2, this.muf);
                this.muf.setAlpha(alpha);
                this.at.restore();
                canvas.restore();
            }
            if (this.um[i]) {
                canvas.save();
                this.twf.reset();
                this.at.save();
                this.at.rotateX(this.dg[i]);
                this.at.getMatrix(this.twf);
                this.twf.preTranslate(-this.fpz.centerX(), -fCenterY);
                this.twf.postTranslate(this.fpz.centerX(), fCenterY);
                canvas.concat(this.twf);
                this.bmz.reset();
                this.bmz.addRoundRect(this.ft, this.uxe, direction);
                this.fi.setColor(this.rz);
                canvas.drawPath(this.bmz, this.fi);
                int alpha2 = this.muf.getAlpha();
                this.muf.setAlpha((int) (this.ay[i] * 255.0f));
                canvas.drawText(this.kus[i], this.fpz.centerX(), fCenterY2, this.muf);
                this.muf.setAlpha(alpha2);
                this.at.restore();
                canvas.restore();
            }
        }
    }

    private void uq() {
        Paint paint = new Paint();
        this.fi = paint;
        paint.setColor(this.ahm);
        this.fi.setAntiAlias(true);
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        com.bytedance.sdk.openadsdk.core.at.ahm.ahm.ahm ahmVar = this.yo;
        if (ahmVar == null) {
            super.onMeasure(i, i2);
            return;
        }
        int[] iArrKgy = ahmVar.kgy(i, i2);
        if (this.ct > 0) {
            int mode = View.MeasureSpec.getMode(iArrKgy[1]);
            int size = View.MeasureSpec.getSize(iArrKgy[1]);
            if (mode == 0 || size > this.ct) {
                iArrKgy[1] = View.MeasureSpec.makeMeasureSpec(this.ct, 1073741824);
            }
        }
        super.onMeasure(iArrKgy[0], iArrKgy[1]);
    }

    public kgy(Context context) {
        super(context);
        this.ra = new Handler(Looper.getMainLooper());
        this.nu = new String[3];
        this.at = new Camera();
        this.twf = new Matrix();
        this.kus = new String[3];
        this.vs = new float[3];
        this.dg = new float[3];
        this.xh = new boolean[3];
        this.um = new boolean[3];
        this.fpp = new ValueAnimator[3];
        this.sx = new ValueAnimator[3];
        this.gm = new float[3];
        this.ay = new float[3];
        this.ioy = new AccelerateDecelerateInterpolator();
        this.lqi = new RectF();
        this.fpz = new RectF();
        this.jpc = new RectF();
        this.ft = new RectF();
        this.wy = new Path();
        this.uf = new Path();
        this.vg = new Path();
        this.bmz = new Path();
        this.ikw = new float[8];
        this.uxe = new float[8];
        this.vrj = 0L;
        this.pxt = new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.at.ahm.ahm.kgy.1
            @Override // java.lang.Runnable
            public void run() {
                kgy.kgy(kgy.this);
                kgy.this.invalidate();
                int i = kgy.this.kgy;
                kgy kgyVar = kgy.this;
                if (i > 0) {
                    kgyVar.ra.postDelayed(this, 1000L);
                } else {
                    kgyVar.ra.removeCallbacks(this);
                    kgy.this.ahm();
                }
            }
        };
        uq();
        ct();
        rz();
    }

    @Override // android.view.View
    @SuppressLint({"DefaultLocale"})
    public void onDraw(Canvas canvas) {
        float f;
        super.onDraw(canvas);
        if (this.uq > 0 && this.ct > 0) {
            this.lqi.set((getWidth() - this.uq) / 2.0f, (getHeight() - this.ct) / 2.0f, (getWidth() + this.uq) / 2.0f, (getHeight() + this.ct) / 2.0f);
            RectF rectF = this.lqi;
            float f2 = this.noq;
            canvas.drawRoundRect(rectF, f2, f2, this.fi);
            int i = this.kgy;
            this.mw = i / 3600;
            int i2 = i % 3600;
            this.mca = i2;
            this.ftg = i2 / 60;
            this.wl = i2 % 60;
            this.gbb = this.uq;
            this.dta = this.ct;
            float width = (getWidth() - getPaddingLeft()) - getPaddingRight();
            this.tp = width;
            float f3 = this.gbb * 3.0f;
            this.lb = f3;
            float f4 = width - f3;
            this.jc = f4;
            if (f4 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                f = f4 / 2.0f;
            } else {
                f = 10.0f;
            }
            this.gg = f;
            kgy(this.mw, this.ftg, this.wl);
            float paddingLeft = getPaddingLeft();
            float fCenterY = this.lqi.centerY();
            float f5 = this.dta;
            kgy(canvas, paddingLeft, fCenterY - (f5 / 2.0f), this.gbb, f5, String.format("%02d", Integer.valueOf(this.mw)), 0);
            float paddingLeft2 = this.gg + getPaddingLeft() + this.gbb;
            float fCenterY2 = this.lqi.centerY();
            float f6 = this.dta;
            kgy(canvas, paddingLeft2, fCenterY2 - (f6 / 2.0f), this.gbb, f6, String.format("%02d", Integer.valueOf(this.ftg)), 1);
            float paddingLeft3 = ((this.gbb + this.gg) * 2.0f) + getPaddingLeft();
            float fCenterY3 = this.lqi.centerY();
            float f7 = this.dta;
            kgy(canvas, paddingLeft3, fCenterY3 - (f7 / 2.0f), this.gbb, f7, String.format("%02d", Integer.valueOf(this.wl)), 2);
            kgy(canvas, (this.gg / 2.0f) + getPaddingLeft() + this.gbb, this.lqi.centerY());
            kgy(canvas, ((this.gg * 3.0f) / 2.0f) + (this.gbb * 2.0f) + getPaddingLeft(), this.lqi.centerY());
            com.bytedance.sdk.openadsdk.core.at.ahm.ahm.ahm ahmVar = this.yo;
            if (ahmVar != null) {
                ahmVar.kgy(canvas);
            }
        }
    }

    public void kgy(int i, int i2, int i3, int i4, int i5, float f) {
        int iMin = Math.min(i, 360060);
        this.ahm = i2;
        this.rz = i3;
        this.uq = i4;
        this.ct = i5;
        this.noq = f;
        this.kgy = iMin;
        this.ra.post(this.pxt);
        Paint paint = this.fi;
        if (paint != null) {
            paint.setColor(this.ahm);
        }
        float[] fArr = this.ikw;
        float f2 = this.noq;
        fArr[3] = f2;
        fArr[2] = f2;
        fArr[1] = f2;
        fArr[0] = f2;
        fArr[7] = 0.0f;
        fArr[6] = 0.0f;
        fArr[5] = 0.0f;
        fArr[4] = 0.0f;
        float[] fArr2 = this.uxe;
        fArr2[3] = 0.0f;
        fArr2[2] = 0.0f;
        fArr2[1] = 0.0f;
        fArr2[0] = 0.0f;
        fArr2[7] = f2;
        fArr2[6] = f2;
        fArr2[5] = f2;
        fArr2[4] = f2;
        invalidate();
    }

    public void kgy(com.bytedance.sdk.openadsdk.core.at.ahm.ahm.ahm ahmVar) {
        this.yo = ahmVar;
    }

    public static /* synthetic */ int kgy(kgy kgyVar) {
        int i = kgyVar.kgy;
        kgyVar.kgy = i - 1;
        return i;
    }

    private void kgy(Canvas canvas, float f, float f2) {
        canvas.drawText(":", f, f2 - ((this.muf.ascent() + this.muf.descent()) / 2.0f), this.muf);
    }

    @SuppressLint({"DefaultLocale"})
    private void kgy(int i, int i2, int i3) {
        String str = this.nu[0];
        String str2 = String.format("%02d", Integer.valueOf(i));
        if (!str2.equals(str) && !this.xh[0] && !this.um[0] && str != null) {
            kgy(0, str, str2);
        }
        String str3 = this.nu[1];
        String str4 = String.format("%02d", Integer.valueOf(i2));
        if (!str4.equals(str3) && !this.xh[1] && !this.um[1] && str3 != null) {
            kgy(1, str3, str4);
        }
        String str5 = this.nu[2];
        String str6 = String.format("%02d", Integer.valueOf(i3));
        if (!str6.equals(str5) && !this.xh[2] && !this.um[2] && str5 != null) {
            kgy(2, str5, str6);
        }
        String[] strArr = this.nu;
        if (strArr[0] == null) {
            strArr[0] = str2;
        }
        if (strArr[1] == null) {
            strArr[1] = str4;
        }
        if (strArr[2] == null) {
            strArr[2] = str6;
        }
    }

    private void kgy(final int i, String str, String str2) {
        this.nu[i] = str;
        this.kus[i] = str2;
        this.xh[i] = true;
        this.um[i] = true;
        this.vs[i] = 0.0f;
        this.dg[i] = 90.0f;
        this.gm[i] = 1.0f;
        this.ay[i] = 0.0f;
        ValueAnimator[] valueAnimatorArr = this.fpp;
        ValueAnimator valueAnimator = valueAnimatorArr[i];
        if (valueAnimator == null) {
            valueAnimatorArr[i] = ValueAnimator.ofFloat(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, -90.0f);
            this.fpp[i].setDuration(250L);
            this.fpp[i].setInterpolator(this.ioy);
            this.fpp[i].addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.sdk.openadsdk.core.at.ahm.ahm.kgy.2
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    float fFloatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                    kgy.this.vs[i] = fFloatValue;
                    kgy.this.gm[i] = 1.0f - (fFloatValue / (-90.0f));
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    if (jCurrentTimeMillis - kgy.this.vrj >= 16) {
                        kgy.this.invalidate();
                        kgy.this.vrj = jCurrentTimeMillis;
                    }
                }
            });
            this.fpp[i].addListener(this.sm[i]);
        } else {
            valueAnimator.setFloatValues(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, -90.0f);
        }
        ValueAnimator[] valueAnimatorArr2 = this.sx;
        ValueAnimator valueAnimator2 = valueAnimatorArr2[i];
        if (valueAnimator2 == null) {
            valueAnimatorArr2[i] = ValueAnimator.ofFloat(-90.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            this.sx[i].setDuration(250L);
            this.sx[i].setInterpolator(this.ioy);
            this.sx[i].addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.sdk.openadsdk.core.at.ahm.ahm.kgy.3
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public void onAnimationUpdate(ValueAnimator valueAnimator3) {
                    float fFloatValue = ((Float) valueAnimator3.getAnimatedValue()).floatValue();
                    kgy.this.dg[i] = fFloatValue;
                    kgy.this.ay[i] = (fFloatValue + 90.0f) / 90.0f;
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    if (jCurrentTimeMillis - kgy.this.vrj >= 16) {
                        kgy.this.invalidate();
                        kgy.this.vrj = jCurrentTimeMillis;
                    }
                }
            });
            this.sx[i].addListener(this.cc[i]);
        } else {
            valueAnimator2.setFloatValues(-90.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        }
        if (this.fpp[i].isRunning()) {
            this.fpp[i].cancel();
        }
        if (this.sx[i].isRunning()) {
            this.sx[i].cancel();
        }
        this.fpp[i].start();
    }

    public com.bytedance.adsdk.ugeno.ra.noq.kgy kgy() {
        return this.gf;
    }

    public void kgy(com.bytedance.adsdk.ugeno.ra.noq.kgy kgyVar) {
        this.gf = kgyVar;
    }
}
