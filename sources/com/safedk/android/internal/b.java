package com.safedk.android.internal;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import com.safedk.android.SafeDK;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.reporters.CrashReporter;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.PersistentConcurrentHashMap;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
public class b implements Application.ActivityLifecycleCallbacks {
    private static final String a = "LifecycleManager";
    private static b b = null;
    private static final Object c = new Object();
    private static boolean h;
    private final LinkedHashSet<WeakReference<Activity>> d = new LinkedHashSet<>();
    private final ArrayList<WeakReference<Activity>> e = new ArrayList<>();
    private int f = 0;
    private boolean g = true;
    private Set<a> i = Collections.newSetFromMap(new ConcurrentHashMap());
    private final ScheduledExecutorService j = Executors.newScheduledThreadPool(1);

    private b() {
    }

    public ArrayList<WeakReference<Activity>> getAppActivities() {
        return this.e;
    }

    public static synchronized b getInstance() {
        if (b == null) {
            b = new b();
            Logger.d(a, "LifecycleManager created");
        }
        return b;
    }

    public void AddActivity(Activity activity) {
        this.d.add(new WeakReference<>(activity));
        if (!BrandSafetyUtils.d(activity.getClass())) {
            this.e.add(new WeakReference<>(activity));
        }
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x0043 */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0044, code lost:
    
        r5 = th;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.app.Activity getForegroundActivity() {
        /*
            r9 = this;
            r0 = 2
            r1 = 0
            r2 = 1
            r3 = 0
            java.util.LinkedHashSet<java.lang.ref.WeakReference<android.app.Activity>> r4 = r9.d     // Catch: java.lang.Throwable -> L52
            int r4 = r4.size()     // Catch: java.lang.Throwable -> L52
            if (r4 <= 0) goto L46
            java.util.LinkedHashSet<java.lang.ref.WeakReference<android.app.Activity>> r4 = r9.d     // Catch: java.lang.Throwable -> L52
            monitor-enter(r4)     // Catch: java.lang.Throwable -> L52
            java.util.LinkedHashSet<java.lang.ref.WeakReference<android.app.Activity>> r5 = r9.d     // Catch: java.lang.Throwable -> L43
            java.lang.Object[] r5 = r5.toArray()     // Catch: java.lang.Throwable -> L43
            java.util.LinkedHashSet<java.lang.ref.WeakReference<android.app.Activity>> r6 = r9.d     // Catch: java.lang.Throwable -> L43
            int r6 = r6.size()     // Catch: java.lang.Throwable -> L43
            int r6 = r6 - r2
            r5 = r5[r6]     // Catch: java.lang.Throwable -> L43
            java.lang.ref.WeakReference r5 = (java.lang.ref.WeakReference) r5     // Catch: java.lang.Throwable -> L43
            java.lang.Object r5 = r5.get()     // Catch: java.lang.Throwable -> L43
            android.app.Activity r5 = (android.app.Activity) r5     // Catch: java.lang.Throwable -> L43
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L3e
            if (r5 == 0) goto L3c
            java.lang.String r3 = "LifecycleManager"
            java.lang.Object[] r4 = new java.lang.Object[r0]     // Catch: java.lang.Throwable -> L38
            java.lang.String r6 = "getForegroundActivity Foreground activity is "
            r4[r1] = r6     // Catch: java.lang.Throwable -> L38
            r4[r2] = r5     // Catch: java.lang.Throwable -> L38
            com.safedk.android.utils.Logger.d(r3, r4)     // Catch: java.lang.Throwable -> L38
            goto L3c
        L38:
            r3 = move-exception
            r4 = r3
            r3 = r5
            goto L53
        L3c:
            r3 = r5
            goto L51
        L3e:
            r3 = move-exception
            r8 = r5
            r5 = r3
            r3 = r8
            goto L44
        L43:
            r5 = move-exception
        L44:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L43
            throw r5     // Catch: java.lang.Throwable -> L52
        L46:
            java.lang.String r4 = "LifecycleManager"
            java.lang.Object[] r5 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L52
            java.lang.String r6 = "No foreground activity found"
            r5[r1] = r6     // Catch: java.lang.Throwable -> L52
            com.safedk.android.utils.Logger.d(r4, r5)     // Catch: java.lang.Throwable -> L52
        L51:
            goto L6f
        L52:
            r4 = move-exception
        L53:
            java.lang.String r5 = "LifecycleManager"
            r6 = 3
            java.lang.Object[] r6 = new java.lang.Object[r6]
            java.lang.String r7 = "Exception in getForegroundActivity : "
            r6[r1] = r7
            java.lang.String r1 = r4.getMessage()
            r6[r2] = r1
            r6[r0] = r4
            com.safedk.android.utils.Logger.e(r5, r6)
            com.safedk.android.analytics.reporters.CrashReporter r0 = new com.safedk.android.analytics.reporters.CrashReporter
            r0.<init>()
            r0.caughtException(r4)
        L6f:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.safedk.android.internal.b.getForegroundActivity():android.app.Activity");
    }

    public boolean isInBackground() {
        return this.g;
    }

    public synchronized boolean isInterstitialActivity(Context activity) {
        if (this.f == 0) {
            return false;
        }
        return this.f == System.identityHashCode(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        if (h) {
            Logger.d(a, "onActivityCreated ", activity.toString());
            if (!BrandSafetyUtils.d(activity.getClass())) {
                this.e.add(new WeakReference<>(activity));
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public synchronized void onActivityStarted(Activity activity) {
        try {
            if (h) {
                Logger.d(a, "onActivityStarted ", activity.toString());
                synchronized (this.d) {
                    this.d.add(new WeakReference<>(activity));
                }
                if (this.d.size() == 1) {
                    d();
                }
            }
        } catch (Throwable th) {
            Logger.e(a, "onActivityStarted failed", th);
            new CrashReporter().caughtException(th);
        }
    }

    private String a() {
        StringBuilder sb = new StringBuilder("{ ");
        synchronized (this.d) {
            Iterator<WeakReference<Activity>> it = this.d.iterator();
            while (it.hasNext()) {
                sb.append(it.next().get());
                sb.append(" ");
            }
        }
        sb.append("}");
        return sb.toString();
    }

    private boolean b() {
        for (WeakReference<Activity> weakReference : this.d) {
            if (weakReference != null && weakReference.get() != null && BrandSafetyUtils.d(weakReference.get().getClass())) {
                return true;
            }
        }
        return false;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(final Activity activity) {
        boolean z;
        try {
            if (h) {
                Logger.d(a, "onActivityResumed ", activity.toString(), ", isActive=", Boolean.valueOf(h), ", foregroundActivities=", a());
                if (BrandSafetyUtils.d(activity.getClass())) {
                    this.f = System.identityHashCode(activity);
                    SafeDK.getInstance().a(activity);
                    z = true;
                } else {
                    SafeDK.getInstance().d(activity);
                    z = false;
                }
                if (b()) {
                    Logger.d(a, "onActivityResumed - interstitial activity found in foreground, don't start banner redirect monitoring");
                } else if (!z || BrandSafetyUtils.c(activity.getClass())) {
                    SafeDK.getInstance().c(activity);
                } else if (SafeDK.getInstance().z() != null && SafeDK.getInstance().z().d(activity) == null) {
                    this.j.schedule(new Runnable() { // from class: com.safedk.android.internal.b.1
                        @Override // java.lang.Runnable
                        public void run() {
                            if (SafeDK.getInstance().z() != null && SafeDK.getInstance().z().d(activity) == null) {
                                SafeDK.getInstance().c(activity);
                            }
                        }
                    }, 3L, TimeUnit.SECONDS);
                }
                if (BrandSafetyUtils.c(activity.getClass())) {
                    BrandSafetyUtils.b(activity);
                }
            }
        } catch (Throwable th) {
            Logger.e(a, "onActivityResumed failed", th);
            new CrashReporter().caughtException(th);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        try {
            if (h) {
                Logger.d(a, "onActivityPaused ", activity.toString());
                this.j.execute(new Runnable() { // from class: com.safedk.android.internal.b.2
                    @Override // java.lang.Runnable
                    public void run() {
                        PersistentConcurrentHashMap.a();
                    }
                });
                if (BrandSafetyUtils.d(activity.getClass())) {
                    SafeDK.getInstance().b(activity);
                } else {
                    SafeDK.getInstance().e(activity);
                }
                if (BrandSafetyUtils.c(activity.getClass())) {
                    BrandSafetyUtils.c(activity);
                }
            }
        } catch (Throwable th) {
            Logger.e(a, "onActivityPaused failed", th);
            new CrashReporter().caughtException(th);
        }
    }

    public synchronized void removeActivity(Activity activity, Collection<WeakReference<Activity>> collection) {
        for (WeakReference<Activity> weakReference : collection) {
            if (weakReference.get() == activity) {
                collection.remove(weakReference);
                weakReference.clear();
                break;
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        try {
            if (h) {
                Logger.d(a, "onActivityStopped ", activity.toString());
                synchronized (this.d) {
                    removeActivity(activity, this.d);
                }
                Logger.d(a, "onActivityStopped foregroundActivities=", a());
                if (this.d.isEmpty()) {
                    c();
                    Logger.d(a, "onActivityStopped, checking for redirect");
                    BrandSafetyUtils.g();
                }
            }
        } catch (Throwable th) {
            Logger.e(a, "onActivityStopped failed", th);
            new CrashReporter().caughtException(th);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        if (h) {
            Logger.d(a, "onActivitySaveInstanceState ", activity.toString());
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        if (h) {
            Logger.d(a, "onActivityDestroyed ", activity.toString());
            if (BrandSafetyUtils.d(activity.getClass())) {
                SafeDK.getInstance().a(activity.toString());
            } else {
                removeActivity(activity, this.e);
            }
        }
    }

    private void a(boolean z) {
        this.g = z;
    }

    private void c() {
        Logger.d(a, "Identified background");
        a(true);
        for (a aVar : this.i) {
            Logger.d(a, "notifyBackground to ", aVar.getClass().getCanonicalName());
            aVar.g();
        }
    }

    private void d() {
        Logger.d(a, "Identified foreground");
        a(false);
        Iterator<a> it = this.i.iterator();
        while (it.hasNext()) {
            it.next().h();
        }
    }

    public synchronized void registerBackgroundForegroundListener(a listener) {
        try {
            if (h) {
                if (!this.i.contains(listener) && !a(listener)) {
                    Logger.d(a, "Adding ", listener.getClass(), " to listen to BG FG events");
                    this.i.add(listener);
                    if (isInBackground()) {
                        listener.g();
                    } else {
                        listener.h();
                    }
                }
            }
        } catch (Throwable th) {
            Logger.e(a, "Failed to add listener to BG/FG events", th);
            new CrashReporter().caughtException(th);
        }
    }

    private boolean a(a aVar) {
        Logger.d(a, "listenersContainsType started, listener is ", aVar.getClass());
        ArrayList arrayList = new ArrayList();
        if (this.i != null) {
            Logger.d(a, "listenersContainsType iteration listener is ", aVar.getClass());
            Iterator<a> it = this.i.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().getClass().getCanonicalName());
            }
        }
        return arrayList.contains(aVar.getClass().getCanonicalName());
    }

    public synchronized void clearBackgroundForegroundListeners() {
        Logger.d(a, "Clearing Background Foreground listeners collection");
        this.i = Collections.newSetFromMap(new ConcurrentHashMap());
    }

    public static void setActiveMode(boolean enable) {
        h = enable;
        Logger.d(a, "setting active mode to ", Boolean.valueOf(enable));
    }
}
