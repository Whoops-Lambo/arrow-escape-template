package com.inmobi.media;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import com.squareup.picasso.Picasso;
import defpackage.az2;
import defpackage.dz;
import defpackage.e32;
import defpackage.fy;
import defpackage.iu;
import defpackage.pp1;
import defpackage.s71;
import defpackage.tb5;
import defpackage.w01;
import defpackage.wz2;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Objects;
import kotlinx.coroutines.sync.Mutex;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class Tg implements Application.ActivityLifecycleCallbacks {
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(Activity activity, fy fyVar) {
        Rg rg;
        pp1 pp1Var;
        Mutex mutex;
        WeakReference weakReference;
        if (fyVar instanceof Rg) {
            rg = (Rg) fyVar;
            int i = rg.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                rg.e = i - Integer.MIN_VALUE;
            } else {
                rg = new Rg(this, fyVar);
            }
        } else {
            rg = new Rg(this, fyVar);
        }
        Object obj = rg.c;
        dz dzVar = dz.a;
        int i2 = rg.e;
        if (i2 == 0) {
            wz2.a0(obj);
            Mutex mutex2 = Ug.b;
            rg.a = activity;
            rg.b = mutex2;
            rg.e = 1;
            pp1Var = (pp1) mutex2;
            if (pp1Var.e(rg) == dzVar) {
                mutex = pp1Var;
                return dzVar;
            }
        } else {
            if (i2 != 1) {
                e32.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            Mutex mutex3 = rg.b;
            Activity activity2 = rg.a;
            wz2.a0(obj);
            mutex = mutex3;
            activity = activity2;
        }
        try {
            mutex = pp1Var;
            if (Ug.a != null) {
                int size = Ug.c.size();
                int i3 = 0;
                while (true) {
                    if (i3 >= size) {
                        weakReference = null;
                        break;
                    }
                    ArrayList arrayList = Ug.c;
                    if (s71.b((Context) ((WeakReference) arrayList.get(i3)).get(), activity)) {
                        weakReference = (WeakReference) arrayList.get(i3);
                        break;
                    }
                    i3++;
                }
                if (weakReference != null) {
                    Ug.c.remove(weakReference);
                }
                ArrayList arrayList2 = Ug.c;
                iu.Q(arrayList2, new w01(14));
                if (arrayList2.isEmpty()) {
                    a(activity);
                }
            }
            return az2.a;
        } finally {
            ((pp1) mutex).g(null);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        activity.getClass();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        activity.getClass();
        tb5.t(AbstractC4211ma.d, null, null, new Sg(this, activity, null), 3);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        activity.getClass();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        activity.getClass();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        activity.getClass();
        bundle.getClass();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        activity.getClass();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        activity.getClass();
    }

    public static final boolean a(WeakReference weakReference) {
        weakReference.getClass();
        return weakReference.get() == null;
    }

    public final void a(Activity activity) {
        Picasso picasso = Ug.a;
        Objects.toString(Ug.a);
        activity.getApplication().unregisterActivityLifecycleCallbacks(this);
        Picasso picasso2 = Ug.a;
        if (picasso2 != null) {
            picasso2.shutdown();
        }
        Ug.a = null;
    }
}
