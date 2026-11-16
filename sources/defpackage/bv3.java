package defpackage;

import android.app.Activity;
import android.app.Application;
import android.content.ComponentName;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.internal.games_v2.zzas;
import com.google.android.gms.internal.games_v2.zzfn;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class bv3 implements Application.ActivityLifecycleCallbacks {
    public final Application a;
    public boolean b = false;
    public boolean c;
    public final /* synthetic */ zzas d;

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }

    public /* synthetic */ bv3(zzas zzasVar, Application application) {
        this.d = zzasVar;
        this.a = application;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x003d  */
    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        boolean zEquals;
        Bundle bundle2;
        Bundle bundle3;
        String className = activity.getComponentName().getClassName();
        if (this.c) {
            if (!Objects.equals(className, "com.epicgames.unreal.GameActivity")) {
                return;
            }
        } else if (Objects.equals(className, "com.epicgames.unreal.SplashActivity")) {
            rv3 rv3Var = rv3.c;
            if (!rv3Var.b) {
                ActivityInfo activityInfo = null;
                try {
                    ApplicationInfo applicationInfo = Wrappers.packageManager(activity).getApplicationInfo(activity.getPackageName(), 128);
                    if (applicationInfo == null) {
                        bundle2 = null;
                    } else {
                        bundle2 = applicationInfo.metaData;
                    }
                } catch (PackageManager.NameNotFoundException unused) {
                }
                if (bundle2 == null || !bundle2.getString("com.epicgames.unreal.GameActivity.EngineVersion", "").startsWith("5.")) {
                    zEquals = false;
                } else {
                    try {
                        activityInfo = activity.getPackageManager().getActivityInfo(new ComponentName(activity, "com.epicgames.unreal.GameActivity"), 128);
                    } catch (PackageManager.NameNotFoundException unused2) {
                    }
                    if (activityInfo == null || (bundle3 = activityInfo.metaData) == null) {
                        zEquals = false;
                    } else {
                        zEquals = Objects.equals(bundle3.getString("android.app.lib_name", ""), "Unreal");
                    }
                }
                rv3Var.a = zEquals;
                rv3Var.b = true;
            } else {
                zEquals = rv3Var.a;
            }
            if (zEquals) {
                this.c = true;
                return;
            }
        }
        this.a.unregisterActivityLifecycleCallbacks(this);
        if (!this.b) {
            return;
        }
        this.b = false;
        zzfn.a("AutomaticGamesAuthenticator", "Automatic connection attempt triggered");
        this.d.b.zzd();
    }
}
