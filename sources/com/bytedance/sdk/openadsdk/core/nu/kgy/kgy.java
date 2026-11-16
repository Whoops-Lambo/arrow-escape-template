package com.bytedance.sdk.openadsdk.core.nu.kgy;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public class kgy implements Application.ActivityLifecycleCallbacks {
    private static volatile kgy kgy;
    private final ahm ahm;

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPostResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public static kgy kgy(Application application) {
        if (kgy == null) {
            synchronized (kgy.class) {
                try {
                    if (kgy == null) {
                        kgy = new kgy(application);
                        application.registerActivityLifecycleCallbacks(kgy);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return kgy;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        ahm ahmVar = this.ahm;
        if (ahmVar != null) {
            ahmVar.kgy(activity);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        ahm ahmVar = this.ahm;
        if (ahmVar != null) {
            ahmVar.ahm(activity);
        }
    }

    private kgy(Application application) {
        this.ahm = ahm.kgy(application);
    }

    public String kgy(String str, long j, int i) {
        ahm ahmVar = this.ahm;
        if (ahmVar != null) {
            return ahmVar.kgy(str, j, i);
        }
        return "null";
    }
}
