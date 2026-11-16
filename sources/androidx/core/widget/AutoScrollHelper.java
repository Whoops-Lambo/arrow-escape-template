package androidx.core.widget;

import android.content.res.Resources;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import androidx.core.view.ViewCompat;
import com.unity3d.services.UnityAdsConstants;
import io.p071bidmachine.media3.extractor.ts.y;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AutoScrollHelper implements View.OnTouchListener {
    public static final int q = ViewConfiguration.getTapTimeout();
    public final ClampedScroller a;
    public final AccelerateInterpolator b;
    public final View c;
    public Runnable d;
    public final float[] e;
    public final float[] f;
    public final int g;
    public final int h;
    public final float[] i;
    public final float[] j;
    public final float[] k;
    public boolean l;
    public boolean m;
    public boolean n;
    public boolean o;
    public boolean p;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class ClampedScroller {
        public int a;
        public int b;
        public float c;
        public float d;
        public long e;
        public long f;
        public long g;
        public float h;
        public int i;

        public final float a(long j) {
            long j2 = this.e;
            if (j < j2) {
                return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            }
            long j3 = this.g;
            if (j3 < 0 || j < j3) {
                return AutoScrollHelper.c((j - j2) / this.a, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f) * 0.5f;
            }
            float f = this.h;
            return (AutoScrollHelper.c((j - j3) / this.i, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f) * f) + (1.0f - f);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class ScrollAnimationRunnable implements Runnable {
        @Override // java.lang.Runnable
        public final void run() {
            AutoScrollHelper autoScrollHelper = AutoScrollHelper.this;
            View view = autoScrollHelper.c;
            ClampedScroller clampedScroller = autoScrollHelper.a;
            if (autoScrollHelper.o) {
                if (autoScrollHelper.m) {
                    autoScrollHelper.m = false;
                    long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                    clampedScroller.e = jCurrentAnimationTimeMillis;
                    clampedScroller.g = -1L;
                    clampedScroller.f = jCurrentAnimationTimeMillis;
                    clampedScroller.h = 0.5f;
                }
                if ((clampedScroller.g > 0 && AnimationUtils.currentAnimationTimeMillis() > clampedScroller.g + ((long) clampedScroller.i)) || !autoScrollHelper.g()) {
                    autoScrollHelper.o = false;
                    return;
                }
                if (autoScrollHelper.n) {
                    autoScrollHelper.n = false;
                    long jUptimeMillis = SystemClock.uptimeMillis();
                    MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0);
                    view.onTouchEvent(motionEventObtain);
                    motionEventObtain.recycle();
                }
                if (clampedScroller.f == 0) {
                    y.j("Cannot compute scroll delta before calling start()");
                    return;
                }
                long jCurrentAnimationTimeMillis2 = AnimationUtils.currentAnimationTimeMillis();
                float fA = clampedScroller.a(jCurrentAnimationTimeMillis2);
                long j = jCurrentAnimationTimeMillis2 - clampedScroller.f;
                clampedScroller.f = jCurrentAnimationTimeMillis2;
                autoScrollHelper.f((int) (j * ((fA * 4.0f) + ((-4.0f) * fA * fA)) * clampedScroller.d));
                WeakHashMap weakHashMap = ViewCompat.a;
                view.postOnAnimation(this);
            }
        }

        public ScrollAnimationRunnable() {
        }
    }

    public abstract boolean a(int i);

    public final float d(float f, float f2) {
        if (f2 != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            int i = this.g;
            if (i == 0 || i == 1) {
                if (f < f2) {
                    if (f >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                        return 1.0f - (f / f2);
                    }
                    if (this.o && i == 1) {
                        return 1.0f;
                    }
                }
            } else if (i == 2 && f < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                return f / (-f2);
            }
        }
        return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    public abstract void f(int i);

    public static float c(float f, float f2, float f3) {
        if (f > f3) {
            return f3;
        }
        return f < f2 ? f2 : f;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x003b A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:13:0x003c  */
    /* JADX WARN: Code duplicated, block: B:15:0x004b  */
    /* JADX WARN: Code duplicated, block: B:17:0x0051  */
    public final float b(float f, float f2, float f3, int i) {
        float fC;
        float interpolation;
        float fC2 = c(this.e[i] * f2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, this.f[i]);
        float fD = d(f2 - f, fC2) - d(f, fC2);
        AccelerateInterpolator accelerateInterpolator = this.b;
        if (fD >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            if (fD > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                interpolation = accelerateInterpolator.getInterpolation(fD);
            } else {
                fC = 0.0f;
            }
            if (fC == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            }
            float f4 = this.i[i];
            float f5 = this.j[i];
            float f6 = this.k[i];
            float f7 = f4 * f3;
            return fC > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? c(fC * f7, f5, f6) : -c((-fC) * f7, f5, f6);
        }
        interpolation = -accelerateInterpolator.getInterpolation(-fD);
        fC = c(interpolation, -1.0f, 1.0f);
        if (fC == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }
        float f8 = this.i[i];
        float f9 = this.j[i];
        float f10 = this.k[i];
        float f11 = f8 * f3;
        if (fC > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
        }
    }

    public final void e() {
        int i = 0;
        if (this.m) {
            this.o = false;
            return;
        }
        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        ClampedScroller clampedScroller = this.a;
        int i2 = (int) (jCurrentAnimationTimeMillis - clampedScroller.e);
        int i3 = clampedScroller.b;
        if (i2 > i3) {
            i = i3;
        } else if (i2 >= 0) {
            i = i2;
        }
        clampedScroller.i = i;
        clampedScroller.h = clampedScroller.a(jCurrentAnimationTimeMillis);
        clampedScroller.g = jCurrentAnimationTimeMillis;
    }

    public final boolean g() {
        ClampedScroller clampedScroller = this.a;
        float f = clampedScroller.d;
        int iAbs = (int) (f / Math.abs(f));
        Math.abs(clampedScroller.c);
        return iAbs != 0 && a(iAbs);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0014, code lost:
    
        if (r0 != 3) goto L30;
     */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onTouch(android.view.View r8, android.view.MotionEvent r9) {
        /*
            r7 = this;
            boolean r0 = r7.p
            r1 = 0
            if (r0 != 0) goto L7
            goto L7e
        L7:
            int r0 = r9.getActionMasked()
            r2 = 1
            if (r0 == 0) goto L1b
            if (r0 == r2) goto L17
            r3 = 2
            if (r0 == r3) goto L1f
            r8 = 3
            if (r0 == r8) goto L17
            goto L7e
        L17:
            r7.e()
            return r1
        L1b:
            r7.n = r2
            r7.l = r1
        L1f:
            float r0 = r9.getX()
            int r3 = r8.getWidth()
            float r3 = (float) r3
            android.view.View r4 = r7.c
            int r5 = r4.getWidth()
            float r5 = (float) r5
            float r0 = r7.b(r0, r3, r5, r1)
            float r9 = r9.getY()
            int r8 = r8.getHeight()
            float r8 = (float) r8
            int r3 = r4.getHeight()
            float r3 = (float) r3
            float r8 = r7.b(r9, r8, r3, r2)
            androidx.core.widget.AutoScrollHelper$ClampedScroller r9 = r7.a
            r9.c = r0
            r9.d = r8
            boolean r8 = r7.o
            if (r8 != 0) goto L7e
            boolean r8 = r7.g()
            if (r8 == 0) goto L7e
            java.lang.Runnable r8 = r7.d
            if (r8 != 0) goto L60
            androidx.core.widget.AutoScrollHelper$ScrollAnimationRunnable r8 = new androidx.core.widget.AutoScrollHelper$ScrollAnimationRunnable
            r8.<init>()
            r7.d = r8
        L60:
            r7.o = r2
            r7.m = r2
            boolean r8 = r7.l
            if (r8 != 0) goto L75
            int r8 = r7.h
            if (r8 <= 0) goto L75
            java.lang.Runnable r9 = r7.d
            long r5 = (long) r8
            java.util.WeakHashMap r8 = androidx.core.view.ViewCompat.a
            r4.postOnAnimationDelayed(r9, r5)
            goto L7c
        L75:
            java.lang.Runnable r8 = r7.d
            androidx.core.widget.AutoScrollHelper$ScrollAnimationRunnable r8 = (androidx.core.widget.AutoScrollHelper.ScrollAnimationRunnable) r8
            r8.run()
        L7c:
            r7.l = r2
        L7e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.AutoScrollHelper.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    public AutoScrollHelper(View view) {
        ClampedScroller clampedScroller = new ClampedScroller();
        clampedScroller.e = Long.MIN_VALUE;
        clampedScroller.g = -1L;
        clampedScroller.f = 0L;
        this.a = clampedScroller;
        this.b = new AccelerateInterpolator();
        float[] fArr = {UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT};
        this.e = fArr;
        float[] fArr2 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.f = fArr2;
        float[] fArr3 = {UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT};
        this.i = fArr3;
        float[] fArr4 = {UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT};
        this.j = fArr4;
        float[] fArr5 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.k = fArr5;
        this.c = view;
        float f = Resources.getSystem().getDisplayMetrics().density;
        float f2 = ((int) ((1575.0f * f) + 0.5f)) / 1000.0f;
        fArr5[0] = f2;
        fArr5[1] = f2;
        float f3 = ((int) ((f * 315.0f) + 0.5f)) / 1000.0f;
        fArr4[0] = f3;
        fArr4[1] = f3;
        this.g = 1;
        fArr2[0] = Float.MAX_VALUE;
        fArr2[1] = Float.MAX_VALUE;
        fArr[0] = 0.2f;
        fArr[1] = 0.2f;
        fArr3[0] = 0.001f;
        fArr3[1] = 0.001f;
        this.h = q;
        clampedScroller.a = 500;
        clampedScroller.b = 500;
    }
}
