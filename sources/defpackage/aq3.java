package defpackage;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.nearby.messages.internal.zzai;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class aq3 implements Application.ActivityLifecycleCallbacks {
    public final /* synthetic */ int a = 0;
    public final Activity b;
    public final Object c;

    public /* synthetic */ aq3(Activity activity, zzai zzaiVar) {
        this.b = activity;
        this.c = zzaiVar;
    }

    private final void a(Activity activity, Bundle bundle) {
    }

    private final void b(Activity activity, Bundle bundle) {
    }

    private final void c(Activity activity) {
    }

    private final void d(Activity activity) {
    }

    private final void e(Activity activity) {
    }

    private final void f(Activity activity, Bundle bundle) {
    }

    private final void g(Activity activity, Bundle bundle) {
    }

    private final void h(Activity activity) {
    }

    private final void i(Activity activity) {
    }

    private final void j(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        int i = this.a;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        int i = this.a;
        Activity activity2 = this.b;
        switch (i) {
            case 0:
                if (activity == activity2) {
                    if (Log.isLoggable("NearbyMessagesClient", 2)) {
                        Log.v("NearbyMessagesClient", "Unregistering ClientLifecycleSafetyNet's ActivityLifecycleCallbacks for " + activity.getPackageName());
                    }
                    activity.getApplication().unregisterActivityLifecycleCallbacks(this);
                }
                break;
            default:
                if (activity == activity2) {
                    ((uv3) this.c).c();
                }
                break;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        int i = this.a;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        switch (this.a) {
            case 0:
                break;
            default:
                if (activity == this.b) {
                    ((uv3) this.c).c();
                }
                break;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        int i = this.a;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        int i = this.a;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        switch (this.a) {
            case 0:
                if (activity == this.b) {
                    try {
                        ((zzai) this.c).b(1);
                    } catch (RemoteException e) {
                        if (Log.isLoggable("NearbyMessagesClient", 2)) {
                            Log.v("NearbyMessagesClient", String.format("Failed to emit ACTIVITY_STOPPED from ClientLifecycleSafetyNet for Activity %s: %s", activity.getPackageName(), e));
                            return;
                        }
                        return;
                    }
                }
                break;
        }
    }

    public aq3(uv3 uv3Var, Activity activity) {
        this.b = activity;
        this.c = uv3Var;
    }
}
