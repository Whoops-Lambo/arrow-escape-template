package com.bytedance.adsdk.ahm;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import com.bytedance.adsdk.ahm.ct.ay;
import com.singular.sdk.internal.UserDetailsUtils;
import com.unity3d.services.UnityAdsConstants;
import defpackage.d;
import defpackage.pv1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
public class gf extends Drawable implements Animatable, Drawable.Callback {
    rz ahm;
    private com.bytedance.adsdk.ahm.ahm.ahm at;
    private boolean ay;
    private RectF bmz;
    private final com.bytedance.adsdk.ahm.noq.rz ct;
    private Map<String, Typeface> dg;
    private boolean fi;
    private boolean fpp;
    private fpp fpz;
    private final Matrix ft;
    private Matrix ftg;
    private boolean gbb;
    private ahm gf;
    private int gm;
    private Paint ikw;
    private boolean ioy;
    private boolean jpc;
    String kgy;
    private uq kus;
    private boolean lqi;
    private Matrix mca;
    private Rect muf;
    private RectF mw;
    private boolean noq;
    private final ValueAnimator.AnimatorUpdateListener nu;
    private final ArrayList<kgy> ra;
    sx rz;
    private com.bytedance.adsdk.ahm.rz.rz.ahm sx;
    private String twf;
    private Canvas uf;
    private boolean um;
    private yo uq;
    private Rect uxe;
    private Rect vg;
    private RectF vrj;
    private com.bytedance.adsdk.ahm.ahm.kgy vs;
    private View wl;
    private Bitmap wy;
    private boolean xh;
    private boolean yo;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public enum ahm {
        NONE,
        PLAY,
        RESUME
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public interface kgy {
        void kgy(yo yoVar);
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }

    private void ahm(int i, int i2) {
        Bitmap bitmap = this.wy;
        if (bitmap == null || bitmap.getWidth() < i || this.wy.getHeight() < i2) {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
            this.wy = bitmapCreateBitmap;
            this.uf.setBitmap(bitmapCreateBitmap);
            this.gbb = true;
            return;
        }
        if (this.wy.getWidth() > i || this.wy.getHeight() > i2) {
            Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(this.wy, 0, 0, i, i2);
            this.wy = bitmapCreateBitmap2;
            this.uf.setBitmap(bitmapCreateBitmap2);
            this.gbb = true;
        }
    }

    private void bmz() {
        yo yoVar = this.uq;
        if (yoVar == null) {
            return;
        }
        this.jpc = this.fpz.kgy(Build.VERSION.SDK_INT, yoVar.kgy(), yoVar.ahm());
    }

    private boolean ikw() {
        return this.noq || this.yo;
    }

    private void kgy(Canvas canvas, com.bytedance.adsdk.ahm.rz.rz.ahm ahmVar) {
        if (this.uq == null || ahmVar == null) {
            return;
        }
        mw();
        canvas.getMatrix(this.mca);
        canvas.getClipBounds(this.vg);
        kgy(this.vg, this.bmz);
        this.mca.mapRect(this.bmz);
        kgy(this.bmz, this.vg);
        boolean z = this.fpp;
        RectF rectF = this.mw;
        if (z) {
            rectF.set(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, getIntrinsicWidth(), getIntrinsicHeight());
        } else {
            ahmVar.kgy(rectF, (Matrix) null, false);
        }
        this.mca.mapRect(this.mw);
        Rect bounds = getBounds();
        float fWidth = bounds.width() / getIntrinsicWidth();
        float fHeight = bounds.height() / getIntrinsicHeight();
        kgy(this.mw, fWidth, fHeight);
        if (!mca()) {
            RectF rectF2 = this.mw;
            Rect rect = this.vg;
            rectF2.intersect(rect.left, rect.top, rect.right, rect.bottom);
        }
        int iCeil = (int) Math.ceil(this.mw.width());
        int iCeil2 = (int) Math.ceil(this.mw.height());
        if (iCeil == 0 || iCeil2 == 0) {
            return;
        }
        ahm(iCeil, iCeil2);
        if (this.gbb) {
            this.ft.set(this.mca);
            this.ft.preScale(fWidth, fHeight);
            Matrix matrix = this.ft;
            RectF rectF3 = this.mw;
            matrix.postTranslate(-rectF3.left, -rectF3.top);
            this.wy.eraseColor(0);
            ahmVar.kgy(this.uf, this.ft, this.gm);
            this.mca.invert(this.ftg);
            this.ftg.mapRect(this.vrj, this.mw);
            kgy(this.vrj, this.muf);
        }
        this.uxe.set(0, 0, iCeil, iCeil2);
        canvas.drawBitmap(this.wy, this.uxe, this.muf, this.ikw);
    }

    private void mw() {
        if (this.uf != null) {
            return;
        }
        this.uf = new Canvas();
        this.mw = new RectF();
        this.mca = new Matrix();
        this.ftg = new Matrix();
        this.vg = new Rect();
        this.bmz = new RectF();
        this.ikw = new com.bytedance.adsdk.ahm.kgy.kgy();
        this.uxe = new Rect();
        this.muf = new Rect();
        this.vrj = new RectF();
    }

    private com.bytedance.adsdk.ahm.ahm.ahm uxe() {
        com.bytedance.adsdk.ahm.ahm.ahm ahmVar = this.at;
        if (ahmVar != null && !ahmVar.kgy(vrj())) {
            this.at = null;
        }
        if (this.at == null) {
            this.at = new com.bytedance.adsdk.ahm.ahm.ahm(getCallback(), this.twf, this.kus, this.uq.dg());
        }
        return this.at;
    }

    public void at() {
        this.ra.clear();
        this.ct.at();
        if (isVisible()) {
            return;
        }
        this.gf = ahm.NONE;
    }

    public boolean ay() {
        com.bytedance.adsdk.ahm.noq.rz rzVar = this.ct;
        if (rzVar == null) {
            return false;
        }
        return rzVar.isRunning();
    }

    public float dg() {
        return this.ct.ra();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        ct.kgy("Drawable#draw");
        try {
            if (this.jpc) {
                kgy(canvas, this.sx);
            } else {
                kgy(canvas);
            }
        } catch (Throwable unused) {
        }
        this.gbb = false;
        ct.ahm("Drawable#draw");
    }

    public um fi() {
        yo yoVar = this.uq;
        if (yoVar != null) {
            return yoVar.rz();
        }
        return null;
    }

    public int fpp() {
        return (int) this.ct.yo();
    }

    public boolean fpz() {
        return this.dg == null && this.rz == null && this.uq.kus().size() > 0;
    }

    public void ft() {
        this.ra.clear();
        this.ct.cancel();
        if (isVisible()) {
            return;
        }
        this.gf = ahm.NONE;
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.gm;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        yo yoVar = this.uq;
        if (yoVar == null) {
            return -1;
        }
        return yoVar.uq().height();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        yo yoVar = this.uq;
        if (yoVar == null) {
            return -1;
        }
        return yoVar.uq().width();
    }

    public boolean gf() {
        return this.lqi;
    }

    public int gm() {
        return this.ct.getRepeatCount();
    }

    @Override // android.graphics.drawable.Drawable
    public void invalidateSelf() {
        if (this.gbb) {
            return;
        }
        this.gbb = true;
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    public yo jpc() {
        return this.uq;
    }

    public float kus() {
        return this.ct.vs();
    }

    public sx lqi() {
        return this.rz;
    }

    public ra noq(String str) {
        yo yoVar = this.uq;
        if (yoVar == null) {
            return null;
        }
        return yoVar.dg().get(str);
    }

    public void nu() {
        if (this.sx == null) {
            this.ra.add(new kgy() { // from class: com.bytedance.adsdk.ahm.gf.6
                @Override // com.bytedance.adsdk.ahm.gf.kgy
                public void kgy(yo yoVar) {
                    gf.this.nu();
                }
            });
            return;
        }
        bmz();
        if (ikw() || gm() == 0) {
            if (isVisible()) {
                this.ct.nu();
                this.gf = ahm.NONE;
            } else {
                this.gf = ahm.PLAY;
            }
        }
        if (ikw()) {
            return;
        }
        rz((int) (dg() < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? kus() : vs()));
        this.ct.at();
        if (isVisible()) {
            return;
        }
        this.gf = ahm.NONE;
    }

    public void ra() {
        if (this.ct.isRunning()) {
            this.ct.cancel();
            if (!isVisible()) {
                this.gf = ahm.NONE;
            }
        }
        this.uq = null;
        this.sx = null;
        this.at = null;
        this.ct.fi();
        invalidateSelf();
    }

    public void rz(final String str) {
        yo yoVar = this.uq;
        if (yoVar == null) {
            this.ra.add(new kgy() { // from class: com.bytedance.adsdk.ahm.gf.13
                @Override // com.bytedance.adsdk.ahm.gf.kgy
                public void kgy(yo yoVar2) {
                    gf.this.rz(str);
                }
            });
            return;
        }
        com.bytedance.adsdk.ahm.rz.noq noqVarRz = yoVar.rz(str);
        if (noqVarRz != null) {
            ahm((int) (noqVarRz.kgy + noqVarRz.ahm));
        } else {
            d.r(pv1.n("Cannot find marker with name ", str, UserDetailsUtils.UserDetailsLiterals.DOT));
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.gm = i;
        invalidateSelf();
    }

    @SuppressLint({"WrongConstant"})
    public int sx() {
        return this.ct.getRepeatMode();
    }

    public void twf() {
        if (this.sx == null) {
            this.ra.add(new kgy() { // from class: com.bytedance.adsdk.ahm.gf.7
                @Override // com.bytedance.adsdk.ahm.gf.kgy
                public void kgy(yo yoVar) {
                    gf.this.twf();
                }
            });
            return;
        }
        bmz();
        if (ikw() || gm() == 0) {
            if (isVisible()) {
                this.ct.kus();
                this.gf = ahm.NONE;
            } else {
                this.gf = ahm.RESUME;
            }
        }
        if (ikw()) {
            return;
        }
        rz((int) (dg() < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? kus() : vs()));
        this.ct.at();
        if (isVisible()) {
            return;
        }
        this.gf = ahm.NONE;
    }

    public float uf() {
        return this.ct.noq();
    }

    public void um() {
        this.ct.removeAllListeners();
    }

    public void uq(final String str) {
        yo yoVar = this.uq;
        if (yoVar == null) {
            this.ra.add(new kgy() { // from class: com.bytedance.adsdk.ahm.gf.2
                @Override // com.bytedance.adsdk.ahm.gf.kgy
                public void kgy(yo yoVar2) {
                    gf.this.uq(str);
                }
            });
            return;
        }
        com.bytedance.adsdk.ahm.rz.noq noqVarRz = yoVar.rz(str);
        if (noqVarRz == null) {
            d.r(pv1.n("Cannot find marker with name ", str, UserDetailsUtils.UserDetailsLiterals.DOT));
        } else {
            int i = (int) noqVarRz.kgy;
            kgy(i, ((int) noqVarRz.ahm) + i);
        }
    }

    public RectF vg() {
        return this.mw;
    }

    public float vs() {
        return this.ct.dg();
    }

    public void wy() {
        this.ra.clear();
        this.ct.twf();
        if (isVisible()) {
            return;
        }
        this.gf = ahm.NONE;
    }

    public void xh() {
        this.ct.removeAllUpdateListeners();
        this.ct.addUpdateListener(this.nu);
    }

    public void yo(String str) {
        this.kgy = str;
        com.bytedance.adsdk.ahm.ahm.kgy kgyVarMuf = muf();
        if (kgyVarMuf != null) {
            kgyVarMuf.kgy(str);
        }
    }

    public gf() {
        com.bytedance.adsdk.ahm.noq.rz rzVar = new com.bytedance.adsdk.ahm.noq.rz();
        this.ct = rzVar;
        this.noq = true;
        this.yo = false;
        this.fi = false;
        this.gf = ahm.NONE;
        this.ra = new ArrayList<>();
        ValueAnimator.AnimatorUpdateListener animatorUpdateListener = new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.adsdk.ahm.gf.1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                if (gf.this.sx != null) {
                    gf.this.sx.kgy(gf.this.ct.noq());
                }
            }
        };
        this.nu = animatorUpdateListener;
        this.um = false;
        this.fpp = true;
        this.gm = 255;
        this.fpz = fpp.AUTOMATIC;
        this.jpc = false;
        this.ft = new Matrix();
        this.gbb = false;
        rzVar.addUpdateListener(animatorUpdateListener);
    }

    private boolean mca() {
        Drawable.Callback callback = getCallback();
        if (!(callback instanceof View)) {
            return false;
        }
        ViewParent parent = ((View) callback).getParent();
        if (!(parent instanceof ViewGroup) || ((ViewGroup) parent).getClipChildren()) {
            return false;
        }
        return true;
    }

    private com.bytedance.adsdk.ahm.ahm.kgy muf() {
        if (getCallback() == null) {
            return null;
        }
        if (this.vs == null) {
            com.bytedance.adsdk.ahm.ahm.kgy kgyVar = new com.bytedance.adsdk.ahm.ahm.kgy(getCallback(), this.ahm);
            this.vs = kgyVar;
            String str = this.kgy;
            if (str != null) {
                kgyVar.kgy(str);
            }
        }
        return this.vs;
    }

    private Context vrj() {
        Drawable.Callback callback = getCallback();
        if (callback == null || !(callback instanceof View)) {
            return null;
        }
        return ((View) callback).getContext();
    }

    public Bitmap ct(String str) {
        com.bytedance.adsdk.ahm.ahm.ahm ahmVarUxe = uxe();
        if (ahmVarUxe != null) {
            return ahmVarUxe.kgy(str);
        }
        return null;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.invalidateDrawable(this);
    }

    public boolean ioy() {
        if (isVisible()) {
            return this.ct.isRunning();
        }
        ahm ahmVar = this.gf;
        if (ahmVar != ahm.PLAY && ahmVar != ahm.RESUME) {
            return false;
        }
        return true;
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return ay();
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.scheduleDrawable(this, runnable, j);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        boolean zIsVisible = isVisible();
        boolean visible = super.setVisible(z, z2);
        if (z) {
            ahm ahmVar = this.gf;
            if (ahmVar == ahm.PLAY) {
                nu();
                return visible;
            }
            if (ahmVar == ahm.RESUME) {
                twf();
                return visible;
            }
        } else {
            if (this.ct.isRunning()) {
                wy();
                this.gf = ahm.RESUME;
                return visible;
            }
            if (zIsVisible) {
                this.gf = ahm.NONE;
            }
        }
        return visible;
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        Drawable.Callback callback = getCallback();
        if ((callback instanceof View) && ((View) callback).isInEditMode()) {
            return;
        }
        nu();
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        at();
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.unscheduleDrawable(this, runnable);
    }

    public void fi(boolean z) {
        this.ct.rz(z);
    }

    public void yo(boolean z) {
        this.yo = z;
    }

    public void ct(boolean z) {
        this.lqi = z;
    }

    public boolean yo() {
        return this.jpc;
    }

    public void ct(int i) {
        this.ct.setRepeatCount(i);
    }

    public boolean ct() {
        return this.um;
    }

    public void noq(boolean z) {
        this.fi = z;
    }

    public fpp noq() {
        return this.jpc ? fpp.SOFTWARE : fpp.HARDWARE;
    }

    public void rz(boolean z) {
        this.ay = z;
        yo yoVar = this.uq;
        if (yoVar != null) {
            yoVar.ahm(z);
        }
    }

    public void uq(boolean z) {
        if (this.ioy == z) {
            return;
        }
        this.ioy = z;
        com.bytedance.adsdk.ahm.rz.rz.ahm ahmVar = this.sx;
        if (ahmVar != null) {
            ahmVar.kgy(z);
        }
    }

    public boolean rz() {
        return this.fpp;
    }

    public void rz(float f) {
        this.ct.rz(f);
    }

    public void rz(final int i) {
        if (this.uq == null) {
            this.ra.add(new kgy() { // from class: com.bytedance.adsdk.ahm.gf.4
                @Override // com.bytedance.adsdk.ahm.gf.kgy
                public void kgy(yo yoVar) {
                    gf.this.rz(i);
                }
            });
        } else {
            this.ct.kgy(i);
        }
    }

    public String uq() {
        return this.twf;
    }

    public void uq(final float f) {
        if (this.uq == null) {
            this.ra.add(new kgy() { // from class: com.bytedance.adsdk.ahm.gf.5
                @Override // com.bytedance.adsdk.ahm.gf.kgy
                public void kgy(yo yoVar) {
                    gf.this.uq(f);
                }
            });
            return;
        }
        ct.kgy("Drawable#setProgress");
        this.ct.kgy(this.uq.kgy(f));
        ct.ahm("Drawable#setProgress");
    }

    public void uq(int i) {
        this.ct.setRepeatMode(i);
    }

    public com.bytedance.adsdk.ahm.rz.rz.ahm ahm() {
        return this.sx;
    }

    public void ahm(boolean z) {
        this.um = z;
    }

    public void ahm(final int i) {
        if (this.uq == null) {
            this.ra.add(new kgy() { // from class: com.bytedance.adsdk.ahm.gf.10
                @Override // com.bytedance.adsdk.ahm.gf.kgy
                public void kgy(yo yoVar) {
                    gf.this.ahm(i);
                }
            });
        } else {
            this.ct.ahm(i + 0.99f);
        }
    }

    public void ahm(final float f) {
        yo yoVar = this.uq;
        if (yoVar == null) {
            this.ra.add(new kgy() { // from class: com.bytedance.adsdk.ahm.gf.11
                @Override // com.bytedance.adsdk.ahm.gf.kgy
                public void kgy(yo yoVar2) {
                    gf.this.ahm(f);
                }
            });
        } else {
            this.ct.ahm(com.bytedance.adsdk.ahm.noq.ct.kgy(yoVar.noq(), this.uq.yo(), f));
        }
    }

    public void ahm(final String str) {
        yo yoVar = this.uq;
        if (yoVar == null) {
            this.ra.add(new kgy() { // from class: com.bytedance.adsdk.ahm.gf.12
                @Override // com.bytedance.adsdk.ahm.gf.kgy
                public void kgy(yo yoVar2) {
                    gf.this.ahm(str);
                }
            });
            return;
        }
        com.bytedance.adsdk.ahm.rz.noq noqVarRz = yoVar.rz(str);
        if (noqVarRz != null) {
            kgy((int) noqVarRz.kgy);
        } else {
            d.r(pv1.n("Cannot find marker with name ", str, UserDetailsUtils.UserDetailsLiterals.DOT));
        }
    }

    public void ahm(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.ct.removeUpdateListener(animatorUpdateListener);
    }

    public void ahm(Animator.AnimatorListener animatorListener) {
        this.ct.removeListener(animatorListener);
    }

    public void kgy(View view) {
        this.wl = view;
    }

    public View kgy() {
        return this.wl;
    }

    public void kgy(boolean z, Context context) {
        if (this.xh == z) {
            return;
        }
        this.xh = z;
        if (this.uq != null) {
            kgy(context);
        }
    }

    public void kgy(boolean z) {
        if (z != this.fpp) {
            this.fpp = z;
            com.bytedance.adsdk.ahm.rz.rz.ahm ahmVar = this.sx;
            if (ahmVar != null) {
                ahmVar.ahm(z);
            }
            invalidateSelf();
        }
    }

    public void kgy(String str) {
        this.twf = str;
    }

    public boolean kgy(yo yoVar, Context context) {
        if (this.uq == yoVar) {
            return false;
        }
        this.gbb = true;
        ra();
        this.uq = yoVar;
        kgy(context);
        this.ct.kgy(yoVar);
        uq(this.ct.getAnimatedFraction());
        Iterator it = new ArrayList(this.ra).iterator();
        while (it.hasNext()) {
            kgy kgyVar = (kgy) it.next();
            if (kgyVar != null) {
                kgyVar.kgy(yoVar);
            }
            it.remove();
        }
        this.ra.clear();
        yoVar.ahm(this.ay);
        bmz();
        Drawable.Callback callback = getCallback();
        if (callback instanceof ImageView) {
            ImageView imageView = (ImageView) callback;
            imageView.setImageDrawable(null);
            imageView.setImageDrawable(this);
        }
        return true;
    }

    public void kgy(fpp fppVar) {
        this.fpz = fppVar;
        bmz();
    }

    private void kgy(Context context) {
        yo yoVar = this.uq;
        if (yoVar == null) {
            return;
        }
        com.bytedance.adsdk.ahm.rz.rz.ahm ahmVar = new com.bytedance.adsdk.ahm.rz.rz.ahm(this, ay.kgy(yoVar), yoVar.twf(), yoVar, context);
        this.sx = ahmVar;
        if (this.ioy) {
            ahmVar.kgy(true);
        }
        this.sx.ahm(this.fpp);
    }

    public void kgy(final int i) {
        if (this.uq == null) {
            this.ra.add(new kgy() { // from class: com.bytedance.adsdk.ahm.gf.8
                @Override // com.bytedance.adsdk.ahm.gf.kgy
                public void kgy(yo yoVar) {
                    gf.this.kgy(i);
                }
            });
        } else {
            this.ct.kgy(i);
        }
    }

    public void kgy(final float f) {
        yo yoVar = this.uq;
        if (yoVar == null) {
            this.ra.add(new kgy() { // from class: com.bytedance.adsdk.ahm.gf.9
                @Override // com.bytedance.adsdk.ahm.gf.kgy
                public void kgy(yo yoVar2) {
                    gf.this.kgy(f);
                }
            });
        } else {
            kgy((int) com.bytedance.adsdk.ahm.noq.ct.kgy(yoVar.noq(), this.uq.yo(), f));
        }
    }

    public void kgy(final int i, final int i2) {
        if (this.uq == null) {
            this.ra.add(new kgy() { // from class: com.bytedance.adsdk.ahm.gf.3
                @Override // com.bytedance.adsdk.ahm.gf.kgy
                public void kgy(yo yoVar) {
                    gf.this.kgy(i, i2);
                }
            });
        } else {
            this.ct.kgy(i, i2 + 0.99f);
        }
    }

    public void kgy(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.ct.addUpdateListener(animatorUpdateListener);
    }

    public void kgy(Animator.AnimatorListener animatorListener) {
        this.ct.addListener(animatorListener);
    }

    public void kgy(Boolean bool) {
        this.noq = bool.booleanValue();
    }

    public void kgy(uq uqVar) {
        this.kus = uqVar;
        com.bytedance.adsdk.ahm.ahm.ahm ahmVar = this.at;
        if (ahmVar != null) {
            ahmVar.kgy(uqVar);
        }
    }

    public void kgy(rz rzVar) {
        this.ahm = rzVar;
        com.bytedance.adsdk.ahm.ahm.kgy kgyVar = this.vs;
        if (kgyVar != null) {
            kgyVar.kgy(rzVar);
        }
    }

    public void kgy(Map<String, Typeface> map) {
        if (map == this.dg) {
            return;
        }
        this.dg = map;
        invalidateSelf();
    }

    public void kgy(sx sxVar) {
        this.rz = sxVar;
    }

    public Bitmap kgy(String str, Bitmap bitmap) {
        com.bytedance.adsdk.ahm.ahm.ahm ahmVarUxe = uxe();
        if (ahmVarUxe == null) {
            return null;
        }
        Bitmap bitmapKgy = ahmVarUxe.kgy(str, bitmap);
        invalidateSelf();
        return bitmapKgy;
    }

    public Typeface kgy(com.bytedance.adsdk.ahm.rz.rz rzVar) {
        Map<String, Typeface> map = this.dg;
        if (map != null) {
            String strKgy = rzVar.kgy();
            if (map.containsKey(strKgy)) {
                return map.get(strKgy);
            }
            String strAhm = rzVar.ahm();
            if (map.containsKey(strAhm)) {
                return map.get(strAhm);
            }
            String str = rzVar.kgy() + "-" + rzVar.rz();
            if (map.containsKey(str)) {
                return map.get(str);
            }
        }
        com.bytedance.adsdk.ahm.ahm.kgy kgyVarMuf = muf();
        if (kgyVarMuf != null) {
            return kgyVarMuf.kgy(rzVar);
        }
        return null;
    }

    private void kgy(Canvas canvas) {
        com.bytedance.adsdk.ahm.rz.rz.ahm ahmVar = this.sx;
        yo yoVar = this.uq;
        if (ahmVar == null || yoVar == null) {
            return;
        }
        this.ft.reset();
        Rect bounds = getBounds();
        if (!bounds.isEmpty()) {
            this.ft.preScale(bounds.width() / yoVar.uq().width(), bounds.height() / yoVar.uq().height());
            this.ft.preTranslate(bounds.left, bounds.top);
        }
        ahmVar.kgy(canvas, this.ft, this.gm);
    }

    private void kgy(RectF rectF, Rect rect) {
        rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
    }

    private void kgy(Rect rect, RectF rectF) {
        rectF.set(rect.left, rect.top, rect.right, rect.bottom);
    }

    private void kgy(RectF rectF, float f, float f2) {
        rectF.set(rectF.left * f, rectF.top * f2, rectF.right * f, rectF.bottom * f2);
    }
}
