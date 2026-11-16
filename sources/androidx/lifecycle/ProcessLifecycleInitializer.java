package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.app.Fragment;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import androidx.annotation.RequiresApi;
import androidx.startup.AppInitializer;
import androidx.startup.Initializer;
import defpackage.e32;
import defpackage.gg0;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/ProcessLifecycleInitializer;", "Landroidx/startup/Initializer;", "Landroidx/lifecycle/LifecycleOwner;", "<init>", "()V", "lifecycle-process_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class ProcessLifecycleInitializer implements Initializer<LifecycleOwner> {
    @Override // androidx.startup.Initializer
    public final List dependencies() {
        return gg0.a;
    }

    @Override // androidx.startup.Initializer
    public final Object create(Context context) {
        context.getClass();
        AppInitializer appInitializerC = AppInitializer.c(context);
        appInitializerC.getClass();
        if (appInitializerC.b.contains(ProcessLifecycleInitializer.class)) {
            if (!LifecycleDispatcher.a.getAndSet(true)) {
                Context applicationContext = context.getApplicationContext();
                applicationContext.getClass();
                ((Application) applicationContext).registerActivityLifecycleCallbacks(new LifecycleDispatcher.DispatcherActivityCallback());
            }
            final ProcessLifecycleOwner processLifecycleOwner = ProcessLifecycleOwner.i;
            processLifecycleOwner.getClass();
            processLifecycleOwner.e = new Handler();
            processLifecycleOwner.f.f(Lifecycle.Event.ON_CREATE);
            Context applicationContext2 = context.getApplicationContext();
            applicationContext2.getClass();
            ((Application) applicationContext2).registerActivityLifecycleCallbacks(new EmptyActivityLifecycleCallbacks() { // from class: androidx.lifecycle.ProcessLifecycleOwner$attach$1
                @Override // androidx.lifecycle.EmptyActivityLifecycleCallbacks, android.app.Application.ActivityLifecycleCallbacks
                public void onActivityCreated(@NotNull Activity activity, @Nullable Bundle savedInstanceState) {
                    activity.getClass();
                    if (Build.VERSION.SDK_INT < 29) {
                        int i = ReportFragment.b;
                        Fragment fragmentFindFragmentByTag = activity.getFragmentManager().findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag");
                        fragmentFindFragmentByTag.getClass();
                        ((ReportFragment) fragmentFindFragmentByTag).a = processLifecycleOwner.h;
                    }
                }

                @Override // androidx.lifecycle.EmptyActivityLifecycleCallbacks, android.app.Application.ActivityLifecycleCallbacks
                public void onActivityPaused(@NotNull Activity activity) {
                    activity.getClass();
                    ProcessLifecycleOwner processLifecycleOwner2 = processLifecycleOwner;
                    int i = processLifecycleOwner2.b - 1;
                    processLifecycleOwner2.b = i;
                    if (i == 0) {
                        Handler handler = processLifecycleOwner2.e;
                        handler.getClass();
                        handler.postDelayed(processLifecycleOwner2.g, 700L);
                    }
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                @RequiresApi
                public void onActivityPreCreated(@NotNull Activity activity, @Nullable Bundle savedInstanceState) {
                    activity.getClass();
                    final ProcessLifecycleOwner processLifecycleOwner2 = processLifecycleOwner;
                    ProcessLifecycleOwner.Api29Impl.a(activity, new EmptyActivityLifecycleCallbacks() { // from class: androidx.lifecycle.ProcessLifecycleOwner$attach$1$onActivityPreCreated$1
                        @Override // android.app.Application.ActivityLifecycleCallbacks
                        public void onActivityPostResumed(@NotNull Activity activity2) {
                            activity2.getClass();
                            processLifecycleOwner2.a();
                        }

                        @Override // android.app.Application.ActivityLifecycleCallbacks
                        public void onActivityPostStarted(@NotNull Activity activity2) {
                            activity2.getClass();
                            ProcessLifecycleOwner processLifecycleOwner3 = processLifecycleOwner2;
                            int i = processLifecycleOwner3.a + 1;
                            processLifecycleOwner3.a = i;
                            if (i == 1 && processLifecycleOwner3.d) {
                                processLifecycleOwner3.f.f(Lifecycle.Event.ON_START);
                                processLifecycleOwner3.d = false;
                            }
                        }
                    });
                }

                @Override // androidx.lifecycle.EmptyActivityLifecycleCallbacks, android.app.Application.ActivityLifecycleCallbacks
                public void onActivityStopped(@NotNull Activity activity) {
                    activity.getClass();
                    ProcessLifecycleOwner processLifecycleOwner2 = processLifecycleOwner;
                    int i = processLifecycleOwner2.a - 1;
                    processLifecycleOwner2.a = i;
                    if (i == 0 && processLifecycleOwner2.c) {
                        processLifecycleOwner2.f.f(Lifecycle.Event.ON_STOP);
                        processLifecycleOwner2.d = true;
                    }
                }
            });
            return processLifecycleOwner;
        }
        e32.i("ProcessLifecycleInitializer cannot be initialized lazily.\n               Please ensure that you have:\n               <meta-data\n                   android:name='androidx.lifecycle.ProcessLifecycleInitializer'\n                   android:value='androidx.startup' />\n               under InitializationProvider in your AndroidManifest.xml");
        return null;
    }
}
