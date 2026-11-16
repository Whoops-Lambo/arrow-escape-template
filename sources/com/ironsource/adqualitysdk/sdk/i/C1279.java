package com.ironsource.adqualitysdk.sdk.i;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import com.ironsource.adqualitysdk.sdk.StringFog;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.ﺰ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class C1279 extends AbstractC1227 implements Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    public WeakReference f3833;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public WeakReference f3834;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final WeakHashMap f3835 = new WeakHashMap();

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        try {
            synchronized (AbstractC1227.class) {
                try {
                    if (this.f3834 == null) {
                        this.f3834 = new WeakReference(activity);
                        AbstractC4631n.m405(new C1295(activity));
                        AbstractC1227.class.notifyAll();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            ArrayList arrayListM887 = m887();
            int size = arrayListM887.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayListM887.get(i);
                i++;
                ((InterfaceC0649) obj).onActivityCreated(activity, bundle);
            }
        } catch (Exception e) {
            AbstractC1290.m905(StringFog.decrypt("6Is6cqwBUpTJgjZprgF7scaUIXWjCGyuypUjea4I\n", "r+dVEM1tHv0=\n"), StringFog.decrypt("XmkXCNOeG3E7dAsmwsobaXJvHCTT2xNrfn8=\n", "GxtlZ6G+ch8=\n"), (Throwable) e, false);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        ArrayList arrayList;
        try {
            synchronized (this) {
                arrayList = new ArrayList(this.f3730);
            }
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                ((InterfaceC0649) obj).onActivityDestroyed(activity);
            }
        } catch (Exception e) {
            AbstractC1290.m905(StringFog.decrypt("9C65Oujg793VJ7Uh6uDG+Noxoj3n6dHn1jCgMerp\n", "s0LWWImMo7Q=\n"), StringFog.decrypt("G9X5UY+iwoF+yOV/nvbCmTfT8nqY8d+dMd7uWg==\n", "XqeLPv2Cq+8=\n"), (Throwable) e, false);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        ArrayList arrayList;
        try {
            synchronized (this) {
                arrayList = new ArrayList(this.f3730);
            }
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                ((InterfaceC0649) obj).onActivityPaused(activity);
            }
        } catch (Exception e) {
            AbstractC1290.m905(StringFog.decrypt("eeXYzKRkUFpY7NTXpmR5f1f6w8urbW5gW/vBx6Zt\n", "Pom3rsUIHDM=\n"), StringFog.decrypt("6HgpUxvwhRyNZTV9CqSFBMR+ImwIpZ8XyQ==\n", "rQpbPGnQ7HI=\n"), (Throwable) e, false);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        ArrayList arrayList;
        try {
            this.f3834 = new WeakReference(activity);
            AbstractC4631n.m405(new C1295(activity));
            synchronized (this) {
                arrayList = new ArrayList(this.f3730);
            }
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                ((InterfaceC0649) obj).onActivityResumed(activity);
            }
        } catch (Exception e) {
            AbstractC1290.m905(StringFog.decrypt("llNcvYy+csO3WlCmjr5b5rhMR7qDt0z5tE1Fto63\n", "0T8z3+3SPqo=\n"), StringFog.decrypt("JnNpu0wJyVpDbnWVXV3JQgp1YoZbWtVZBmU=\n", "YwEb1D4poDQ=\n"), (Throwable) e, false);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        ArrayList arrayList;
        try {
            synchronized (this) {
                arrayList = new ArrayList(this.f3730);
            }
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                ((InterfaceC0649) obj).onActivitySaveInstanceState(activity, bundle);
            }
        } catch (Exception e) {
            AbstractC1290.m905(StringFog.decrypt("KaOgS0pcdjcIqqxQSFxfEge8u0xFVUgNC725QEhV\n", "bs/PKSswOl4=\n"), StringFog.decrypt("X47NNrxMTc86k9EYrRhN13OIxgqvGkHodI/LOKAPQfJuncs8\n", "Gvy/Wc5sJKE=\n"), (Throwable) e, false);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        try {
            if (this.f3834 == null) {
                this.f3834 = new WeakReference(activity);
                AbstractC4631n.m405(new C1295(activity));
            }
            synchronized (this) {
                this.f3835.put(activity, Boolean.TRUE);
            }
            ArrayList arrayListM887 = m887();
            int size = arrayListM887.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayListM887.get(i);
                i++;
                ((InterfaceC0649) obj).onActivityStarted(activity);
            }
            if (activity.getLocalClassName().equals(StringFog.decrypt("9qkbzge7m7zs9RLOArmTsfC0WLUcvIaxxaoXmRenorr6vg+hEaGbvvyyDw==\n", "lcZ24HLV8sg=\n"))) {
                return;
            }
            synchronized (this) {
                try {
                    if (this.f3835.size() == 1 && !this.f3731) {
                        m901(activity);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } catch (Exception e) {
            AbstractC1290.m905(StringFog.decrypt("trlEpYzv9ziXsEi+ju/eHZimX6KD5skClKddro7m\n", "8dUrx+2Du1E=\n"), StringFog.decrypt("Pmgc49aOb4JbdQDNx9pvmhJuF9/Qz3SYHn4=\n", "expujKSuBuw=\n"), (Throwable) e, false);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        int size;
        try {
            ArrayList arrayListM887 = m887();
            int size2 = arrayListM887.size();
            int i = 0;
            while (i < size2) {
                Object obj = arrayListM887.get(i);
                i++;
                ((InterfaceC0649) obj).onActivityStopped(activity);
            }
            this.f3731 = activity.isChangingConfigurations();
            synchronized (this) {
                try {
                    if (!this.f3835.containsKey(activity) || activity.getLocalClassName().equals(StringFog.decrypt("UWEwek/9/GJLPTl6Sv/0b1d8cwFU+uFvYmI8LV/hxWRddiQVWef8YFt6JA==\n", "Mg5dVDqTlRY=\n"))) {
                        size = -1;
                    } else {
                        this.f3835.remove(activity);
                        size = this.f3835.size();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (size <= -1 || size != 0 || this.f3731) {
                return;
            }
            m902(activity);
        } catch (Exception e) {
            AbstractC1290.m905(StringFog.decrypt("koEevP6ZxkiziBKn/JnvbbyeBbvxkPhysJ8Ht/yQ\n", "1e1x3p/1iiE=\n"), StringFog.decrypt("MM1Oxz6tBaNV0FLpL/kFuxzLRfs44hy9ENs=\n", "db88qEyNbM0=\n"), (Throwable) e, false);
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC1227
    /* JADX INFO: renamed from: ﻛ */
    public final synchronized boolean mo886() {
        return this.f3835.size() > 0;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final void m901(Activity activity) {
        ArrayList arrayList;
        synchronized (this) {
            arrayList = new ArrayList(this.f3730);
        }
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((InterfaceC0649) obj).mo471(activity);
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC1227
    /* JADX INFO: renamed from: ﾒ */
    public final synchronized void mo889(Application application, Activity activity) {
        try {
            if (this.f3833 == null) {
                this.f3833 = new WeakReference(application);
                if (activity != null) {
                    this.f3834 = new WeakReference(activity);
                    AbstractC4631n.m405(new C1295(activity));
                    synchronized (this) {
                        this.f3835.put(activity, Boolean.TRUE);
                    }
                }
                application.registerActivityLifecycleCallbacks(this);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC1227
    /* JADX INFO: renamed from: ﾒ */
    public final Activity mo888() {
        WeakReference weakReference = this.f3834;
        if (weakReference != null) {
            return (Activity) weakReference.get();
        }
        return null;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final void m902(Activity activity) {
        ArrayList arrayList;
        synchronized (this) {
            arrayList = new ArrayList(this.f3730);
        }
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((InterfaceC0649) obj).mo472(activity);
        }
    }
}
