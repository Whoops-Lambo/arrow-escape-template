package defpackage;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import com.lessmore.arrows.profiling.StartupLifecycleProvider;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Set;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class si2 implements Application.ActivityLifecycleCallbacks {
    public final Set a = Collections.newSetFromMap(new IdentityHashMap());
    public final Set b = Collections.newSetFromMap(new WeakHashMap());
    public long c;

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
    public final void onActivityDestroyed(Activity activity) {
        this.a.remove(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        Set set = this.a;
        if (set.remove(activity) && set.isEmpty()) {
            this.c = SystemClock.uptimeMillis();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        String str;
        if (StartupLifecycleProvider.isUnity(activity)) {
            synchronized (StartupLifecycleProvider.gate) {
                try {
                    if (StartupLifecycleProvider.access$208() > 0) {
                        str = "activity_recreated";
                    } else if (bundle != null) {
                        str = "activity_restored";
                    } else {
                        str = "process_first_activity";
                    }
                    long jMax = 0;
                    if (StartupLifecycleProvider.latestId == 0) {
                        jMax = Math.max(0L, Process.getStartUptimeMillis() - 60000);
                    } else if (StartupLifecycleProvider.launches.containsKey(Long.valueOf(StartupLifecycleProvider.latestId))) {
                        jMax = ((ti2) StartupLifecycleProvider.launches.get(Long.valueOf(StartupLifecycleProvider.latestId))).b;
                    }
                    StartupLifecycleProvider.add(activity, str, jMax);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        long jUptimeMillis = SystemClock.uptimeMillis();
        if (StartupLifecycleProvider.isUnity(activity) && this.b.contains(activity) && this.a.isEmpty()) {
            long j = this.c;
            if (j > 0 && jUptimeMillis - j >= 700) {
                synchronized (StartupLifecycleProvider.gate) {
                    StartupLifecycleProvider.add(activity, "activity_resume", this.c);
                }
            }
        }
        this.a.add(activity);
        this.b.add(activity);
    }
}
