package com.adsurge.adn.oversea_ad;

import android.app.Activity;
import android.view.ViewTreeObserver;
import android.view.Window;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: com.adsurge.adn.oversea_ad.continue, reason: invalid class name */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class Ccontinue extends Cfor {
    public final AtomicBoolean a = new AtomicBoolean(false);
    public final Cpackage b;

    @Override // com.adsurge.adn.oversea_ad.Cfor, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        this.a.set(true);
    }

    @Override // com.adsurge.adn.oversea_ad.Cfor, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        Window window;
        Window window2;
        if (activity != null && (window2 = activity.getWindow()) != null) {
            String name = activity.getClass().getName();
            try {
                WeakHashMap weakHashMap = Cstrictfp.a;
                if (!weakHashMap.containsKey(activity)) {
                    weakHashMap.put(activity, null);
                    Window.Callback callback = window2.getCallback();
                    if (callback != null && !(callback instanceof y0)) {
                        window2.setCallback(new y0(callback, name, this));
                    }
                    ViewTreeObserver viewTreeObserver = window2.getDecorView().getViewTreeObserver();
                    if (viewTreeObserver != null) {
                        viewTreeObserver.addOnPreDrawListener(new Cabstract(window2, this, name));
                    }
                }
            } catch (Throwable unused) {
            }
        }
        WeakHashMap weakHashMap2 = Raspberry.a;
        if (activity != null && (window = activity.getWindow()) != null) {
            Raspberry.c = new WeakReference(window);
            if (Raspberry.b.get()) {
                Raspberry.b(window);
            }
        }
        this.a.set(false);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        Window window;
        if (activity == null) {
            WeakHashMap weakHashMap = Raspberry.a;
        } else if (Raspberry.b.get() && (window = activity.getWindow()) != null) {
            Raspberry.a(window);
        }
    }

    public Ccontinue(Cpackage cpackage) {
        this.b = cpackage;
    }
}
