package androidx.core.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.WindowInsetsAnimation;
import android.view.WindowInsetsAnimation$Callback;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.core.graphics.Insets;
import androidx.interpolator.view.animation.FastOutLinearInInterpolator;
import com.ecffri.arrows.R;
import com.unity3d.services.UnityAdsConstants;
import defpackage.eh2;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class WindowInsetsAnimationCompat {
    public Impl a;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class BoundsCompat {
        public final Insets a;
        public final Insets b;

        public final String toString() {
            return "Bounds{lower=" + this.a + " upper=" + this.b + "}";
        }

        public BoundsCompat(WindowInsetsAnimation.Bounds bounds) {
            this.a = Insets.toCompatInsets(bounds.getLowerBound());
            this.b = Insets.toCompatInsets(bounds.getUpperBound());
        }

        public BoundsCompat(Insets insets, Insets insets2) {
            this.a = insets;
            this.b = insets2;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class Impl {
        public final int a;
        public float b;
        public final Interpolator c;
        public final long d;

        public long a() {
            return this.d;
        }

        public float b() {
            float f = this.b;
            Interpolator interpolator = this.c;
            return interpolator != null ? interpolator.getInterpolation(f) : f;
        }

        public int c() {
            return this.a;
        }

        public void d(float f) {
            this.b = f;
        }

        public Impl(int i, Interpolator interpolator, long j) {
            this.a = i;
            this.c = interpolator;
            this.d = j;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @RequiresApi
    public static class Impl21 extends Impl {
        public static final PathInterpolator e = new PathInterpolator(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.1f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
        public static final FastOutLinearInInterpolator f = new FastOutLinearInInterpolator();
        public static final DecelerateInterpolator g = new DecelerateInterpolator();

        /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
        @RequiresApi
        public static class Impl21OnApplyWindowInsetsListener implements View.OnApplyWindowInsetsListener {
            public final Callback a;
            public WindowInsetsCompat b;

            public Impl21OnApplyWindowInsetsListener(View view, Callback callback) {
                WindowInsetsCompat windowInsetsCompatBuild;
                this.a = callback;
                WeakHashMap weakHashMap = ViewCompat.a;
                WindowInsetsCompat windowInsetsCompatA = ViewCompat.Api23Impl.a(view);
                if (windowInsetsCompatA != null) {
                    windowInsetsCompatBuild = new WindowInsetsCompat.Builder(windowInsetsCompatA).build();
                } else {
                    windowInsetsCompatBuild = null;
                }
                this.b = windowInsetsCompatBuild;
            }

            @Override // android.view.View.OnApplyWindowInsetsListener
            public final WindowInsets onApplyWindowInsets(final View view, WindowInsets windowInsets) {
                Interpolator interpolator;
                if (!view.isLaidOut()) {
                    this.b = WindowInsetsCompat.toWindowInsetsCompat(windowInsets, view);
                    return Impl21.i(view, windowInsets);
                }
                final WindowInsetsCompat windowInsetsCompat = WindowInsetsCompat.toWindowInsetsCompat(windowInsets, view);
                if (this.b == null) {
                    WeakHashMap weakHashMap = ViewCompat.a;
                    this.b = ViewCompat.Api23Impl.a(view);
                }
                if (this.b == null) {
                    this.b = windowInsetsCompat;
                    return Impl21.i(view, windowInsets);
                }
                Callback callbackJ = Impl21.j(view);
                if (callbackJ != null && Objects.equals(callbackJ.a, windowInsets)) {
                    return Impl21.i(view, windowInsets);
                }
                WindowInsetsCompat windowInsetsCompat2 = this.b;
                final int i = 0;
                for (int i2 = 1; i2 <= 256; i2 <<= 1) {
                    if (!windowInsetsCompat.getInsets(i2).equals(windowInsetsCompat2.getInsets(i2))) {
                        i |= i2;
                    }
                }
                if (i == 0) {
                    return Impl21.i(view, windowInsets);
                }
                final WindowInsetsCompat windowInsetsCompat3 = this.b;
                if ((i & 8) != 0) {
                    if (windowInsetsCompat.getInsets(WindowInsetsCompat.Type.ime()).bottom > windowInsetsCompat3.getInsets(WindowInsetsCompat.Type.ime()).bottom) {
                        interpolator = Impl21.e;
                    } else {
                        interpolator = Impl21.f;
                    }
                } else {
                    interpolator = Impl21.g;
                }
                final WindowInsetsAnimationCompat windowInsetsAnimationCompat = new WindowInsetsAnimationCompat(i, interpolator, 160L);
                windowInsetsAnimationCompat.a.d(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                final ValueAnimator duration = ValueAnimator.ofFloat(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f).setDuration(windowInsetsAnimationCompat.a.a());
                Insets insets = windowInsetsCompat.getInsets(i);
                Insets insets2 = windowInsetsCompat3.getInsets(i);
                final BoundsCompat boundsCompat = new BoundsCompat(Insets.of(Math.min(insets.left, insets2.left), Math.min(insets.top, insets2.top), Math.min(insets.right, insets2.right), Math.min(insets.bottom, insets2.bottom)), Insets.of(Math.max(insets.left, insets2.left), Math.max(insets.top, insets2.top), Math.max(insets.right, insets2.right), Math.max(insets.bottom, insets2.bottom)));
                Impl21.f(view, windowInsetsAnimationCompat, windowInsets, false);
                duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: androidx.core.view.WindowInsetsAnimationCompat.Impl21.Impl21OnApplyWindowInsetsListener.1
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        float animatedFraction = valueAnimator.getAnimatedFraction();
                        WindowInsetsAnimationCompat windowInsetsAnimationCompat2 = windowInsetsAnimationCompat;
                        Impl impl = windowInsetsAnimationCompat2.a;
                        impl.d(animatedFraction);
                        float fB = impl.b();
                        PathInterpolator pathInterpolator = Impl21.e;
                        WindowInsetsCompat windowInsetsCompat4 = windowInsetsCompat;
                        WindowInsetsCompat.Builder builder = new WindowInsetsCompat.Builder(windowInsetsCompat4);
                        for (int i3 = 1; i3 <= 256; i3 <<= 1) {
                            if ((i & i3) == 0) {
                                builder.setInsets(i3, windowInsetsCompat4.getInsets(i3));
                            } else {
                                Insets insets3 = windowInsetsCompat4.getInsets(i3);
                                Insets insets4 = windowInsetsCompat3.getInsets(i3);
                                float f = 1.0f - fB;
                                builder.setInsets(i3, WindowInsetsCompat.insetInsets(insets3, (int) (((double) ((insets3.left - insets4.left) * f)) + 0.5d), (int) (((double) ((insets3.top - insets4.top) * f)) + 0.5d), (int) (((double) ((insets3.right - insets4.right) * f)) + 0.5d), (int) (((double) ((insets3.bottom - insets4.bottom) * f)) + 0.5d)));
                            }
                        }
                        Impl21.g(view, builder.build(), Collections.singletonList(windowInsetsAnimationCompat2));
                    }
                });
                duration.addListener(new AnimatorListenerAdapter() { // from class: androidx.core.view.WindowInsetsAnimationCompat.Impl21.Impl21OnApplyWindowInsetsListener.2
                    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                    public final void onAnimationEnd(Animator animator) {
                        WindowInsetsAnimationCompat windowInsetsAnimationCompat2 = windowInsetsAnimationCompat;
                        windowInsetsAnimationCompat2.a.d(1.0f);
                        Impl21.e(view, windowInsetsAnimationCompat2);
                    }
                });
                OneShotPreDrawListener.a(view, new Runnable() { // from class: androidx.core.view.WindowInsetsAnimationCompat.Impl21.Impl21OnApplyWindowInsetsListener.3
                    @Override // java.lang.Runnable
                    public final void run() {
                        Impl21.h(view, windowInsetsAnimationCompat, boundsCompat);
                        duration.start();
                    }
                });
                this.b = windowInsetsCompat;
                return Impl21.i(view, windowInsets);
            }
        }

        public static void e(View view, WindowInsetsAnimationCompat windowInsetsAnimationCompat) {
            Callback callbackJ = j(view);
            if (callbackJ != null) {
                callbackJ.a(windowInsetsAnimationCompat);
                if (callbackJ.b == 0) {
                    return;
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i = 0; i < viewGroup.getChildCount(); i++) {
                    e(viewGroup.getChildAt(i), windowInsetsAnimationCompat);
                }
            }
        }

        public static void f(View view, WindowInsetsAnimationCompat windowInsetsAnimationCompat, WindowInsets windowInsets, boolean z) {
            Callback callbackJ = j(view);
            if (callbackJ != null) {
                callbackJ.a = windowInsets;
                if (!z) {
                    callbackJ.d(windowInsetsAnimationCompat);
                    if (callbackJ.b == 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i = 0; i < viewGroup.getChildCount(); i++) {
                    f(viewGroup.getChildAt(i), windowInsetsAnimationCompat, windowInsets, z);
                }
            }
        }

        public static void g(View view, WindowInsetsCompat windowInsetsCompat, List list) {
            Callback callbackJ = j(view);
            if (callbackJ != null) {
                windowInsetsCompat = callbackJ.e(windowInsetsCompat, list);
                if (callbackJ.b == 0) {
                    return;
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i = 0; i < viewGroup.getChildCount(); i++) {
                    g(viewGroup.getChildAt(i), windowInsetsCompat, list);
                }
            }
        }

        public static void h(View view, WindowInsetsAnimationCompat windowInsetsAnimationCompat, BoundsCompat boundsCompat) {
            Callback callbackJ = j(view);
            if (callbackJ != null) {
                callbackJ.f(windowInsetsAnimationCompat, boundsCompat);
                if (callbackJ.b == 0) {
                    return;
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i = 0; i < viewGroup.getChildCount(); i++) {
                    h(viewGroup.getChildAt(i), windowInsetsAnimationCompat, boundsCompat);
                }
            }
        }

        public static WindowInsets i(View view, WindowInsets windowInsets) {
            if (view.getTag(R.id.tag_on_apply_window_listener) != null) {
                return windowInsets;
            }
            return view.onApplyWindowInsets(windowInsets);
        }

        public static Callback j(View view) {
            Object tag = view.getTag(R.id.tag_window_insets_animation_callback);
            if (tag instanceof Impl21OnApplyWindowInsetsListener) {
                return ((Impl21OnApplyWindowInsetsListener) tag).a;
            }
            return null;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @RequiresApi
    public static class Impl30 extends Impl {
        public final WindowInsetsAnimation e;

        /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
        @RequiresApi
        public static class ProxyCallback extends WindowInsetsAnimation$Callback {
            public final Callback a;
            public List b;
            public ArrayList c;
            public final HashMap d;

            public ProxyCallback(Callback callback) {
                super(callback.b);
                this.d = new HashMap();
                this.a = callback;
            }

            public final WindowInsetsAnimationCompat a(WindowInsetsAnimation windowInsetsAnimation) {
                HashMap map = this.d;
                WindowInsetsAnimationCompat windowInsetsAnimationCompat = (WindowInsetsAnimationCompat) map.get(windowInsetsAnimation);
                if (windowInsetsAnimationCompat == null) {
                    windowInsetsAnimationCompat = new WindowInsetsAnimationCompat(0, null, 0L);
                    if (Build.VERSION.SDK_INT >= 30) {
                        windowInsetsAnimationCompat.a = new Impl30(windowInsetsAnimation);
                    }
                    map.put(windowInsetsAnimation, windowInsetsAnimationCompat);
                }
                return windowInsetsAnimationCompat;
            }

            public final void onEnd(WindowInsetsAnimation windowInsetsAnimation) {
                this.a.a(a(windowInsetsAnimation));
                this.d.remove(windowInsetsAnimation);
            }

            public final void onPrepare(WindowInsetsAnimation windowInsetsAnimation) {
                this.a.d(a(windowInsetsAnimation));
            }

            public final WindowInsets onProgress(WindowInsets windowInsets, List list) {
                ArrayList arrayList = this.c;
                if (arrayList == null) {
                    ArrayList arrayList2 = new ArrayList(list.size());
                    this.c = arrayList2;
                    this.b = Collections.unmodifiableList(arrayList2);
                } else {
                    arrayList.clear();
                }
                for (int size = list.size() - 1; size >= 0; size--) {
                    WindowInsetsAnimation windowInsetsAnimationK = eh2.k(list.get(size));
                    WindowInsetsAnimationCompat windowInsetsAnimationCompatA = a(windowInsetsAnimationK);
                    windowInsetsAnimationCompatA.a.d(windowInsetsAnimationK.getFraction());
                    this.c.add(windowInsetsAnimationCompatA);
                }
                return this.a.e(WindowInsetsCompat.toWindowInsetsCompat(windowInsets), this.b).toWindowInsets();
            }

            public final WindowInsetsAnimation.Bounds onStart(WindowInsetsAnimation windowInsetsAnimation, WindowInsetsAnimation.Bounds bounds) {
                BoundsCompat boundsCompatF = this.a.f(a(windowInsetsAnimation), new BoundsCompat(bounds));
                boundsCompatF.getClass();
                eh2.m();
                return eh2.i(boundsCompatF.a.toPlatformInsets(), boundsCompatF.b.toPlatformInsets());
            }
        }

        public Impl30(WindowInsetsAnimation windowInsetsAnimation) {
            super(0, null, 0L);
            this.e = windowInsetsAnimation;
        }

        @Override // androidx.core.view.WindowInsetsAnimationCompat.Impl
        public final long a() {
            return this.e.getDurationMillis();
        }

        @Override // androidx.core.view.WindowInsetsAnimationCompat.Impl
        public final float b() {
            return this.e.getInterpolatedFraction();
        }

        @Override // androidx.core.view.WindowInsetsAnimationCompat.Impl
        public final int c() {
            return this.e.getTypeMask();
        }

        @Override // androidx.core.view.WindowInsetsAnimationCompat.Impl
        public final void d(float f) {
            this.e.setFraction(f);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static abstract class Callback {
        public WindowInsets a;
        public final int b;

        /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
        @Retention(RetentionPolicy.SOURCE)
        @RestrictTo
        public @interface DispatchMode {
        }

        public void a(WindowInsetsAnimationCompat windowInsetsAnimationCompat) {
        }

        public void d(WindowInsetsAnimationCompat windowInsetsAnimationCompat) {
        }

        public abstract WindowInsetsCompat e(WindowInsetsCompat windowInsetsCompat, List list);

        public BoundsCompat f(WindowInsetsAnimationCompat windowInsetsAnimationCompat, BoundsCompat boundsCompat) {
            return boundsCompat;
        }

        public Callback(int i) {
            this.b = i;
        }
    }

    public final long a() {
        return this.a.a();
    }

    public final float b() {
        return this.a.b();
    }

    public final int c() {
        return this.a.c();
    }

    public WindowInsetsAnimationCompat(int i, Interpolator interpolator, long j) {
        if (Build.VERSION.SDK_INT >= 30) {
            this.a = new Impl30(eh2.j(i, interpolator, j));
        } else {
            this.a = new Impl21(i, interpolator, j);
        }
    }
}
