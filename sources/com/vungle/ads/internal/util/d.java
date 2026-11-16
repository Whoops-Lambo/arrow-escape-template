package com.vungle.ads.internal.util;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.utils.Logger;
import defpackage.az2;
import defpackage.j52;
import defpackage.k52;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class d implements Application.ActivityLifecycleCallbacks {
    public static final d f = new d();
    public volatile int b;
    public volatile boolean c;
    public volatile c d;
    public final AtomicBoolean a = new AtomicBoolean(false);
    public final CopyOnWriteArraySet e = new CopyOnWriteArraySet();

    public static void safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(Context p0, Intent p1) {
        Logger.d("SafeDK-Special|SafeDK: Call> Landroid/content/Context;->startActivity(Landroid/content/Intent;)V");
        if (p1 == null) {
            return;
        }
        BrandSafetyUtils.detectAdClick(p1, com.safedk.android.utils.h.d);
        p0.startActivity(p1);
    }

    public static final boolean a(d dVar, Context context, Intent intent, Intent intent2, com.vungle.ads.internal.ui.m mVar) {
        dVar.getClass();
        try {
            if (intent != null) {
                safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(context, intent);
                if (mVar != null) {
                    mVar.a(true);
                }
            } else {
                if (intent2 == null) {
                    return false;
                }
                safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(context, intent2);
            }
        } catch (Exception e) {
            boolean z = u.a;
            t.b("ActivityManager", "Failed to start activity: " + e);
            if (intent != null && mVar != null) {
                try {
                    mVar.a(false);
                } catch (Exception unused) {
                    return false;
                }
            }
            if (intent != null && intent2 != null) {
                safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(context, intent2);
            }
            return false;
        }
        return true;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        activity.getClass();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        activity.getClass();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        activity.getClass();
        Iterator it = this.e.iterator();
        while (it.hasNext()) {
            ((b) it.next()).a(activity);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        activity.getClass();
        Iterator it = this.e.iterator();
        while (it.hasNext()) {
            ((b) it.next()).b(activity);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        activity.getClass();
        bundle.getClass();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        activity.getClass();
        this.b++;
        if (!this.c && this.b == 1) {
            this.c = true;
            c cVar = this.d;
            if (cVar != null) {
                Context context = (Context) cVar.b().get();
                if (context != null) {
                    a.a(context, cVar.c(), cVar.d(), cVar.a());
                }
                this.d = null;
            }
            Iterator it = this.e.iterator();
            while (it.hasNext()) {
                ((b) it.next()).b();
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        activity.getClass();
        this.b--;
        if (this.c && this.b == 0) {
            this.c = false;
            Iterator it = this.e.iterator();
            while (it.hasNext()) {
                ((b) it.next()).a();
            }
        }
    }

    public static final void a(d dVar, Context context) {
        Object j52Var;
        if (dVar.a.getAndSet(true)) {
            return;
        }
        try {
            Context applicationContext = context.getApplicationContext();
            applicationContext.getClass();
            ((Application) applicationContext).registerActivityLifecycleCallbacks(dVar);
            j52Var = az2.a;
        } catch (Throwable th) {
            j52Var = new j52(th);
        }
        Throwable thB = k52.b(j52Var);
        if (thB != null) {
            boolean z = u.a;
            t.a("ActivityManager", "Error initializing ActivityManager", thB);
            dVar.a.set(false);
        }
    }

    public static final boolean a(d dVar) {
        return !dVar.a.get() || dVar.c;
    }

    public static final void a(d dVar, b bVar) {
        dVar.e.add(bVar);
    }

    public final void a(b bVar) {
        bVar.getClass();
        this.e.remove(bVar);
    }
}
