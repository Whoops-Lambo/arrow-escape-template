package androidx.recyclerview.widget;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.view.MotionEvent;
import androidx.annotation.VisibleForTesting;
import androidx.core.view.ViewCompat;
import com.unity3d.services.UnityAdsConstants;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
@VisibleForTesting
class FastScroller extends RecyclerView.ItemDecoration implements RecyclerView.OnItemTouchListener {
    public static final int[] H = {R.attr.state_pressed};
    public static final int[] I = new int[0];
    public final ValueAnimator E;
    public int F;
    public final Runnable G;
    public final int f;
    public final int g;
    public final StateListDrawable h;
    public final Drawable i;
    public final int j;
    public final int k;
    public final StateListDrawable l;
    public final Drawable m;
    public final int n;
    public final int o;
    public int p;
    public int q;
    public float r;
    public int s;
    public int t;
    public float u;
    public final RecyclerView x;
    public int v = 0;
    public int w = 0;
    public boolean y = false;
    public boolean z = false;
    public int A = 0;
    public int B = 0;
    public final int[] C = new int[2];
    public final int[] D = new int[2];

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class AnimatorListener extends AnimatorListenerAdapter {
        public boolean a = false;

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationCancel(Animator animator) {
            this.a = true;
        }

        public AnimatorListener() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            if (this.a) {
                this.a = false;
                return;
            }
            FastScroller fastScroller = FastScroller.this;
            if (((Float) fastScroller.E.getAnimatedValue()).floatValue() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                fastScroller.F = 0;
                fastScroller.h(0);
            } else {
                fastScroller.F = 2;
                fastScroller.x.invalidate();
            }
        }
    }

    public static int g(float f, float f2, int[] iArr, int i, int i2, int i3) {
        int i4 = iArr[1] - iArr[0];
        if (i4 != 0) {
            int i5 = i - i3;
            int i6 = (int) (((f2 - f) / i4) * i5);
            int i7 = i2 + i6;
            if (i7 < i5 && i7 >= 0) {
                return i6;
            }
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnItemTouchListener
    public final void c(boolean z) {
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class AnimatorUpdater implements ValueAnimator.AnimatorUpdateListener {
        public AnimatorUpdater() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            int iFloatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
            FastScroller fastScroller = FastScroller.this;
            fastScroller.h.setAlpha(iFloatValue);
            fastScroller.i.setAlpha(iFloatValue);
            fastScroller.x.invalidate();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnItemTouchListener
    public final boolean d(MotionEvent motionEvent) {
        int i = this.A;
        if (i != 1) {
            return i == 2;
        }
        boolean zF = f(motionEvent.getX(), motionEvent.getY());
        boolean zE = e(motionEvent.getX(), motionEvent.getY());
        if (motionEvent.getAction() != 0) {
            return false;
        }
        if (!zF && !zE) {
            return false;
        }
        if (zE) {
            this.B = 1;
            this.u = (int) motionEvent.getX();
        } else if (zF) {
            this.B = 2;
            this.r = (int) motionEvent.getY();
        }
        h(2);
        return true;
    }

    public final boolean e(float f, float f2) {
        if (f2 < this.w - this.n) {
            return false;
        }
        int i = this.t;
        int i2 = this.s;
        return f >= ((float) (i - (i2 / 2))) && f <= ((float) ((i2 / 2) + i));
    }

    public final boolean f(float f, float f2) {
        WeakHashMap weakHashMap = ViewCompat.a;
        int layoutDirection = this.x.getLayoutDirection();
        int i = this.j;
        if (layoutDirection == 1) {
            if (f > i) {
                return false;
            }
        } else if (f < this.v - i) {
            return false;
        }
        int i2 = this.q;
        int i3 = this.p / 2;
        return f2 >= ((float) (i2 - i3)) && f2 <= ((float) (i3 + i2));
    }

    public final void h(int i) {
        RecyclerView recyclerView = this.x;
        Runnable runnable = this.G;
        StateListDrawable stateListDrawable = this.h;
        if (i == 2 && this.A != 2) {
            stateListDrawable.setState(H);
            recyclerView.removeCallbacks(runnable);
        }
        if (i == 0) {
            recyclerView.invalidate();
        } else {
            i();
        }
        if (this.A == 2 && i != 2) {
            stateListDrawable.setState(I);
            recyclerView.removeCallbacks(runnable);
            recyclerView.postDelayed(runnable, 1200L);
        } else if (i == 1) {
            recyclerView.removeCallbacks(runnable);
            recyclerView.postDelayed(runnable, 1500L);
        }
        this.A = i;
    }

    public final void i() {
        int i = this.F;
        ValueAnimator valueAnimator = this.E;
        if (i != 0) {
            if (i != 3) {
                return;
            } else {
                valueAnimator.cancel();
            }
        }
        this.F = 1;
        valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 1.0f);
        valueAnimator.setDuration(500L);
        valueAnimator.setStartDelay(0L);
        valueAnimator.start();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public final void onDrawOver(Canvas canvas, RecyclerView recyclerView, RecyclerView.State state) {
        int i = this.v;
        RecyclerView recyclerView2 = this.x;
        if (i != recyclerView2.getWidth() || this.w != recyclerView2.getHeight()) {
            this.v = recyclerView2.getWidth();
            this.w = recyclerView2.getHeight();
            h(0);
            return;
        }
        if (this.F != 0) {
            if (this.y) {
                int i2 = this.v;
                int i3 = this.j;
                int i4 = i2 - i3;
                int i5 = this.q;
                int i6 = this.p;
                int i7 = i5 - (i6 / 2);
                StateListDrawable stateListDrawable = this.h;
                stateListDrawable.setBounds(0, 0, i3, i6);
                int i8 = this.k;
                int i9 = this.w;
                Drawable drawable = this.i;
                drawable.setBounds(0, 0, i8, i9);
                WeakHashMap weakHashMap = ViewCompat.a;
                if (recyclerView2.getLayoutDirection() == 1) {
                    drawable.draw(canvas);
                    canvas.translate(i3, i7);
                    canvas.scale(-1.0f, 1.0f);
                    stateListDrawable.draw(canvas);
                    canvas.scale(-1.0f, 1.0f);
                    canvas.translate(-i3, -i7);
                } else {
                    canvas.translate(i4, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                    drawable.draw(canvas);
                    canvas.translate(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, i7);
                    stateListDrawable.draw(canvas);
                    canvas.translate(-i4, -i7);
                }
            }
            if (this.z) {
                int i10 = this.w;
                int i11 = this.n;
                int i12 = i10 - i11;
                int i13 = this.t;
                int i14 = this.s;
                int i15 = i13 - (i14 / 2);
                StateListDrawable stateListDrawable2 = this.l;
                stateListDrawable2.setBounds(0, 0, i14, i11);
                int i16 = this.v;
                int i17 = this.o;
                Drawable drawable2 = this.m;
                drawable2.setBounds(0, 0, i16, i17);
                canvas.translate(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, i12);
                drawable2.draw(canvas);
                canvas.translate(i15, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                stateListDrawable2.draw(canvas);
                canvas.translate(-i15, -i12);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnItemTouchListener
    public final void onTouchEvent(MotionEvent motionEvent) {
        if (this.A == 0) {
            return;
        }
        if (motionEvent.getAction() == 0) {
            boolean zF = f(motionEvent.getX(), motionEvent.getY());
            boolean zE = e(motionEvent.getX(), motionEvent.getY());
            if (zF || zE) {
                if (zE) {
                    this.B = 1;
                    this.u = (int) motionEvent.getX();
                } else if (zF) {
                    this.B = 2;
                    this.r = (int) motionEvent.getY();
                }
                h(2);
                return;
            }
            return;
        }
        if (motionEvent.getAction() == 1 && this.A == 2) {
            this.r = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            this.u = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            h(1);
            this.B = 0;
            return;
        }
        if (motionEvent.getAction() == 2 && this.A == 2) {
            i();
            int i = this.B;
            RecyclerView recyclerView = this.x;
            int i2 = this.g;
            if (i == 1) {
                float x = motionEvent.getX();
                int[] iArr = this.D;
                iArr[0] = i2;
                int i3 = this.v - i2;
                iArr[1] = i3;
                float fMax = Math.max(i2, Math.min(i3, x));
                if (Math.abs(this.t - fMax) >= 2.0f) {
                    int iG = g(this.u, fMax, iArr, recyclerView.computeHorizontalScrollRange(), recyclerView.computeHorizontalScrollOffset(), this.v);
                    if (iG != 0) {
                        recyclerView.scrollBy(iG, 0);
                    }
                    this.u = fMax;
                }
            }
            if (this.B == 2) {
                float y = motionEvent.getY();
                int[] iArr2 = this.C;
                iArr2[0] = i2;
                int i4 = this.w - i2;
                iArr2[1] = i4;
                float fMax2 = Math.max(i2, Math.min(i4, y));
                if (Math.abs(this.q - fMax2) < 2.0f) {
                    return;
                }
                int iG2 = g(this.r, fMax2, iArr2, recyclerView.computeVerticalScrollRange(), recyclerView.computeVerticalScrollOffset(), this.w);
                if (iG2 != 0) {
                    recyclerView.scrollBy(0, iG2);
                }
                this.r = fMax2;
            }
        }
    }

    public FastScroller(RecyclerView recyclerView, StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2, int i, int i2, int i3) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
        this.E = valueAnimatorOfFloat;
        this.F = 0;
        Runnable runnable = new Runnable() { // from class: androidx.recyclerview.widget.FastScroller.1
            @Override // java.lang.Runnable
            public final void run() {
                FastScroller fastScroller = FastScroller.this;
                ValueAnimator valueAnimator = fastScroller.E;
                int i4 = fastScroller.F;
                if (i4 == 1) {
                    valueAnimator.cancel();
                } else if (i4 != 2) {
                    return;
                }
                fastScroller.F = 3;
                valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                valueAnimator.setDuration(500L);
                valueAnimator.start();
            }
        };
        this.G = runnable;
        RecyclerView.OnScrollListener onScrollListener = new RecyclerView.OnScrollListener() { // from class: androidx.recyclerview.widget.FastScroller.2
            @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
            public final void onScrolled(RecyclerView recyclerView2, int i4, int i5) {
                boolean z;
                boolean z2;
                int iComputeHorizontalScrollOffset = recyclerView2.computeHorizontalScrollOffset();
                int iComputeVerticalScrollOffset = recyclerView2.computeVerticalScrollOffset();
                FastScroller fastScroller = FastScroller.this;
                int i6 = fastScroller.f;
                int iComputeVerticalScrollRange = fastScroller.x.computeVerticalScrollRange();
                int i7 = fastScroller.w;
                if (iComputeVerticalScrollRange - i7 > 0 && i7 >= i6) {
                    z = true;
                } else {
                    z = false;
                }
                fastScroller.y = z;
                int iComputeHorizontalScrollRange = fastScroller.x.computeHorizontalScrollRange();
                int i8 = fastScroller.v;
                if (iComputeHorizontalScrollRange - i8 > 0 && i8 >= i6) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                fastScroller.z = z2;
                boolean z3 = fastScroller.y;
                if (!z3 && !z2) {
                    if (fastScroller.A != 0) {
                        fastScroller.h(0);
                        return;
                    }
                    return;
                }
                if (z3) {
                    float f = i7;
                    fastScroller.q = (int) ((((f / 2.0f) + iComputeVerticalScrollOffset) * f) / iComputeVerticalScrollRange);
                    fastScroller.p = Math.min(i7, (i7 * i7) / iComputeVerticalScrollRange);
                }
                if (fastScroller.z) {
                    float f2 = iComputeHorizontalScrollOffset;
                    float f3 = i8;
                    fastScroller.t = (int) ((((f3 / 2.0f) + f2) * f3) / iComputeHorizontalScrollRange);
                    fastScroller.s = Math.min(i8, (i8 * i8) / iComputeHorizontalScrollRange);
                }
                int i9 = fastScroller.A;
                if (i9 != 0 && i9 != 1) {
                    return;
                }
                fastScroller.h(1);
            }
        };
        this.h = stateListDrawable;
        this.i = drawable;
        this.l = stateListDrawable2;
        this.m = drawable2;
        this.j = Math.max(i, stateListDrawable.getIntrinsicWidth());
        this.k = Math.max(i, drawable.getIntrinsicWidth());
        this.n = Math.max(i, stateListDrawable2.getIntrinsicWidth());
        this.o = Math.max(i, drawable2.getIntrinsicWidth());
        this.f = i2;
        this.g = i3;
        stateListDrawable.setAlpha(255);
        drawable.setAlpha(255);
        valueAnimatorOfFloat.addListener(new AnimatorListener());
        valueAnimatorOfFloat.addUpdateListener(new AnimatorUpdater());
        RecyclerView recyclerView2 = this.x;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            recyclerView2.removeItemDecoration(this);
            this.x.removeOnItemTouchListener(this);
            this.x.removeOnScrollListener(onScrollListener);
            this.x.removeCallbacks(runnable);
        }
        this.x = recyclerView;
        recyclerView.addItemDecoration(this);
        this.x.addOnItemTouchListener(this);
        this.x.addOnScrollListener(onScrollListener);
    }
}
