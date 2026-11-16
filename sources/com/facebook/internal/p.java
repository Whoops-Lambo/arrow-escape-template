package com.facebook.internal;

import android.app.Activity;
import android.content.Intent;
import android.util.Log;
import androidx.p003activity.result.ActivityResultRegistry;
import androidx.p003activity.result.ActivityResultRegistryOwner;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.utils.Logger;
import defpackage.lz;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class p {
    public static final Object e = new Object();
    public final Activity a;
    public List b;
    public final int c;
    public com.facebook.l d;

    public static void safedk_Activity_startActivityForResult_206f42f0b65887e835d87ee52d14d221(Activity p0, Intent p1, int p2) {
        Logger.d("SafeDK-Special|SafeDK: Call> Landroid/app/Activity;->startActivityForResult(Landroid/content/Intent;I)V");
        if (p1 == null) {
            return;
        }
        BrandSafetyUtils.detectAdClick(p1, "com.facebook");
        p0.startActivityForResult(p1, p2);
    }

    public abstract a a();

    public abstract List b();

    public abstract void d(j jVar, com.facebook.p pVar);

    public void e(Object obj, Object obj2) {
        Intent intent;
        a aVarA;
        boolean z = obj2 == e;
        if (this.b == null) {
            this.b = b();
        }
        List list = this.b;
        list.getClass();
        Iterator it = list.iterator();
        while (true) {
            intent = null;
            if (!it.hasNext()) {
                aVarA = null;
                break;
            }
            o oVar = (o) it.next();
            if (z || oVar.c().equals(obj2)) {
                if (oVar.a(obj)) {
                    try {
                        aVarA = oVar.b(obj);
                        break;
                    } catch (com.facebook.u e2) {
                        a aVarA2 = a();
                        m0.k(aVarA2, e2);
                        aVarA = aVarA2;
                    }
                }
            }
        }
        if (aVarA == null) {
            aVarA = a();
            aVarA.getClass();
            m0.k(aVarA, new com.facebook.u("Unable to show the provided content via the web or the installed version of the Facebook app. Some dialogs are only supported starting API 14."));
        }
        Activity activity = this.a;
        Activity activity2 = activity == null ? null : activity;
        Object obj3 = activity;
        if (!(activity2 instanceof ActivityResultRegistryOwner)) {
            if (activity != null) {
                if (!lz.a.contains(aVarA)) {
                    try {
                        intent = aVarA.c;
                    } catch (Throwable th) {
                        lz.a(aVarA, th);
                    }
                }
                safedk_Activity_startActivityForResult_206f42f0b65887e835d87ee52d14d221(activity, intent, aVarA.b());
                aVarA.c();
                return;
            }
            return;
        }
        if (activity == null) {
            obj3 = null;
        }
        obj3.getClass();
        ActivityResultRegistry activityResultRegistry = ((ActivityResultRegistryOwner) obj3).getActivityResultRegistry();
        activityResultRegistry.getClass();
        com.facebook.l lVar = this.d;
        if (!lz.a.contains(aVarA)) {
            try {
                intent = aVarA.c;
            } catch (Throwable th2) {
                lz.a(aVarA, th2);
            }
        }
        if (intent != null) {
            m0.m(activityResultRegistry, lVar, intent, aVarA.b());
            aVarA.c();
        }
        aVarA.c();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void f(Intent intent, int i) {
        Activity activity = this.a;
        String str = null;
        Activity activity2 = activity;
        if (activity == null) {
            activity2 = 0;
        }
        if (activity2 instanceof ActivityResultRegistryOwner) {
            ActivityResultRegistry activityResultRegistry = ((ActivityResultRegistryOwner) activity2).getActivityResultRegistry();
            activityResultRegistry.getClass();
            m0.m(activityResultRegistry, this.d, intent, i);
        } else if (activity2 != 0) {
            safedk_Activity_startActivityForResult_206f42f0b65887e835d87ee52d14d221(activity2, intent, i);
        } else {
            str = "Failed to find Activity or Fragment to startActivityForResult ";
        }
        if (str != null) {
            com.facebook.appevents.n nVar = k0.c;
            synchronized (com.facebook.a0.b) {
            }
        }
    }

    public p(Activity activity, int i) {
        activity.getClass();
        this.a = activity;
        this.c = i;
        this.d = null;
    }

    public final void c(com.facebook.l lVar, com.facebook.p pVar) {
        lVar.getClass();
        if (lVar instanceof j) {
            com.facebook.l lVar2 = this.d;
            if (lVar2 == null) {
                this.d = lVar;
            } else if (lVar2 != lVar) {
                Log.w("FacebookDialog", "You're registering a callback on a Facebook dialog with two different callback managers. It's almost wrong and may cause unexpected results. Only the first callback manager will be used for handling activity result with androidx.");
            }
            d((j) lVar, pVar);
            return;
        }
        com.facebook.appevents.p.e("Unexpected CallbackManager, please use the provided Factory.");
    }
}
