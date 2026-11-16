package androidx.customview.widget;

import android.content.Context;
import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import android.view.animation.Interpolator;
import android.widget.OverScroller;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.ViewCompat;
import com.unity3d.services.UnityAdsConstants;
import defpackage.d;
import defpackage.e32;
import java.util.Arrays;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public class ViewDragHelper {
    public static final Interpolator v = new AnonymousClass1();
    public int a;
    public final int b;
    public float[] d;
    public float[] e;
    public float[] f;
    public float[] g;
    public int[] h;
    public int[] i;
    public int[] j;
    public int k;
    public VelocityTracker l;
    public final float m;
    public final float n;
    public final int o;
    public final OverScroller p;
    public final Callback q;
    public View r;
    public boolean s;
    public final CoordinatorLayout t;
    public int c = -1;
    public final Runnable u = new Runnable() { // from class: androidx.customview.widget.ViewDragHelper.2
        @Override // java.lang.Runnable
        public final void run() {
            ViewDragHelper.this.p(0);
        }
    };

    /* JADX INFO: renamed from: androidx.customview.widget.ViewDragHelper$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class AnonymousClass1 implements Interpolator {
        @Override // android.animation.TimeInterpolator
        public final float getInterpolation(float f) {
            float f2 = f - 1.0f;
            return (f2 * f2 * f2 * f2 * f2) + 1.0f;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static abstract class Callback {
        public int a(int i, View view) {
            return 0;
        }

        public int b(int i, View view) {
            return 0;
        }

        public int c(View view) {
            return 0;
        }

        public int d() {
            return 0;
        }

        public void e(int i, View view) {
        }

        public void f(int i) {
        }

        public void g(View view, int i, int i2) {
        }

        public void h(View view, float f, float f2) {
        }

        public abstract boolean i(int i, View view);
    }

    public final void a() {
        this.c = -1;
        float[] fArr = this.d;
        if (fArr != null) {
            Arrays.fill(fArr, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            Arrays.fill(this.e, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            Arrays.fill(this.f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            Arrays.fill(this.g, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            Arrays.fill(this.h, 0);
            Arrays.fill(this.i, 0);
            Arrays.fill(this.j, 0);
            this.k = 0;
        }
        VelocityTracker velocityTracker = this.l;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.l = null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0040 A[RETURN] */
    public final boolean d(View view, float f, float f2) {
        if (view != null) {
            Callback callback = this.q;
            boolean z = callback.c(view) > 0;
            boolean z2 = callback.d() > 0;
            int i = this.b;
            if (z && z2) {
                if ((f2 * f2) + (f * f) > i * i) {
                    return true;
                }
            } else if (!z ? !(!z2 || Math.abs(f2) <= i) : Math.abs(f) > i) {
                return true;
            }
        }
        return false;
    }

    public final void m(float f, float f2, int i) {
        c(f, f2, i, 1);
        c(f2, f, i, 4);
        c(f, f2, i, 2);
        c(f2, f, i, 8);
    }

    public final void e(int i) {
        float[] fArr = this.d;
        if (fArr != null) {
            int i2 = this.k;
            int i3 = 1 << i;
            if ((i2 & i3) != 0) {
                fArr[i] = 0.0f;
                this.e[i] = 0.0f;
                this.f[i] = 0.0f;
                this.g[i] = 0.0f;
                this.h[i] = 0;
                this.i[i] = 0;
                this.j[i] = 0;
                this.k = (~i3) & i2;
            }
        }
    }

    public final int f(int i, int i2, int i3) {
        if (i == 0) {
            return 0;
        }
        int width = this.t.getWidth();
        float f = width / 2;
        float fSin = (((float) Math.sin((Math.min(1.0f, Math.abs(i) / width) - 0.5f) * 0.47123894f)) * f) + f;
        int iAbs = Math.abs(i2);
        return Math.min(iAbs > 0 ? Math.round(Math.abs(fSin / iAbs) * 1000.0f) * 4 : (int) (((Math.abs(i) / i3) + 1.0f) * 256.0f), 600);
    }

    public final boolean g() {
        if (this.a == 2) {
            OverScroller overScroller = this.p;
            boolean zComputeScrollOffset = overScroller.computeScrollOffset();
            int currX = overScroller.getCurrX();
            int currY = overScroller.getCurrY();
            int left = currX - this.r.getLeft();
            int top = currY - this.r.getTop();
            if (left != 0) {
                View view = this.r;
                WeakHashMap weakHashMap = ViewCompat.a;
                view.offsetLeftAndRight(left);
            }
            if (top != 0) {
                View view2 = this.r;
                WeakHashMap weakHashMap2 = ViewCompat.a;
                view2.offsetTopAndBottom(top);
            }
            if (left != 0 || top != 0) {
                this.q.g(this.r, currX, currY);
            }
            if (zComputeScrollOffset && currX == overScroller.getFinalX() && currY == overScroller.getFinalY()) {
                overScroller.abortAnimation();
                zComputeScrollOffset = false;
            }
            if (!zComputeScrollOffset) {
                this.t.post(this.u);
            }
        }
        return this.a == 2;
    }

    public final View h(int i, int i2) {
        CoordinatorLayout coordinatorLayout = this.t;
        for (int childCount = coordinatorLayout.getChildCount() - 1; childCount >= 0; childCount--) {
            this.q.getClass();
            View childAt = coordinatorLayout.getChildAt(childCount);
            if (i >= childAt.getLeft() && i < childAt.getRight() && i2 >= childAt.getTop() && i2 < childAt.getBottom()) {
                return childAt;
            }
        }
        return null;
    }

    public final boolean i(int i, int i2, int i3, int i4) {
        float f;
        float f2;
        float f3;
        float f4;
        int left = this.r.getLeft();
        int top = this.r.getTop();
        int i5 = i - left;
        int i6 = i2 - top;
        OverScroller overScroller = this.p;
        if (i5 == 0 && i6 == 0) {
            overScroller.abortAnimation();
            p(0);
            return false;
        }
        View view = this.r;
        int i7 = (int) this.n;
        int i8 = (int) this.m;
        int iAbs = Math.abs(i3);
        if (iAbs < i7) {
            i3 = 0;
        } else if (iAbs > i8) {
            i3 = i3 > 0 ? i8 : -i8;
        }
        int iAbs2 = Math.abs(i4);
        if (iAbs2 < i7) {
            i4 = 0;
        } else if (iAbs2 > i8) {
            i4 = i4 > 0 ? i8 : -i8;
        }
        int iAbs3 = Math.abs(i5);
        int iAbs4 = Math.abs(i6);
        int iAbs5 = Math.abs(i3);
        int iAbs6 = Math.abs(i4);
        int i9 = iAbs5 + iAbs6;
        int i10 = iAbs3 + iAbs4;
        if (i3 != 0) {
            f = iAbs5;
            f2 = i9;
        } else {
            f = iAbs3;
            f2 = i10;
        }
        float f5 = f / f2;
        if (i4 != 0) {
            f3 = iAbs6;
            f4 = i9;
        } else {
            f3 = iAbs4;
            f4 = i10;
        }
        float f6 = f3 / f4;
        Callback callback = this.q;
        overScroller.startScroll(left, top, i5, i6, (int) ((f(i6, i4, callback.d()) * f6) + (f(i5, i3, callback.c(view)) * f5)));
        p(2);
        return true;
    }

    public final boolean j(int i) {
        if ((this.k & (1 << i)) != 0) {
            return true;
        }
        Log.e("ViewDragHelper", "Ignoring pointerId=" + i + " because ACTION_DOWN was not received for this pointer before ACTION_MOVE. It likely happened because  ViewDragHelper did not receive all the events in the event stream.");
        return false;
    }

    public final void l() {
        VelocityTracker velocityTracker = this.l;
        float f = this.m;
        velocityTracker.computeCurrentVelocity(1000, f);
        float xVelocity = this.l.getXVelocity(this.c);
        float fAbs = Math.abs(xVelocity);
        float f2 = this.n;
        if (fAbs < f2) {
            xVelocity = 0.0f;
        } else if (fAbs > f) {
            xVelocity = xVelocity > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? f : -f;
        }
        float yVelocity = this.l.getYVelocity(this.c);
        float fAbs2 = Math.abs(yVelocity);
        if (fAbs2 < f2) {
            f = 0.0f;
        } else if (fAbs2 <= f) {
            f = yVelocity;
        } else if (yVelocity <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            f = -f;
        }
        this.s = true;
        this.q.h(this.r, xVelocity, f);
        this.s = false;
        if (this.a == 1) {
            p(0);
        }
    }

    public final void n(float f, float f2, int i) {
        float[] fArr = this.d;
        if (fArr == null || fArr.length <= i) {
            int i2 = i + 1;
            float[] fArr2 = new float[i2];
            float[] fArr3 = new float[i2];
            float[] fArr4 = new float[i2];
            float[] fArr5 = new float[i2];
            int[] iArr = new int[i2];
            int[] iArr2 = new int[i2];
            int[] iArr3 = new int[i2];
            if (fArr != null) {
                System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
                float[] fArr6 = this.e;
                System.arraycopy(fArr6, 0, fArr3, 0, fArr6.length);
                float[] fArr7 = this.f;
                System.arraycopy(fArr7, 0, fArr4, 0, fArr7.length);
                float[] fArr8 = this.g;
                System.arraycopy(fArr8, 0, fArr5, 0, fArr8.length);
                int[] iArr4 = this.h;
                System.arraycopy(iArr4, 0, iArr, 0, iArr4.length);
                int[] iArr5 = this.i;
                System.arraycopy(iArr5, 0, iArr2, 0, iArr5.length);
                int[] iArr6 = this.j;
                System.arraycopy(iArr6, 0, iArr3, 0, iArr6.length);
            }
            this.d = fArr2;
            this.e = fArr3;
            this.f = fArr4;
            this.g = fArr5;
            this.h = iArr;
            this.i = iArr2;
            this.j = iArr3;
        }
        float[] fArr9 = this.d;
        this.f[i] = f;
        fArr9[i] = f;
        float[] fArr10 = this.e;
        this.g[i] = f2;
        fArr10[i] = f2;
        int[] iArr7 = this.h;
        int i3 = (int) f;
        int i4 = (int) f2;
        CoordinatorLayout coordinatorLayout = this.t;
        int left = coordinatorLayout.getLeft();
        int i5 = this.o;
        int i6 = i3 < left + i5 ? 1 : 0;
        if (i4 < coordinatorLayout.getTop() + i5) {
            i6 |= 4;
        }
        if (i3 > coordinatorLayout.getRight() - i5) {
            i6 |= 2;
        }
        if (i4 > coordinatorLayout.getBottom() - i5) {
            i6 |= 8;
        }
        iArr7[i] = i6;
        this.k |= 1 << i;
    }

    public final void p(int i) {
        this.t.removeCallbacks(this.u);
        if (this.a != i) {
            this.a = i;
            this.q.f(i);
            if (this.a == 0) {
                this.r = null;
            }
        }
    }

    public final boolean q(int i, int i2) {
        if (this.s) {
            return i(i, i2, (int) this.l.getXVelocity(this.c), (int) this.l.getYVelocity(this.c));
        }
        e32.i("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:52:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:61:0x00ed  */
    public final boolean r(MotionEvent motionEvent) {
        View viewH;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            a();
        }
        if (this.l == null) {
            this.l = VelocityTracker.obtain();
        }
        this.l.addMovement(motionEvent);
        if (actionMasked == 0) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            int pointerId = motionEvent.getPointerId(0);
            n(x, y, pointerId);
            View viewH2 = h((int) x, (int) y);
            if (viewH2 == this.r && this.a == 2) {
                s(pointerId, viewH2);
            }
            int i = this.h[pointerId];
        } else if (actionMasked == 1) {
            a();
        } else if (actionMasked != 2) {
            if (actionMasked == 3) {
                a();
            } else if (actionMasked == 5) {
                int pointerId2 = motionEvent.getPointerId(actionIndex);
                float x2 = motionEvent.getX(actionIndex);
                float y2 = motionEvent.getY(actionIndex);
                n(x2, y2, pointerId2);
                int i2 = this.a;
                if (i2 == 0) {
                    int i3 = this.h[pointerId2];
                } else if (i2 == 2 && (viewH = h((int) x2, (int) y2)) == this.r) {
                    s(pointerId2, viewH);
                }
            } else if (actionMasked == 6) {
                e(motionEvent.getPointerId(actionIndex));
            }
        } else if (this.d != null && this.e != null) {
            int pointerCount = motionEvent.getPointerCount();
            for (int i4 = 0; i4 < pointerCount; i4++) {
                int pointerId3 = motionEvent.getPointerId(i4);
                if (j(pointerId3)) {
                    float x3 = motionEvent.getX(i4);
                    float y3 = motionEvent.getY(i4);
                    float f = x3 - this.d[pointerId3];
                    float f2 = y3 - this.e[pointerId3];
                    View viewH3 = h((int) x3, (int) y3);
                    boolean z = viewH3 != null && d(viewH3, f, f2);
                    if (!z) {
                        m(f, f2, pointerId3);
                        if (this.a != 1) {
                            break;
                        }
                    } else {
                        int left = viewH3.getLeft();
                        Callback callback = this.q;
                        int iA = callback.a(((int) f) + left, viewH3);
                        int top = viewH3.getTop();
                        int iB = callback.b(((int) f2) + top, viewH3);
                        int iC = callback.c(viewH3);
                        int iD = callback.d();
                        if ((iC == 0 || (iC > 0 && iA == left)) && (iD == 0 || (iD > 0 && iB == top))) {
                            break;
                        }
                        m(f, f2, pointerId3);
                        if (this.a != 1 || (z && s(pointerId3, viewH3))) {
                            break;
                        }
                    }
                }
            }
            o(motionEvent);
        }
        return this.a == 1;
    }

    public final boolean s(int i, View view) {
        if (view == this.r && this.c == i) {
            return true;
        }
        if (view == null || !this.q.i(i, view)) {
            return false;
        }
        this.c = i;
        b(i, view);
        return true;
    }

    public ViewDragHelper(Context context, CoordinatorLayout coordinatorLayout, Callback callback) {
        if (callback != null) {
            this.t = coordinatorLayout;
            this.q = callback;
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            this.o = (int) ((context.getResources().getDisplayMetrics().density * 20.0f) + 0.5f);
            this.b = viewConfiguration.getScaledTouchSlop();
            this.m = viewConfiguration.getScaledMaximumFlingVelocity();
            this.n = viewConfiguration.getScaledMinimumFlingVelocity();
            this.p = new OverScroller(context, v);
            return;
        }
        d.r("Callback may not be null");
        throw null;
    }

    public final void b(int i, View view) {
        ViewParent parent = view.getParent();
        CoordinatorLayout coordinatorLayout = this.t;
        if (parent == coordinatorLayout) {
            this.r = view;
            this.c = i;
            this.q.e(i, view);
            p(1);
            return;
        }
        e32.o(coordinatorLayout, ")", "captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (");
    }

    public final boolean c(float f, float f2, int i, int i2) {
        Math.abs(f);
        Math.abs(f2);
        int i3 = this.h[i];
        return false;
    }

    public final void k(MotionEvent motionEvent) {
        int i;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            a();
        }
        if (this.l == null) {
            this.l = VelocityTracker.obtain();
        }
        this.l.addMovement(motionEvent);
        int i2 = 0;
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                Callback callback = this.q;
                if (actionMasked != 2) {
                    if (actionMasked != 3) {
                        if (actionMasked != 5) {
                            if (actionMasked == 6) {
                                int pointerId = motionEvent.getPointerId(actionIndex);
                                if (this.a == 1 && pointerId == this.c) {
                                    int pointerCount = motionEvent.getPointerCount();
                                    while (true) {
                                        if (i2 < pointerCount) {
                                            int pointerId2 = motionEvent.getPointerId(i2);
                                            if (pointerId2 != this.c) {
                                                View viewH = h((int) motionEvent.getX(i2), (int) motionEvent.getY(i2));
                                                View view = this.r;
                                                if (viewH == view && s(pointerId2, view)) {
                                                    i = this.c;
                                                    break;
                                                }
                                            }
                                            i2++;
                                        } else {
                                            i = -1;
                                            break;
                                        }
                                    }
                                    if (i == -1) {
                                        l();
                                    }
                                }
                                e(pointerId);
                                return;
                            }
                            return;
                        }
                        int pointerId3 = motionEvent.getPointerId(actionIndex);
                        float x = motionEvent.getX(actionIndex);
                        float y = motionEvent.getY(actionIndex);
                        n(x, y, pointerId3);
                        if (this.a == 0) {
                            s(pointerId3, h((int) x, (int) y));
                            int i3 = this.h[pointerId3];
                            return;
                        }
                        int i4 = (int) x;
                        int i5 = (int) y;
                        View view2 = this.r;
                        if (view2 != null && i4 >= view2.getLeft() && i4 < view2.getRight() && i5 >= view2.getTop() && i5 < view2.getBottom()) {
                            i2 = 1;
                        }
                        if (i2 != 0) {
                            s(pointerId3, this.r);
                            return;
                        }
                        return;
                    }
                    if (this.a == 1) {
                        this.s = true;
                        callback.h(this.r, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                        this.s = false;
                        if (this.a == 1) {
                            p(0);
                        }
                    }
                    a();
                    return;
                }
                if (this.a == 1) {
                    if (!j(this.c)) {
                        return;
                    }
                    int iFindPointerIndex = motionEvent.findPointerIndex(this.c);
                    float x2 = motionEvent.getX(iFindPointerIndex);
                    float y2 = motionEvent.getY(iFindPointerIndex);
                    float[] fArr = this.f;
                    int i6 = this.c;
                    int i7 = (int) (x2 - fArr[i6]);
                    int i8 = (int) (y2 - this.g[i6]);
                    int left = this.r.getLeft() + i7;
                    int top = this.r.getTop() + i8;
                    int left2 = this.r.getLeft();
                    int top2 = this.r.getTop();
                    if (i7 != 0) {
                        left = callback.a(left, this.r);
                        WeakHashMap weakHashMap = ViewCompat.a;
                        this.r.offsetLeftAndRight(left - left2);
                    }
                    if (i8 != 0) {
                        top = callback.b(top, this.r);
                        WeakHashMap weakHashMap2 = ViewCompat.a;
                        this.r.offsetTopAndBottom(top - top2);
                    }
                    if (i7 != 0 || i8 != 0) {
                        callback.g(this.r, left, top);
                    }
                    o(motionEvent);
                    return;
                }
                int pointerCount2 = motionEvent.getPointerCount();
                while (i2 < pointerCount2) {
                    int pointerId4 = motionEvent.getPointerId(i2);
                    if (j(pointerId4)) {
                        float x3 = motionEvent.getX(i2);
                        float y3 = motionEvent.getY(i2);
                        float f = x3 - this.d[pointerId4];
                        float f2 = y3 - this.e[pointerId4];
                        m(f, f2, pointerId4);
                        if (this.a != 1) {
                            View viewH2 = h((int) x3, (int) y3);
                            if (d(viewH2, f, f2) && s(pointerId4, viewH2)) {
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                    i2++;
                }
                o(motionEvent);
                return;
            }
            if (this.a == 1) {
                l();
            }
            a();
            return;
        }
        float x4 = motionEvent.getX();
        float y4 = motionEvent.getY();
        int pointerId5 = motionEvent.getPointerId(0);
        View viewH3 = h((int) x4, (int) y4);
        n(x4, y4, pointerId5);
        s(pointerId5, viewH3);
        int i9 = this.h[pointerId5];
    }

    public final void o(MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i = 0; i < pointerCount; i++) {
            int pointerId = motionEvent.getPointerId(i);
            if (j(pointerId)) {
                float x = motionEvent.getX(i);
                float y = motionEvent.getY(i);
                this.f[pointerId] = x;
                this.g[pointerId] = y;
            }
        }
    }
}
