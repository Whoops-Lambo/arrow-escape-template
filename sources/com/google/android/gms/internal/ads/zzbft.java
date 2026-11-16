package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.app.KeyguardManager;
import android.content.Context;
import android.content.IntentFilter;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.PowerManager;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.WindowManager;
import com.google.android.gms.ads.internal.util.client.zzo;
import defpackage.l24;
import defpackage.sx3;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class zzbft implements View.OnAttachStateChangeListener, ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, Application.ActivityLifecycleCallbacks {
    public static final long o = ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjr.g2)).longValue();
    public final Context a;
    public final Application b;
    public final PowerManager c;
    public final KeyguardManager d;
    public com.facebook.internal.f e;
    public WeakReference f;
    public final WeakReference g;
    public final sx3 h;
    public final com.google.android.gms.ads.internal.util.zzbu i = new com.google.android.gms.ads.internal.util.zzbu(o);
    public boolean j = false;
    public int k = -1;
    public final HashSet l = new HashSet();
    public final DisplayMetrics m;
    public final Rect n;

    public final void f(View view) {
        try {
            WeakReference weakReference = this.f;
            if (weakReference != null) {
                ViewTreeObserver viewTreeObserver = (ViewTreeObserver) weakReference.get();
                if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
                    viewTreeObserver.removeOnScrollChangedListener(this);
                    viewTreeObserver.removeGlobalOnLayoutListener(this);
                }
                this.f = null;
            }
        } catch (Exception e) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            zzo.zzg("Error while unregistering listeners from the last ViewTreeObserver.", e);
        }
        try {
            ViewTreeObserver viewTreeObserver2 = view.getViewTreeObserver();
            if (viewTreeObserver2.isAlive()) {
                viewTreeObserver2.removeOnScrollChangedListener(this);
                viewTreeObserver2.removeGlobalOnLayoutListener(this);
            }
        } catch (Exception e2) {
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            zzo.zzg("Error while unregistering listeners from the ViewTreeObserver.", e2);
        }
        if (this.e != null) {
            try {
                com.google.android.gms.ads.internal.zzt.zzA().zzc(this.a, this.e);
            } catch (IllegalStateException e3) {
                int i3 = com.google.android.gms.ads.internal.util.zze.zza;
                zzo.zzg("Failed trying to unregister the receiver", e3);
            } catch (Exception e4) {
                com.google.android.gms.ads.internal.zzt.zzh().d("ActiveViewUnit.stopScreenStatusMonitoring", e4);
            }
            this.e = null;
        }
        Application application = this.b;
        if (application != null) {
            try {
                application.unregisterActivityLifecycleCallbacks(this.h);
            } catch (Exception e5) {
                int i4 = com.google.android.gms.ads.internal.util.zze.zza;
                zzo.zzg("Error registering activity lifecycle callbacks.", e5);
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        c(activity, 0);
        d(3);
        b();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        d(3);
        b();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        c(activity, 4);
        d(3);
        b();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        c(activity, 0);
        d(3);
        b();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        d(3);
        b();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        c(activity, 0);
        d(3);
        b();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        d(3);
        b();
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        d(2);
        b();
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        d(1);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.k = -1;
        e(view);
        d(3);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.k = -1;
        d(3);
        b();
        f(view);
    }

    public final Rect a(Rect rect) {
        float f = rect.left;
        float f2 = this.m.density;
        return new Rect((int) (f / f2), (int) (rect.top / f2), (int) (rect.right / f2), (int) (rect.bottom / f2));
    }

    public final void b() {
        com.google.android.gms.ads.internal.util.zzs.zza.post(new l24(this, 22));
    }

    public final void c(Activity activity, int i) {
        Window window;
        WeakReference weakReference = this.g;
        if (weakReference == null || (window = activity.getWindow()) == null) {
            return;
        }
        View viewPeekDecorView = window.peekDecorView();
        View view = (View) weakReference.get();
        if (view == null || viewPeekDecorView == null || view.getRootView() != viewPeekDecorView.getRootView()) {
            return;
        }
        this.k = i;
    }

    /* JADX WARN: Code duplicated, block: B:54:0x0138  */
    /* JADX WARN: Code duplicated, block: B:55:0x013e  */
    /* JADX WARN: Code duplicated, block: B:57:0x0143  */
    /* JADX WARN: Code duplicated, block: B:58:0x0148  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v33, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v34, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r18v0 */
    /* JADX WARN: Type inference failed for: r18v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r18v2 */
    /* JADX WARN: Type inference failed for: r23v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r25v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r27v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r28v0, types: [java.util.List] */
    public final void d(int i) {
        WeakReference weakReference;
        int i2;
        boolean z;
        boolean z2;
        View view;
        ?? arrayList;
        int i3;
        int i4;
        int i5;
        boolean z3;
        HashSet hashSet = this.l;
        if (hashSet.isEmpty() || (weakReference = this.g) == null) {
            return;
        }
        View view2 = (View) weakReference.get();
        Rect rect = new Rect();
        Rect rect2 = new Rect();
        Rect rect3 = new Rect();
        Rect rect4 = new Rect();
        int[] iArr = new int[2];
        int[] iArr2 = new int[2];
        if (view2 != null) {
            boolean globalVisibleRect = view2.getGlobalVisibleRect(rect2);
            boolean localVisibleRect = view2.getLocalVisibleRect(rect3);
            view2.getHitRect(rect4);
            try {
                view2.getLocationOnScreen(iArr);
                view2.getLocationInWindow(iArr2);
                i2 = 0;
            } catch (Exception e) {
                int i6 = com.google.android.gms.ads.internal.util.zze.zza;
                i2 = 0;
                zzo.zzg("Failure getting view location.", e);
            }
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjr.p6)).booleanValue()) {
                rect.left = iArr2[i2];
                rect.top = iArr2[1];
            } else {
                rect.left = iArr[i2];
                rect.top = iArr[1];
            }
            rect.right = view2.getWidth() + rect.left;
            rect.bottom = view2.getHeight() + rect.top;
            view = view2;
            z = globalVisibleRect;
            z2 = localVisibleRect;
        } else {
            i2 = 0;
            z = false;
            z2 = false;
            view = null;
        }
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjr.j2)).booleanValue() || view == null) {
            arrayList = Collections.EMPTY_LIST;
        } else {
            try {
                arrayList = new ArrayList();
                for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
                    View view3 = (View) parent;
                    Rect rect5 = new Rect();
                    if (view3.isScrollContainer() && view3.getGlobalVisibleRect(rect5)) {
                        arrayList.add(a(rect5));
                    }
                }
            } catch (Exception e2) {
                com.google.android.gms.ads.internal.zzt.zzh().d("PositionWatcher.getParentScrollViewRects", e2);
                arrayList = Collections.EMPTY_LIST;
            }
        }
        ?? r28 = arrayList;
        int windowVisibility = view != null ? view.getWindowVisibility() : 8;
        int i7 = this.k;
        if (i7 != -1) {
            windowVisibility = i7;
        }
        com.google.android.gms.ads.internal.zzt.zzc();
        long jZzy = com.google.android.gms.ads.internal.util.zzs.zzy(view);
        boolean zBooleanValue = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjr.pc)).booleanValue();
        KeyguardManager keyguardManager = this.d;
        PowerManager powerManager = this.c;
        boolean z4 = z;
        z4 = z;
        boolean z5 = z2;
        z5 = z2;
        if (zBooleanValue) {
            if (view2 != null) {
                com.google.android.gms.ads.internal.zzt.zzc();
                if (com.google.android.gms.ads.internal.util.zzs.zzX(view, powerManager, keyguardManager)) {
                    if (!z) {
                        i3 = i2;
                        i4 = i3;
                        i5 = z2;
                    } else if (!z2) {
                        i4 = 1;
                        i3 = i2;
                        i5 = i3;
                    } else if (jZzy < ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjr.sc)).intValue() || windowVisibility != 0) {
                        z4 = true;
                        z5 = true;
                    } else {
                        i3 = 1;
                        i4 = 1;
                        i5 = 1;
                        windowVisibility = i2;
                    }
                }
            }
            z4 = z;
            z5 = z2;
            z4 = z;
            z5 = z2;
            i3 = i2;
            i4 = z4;
            i5 = z5;
        } else {
            if (view2 != null) {
                com.google.android.gms.ads.internal.zzt.zzc();
                if (com.google.android.gms.ads.internal.util.zzs.zzX(view, powerManager, keyguardManager)) {
                    if (!z) {
                        i3 = i2;
                        i4 = i3;
                        i5 = z2;
                    } else if (!z2) {
                        i4 = 1;
                        i3 = i2;
                        i5 = i3;
                    } else if (windowVisibility == 0) {
                        i3 = 1;
                        i4 = 1;
                        i5 = 1;
                        windowVisibility = i2;
                    } else {
                        z4 = true;
                        z5 = true;
                    }
                }
            }
            z4 = z;
            z5 = z2;
            z4 = z;
            z5 = z2;
            i3 = i2;
            i4 = z4;
            i5 = z5;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjr.uc)).booleanValue()) {
            com.google.android.gms.ads.internal.zzt.zzc();
            int i8 = true != com.google.android.gms.ads.internal.util.zzs.zzX(view, powerManager, keyguardManager) ? i2 : 64;
            int i9 = 1 != i4 ? i2 : 8;
            int i10 = 1 != i5 ? i2 : 16;
            int i11 = windowVisibility == 0 ? 128 : i2;
            int i12 = i8;
            int i13 = jZzy >= ((long) ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjr.sc)).intValue()) ? 32 : i2;
            com.google.android.gms.ads.internal.zzt.zzc();
            com.google.android.gms.ads.internal.util.zzs.zzM(view, i13 | i12 | i9 | i10 | i11 | i3, null);
        }
        if (i == 1 && !this.i.zza() && i3 == this.j) {
            return;
        }
        if (i3 != 0 || this.j) {
            z3 = true;
        } else {
            z3 = true;
            if (i == 1) {
                return;
            }
        }
        com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime();
        powerManager.isScreenOn();
        ?? r18 = (view == null || !view.isAttachedToWindow()) ? i2 : z3;
        int windowVisibility2 = view != null ? view.getWindowVisibility() : 8;
        Rect rectA = a(this.n);
        Rect rectA2 = a(rect);
        Rect rectA3 = a(rect2);
        Rect rectA4 = a(rect3);
        Rect rectA5 = a(rect4);
        float f = this.m.density;
        ?? r27 = i3;
        zzbfq zzbfqVar = new zzbfq(r18, windowVisibility2, rectA, rectA2, rectA3, i4, rectA4, i5, rectA5, r27, r28);
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((zzbfr) it.next()).K(zzbfqVar);
        }
        this.j = r27;
    }

    public zzbft(Context context, View view) {
        View view2;
        Context applicationContext = context.getApplicationContext();
        this.a = applicationContext;
        WindowManager windowManager = (WindowManager) applicationContext.getSystemService("window");
        this.c = (PowerManager) applicationContext.getSystemService("power");
        this.d = (KeyguardManager) applicationContext.getSystemService("keyguard");
        if (applicationContext instanceof Application) {
            this.b = (Application) applicationContext;
            this.h = new sx3((Application) applicationContext, this);
        }
        this.m = context.getResources().getDisplayMetrics();
        Rect rect = new Rect();
        this.n = rect;
        rect.right = windowManager.getDefaultDisplay().getWidth();
        rect.bottom = windowManager.getDefaultDisplay().getHeight();
        WeakReference weakReference = this.g;
        if (weakReference != null) {
            view2 = (View) weakReference.get();
        } else {
            view2 = null;
        }
        if (view2 != null) {
            view2.removeOnAttachStateChangeListener(this);
            f(view2);
        }
        this.g = new WeakReference(view);
        if (view != null) {
            if (view.isAttachedToWindow()) {
                e(view);
            }
            view.addOnAttachStateChangeListener(this);
        }
    }

    public final void e(View view) {
        ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            this.f = new WeakReference(viewTreeObserver);
            viewTreeObserver.addOnScrollChangedListener(this);
            viewTreeObserver.addOnGlobalLayoutListener(this);
        }
        if (this.e == null) {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.SCREEN_ON");
            intentFilter.addAction("android.intent.action.SCREEN_OFF");
            intentFilter.addAction("android.intent.action.USER_PRESENT");
            this.e = new com.facebook.internal.f(this, 10);
            com.google.android.gms.ads.internal.zzt.zzA().zzb(this.a, this.e, intentFilter);
        }
        Application application = this.b;
        if (application != null) {
            try {
                application.registerActivityLifecycleCallbacks(this.h);
            } catch (Exception e) {
                int i = com.google.android.gms.ads.internal.util.zze.zza;
                zzo.zzg("Error registering activity lifecycle callbacks.", e);
            }
        }
    }
}
