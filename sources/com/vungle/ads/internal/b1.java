package com.vungle.ads.internal;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.Window;
import androidx.core.view.ViewCompat;
import defpackage.vb3;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class b1 {
    public final Map a;
    public final Handler b;
    public final Rect c;
    public final ViewTreeObserver.OnPreDrawListener d;
    public WeakReference e;
    public final a1 f;
    public boolean g;
    public boolean h;

    public static final void d(b1 b1Var) {
        if (b1Var.g) {
            return;
        }
        b1Var.g = true;
        b1Var.b.postDelayed(b1Var.f, 100L);
    }

    public final boolean a(Context context, View view) {
        Window window;
        View decorView;
        ViewTreeObserver viewTreeObserver = (ViewTreeObserver) this.e.get();
        if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
            return true;
        }
        View viewFindViewById = null;
        if ((context instanceof Activity) && (window = ((Activity) context).getWindow()) != null && (decorView = window.getDecorView()) != null) {
            viewFindViewById = decorView.findViewById(R.id.content);
        }
        if (viewFindViewById == null && view != null) {
            WeakHashMap weakHashMap = ViewCompat.a;
            if (!view.isAttachedToWindow()) {
                boolean z = com.vungle.ads.internal.util.u.a;
                com.vungle.ads.internal.util.t.c("b1", "Trying to call View#rootView() on an unattached View.");
            }
            View rootView = view.getRootView();
            if (rootView != null) {
                viewFindViewById = rootView.findViewById(R.id.content);
            }
            if (viewFindViewById == null) {
                viewFindViewById = rootView;
            }
        }
        if (viewFindViewById == null) {
            boolean z2 = com.vungle.ads.internal.util.u.a;
            com.vungle.ads.internal.util.t.a("b1", "Unable to set ViewTreeObserver due to no available root view.");
            return false;
        }
        ViewTreeObserver viewTreeObserver2 = viewFindViewById.getViewTreeObserver();
        if (viewTreeObserver2.isAlive()) {
            this.e = new WeakReference(viewTreeObserver2);
            viewTreeObserver2.addOnPreDrawListener(this.d);
            return true;
        }
        boolean z3 = com.vungle.ads.internal.util.u.a;
        com.vungle.ads.internal.util.t.a("b1", "The root view tree observer was not alive");
        return false;
    }

    public b1(Context context, WeakHashMap weakHashMap, Handler handler) {
        context.getClass();
        weakHashMap.getClass();
        handler.getClass();
        this.a = weakHashMap;
        this.b = handler;
        this.c = new Rect();
        this.f = new a1(this);
        this.d = new vb3(this, 0);
        this.e = new WeakReference(null);
        this.h = a(context, (View) null);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public b1(Context context) {
        this(context, new WeakHashMap(10), new Handler(Looper.getMainLooper()));
        context.getClass();
    }

    public static final boolean a(b1 b1Var, View view, int i) {
        b1Var.getClass();
        if (view != null && view.getVisibility() == 0 && view.getParent() != null) {
            ViewParent parent = view.getParent();
            while (parent instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) parent;
                if (viewGroup.getVisibility() != 0) {
                    boolean z = com.vungle.ads.internal.util.u.a;
                    com.vungle.ads.internal.util.t.c("ImpressionTracker", "Parent visibility is not visible: " + parent);
                    return false;
                }
                parent = viewGroup.getParent();
            }
            if (view.getGlobalVisibleRect(b1Var.c)) {
                long jHeight = ((long) b1Var.c.height()) * ((long) b1Var.c.width());
                long height = ((long) view.getHeight()) * ((long) view.getWidth());
                if (height > 0 && 100 * jHeight >= ((long) i) * height) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void a(View view, y0 y0Var) {
        view.getClass();
        this.h = a(view.getContext(), view);
        z0 z0Var = (z0) this.a.get(view);
        if (z0Var == null) {
            z0Var = new z0();
            this.a.put(view, z0Var);
            if (!this.g) {
                this.g = true;
                this.b.postDelayed(this.f, 100L);
            }
        }
        z0Var.c();
        z0Var.a(y0Var);
    }

    public final void a(View view) {
        view.getClass();
        this.a.remove(view);
    }

    public final void a() {
        this.a.clear();
        this.b.removeMessages(0);
        this.g = false;
        ViewTreeObserver viewTreeObserver = (ViewTreeObserver) this.e.get();
        if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnPreDrawListener(this.d);
        }
        this.e.clear();
    }

    public static final boolean a(b1 b1Var) {
        b1Var.getClass();
        if (!b1Var.g) {
            b1Var.g = true;
            b1Var.b.postDelayed(b1Var.f, 100L);
        }
        return true;
    }
}
